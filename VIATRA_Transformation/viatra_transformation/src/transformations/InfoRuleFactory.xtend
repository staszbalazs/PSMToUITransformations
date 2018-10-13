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
import psm.JSubmodel
import queries.JInfoQuery
import queries.JInfoQueryForModify
import traceability.PSMToUI
import traceability.TraceabilityPackage
import ui.UIInfo
import ui.UiPackage

class InfoRuleFactory {
	
	extension IModelManipulations manipulation
	extension EventDrivenTransformationRuleFactory factory = new EventDrivenTransformationRuleFactory
	extension ViatraQueryEngine engine
	
	extension UiPackage uiPackage = UiPackage::eINSTANCE
	extension TraceabilityPackage trPackage = TraceabilityPackage::eINSTANCE
	
	extension PSMToUI psm2ui
	
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> infoRule
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> modifyInfoRule
	
	new(PSMToUI psm2ui, ViatraQueryEngine engine) {
		this.manipulation = new SimpleModelManipulations(engine);
		this.engine = engine;
		this.psm2ui = psm2ui;
	}
	
	public def getInfoRule() {
		if (infoRule === null) {			
			infoRule = createRule.name("InfoRule").precondition(JInfoQuery.Matcher.querySpecification())
				.action(CRUDActivationStateEnum.CREATED) [
										
					System.out.println("Transforming info: " + JInfo.uuid)
					
					val UIInfo info = psm2ui.uiBase.createChild(getUIBase_Info, UIInfo) as UIInfo
					info.uuid = "main_info"
					info.name = "main_info"
					
					for (JSubmodel submodel : JInfo.submodels) {
						if (submodel.version !== null) {
							info.versions.add(submodel.version);
						} else {
							info.versions.add("");
						}
						
						info.submodels.add(submodel.name);
					}								
					
					info.userClass = uuid
					
				].addLifeCycle(Lifecycles.getDefault(false, false)).build
		}
		return infoRule
	}
	
	public def getModifyInfoRule() {
		if (modifyInfoRule === null) {			
			modifyInfoRule = createRule.name("ModifyInfoRule").precondition(JInfoQueryForModify.Matcher.querySpecification())
				.action(CRUDActivationStateEnum.UPDATED) [
										
					System.out.println("Updating info: " + JInfo.uuid)
										
					uiInfo.versions.clear
					uiInfo.submodels.clear
					
					for (JSubmodel submodel : JInfo.submodels) {
						if (submodel.version !== null) {
							uiInfo.versions.add(submodel.version);
						} else {
							uiInfo.versions.add("");
						}
						
						uiInfo.submodels.add(submodel.name);
					}		
					
				].action(CRUDActivationStateEnum.DELETED) [
										
					System.out.println("Deleting info: " + JInfo.uuid)
					
					psm2ui.uiBase.remove(UIBase_Info, uiInfo)
					psm2ui.remove(PSMToUI_Traces, trace)
					
				].addLifeCycle(Lifecycles.getDefault(true, true)).build
		}
		return modifyInfoRule
	}
	
}