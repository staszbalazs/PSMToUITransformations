@abstract
rule Identifiable
 match viatraIdentifiable : VIATRA!Identifiable
 with epsilonIdentifiable : EPSILON!Identifiable {
	
 compare : viatraIdentifiable.uuid = epsilonIdentifiable.uuid and
 	viatraIdentifiable.name = epsilonIdentifiable.name
}

@lazy
rule UIBase
 match viatraUIBase : VIATRA!UIBase
 with epsilonUIBase : EPSILON!UIBase 
 extends Identifiable {
 
 compare : viatraUIBase.info.matches(epsilonUIBase.info) and
 	viatraUIBase.mainMenu.matches(epsilonUIBase.mainMenu) and
 	viatraUIBase.modules.sortBy(module | module.uuid).matches(epsilonUIBase.modules.sortBy(module | module.uuid))
 	
 	/*do {
 		viatraUIBase.uuid.println("Comparing UIBase: ");
 	}*/
}

@lazy
rule UIInfo
 match viatraUIInfo : VIATRA!UIInfo
 with epsilonUIInfo : EPSILON!UIInfo
 extends Identifiable {
 
 compare : viatraUIInfo.userClass = epsilonUIInfo.userClass and
 	viatraUIInfo.versions = epsilonUIInfo.versions and
 	viatraUIInfo.submodels = epsilonUIInfo.submodels
 	
 	/*do {
 		viatraUIInfo.uuid.println("Comparing UIInfo: ");
 	}*/
}

@lazy
rule UIMenuItem
 match viatraUIMenuItem : VIATRA!UIMenuItem
 with epsilonUIMenuItem : EPSILON!UIMenuItem
 extends Identifiable {
 
 compare : viatraUIMenuItem.filters.sortBy(filter | filter.uuid).matches(epsilonUIMenuItem.filters.sortBy(filter | filter.uuid)) and
 	viatraUIMenuItem.menuItems.sortBy(menuItem | menuItem.uuid).matches(epsilonUIMenuItem.menuItems.sortBy(menuItem | menuItem.uuid)) and
 	viatraUIMenuItem.menuView.matches(epsilonUIMenuItem.menuView) and
 	viatraUIMenuItem.ownerMenuItem.matches(epsilonUIMenuItem.ownerMenuItem)
 	
 	/*do {
 		viatraUIMenuItem.uuid.println("Comparing UIMenuItem: ");
 	}*/
}

@lazy
rule UIFilter
 match viatraUIFilter : VIATRA!UIFilter
 with epsilonUIFilter : EPSILON!UIFilter
 extends Identifiable {
 
 compare : viatraUIFilter.attribute = epsilonUIFilter.attribute and
 	viatraUIFilter.operator = epsilonUIFilter.operator and
 	viatraUIFilter.value = epsilonUIFilter.value and
 	viatraUIFilter.fixed = epsilonUIFilter.fixed
 	
 	/*do {
 		viatraUIFilter.uuid.println("Comparing UIFilter: ");
 	}*/
}

@lazy
rule UIModule
 match viatraUIModule : VIATRA!UIModule
 with epsilonUIModule : EPSILON!UIModule
 extends Identifiable {
 
 compare : viatraUIModule.fullyQualifiedName = epsilonUIModule.fullyQualifiedName and
 	viatraUIModule.version = epsilonUIModule.version and
 	viatraUIModule.classes.sortBy(class | class.uuid).matches(epsilonUIModule.classes.sortBy(class | class.uuid))
 	
 	/*do {
 		viatraUIModule.uuid.println("Comparing UIModule: ");
 	}*/
}

@lazy
rule UIClass
 match viatraUIClass : VIATRA!UIClass
 with epsilonUIClass : EPSILON!UIClass
 extends Identifiable {
 
 compare : viatraUIClass.`abstract` = epsilonUIClass.`abstract` and
 	 viatraUIClass.readonly = epsilonUIClass.readonly and
 	 viatraUIClass.enumClass = epsilonUIClass.enumClass and
 	 viatraUIClass.singleton = epsilonUIClass.singleton and
 	 viatraUIClass.super.matches(epsilonUIClass.super) and
 	 viatraUIClass.attributes.sortBy(attr | attr.uuid).matches(epsilonUIClass.attributes.sortBy(attr | attr.uuid)) and
 	 viatraUIClass.inheritedAttributes.sortBy(attr | attr.uuid).matches(epsilonUIClass.inheritedAttributes.sortBy(attr | attr.uuid)) and
 	 viatraUIClass.actions.sortBy(action | action.uuid).matches(epsilonUIClass.actions.sortBy(action | action.uuid)) and
 	 viatraUIClass.inheritedActions.sortBy(action | action.uuid).matches(epsilonUIClass.inheritedActions.sortBy(action | action.uuid)) and
 	 viatraUIClass.childClassViews.sortBy(view | view.uuid).matches(epsilonUIClass.childClassViews.sortBy(view | view.uuid)) and
 	 viatraUIClass.listView.matches(epsilonUIClass.listView) and
 	 viatraUIClass.classView.matches(epsilonUIClass.classView) and
 	 viatraUIClass.representation.matches(epsilonUIClass.representation)
 	 
 	 /*do {
 		viatraUIClass.uuid.println("Comparing UIClass: ");
 	}*/
}

@abstract
rule UIView
 match viatraUIView : VIATRA!UIView
 with epsilonUIView : EPSILON!UIView
 extends Identifiable {
 
 compare : viatraUIView.pageSize = epsilonUIView.pageSize and
 	viatraUIView.columns = epsilonUIView.columns and
 	viatraUIView.viewFieldSets.sortBy(vfs | vfs.uuid).matches(epsilonUIView.viewFieldSets.sortBy(vfs | vfs.uuid))
}

@lazy
rule UIListView
 match viatraUIListView : VIATRA!UIListView
 with epsilonUIListView : EPSILON!UIListView
 extends UIView {
 
 compare : viatraUIListView.detailView.matches(epsilonUIListView.detailView)
 /*
 do {
 		viatraUIListView.uuid.println("Comparing UIListView: ");
 	}*/
}

@lazy
rule UIClassView
 match viatraUIClassView : VIATRA!UIClassView
 with epsilonUIClassView : EPSILON!UIClassView
 extends UIView {
 /*
 do {
 		viatraUIClassView.uuid.println("Comparing UIClassView: ");
 	}*/
 }

@lazy
rule UIParamView
 match viatraUIParamView : VIATRA!UIParamView
 with epsilonUIParamView : EPSILON!UIParamView
 extends UIView {
 /*
 do {
 		viatraUIParamView.uuid.println("Comparing UIParamView: ");
 	}*/
 }

@lazy
rule UIResultView
 match viatraUIResultView : VIATRA!UIResultView
 with epsilonUIResultView : EPSILON!UIResultView
 extends UIView {
 /*
 do {
 		viatraUIResultView.uuid.println("Comparing UIResultView: ");
 	}*/
 }

@lazy
rule UIAction
 match viatraUIAction : VIATRA!UIAction
 with epsilonUIAction : EPSILON!UIAction
 extends Identifiable {
 
 compare : viatraUIAction.inherited = epsilonUIAction.inherited and
 	viatraUIAction.classBased = epsilonUIAction.classBased and
 	viatraUIAction.toBeConfirmed = epsilonUIAction.toBeConfirmed and
 	viatraUIAction.notBulk = epsilonUIAction.notBulk and
 	viatraUIAction.isQuery = epsilonUIAction.isQuery and
 	viatraUIAction.parameters.sortBy(param | param.uuid).matches(epsilonUIAction.parameters.sortBy(param | param.uuid)) and
 	viatraUIAction.result.matches(epsilonUIAction.result) and
 	viatraUIAction.paramView.matches(epsilonUIAction.paramView) and
 	viatraUIAction.resultView.matches(epsilonUIAction.resultView)
 	/*
 	do {
 		viatraUIAction.uuid.println("Comparing UIAction: ");
 	}*/
}

@lazy
rule UIViewFieldSet
 match viatraUIViewFieldSet : VIATRA!UIViewFieldSet
 with epsilonUIViewFieldSet : EPSILON!UIViewFieldSet
 extends Identifiable {
 
 compare : /*viatraUIViewFieldSet.position = epsilonUIViewFieldSet.position and*/
 	viatraUIViewFieldSet.viewFields.sortBy(vf | vf.uuid).matches(epsilonUIViewFieldSet.viewFields.sortBy(vf | vf.uuid))
 	/*
 	do {
 		viatraUIViewFieldSet.uuid.println("Comparing UIViewFieldSet: ");
 	}*/
}

@lazy
rule UIViewField
 match viatraUIViewField : VIATRA!UIViewField
 with epsilonUIViewField : EPSILON!UIViewField
 extends Identifiable {
 
 compare : /*viatraUIViewField.position = epsilonUIViewField.position and*/
 	viatraUIViewField.searchable = epsilonUIViewField.searchable and
 	viatraUIViewField.order = epsilonUIViewField.order and
 	viatraUIViewField.show = epsilonUIViewField.show and
 	viatraUIViewField.componentType.matches(epsilonUIViewField.componentType)
 	/*
 	do {
 		viatraUIViewField.uuid.println("Comparing UIViewField: ");
 	}*/
}

@lazy
rule UIInterval
 match viatraUIInterval : VIATRA!UIInterval
 with epsilonUIInterval : EPSILON!UIInterval
 extends Identifiable {
 
 compare : viatraUIInterval.min = epsilonUIInterval.min and
 	viatraUIInterval.max = epsilonUIInterval.max and
 	viatraUIInterval.step = epsilonUIInterval.step
 	/*
 	do {
 		viatraUIInterval.uuid.println("Comparing UIInterval: ");
 	}*/
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
 	viatraUIComponentType.interval = epsilonUIComponentType.interval and
 	viatraUIComponentType.intervals.sortBy(int | int.uuid).matches(epsilonUIComponentType.intervals.sortBy(int | int.uuid))
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

@lazy
rule UIBaseComponentType
 match viatraUIBaseComponentType : VIATRA!UIBaseComponentType
 with epsilonUIBaseComponentType : EPSILON!UIBaseComponentType
 extends UIAttributeComponentType {
 
 compare : viatraUIBaseComponentType.regexp = epsilonUIBaseComponentType.regexp and
 	viatraUIBaseComponentType.decimals = epsilonUIBaseComponentType.decimals and
 	viatraUIBaseComponentType.placeholder = epsilonUIBaseComponentType.placeholder and
 	viatraUIBaseComponentType.representation = epsilonUIBaseComponentType.representation
 	/*
 	do {
 		viatraUIBaseComponentType.uuid.println("Comparing UIBaseComponentType: ");
 	}*/
}

@lazy
rule UIReferenceComponentType
 match viatraUIReferenceComponentType : VIATRA!UIReferenceComponentType
 with epsilonUIReferenceComponentType : EPSILON!UIReferenceComponentType
 extends UIAttributeComponentType {
 
 compare : viatraUIReferenceComponentType.navigable = epsilonUIReferenceComponentType.navigable and
 	viatraUIReferenceComponentType.kind = epsilonUIReferenceComponentType.kind and
 	viatraUIReferenceComponentType.opposite.uuid = epsilonUIReferenceComponentType.opposite.uuid and
 	viatraUIReferenceComponentType.referenced.uuid = epsilonUIReferenceComponentType.referenced.uuid
 	/*
 	do {
 		viatraUIReferenceComponentType.uuid.println("Comparing UIReferenceComponentType: ");
 	}*/
}

@lazy
rule UIParameterComponentType
 match viatraUIParameterComponentType : VIATRA!UIParameterComponentType
 with epsilonUIParameterComponentType : EPSILON!UIParameterComponentType
 extends UIComponentType {
 
 compare : viatraUIParameterComponentType.referenced = null or 
 	viatraUIParameterComponentType.referenced.uuid = epsilonUIParameterComponentType.referenced.uuid
 /*
 do {
 		viatraUIParameterComponentType.uuid.println("Comparing UIParameterComponentType: ");
 	}*/
}