package transformations

import org.eclipse.viatra.transformation.evm.specific.Lifecycles
import org.eclipse.viatra.transformation.evm.specific.crud.CRUDActivationStateEnum
import org.eclipse.viatra.transformation.runtime.emf.rules.eventdriven.EventDrivenTransformationRuleFactory
import queries.PatternProvider
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.transformation.runtime.emf.rules.eventdriven.EventDrivenTransformationRule
import psm.JModel
import traceability.PSMToUI
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import ui.UIBase
import ui.UiPackage
import traceability.TraceabilityPackage
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations
import ui.UIMenuItem
import ui.UIInfo
import psm.JSubmodel
import psm.JClass

class ModelRuleFactory {
	
	extension IModelManipulations manipulation
	extension EventDrivenTransformationRuleFactory factory = new EventDrivenTransformationRuleFactory
	
	extension UiPackage uiPackage = UiPackage::eINSTANCE
	extension TraceabilityPackage trPackage = TraceabilityPackage::eINSTANCE
	
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> modelRule
	
	public def getModelRule(PSMToUI psm2ui, ViatraQueryEngine engine) {
		if (modelRule === null) {
			modelRule = createRule.name("ModelRule").precondition(PatternProvider.instance().getDomainJModelQuery())
				.action(CRUDActivationStateEnum.CREATED) [
					
					val JModel jModel = it.JModel as JModel
					
					val UIBase uiBase = PatternProvider.instance().getUIBaseQuery(engine)
																		.getOneArbitraryMatch()
																		.get()
																		.getUiBase() as UIBase
																		
					uiBase.name = jModel.name
					uiBase.uuid = jModel.uuid
					
					val UIMenuItem mainMenu = uiBase.createChild(getUIBase_MainMenu, UIMenuItem) as UIMenuItem
					mainMenu.name = "main_menu"
					mainMenu.uuid = "main_menu"
					
					val UIInfo info = uiBase.createChild(getUIBase_Info, UIInfo) as UIInfo
					info.uuid = "main_info"
					info.name = "main_info"
					
					if (jModel.info !== null) {
						for (JSubmodel submodel : jModel.info.submodels) {
							if (submodel.version !== null) {
								info.versions.add(submodel.version);
							} else {
								info.versions.add("");
							}
							
							info.submodels.add(submodel.name);
						}
					}									
					
					val JClass representsUser = PatternProvider.instance().getRepresentsUserJClassQuery(engine)
																	.getOneArbitraryMatch()
																	.get()
																	.getJClass() as JClass
					info.userClass = representsUser.uuid
					
					
					val trace = psm2ui.createChild(getPSMToUI_Traces(), PSMToUITrace)
						trace.addTo(getPSMToUITrace_PsmElements, jModel)
						trace.addTo(getPSMToUITrace_UiElements, uiBase)
					
				].action(CRUDActivationStateEnum.UPDATED) [
				].action(CRUDActivationStateEnum.DELETED) [
				].addLifeCycle(Lifecycles.getDefault(true, true)).build
		}
		return modelRule
	}
	
}