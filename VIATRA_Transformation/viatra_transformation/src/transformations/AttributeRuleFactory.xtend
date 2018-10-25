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
import queries.FindCorrespondingType
import queries.JAttributeQuery
import queries.JAttributeQueryForModify
import queries.PatternProvider
import traceability.PSMToUI
import traceability.TraceabilityPackage
import ui.UIClass
import ui.UiPackage
import queries.FindDescendantsForClassWithJClass.Match
import psm.JAttribute
import psm.JClass
import ui.UIBaseComponentType
import ui.UIViewFieldSet
import ui.UIViewField
import java.util.Set
import queries.JAttributeInJGroupViewFieldQuery
import queries.JAttributeViewFieldQueryForModify
import ui.UIClassView
import ui.UIListView

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
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> attributeInGroupViewFieldRule
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> modifyAttributeViewFieldRule
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
					val trace = psm2ui.createChild(PSMToUI_Traces, PSMToUITrace)
					trace.addTo(PSMToUITrace_PsmElements, JAttribute)
					trace.addTo(PSMToUITrace_UiElements, uiBaseType)
					
					createViewFields(JAttribute.ownerClass, uiClass, JAttribute, uiBaseType);
					
					//Get descendant UIClasses
					val List<Match> matches = PatternProvider.instance().getFindDescendantsForClassWithJClass(engine)
											  .getAllMatches(uiClass, null, null)
											  .toList();
											 
					
					for (Match match : matches) {
						val uiClass = match.getDescendant;
						uiClass.inheritedAttributes.add(uiBaseType)
						
						createViewFields(match.getJClass, uiClass, JAttribute, uiBaseType);
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
					
					modifyUIBaseType(componentType, uiClass, JAttribute, baseType)
					
				].action(CRUDActivationStateEnum.DELETED) [
					
					System.out.println("Deleting attribute: " + JAttribute.uuid)
					
					uiClass.remove(UIClass_Attributes, componentType)
					psm2ui.remove(PSMToUI_Traces, trace)
					
				].addLifeCycle(Lifecycles.getDefault(true, true)).build
		}
		return modifyAttributeRule
	}
	
	
	public def getAttributeInGroupViewFieldRule() {
		if (attributeInGroupViewFieldRule === null) {
			attributeInGroupViewFieldRule = createRule.name("AttributeInGroupViewFieldRule").precondition(JAttributeInJGroupViewFieldQuery.Matcher.querySpecification())
				.action(CRUDActivationStateEnum.CREATED) [
										
					System.out.println("Creating viewField for attribute: " + JAttribute.uuid)
					
					val UIViewField viewField = viewFieldSet.createChild(UIViewFieldSet_ViewFields, UIViewField) as UIViewField
					viewField.componentType = uiBaseType;
					viewField.name = uiBaseType.name;
					viewField.uuid = classView.uuid + "." + uiBaseType.name + "_viewField_classView"
					viewField.searchable = !JAttribute.uiNoSearch;
					viewField.position = viewFieldSet.viewFields.size() + 1;
									
				].addLifeCycle(Lifecycles.getDefault(false, false)).build
		}
		return attributeInGroupViewFieldRule
	}
	
	public def getModifyAttributeViewFieldRule() {
		if (modifyAttributeViewFieldRule === null) {
			modifyAttributeViewFieldRule = createRule.name("ModifyAttributeViewFieldRule").precondition(JAttributeViewFieldQueryForModify.Matcher.querySpecification())
				.action(CRUDActivationStateEnum.UPDATED) [
					
					System.out.println("Updating view field for attribute: " + JAttribute.uuid)
					
					if (uiView instanceof UIClassView) {
						if (!viewFieldSet.uuid.endsWith("Group")) {
							viewFieldSet.name = uiBaseType.name;
							viewFieldSet.uuid = uiView.uuid + "_viewfieldset_" + uiBaseType.name
						}
						
						viewField.name = uiBaseType.name;
						viewField.uuid = uiClass.uuid + "." + uiBaseType.name + "_viewField_classView"				
						viewField.searchable = !JAttribute.uiNoSearch
					} else if (uiView instanceof UIListView) {					
						viewFieldSet.name = uiView.name;
						viewFieldSet.uuid = uiView.uuid + "_viewfieldset_" + uiView.name;
						
						viewField.uuid = uiClass.uuid + "." + uiBaseType.name + "_viewField_listView"
						viewField.name = uiBaseType.name				
						viewField.searchable = !JAttribute.uiNoSearch;
					}
										
				].action(CRUDActivationStateEnum.DELETED) [
					
					System.out.println("Deleting view field for attribute: " + JAttribute.uuid)
					
					if (!viewFieldSet.uuid.endsWith("Group") && viewFieldSet.viewFields.size() == 1) {
						uiView.remove(UIView_ViewFieldSets, viewField)
					} else {
						viewFieldSet.remove(UIViewFieldSet_ViewFields, viewField)
					}
					
				].addLifeCycle(Lifecycles.getDefault(true, true)).build
		}
		return modifyAttributeViewFieldRule
	}
	
	public def getPrimitiveRule() {
		if (primitiveRule === null) {
			primitiveRule = createRule.name("PrimitiveRule").precondition(FindCorrespondingType.Matcher.querySpecification())
				.action(CRUDActivationStateEnum.CREATED) [
					
					System.out.println("Mapping JPrimitive: " + JPrimitive.uuid + " to UIBaseComponentType: " + componentType.uuid)
					
					val trace = psm2ui.createChild(PSMToUI_Traces, PSMToUITrace)
					trace.addTo(PSMToUITrace_PsmElements, JPrimitive)
					trace.addTo(PSMToUITrace_UiElements, componentType)
					
				].addLifeCycle(Lifecycles.getDefault(false, false)).build
		}
		return primitiveRule
	}
	
	private def createViewFields(JClass jClass, UIClass uiClass, JAttribute jAttribute, UIBaseComponentType baseType) {
		//Create viewField if needed for ListView
		if (!baseType.private) {
			val UIViewFieldSet viewFieldSet = uiClass.listView.viewFieldSets.get(0)
						
			val UIViewField viewField = viewFieldSet.createChild(UIViewFieldSet_ViewFields, UIViewField) as UIViewField
			viewField.uuid = uiClass.uuid + "." + baseType.name + "_viewField_listView"
			viewField.name = baseType.name
			viewField.componentType = baseType;
			viewField.searchable = !jAttribute.uiNoSearch
						
			if (jClass.attributesForListing.contains(jAttribute)) {
				viewField.position = jClass.attributesForListing.indexOf(jAttribute) + 1;
			} else {
				if (jClass.attributesForListing.size() > 0) {
					viewField.show = false;
				}
				viewField.position = jClass.attributesForListing.size() + viewFieldSet.viewFields.size();
			}
		}
		
		//Create viewField if needed for ClassView
		val Set<JAttribute> orderedAttributes = jClass.attributeOrder.stream()
															.flatMap(order | order.getAttributes().stream())
															.collect(Collectors.toSet())
						
		if (!orderedAttributes.contains(jAttribute) && !baseType.private) {
			val UIViewFieldSet viewFieldSet = uiClass.classView.createChild(UIView_ViewFieldSets, UIViewFieldSet) as UIViewFieldSet
			viewFieldSet.name = jAttribute.name;
			viewFieldSet.uuid = uiClass.classView.uuid + "_viewfieldset_" + jAttribute.name
			viewFieldSet.position = uiClass.classView.viewFieldSets.size() + 1;
				
			val UIViewField viewField = viewFieldSet.createChild(UIViewFieldSet_ViewFields, UIViewField) as UIViewField
			viewField.name = baseType.name;
			viewField.uuid = uiClass.uuid + "." + baseType.name + "_viewField_classView"
			viewField.componentType = baseType;	
			viewField.searchable = !jAttribute.uiNoSearch
		}
	}
	
}