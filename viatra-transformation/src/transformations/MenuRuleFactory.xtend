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
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.SimpleModelManipulations

class MenuRuleFactory {
	
	extension IModelManipulations manipulation
	extension EventDrivenTransformationRuleFactory factory = new EventDrivenTransformationRuleFactory
	
	extension UiPackage uiPackage = UiPackage::eINSTANCE
	extension TraceabilityPackage trPackage = TraceabilityPackage::eINSTANCE
	
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> menuRule
	
	
	public def getMenuRule(PSMToUI psm2ui, ViatraQueryEngine engine) {
		if (menuRule === null) {
			manipulation = new SimpleModelManipulations(engine);
			
			menuRule = createRule.name("MenuRule").precondition(PatternProvider.instance().getFindMenuItemWithParent())
				.action(CRUDActivationStateEnum.CREATED) [
					
					val JUIMenuItem jMenuItem = it.JMenuItem as JUIMenuItem;
					
					System.out.println("Transforming menuItem: " + jMenuItem.uuid)
					
					//Get or create parent MenuItem
					var UIMenuItem parent
					if (PatternProvider.instance().getMenuRootChildren(engine).hasMatch(jMenuItem)) {
						parent = PatternProvider.instance().getMainMenuQuery(engine)
														.getOneArbitraryMatch()
														.get()
														.getMenuItem as UIMenuItem
					} else {
						val potentialParent = PatternProvider.instance().getPsmToUiTrace(engine)
												.getOneArbitraryMatch(jMenuItem.parent, null)
											
						if (potentialParent.isPresent()) {
							parent = potentialParent.get().getIdentifiable as UIMenuItem
						} else {
							parent = psm2ui.uiBase.eResource.create(UIMenuItem) as UIMenuItem
							
							val trace = psm2ui.createChild(getPSMToUI_Traces(), PSMToUITrace)
							trace.addTo(getPSMToUITrace_PsmElements, jMenuItem.getParent)
							trace.addTo(getPSMToUITrace_UiElements, parent)
						}
					}
					
										
					//Get or create current MenuItem
					val potentialUiElements = PatternProvider.instance().getPsmToUiTrace(engine)
												.getOneArbitraryMatch(jMenuItem, null)
					
					var UIMenuItem uiMenuItem
					if (potentialUiElements.isPresent()) {
						uiMenuItem = potentialUiElements.get().getIdentifiable as UIMenuItem
						uiMenuItem.moveTo(parent, getUIMenuItem_MenuItems)
					} else {
						uiMenuItem = parent.createChild(getUIMenuItem_MenuItems, UIMenuItem) as UIMenuItem
						uiMenuItem.name = jMenuItem.name
						uiMenuItem.uuid = jMenuItem.uuid
					}
					
					val trace = psm2ui.createChild(getPSMToUI_Traces(), PSMToUITrace)
					trace.addTo(getPSMToUITrace_PsmElements, jMenuItem)
					trace.addTo(getPSMToUITrace_UiElements, uiMenuItem)
					
					//Get menuView
					if (jMenuItem.getRepresent !== null) {
						val UIClass represented = PatternProvider.instance().getPsmToUiTrace(engine)
																.getOneArbitraryMatch(jMenuItem.getRepresent, null)
																.get()
																.getIdentifiable as UIClass
					
						if (jMenuItem.type == JMenuItemType::LIST) {
							uiMenuItem.menuView = represented.getListView
						} else if (jMenuItem.type == JMenuItemType::OBJECT) {
							uiMenuItem.menuView = represented.getClassView
						}
					}
						
			].action(CRUDActivationStateEnum.UPDATED) [
			].action(CRUDActivationStateEnum.DELETED) [
			].addLifeCycle(Lifecycles.getDefault(true, true)).build
		}
		return menuRule
	}
	
	
}