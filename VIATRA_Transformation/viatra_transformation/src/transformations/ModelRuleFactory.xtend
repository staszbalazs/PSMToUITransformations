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
import queries.DomainJModelQuery
import queries.DomainJModelQueryForModify
import traceability.PSMToUI
import traceability.TraceabilityPackage
import ui.UIInfo
import ui.UIMenuItem
import ui.UiPackage

class ModelRuleFactory {
	
	extension IModelManipulations manipulation
	extension EventDrivenTransformationRuleFactory factory = new EventDrivenTransformationRuleFactory
	extension ViatraQueryEngine engine
	
	extension UiPackage uiPackage = UiPackage::eINSTANCE
	extension TraceabilityPackage trPackage = TraceabilityPackage::eINSTANCE
	
	extension PSMToUI psm2ui
	
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> modelRule
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> modifyModelRule
	
	
	new(PSMToUI psm2ui, ViatraQueryEngine engine) {
		this.manipulation = new SimpleModelManipulations(engine);
		this.engine = engine;
		this.psm2ui = psm2ui;
	}
	
	public def getModelRule() {
		if (modelRule === null) {
			modelRule = createRule.name("ModelRule").precondition(DomainJModelQuery.Matcher.querySpecification())
				.action(CRUDActivationStateEnum.CREATED) [
										
					System.out.println("Transforming model: " + JModel.uuid)
																										
					uiBase.name = JModel.name
					uiBase.uuid = JModel.uuid
					
					val UIMenuItem mainMenu = uiBase.createChild(UIBase_MainMenu, UIMenuItem) as UIMenuItem
					mainMenu.name = "main_menu"
					mainMenu.uuid = "main_menu"
								
					val trace = psm2ui.createChild(getPSMToUI_Traces(), PSMToUITrace)
						trace.addTo(getPSMToUITrace_PsmElements, JModel)
						trace.addTo(getPSMToUITrace_UiElements, uiBase)
						
					val UIInfo info = psm2ui.uiBase.createChild(getUIBase_Info, UIInfo) as UIInfo
					info.uuid = "main_info"
					info.name = "main_info"
					
					info.userClass = ""
					
				].addLifeCycle(Lifecycles.getDefault(false, false)).build
		}
		return modelRule
	}
	
	public def getModifyModelRule() {
		if (modifyModelRule === null) {
			modifyModelRule = createRule.name("ModifyModelRule").precondition(DomainJModelQueryForModify.Matcher.querySpecification())
				.action(CRUDActivationStateEnum.UPDATED) [
										
					System.out.println("Updating model: " + JModel.uuid)
					
					uiBase.name = JModel.name
					uiBase.uuid = JModel.uuid
					
				].addLifeCycle(Lifecycles.getDefault(true, false)).build
		}
		return modifyModelRule
	}
	
}