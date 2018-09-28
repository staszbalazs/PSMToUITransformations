package transformations

import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher
import org.eclipse.viatra.transformation.evm.specific.Lifecycles
import org.eclipse.viatra.transformation.evm.specific.crud.CRUDActivationStateEnum
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations
import org.eclipse.viatra.transformation.runtime.emf.rules.eventdriven.EventDrivenTransformationRule
import org.eclipse.viatra.transformation.runtime.emf.rules.eventdriven.EventDrivenTransformationRuleFactory
import psm.JOperation
import queries.PatternProvider
import ui.UIClass
import ui.UiPackage
import ui.UIAction
import psm.JOperationKind
import traceability.PSMToUI
import traceability.TraceabilityPackage
import ui.UIParamView
import ui.UIResultView
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.SimpleModelManipulations
import queries.JOperationWithGuardQuery
import queries.JOperationWithGuardQueryForModify

class OperationRuleFactory {
	
	extension IModelManipulations manipulation	
	extension EventDrivenTransformationRuleFactory factory = new EventDrivenTransformationRuleFactory
	extension ViatraQueryEngine engine
	
	extension UiPackage uiPackage = UiPackage::eINSTANCE
	extension TraceabilityPackage trPackage = TraceabilityPackage::eINSTANCE
	
	extension PSMToUI psm2ui
	
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> operationRule
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> modifyOperationRule
	
	new(PSMToUI psm2ui, ViatraQueryEngine engine) {
		this.manipulation = new SimpleModelManipulations(engine);
		this.engine = engine;
		this.psm2ui = psm2ui;
	}
	
	public def getOperationRule() {
		if (operationRule === null) {			
			operationRule = createRule.name("OperationRule").precondition(JOperationWithGuardQuery.Matcher.querySpecification())
				.action(CRUDActivationStateEnum.CREATED) [
					
					val JOperation jOperation = it.JOperation as JOperation
					
					System.out.println("Transforming operation: " + jOperation.uuid)
					
					//get owner class
					val UIClass uiClass = it.getUiClass as UIClass
					
					//create UIAction and trace
					val UIAction uiAction = uiClass.createChild(getUIClass_Actions, UIAction) as UIAction
					psm2ui.createChild(PSMToUI_Traces, PSMToUITrace) => [
						addTo(PSMToUITrace_PsmElements, jOperation)
						addTo(PSMToUITrace_UiElements, uiAction)
					]
					
					//Attributes
					uiAction.uuid = uiClass.uuid + "." + jOperation.name
					uiAction.name = jOperation.name;
					uiAction.classBased = jOperation.classBased;
					uiAction.toBeConfirmed = jOperation.uiMustConfirm;
					uiAction.notBulk = !jOperation.bulk;
					uiAction.isQuery = (jOperation.kind == JOperationKind::QUERY);
					
					//create paramView
					val UIParamView paramView = uiAction.createChild(getUIAction_ParamView, UIParamView) as UIParamView
					paramView.name = uiAction.name
					paramView.uuid = uiAction.uuid.replace("\\.", "_") + "_paramView"
					
					//create resultView if necessary
					val result = jOperation.parameters.stream()
											.filter[param | param.input == false]
											.findFirst()
					if (result.isPresent) {
						val UIResultView resultView = uiAction.createChild(getUIAction_ResultView, UIResultView) as UIResultView
						resultView.name = uiAction.name;
						resultView.uuid = uiAction.uuid.replace("\\.", "_") + "_resultView"
						resultView.pageSize = 1000
					}
								
				].addLifeCycle(Lifecycles.getDefault(false, false)).build
		}
		return operationRule
	}
	
	
	public def getModifyOperationRule() {
		if (modifyOperationRule === null) {			
			modifyOperationRule = createRule.name("ModifyOperationRule").precondition(JOperationWithGuardQueryForModify.Matcher.querySpecification())
				.action(CRUDActivationStateEnum.UPDATED) [
					
					val JOperation jOperation = it.JOperation as JOperation
					
					System.out.println("Updating operation: " + jOperation.uuid)
					
					val UIAction uiAction = it.uiAction as UIAction
					val UIClass uiClass = it.getUiClass as UIClass
					
					uiAction.uuid = uiClass.uuid + "." + jOperation.name
					uiAction.name = jOperation.name;
					uiAction.classBased = jOperation.classBased;
					uiAction.toBeConfirmed = jOperation.uiMustConfirm;
					uiAction.notBulk = !jOperation.bulk;
					uiAction.isQuery = (jOperation.kind == JOperationKind::QUERY);
					
					uiAction.paramView.name = uiAction.name
					uiAction.paramView.uuid = uiAction.uuid.replace("\\.", "_") + "_paramView"
					
					if (uiAction.resultView !== null) {
						uiAction.resultView.name = uiAction.name;
						uiAction.resultView.uuid = uiAction.uuid.replace("\\.", "_") + "_resultView"	
					}
					
				].action(CRUDActivationStateEnum.DELETED) [
					
					val JOperation jOperation = it.JOperation as JOperation
					
					System.out.println("Deleting operation: " + jOperation.uuid)
					
					val UIClass uiClass = it.getUiClass as UIClass
					
					uiClass.remove(UIClass_Actions, it.uiAction)
					psm2ui.remove(PSMToUI_Traces, it.trace)
					
				].addLifeCycle(Lifecycles.getDefault(true, true)).build
		}
		return modifyOperationRule
	}
	
}