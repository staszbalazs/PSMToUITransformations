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
import psm.JUIFilter
import queries.JUIFilterQuery
import queries.JUIFilterQueryForModify
import traceability.PSMToUI
import traceability.TraceabilityPackage
import ui.UIBaseComponentType
import ui.UIFilter
import ui.UIMenuItem
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
					
					val JUIFilter jFilter = it.getJFilter() as JUIFilter
										
					System.out.println("Transforming filter: " + jFilter.uuid)
																
					var UIMenuItem uiMenuItem = it.getUiMenuItem as UIMenuItem
					
					//Create UIFilter
					val UIFilter uiFilter = uiMenuItem.createChild(getUIMenuItem_Filters(), UIFilter) as UIFilter
					psm2ui.createChild(PSMToUI_Traces, PSMToUITrace) => [
						addTo(PSMToUITrace_PsmElements, jFilter)
						addTo(PSMToUITrace_UiElements, uiFilter)
					]
					
					uiFilter.uuid = jFilter.uuid + "_UIFilter"
					uiFilter.operator = jFilter.operator.toString()
					uiFilter.value = jFilter.value
					
					if (jFilter.name !== null) {
						uiFilter.name = jFilter.name
					} else {
						uiFilter.name = "filter"
					}
					
					uiFilter.attribute = (it.getComponentType as UIBaseComponentType).uuid
						
				].addLifeCycle(Lifecycles.getDefault(false, false)).build

		}
		return filterRule
	}
	
	public def getModifyFilterRule() {
		if (modifyFilterRule === null) {		
			modifyFilterRule = createRule.name("ModifyFilterRule").precondition(JUIFilterQueryForModify.Matcher.querySpecification())
				.action(CRUDActivationStateEnum.UPDATED) [
					
					val JUIFilter jFilter = it.getJFilter() as JUIFilter
										
					System.out.println("Updating filter: " + jFilter.uuid)
																
					val UIFilter uiFilter = it.getUiFilter as UIFilter																				
					
					uiFilter.uuid = jFilter.uuid + "_UIFilter"
					uiFilter.operator = jFilter.operator.toString()
					uiFilter.value = jFilter.value
					
					if (jFilter.name !== null) {
						uiFilter.name = jFilter.name
					} else {
						uiFilter.name = "filter"
					}
					
					uiFilter.attribute = (it.getComponentType as UIBaseComponentType).uuid
					
				].action(CRUDActivationStateEnum.DELETED) [
					
					val UIFilter uiFilter = it.getUiFilter as UIFilter																				
					
					System.out.println("Deleting filter: " + uiFilter.uuid)
					
					val UIMenuItem menuItem = it.getUiMenuItem as UIMenuItem
					menuItem.remove(UIMenuItem_Filters, it.uiFilter);
					psm2ui.remove(PSMToUI_Traces, it.getTrace);					
					
				].addLifeCycle(Lifecycles.getDefault(true, true)).build

		}
		return modifyFilterRule
	}
	
}