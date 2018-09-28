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
import psm.JModel
import queries.DomainJModelQuery
import traceability.PSMToUI
import traceability.TraceabilityPackage
import ui.UIBase
import ui.UIMenuItem
import ui.UiPackage
import queries.DomainJModelQueryForModify

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
					
					val JModel jModel = it.JModel as JModel
					
					System.out.println("Transforming model: " + jModel.uuid)
								
					val UIBase uiBase = psm2ui.getUiBase
																		
					uiBase.name = jModel.name
					uiBase.uuid = jModel.uuid
					
					val UIMenuItem mainMenu = uiBase.createChild(UIBase_MainMenu, UIMenuItem) as UIMenuItem
					mainMenu.name = "main_menu"
					mainMenu.uuid = "main_menu"
								
					val trace = psm2ui.createChild(getPSMToUI_Traces(), PSMToUITrace)
						trace.addTo(getPSMToUITrace_PsmElements, jModel)
						trace.addTo(getPSMToUITrace_UiElements, uiBase)
					
				].addLifeCycle(Lifecycles.getDefault(false, false)).build
		}
		return modelRule
	}
	
	public def getModifyModelRule() {
		if (modifyModelRule === null) {
			modifyModelRule = createRule.name("ModifyModelRule").precondition(DomainJModelQueryForModify.Matcher.querySpecification())
				.action(CRUDActivationStateEnum.UPDATED) [
					
					val JModel jModel = it.JModel as JModel
					
					System.out.println("Updating model: " + jModel.uuid)
					
					val UIBase uiBase = psm2ui.uiBase
					uiBase.name = jModel.name
					uiBase.uuid = jModel.uuid
					
				].addLifeCycle(Lifecycles.getDefault(true, false)).build
		}
		return modifyModelRule
	}
	
}