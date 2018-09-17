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
import psm.JPackage
import queries.JPackageToUIModuleQuery
import traceability.PSMToUI
import traceability.TraceabilityPackage
import ui.UIModule
import ui.UiPackage

class PackageRuleFactory {
	
	extension IModelManipulations manipulation	
	extension EventDrivenTransformationRuleFactory factory = new EventDrivenTransformationRuleFactory
	
	extension UiPackage uiPackage = UiPackage::eINSTANCE
	extension TraceabilityPackage trPackage = TraceabilityPackage::eINSTANCE
	
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> packageRule
	
	//After Model
	public def getPackageRule(PSMToUI psm2ui, ViatraQueryEngine engine) {
		if (packageRule === null) {
			manipulation = new SimpleModelManipulations(engine);
						
			packageRule = createRule.name("PackageRule").precondition(JPackageToUIModuleQuery.Matcher.querySpecification())
				.action(CRUDActivationStateEnum.CREATED) [
					
					val JPackage jPackage = it.getJPackage() as JPackage
					
					System.out.println("Transforming package: " + jPackage.uuid)
					
					
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