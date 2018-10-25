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
import queries.JParameterViewFieldQuery
import queries.JParameterWithGuardQuery
import queries.JParameterWithGuardQueryForModify
import traceability.PSMToUI
import traceability.TraceabilityPackage
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
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> parameterViewFieldRule
	
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
										
					System.out.println("Transforming parameter: " + JParameter.uuid)
													
					var UIParameterComponentType param
					if (JParameter.input) {
						param = uiAction.createChild(getUIAction_Parameters, UIParameterComponentType) as UIParameterComponentType
						
						val paramView = uiAction.paramView
						
						var UIViewFieldSet viewFieldSet = paramView.viewFieldSets.get(0)											
												
						val viewField = viewFieldSet.createChild(getUIViewFieldSet_ViewFields, UIViewField) as UIViewField
						viewField.name = JParameter.name;
						viewField.uuid = uiAction.uuid + "." + JParameter.name + "_viewField"
						viewField.componentType = param;
						viewField.position = viewFieldSet.viewFields.size() + 1;
						
					} else {
						param = uiAction.createChild(getUIAction_Result, UIParameterComponentType) as UIParameterComponentType
					
						//create viewField for resultView
						val resultView = uiAction.resultView
						
						val viewFieldSet = resultView.getViewFieldSets.get(0)
						
						val viewField = viewFieldSet.createChild(getUIViewFieldSet_ViewFields, UIViewField) as UIViewField
						viewField.name = JParameter.name;
						viewField.uuid = resultView.uuid + "." + JParameter.name + "_viewField"
						viewField.componentType = param;
						viewField.position = 1;
					}
					
					if (JParameter.type instanceof JClass) {
						val UIClass uiClass = it.uiType as UIClass
						
						param.referenced = uiClass
						param.type = uiClass.name;
					} else {
						val UIBaseComponentType componentType = it.uiType as UIBaseComponentType
						param.type = componentType.name
					}
					
					param.uuid = JParameter.uuid;
					param.name = JParameter.name;
					param.value = "";
					param.lower = JParameter.lower;
					param.upper = JParameter.upper;
					param.interval = JParameter.interval;
					
					createIntervals(param, JParameter.ownerOperation.ownerClass.uuid)
					
					val trace = psm2ui.createChild(PSMToUI_Traces, PSMToUITrace)
					trace.addTo(PSMToUITrace_PsmElements, JParameter)
					trace.addTo(PSMToUITrace_UiElements, param)
					
				].addLifeCycle(Lifecycles.getDefault(false, false)).build
		}
		return parameterRule
	}
	
	public def getModifyParameterRule() {
		if (modifyParameterRule === null) {			
			modifyParameterRule = createRule.name("ModifyParameterRule").precondition(JParameterWithGuardQueryForModify.Matcher.querySpecification())
				.action(CRUDActivationStateEnum.UPDATED) [
										
					System.out.println("Updating parameter: " + JParameter.uuid)
										
					if (JParameter.type instanceof JClass) {						
						parameterType.referenced = uiType as UIClass
						parameterType.type = uiType.name;
					} else {
						parameterType.type = uiType.name
					}
					
					parameterType.uuid = JParameter.uuid;
					parameterType.name = JParameter.name;
					parameterType.lower = JParameter.lower;
					parameterType.upper = JParameter.upper;
					parameterType.interval = JParameter.interval;
					
					parameterType.intervals.clear
					createIntervals(parameterType, JParameter.ownerOperation.ownerClass.uuid)
					
				].action(CRUDActivationStateEnum.DELETED) [
										
					System.out.println("Deleting parameter: " + JParameter.uuid)
					
					uiAction.remove(UIAction_Parameters, parameterType)
					psm2ui.remove(PSMToUI_Traces, trace)
										
				].addLifeCycle(Lifecycles.getDefault(true, true)).build
		}
		return modifyParameterRule
	}
	
	
	public def getParameterViewFieldRule() {
		if (parameterViewFieldRule === null) {			
			parameterViewFieldRule = createRule.name("parameterViewFieldRule").precondition(JParameterViewFieldQuery.Matcher.querySpecification())
				.action(CRUDActivationStateEnum.UPDATED) [
					
					System.out.println("Updating viewField for parameter: " + JParameter.uuid)
							
					if (JParameter.input) {																								
						viewField.name = JParameter.name;
						viewField.uuid = uiAction.uuid + "." + JParameter.name + "_viewField"
						
					} else {										
						viewField.name = JParameter.name;
						viewField.uuid = uiView.uuid + "." + JParameter.name + "_viewField"
					}
					
				].action(CRUDActivationStateEnum.DELETED) [
					
					System.out.println("Deleting viewField for parameter: " + JParameter.uuid)
					
					viewFieldSet.remove(UIViewFieldSet_ViewFields, viewField)
					if (viewFieldSet.viewFields.size() == 0) {
						uiView.remove(UIView_ViewFieldSets, viewFieldSet)
					} else {
						viewFieldSet.viewFields.stream()
													.filter[field | field.position > viewField.position]
													.forEach(field | field.position = field.position - 1)								
					}				

				].addLifeCycle(Lifecycles.getDefault(true, true)).build
		}
		
		return parameterViewFieldRule
	}
	
}