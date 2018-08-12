package transformations

import org.eclipse.viatra.transformation.evm.specific.Lifecycles
import org.eclipse.viatra.transformation.evm.specific.crud.CRUDActivationStateEnum
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations
import org.eclipse.viatra.transformation.runtime.emf.rules.eventdriven.EventDrivenTransformationRuleFactory
import psm.JVisibility
import queries.PatternProvider
import traceability.PSMToUI
import traceability.TraceabilityPackage
import ui.UIClass
import ui.UIModule
import ui.UiPackage
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.transformation.runtime.emf.rules.eventdriven.EventDrivenTransformationRule
import psm.JClass

class ClassRuleFactory {
	
	extension IModelManipulations manipulation	
	extension UiPackage uiPackage = UiPackage::eINSTANCE
	extension TraceabilityPackage trPackage = TraceabilityPackage::eINSTANCE
	extension EventDrivenTransformationRuleFactory factory = new EventDrivenTransformationRuleFactory
	
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> classRule
	
	public def getClassRule(PSMToUI psm2ui) {
		if (classRule === null) {
			classRule = createRule.name("ClassRule").precondition(PatternProvider.instance().getJClassWithGuardConditionQuery())
				.action(CRUDActivationStateEnum.CREATED) [	
					
					val JClass jClass = it.getJClass() as JClass
					
					//Get the UIModule for the class
					val potentialModule = psm2ui.traces.stream()
										.filter[getPsmElements.contains(jClass.getPackage)]
										.map[getUiElements()]
										.findFirst()
					
					var UIModule module = potentialModule.get().get(0) as UIModule
					
					//Get or create the UIClass
					val potentialUIClass = psm2ui.traces.stream()
										.filter[getPsmElements.contains(jClass)]
										.map[getUiElements()]
										.findFirst()
					
					var UIClass uiClass
					if (potentialUIClass.isPresent) {
						uiClass = potentialUIClass.get().get(0) as UIClass
						module.addTo(getUIModule_Classes, uiClass)
					} else {
						uiClass = module.createChild(getUIModule_Classes, UIClass) as UIClass
						
						val trace = psm2ui.createChild(PSMToUI_Traces, PSMToUITrace)
						trace.addTo(PSMToUITrace_PsmElements, jClass)
						trace.addTo(PSMToUITrace_UiElements, uiClass)
					}
					
					//Set attributes
					uiClass.set(getIdentifiable_Name, jClass.getName)
					uiClass.set(getIdentifiable_Uuid, jClass.getUuid)
					uiClass.set(getUIClass_Abstract, jClass.isAbstract)
					uiClass.set(getUIClass_EnumClass, jClass.isRepresentsEnum)
					uiClass.set(getUIClass_Singleton, jClass.isBusinessSingleton)
					
					if (jClass.getVisibility == JVisibility::PUBLIC) {
						uiClass.set(UIClass_Readonly, false)	
					} else {
						uiClass.set(UIClass_Readonly, true)
					}
					
					//Set supertype
					if (jClass.getSupertype !== null) {
						val potentialSuper = psm2ui.traces.stream()
										.filter[getPsmElements.contains(jClass.getSupertype)]
										.map[getUiElements()]
										.findFirst()
						
						
						if (potentialSuper.isPresent) {
							uiClass.addTo(getUIClass_Super, potentialSuper.get().get(0))
						} else {
							val superType = psm2ui.uiBase.eResource.create(UIClass)
							uiClass.addTo(getUIClass_Super, superType)
							
							val trace = psm2ui.createChild(PSMToUI_Traces, PSMToUITrace)
							trace.addTo(PSMToUITrace_PsmElements, jClass.getSupertype)
							trace.addTo(PSMToUITrace_UiElements, superType)
						}
					}
					
					//Create views
					
				
				].action(CRUDActivationStateEnum.UPDATED) [
				].action(CRUDActivationStateEnum.DELETED) [
				].addLifeCycle(Lifecycles.getDefault(true, true)).build
		}
		return classRule
	}
	
}