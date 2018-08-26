package operations

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations
import psm.JAttribute
import psm.JPrimitive
import psm.JRole
import psm.JVisibility
import queries.PatternProvider
import ui.UIBaseComponentType
import ui.UIClass
import ui.UIReferenceComponentType
import ui.UiPackage
import traceability.PSMToUI
import traceability.TraceabilityPackage

class ComponentType {

	extension IModelManipulations manipulation
	
	extension UiPackage uiPackage = UiPackage::eINSTANCE
	extension TraceabilityPackage trPackage = TraceabilityPackage::eINSTANCE
	
	extension Interval interval

	public def createUIBaseType(UIClass owner, JAttribute jAttr, Boolean inherited, ViatraQueryEngine engine) {
		//create UIBaseComponentType
		val UIBaseComponentType uiBaseType = owner.createChild(getUIClass_Attributes, UIBaseComponentType) as UIBaseComponentType
		
		//set attributes
		uiBaseType.name = jAttr.name
		uiBaseType.uuid = owner.uuid + "." + jAttr.uuid
		if (jAttr.visibility == JVisibility::PROTECTED) {
			uiBaseType.readonly = true
		} else if (jAttr.visibility == JVisibility::PRIVATE) {
			uiBaseType.private = true
		}
					
		if (jAttr.isDerived || jAttr.calculated || jAttr.visibility == JVisibility::PROTECTED) {
			uiBaseType.value = ""
		} else {
			uiBaseType.value = jAttr.value
		}
		uiBaseType.derived = jAttr.derived
		uiBaseType.lower = jAttr.lower
		uiBaseType.upper = jAttr.upper
		uiBaseType.regexp = jAttr.regexp
		uiBaseType.decimals = jAttr.decimals
		uiBaseType.placeholder = jAttr.placeholder
		uiBaseType.interval = jAttr.interval
		
		//set type
		val JPrimitive jPrimitive = jAttr.type as JPrimitive
		val UIBaseComponentType componentType = PatternProvider.instance().getFindCorrespondingType(engine)
													.getOneArbitraryMatch(jPrimitive, null)
													.get()
													.getComponentType() as UIBaseComponentType
													
		uiBaseType.type = componentType.name
		
		//create intervals
		createIntervals(uiBaseType)
		
		return uiBaseType
	}
	
	public def createUIReferenceComponentType(UIClass owner, JRole jRole, Boolean inherited, ViatraQueryEngine engine, PSMToUI psm2ui) {
		//create UIReferenceType
		var UIReferenceComponentType uiReferenceType = null
		if (!inherited) {
			val match = PatternProvider.instance().getPsmToUiTrace(engine)
												.getOneArbitraryMatch(jRole, null)
												.get()
			
			if (match !== null) {
				uiReferenceType = match.getIdentifiable as UIReferenceComponentType
				owner.addTo(getUIClass_Attributes, uiReferenceType)
			}
		}
		
		if (uiReferenceType === null) {
			uiReferenceType = owner.createChild(getUIClass_Attributes, UIReferenceComponentType) as UIReferenceComponentType	
		}
		
		
		//set attributes
		uiReferenceType.name = jRole.name
		uiReferenceType.uuid = owner.uuid + "." + jRole.uuid
		if (jRole.visibility == JVisibility::PROTECTED) {
			uiReferenceType.readonly = true
		} else if (jRole.visibility == JVisibility::PRIVATE) {
			uiReferenceType.private = true
		}
					
		if (jRole.ownerRelationship.isDerived || jRole.calculated || jRole.visibility == JVisibility::PROTECTED) {
			uiReferenceType.value = ""
		} else {
			uiReferenceType.value = jRole.value
		}
		uiReferenceType.derived = jRole.ownerRelationship.derived
		uiReferenceType.lower = jRole.lower
		uiReferenceType.upper = jRole.upper
		uiReferenceType.navigable = jRole.navigable
		uiReferenceType.kind = jRole.kind.getName().toLowerCase()
		uiReferenceType.interval = jRole.interval
		
		//set opposite and type
		val potentialOpposite = PatternProvider.instance().getPsmToUiTrace(engine)
									.getOneArbitraryMatch(jRole.opposite(), null)
									.get()
									
		if (potentialOpposite !== null) {
			val opposite = potentialOpposite.getIdentifiable as UIReferenceComponentType
			uiReferenceType.opposite = opposite
			uiReferenceType.referenced = opposite.ownerClass
			uiReferenceType.type = opposite.ownerClass.name
		} else {
			val UIReferenceComponentType opposite = psm2ui.uiBase.eResource.create(UIReferenceComponentType) as UIReferenceComponentType
			
			val trace = psm2ui.createChild(PSMToUI_Traces, PSMToUITrace)
			trace.addTo(PSMToUITrace_PsmElements, jRole.opposite())
			trace.addTo(PSMToUITrace_UiElements, UIReferenceComponentType)
			
			uiReferenceType.opposite = opposite
			
			val UIClass referenced = PatternProvider.instance().getPsmToUiTrace(engine)
												.getOneArbitraryMatch(jRole.opposite().ownerClass, null)
												.get()
												.getIdentifiable as UIClass
														
		    uiReferenceType.referenced = referenced
		    uiReferenceType.type = referenced.name										
		}
		
		//create intervals
		createIntervals(uiReferenceType)
		
		return uiReferenceType
	}
	
	public def opposite(JRole jRole) {
		val JRole firstRole =  jRole.ownerRelationship.roles.get(0);
		val JRole secondRole = jRole.ownerRelationship.roles.get(1);
		
		if (jRole == firstRole) {
			return secondRole
		} else {
			return firstRole
		}
	}
	
}