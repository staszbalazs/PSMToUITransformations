package transformations

import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher
import org.eclipse.viatra.transformation.evm.specific.Lifecycles
import org.eclipse.viatra.transformation.evm.specific.crud.CRUDActivationStateEnum
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations
import org.eclipse.viatra.transformation.runtime.emf.rules.eventdriven.EventDrivenTransformationRule
import org.eclipse.viatra.transformation.runtime.emf.rules.eventdriven.EventDrivenTransformationRuleFactory
import queries.PatternProvider
import traceability.PSMToUI
import ui.UIMenuItem
import ui.UiPackage
import traceability.TraceabilityPackage
import psm.JUIFilter
import ui.UIFilter
import ui.UIBaseComponentType

class FilterRuleFactory {
	
	extension IModelManipulations manipulation	
	extension UiPackage uiPackage = UiPackage::eINSTANCE
	extension TraceabilityPackage trPackage = TraceabilityPackage::eINSTANCE
	extension EventDrivenTransformationRuleFactory factory = new EventDrivenTransformationRuleFactory
	
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> filterRule
	
	public def getFilterRule(PSMToUI psm2ui, ViatraQueryEngine engine) {
		if (filterRule === null) {
			filterRule = createRule.name("FilterRule").precondition(PatternProvider.instance().getJUIFilterQuery())
				.action(CRUDActivationStateEnum.CREATED) [
					
					val JUIFilter jFilter = it.getJFilter() as JUIFilter
					
					//Get containing JUIMenuItem for JUIFilter
					val jMenuItem = PatternProvider.instance().getFindMenuItemForFilter(engine)
											  .getOneArbitraryMatch(jFilter, null)
											  .get()
											  .getJMenuItem();
											  
					//Get the JUIMenuItem UIMenuItem equivalent
					val potentialMenuItem = PatternProvider.instance().getPsmToUiTrace(engine)
												.getOneArbitraryMatch(jMenuItem, null)
												.get()
					var UIMenuItem uiMenuItem = potentialMenuItem.getIdentifiable as UIMenuItem
					
					//Create UIFilter
					val UIFilter uiFilter = uiMenuItem.createChild(getUIMenuItem_Filters(), UIFilter) as UIFilter
					psm2ui.createChild(PSMToUI_Traces, PSMToUITrace) => [
						addTo(PSMToUITrace_PsmElements, jFilter)
						addTo(PSMToUITrace_UiElements, uiFilter)
					]
					
					uiFilter.uuid = jFilter.uuid + "_UIFilter"
					uiFilter.operator = jFilter.getOperator().toString()
					uiFilter.value = jFilter.value
					
					if (jFilter.name !== null) {
						uiFilter.name = jFilter.name
					} else {
						uiFilter.name = "filter"
					}
					
					//Get attribute uuid for filter
					val filterAttribute = PatternProvider.instance().getPsmToUiTrace(engine)
												.getOneArbitraryMatch(jFilter.attribute, null)
												.get()
												.getIdentifiable as UIBaseComponentType
					uiFilter.attribute = filterAttribute.uuid
						
				].action(CRUDActivationStateEnum.UPDATED) [
				].action(CRUDActivationStateEnum.DELETED) [
				].addLifeCycle(Lifecycles.getDefault(true, true)).build

		}
		return filterRule
	}
	
}