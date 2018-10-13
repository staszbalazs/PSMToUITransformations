@abstract
rule Identifiable
 match viatraIdentifiable : VIATRA!Identifiable
 with epsilonIdentifiable : EPSILON!Identifiable {
	
 compare : viatraIdentifiable.uuid = epsilonIdentifiable.uuid and
 	viatraIdentifiable.name = epsilonIdentifiable.name
}

rule UIBase
 match viatraUIBase : VIATRA!UIBase
 with epsilonUIBase : EPSILON!UIBase 
 extends Identifiable {
 
 compare : viatraUIBase.info.matches(epsilonUIBase.info) and
 	viatraUIBase.mainMenu.matches(epsilonUIBase.mainMenu) and
 	viatraUIBase.modules.asSet().matches(epsilonUIBase.modules.asSet())
}
 
rule UIInfo
 match viatraUIInfo : VIATRA!UIInfo
 with epsilonUIInfo : EPSILON!UIInfo
 extends Identifiable {
 
 compare : viatraUIInfo.userClass.matches(epsilonUIInfo.userClass) and
 	viatraUIInfo.versions = epsilonUIInfo.versions and
 	viatraUIInfo.submodels = epsilonUIInfo.submodels
}

rule UIMenuItem
 match viatraUIMenuItem : VIATRA!UIMenuItem
 with epsilonUIMenuItem : EPSILON!UIMenuItem
 extends Identifiable {
 
 compare : viatraUIMenuItem.filters.asSet().matches(epsilonUIMenuItem.filters.asSet()) and
 	viatraUIMenuItem.menuItems.asSet().matches(epsilonUIMenuItem.menuItems.asSet()) and
 	viatraUIMenuItem.menuView.matches(epsilonUIMenuItem.menuView) and
 	viatraUIMenuItem.ownerMenuItem.matches(epsilonUIMenuItem.ownerMenuItem)
}

rule UIFilter
 match viatraUIFilter : VIATRA!UIFilter
 with epsilonUIFilter : EPSILON!UIFilter
 extends Identifiable {
 
 compare : viatraUIFilter.attribute = epsilonUIFilter.attribute and
 	viatraUIFilter.operator = epsilonUIFilter.operator and
 	viatraUIFilter.value = epsilonUIFilter.value and
 	viatraUIFilter.fixed = epsilonUIFilter.fixed
}

rule UIModule
 match viatraUIModule : VIATRA!UIModule
 with epsilonUIModule : EPSILON!UIModule
 extends Identifiable {
 
 compare : viatraUIModule.fullyQualifiedName = epsilonUIModule.fullyQualifiedName and
 	viatraUIModule.version = epsilonUIModule.version and
 	viatraUIModule.classes.asSet().matches(epsilonUIModule.classes.asSet())
}

rule UIClass
 match viatraUIClass : VIATRA!UIClass
 with epsilonUIClass : EPSILON!UIClass
 extends Identifiable {
 
 compare : viatraUIClass.`abstract` = epsilonUIClass.`abstract` and
 	 viatraUIClass.readonly = epsilonUIClass.readonly and
 	 viatraUIClass.enumClass = epsilonUIClass.enumClass and
 	 viatraUIClass.singleton = epsilonUIClass.singleton and
 	 viatraUIClass.super.matches(epsilonUIClass.super) and
 	 viatraUIClass.attributes.asSet().matches(epsilonUIClass.attributes.asSet()) and
 	 viatraUIClass.inheritedAttributes.asSet().matches(epsilonUIClass.inheritedAttributes.asSet()) and
 	 viatraUIClass.actions.asSet().matches(epsilonUIClass.actions.asSet()) and
 	 viatraUIClass.inheritedActions.asSet().matches(epsilonUIClass.inheritedActions.asSet()) and
 	 viatraUIClass.childClassViews.asSet().matches(epsilonUIClass.childClassViews.asSet()) and
 	 viatraUIClass.listView.matches(epsilonUIClass.listView) and
 	 viatraUIClass.classView.matches(epsilonUIClass.classView) and
 	 viatraUIClass.representation.matches(epsilonUIClass.representation)
}

@abstract
rule UIView
 match viatraUIView : VIATRA!UIView
 with epsilonUIView : EPSILON!UIView
 extends Identifiable {
 
 compare : viatraUIView.pageSize = epsilonUIView.pageSize and
 	viatraUIView.columns = epsilonUIView.columns and
 	viatraUIView.viewFieldSets.asSet().matches(epsilonUIView.viewFieldSets.asSet())
}

rule UIListView
 match viatraUIListView : VIATRA!UIListView
 with epsilonUIListView : EPSILON!UIListView
 extends UIView {
 
 compare : viatraUIListView.detailView.matches(epsilonUIListView.detailView)
}

rule UIClassView
 match viatraUIClassView : VIATRA!UIClassView
 with epsilonUIClassView : EPSILON!UIClassView
 extends UIView {}

rule UIParamView
 match viatraUIParamView : VIATRA!UIParamView
 with epsilonUIParamView : EPSILON!UIParamView
 extends UIView {}
 
rule UIResultView
 match viatraUIResultView : VIATRA!UIResultView
 with epsilonUIResultView : EPSILON!UIResultView
 extends UIView {}
 
rule UIAction
 match viatraUIAction : VIATRA!UIAction
 with epsilonUIAction : EPSILON!UIAction
 extends Identifiable {
 
 compare : viatraUIAction.inherited = epsilonUIAction.inherited and
 	viatraUIAction.classBased = epsilonUIAction.inherited and
 	viatraUIAction.toBeConfirmed = epsilonUIAction.toBeConfirmed and
 	viatraUIAction.notBulk = epsilonUIAction.notBulk and
 	viatraUIAction.isQuery = epsilonUIAction.isQuery and
 	viatraUIAction.parameters.asSet().matches(epsilonUIAction.parameters.asSet()) and
 	viatraUIAction.result.matches(epsilonUIAction.result) and
 	viatraUIAction.paramView.matches(epsilonUIAction.paramView) and
 	viatraUIAction.resultView.matches(epsilonUIAction.resultView)
}

rule UIViewFieldSet
 match viatraUIViewFieldSet : VIATRA!UIViewFieldSet
 with epsilonUIViewFieldSet : EPSILON!UIViewFieldSet
 extends Identifiable {
 
 compare : viatraUIViewFieldSet.position = epsilonUIViewFieldSet.position and
 	viatraUIViewFieldSet.viewFields.asSet().matches(epsilonUIViewFieldSet.viewFields.asSet())
}

rule UIViewField
 match viatraUIViewField : VIATRA!UIViewField
 with epsilonUIViewField : EPSILON!UIViewField
 extends Identifiable {
 
 compare : viatraUIViewField.position = epsilonUIViewField.position and
 	viatraUIViewField.searchable = epsilonUIViewField.searchable and
 	viatraUIViewField.order = epsilonUIViewField.order and
 	viatraUIViewField.show = epsilonUIViewField.show and
 	viatraUIViewField.componentType.matches(epsilonUIViewField.componentType)
}

rule UIInterval
 match viatraUIInterval : VIATRA!UIInterval
 with epsilonUIInterval : EPSILON!UIInterval
 extends Identifiable {
 
 compare : viatraUIInterval.min = epsilonUIInterval.min and
 	viatraUIInterval.max = epsilonUIInterval.max and
 	viatraUIInterval.step = epsilonUIInterval.step
}

@abstract
rule UIComponentType
 match viatraUIComponentType : VIATRA!UIComponentType
 with epsilonUIComponentType : EPSILON!UIComponentType
 extends Identifiable {
 
 compare : viatraUIComponentType.value = epsilonUIComponentType.value and
 	viatraUIComponentType.lower = epsilonUIComponentType.lower and
 	viatraUIComponentType.upper = epsilonUIComponentType.upper and
 	viatraUIComponentType.type = epsilonUIComponentType.type and
 	viatraUIComponentType.interval = epsilonUIComponentType.interval
}

@abstract
rule UIAttributeComponentType
 match viatraUIAttributeComponentType : VIATRA!UIAttributeComponentType
 with epsilonUIAttributeComponentType : EPSILON!UIAttributeComponentType
 extends UIComponentType {
 
 compare : viatraUIAttributeComponentType.derived = epsilonUIAttributeComponentType.derived and
 	viatraUIAttributeComponentType.private = epsilonUIAttributeComponentType.private and
 	viatraUIAttributeComponentType.readonly = epsilonUIAttributeComponentType.readonly and
 	viatraUIAttributeComponentType.disableOnCreate = epsilonUIAttributeComponentType.disableOnCreate
}

rule UIBaseComponentType
 match viatraUIBaseComponentType : VIATRA!UIBaseComponentType
 with epsilonUIBaseComponentType : EPSILON!UIBaseComponentType
 extends UIAttributeComponentType {
 
 compare : viatraUIBaseComponentType.regexp = epsilonUIBaseComponentType.regexp and
 	viatraUIBaseComponentType.decimals = epsilonUIBaseComponentType.decimals and
 	viatraUIBaseComponentType.placeholder = epsilonUIBaseComponentType.placeholder and
 	viatraUIBaseComponentType.representation = epsilonUIBaseComponentType.representation
}

rule UIReferenceComponentType
 match viatraUIReferenceComponentType : VIATRA!UIReferenceComponentType
 with epsilonUIReferenceComponentType : EPSILON!UIReferenceComponentType
 extends UIAttributeComponentType {
 
 compare : viatraUIReferenceComponentType.navigable = epsilonUIReferenceComponentType.navigable and
 	viatraUIReferenceComponentType.kind = epsilonUIReferenceComponentType.kind and
 	viatraUIReferenceComponentType.opposite.matches(epsilonUIReferenceComponentType.opposite) and
 	viatraUIReferenceComponentType.referenced.matches(epsilonUIReferenceComponentType.referenced)
}

rule UIParameterComponentType
 match viatraUIParameterComponentType : VIATRA!UIParameterComponentType
 with epsilonUIParameterComponentType : EPSILON!UIParameterComponentType
 extends UIComponentType {
 
 compare : viatraUIParameterComponentType.referenced.matches(epsilonUIParameterComponentType.referenced)
}