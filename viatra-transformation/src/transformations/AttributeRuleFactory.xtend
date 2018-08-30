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
					val match = PatternProvider.instance().getPsmToUiTrace(engine)
												.getOneArbitraryMatch(jAttr.ownerClass, null)
												.get()
										
					val UIClass owner = match.getIdentifiable as UIClass
					
					//Create role for owner
					val uiBaseType = createUIBaseType(owner, jAttr, engine)
					psm2ui.createChild(PSMToUI_Traces, PSMToUITrace) => [
						addTo(PSMToUITrace_PsmElements, jAttr)
						addTo(PSMToUITrace_UiElements, uiBaseType)
					]
					
					//Get descendant UIClasses
					val List<UIClass> ownersByInheritance = PatternProvider.instance().getFindDescendantsForClass(engine)
											  .getAllMatches(null, owner)
											  .stream()
											  .map[getDescendant as UIClass]
											  .collect(Collectors.toList)
					
					//Add attribute to each of them
					for (UIClass class : ownersByInheritance) {
						class.inheritedAttributes.add(uiBaseType)
					}
							
				].action(CRUDActivationStateEnum.UPDATED) [
				].action(CRUDActivationStateEnum.DELETED) [
				].addLifeCycle(Lifecycles.getDefault(true, true)).build
		}
		return attributeRule
	}
	
}