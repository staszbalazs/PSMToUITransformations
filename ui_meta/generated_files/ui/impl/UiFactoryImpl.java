/**
 */
package ui.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ui.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UiFactoryImpl extends EFactoryImpl implements UiFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UiFactory init() {
		try {
			UiFactory theUiFactory = (UiFactory)EPackage.Registry.INSTANCE.getEFactory(UiPackage.eNS_URI);
			if (theUiFactory != null) {
				return theUiFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UiFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UiPackage.UI_MODULE: return createUIModule();
			case UiPackage.UI_CLASS: return createUIClass();
			case UiPackage.UI_ACTION: return createUIAction();
			case UiPackage.UI_VIEW_FIELD: return createUIViewField();
			case UiPackage.UI_VIEW_FIELD_SET: return createUIViewFieldSet();
			case UiPackage.UI_BASE: return createUIBase();
			case UiPackage.UI_MENU_ITEM: return createUIMenuItem();
			case UiPackage.UI_FILTER: return createUIFilter();
			case UiPackage.UI_INTERVAL: return createUIInterval();
			case UiPackage.UI_INFO: return createUIInfo();
			case UiPackage.UI_LIST_VIEW: return createUIListView();
			case UiPackage.UI_CLASS_VIEW: return createUIClassView();
			case UiPackage.UI_RESULT_VIEW: return createUIResultView();
			case UiPackage.UI_PARAM_VIEW: return createUIParamView();
			case UiPackage.UI_BASE_COMPONENT_TYPE: return createUIBaseComponentType();
			case UiPackage.UI_REFERENCE_COMPONENT_TYPE: return createUIReferenceComponentType();
			case UiPackage.UI_PARAMETER_COMPONENT_TYPE: return createUIParameterComponentType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIModule createUIModule() {
		UIModuleImpl uiModule = new UIModuleImpl();
		return uiModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIClass createUIClass() {
		UIClassImpl uiClass = new UIClassImpl();
		return uiClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIAction createUIAction() {
		UIActionImpl uiAction = new UIActionImpl();
		return uiAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIViewField createUIViewField() {
		UIViewFieldImpl uiViewField = new UIViewFieldImpl();
		return uiViewField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIViewFieldSet createUIViewFieldSet() {
		UIViewFieldSetImpl uiViewFieldSet = new UIViewFieldSetImpl();
		return uiViewFieldSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIBase createUIBase() {
		UIBaseImpl uiBase = new UIBaseImpl();
		return uiBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIMenuItem createUIMenuItem() {
		UIMenuItemImpl uiMenuItem = new UIMenuItemImpl();
		return uiMenuItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIFilter createUIFilter() {
		UIFilterImpl uiFilter = new UIFilterImpl();
		return uiFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIInterval createUIInterval() {
		UIIntervalImpl uiInterval = new UIIntervalImpl();
		return uiInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIInfo createUIInfo() {
		UIInfoImpl uiInfo = new UIInfoImpl();
		return uiInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIListView createUIListView() {
		UIListViewImpl uiListView = new UIListViewImpl();
		return uiListView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIClassView createUIClassView() {
		UIClassViewImpl uiClassView = new UIClassViewImpl();
		return uiClassView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIResultView createUIResultView() {
		UIResultViewImpl uiResultView = new UIResultViewImpl();
		return uiResultView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIParamView createUIParamView() {
		UIParamViewImpl uiParamView = new UIParamViewImpl();
		return uiParamView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIBaseComponentType createUIBaseComponentType() {
		UIBaseComponentTypeImpl uiBaseComponentType = new UIBaseComponentTypeImpl();
		return uiBaseComponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIReferenceComponentType createUIReferenceComponentType() {
		UIReferenceComponentTypeImpl uiReferenceComponentType = new UIReferenceComponentTypeImpl();
		return uiReferenceComponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIParameterComponentType createUIParameterComponentType() {
		UIParameterComponentTypeImpl uiParameterComponentType = new UIParameterComponentTypeImpl();
		return uiParameterComponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiPackage getUiPackage() {
		return (UiPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UiPackage getPackage() {
		return UiPackage.eINSTANCE;
	}

} //UiFactoryImpl
