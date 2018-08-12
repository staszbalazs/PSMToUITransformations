package transformations

import org.eclipse.viatra.transformation.evm.specific.Lifecycles
import org.eclipse.viatra.transformation.evm.specific.crud.CRUDActivationStateEnum
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations
import org.eclipse.viatra.transformation.runtime.emf.rules.eventdriven.EventDrivenTransformationRuleFactory
import psm.JMenuItemType
import queries.PatternProvider
import traceability.PSMToUI
import traceability.TraceabilityPackage
import ui.UIClass
import ui.UIMenuItem
import ui.UiPackage
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.transformation.runtime.emf.rules.eventdriven.EventDrivenTransformationRule
import psm.JUIMenuItem

class MenuRuleFactory {
	
	extension IModelManipulations manipulation
	extension UiPackage uiPackage = UiPackage::eINSTANCE
	extension TraceabilityPackage trPackage = TraceabilityPackage::eINSTANCE
	extension EventDrivenTransformationRuleFactory factory = new EventDrivenTransformationRuleFactory
	
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> menuRule
	
	//After Class, before Filter
	public def getMenuRule(PSMToUI psm2ui) {
		if (menuRule === null) {
			menuRule = createRule.name("MenuRule").precondition(PatternProvider.instance().getFindMenuItemWithParent())
				.action(CRUDActivationStateEnum.CREATED) [
					
					val JUIMenuItem jMenuItem = it.JMenuItem as JUIMenuItem;
					//Get or create parent MenuItem
					val potentialParent = psm2ui.traces.stream()
										.filter[getPsmElements.contains(jMenuItem.getParent)]
										.map[getUiElements()]
										.findFirst()
										
					var UIMenuItem parent
					if (potentialParent.isPresent()) {
						parent = potentialParent.get().get(0) as UIMenuItem
					} else {
						parent = psm2ui.uiBase.eResource.create(UIMenuItem) as UIMenuItem
						val trace = psm2ui.createChild(getPSMToUI_Traces(), PSMToUITrace)
						trace.addTo(getPSMToUITrace_PsmElements, jMenuItem.getParent)
						trace.addTo(getPSMToUITrace_UiElements, parent)
					}
					
					//Get or create current MenuItem
					val potentialUiElements = psm2ui.traces.stream()
										.filter[getPsmElements.contains(jMenuItem)]
										.map[getUiElements()]
										.findFirst()
					
					var UIMenuItem uiMenuItem
					if (potentialUiElements.isPresent()) {
						uiMenuItem = potentialUiElements.get().get(0) as UIMenuItem
						parent.addTo(getUIMenuItem_MenuItems, uiMenuItem)
					} else {
						uiMenuItem = parent.createChild(getUIMenuItem_MenuItems, UIMenuItem) as UIMenuItem
						uiMenuItem.set(getIdentifiable_Name(), jMenuItem.getName())
						uiMenuItem.set(getIdentifiable_Uuid(), jMenuItem.getUuid())
					}
					
					//Get menuView
					val potentialRepresentedClass = psm2ui.traces.stream()
										.filter[getPsmElements.contains(jMenuItem.getRepresent)]
										.map[getUiElements()]
										.findFirst()
					
					var UIClass represented = potentialRepresentedClass.get().get(0) as UIClass
					
					if (jMenuItem.getType() == JMenuItemType::LIST) {
						uiMenuItem.addTo(getUIMenuItem_MenuView(), represented.getSelector)	
					} else if (jMenuItem.getType() == JMenuItemType::OBJECT) {
						uiMenuItem.addTo(getUIMenuItem_MenuView(), represented.getSelector.getDetailView)	
					}
		
			].action(CRUDActivationStateEnum.UPDATED) [
			].action(CRUDActivationStateEnum.DELETED) [
			].addLifeCycle(Lifecycles.getDefault(true, true)).build
		}
		return menuRule
	}
	
	
}