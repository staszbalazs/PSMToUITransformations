package transformations

import queries.FindDescendantsForClassWithJClass.Match
import java.util.List
import java.util.Set
import java.util.stream.Collectors
import operations.Interval
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
import psm.JClass
import psm.JVisibility
import queries.FindCorrespondingType
import queries.JAttributeInJGroupViewFieldQuery
import queries.JAttributeQuery
import queries.JAttributeQueryForModify
import queries.JAttributeViewFieldQueryForModify
import queries.PatternProvider
import traceability.PSMToUI
import traceability.TraceabilityPackage
import ui.UIBaseComponentType
import ui.UIClass
import ui.UIViewField
import ui.UIViewFieldSet
import ui.UiPackage

class AttributeRuleFactory {
	
	extension IModelManipulations manipulation
	extension EventDrivenTransformationRuleFactory factory = new EventDrivenTransformationRuleFactory
	extension ViatraQueryEngine engine
	
	extension UiPackage uiPackage = UiPackage::eINSTANCE
	extension TraceabilityPackage trPackage = TraceabilityPackage::eINSTANCE
	
	extension PSMToUI psm2ui
	
	extension Interval interval
		
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> attributeRule
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> modifyAttributeRule
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> attributeInGroupViewFieldRule
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> modifyAttributeViewFieldRule
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> primitiveRule
	
	
	new(PSMToUI psm2ui, ViatraQueryEngine engine) {
		this.manipulation = new SimpleModelManipulations(engine);
		this.interval = new Interval(engine)
		this.engine = engine;
		this.psm2ui = psm2ui;
	}
	
	public def getAttributeRule() {
		if (attributeRule === null) {
			attributeRule = createRule.name("AttributeRule").precondition(JAttributeQuery.Matcher.querySpecification())
				.action(CRUDActivationStateEnum.CREATED) [
										
					System.out.println("Transforming attribute: " + JAttribute.uuid)
														
					//create UIBaseComponentType
					val UIBaseComponentType uiBaseType = uiClass.createChild(getUIClass_Attributes, UIBaseComponentType) as UIBaseComponentType
					
					//set attributes
					uiBaseType.name = JAttribute.name
					uiBaseType.uuid = uiClass.uuid + "." + JAttribute.name
					if (JAttribute.visibility == JVisibility::PROTECTED) {
						uiBaseType.readonly = true
					} else if (JAttribute.visibility == JVisibility::PRIVATE) {
						uiBaseType.private = true
					}
								
					if (JAttribute.isDerived || JAttribute.calculated || JAttribute.visibility == JVisibility::PROTECTED) {
						uiBaseType.value = ""
					} else {
						uiBaseType.value = JAttribute.value
					}
					uiBaseType.derived = JAttribute.derived
					uiBaseType.lower = JAttribute.lower
					uiBaseType.upper = JAttribute.upper
					uiBaseType.regexp = JAttribute.regexp
					uiBaseType.decimals = JAttribute.decimals
					uiBaseType.placeholder = JAttribute.placeholder
					uiBaseType.interval = JAttribute.interval
					
					if (JAttribute.ownerClass.representation !== null && JAttribute.ownerClass.representation == JAttribute) {
						uiBaseType.representation = true;
						uiClass.representation = uiBaseType;	
					}
					
					//set type							
					uiBaseType.type = baseType.name
					
					//create intervals
					createIntervals(uiBaseType, uiBaseType.ownerClass.uuid)
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
					
					if (JAttribute.eContainer !== null && JAttribute.eContainer.eContainer !== null) {
						System.out.println("Updating attribute: " + JAttribute.uuid)
					
						val UIBaseComponentType componentType = trace.uiElements.get(0) as UIBaseComponentType
						//set attributes
						componentType.name = JAttribute.name
						componentType.uuid = uiClass.uuid + "." + JAttribute.name
						if (JAttribute.visibility == JVisibility::PROTECTED) {
							componentType.readonly = true
						} else if (JAttribute.visibility == JVisibility::PRIVATE) {
							componentType.private = true
						}
									
						if (JAttribute.isDerived || JAttribute.calculated || JAttribute.visibility == JVisibility::PROTECTED) {
							componentType.value = ""
						} else {
							componentType.value = JAttribute.value
						}
						componentType.derived = JAttribute.derived
						componentType.lower = JAttribute.lower
						componentType.upper = JAttribute.upper
						componentType.regexp = JAttribute.regexp
						componentType.decimals = JAttribute.decimals
						componentType.placeholder = JAttribute.placeholder
						componentType.interval = JAttribute.interval
						
						//set type							
						componentType.type = baseType.uuid
						
						//create intervals
						componentType.intervals.clear
						createIntervals(componentType, uiClass.uuid)
					}
		
				].action(CRUDActivationStateEnum.DELETED) [
					
					System.out.println("Deleting attribute: " + JAttribute.uuid)
					
					val UIBaseComponentType componentType = trace.uiElements.get(0) as UIBaseComponentType
					
					componentType.eContainer.remove(UIClass_Attributes, componentType)
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
					
					if (JAttribute.eContainer !== null && JAttribute.eContainer.eContainer !== null) {
						System.out.println("Updating view field for attribute: " + JAttribute.uuid)
					
						//Update viewField in classView
						var match = PatternProvider.instance().getFindViewFieldForComponentType(engine)
																	.getOneArbitraryMatch(uiBaseType, uiClass.classView, null, null)
																	.get();
													
						val UIViewFieldSet classViewFieldSet = match.getViewFieldSet;
						val UIViewField classViewField = match.getViewField;
						
						if (!classViewFieldSet.uuid.endsWith("Group")) {
							classViewFieldSet.name = uiBaseType.name;
							classViewFieldSet.uuid = uiClass.classView.uuid + "_viewfieldset_" + uiBaseType.name
						}
							
						classViewField.name = uiBaseType.name;
						classViewField.uuid = uiClass.uuid + "." + uiBaseType.name + "_viewField_classView"				
						classViewField.searchable = !JAttribute.uiNoSearch
						
						//Update viewField in listView
						match = PatternProvider.instance().getFindViewFieldForComponentType(engine)
																	.getOneArbitraryMatch(uiBaseType, uiClass.listView, null, null)
																	.get();
									
						val UIViewFieldSet listViewFieldSet = match.getViewFieldSet;
						val UIViewField listViewField = match.getViewField;
									
						listViewFieldSet.name = uiClass.listView.name;
						listViewFieldSet.uuid = uiClass.listView.uuid + "_viewfieldset_" + uiClass.listView.name;
							
						listViewField.uuid = uiClass.uuid + "." + uiBaseType.name + "_viewField_listView"
						listViewField.name = uiBaseType.name				
						listViewField.searchable = !JAttribute.uiNoSearch;
					}
										
				].action(CRUDActivationStateEnum.DELETED) [
					
					System.out.println("Deleting view field for attribute: " + JAttribute.uuid)
					
					//Remove ViewField form ClassView
					var match = PatternProvider.instance().getFindViewFieldForComponentType(engine)
																.getOneArbitraryMatch(uiBaseType, uiClass.classView, null, null)
																.get();
					
					if (!match.viewFieldSet.uuid.endsWith("Group") && match.viewFieldSet.viewFields.size() == 1) {
						uiClass.classView.remove(UIView_ViewFieldSets, match.viewFieldSet)
					} else {
						match.viewFieldSet.remove(UIViewFieldSet_ViewFields, match.viewField)
					}
					
					//Remove ViewField from ListView
					match = PatternProvider.instance().getFindViewFieldForComponentType(engine)
																.getOneArbitraryMatch(uiBaseType, uiClass.listView, null, null)
																.get();
																
					match.viewFieldSet.remove(UIViewFieldSet_ViewFields, match.viewField)
					
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