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

class FilterRuleFactory {
	
	extension IModelManipulations manipulation	
	extension UiPackage uiPackage = UiPackage::eINSTANCE
	extension TraceabilityPackage trPackage = TraceabilityPackage::eINSTANCE
	extension EventDrivenTransformationRuleFactory factory = new EventDrivenTransformationRuleFactory
	
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> filterRule
	
	//After MenuItem
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
					val potentialMenuItem = psm2ui.traces.stream()
										.filter[getPsmElements.contains(jMenuItem)]
										.map[getUiElements()]
										.findFirst()
					var UIMenuItem uiMenuItem = potentialMenuItem.get().get(0) as UIMenuItem
					
					//Create UIFilter
					val uiFilter = uiMenuItem.createChild(getUIMenuItem_Filters(), UIFilter) => [
						set(getIdentifiable_Uuid(), jFilter.getUuid() + "_UIFilter")
						set(getUIFilter_Operator(), jFilter.getOperator().toString())
						set(getUIFilter_Value(), jFilter.getValue())
					]
					
					if (jFilter.name !== null) {
						uiFilter.set(getIdentifiable_Name(), jFilter.getName())
					} else {
						uiFilter.set(getIdentifiable_Name(), "filter")
					}
						
					val trace = psm2ui.createChild(PSMToUI_Traces, PSMToUITrace)
					trace.addTo(PSMToUITrace_PsmElements, jFilter)
					trace.addTo(PSMToUITrace_UiElements, uiFilter)
					
				].action(CRUDActivationStateEnum.UPDATED) [
				].action(CRUDActivationStateEnum.DELETED) [
				].addLifeCycle(Lifecycles.getDefault(true, true)).build

		}
		return filterRule
	}
	
}