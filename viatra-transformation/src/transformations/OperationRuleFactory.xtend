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

class OperationRuleFactory {
	
	extension IModelManipulations manipulation	
	extension EventDrivenTransformationRuleFactory factory = new EventDrivenTransformationRuleFactory
	
	extension UiPackage uiPackage = UiPackage::eINSTANCE
	extension TraceabilityPackage trPackage = TraceabilityPackage::eINSTANCE
	
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> operationRule
	
	public def getOperationRule(PSMToUI psm2ui, ViatraQueryEngine engine) {
		if (operationRule === null) {
			operationRule = createRule.name("OperationRule").precondition(PatternProvider.instance().getJOperationWithGuardQuery())
				.action(CRUDActivationStateEnum.CREATED) [
					
					val JOperation jOperation = it.JOperation as JOperation
					
					//get owner class
					val match = PatternProvider.instance().getPsmToUiTrace(engine)
												.getOneArbitraryMatch(jOperation.ownerClass, null)
												.get()
					val UIClass uiClass = match.getIdentifiable as UIClass
					
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
					if (PatternProvider.instance().getResultJParameter(engine).hasMatch(jOperation, null)) {
						val UIResultView resultView = uiAction.createChild(getUIAction_ResultView, UIResultView) as UIResultView
						resultView.name = uiAction.name;
						resultView.uuid = uiAction.uuid.replace("\\.", "_") + "_resultView"
						resultView.pageSize = 1000
					}
								
				].action(CRUDActivationStateEnum.UPDATED) [
				].action(CRUDActivationStateEnum.DELETED) [
				].addLifeCycle(Lifecycles.getDefault(true, true)).build
		}
		return operationRule
	}
}