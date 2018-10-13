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
import queries.JUIFilterQuery
import queries.JUIFilterQueryForModify
import traceability.PSMToUI
import traceability.TraceabilityPackage
import ui.UIFilter
import ui.UiPackage

class FilterRuleFactory {
	
	extension IModelManipulations manipulation
	extension EventDrivenTransformationRuleFactory factory = new EventDrivenTransformationRuleFactory
	extension ViatraQueryEngine engine
	
	extension UiPackage uiPackage = UiPackage::eINSTANCE
	extension TraceabilityPackage trPackage = TraceabilityPackage::eINSTANCE
	
	extension PSMToUI psm2ui
		
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> filterRule
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> modifyFilterRule
	
	new(PSMToUI psm2ui, ViatraQueryEngine engine) {
		this.manipulation = new SimpleModelManipulations(engine);
		this.engine = engine;
		this.psm2ui = psm2ui;
	}
	
	public def getFilterRule() {
		if (filterRule === null) {			
			filterRule = createRule.name("FilterRule").precondition(JUIFilterQuery.Matcher.querySpecification())
				.action(CRUDActivationStateEnum.CREATED) [
															
					System.out.println("Transforming filter: " + JFilter.uuid)
																					
					//Create UIFilter
					val UIFilter uiFilter = uiMenuItem.createChild(getUIMenuItem_Filters(), UIFilter) as UIFilter
					val trace = psm2ui.createChild(PSMToUI_Traces, PSMToUITrace)
					trace.addTo(PSMToUITrace_PsmElements, JFilter)
					trace.addTo(PSMToUITrace_UiElements, uiFilter)
					
					uiFilter.uuid = JFilter.uuid + "_UIFilter"
					uiFilter.operator = JFilter.operator.toString()
					uiFilter.value = JFilter.value
					
					if (JFilter.name !== null) {
						uiFilter.name = JFilter.name
					} else {
						uiFilter.name = "filter"
					}
					
					uiFilter.attribute = componentType.uuid
						
				].addLifeCycle(Lifecycles.getDefault(false, false)).build

		}
		return filterRule
	}
	
	public def getModifyFilterRule() {
		if (modifyFilterRule === null) {		
			modifyFilterRule = createRule.name("ModifyFilterRule").precondition(JUIFilterQueryForModify.Matcher.querySpecification())
				.action(CRUDActivationStateEnum.UPDATED) [
															
					System.out.println("Updating filter: " + JFilter.uuid)
																					
					uiFilter.uuid = JFilter.uuid + "_UIFilter"
					uiFilter.operator = JFilter.operator.toString()
					uiFilter.value = JFilter.value
					
					if (JFilter.name !== null) {
						uiFilter.name = JFilter.name
					} else {
						uiFilter.name = "filter"
					}
					
					uiFilter.attribute = componentType.uuid
					
				].action(CRUDActivationStateEnum.DELETED) [
										
					System.out.println("Deleting filter: " + JFilter.uuid)
					
					uiMenuItem.remove(UIMenuItem_Filters, uiFilter);
					psm2ui.remove(PSMToUI_Traces, trace);					
					
				].addLifeCycle(Lifecycles.getDefault(true, true)).build

		}
		return modifyFilterRule
	}
	
}