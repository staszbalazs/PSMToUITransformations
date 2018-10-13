package transformations

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
import psm.JRole
import queries.JRoleQuery
import queries.JRoleQueryForModify
import queries.JRoleViewFieldQuery
import queries.PatternProvider
import traceability.PSMToUI
import traceability.TraceabilityPackage
import ui.UIClass
import ui.UIClassView
import ui.UIListView
import ui.UIReferenceComponentType
import ui.UIViewField
import ui.UIViewFieldSet
import ui.UiPackage

class RoleRuleFactory {
	
	extension IModelManipulations manipulation
	extension EventDrivenTransformationRuleFactory factory = new EventDrivenTransformationRuleFactory
	extension ViatraQueryEngine engine
	
	extension UiPackage uiPackage = UiPackage::eINSTANCE
	extension TraceabilityPackage trPackage = TraceabilityPackage::eINSTANCE
	
	extension PSMToUI psm2ui
	
	extension ComponentType componentType
	
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> roleRule
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> modifyRoleRule
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> roleViewFieldRule
	
	new(PSMToUI psm2ui, ViatraQueryEngine engine) {
		this.manipulation = new SimpleModelManipulations(engine);
		this.engine = engine;
		this.psm2ui = psm2ui;
		this.componentType = new ComponentType(psm2ui, engine)
	}
	
	public def getRoleRule() {
		if (roleRule === null) {
			roleRule = createRule.name("RoleRule").precondition(JRoleQuery.Matcher.querySpecification())
				.action(CRUDActivationStateEnum.CREATED) [
										
					System.out.println("Transforming role: " + JRole.uuid)
																										
					//Create role for owner
					var uiReferenceType = createUIReferenceComponentType(uiClass, JRole, opposite)
					val trace = psm2ui.createChild(PSMToUI_Traces, PSMToUITrace)
					trace.addTo(PSMToUITrace_PsmElements, JRole)
					trace.addTo(PSMToUITrace_UiElements, uiReferenceType)
					
					createViewFields(uiClass, uiReferenceType, JRole)
					
					//Get descendant UIClasses
					val ownersByInheritance = PatternProvider.instance().getFindDescendantsForClass(engine)
											  .getAllMatches(null, uiClass)
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
										
					System.out.println("Updating role: " + JRole.uuid)
					
					updateUIReferenceComponentType(JRole, referenceComponentType, oppositeReferenceType)
									
				].action(CRUDActivationStateEnum.DELETED) [
										
					System.out.println("Deleting role: " + JRole.uuid)
														
					referenceComponentType.ownerClass.remove(UIClass_Attributes, referenceComponentType)
					psm2ui.remove(PSMToUI_Traces, trace)
					
				].addLifeCycle(Lifecycles.getDefault(true, true)).build
		}
		return modifyRoleRule
	}
	
	public def getRoleViewFieldRule() {
		if (roleViewFieldRule === null) {
			roleViewFieldRule = createRule.name("RoleViewFieldRule").precondition(JRoleViewFieldQuery.Matcher.querySpecification())
				.action(CRUDActivationStateEnum.UPDATED) [
					
					System.out.println("Updating viewField for role: " + JRole.uuid)
							
					if (uiView instanceof UIListView) {
						viewField.uuid = referenceComponentType.uuid + "_viewField_listView"
						viewField.name = referenceComponentType.name
						if (JRole.ownerClass.attributesForListing.size() > 0) {
							viewField.show = false;
						}
					} else if (uiView instanceof UIClassView) {
						viewFieldSet.name = referenceComponentType.name;
						viewFieldSet.uuid = uiView.uuid + "_viewfieldset_" + referenceComponentType.name
						
						viewField.name = referenceComponentType.name;
						viewField.uuid = referenceComponentType.uuid + "_viewField_classView"
					}
									
				].action(CRUDActivationStateEnum.DELETED) [
					
					System.out.println("Deleting viewField for role: " + JRole.uuid)
					
					if (uiView instanceof UIListView) {
						viewFieldSet.remove(UIViewFieldSet_ViewFields, viewField)	
						
					} else if (uiView instanceof UIClassView) {
						uiView.remove(UIView_ViewFieldSets, viewFieldSet)
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
			viewField.uuid = uiReferenceType.uuid + "_viewField_listView"
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
			viewField.uuid = uiReferenceType.uuid + "_viewField_classView"
			viewField.componentType = uiReferenceType;
			viewField.searchable = false
		}
	}
	
	
}