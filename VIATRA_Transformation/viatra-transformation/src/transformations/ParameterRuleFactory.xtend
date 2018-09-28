package transformations

import operations.Interval
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher
import org.eclipse.viatra.transformation.evm.specific.Lifecycles
import org.eclipse.viatra.transformation.evm.specific.crud.CRUDActivationStateEnum
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.SimpleModelManipulations
import org.eclipse.viatra.transformation.runtime.emf.rules.eventdriven.EventDrivenTransformationRule
import org.eclipse.viatra.transformation.runtime.emf.rules.eventdriven.EventDrivenTransformationRuleFactory
import psm.JClass
import psm.JParameter
import queries.JParameterWithGuardQuery
import queries.JParameterWithGuardQueryForModify
import traceability.PSMToUI
import traceability.TraceabilityPackage
import ui.UIAction
import ui.UIBaseComponentType
import ui.UIClass
import ui.UIParameterComponentType
import ui.UIViewField
import ui.UIViewFieldSet
import ui.UiPackage

class ParameterRuleFactory {
	
	extension IModelManipulations manipulation	
	extension EventDrivenTransformationRuleFactory factory = new EventDrivenTransformationRuleFactory
	extension ViatraQueryEngine engine
	
	extension UiPackage uiPackage = UiPackage::eINSTANCE
	extension TraceabilityPackage trPackage = TraceabilityPackage::eINSTANCE
	
	extension PSMToUI psm2ui
	
	extension Interval interval
		
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> parameterRule
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> modifyParameterRule
	
	new(PSMToUI psm2ui, ViatraQueryEngine engine) {
		this.manipulation = new SimpleModelManipulations(engine)
		this.engine = engine
		this.psm2ui = psm2ui
		this.interval = interval = new Interval(engine)
	}
	
	public def getParameterRule() {
		if (parameterRule === null) {			
			parameterRule = createRule.name("ParameterRule").precondition(JParameterWithGuardQuery.Matcher.querySpecification())
				.action(CRUDActivationStateEnum.CREATED) [
					
					val JParameter jParameter = it.JParameter as JParameter
					
					System.out.println("Transforming parameter: " + jParameter.uuid)
								
					val UIAction uiAction = it.uiAction as UIAction
					
					var UIParameterComponentType param
					if (jParameter.input) {
						param = uiAction.createChild(getUIAction_Parameters, UIParameterComponentType) as UIParameterComponentType
						
						val paramView = uiAction.paramView
						
						var UIViewFieldSet viewFieldSet			
						if (paramView.viewFieldSets.isEmpty()) {
							viewFieldSet = paramView.createChild(getUIView_ViewFieldSets, UIViewFieldSet) as UIViewFieldSet
							viewFieldSet.name = uiAction.name
							viewFieldSet.uuid = paramView.uuid +  "_viewFieldSet_" + uiAction.name
						} else {
							viewFieldSet = paramView.viewFieldSets.get(0)
						}												
												
						val viewField = viewFieldSet.createChild(getUIViewFieldSet_ViewFields, UIViewField) as UIViewField
						viewField.name = jParameter.name;
						viewField.uuid = uiAction.uuid + "." + jParameter.name + "_viewField"
						viewField.componentType = param;
						viewField.position = viewFieldSet.viewFields.size() + 1;
						
					} else {
						param = uiAction.createChild(getUIAction_Result, UIParameterComponentType) as UIParameterComponentType
					
						//create viewField for resultView
						val resultView = uiAction.resultView
						
						val viewFieldSet = resultView.createChild(getUIView_ViewFieldSets, UIViewFieldSet) as UIViewFieldSet
						viewFieldSet.name = uiAction.name
						viewFieldSet.uuid = resultView.uuid +  "_viewFieldSet_" + uiAction.name
						
						val viewField = viewFieldSet.createChild(getUIViewFieldSet_ViewFields, UIViewField) as UIViewField
						viewField.name = jParameter.name;
						viewField.uuid = resultView.uuid + "." + jParameter.name + "_viewField"
						viewField.componentType = param;
						viewField.position = 1;
					}
					
					if (jParameter.type instanceof JClass) {
						val UIClass uiClass = it.uiType as UIClass
						
						param.referenced = uiClass
						param.type = uiClass.name;
					} else {
						val UIBaseComponentType componentType = it.uiType as UIBaseComponentType
						param.type = componentType.name
					}
					
					param.uuid = jParameter.uuid;
					param.name = jParameter.name;
					param.value = "";
					param.lower = jParameter.lower;
					param.upper = jParameter.upper;
					param.interval = jParameter.interval;
					
					createIntervals(param, jParameter.ownerOperation.ownerClass.uuid)
					
					val trace = psm2ui.createChild(PSMToUI_Traces, PSMToUITrace)
					trace.addTo(PSMToUITrace_PsmElements, jParameter)
					trace.addTo(PSMToUITrace_UiElements, param)
					
				].addLifeCycle(Lifecycles.getDefault(false, false)).build
		}
		return parameterRule
	}
	
	public def getModifyParameterRule() {
		if (modifyParameterRule === null) {			
			modifyParameterRule = createRule.name("ModifyParameterRule").precondition(JParameterWithGuardQueryForModify.Matcher.querySpecification())
				.action(CRUDActivationStateEnum.UPDATED) [
					
					val JParameter jParameter = it.JParameter as JParameter
					
					System.out.println("Transforming parameter: " + jParameter.uuid)
					
					val UIParameterComponentType param = it.parameterType as UIParameterComponentType
					
					if (jParameter.type instanceof JClass) {
						val UIClass uiClass = it.uiType as UIClass
						
						param.referenced = uiClass
						param.type = uiClass.name;
					} else {
						val UIBaseComponentType componentType = it.uiType as UIBaseComponentType
						param.type = componentType.name
					}
					
					param.uuid = jParameter.uuid;
					param.name = jParameter.name;
					param.value = "";
					param.lower = jParameter.lower;
					param.upper = jParameter.upper;
					param.interval = jParameter.interval;
					
					param.intervals.clear
					createIntervals(param, jParameter.ownerOperation.ownerClass.uuid)
					
				].action(CRUDActivationStateEnum.DELETED) [
					
					val JParameter jParameter = it.JParameter as JParameter
					
					System.out.println("Transforming parameter: " + jParameter.uuid)
					
					val UIAction action = it.uiAction as UIAction
					action.remove(UIAction_Parameters, it.parameterType)
					psm2ui.remove(PSMToUI_Traces, it.trace)
										
				].addLifeCycle(Lifecycles.getDefault(true, true)).build
		}
		return modifyParameterRule
	}
	
}