package operations

import ui.UIClass
import psm.JClass
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations
import ui.UiPackage
import ui.UIClassView
import ui.UIAttributeComponentType
import java.util.Set
import java.util.HashSet
import psm.JUIAttributeGroup
import ui.UIViewFieldSet
import psm.JAttribute
import ui.UIViewField
import queries.PatternProvider
import ui.UIBaseComponentType
import ui.UIReferenceComponentType
import ui.UIListView
import psm.JUIAlias

class Views {
	
	extension IModelManipulations manipulation
	
	extension UiPackage uiPackage = UiPackage::eINSTANCE
	
	public def createClassView(UIClass uiClass, JClass jClass, Boolean isDefault, ViatraQueryEngine engine) {
		val UIClassView classView = uiClass.createChild(UIClass_ClassView, UIClassView) as UIClassView
		classView.uuid = uiClass.uuid.replace("\\.", "_") + "_oview_default"
		classView.name = uiClass.name
				
		var position = 1;
		var Set<UIAttributeComponentType> remaining = uiClass.attributes as HashSet<UIAttributeComponentType>;
		var String vfsName
		
		for (JUIAttributeGroup attrGroup : jClass.attributeOrder) {
			if (attrGroup.attributes.get(0).name.startsWith("-")) {
				vfsName = attrGroup.attributes.get(0).name.substring(1)
				attrGroup.attributes.remove(attrGroup.attributes.get(0))
			} else {
				vfsName = attrGroup.attributes.get(0).name
			}
				
			val UIViewFieldSet viewFieldSet = classView.createChild(UIView_ViewFieldSets, UIViewFieldSet) as UIViewFieldSet
			viewFieldSet.name = vfsName;
			viewFieldSet.uuid = classView.uuid + "_viewfieldset_" + vfsName + "_Group"
			viewFieldSet.position = position++;
				
			var viewFieldPosition = 1;
			for (JAttribute attribute : attrGroup.attributes) {
				val UIViewField viewField = viewFieldSet.createChild(UIViewFieldSet_ViewFields, UIViewField) as UIViewField
				
				val match = PatternProvider.instance().getPsmToUiTrace(engine)
								.getOneArbitraryMatch(attribute, null)
								.get()
				val UIBaseComponentType uiBaseType = match.getIdentifiable as UIBaseComponentType
					
				viewField.componentType = uiBaseType;
				viewField.name = attribute.name;
				viewField.uuid = classView.uuid + "." + viewField.componentType.name + "_viewField_classView"
				viewField.searchable = !attribute.uiNoSearch;
				viewField.position = viewFieldPosition;
				viewFieldPosition++;
					
				remaining.remove(uiBaseType);
			}
		}
		
		for (UIAttributeComponentType attribute : remaining) {
			if (((attribute instanceof UIReferenceComponentType) && (attribute as UIReferenceComponentType).navigable && !attribute.private) 
						|| ((attribute instanceof UIBaseComponentType) && !attribute.private)) {
														
				val UIViewFieldSet viewFieldSet = classView.createChild(UIView_ViewFieldSets, UIViewFieldSet) as UIViewFieldSet
				viewFieldSet.name = attribute.name;
				viewFieldSet.uuid = classView.uuid + "_viewfieldset_" + attribute.name
				viewFieldSet.position = position++;
				
				val UIViewField viewField = viewFieldSet.createChild(UIViewFieldSet_ViewFields, UIViewField) as UIViewField
				viewField.name = attribute.name;
				viewField.uuid = attribute.uuid + "_viewField_classView"
				
				viewField.componentType = attribute;
				
				val JAttribute jAttr = jClass.attributes.stream
								 .filter[getUuid == attribute.uuid]
								 .findFirst
								 .get
				
				viewField.searchable = !jAttr.uiNoSearch
			}
		}
	
		return classView;
	}
	
	
	public def createListView(UIClass uiClass, JClass jClass, UIClassView classView, Boolean isDefault, ViatraQueryEngine engine) {
		val UIListView listView = uiClass.createChild(UIClass_ListView, UIListView) as UIListView
		listView.uuid = uiClass.uuid.replace("\\.", "_") + "_lview_default"
		listView.name = uiClass.name;
		
		listView.pageSize = 20;
		listView.detailView = classView;
		
		var UIViewFieldSet viewFieldSet =	listView.createChild(UIView_ViewFieldSets, UIViewFieldSet) as UIViewFieldSet
		viewFieldSet.name = listView.name;
		viewFieldSet.uuid = listView.uuid + "_viewfieldset_" + listView.name;
		
		var position = jClass.attributesForListing.size();
		
		for (UIAttributeComponentType attribute : uiClass.attributes) {
			if (((attribute instanceof UIReferenceComponentType) && attribute.upper == 1 && (attribute as UIReferenceComponentType).navigable && !attribute.private) 
						|| ((attribute instanceof UIBaseComponentType) && !attribute.private)) {
					
				val UIViewField viewField = viewFieldSet.createChild(UIViewFieldSet_ViewFields, UIViewField) as UIViewField
				viewField.uuid = attribute.uuid + "_viewField_listView"
				viewField.name = attribute.name
				viewField.componentType = attribute;
				
				val JAttribute jAttr = jClass.attributes.stream
							 .filter[getUuid == attribute.uuid]
							 .findFirst
							 .get as JAttribute
					
				viewField.searchable = !jAttr.uiNoSearch;
				
				if (jClass.attributesForListing.contains(jAttr)) {
					viewField.position = jClass.attributesForListing.indexOf(jAttr) + 1;
				} else {
					if (jClass.attributesForListing.size() > 0) {
						viewField.show = false;
					}
					position++
					viewField.position = position;
				}
			}
		}
		
		return listView;
	}
	
	
}