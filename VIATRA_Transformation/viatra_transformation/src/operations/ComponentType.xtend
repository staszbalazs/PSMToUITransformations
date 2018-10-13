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
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.SimpleModelManipulations

class ComponentType {

	extension IModelManipulations manipulation
	extension ViatraQueryEngine engine
	
	extension UiPackage uiPackage = UiPackage::eINSTANCE
	extension TraceabilityPackage trPackage = TraceabilityPackage::eINSTANCE
	
	extension PSMToUI psm2ui
	
	extension Interval interval
	
	new(PSMToUI psm2ui, ViatraQueryEngine engine) {
		this.engine = engine
		this.psm2ui = psm2ui
		manipulation = new SimpleModelManipulations(engine)
		interval = new Interval(engine)
	}

	public def createUIBaseType(UIClass owner, JAttribute jAttr, UIBaseComponentType uiType) {
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
		uiBaseType.type = uiType.name
		
		//create intervals
		createIntervals(uiBaseType, uiBaseType.ownerClass.uuid)
		
		return uiBaseType
	}
	
	public def modifyUIBaseType(UIBaseComponentType uiBaseType, UIClass owner, JAttribute jAttr, UIBaseComponentType uiType) {
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
		uiBaseType.type = uiType.name
		
		//create intervals
		uiBaseType.intervals.clear
		createIntervals(uiBaseType, uiBaseType.ownerClass.uuid)
	}
	
	public def createUIReferenceComponentType(UIClass owner, JRole jRole, JRole oppositeRole) {
		//create UIReferenceType
		var UIReferenceComponentType uiReferenceType = null
		val match = PatternProvider.instance().getPsmToUiTrace(engine)
											.getOneArbitraryMatch(jRole, null)
										
			
		if (match.isPresent) {
			uiReferenceType = match.get().getIdentifiable as UIReferenceComponentType
			uiReferenceType.moveTo(owner, getUIClass_Attributes)
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
									.getOneArbitraryMatch(oppositeRole, null)
									
		if (potentialOpposite.isPresent) {
			val opposite = potentialOpposite
								.get()
								.getIdentifiable as UIReferenceComponentType
			uiReferenceType.opposite = opposite
			uiReferenceType.referenced = opposite.ownerClass
			uiReferenceType.type = opposite.ownerClass.name
		} else {
			val UIReferenceComponentType opposite = psm2ui.uiBase.eResource.create(UIReferenceComponentType) as UIReferenceComponentType
			
			val trace = psm2ui.createChild(PSMToUI_Traces, PSMToUITrace)
			trace.addTo(PSMToUITrace_PsmElements, oppositeRole)
			trace.addTo(PSMToUITrace_UiElements, opposite)
			
			uiReferenceType.opposite = opposite
			
			val UIClass referenced = PatternProvider.instance().getPsmToUiTrace(engine)
												.getOneArbitraryMatch(oppositeRole.ownerClass, null)
												.get()
												.getIdentifiable as UIClass
														
		    uiReferenceType.referenced = referenced
		    uiReferenceType.type = referenced.name										
		}
		
		//create intervals
		createIntervals(uiReferenceType, uiReferenceType.ownerClass.uuid)
		
		return uiReferenceType
	}
	
	public def updateUIReferenceComponentType(JRole jRole, UIReferenceComponentType uiReferenceType, UIReferenceComponentType opposite) {
		uiReferenceType.name = jRole.name
		uiReferenceType.uuid = uiReferenceType.ownerClass.uuid + "." + jRole.uuid
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
		uiReferenceType.type = opposite.ownerClass.name
		
		uiReferenceType.intervals.clear			
		createIntervals(uiReferenceType, uiReferenceType.ownerClass.uuid)
	}

	
}