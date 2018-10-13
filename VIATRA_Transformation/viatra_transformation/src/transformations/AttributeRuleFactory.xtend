package transformations

import java.util.List
import java.util.stream.Collectors
import operations.ComponentType
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher
import org.eclipse.viatra.transformation.evm.specific.Lifecycles
import org.eclipse.viatra.transformation.evm.specific.crud.CRUDActivationStateEnum
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.SimpleModelManipulations
import org.eclipse.viatra.transformation.runtime.emf.rules.eventdriven.EventDrivenTransformationRule
import org.eclipse.viatra.transformation.runtime.emf.rules.eventdriven.EventDrivenTransformationRuleFactory
import psm.JAttribute
import psm.JPrimitive
import queries.FindCorrespondingType
import queries.JAttributeQuery
import queries.JAttributeQueryForModify
import queries.PatternProvider
import traceability.PSMToUI
import traceability.TraceabilityPackage
import ui.UIClass
import ui.UiPackage

class AttributeRuleFactory {
	
	extension IModelManipulations manipulation
	extension EventDrivenTransformationRuleFactory factory = new EventDrivenTransformationRuleFactory
	extension ViatraQueryEngine engine
	
	extension UiPackage uiPackage = UiPackage::eINSTANCE
	extension TraceabilityPackage trPackage = TraceabilityPackage::eINSTANCE
	
	extension PSMToUI psm2ui
	
	extension ComponentType componentTypeExtension
	
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> attributeRule
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> modifyAttributeRule
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> primitiveRule
	
	
	new(PSMToUI psm2ui, ViatraQueryEngine engine) {
		this.manipulation = new SimpleModelManipulations(engine);
		this.componentTypeExtension = new ComponentType(psm2ui, engine)
		this.engine = engine;
		this.psm2ui = psm2ui;
	}
	
	public def getAttributeRule() {
		if (attributeRule === null) {
			attributeRule = createRule.name("AttributeRule").precondition(JAttributeQuery.Matcher.querySpecification())
				.action(CRUDActivationStateEnum.CREATED) [
										
					System.out.println("Transforming attribute: " + JAttribute.uuid)
																				
					//Create role for owner
					val uiBaseType = createUIBaseType(uiClass, JAttribute, baseType)
					psm2ui.createChild(PSMToUI_Traces, PSMToUITrace) => [
						addTo(PSMToUITrace_PsmElements, JAttribute)
						addTo(PSMToUITrace_UiElements, uiBaseType)
					]
					
					//Get descendant UIClasses
					val List<UIClass> ownersByInheritance = PatternProvider.instance().getFindDescendantsForClass(engine)
											  .getAllMatches(null, uiClass)
											  .stream()
											  .map[getDescendant as UIClass]
											  .collect(Collectors.toList)
					
					for (UIClass class : ownersByInheritance) {
						class.inheritedAttributes.add(uiBaseType)
					}
									
				].addLifeCycle(Lifecycles.getDefault(false, false)).build
		}
		return attributeRule
	}
	
	
	public def getModifyAttributeRule() {
		if (modifyAttributeRule === null) {
			modifyAttributeRule = createRule.name("ModifyAttributeRule").precondition(JAttributeQueryForModify.Matcher.querySpecification())
				.action(CRUDActivationStateEnum.UPDATED) [
					
					System.out.println("Updating attribute: " + JAttribute.uuid)
					
					modifyUIBaseType(it.componentType, uiClass, JAttribute, baseType)
					
				].action(CRUDActivationStateEnum.DELETED) [
					
					System.out.println("Deleting attribute: " + JAttribute.uuid)
					
					uiClass.remove(UIClass_Attributes, componentType)
					psm2ui.remove(PSMToUI_Traces, trace)
					
				].addLifeCycle(Lifecycles.getDefault(true, true)).build
		}
		return modifyAttributeRule
	}
	
	public def getPrimitiveRule() {
		if (primitiveRule === null) {
			primitiveRule = createRule.name("PrimitiveRule").precondition(FindCorrespondingType.Matcher.querySpecification())
				.action(CRUDActivationStateEnum.CREATED) [
					
					psm2ui.createChild(PSMToUI_Traces, PSMToUITrace) => [
						addTo(PSMToUITrace_PsmElements, JPrimitive)
						addTo(PSMToUITrace_UiElements, ComponentType)
					]
					
				].addLifeCycle(Lifecycles.getDefault(false, false)).build
		}
		return primitiveRule
	}
	
}