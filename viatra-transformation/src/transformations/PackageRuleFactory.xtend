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

class PackageRuleFactory {
	
	extension IModelManipulations manipulation	
	extension UiPackage uiPackage = UiPackage::eINSTANCE
	extension EventDrivenTransformationRuleFactory factory = new EventDrivenTransformationRuleFactory
	
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> packageRule
	
	//After Model
	public def getPackageRule(PSMToUI psm2ui) {
		if (packageRule === null) {
			packageRule = createRule.name("PackageRule").precondition(PatternProvider.instance().getJPackageToUIModuleQuery())
				.action(CRUDActivationStateEnum.CREATED) [
					
					val JPackage jPackage = it.getJPackage() as JPackage
					
					val uiModule = psm2ui.uiBase.createChild(getUIBase_Modules(), UIModule) => [
						set(getIdentifiable_Uuid(), jPackage.getUuid())
						set(getIdentifiable_Name(), jPackage.getName())
					]
					
					var fqName = jPackage.getName()
					var currentPackage = jPackage 
					while (currentPackage.getParent() !== null) {
							fqName = currentPackage.parent.name + "." + fqName;
							currentPackage = currentPackage.getParent;
					}
					uiModule.set(getUIModule_FullyQualifiedName(), fqName)
					
				].action(CRUDActivationStateEnum.UPDATED) [
				].action(CRUDActivationStateEnum.DELETED) [
				].addLifeCycle(Lifecycles.getDefault(true, true)).build
		}
		return packageRule
	}
	
}