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
import psm.JUIAttributeGroup
import queries.PatternProvider
import traceability.PSMToUI
import traceability.TraceabilityPackage
import ui.UIClass
import ui.UIClassView
import ui.UIViewFieldSet
import ui.UiPackage
import queries.JAttributeQuery

class AttributeRuleFactory {
	
	extension IModelManipulations manipulation
	extension EventDrivenTransformationRuleFactory factory = new EventDrivenTransformationRuleFactory
	extension ViatraQueryEngine engine
	
	extension UiPackage uiPackage = UiPackage::eINSTANCE
	extension TraceabilityPackage trPackage = TraceabilityPackage::eINSTANCE
	
	extension PSMToUI psm2ui
	
	extension ComponentType componentType
	
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> attributeRule
	
	new(PSMToUI psm2ui, ViatraQueryEngine engine) {
		this.manipulation = new SimpleModelManipulations(engine);
		this.componentType = new ComponentType(engine)
		this.engine = engine;
		this.psm2ui = psm2ui;
	}
	
	public def getAttributeRule() {
		if (attributeRule === null) {
			attributeRule = createRule.name("AttributeRule").precondition(JAttributeQuery.Matcher.querySpecification())
				.action(CRUDActivationStateEnum.CREATED) [
					
					val JAttribute jAttr = it.JAttribute as JAttribute
					
					System.out.println("Transforming attribute: " + jAttr.uuid)
					
					//Get owner UIClass
					val uiClass = PatternProvider.instance().getPsmToUiTrace(engine)
												.getOneArbitraryMatch(jAttr.ownerClass, null)
												.get()
												.getIdentifiable as UIClass
															
					//Create role for owner
					val uiBaseType = createUIBaseType(uiClass, jAttr, engine)
					psm2ui.createChild(PSMToUI_Traces, PSMToUITrace) => [
						addTo(PSMToUITrace_PsmElements, jAttr)
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
					
					//create viewFields for attribute			
					val groups = PatternProvider.instance().getAttributeGroupQuery(engine)
												.getAllMatches(null, null, jAttr)
					
					for (group : groups) {
						val attrGroup = group.getGroup() as JUIAttributeGroup
						
						val potentialViewFieldSet = PatternProvider.instance().getPsmToUiTrace(engine)
															.getOneArbitraryMatch(attrGroup, null)
						
						if (potentialViewFieldSet.isPresent()) {
							val viewFieldSet = potentialViewFieldSet.get().getIdentifiable() as UIViewFieldSet
							
						} else {
							val UIClassView classView = PatternProvider.instance().getClassViewForUIClass(engine)
												.getOneArbitraryMatch(uiClass, null)
												.get()
												.getView() as UIClassView
							
							classView.createChild(getUIView_ViewFieldSets, UIViewFieldSet) as UIViewFieldSet
						}
											
					}
									
				].action(CRUDActivationStateEnum.UPDATED) [
				].action(CRUDActivationStateEnum.DELETED) [
				].addLifeCycle(Lifecycles.getDefault(true, true)).build
		}
		return attributeRule
	}
	
}