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
import psm.JRole
import queries.PatternProvider
import traceability.PSMToUI
import traceability.TraceabilityPackage
import ui.UIClass

class RoleRuleFactory {
	
	extension IModelManipulations manipulation
	extension EventDrivenTransformationRuleFactory factory = new EventDrivenTransformationRuleFactory
	
	extension TraceabilityPackage trPackage = TraceabilityPackage::eINSTANCE
	
	extension ComponentType componentType
	
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> roleRule
	
	public def getRoleRule(PSMToUI psm2ui, ViatraQueryEngine engine) {
		if (roleRule === null) {
			roleRule = createRule.name("RoleRule").precondition(PatternProvider.instance().getJRoleQuery())
				.action(CRUDActivationStateEnum.CREATED) [
					
					val JRole jRole = it.JRole as JRole
					
					//Get owner UIClass
					val potentialOwner = psm2ui.traces.stream()
										.filter[getPsmElements.contains(jRole.getOwnerClass)]
										.map[getUiElements()]
										.findFirst()
										
					val UIClass owner = potentialOwner.get.get(0) as UIClass
					
					//Create role for owner
					var uiReferenceType = createUIReferenceComponentType(owner, jRole, engine, psm2ui)
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
				].action(CRUDActivationStateEnum.UPDATED) [
				].action(CRUDActivationStateEnum.DELETED) [
				].addLifeCycle(Lifecycles.getDefault(true, true)).build
		}
		return roleRule
	}
	
}