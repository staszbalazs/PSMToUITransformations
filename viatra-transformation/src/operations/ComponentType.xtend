package operations

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations
import psm.JAttribute
import psm.JPrimitive
import psm.JVisibility
import queries.PatternProvider
import ui.UIBaseComponentType
import ui.UIClass
import ui.UiPackage
import psm.JRole
import ui.UIReferenceComponentType

class ComponentType {

	extension IModelManipulations manipulation
	
	extension UiPackage uiPackage = UiPackage::eINSTANCE
	
	extension Interval interval

	public def createUIBaseType(UIClass owner, JAttribute jAttr, Boolean inherited, ViatraQueryEngine engine) {
		val UIBaseComponentType uiBaseType = owner.createChild(getUIClass_Attributes, UIBaseComponentType) as UIBaseComponentType
		uiBaseType.name = jAttr.name
		uiBaseType.uuid = owner.uuid + "." + jAttr.uuid
		uiBaseType.inherited = inherited
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
		
		val JPrimitive jPrimitive = jAttr.type as JPrimitive
		val UIBaseComponentType componentType = PatternProvider.instance().getFindCorrespondingType(engine)
													.getOneArbitraryMatch(jPrimitive, null)
													.get()
													.getComponentType() as UIBaseComponentType
													
		uiBaseType.type = componentType.name
		
		createIntervals(uiBaseType)
		
		return uiBaseType
	}
	
	public def createUIReferenceComponentType(UIClass owner, JRole jRole, Boolean inherited) {
		val UIReferenceComponentType uiReferenceType = owner.createChild(getUIClass_Attributes, UIReferenceComponentType) as UIReferenceComponentType
		uiReferenceType.name = jRole.name
		uiReferenceType.uuid = owner.uuid + "." + jRole.uuid
		uiReferenceType.inherited = inherited
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