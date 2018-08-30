package transformations

import org.eclipse.viatra.transformation.evm.specific.Lifecycles
import org.eclipse.viatra.transformation.evm.specific.crud.CRUDActivationStateEnum
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations
import org.eclipse.viatra.transformation.runtime.emf.rules.eventdriven.EventDrivenTransformationRuleFactory
import queries.PatternProvider
import traceability.PSMToUI
import ui.UiPackage
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.transformation.runtime.emf.rules.eventdriven.EventDrivenTransformationRule
import psm.JPackage
import traceability.TraceabilityPackage
import ui.UIModule

class PackageRuleFactory {
	
	extension IModelManipulations manipulation	
	extension EventDrivenTransformationRuleFactory factory = new EventDrivenTransformationRuleFactory
	
	extension UiPackage uiPackage = UiPackage::eINSTANCE
	extension TraceabilityPackage trPackage = TraceabilityPackage::eINSTANCE
	
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> packageRule
	
	//After Model
	public def getPackageRule(PSMToUI psm2ui) {
		if (packageRule === null) {
			packageRule = createRule.name("PackageRule").precondition(PatternProvider.instance().getJPackageToUIModuleQuery())
				.action(CRUDActivationStateEnum.CREATED) [
					
					val JPackage jPackage = it.getJPackage() as JPackage
					
					val UIModule uiModule = psm2ui.uiBase.createChild(getUIBase_Modules(), UIModule) as UIModule
					
					uiModule.uuid = jPackage.uuid
					uiModule.name = jPackage.name
					uiModule.fullyQualifiedName = jPackage.fqName()
					
					val trace = psm2ui.createChild(PSMToUI_Traces, PSMToUITrace)
					trace.addTo(PSMToUITrace_PsmElements, jPackage)
					trace.addTo(PSMToUITrace_UiElements, uiModule)
					
				].action(CRUDActivationStateEnum.UPDATED) [
				].action(CRUDActivationStateEnum.DELETED) [
				].addLifeCycle(Lifecycles.getDefault(true, true)).build
		}
		return packageRule
	}
	
	
	private def fqName(JPackage pe) {
		if (pe.parent !== null) {
			return pe.parent.fqName() + "." + pe.name;
		} else {
			return pe.name;
		}
	}
	
}