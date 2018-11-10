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
import queries.RepresentsUserJClassQuery
import queries.PatternProvider
import queries.PsmToUiTrace.Match

class InfoRuleFactory {
	
	extension IModelManipulations manipulation
	extension EventDrivenTransformationRuleFactory factory = new EventDrivenTransformationRuleFactory
	extension ViatraQueryEngine engine
	
	extension UiPackage uiPackage = UiPackage::eINSTANCE
	extension TraceabilityPackage trPackage = TraceabilityPackage::eINSTANCE
	
	extension PSMToUI psm2ui
	
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> infoRule
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> modifyInfoRule
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> representUserIdForInfoRule
	
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
					
					var UIInfo info = psm2ui.uiBase.info
					
					for (JSubmodel submodel : JInfo.submodels) {
						if (submodel.version !== null) {
							info.versions.add(submodel.version);
						} else {
							info.versions.add("");
						}
						
						info.submodels.add(submodel.name);
					}								
															
					val trace = psm2ui.createChild(PSMToUI_Traces, PSMToUITrace)
					trace.addTo(PSMToUITrace_PsmElements, JInfo)
					trace.addTo(PSMToUITrace_UiElements, info)
					
				].addLifeCycle(Lifecycles.getDefault(false, false)).build
		}
		return infoRule
	}
	
	
	public def getRepresentsUserIdForInfoRule() {
		if (representUserIdForInfoRule === null) {			
			representUserIdForInfoRule = createRule.name("RepresentUserIdForInfoRule").precondition(RepresentsUserJClassQuery.Matcher.querySpecification())
				.action(CRUDActivationStateEnum.CREATED) [
					
					System.out.println("Setting userClass for info: " + JClass.uuid)
					psm2ui.uiBase.info.userClass = JClass.uuid 
					
				].action(CRUDActivationStateEnum.UPDATED) [
					
					System.out.println("Setting userClass for info: " + JClass.uuid)
					psm2ui.uiBase.info.userClass = JClass.uuid 
																				
				].action(CRUDActivationStateEnum.DELETED) [
					
					System.out.println("Setting userClass for info: " + JClass.uuid)
					psm2ui.uiBase.info.userClass = "" 					
					
				].addLifeCycle(Lifecycles.getDefault(true, true)).build
		}
		return representUserIdForInfoRule
	}
	
	public def getModifyInfoRule() {
		if (modifyInfoRule === null) {			
			modifyInfoRule = createRule.name("ModifyInfoRule").precondition(JInfoQueryForModify.Matcher.querySpecification())
				.action(CRUDActivationStateEnum.UPDATED) [
										
					System.out.println("Updating info: " + JInfo.uuid)
					
					var UIInfo uiInfo = PatternProvider.instance().getPsmToUiTrace(engine)
																	.getOneArbitraryMatch(JInfo, null, null)
																	.get()
																	.getIdentifiable() as UIInfo;
										
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
					
					var Match match = PatternProvider.instance().getPsmToUiTrace(engine)
														.getOneArbitraryMatch(JInfo, null, null)
														.get();
					
					psm2ui.uiBase.remove(UIBase_Info, match.getIdentifiable())
					psm2ui.remove(PSMToUI_Traces, match.getTrace())
					
				].addLifeCycle(Lifecycles.getDefault(true, true)).build
		}
		return modifyInfoRule
	}
	
}