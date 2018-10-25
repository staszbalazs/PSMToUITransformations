import "modelComparisonTest.ecl";

post {

	var viatraElements : Sequence;
	var epsilonElements : Sequence;


	"Comparing UIInfo elements".println();
	
	viatraElements = VIATRA!UIInfo.all;
	epsilonElements = EPSILON!UIInfo.all;
	if (viatraElements.size() <> epsilonElements.size()) {
		throw "Differing number of UIInfo elements";
	}
	for (epsilonUIInfo : EPSILON!UIInfo in epsilonElements) {
		var viatraUIInfo = viatraElements.selectOne(viatra | viatra.uuid = epsilonUIInfo.uuid);
		viatraUIInfo.uuid.println("Comparing element: ");
		if (viatraUIInfo.matches(epsilonUIInfo) = false) {
			throw "Can't match element with uuid: " + epsilonUIInfo.uuid;
		}
	}
	
	
	"Comparing UIFilter elements".println();
	
	viatraElements = VIATRA!UIFilter.all;
	epsilonElements = EPSILON!UIFilter.all;
	if (viatraElements.size() <> epsilonElements.size()) {
		throw "Differing number of UIFilter elements";
	}
	for (epsilonUIFilter : EPSILON!UIFilter in epsilonElements) {
		var viatraUIFilter = viatraElements.selectOne(viatra | viatra.uuid = epsilonUIFilter.uuid);
		viatraUIFilter.uuid.println("Comparing element: ");
		if (viatraUIFilter.matches(epsilonUIFilter) = false) {
			throw "Can't match element with uuid: " + epsilonUIFilter.uuid;
		}
	}


	"Comparing UIInterval elements".println();
	
	viatraElements = VIATRA!UIInterval.all;
	epsilonElements = EPSILON!UIInterval.all;
	if (viatraElements.size() <> epsilonElements.size()) {
		throw "Differing number of UIInterval elements";
	}
	for (epsilonUIInterval : EPSILON!UIInterval in epsilonElements) {
		var viatraUIInterval = viatraElements.selectOne(viatra | viatra.uuid = epsilonUIInterval.uuid);
		viatraUIInterval.uuid.println("Comparing element: ");
		if (viatraUIInterval.matches(epsilonUIInterval) = false) {
			throw "Can't match element with uuid: " + epsilonUIInterval.uuid;
		}
	}
	
	
	"Comparing UIClassView elements".println();
	
	viatraElements = VIATRA!UIClassView.all;
	epsilonElements = EPSILON!UIClassView.all;
	if (viatraElements.size() <> epsilonElements.size()) {
		throw "Differing number of UIClassView elements";
	}
	for (epsilonUIClassView : EPSILON!UIClassView in epsilonElements) {
		epsilonUIClassView.uuid.println("Comparing element: ");
		var viatraUIClassView = viatraElements.selectOne(viatra | viatra.uuid = epsilonUIClassView.uuid);
		if (viatraUIClassView.matches(epsilonUIClassView) = false) {
			throw "Can't match element with uuid: " + epsilonUIClassView.uuid;
		}
	}
	
	
	"Comparing UIListView elements".println();
	
	viatraElements = VIATRA!UIListView.all;
	epsilonElements = EPSILON!UIListView.all;
	if (viatraElements.size() <> epsilonElements.size()) {
		throw "Differing number of UIListView elements";
	}
	for (epsilonUIListView : EPSILON!UIListView in epsilonElements) {
		epsilonUIListView.uuid.println("Comparing element: ");
		var viatraUIListView = viatraElements.selectOne(viatra | viatra.uuid = epsilonUIListView.uuid);
		if (viatraUIListView.matches(epsilonUIListView) = false) {
			throw "Can't match element with uuid: " + epsilonUIListView.uuid;
		}
	}
	
	
	"Comparing UIParamView elements".println();
	
	viatraElements = VIATRA!UIParamView.all;
	epsilonElements = EPSILON!UIParamView.all;
	if (viatraElements.size() <> epsilonElements.size()) {
		throw "Differing number of UIParamView elements";
	}
	for (epsilonUIParamView : EPSILON!UIParamView in epsilonElements) {
		epsilonUIParamView.uuid.println("Comparing element: ");
		var viatraUIParamView = viatraElements.selectOne(viatra | viatra.uuid = epsilonUIParamView.uuid);
		if (viatraUIParamView.matches(epsilonUIParamView) = false) {
			throw "Can't match element with uuid: " + epsilonUIParamView.uuid;
		}
	}
	
	
	"Comparing UIResultView elements".println();
	
	viatraElements = VIATRA!UIResultView.all;
	epsilonElements = EPSILON!UIResultView.all;
	if (viatraElements.size() <> epsilonElements.size()) {
		throw "Differing number of UIResultView elements";
	}
	for (epsilonUIResultView : EPSILON!UIResultView in epsilonElements) {
		epsilonUIResultView.uuid.println("Comparing element: ");
		var viatraUIResultView = viatraElements.selectOne(viatra | viatra.uuid = epsilonUIResultView.uuid);
		if (viatraUIResultView.matches(epsilonUIResultView) = false) {
			throw "Can't match element with uuid: " + epsilonUIResultView.uuid;
		}
	}
	
	
	"Comparing UIViewField elements".println();
	
	viatraElements = VIATRA!UIViewField.all;
	epsilonElements = EPSILON!UIViewField.all;
	
	if (viatraElements.size() <> epsilonElements.size()) {
		throw "Differing number of UIViewField elements";
	}
	for (epsilonUIViewField : EPSILON!UIViewField in epsilonElements) {
		epsilonUIViewField.uuid.println("Comparing element: ");
		var viatraUIViewField = viatraElements.selectOne(viatra | viatra.uuid = epsilonUIViewField.uuid);
		if (viatraUIViewField.matches(epsilonUIViewField) = false) {
			throw "Can't match element with uuid: " + epsilonUIViewField.uuid;
		}
	}
	
	
	"Comparing UIViewFieldSet elements".println();
	
	viatraElements = VIATRA!UIViewFieldSet.all;
	epsilonElements = EPSILON!UIViewFieldSet.all;
	
	if (viatraElements.size() <> epsilonElements.size()) {
		throw "Differing number of UIViewFieldSet elements";
	}
	for (epsilonUIViewFieldSet : EPSILON!UIViewFieldSet in epsilonElements) {
		epsilonUIViewFieldSet.uuid.println("Comparing element: ");
		var viatraUIViewFieldSet = viatraElements.selectOne(viatra | viatra.uuid = epsilonUIViewFieldSet.uuid);
		if (viatraUIViewFieldSet.matches(epsilonUIViewFieldSet) = false) {
			throw "Can't match element with uuid: " + epsilonUIViewFieldSet.uuid;
		}
	}
	

	"Comparing UIBaseComponentType elements".println();
	
	viatraElements = VIATRA!UIBaseComponentType.all;
	epsilonElements = EPSILON!UIBaseComponentType.all;
	if (viatraElements.size() <> epsilonElements.size()) {
		throw "Differing number of UIBaseComponentType elements";
	}
	for (epsilonUIBaseComponentType : EPSILON!UIBaseComponentType in epsilonElements) {
		var viatraUIBaseComponentType = viatraElements.selectOne(viatra | viatra.uuid = epsilonUIBaseComponentType.uuid);
		viatraUIBaseComponentType.uuid.println("Comparing element: ");
		if (viatraUIBaseComponentType.matches(epsilonUIBaseComponentType) = false) {
			throw "Can't match element with uuid: " + epsilonUIBaseComponentType.uuid;
		}
	}
	
	
	"Comparing UIReferenceComponentType elements".println();
	
	viatraElements = VIATRA!UIReferenceComponentType.all;
	epsilonElements = EPSILON!UIReferenceComponentType.all;
	if (viatraElements.size() <> epsilonElements.size()) {
		throw "Differing number of UIReferenceComponentType elements";
	}
	for (epsilonUIReferenceComponentType : EPSILON!UIReferenceComponentType in epsilonElements) {
		epsilonUIReferenceComponentType.uuid.println("Comparing element: ");
		var viatraUIReferenceComponentType = viatraElements.selectOne(viatra | viatra.uuid = epsilonUIReferenceComponentType.uuid);
		if (viatraUIReferenceComponentType.matches(epsilonUIReferenceComponentType) = false) {
			throw "Can't match element with uuid: " + epsilonUIReferenceComponentType.uuid;
		}
	}
	
	
	"Comparing UIParameterComponentType elements".println();
	
	viatraElements = VIATRA!UIParameterComponentType.all;
	epsilonElements = EPSILON!UIParameterComponentType.all;
	if (viatraElements.size() <> epsilonElements.size()) {
		throw "Differing number of UIParameterComponentType elements";
	}
	for (epsilonUIParameterComponentType : EPSILON!UIParameterComponentType in epsilonElements) {
		var viatraUIParameterComponentType = viatraElements.selectOne(viatra | viatra.uuid = epsilonUIParameterComponentType.uuid);
		viatraUIParameterComponentType.uuid.println("Comparing element: ");
		if (viatraUIParameterComponentType.matches(epsilonUIParameterComponentType) = false) {
			throw "Can't match element with uuid: " + epsilonUIParameterComponentType.uuid;
		}
	}
	
	
	"Comparing UIModule elements".println();
	
	viatraElements = VIATRA!UIModule.all;
	epsilonElements = EPSILON!UIModule.all;
	if (viatraElements.size() <> epsilonElements.size()) {
		throw "Differing number of UIModule elements";
	}
	for (epsilonUIModule : EPSILON!UIModule in epsilonElements) {
		var viatraUIModule = viatraElements.selectOne(viatra | viatra.uuid = epsilonUIModule.uuid);
		viatraUIModule.uuid.println("Comparing element: ");
		if (viatraUIModule.matches(epsilonUIModule) = false) {
			throw "Can't match element with uuid: " + epsilonUIModule.uuid;
		}
	}
	

	"Comparing UIBase elements".println();
	
	viatraElements = VIATRA!UIBase.all;
	epsilonElements = EPSILON!UIBase.all;
	if (viatraElements.size() <> epsilonElements.size()) {
		throw "Differing number of UIBase elements";
	}
	for (epsilonUIBase : EPSILON!UIBase in epsilonElements) {
		var viatraUIBase = viatraElements.selectOne(viatra | viatra.uuid = epsilonUIBase.uuid);
		viatraUIBase.uuid.println("Comparing element: ");
		if (viatraUIBase.matches(epsilonUIBase) = false) {
			throw "Can't match element with uuid: " + epsilonUIBase.uuid;
		}
	}
	
	
	"Comparing UIAction elements".println();
	
	viatraElements = VIATRA!UIAction.all;
	epsilonElements = EPSILON!UIAction.all;
	if (viatraElements.size() <> epsilonElements.size()) {
		throw "Differing number of UIAction elements";
	}
	for (epsilonUIAction : EPSILON!UIAction in epsilonElements) {
		epsilonUIAction.uuid.println("Comparing element: ");
		var viatraUIAction = viatraElements.selectOne(viatra | viatra.uuid = epsilonUIAction.uuid);
		if (viatraUIAction.matches(epsilonUIAction) = false) {
			throw "Can't match element with uuid: " + epsilonUIAction.uuid;
		}
	}
	
	
	"Comparing UIClass elements".println();
	
	viatraElements = VIATRA!UIClass.all;
	epsilonElements = EPSILON!UIClass.all;
	if (viatraElements.size() <> epsilonElements.size()) {
		throw "Differing number of UIClass elements";
	}
	for (epsilonUIClass : EPSILON!UIClass in epsilonElements) {
		epsilonUIClass.uuid.println("Comparing element: ");
		var viatraUIClass = viatraElements.selectOne(viatra | viatra.uuid = epsilonUIClass.uuid);
		if (viatraUIClass.matches(epsilonUIClass) = false) {
			throw "Can't match element with uuid: " + epsilonUIClass.uuid;
		}
	}
	
	
	"Comparing UIMenuItem elements".println();
	
	viatraElements = VIATRA!UIMenuItem.all;
	epsilonElements = EPSILON!UIMenuItem.all;
	if (viatraElements.size() <> epsilonElements.size()) {
		throw "Differing number of UIMenuItem elements";
	}
	for (epsilonUIMenuItem : EPSILON!UIMenuItem in epsilonElements) {
		var viatraUIMenuItem = viatraElements.selectOne(viatra | viatra.uuid = epsilonUIMenuItem.uuid);
		viatraUIMenuItem.uuid.println("Comparing element: ");
		if (viatraUIMenuItem.matches(epsilonUIMenuItem) = false) {
			throw "Can't match element with uuid: " + epsilonUIMenuItem.uuid;
		}
	}

}