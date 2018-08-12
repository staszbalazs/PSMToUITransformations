package transformations

import java.util.stream.Collectors
import operations.ComponentType
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher
import org.eclipse.viatra.transformation.evm.specific.Lifecycles
import org.eclipse.viatra.transformation.evm.specific.crud.CRUDActivationStateEnum
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations
import org.eclipse.viatra.transformation.runtime.emf.rules.eventdriven.EventDrivenTransformationRule
import org.eclipse.viatra.transformation.runtime.emf.rules.eventdriven.EventDrivenTransformationRuleFactory
import psm.JAttribute
import queries.PatternProvider
import traceability.PSMToUI
import traceability.TraceabilityPackage
import ui.UIClass
import java.util.List
import java.util.ArrayList

class AttributeRuleFactory {
	
	extension IModelManipulations manipulation
	extension EventDrivenTransformationRuleFactory factory = new EventDrivenTransformationRuleFactory
	
	extension TraceabilityPackage trPackage = TraceabilityPackage::eINSTANCE
	
	extension ComponentType componentType
	
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> attributeRule
	
	public def getAttributeRule(PSMToUI psm2ui, ViatraQueryEngine engine) {
		if (attributeRule === null) {
			attributeRule = createRule.name("AttributeRule").precondition(PatternProvider.instance().getJAttributeQuery())
				.action(CRUDActivationStateEnum.CREATED) [
					
					val JAttribute jAttr = it.JAttribute as JAttribute
					//Get owner UIClass
					val potentialOwner = psm2ui.traces.stream()
										.filter[getPsmElements.contains(jAttr.getOwnerClass)]
										.map[getUiElements()]
										.findFirst()
										
					val UIClass owner = potentialOwner.get.get(0) as UIClass
					
					//Create role for owner
					var uiBaseType = createUIBaseType(owner, jAttr, false, engine)
					val trace = psm2ui.createChild(PSMToUI_Traces, PSMToUITrace)
					trace.addTo(PSMToUITrace_PsmElements, jAttr)
					trace.addTo(PSMToUITrace_UiElements, uiBaseType)
					
					//Get descendant UIClasses
					val List<UIClass> ownersByInheritance = PatternProvider.instance().getFindDescendantsForClass(engine)
											  .getAllMatches(null, owner)
											  .stream()
											  .map[getDescendant as UIClass]
											  .collect(Collectors.toList)
					
					//Create role for each of them
					for (UIClass class : ownersByInheritance) {
						uiBaseType = createUIBaseType(class, jAttr, true, engine)
						trace.addTo(PSMToUITrace_UiElements, uiBaseType)
					}
							
				].action(CRUDActivationStateEnum.UPDATED) [
				].action(CRUDActivationStateEnum.DELETED) [
				].addLifeCycle(Lifecycles.getDefault(true, true)).build
		}
		return attributeRule
	}
	
}