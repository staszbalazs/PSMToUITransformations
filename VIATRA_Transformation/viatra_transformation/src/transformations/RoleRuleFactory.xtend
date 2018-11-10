package transformations

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
import psm.JRole
import psm.JVisibility
import queries.JRoleQuery
import queries.JRoleQueryForModify
import queries.JRoleViewFieldQuery
import queries.PatternProvider
import traceability.PSMToUI
import traceability.TraceabilityPackage
import ui.UIClass
import ui.UIReferenceComponentType
import ui.UIViewField
import ui.UIViewFieldSet
import ui.UiPackage
import traceability.PSMToUITrace

class RoleRuleFactory {
	
	extension IModelManipulations manipulation
	extension EventDrivenTransformationRuleFactory factory = new EventDrivenTransformationRuleFactory
	extension ViatraQueryEngine engine
	
	extension UiPackage uiPackage = UiPackage::eINSTANCE
	extension TraceabilityPackage trPackage = TraceabilityPackage::eINSTANCE
	
	extension PSMToUI psm2ui
			
	extension Interval interval		
		
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> roleRule
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> modifyRoleRule
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> roleViewFieldRule
	
	new(PSMToUI psm2ui, ViatraQueryEngine engine) {
		this.manipulation = new SimpleModelManipulations(engine);
		this.engine = engine;
		this.psm2ui = psm2ui;
		this.interval = new Interval(engine)
	}
	
	public def getRoleRule() {
		if (roleRule === null) {
			roleRule = createRule.name("RoleRule").precondition(JRoleQuery.Matcher.querySpecification())
				.action(CRUDActivationStateEnum.CREATED) [
										
					System.out.println("Transforming role: " + JRole.uuid)
																										
					//create UIReferenceType
					var UIReferenceComponentType uiReferenceType = null
					val match = PatternProvider.instance().getPsmToUiTrace(engine)
														.getOneArbitraryMatch(JRole, null, null)
													
						
					if (match.isPresent) {
						uiReferenceType = match.get().getIdentifiable as UIReferenceComponentType
						uiReferenceType.moveTo(uiClass, getUIClass_Attributes)
					} else {
						uiReferenceType = uiClass.createChild(getUIClass_Attributes, UIReferenceComponentType) as UIReferenceComponentType
						
						val trace = psm2ui.createChild(PSMToUI_Traces, PSMToUITrace)
						trace.addTo(PSMToUITrace_PsmElements, JRole)
						trace.addTo(PSMToUITrace_UiElements, uiReferenceType)
					}
						
					//set attributes
					uiReferenceType.name = JRole.name
					uiReferenceType.uuid = uiClass.uuid + "." + JRole.name
					if (JRole.visibility == JVisibility::PROTECTED) {
						uiReferenceType.readonly = true
					} else if (JRole.visibility == JVisibility::PRIVATE) {
						uiReferenceType.private = true
					}
								
					if (JRole.ownerRelationship.isDerived || JRole.calculated || JRole.visibility == JVisibility::PROTECTED) {
						uiReferenceType.value = ""
					} else {
						uiReferenceType.value = JRole.value
					}
					uiReferenceType.derived = JRole.ownerRelationship.derived
					uiReferenceType.lower = JRole.lower
					uiReferenceType.upper = JRole.upper
					uiReferenceType.navigable = JRole.navigable
					uiReferenceType.kind = JRole.kind.getName().toLowerCase()
					uiReferenceType.interval = JRole.interval
					
					//set opposite and type
					val potentialOpposite = PatternProvider.instance().getPsmToUiTrace(engine)
												.getOneArbitraryMatch(opposite, null, null)
												
					if (potentialOpposite.isPresent) {
						val opposite = potentialOpposite
											.get()
											.getIdentifiable as UIReferenceComponentType
						uiReferenceType.opposite = opposite
						uiReferenceType.referenced = opposite.ownerClass
						uiReferenceType.type = opposite.ownerClass.name
					} else {
						val UIReferenceComponentType uiOpposite = psm2ui.uiBase.eResource.create(UIReferenceComponentType) as UIReferenceComponentType
						
						val trace = psm2ui.createChild(PSMToUI_Traces, PSMToUITrace)
						trace.addTo(PSMToUITrace_PsmElements, opposite)
						trace.addTo(PSMToUITrace_UiElements, uiOpposite)
						
						uiReferenceType.opposite = uiOpposite
						
						val UIClass referenced = PatternProvider.instance().getPsmToUiTrace(engine)
															.getOneArbitraryMatch(opposite.ownerClass, null, null)
															.get()
															.getIdentifiable as UIClass
																	
					    uiReferenceType.referenced = referenced
					    uiReferenceType.type = referenced.name										
					}
					
					//create intervals
					createIntervals(uiReferenceType, uiReferenceType.ownerClass.uuid)
					
					createViewFields(uiClass, uiReferenceType, JRole)
					
					//Get descendant UIClasses
					val ownersByInheritance = PatternProvider.instance().getFindDescendantsForClass(engine)
											  .getAllMatches(uiClass, null)
											  .stream()
											  .map[getDescendant as UIClass]
											  .collect(Collectors.toList)
					
					//Add attribute to each of them
					for (UIClass class : ownersByInheritance) {
						class.inheritedAttributes.add(uiReferenceType)
						createViewFields(class, uiReferenceType, JRole)
					}
									
				].addLifeCycle(Lifecycles.getDefault(false, false)).build
		}
		return roleRule
	}
	
	public def getModifyRoleRule() {
		if (modifyRoleRule === null) {
			modifyRoleRule = createRule.name("ModifyRoleRule").precondition(JRoleQueryForModify.Matcher.querySpecification())
				.action(CRUDActivationStateEnum.UPDATED) [
					
					if (JRole.eContainer !== null && JRole.ownerClass.eContainer !== null) {
						System.out.println("Updating role: " + JRole.uuid)
					
						val UIReferenceComponentType referenceComponentType = (trace as PSMToUITrace).uiElements.get(0) as UIReferenceComponentType
																	
						referenceComponentType.name = JRole.name
						referenceComponentType.uuid = classUuid + "." + JRole.name
						if (JRole.visibility == JVisibility::PROTECTED) {
							referenceComponentType.readonly = true
						} else if (JRole.visibility == JVisibility::PRIVATE) {
							referenceComponentType.private = true
						}
												
						if (JRole.ownerRelationship.isDerived || JRole.calculated || JRole.visibility == JVisibility::PROTECTED) {
							referenceComponentType.value = ""
						} else {
							referenceComponentType.value = JRole.value
						}
						referenceComponentType.derived = JRole.ownerRelationship.isDerived
						referenceComponentType.lower = JRole.lower
						referenceComponentType.upper = JRole.upper
						referenceComponentType.navigable = JRole.navigable
						referenceComponentType.kind = JRole.kind.getName().toLowerCase()
						referenceComponentType.interval = JRole.interval
						
						referenceComponentType.intervals.clear			
						createIntervals(referenceComponentType, classUuid)
						
						val potentialOpposite = PatternProvider.instance().getFindOppositeForRole(engine)
																	.getOneArbitraryMatch(JRole, null)
						if (potentialOpposite.isPresent) {
							referenceComponentType.type = potentialOpposite.get().oppositeComponentType.ownerClass.name	
						} else {
							referenceComponentType.type = ""
						}
						
					}	
									
				].action(CRUDActivationStateEnum.DELETED) [
										
					System.out.println("Deleting role: " + JRole.uuid)
					
					val UIReferenceComponentType referenceComponentType = (trace as PSMToUITrace).uiElements.get(0) as UIReferenceComponentType
					referenceComponentType.eContainer.remove(UIClass_Attributes, referenceComponentType)
					psm2ui.remove(PSMToUI_Traces, trace)
					
				].addLifeCycle(Lifecycles.getDefault(true, true)).build
		}
		return modifyRoleRule
	}
	
	public def getRoleViewFieldRule() {
		if (roleViewFieldRule === null) {
			roleViewFieldRule = createRule.name("RoleViewFieldRule").precondition(JRoleViewFieldQuery.Matcher.querySpecification())
				.action(CRUDActivationStateEnum.UPDATED) [
					
					if (JRole.eContainer !== null && JRole.ownerClass.eContainer !== null) {
						System.out.println("Updating viewField for role: " + JRole.uuid)
					
						//Update viewField in classView
						var match = PatternProvider.instance().getFindViewFieldForComponentType(engine)
																	.getOneArbitraryMatch(referenceComponentType, uiClass.classView, null, null)
																	.get();
																	
						val UIViewFieldSet classViewFieldSet = match.getViewFieldSet;
						val UIViewField classViewField = match.getViewField;
						
						classViewFieldSet.name = referenceComponentType.name;
						classViewFieldSet.uuid = uiClass.classView.uuid + "_viewfieldset_" + referenceComponentType.name
							
						classViewField.name = referenceComponentType.name;
						classViewField.uuid = uiClass.uuid + "." +  referenceComponentType.name + "_viewField_classView"
						
						if (referenceComponentType.upper == 1) {
							match = PatternProvider.instance().getFindViewFieldForComponentType(engine)
																	.getOneArbitraryMatch(referenceComponentType, uiClass.listView, null, null)
																	.get();
							
							val UIViewField listViewField = match.getViewField;
							
							listViewField.uuid = uiClass.uuid + "." + referenceComponentType.name + "_viewField_listView"
							listViewField.name = referenceComponentType.name
							if (JRole.ownerClass.attributesForListing.size() > 0) {
								listViewField.show = false;
							}
						}
					}
									
				].action(CRUDActivationStateEnum.DELETED) [
					
					if (uiClass.eContainer !== null) {
						System.out.println("Deleting viewField for role: " + JRole.uuid)
						
						if (referenceComponentType.upper == 1) {
							val match = PatternProvider.instance().getFindViewFieldForComponentType(engine)
																	.getOneArbitraryMatch(referenceComponentType, uiClass.listView, null, null)
																	.get()
							val UIViewFieldSet listViewFieldSet = match.getViewFieldSet
							val UIViewField listViewField = match.getViewField
						
							listViewFieldSet.remove(UIViewFieldSet_ViewFields, listViewField)
						}
						
						val match = PatternProvider.instance().getFindViewFieldForComponentType(engine)
																	.getOneArbitraryMatch(referenceComponentType, uiClass.classView, null, null)
																	.get();
						val UIViewFieldSet classViewFieldSet = match.getViewFieldSet									
						uiClass.classView.remove(UIView_ViewFieldSets, classViewFieldSet)
					}
										
				].addLifeCycle(Lifecycles.getDefault(true, true)).build
		}
		return roleViewFieldRule
	}
	
	private def createViewFields(UIClass uiClass, UIReferenceComponentType uiReferenceType, JRole jRole) {
		//Create viewField if needed for ListView
		if (uiReferenceType.upper == 1 && uiReferenceType.navigable && !uiReferenceType.^private) {
			val UIViewFieldSet viewFieldSet = uiClass.listView.viewFieldSets.get(0)
						
			val UIViewField viewField = viewFieldSet.createChild(UIViewFieldSet_ViewFields, UIViewField) as UIViewField
			viewField.uuid = uiClass.uuid + "." + uiReferenceType.name + "_viewField_listView"
			viewField.name = uiReferenceType.name
			viewField.componentType = uiReferenceType;
			viewField.searchable = false
						
			if (jRole.ownerClass.attributesForListing.size() > 0) {
				viewField.show = false;
			}
			viewField.position = viewFieldSet.viewFields.size() + 1;
		}
					
		//Create viewField if needed for ClassView
		if (uiReferenceType.navigable && !uiReferenceType.^private) {
			val UIViewFieldSet viewFieldSet = uiClass.classView.createChild(UIView_ViewFieldSets, UIViewFieldSet) as UIViewFieldSet
			viewFieldSet.name = uiReferenceType.name;
			viewFieldSet.uuid = uiClass.classView.uuid + "_viewfieldset_" + uiReferenceType.name
			viewFieldSet.position = uiClass.classView.viewFieldSets.size();
						
			val UIViewField viewField = viewFieldSet.createChild(UIViewFieldSet_ViewFields, UIViewField) as UIViewField
			viewField.name = uiReferenceType.name;
			viewField.uuid = uiClass.uuid + "." + uiReferenceType.name + "_viewField_classView"
			viewField.componentType = uiReferenceType;
			viewField.searchable = false
		}
	}
	
	
}