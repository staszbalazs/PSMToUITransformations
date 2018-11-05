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
import queries.FindMenuItemToSetParent
import queries.FindMenuItemWithParent
import queries.FindMenuItemWithParentForModify
import queries.PatternProvider
import traceability.PSMToUI
import traceability.PSMToUITrace
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
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> menuParentSetterRule
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
					
					var UIMenuItem uiMenuItem = psm2ui.uiBase.eResource.create(UIMenuItem) as UIMenuItem
					uiMenuItem.name = JMenuItem.name
					uiMenuItem.uuid = JMenuItem.uuid
						
					val trace = psm2ui.createChild(getPSMToUI_Traces(), PSMToUITrace)
					trace.addTo(getPSMToUITrace_PsmElements, JMenuItem)
					trace.addTo(getPSMToUITrace_UiElements, uiMenuItem)
					
					//Get menuView
					if (JMenuItem.getRepresent !== null) {
						val UIClass represented = PatternProvider.instance().getPsmToUiTrace(engine)	
																.getOneArbitraryMatch(JMenuItem.getRepresent, null, null)
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
	
	
	public def getMenuParentSetterRule() {
		if (menuParentSetterRule === null) {			
			menuParentSetterRule = createRule.name("MenuParentSetterRule").precondition(FindMenuItemToSetParent.Matcher.querySpecification())
				.action(CRUDActivationStateEnum.CREATED) [
										
					System.out.println("Setting parent to menuItem: " + JMenuItem.uuid)
							
					if (JMenuItem.parent.parent === null) {
						uiMenuItem.moveTo(uiBase.mainMenu, UIMenuItem_MenuItems)
					} else {
						val UIMenuItem parentMenuItem = PatternProvider.instance().getPsmToUiTrace(engine)
															.getOneArbitraryMatch(JMenuItem.parent, null, null)
															.get()
															.getIdentifiable() as UIMenuItem
						uiMenuItem.moveTo(parentMenuItem, UIMenuItem_MenuItems)	
					}
					
			].addLifeCycle(Lifecycles.getDefault(false, false)).build
		}
		return menuParentSetterRule
	}
	
	
	public def getModifyMenuRule() {
		if (modifyMenuRule === null) {			
			modifyMenuRule = createRule.name("ModifyMenuRule").precondition(FindMenuItemWithParentForModify.Matcher.querySpecification())
			.action(CRUDActivationStateEnum.UPDATED) [
				
				if (JMenuItem.eContainer !== null) {
					System.out.println("Updating menuItem: " + JMenuItem.uuid)
				
					var UIMenuItem uiMenuItem = (trace as PSMToUITrace).uiElements.get(0) as UIMenuItem
					uiMenuItem.uuid = JMenuItem.uuid
					uiMenuItem.name = JMenuItem.name
					
					if (JMenuItem.getRepresent !== null) {
						val UIClass represented = PatternProvider.instance().getPsmToUiTrace(engine)
																.getOneArbitraryMatch(JMenuItem.getRepresent, null, null)
																.get()
																.getIdentifiable as UIClass
						
						if (JMenuItem.type == JMenuItemType::LIST) {
							uiMenuItem.menuView = represented.getListView
						} else if (JMenuItem.type == JMenuItemType::OBJECT) {
							uiMenuItem.menuView = represented.getClassView
						}
					} else {
						uiMenuItem.menuView = null;
					}
				}
									
			].action(CRUDActivationStateEnum.DELETED) [
									
				System.out.println("Deleting menuItem: " + JMenuItem.uuid)
				
				var UIMenuItem uiMenuItem = (trace as PSMToUITrace).uiElements.get(0) as UIMenuItem
				uiMenuItem.ownerMenuItem.remove(UIMenuItem_MenuItems, uiMenuItem)
				psm2ui.remove(PSMToUI_Traces, trace)
				
			].addLifeCycle(Lifecycles.getDefault(true, true)).build
		}
		return modifyMenuRule
	}
	
}