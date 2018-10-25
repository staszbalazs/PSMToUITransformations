package transformations

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.SimpleModelManipulations
import org.eclipse.viatra.transformation.runtime.emf.rules.eventdriven.EventDrivenTransformationRuleFactory
import traceability.PSMToUI
import traceability.TraceabilityPackage
import ui.UiPackage
import org.eclipse.viatra.transformation.runtime.emf.rules.eventdriven.EventDrivenTransformationRule
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher
import org.eclipse.viatra.transformation.evm.specific.crud.CRUDActivationStateEnum
import org.eclipse.viatra.transformation.evm.specific.Lifecycles
import queries.JAttributeGroupQuery
import ui.UIViewFieldSet
import queries.JAttributeGroupQueryForModify

class AttributeGroupRuleFactory {
	
	extension IModelManipulations manipulation
	extension EventDrivenTransformationRuleFactory factory = new EventDrivenTransformationRuleFactory
	extension ViatraQueryEngine engine
	
	extension UiPackage uiPackage = UiPackage::eINSTANCE
	extension TraceabilityPackage trPackage = TraceabilityPackage::eINSTANCE
	
	extension PSMToUI psm2ui
	
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> attributeGroupRule
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> modifyAttributeGroupRule
	
	new(PSMToUI psm2ui, ViatraQueryEngine engine) {
		this.manipulation = new SimpleModelManipulations(engine);
		this.engine = engine;
		this.psm2ui = psm2ui;
	}
	
	public def getAttributeGroupRule() {
		if (attributeGroupRule === null) {
			attributeGroupRule = createRule.name("AttributeGroupRule").precondition(JAttributeGroupQuery.Matcher.querySpecification())
				.action(CRUDActivationStateEnum.CREATED) [
					
					System.out.println("Transforming attribute: " + JAttributeGroup.uuid)
					
					var String vfsName;
					if (JAttributeGroup.attributes.get(0).name.startsWith("-")) {
						vfsName = JAttributeGroup.attributes.get(0).name.substring(1)
					} else {
						vfsName = JAttributeGroup.attributes.get(0).name
					}
				
					val UIViewFieldSet viewFieldSet = classView.createChild(UIView_ViewFieldSets, UIViewFieldSet) as UIViewFieldSet
					viewFieldSet.name = vfsName;
					viewFieldSet.uuid = classView.uuid + "_viewfieldset_" + vfsName + "_Group"
					viewFieldSet.position = JAttributeGroup.position;
						
					val trace = psm2ui.createChild(PSMToUI_Traces, PSMToUITrace)
					trace.addTo(PSMToUITrace_PsmElements, JAttributeGroup)
					trace.addTo(PSMToUITrace_UiElements, viewFieldSet)
									
				].addLifeCycle(Lifecycles.getDefault(false, false)).build
		}
		return attributeGroupRule
	}
	
	public def getModifyAttributeGroupRule() {
		if (modifyAttributeGroupRule === null) {
			modifyAttributeGroupRule = createRule.name("ModifyAttributeGroupRule").precondition(JAttributeGroupQueryForModify.Matcher.querySpecification())
				.action(CRUDActivationStateEnum.UPDATED) [
					
					System.out.println("Updating attribute: " + JAttributeGroup.uuid)
					
					var String vfsName;
					if (JAttributeGroup.attributes.get(0).name.startsWith("-")) {
						vfsName = JAttributeGroup.attributes.get(0).name.substring(1)
					} else {
						vfsName = JAttributeGroup.attributes.get(0).name
					}
					viewFieldSet.name = vfsName;
					viewFieldSet.uuid = classView.uuid + "_viewfieldset_" + vfsName + "_Group"
					viewFieldSet.position = JAttributeGroup.position;
										
				].action(CRUDActivationStateEnum.DELETED) [
					
					System.out.println("Deleting attribute: " + JAttributeGroup.uuid)
					
					classView.remove(UIView_ViewFieldSets, viewFieldSet)
					psm2ui.remove(PSMToUI_Traces, trace)
					
				].addLifeCycle(Lifecycles.getDefault(true, true)).build
		}
		return modifyAttributeGroupRule
	}
	
}