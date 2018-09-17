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
import queries.PatternProvider
import traceability.PSMToUI
import traceability.TraceabilityPackage
import ui.UIAction
import ui.UIBaseComponentType
import ui.UIClass
import ui.UIParamView
import ui.UIParameterComponentType
import ui.UIResultView
import ui.UIViewField
import ui.UIViewFieldSet
import ui.UiPackage
import queries.JParameterWithGuardQuery

class ParameterRuleFactory {
	
	extension IModelManipulations manipulation	
	extension EventDrivenTransformationRuleFactory factory = new EventDrivenTransformationRuleFactory
	
	extension UiPackage uiPackage = UiPackage::eINSTANCE
	extension TraceabilityPackage trPackage = TraceabilityPackage::eINSTANCE
	
	extension Interval interval
		
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> parameterRule
	
	public def getParameterRule(PSMToUI psm2ui, ViatraQueryEngine engine) {
		if (parameterRule === null) {
			manipulation = new SimpleModelManipulations(engine)
			interval = new Interval(engine)
			
			parameterRule = createRule.name("ParameterRule").precondition(JParameterWithGuardQuery.Matcher.querySpecification())
				.action(CRUDActivationStateEnum.CREATED) [
					
					val JParameter jParameter = it.JParameter as JParameter
					
					System.out.println("Transforming parameter: " + jParameter.uuid)
					
					
					val UIAction uiAction = PatternProvider.instance().getPsmToUiTrace(engine)
												.getOneArbitraryMatch(jParameter.ownerOperation, null)
												.get()
												.getIdentifiable() as UIAction
					
					var UIParameterComponentType param
					if (jParameter.input) {
						param = uiAction.createChild(getUIAction_Parameters, UIParameterComponentType) as UIParameterComponentType
						
						val paramView = PatternProvider.instance().getParamViewForUIAction(engine)
												.getOneArbitraryMatch(uiAction, null)
												.get()
												.getView() as UIParamView
						
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
						val resultView = PatternProvider.instance().getResultViewForUIAction(engine)
												.getOneArbitraryMatch(uiAction, null)
												.get()
												.getView() as UIResultView
						
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
						val UIClass uiClass = PatternProvider.instance().getPsmToUiTrace(engine)
												.getOneArbitraryMatch(jParameter.type, null)
												.get()
												.getIdentifiable() as UIClass
						
						param.referenced = uiClass
						param.type = uiClass.name;
					} else {
						val UIBaseComponentType componentType = PatternProvider.instance().getFindCorrespondingType(engine)
													.getOneArbitraryMatch(jParameter.type, null)
													.get()
													.getComponentType() as UIBaseComponentType
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
					
				].action(CRUDActivationStateEnum.UPDATED) [
				].action(CRUDActivationStateEnum.DELETED) [
				].addLifeCycle(Lifecycles.getDefault(true, true)).build
		}
		return parameterRule
	}
	
}