/**
 */
package ui.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import ui.Identifiable;
import ui.UIAction;
import ui.UIAttributeComponentType;
import ui.UIBase;
import ui.UIBaseComponentType;
import ui.UIClass;
import ui.UIClassView;
import ui.UIComponentType;
import ui.UIFilter;
import ui.UIInfo;
import ui.UIInterval;
import ui.UIListView;
import ui.UIMenuItem;
import ui.UIModule;
import ui.UIParamView;
import ui.UIParameterComponentType;
import ui.UIReferenceComponentType;
import ui.UIResultView;
import ui.UIView;
import ui.UIViewField;
import ui.UIViewFieldSet;
import ui.UiFactory;
import ui.UiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UiPackageImpl extends EPackageImpl implements UiPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiViewFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiViewFieldSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiMenuItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiIntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiComponentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiListViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiClassViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiResultViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiParamViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiBaseComponentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiReferenceComponentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiParameterComponentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiAttributeComponentTypeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ui.UiPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UiPackageImpl() {
		super(eNS_URI, UiFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link UiPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UiPackage init() {
		if (isInited) return (UiPackage)EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredUiPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		UiPackageImpl theUiPackage = registeredUiPackage instanceof UiPackageImpl ? (UiPackageImpl)registeredUiPackage : new UiPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theUiPackage.createPackageContents();

		// Initialize created meta-data
		theUiPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUiPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UiPackage.eNS_URI, theUiPackage);
		return theUiPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIModule() {
		return uiModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIModule_FullyQualifiedName() {
		return (EAttribute)uiModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIModule_Classes() {
		return (EReference)uiModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIModule_Version() {
		return (EAttribute)uiModuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIClass() {
		return uiClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIClass_Actions() {
		return (EReference)uiClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIClass_ClassViews() {
		return (EReference)uiClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIClass_ListViews() {
		return (EReference)uiClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIClass_ChildClassViews() {
		return (EReference)uiClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIClass_Abstract() {
		return (EAttribute)uiClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIClass_Selector() {
		return (EReference)uiClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIClass_Readonly() {
		return (EAttribute)uiClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIClass_EnumClass() {
		return (EAttribute)uiClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIClass_Singleton() {
		return (EAttribute)uiClassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIClass_Super() {
		return (EReference)uiClassEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIClass_Representation() {
		return (EReference)uiClassEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIClass_Attributes() {
		return (EReference)uiClassEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIClass_InheritedAttributes() {
		return (EReference)uiClassEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIClass_InheritedActions() {
		return (EReference)uiClassEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIAction() {
		return uiActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIAction_ParamView() {
		return (EReference)uiActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIAction_Inherited() {
		return (EAttribute)uiActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIAction_ClassBased() {
		return (EAttribute)uiActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIAction_ToBeConfirmed() {
		return (EAttribute)uiActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIAction_NotBulk() {
		return (EAttribute)uiActionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIAction_IsQuery() {
		return (EAttribute)uiActionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIAction_ResultView() {
		return (EReference)uiActionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIAction_Result() {
		return (EReference)uiActionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIAction_Parameters() {
		return (EReference)uiActionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIViewField() {
		return uiViewFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIViewField_Position() {
		return (EAttribute)uiViewFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIViewField_Searchable() {
		return (EAttribute)uiViewFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIViewField_Order() {
		return (EAttribute)uiViewFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIViewField_Show() {
		return (EAttribute)uiViewFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIViewField_ComponentType() {
		return (EReference)uiViewFieldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIViewFieldSet() {
		return uiViewFieldSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIViewFieldSet_ViewFields() {
		return (EReference)uiViewFieldSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIViewFieldSet_Position() {
		return (EAttribute)uiViewFieldSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIView() {
		return uiViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIView_ViewFieldSets() {
		return (EReference)uiViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIView_PageSize() {
		return (EAttribute)uiViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIView_IsDefault() {
		return (EAttribute)uiViewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIView_Columns() {
		return (EAttribute)uiViewEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIBase() {
		return uiBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIBase_Modules() {
		return (EReference)uiBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIBase_Info() {
		return (EReference)uiBaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIBase_MainMenu() {
		return (EReference)uiBaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifiable() {
		return identifiableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiable_Uuid() {
		return (EAttribute)identifiableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiable_Name() {
		return (EAttribute)identifiableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIMenuItem() {
		return uiMenuItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIMenuItem_MenuView() {
		return (EReference)uiMenuItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIMenuItem_Filters() {
		return (EReference)uiMenuItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIMenuItem_MenuItems() {
		return (EReference)uiMenuItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIMenuItem_OwnerMenuItem() {
		return (EReference)uiMenuItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIFilter() {
		return uiFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIFilter_Attribute() {
		return (EAttribute)uiFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIFilter_Operator() {
		return (EAttribute)uiFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIFilter_Value() {
		return (EAttribute)uiFilterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIFilter_Fixed() {
		return (EAttribute)uiFilterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIInterval() {
		return uiIntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIInterval_Min() {
		return (EAttribute)uiIntervalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIInterval_Max() {
		return (EAttribute)uiIntervalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIInterval_Step() {
		return (EAttribute)uiIntervalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIInfo() {
		return uiInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIInfo_UserClass() {
		return (EAttribute)uiInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIInfo_Versions() {
		return (EAttribute)uiInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIInfo_Submodels() {
		return (EAttribute)uiInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIComponentType() {
		return uiComponentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIComponentType_Value() {
		return (EAttribute)uiComponentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIComponentType_Lower() {
		return (EAttribute)uiComponentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIComponentType_Upper() {
		return (EAttribute)uiComponentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIComponentType_Type() {
		return (EAttribute)uiComponentTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIComponentType_Interval() {
		return (EAttribute)uiComponentTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIComponentType_Intervals() {
		return (EReference)uiComponentTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIListView() {
		return uiListViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIListView_DetailView() {
		return (EReference)uiListViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIListView_OwnerClass() {
		return (EReference)uiListViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIClassView() {
		return uiClassViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIResultView() {
		return uiResultViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIParamView() {
		return uiParamViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIBaseComponentType() {
		return uiBaseComponentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIBaseComponentType_Regexp() {
		return (EAttribute)uiBaseComponentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIBaseComponentType_Decimals() {
		return (EAttribute)uiBaseComponentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIBaseComponentType_Placeholder() {
		return (EAttribute)uiBaseComponentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIBaseComponentType_Representation() {
		return (EAttribute)uiBaseComponentTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIReferenceComponentType() {
		return uiReferenceComponentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIReferenceComponentType_Referenced() {
		return (EReference)uiReferenceComponentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIReferenceComponentType_Opposite() {
		return (EReference)uiReferenceComponentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIReferenceComponentType_Navigable() {
		return (EAttribute)uiReferenceComponentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIReferenceComponentType_Kind() {
		return (EAttribute)uiReferenceComponentTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIParameterComponentType() {
		return uiParameterComponentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIParameterComponentType_Referenced() {
		return (EReference)uiParameterComponentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIAttributeComponentType() {
		return uiAttributeComponentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIAttributeComponentType_Derived() {
		return (EAttribute)uiAttributeComponentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIAttributeComponentType_Private() {
		return (EAttribute)uiAttributeComponentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIAttributeComponentType_Readonly() {
		return (EAttribute)uiAttributeComponentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIAttributeComponentType_DisableOnCreate() {
		return (EAttribute)uiAttributeComponentTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIAttributeComponentType_OwnerClass() {
		return (EReference)uiAttributeComponentTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiFactory getUiFactory() {
		return (UiFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		uiModuleEClass = createEClass(UI_MODULE);
		createEAttribute(uiModuleEClass, UI_MODULE__FULLY_QUALIFIED_NAME);
		createEReference(uiModuleEClass, UI_MODULE__CLASSES);
		createEAttribute(uiModuleEClass, UI_MODULE__VERSION);

		uiClassEClass = createEClass(UI_CLASS);
		createEReference(uiClassEClass, UI_CLASS__ACTIONS);
		createEReference(uiClassEClass, UI_CLASS__CLASS_VIEWS);
		createEReference(uiClassEClass, UI_CLASS__LIST_VIEWS);
		createEReference(uiClassEClass, UI_CLASS__CHILD_CLASS_VIEWS);
		createEAttribute(uiClassEClass, UI_CLASS__ABSTRACT);
		createEReference(uiClassEClass, UI_CLASS__SELECTOR);
		createEAttribute(uiClassEClass, UI_CLASS__READONLY);
		createEAttribute(uiClassEClass, UI_CLASS__ENUM_CLASS);
		createEAttribute(uiClassEClass, UI_CLASS__SINGLETON);
		createEReference(uiClassEClass, UI_CLASS__SUPER);
		createEReference(uiClassEClass, UI_CLASS__REPRESENTATION);
		createEReference(uiClassEClass, UI_CLASS__ATTRIBUTES);
		createEReference(uiClassEClass, UI_CLASS__INHERITED_ATTRIBUTES);
		createEReference(uiClassEClass, UI_CLASS__INHERITED_ACTIONS);

		uiActionEClass = createEClass(UI_ACTION);
		createEReference(uiActionEClass, UI_ACTION__PARAM_VIEW);
		createEAttribute(uiActionEClass, UI_ACTION__INHERITED);
		createEAttribute(uiActionEClass, UI_ACTION__CLASS_BASED);
		createEAttribute(uiActionEClass, UI_ACTION__TO_BE_CONFIRMED);
		createEAttribute(uiActionEClass, UI_ACTION__NOT_BULK);
		createEAttribute(uiActionEClass, UI_ACTION__IS_QUERY);
		createEReference(uiActionEClass, UI_ACTION__RESULT_VIEW);
		createEReference(uiActionEClass, UI_ACTION__RESULT);
		createEReference(uiActionEClass, UI_ACTION__PARAMETERS);

		uiViewFieldEClass = createEClass(UI_VIEW_FIELD);
		createEAttribute(uiViewFieldEClass, UI_VIEW_FIELD__POSITION);
		createEAttribute(uiViewFieldEClass, UI_VIEW_FIELD__SEARCHABLE);
		createEAttribute(uiViewFieldEClass, UI_VIEW_FIELD__ORDER);
		createEAttribute(uiViewFieldEClass, UI_VIEW_FIELD__SHOW);
		createEReference(uiViewFieldEClass, UI_VIEW_FIELD__COMPONENT_TYPE);

		uiViewFieldSetEClass = createEClass(UI_VIEW_FIELD_SET);
		createEReference(uiViewFieldSetEClass, UI_VIEW_FIELD_SET__VIEW_FIELDS);
		createEAttribute(uiViewFieldSetEClass, UI_VIEW_FIELD_SET__POSITION);

		uiViewEClass = createEClass(UI_VIEW);
		createEReference(uiViewEClass, UI_VIEW__VIEW_FIELD_SETS);
		createEAttribute(uiViewEClass, UI_VIEW__PAGE_SIZE);
		createEAttribute(uiViewEClass, UI_VIEW__IS_DEFAULT);
		createEAttribute(uiViewEClass, UI_VIEW__COLUMNS);

		uiBaseEClass = createEClass(UI_BASE);
		createEReference(uiBaseEClass, UI_BASE__MODULES);
		createEReference(uiBaseEClass, UI_BASE__INFO);
		createEReference(uiBaseEClass, UI_BASE__MAIN_MENU);

		identifiableEClass = createEClass(IDENTIFIABLE);
		createEAttribute(identifiableEClass, IDENTIFIABLE__UUID);
		createEAttribute(identifiableEClass, IDENTIFIABLE__NAME);

		uiMenuItemEClass = createEClass(UI_MENU_ITEM);
		createEReference(uiMenuItemEClass, UI_MENU_ITEM__MENU_VIEW);
		createEReference(uiMenuItemEClass, UI_MENU_ITEM__FILTERS);
		createEReference(uiMenuItemEClass, UI_MENU_ITEM__MENU_ITEMS);
		createEReference(uiMenuItemEClass, UI_MENU_ITEM__OWNER_MENU_ITEM);

		uiFilterEClass = createEClass(UI_FILTER);
		createEAttribute(uiFilterEClass, UI_FILTER__ATTRIBUTE);
		createEAttribute(uiFilterEClass, UI_FILTER__OPERATOR);
		createEAttribute(uiFilterEClass, UI_FILTER__VALUE);
		createEAttribute(uiFilterEClass, UI_FILTER__FIXED);

		uiIntervalEClass = createEClass(UI_INTERVAL);
		createEAttribute(uiIntervalEClass, UI_INTERVAL__MIN);
		createEAttribute(uiIntervalEClass, UI_INTERVAL__MAX);
		createEAttribute(uiIntervalEClass, UI_INTERVAL__STEP);

		uiInfoEClass = createEClass(UI_INFO);
		createEAttribute(uiInfoEClass, UI_INFO__USER_CLASS);
		createEAttribute(uiInfoEClass, UI_INFO__VERSIONS);
		createEAttribute(uiInfoEClass, UI_INFO__SUBMODELS);

		uiComponentTypeEClass = createEClass(UI_COMPONENT_TYPE);
		createEAttribute(uiComponentTypeEClass, UI_COMPONENT_TYPE__VALUE);
		createEAttribute(uiComponentTypeEClass, UI_COMPONENT_TYPE__LOWER);
		createEAttribute(uiComponentTypeEClass, UI_COMPONENT_TYPE__UPPER);
		createEAttribute(uiComponentTypeEClass, UI_COMPONENT_TYPE__TYPE);
		createEAttribute(uiComponentTypeEClass, UI_COMPONENT_TYPE__INTERVAL);
		createEReference(uiComponentTypeEClass, UI_COMPONENT_TYPE__INTERVALS);

		uiListViewEClass = createEClass(UI_LIST_VIEW);
		createEReference(uiListViewEClass, UI_LIST_VIEW__DETAIL_VIEW);
		createEReference(uiListViewEClass, UI_LIST_VIEW__OWNER_CLASS);

		uiClassViewEClass = createEClass(UI_CLASS_VIEW);

		uiResultViewEClass = createEClass(UI_RESULT_VIEW);

		uiParamViewEClass = createEClass(UI_PARAM_VIEW);

		uiBaseComponentTypeEClass = createEClass(UI_BASE_COMPONENT_TYPE);
		createEAttribute(uiBaseComponentTypeEClass, UI_BASE_COMPONENT_TYPE__REGEXP);
		createEAttribute(uiBaseComponentTypeEClass, UI_BASE_COMPONENT_TYPE__DECIMALS);
		createEAttribute(uiBaseComponentTypeEClass, UI_BASE_COMPONENT_TYPE__PLACEHOLDER);
		createEAttribute(uiBaseComponentTypeEClass, UI_BASE_COMPONENT_TYPE__REPRESENTATION);

		uiReferenceComponentTypeEClass = createEClass(UI_REFERENCE_COMPONENT_TYPE);
		createEReference(uiReferenceComponentTypeEClass, UI_REFERENCE_COMPONENT_TYPE__REFERENCED);
		createEReference(uiReferenceComponentTypeEClass, UI_REFERENCE_COMPONENT_TYPE__OPPOSITE);
		createEAttribute(uiReferenceComponentTypeEClass, UI_REFERENCE_COMPONENT_TYPE__NAVIGABLE);
		createEAttribute(uiReferenceComponentTypeEClass, UI_REFERENCE_COMPONENT_TYPE__KIND);

		uiParameterComponentTypeEClass = createEClass(UI_PARAMETER_COMPONENT_TYPE);
		createEReference(uiParameterComponentTypeEClass, UI_PARAMETER_COMPONENT_TYPE__REFERENCED);

		uiAttributeComponentTypeEClass = createEClass(UI_ATTRIBUTE_COMPONENT_TYPE);
		createEAttribute(uiAttributeComponentTypeEClass, UI_ATTRIBUTE_COMPONENT_TYPE__DERIVED);
		createEAttribute(uiAttributeComponentTypeEClass, UI_ATTRIBUTE_COMPONENT_TYPE__PRIVATE);
		createEAttribute(uiAttributeComponentTypeEClass, UI_ATTRIBUTE_COMPONENT_TYPE__READONLY);
		createEAttribute(uiAttributeComponentTypeEClass, UI_ATTRIBUTE_COMPONENT_TYPE__DISABLE_ON_CREATE);
		createEReference(uiAttributeComponentTypeEClass, UI_ATTRIBUTE_COMPONENT_TYPE__OWNER_CLASS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		uiModuleEClass.getESuperTypes().add(this.getIdentifiable());
		uiClassEClass.getESuperTypes().add(this.getIdentifiable());
		uiActionEClass.getESuperTypes().add(this.getIdentifiable());
		uiViewFieldEClass.getESuperTypes().add(this.getIdentifiable());
		uiViewFieldSetEClass.getESuperTypes().add(this.getIdentifiable());
		uiViewEClass.getESuperTypes().add(this.getIdentifiable());
		uiBaseEClass.getESuperTypes().add(this.getIdentifiable());
		uiMenuItemEClass.getESuperTypes().add(this.getIdentifiable());
		uiFilterEClass.getESuperTypes().add(this.getIdentifiable());
		uiIntervalEClass.getESuperTypes().add(this.getIdentifiable());
		uiInfoEClass.getESuperTypes().add(this.getIdentifiable());
		uiComponentTypeEClass.getESuperTypes().add(this.getIdentifiable());
		uiListViewEClass.getESuperTypes().add(this.getUIView());
		uiClassViewEClass.getESuperTypes().add(this.getUIView());
		uiResultViewEClass.getESuperTypes().add(this.getUIView());
		uiParamViewEClass.getESuperTypes().add(this.getUIView());
		uiBaseComponentTypeEClass.getESuperTypes().add(this.getUIAttributeComponentType());
		uiReferenceComponentTypeEClass.getESuperTypes().add(this.getUIAttributeComponentType());
		uiParameterComponentTypeEClass.getESuperTypes().add(this.getUIComponentType());
		uiAttributeComponentTypeEClass.getESuperTypes().add(this.getUIComponentType());

		// Initialize classes, features, and operations; add parameters
		initEClass(uiModuleEClass, UIModule.class, "UIModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUIModule_FullyQualifiedName(), ecorePackage.getEString(), "fullyQualifiedName", null, 1, 1, UIModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIModule_Classes(), this.getUIClass(), null, "classes", null, 0, -1, UIModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIModule_Version(), ecorePackage.getEString(), "version", null, 0, 1, UIModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiClassEClass, UIClass.class, "UIClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUIClass_Actions(), this.getUIAction(), null, "actions", null, 0, -1, UIClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIClass_ClassViews(), this.getUIClassView(), null, "classViews", null, 0, -1, UIClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIClass_ListViews(), this.getUIListView(), null, "listViews", null, 0, -1, UIClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIClass_ChildClassViews(), this.getUIClassView(), null, "childClassViews", null, 0, -1, UIClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIClass_Abstract(), ecorePackage.getEBoolean(), "abstract", null, 0, 1, UIClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIClass_Selector(), this.getUIListView(), this.getUIListView_OwnerClass(), "selector", null, 1, 1, UIClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIClass_Readonly(), ecorePackage.getEBoolean(), "readonly", null, 0, 1, UIClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIClass_EnumClass(), ecorePackage.getEBoolean(), "enumClass", null, 0, 1, UIClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIClass_Singleton(), ecorePackage.getEBoolean(), "singleton", null, 0, 1, UIClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIClass_Super(), this.getUIClass(), null, "super", null, 0, 1, UIClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIClass_Representation(), this.getUIBaseComponentType(), null, "representation", null, 0, 1, UIClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIClass_Attributes(), this.getUIAttributeComponentType(), this.getUIAttributeComponentType_OwnerClass(), "attributes", null, 0, -1, UIClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIClass_InheritedAttributes(), this.getUIAttributeComponentType(), null, "inheritedAttributes", null, 0, -1, UIClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIClass_InheritedActions(), this.getUIAction(), null, "inheritedActions", null, 0, -1, UIClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiActionEClass, UIAction.class, "UIAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUIAction_ParamView(), this.getUIParamView(), null, "paramView", null, 1, 1, UIAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIAction_Inherited(), ecorePackage.getEBoolean(), "inherited", null, 0, 1, UIAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIAction_ClassBased(), ecorePackage.getEBoolean(), "classBased", null, 0, 1, UIAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIAction_ToBeConfirmed(), ecorePackage.getEBoolean(), "toBeConfirmed", null, 0, 1, UIAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIAction_NotBulk(), ecorePackage.getEBoolean(), "notBulk", null, 0, 1, UIAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIAction_IsQuery(), ecorePackage.getEBoolean(), "isQuery", null, 0, 1, UIAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIAction_ResultView(), this.getUIResultView(), null, "resultView", null, 0, 1, UIAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIAction_Result(), this.getUIParameterComponentType(), null, "result", null, 0, 1, UIAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIAction_Parameters(), this.getUIParameterComponentType(), null, "parameters", null, 0, -1, UIAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiViewFieldEClass, UIViewField.class, "UIViewField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUIViewField_Position(), ecorePackage.getEInt(), "position", "1", 0, 1, UIViewField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIViewField_Searchable(), ecorePackage.getEBoolean(), "searchable", null, 0, 1, UIViewField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIViewField_Order(), ecorePackage.getEInt(), "order", "0", 0, 1, UIViewField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIViewField_Show(), ecorePackage.getEBoolean(), "show", "true", 0, 1, UIViewField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIViewField_ComponentType(), this.getUIComponentType(), null, "componentType", null, 1, 1, UIViewField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiViewFieldSetEClass, UIViewFieldSet.class, "UIViewFieldSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUIViewFieldSet_ViewFields(), this.getUIViewField(), null, "viewFields", null, 0, -1, UIViewFieldSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIViewFieldSet_Position(), ecorePackage.getEInt(), "position", "1", 0, 1, UIViewFieldSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiViewEClass, UIView.class, "UIView", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUIView_ViewFieldSets(), this.getUIViewFieldSet(), null, "viewFieldSets", null, 0, -1, UIView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIView_PageSize(), ecorePackage.getEInt(), "pageSize", "1", 0, 1, UIView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIView_IsDefault(), ecorePackage.getEBoolean(), "isDefault", "true", 0, 1, UIView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIView_Columns(), ecorePackage.getEInt(), "columns", "2", 0, 1, UIView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiBaseEClass, UIBase.class, "UIBase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUIBase_Modules(), this.getUIModule(), null, "modules", null, 0, -1, UIBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIBase_Info(), this.getUIInfo(), null, "info", null, 1, 1, UIBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIBase_MainMenu(), this.getUIMenuItem(), null, "mainMenu", null, 1, 1, UIBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identifiableEClass, Identifiable.class, "Identifiable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifiable_Uuid(), ecorePackage.getEString(), "uuid", null, 1, 1, Identifiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifiable_Name(), ecorePackage.getEString(), "name", null, 1, 1, Identifiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiMenuItemEClass, UIMenuItem.class, "UIMenuItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUIMenuItem_MenuView(), this.getUIView(), null, "menuView", null, 0, 1, UIMenuItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIMenuItem_Filters(), this.getUIFilter(), null, "filters", null, 0, -1, UIMenuItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIMenuItem_MenuItems(), this.getUIMenuItem(), this.getUIMenuItem_OwnerMenuItem(), "menuItems", null, 0, -1, UIMenuItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIMenuItem_OwnerMenuItem(), this.getUIMenuItem(), this.getUIMenuItem_MenuItems(), "ownerMenuItem", null, 0, 1, UIMenuItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiFilterEClass, UIFilter.class, "UIFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUIFilter_Attribute(), ecorePackage.getEString(), "attribute", null, 1, 1, UIFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIFilter_Operator(), ecorePackage.getEString(), "operator", null, 1, 1, UIFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIFilter_Value(), ecorePackage.getEString(), "value", null, 1, 1, UIFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIFilter_Fixed(), ecorePackage.getEBoolean(), "fixed", "true", 0, 1, UIFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiIntervalEClass, UIInterval.class, "UIInterval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUIInterval_Min(), ecorePackage.getEInt(), "min", null, 0, 1, UIInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIInterval_Max(), ecorePackage.getEInt(), "max", null, 0, 1, UIInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIInterval_Step(), ecorePackage.getEInt(), "step", "1", 0, 1, UIInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiInfoEClass, UIInfo.class, "UIInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUIInfo_UserClass(), ecorePackage.getEString(), "userClass", null, 0, 1, UIInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIInfo_Versions(), ecorePackage.getEString(), "versions", null, 0, -1, UIInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIInfo_Submodels(), ecorePackage.getEString(), "submodels", null, 0, -1, UIInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiComponentTypeEClass, UIComponentType.class, "UIComponentType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUIComponentType_Value(), ecorePackage.getEString(), "value", null, 0, 1, UIComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIComponentType_Lower(), ecorePackage.getEInt(), "lower", null, 1, 1, UIComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIComponentType_Upper(), ecorePackage.getEInt(), "upper", null, 1, 1, UIComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIComponentType_Type(), ecorePackage.getEString(), "type", null, 1, 1, UIComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIComponentType_Interval(), ecorePackage.getEString(), "interval", null, 0, 1, UIComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIComponentType_Intervals(), this.getUIInterval(), null, "intervals", null, 0, -1, UIComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiListViewEClass, UIListView.class, "UIListView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUIListView_DetailView(), this.getUIClassView(), null, "detailView", null, 0, 1, UIListView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIListView_OwnerClass(), this.getUIClass(), this.getUIClass_Selector(), "ownerClass", null, 0, 1, UIListView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiClassViewEClass, UIClassView.class, "UIClassView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiResultViewEClass, UIResultView.class, "UIResultView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiParamViewEClass, UIParamView.class, "UIParamView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiBaseComponentTypeEClass, UIBaseComponentType.class, "UIBaseComponentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUIBaseComponentType_Regexp(), ecorePackage.getEString(), "regexp", null, 0, 1, UIBaseComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIBaseComponentType_Decimals(), ecorePackage.getEInt(), "decimals", null, 0, 1, UIBaseComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIBaseComponentType_Placeholder(), ecorePackage.getEString(), "placeholder", null, 0, 1, UIBaseComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIBaseComponentType_Representation(), ecorePackage.getEBoolean(), "representation", "false", 0, 1, UIBaseComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiReferenceComponentTypeEClass, UIReferenceComponentType.class, "UIReferenceComponentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUIReferenceComponentType_Referenced(), this.getUIClass(), null, "referenced", null, 1, 1, UIReferenceComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIReferenceComponentType_Opposite(), this.getUIReferenceComponentType(), null, "opposite", null, 0, 1, UIReferenceComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIReferenceComponentType_Navigable(), ecorePackage.getEBoolean(), "navigable", "false", 0, 1, UIReferenceComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIReferenceComponentType_Kind(), ecorePackage.getEString(), "kind", null, 0, 1, UIReferenceComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiParameterComponentTypeEClass, UIParameterComponentType.class, "UIParameterComponentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUIParameterComponentType_Referenced(), this.getUIClass(), null, "referenced", null, 0, 1, UIParameterComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiAttributeComponentTypeEClass, UIAttributeComponentType.class, "UIAttributeComponentType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUIAttributeComponentType_Derived(), ecorePackage.getEBoolean(), "derived", null, 0, 1, UIAttributeComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIAttributeComponentType_Private(), ecorePackage.getEBoolean(), "private", "false", 0, 1, UIAttributeComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIAttributeComponentType_Readonly(), ecorePackage.getEBoolean(), "readonly", null, 0, 1, UIAttributeComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIAttributeComponentType_DisableOnCreate(), ecorePackage.getEBoolean(), "disableOnCreate", "false", 0, 1, UIAttributeComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIAttributeComponentType_OwnerClass(), this.getUIClass(), this.getUIClass_Attributes(), "ownerClass", null, 1, 1, UIAttributeComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //UiPackageImpl
