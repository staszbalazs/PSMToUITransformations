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
import psm.JMenuItemType
import queries.FindMenuItemWithParent
import queries.FindMenuItemWithParentForModify
import queries.PatternProvider
import traceability.PSMToUI
import traceability.TraceabilityPackage
import ui.UIClass
import ui.UIMenuItem
import ui.UiPackage

class MenuRuleFactory {
	
	extension IModelManipulations manipulation
	extension EventDrivenTransformationRuleFactory factory = new EventDrivenTransformationRuleFactory
	extension ViatraQueryEngine engine
	
	extension UiPackage uiPackage = UiPackage::eINSTANCE
	extension TraceabilityPackage trPackage = TraceabilityPackage::eINSTANCE
	
	extension PSMToUI psm2ui
	
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> menuRule
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> modifyMenuRule
	
	new(PSMToUI psm2ui, ViatraQueryEngine engine) {
		this.manipulation = new SimpleModelManipulations(engine);
		this.engine = engine;
		this.psm2ui = psm2ui;
	}
	
	public def getMenuRule() {
		if (menuRule === null) {			
			menuRule = createRule.name("MenuRule").precondition(FindMenuItemWithParent.Matcher.querySpecification())
				.action(CRUDActivationStateEnum.CREATED) [
										
					System.out.println("Transforming menuItem: " + JMenuItem.uuid)
					
					//Get or create parent MenuItem
					var UIMenuItem parent
					if (PatternProvider.instance().getMenuRootChildren(engine).hasMatch(JMenuItem)) {
						parent = psm2ui.uiBase.mainMenu
					} else {
						val potentialParent = PatternProvider.instance().getPsmToUiTrace(engine)
												.getOneArbitraryMatch(JMenuItem.parent, null)
											
						if (potentialParent.isPresent()) {
							parent = potentialParent.get().getIdentifiable as UIMenuItem
						} else {
							parent = psm2ui.uiBase.eResource.create(UIMenuItem) as UIMenuItem
							
							val trace = psm2ui.createChild(getPSMToUI_Traces(), PSMToUITrace)
							trace.addTo(getPSMToUITrace_PsmElements, JMenuItem.getParent)
							trace.addTo(getPSMToUITrace_UiElements, parent)
						}
					}
					
										
					//Get or create current MenuItem
					val potentialMenuItem = PatternProvider.instance().getPsmToUiTrace(engine)
												.getOneArbitraryMatch(JMenuItem, null)
					
					var UIMenuItem uiMenuItem
					if (potentialMenuItem.isPresent()) {
						uiMenuItem = potentialMenuItem.get().getIdentifiable as UIMenuItem
						uiMenuItem.moveTo(parent, getUIMenuItem_MenuItems)
					} else {
						uiMenuItem = parent.createChild(getUIMenuItem_MenuItems, UIMenuItem) as UIMenuItem
						uiMenuItem.name = JMenuItem.name
						uiMenuItem.uuid = JMenuItem.uuid
					}
					
					val trace = psm2ui.createChild(getPSMToUI_Traces(), PSMToUITrace)
					trace.addTo(getPSMToUITrace_PsmElements, JMenuItem)
					trace.addTo(getPSMToUITrace_UiElements, uiMenuItem)
					
					//Get menuView
					if (JMenuItem.getRepresent !== null) {
						val UIClass represented = PatternProvider.instance().getPsmToUiTrace(engine)
																.getOneArbitraryMatch(JMenuItem.getRepresent, null)
																.get()
																.getIdentifiable as UIClass
					
						if (JMenuItem.type == JMenuItemType::LIST) {
							uiMenuItem.menuView = represented.getListView
						} else if (JMenuItem.type == JMenuItemType::OBJECT) {
							uiMenuItem.menuView = represented.getClassView
						}
					}
						
			].addLifeCycle(Lifecycles.getDefault(false, false)).build
		}
		return menuRule
	}
	
	
	public def getModifyMenuRule() {
		if (modifyMenuRule === null) {			
			modifyMenuRule = createRule.name("ModifyMenuRule").precondition(FindMenuItemWithParentForModify.Matcher.querySpecification())
			.action(CRUDActivationStateEnum.UPDATED) [
									
				System.out.println("Updating menuItem: " + JMenuItem.uuid)
								
				uiMenuItem.uuid = JMenuItem.uuid
				uiMenuItem.name = JMenuItem.name
				
				if (JMenuItem.getRepresent !== null) {
					val UIClass represented = PatternProvider.instance().getPsmToUiTrace(engine)
															.getOneArbitraryMatch(JMenuItem.getRepresent, null)
															.get()
															.getIdentifiable as UIClass
					
					if (JMenuItem.type == JMenuItemType::LIST) {
						uiMenuItem.menuView = represented.getListView
					} else if (JMenuItem.type == JMenuItemType::OBJECT) {
						uiMenuItem.menuView = represented.getClassView
					}
				}
				
			].action(CRUDActivationStateEnum.DELETED) [
									
				System.out.println("Deleting menuItem: " + JMenuItem.uuid)
								
				uiMenuItem.ownerMenuItem.remove(UIMenuItem_MenuItems, uiMenuItem)
				psm2ui.remove(PSMToUI_Traces, trace)
				
			].addLifeCycle(Lifecycles.getDefault(true, true)).build
		}
		return modifyMenuRule
	}
	
}