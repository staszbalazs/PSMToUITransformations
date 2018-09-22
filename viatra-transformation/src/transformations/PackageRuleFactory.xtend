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
import queries.JPackageToUIModuleQueryForModify
import traceability.PSMToUI
import traceability.PSMToUITrace
import traceability.TraceabilityPackage
import ui.UIModule
import ui.UiPackage

class PackageRuleFactory {
	
	extension IModelManipulations manipulation
	extension ViatraQueryEngine engine
	extension EventDrivenTransformationRuleFactory factory = new EventDrivenTransformationRuleFactory
	
	extension UiPackage uiPackage = UiPackage::eINSTANCE
	extension TraceabilityPackage trPackage = TraceabilityPackage::eINSTANCE
	
	extension PSMToUI psm2ui
	
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> packageRule
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> modifyPackageRule
	
	new(PSMToUI psm2ui, ViatraQueryEngine engine) {
		this.manipulation = new SimpleModelManipulations(engine);
		this.engine = engine;
		this.psm2ui = psm2ui;
	}
	
	public def getPackageRule() {
		if (packageRule === null) {
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
					
				].addLifeCycle(Lifecycles.getDefault(false, false)).build
		}
		return packageRule
	}
	
	public def getModifyPackageRule() {
		if (modifyPackageRule === null) {						
			modifyPackageRule = createRule.name("ModifyPackageRule").precondition(JPackageToUIModuleQueryForModify.Matcher.querySpecification())
				.action(CRUDActivationStateEnum.UPDATED) [
					
					val JPackage jPackage = it.getJPackage() as JPackage
					val UIModule uiModule = it.getUiModule() as UIModule
					
					System.out.println("Updating package: " + jPackage.uuid)
												
					uiModule.uuid = jPackage.uuid
					uiModule.name = jPackage.name
					uiModule.fullyQualifiedName = jPackage.fqName()						
					
				].action(CRUDActivationStateEnum.DELETED) [
					
					val JPackage jPackage = it.getJPackage() as JPackage
					val UIModule uiModule = it.getUiModule() as UIModule
					val PSMToUITrace trace = it.getTrace() as PSMToUITrace
					
					System.out.println("Deleting package: " + jPackage.uuid)
												
					psm2ui.uiBase.remove(UIBase_Modules, uiModule)
					psm2ui.remove(PSMToUI_Traces, trace)
					
				].addLifeCycle(Lifecycles.getDefault(true, true)).build
		}
		return modifyPackageRule
	}
	
	
	private def fqName(JPackage pe) {
		if (pe.parent !== null) {
			return pe.parent.fqName() + "." + pe.name;
		} else {
			return pe.name;
		}
	}
	
}