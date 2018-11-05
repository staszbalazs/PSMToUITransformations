package transformations

import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher
import org.eclipse.viatra.transformation.evm.specific.Lifecycles
import org.eclipse.viatra.transformation.evm.specific.crud.CRUDActivationStateEnum
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.SimpleModelManipulations
import org.eclipse.viatra.transformation.runtime.emf.rules.eventdriven.EventDrivenTransformationRule
import org.eclipse.viatra.transformation.runtime.emf.rules.eventdriven.EventDrivenTransformationRuleFactory
import psm.JOperationKind
import queries.JOperationWithGuardQuery
import queries.JOperationWithGuardQueryForModify
import traceability.PSMToUI
import traceability.TraceabilityPackage
import ui.UIAction
import ui.UIParamView
import ui.UIResultView
import ui.UIViewFieldSet
import ui.UiPackage
import queries.PatternProvider
import ui.UIClass
import java.util.stream.Collectors
import traceability.PSMToUITrace

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
										
					System.out.println("Transforming operation: " + JOperation.uuid)
					
					//create UIAction and trace
					val UIAction uiAction = uiClass.createChild(getUIClass_Actions, UIAction) as UIAction
					val trace = psm2ui.createChild(PSMToUI_Traces, PSMToUITrace)
					trace.addTo(PSMToUITrace_PsmElements, JOperation)
					trace.addTo(PSMToUITrace_UiElements, uiAction)
					
					//Attributes
					uiAction.uuid = uiClass.uuid + "." + JOperation.name
					uiAction.name = JOperation.name;
					uiAction.classBased = JOperation.classBased;
					uiAction.toBeConfirmed = JOperation.uiMustConfirm;
					uiAction.notBulk = !JOperation.bulk;
					uiAction.isQuery = (JOperation.kind == JOperationKind::QUERY);
					
					//Get descendant UIClasses
					val ownersByInheritance = PatternProvider.instance().getFindDescendantsForClass(engine)
											  .getAllMatches(uiClass, null)
											  .stream()
											  .map[getDescendant as UIClass]
											  .collect(Collectors.toList)
					
					//Add attribute to each of them
					for (UIClass class : ownersByInheritance) {
						class.inheritedActions.add(uiAction)
					}
					
					//create paramView
					val UIParamView paramView = uiAction.createChild(getUIAction_ParamView, UIParamView) as UIParamView
					paramView.name = uiAction.name
					paramView.uuid = uiAction.uuid.replace(".", "_") + "_paramView"
					
					var viewFieldSet = paramView.createChild(getUIView_ViewFieldSets, UIViewFieldSet) as UIViewFieldSet
					viewFieldSet.name = uiAction.name
					viewFieldSet.uuid = paramView.uuid +  "_viewFieldSet_" + uiAction.name
					
					//create resultView if necessary
					val result = JOperation.parameters.stream()
											.filter[param | param.input == false]
											.findFirst()
					if (result.isPresent) {
						val UIResultView resultView = uiAction.createChild(getUIAction_ResultView, UIResultView) as UIResultView
						resultView.name = uiAction.name;
						resultView.uuid = uiAction.uuid.replace(".", "_") + "_resultView"
						resultView.pageSize = 1000
						
						val resultViewFieldSet = resultView.createChild(getUIView_ViewFieldSets, UIViewFieldSet) as UIViewFieldSet
						resultViewFieldSet.name = uiAction.name
						resultViewFieldSet.uuid = resultView.uuid +  "_viewFieldSet_" + uiAction.name
					}
								
				].addLifeCycle(Lifecycles.getDefault(false, false)).build
		}
		return operationRule
	}
	
	
	public def getModifyOperationRule() {
		if (modifyOperationRule === null) {			
			modifyOperationRule = createRule.name("ModifyOperationRule").precondition(JOperationWithGuardQueryForModify.Matcher.querySpecification())
				.action(CRUDActivationStateEnum.UPDATED) [
					
					if (JOperation.eContainer !== null) {
						System.out.println("Updating operation: " + JOperation.uuid)
					
						val UIAction uiAction = (trace as PSMToUITrace).uiElements.get(0) as UIAction
						
						uiAction.uuid = uiClass.uuid + "." + JOperation.name
						uiAction.name = JOperation.name;
						uiAction.classBased = JOperation.classBased;
						uiAction.toBeConfirmed = JOperation.uiMustConfirm;
						uiAction.notBulk = !JOperation.bulk;
						uiAction.isQuery = (JOperation.kind == JOperationKind::QUERY);
						
						uiAction.paramView.name = uiAction.name
						uiAction.paramView.uuid = uiAction.uuid.replace(".", "_") + "_paramView"
						
						for (UIViewFieldSet viewFieldSet : uiAction.paramView.viewFieldSets) {
							viewFieldSet.name = uiAction.name
							viewFieldSet.uuid = uiAction.paramView.uuid +  "_viewFieldSet_" + uiAction.name
						}
										
						if (uiAction.resultView !== null) {
							uiAction.resultView.name = uiAction.name;
							uiAction.resultView.uuid = uiAction.uuid.replace(".", "_") + "_resultView"
							
							for (UIViewFieldSet viewFieldSet : uiAction.resultView.viewFieldSets) {
								viewFieldSet.name = uiAction.name
								viewFieldSet.uuid = uiAction.resultView.uuid +  "_viewFieldSet_" + uiAction.name
							}
						}	
					}
						
				].action(CRUDActivationStateEnum.DELETED) [
										
					System.out.println("Deleting operation: " + JOperation.uuid)
					
					val UIAction uiAction = (trace as PSMToUITrace).uiElements.get(0) as UIAction
					
					uiClass.remove(UIClass_Actions, uiAction)
					psm2ui.remove(PSMToUI_Traces, trace)
					
				].addLifeCycle(Lifecycles.getDefault(true, true)).build
		}
		return modifyOperationRule
	}
	
}