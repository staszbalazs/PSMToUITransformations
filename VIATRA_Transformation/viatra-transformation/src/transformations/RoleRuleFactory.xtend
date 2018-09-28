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
import queries.PatternProvider
import traceability.PSMToUI
import traceability.TraceabilityPackage
import ui.UIClass
import ui.UIReferenceComponentType
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
					
					val JRole jRole = it.JRole as JRole
					
					System.out.println("Transforming role: " + jRole.uuid)
												
					val UIClass owner = it.getUiClass as UIClass
					val JRole opposite = it.getOpposite as JRole
															
					//Create role for owner
					var uiReferenceType = createUIReferenceComponentType(owner, jRole, opposite)
					val trace = psm2ui.createChild(PSMToUI_Traces, PSMToUITrace)
					trace.addTo(PSMToUITrace_PsmElements, jRole)
					trace.addTo(PSMToUITrace_UiElements, uiReferenceType)
					
					//Get descendant UIClasses
					val ownersByInheritance = PatternProvider.instance().getFindDescendantsForClass(engine)
											  .getAllMatches(null, owner)
											  .stream()
											  .map[getDescendant as UIClass]
											  .collect(Collectors.toList)
					
					//Add attribute to each of them
					for (UIClass class : ownersByInheritance) {
						class.inheritedAttributes.add(uiReferenceType)
					}
				].addLifeCycle(Lifecycles.getDefault(false, false)).build
		}
		return roleRule
	}
	
	
	public def getModifyRoleRule() {
		if (modifyRoleRule === null) {
			modifyRoleRule = createRule.name("ModifyRoleRule").precondition(JRoleQueryForModify.Matcher.querySpecification())
				.action(CRUDActivationStateEnum.UPDATED) [
					
					val JRole jRole = it.JRole as JRole
					
					System.out.println("Updating role: " + jRole.uuid)
					
					val UIReferenceComponentType uiReferenceType = it.referenceComponentType as UIReferenceComponentType
					val UIReferenceComponentType opposite = it.oppositeReferenceType as UIReferenceComponentType
					
					updateUIReferenceComponentType(jRole, uiReferenceType, opposite)
									
				].action(CRUDActivationStateEnum.DELETED) [
					
					val JRole jRole = it.JRole as JRole
					
					System.out.println("Deleting role: " + jRole.uuid)
					
					val UIReferenceComponentType uiReferenceType = it.referenceComponentType as UIReferenceComponentType
					
					uiReferenceType.ownerClass.remove(UIClass_Attributes, uiReferenceType)
					psm2ui.remove(PSMToUI_Traces, it.trace)
					
				].addLifeCycle(Lifecycles.getDefault(true, true)).build
		}
		return modifyRoleRule
	}
	
}