/**
 */
package ui;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ui.UiFactory
 * @model kind="package"
 * @generated
 */
public interface UiPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ui";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://blackbelt.hu/judo/meta/psm/ui";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ui";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UiPackage eINSTANCE = ui.impl.UiPackageImpl.init();

	/**
	 * The meta object id for the '{@link ui.impl.IdentifiableImpl <em>Identifiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui.impl.IdentifiableImpl
	 * @see ui.impl.UiPackageImpl#getIdentifiable()
	 * @generated
	 */
	int IDENTIFIABLE = 7;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__UUID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ui.impl.UIModuleImpl <em>UI Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui.impl.UIModuleImpl
	 * @see ui.impl.UiPackageImpl#getUIModule()
	 * @generated
	 */
	int UI_MODULE = 0;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_MODULE__UUID = IDENTIFIABLE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_MODULE__NAME = IDENTIFIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Fully Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_MODULE__FULLY_QUALIFIED_NAME = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_MODULE__CLASSES = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_MODULE__VERSION = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>UI Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_MODULE_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>UI Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_MODULE_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ui.impl.UIClassImpl <em>UI Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui.impl.UIClassImpl
	 * @see ui.impl.UiPackageImpl#getUIClass()
	 * @generated
	 */
	int UI_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CLASS__UUID = IDENTIFIABLE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CLASS__NAME = IDENTIFIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CLASS__ACTIONS = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CLASS__CLASS_VIEWS = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>List Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CLASS__LIST_VIEWS = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Child Class Views</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CLASS__CHILD_CLASS_VIEWS = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CLASS__ABSTRACT = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CLASS__SELECTOR = IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Readonly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CLASS__READONLY = IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Enum Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CLASS__ENUM_CLASS = IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Singleton</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CLASS__SINGLETON = IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Super</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CLASS__SUPER = IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CLASS__REPRESENTATION = IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CLASS__ATTRIBUTES = IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>UI Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CLASS_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>UI Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CLASS_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ui.impl.UIActionImpl <em>UI Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui.impl.UIActionImpl
	 * @see ui.impl.UiPackageImpl#getUIAction()
	 * @generated
	 */
	int UI_ACTION = 2;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ACTION__UUID = IDENTIFIABLE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ACTION__NAME = IDENTIFIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Param View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ACTION__PARAM_VIEW = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inherited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ACTION__INHERITED = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Class Based</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ACTION__CLASS_BASED = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>To Be Confirmed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ACTION__TO_BE_CONFIRMED = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Not Bulk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ACTION__NOT_BULK = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ACTION__IS_QUERY = IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Result View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ACTION__RESULT_VIEW = IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ACTION__RESULT = IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ACTION__PARAMETERS = IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>UI Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ACTION_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>UI Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ACTION_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ui.impl.UIViewFieldImpl <em>UI View Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui.impl.UIViewFieldImpl
	 * @see ui.impl.UiPackageImpl#getUIViewField()
	 * @generated
	 */
	int UI_VIEW_FIELD = 3;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VIEW_FIELD__UUID = IDENTIFIABLE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VIEW_FIELD__NAME = IDENTIFIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VIEW_FIELD__POSITION = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Searchable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VIEW_FIELD__SEARCHABLE = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VIEW_FIELD__ORDER = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VIEW_FIELD__SHOW = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VIEW_FIELD__COMPONENT_TYPE = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>UI View Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VIEW_FIELD_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>UI View Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VIEW_FIELD_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ui.impl.UIViewFieldSetImpl <em>UI View Field Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui.impl.UIViewFieldSetImpl
	 * @see ui.impl.UiPackageImpl#getUIViewFieldSet()
	 * @generated
	 */
	int UI_VIEW_FIELD_SET = 4;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VIEW_FIELD_SET__UUID = IDENTIFIABLE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VIEW_FIELD_SET__NAME = IDENTIFIABLE__NAME;

	/**
	 * The feature id for the '<em><b>View Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VIEW_FIELD_SET__VIEW_FIELDS = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VIEW_FIELD_SET__POSITION = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>UI View Field Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VIEW_FIELD_SET_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>UI View Field Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VIEW_FIELD_SET_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ui.impl.UIViewImpl <em>UI View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui.impl.UIViewImpl
	 * @see ui.impl.UiPackageImpl#getUIView()
	 * @generated
	 */
	int UI_VIEW = 5;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VIEW__UUID = IDENTIFIABLE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VIEW__NAME = IDENTIFIABLE__NAME;

	/**
	 * The feature id for the '<em><b>View Field Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VIEW__VIEW_FIELD_SETS = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Page Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VIEW__PAGE_SIZE = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VIEW__IS_DEFAULT = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VIEW__COLUMNS = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>UI View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VIEW_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>UI View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VIEW_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ui.impl.UIBaseImpl <em>UI Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui.impl.UIBaseImpl
	 * @see ui.impl.UiPackageImpl#getUIBase()
	 * @generated
	 */
	int UI_BASE = 6;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BASE__UUID = IDENTIFIABLE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BASE__NAME = IDENTIFIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BASE__MODULES = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BASE__INFO = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Main Menu</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BASE__MAIN_MENU = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>UI Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BASE_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>UI Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BASE_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ui.impl.UIMenuItemImpl <em>UI Menu Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui.impl.UIMenuItemImpl
	 * @see ui.impl.UiPackageImpl#getUIMenuItem()
	 * @generated
	 */
	int UI_MENU_ITEM = 8;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_MENU_ITEM__UUID = IDENTIFIABLE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_MENU_ITEM__NAME = IDENTIFIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Menu View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_MENU_ITEM__MENU_VIEW = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_MENU_ITEM__FILTERS = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Menu Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_MENU_ITEM__MENU_ITEMS = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owner Menu Item</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_MENU_ITEM__OWNER_MENU_ITEM = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>UI Menu Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_MENU_ITEM_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>UI Menu Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_MENU_ITEM_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ui.impl.UIFilterImpl <em>UI Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui.impl.UIFilterImpl
	 * @see ui.impl.UiPackageImpl#getUIFilter()
	 * @generated
	 */
	int UI_FILTER = 9;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FILTER__UUID = IDENTIFIABLE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FILTER__NAME = IDENTIFIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FILTER__ATTRIBUTE = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FILTER__OPERATOR = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FILTER__VALUE = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FILTER__FIXED = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>UI Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FILTER_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>UI Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FILTER_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ui.impl.UIIntervalImpl <em>UI Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui.impl.UIIntervalImpl
	 * @see ui.impl.UiPackageImpl#getUIInterval()
	 * @generated
	 */
	int UI_INTERVAL = 10;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_INTERVAL__UUID = IDENTIFIABLE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_INTERVAL__NAME = IDENTIFIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_INTERVAL__MIN = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_INTERVAL__MAX = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_INTERVAL__STEP = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>UI Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_INTERVAL_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>UI Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_INTERVAL_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ui.impl.UIInfoImpl <em>UI Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui.impl.UIInfoImpl
	 * @see ui.impl.UiPackageImpl#getUIInfo()
	 * @generated
	 */
	int UI_INFO = 11;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_INFO__UUID = IDENTIFIABLE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_INFO__NAME = IDENTIFIABLE__NAME;

	/**
	 * The feature id for the '<em><b>User Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_INFO__USER_CLASS = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_INFO__VERSIONS = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Submodels</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_INFO__SUBMODELS = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>UI Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_INFO_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>UI Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_INFO_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ui.impl.UIComponentTypeImpl <em>UI Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui.impl.UIComponentTypeImpl
	 * @see ui.impl.UiPackageImpl#getUIComponentType()
	 * @generated
	 */
	int UI_COMPONENT_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_COMPONENT_TYPE__UUID = IDENTIFIABLE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_COMPONENT_TYPE__NAME = IDENTIFIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_COMPONENT_TYPE__VALUE = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_COMPONENT_TYPE__LOWER = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_COMPONENT_TYPE__UPPER = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_COMPONENT_TYPE__TYPE = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_COMPONENT_TYPE__INTERVAL = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Intervals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_COMPONENT_TYPE__INTERVALS = IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>UI Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_COMPONENT_TYPE_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>UI Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_COMPONENT_TYPE_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ui.impl.UIListViewImpl <em>UI List View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui.impl.UIListViewImpl
	 * @see ui.impl.UiPackageImpl#getUIListView()
	 * @generated
	 */
	int UI_LIST_VIEW = 13;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIST_VIEW__UUID = UI_VIEW__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIST_VIEW__NAME = UI_VIEW__NAME;

	/**
	 * The feature id for the '<em><b>View Field Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIST_VIEW__VIEW_FIELD_SETS = UI_VIEW__VIEW_FIELD_SETS;

	/**
	 * The feature id for the '<em><b>Page Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIST_VIEW__PAGE_SIZE = UI_VIEW__PAGE_SIZE;

	/**
	 * The feature id for the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIST_VIEW__IS_DEFAULT = UI_VIEW__IS_DEFAULT;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIST_VIEW__COLUMNS = UI_VIEW__COLUMNS;

	/**
	 * The feature id for the '<em><b>Detail View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIST_VIEW__DETAIL_VIEW = UI_VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owner Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIST_VIEW__OWNER_CLASS = UI_VIEW_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>UI List View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIST_VIEW_FEATURE_COUNT = UI_VIEW_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>UI List View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIST_VIEW_OPERATION_COUNT = UI_VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ui.impl.UIClassViewImpl <em>UI Class View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui.impl.UIClassViewImpl
	 * @see ui.impl.UiPackageImpl#getUIClassView()
	 * @generated
	 */
	int UI_CLASS_VIEW = 14;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CLASS_VIEW__UUID = UI_VIEW__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CLASS_VIEW__NAME = UI_VIEW__NAME;

	/**
	 * The feature id for the '<em><b>View Field Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CLASS_VIEW__VIEW_FIELD_SETS = UI_VIEW__VIEW_FIELD_SETS;

	/**
	 * The feature id for the '<em><b>Page Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CLASS_VIEW__PAGE_SIZE = UI_VIEW__PAGE_SIZE;

	/**
	 * The feature id for the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CLASS_VIEW__IS_DEFAULT = UI_VIEW__IS_DEFAULT;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CLASS_VIEW__COLUMNS = UI_VIEW__COLUMNS;

	/**
	 * The number of structural features of the '<em>UI Class View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CLASS_VIEW_FEATURE_COUNT = UI_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>UI Class View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CLASS_VIEW_OPERATION_COUNT = UI_VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ui.impl.UIResultViewImpl <em>UI Result View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui.impl.UIResultViewImpl
	 * @see ui.impl.UiPackageImpl#getUIResultView()
	 * @generated
	 */
	int UI_RESULT_VIEW = 15;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_RESULT_VIEW__UUID = UI_VIEW__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_RESULT_VIEW__NAME = UI_VIEW__NAME;

	/**
	 * The feature id for the '<em><b>View Field Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_RESULT_VIEW__VIEW_FIELD_SETS = UI_VIEW__VIEW_FIELD_SETS;

	/**
	 * The feature id for the '<em><b>Page Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_RESULT_VIEW__PAGE_SIZE = UI_VIEW__PAGE_SIZE;

	/**
	 * The feature id for the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_RESULT_VIEW__IS_DEFAULT = UI_VIEW__IS_DEFAULT;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_RESULT_VIEW__COLUMNS = UI_VIEW__COLUMNS;

	/**
	 * The number of structural features of the '<em>UI Result View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_RESULT_VIEW_FEATURE_COUNT = UI_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>UI Result View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_RESULT_VIEW_OPERATION_COUNT = UI_VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ui.impl.UIParamViewImpl <em>UI Param View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui.impl.UIParamViewImpl
	 * @see ui.impl.UiPackageImpl#getUIParamView()
	 * @generated
	 */
	int UI_PARAM_VIEW = 16;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_PARAM_VIEW__UUID = UI_VIEW__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_PARAM_VIEW__NAME = UI_VIEW__NAME;

	/**
	 * The feature id for the '<em><b>View Field Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_PARAM_VIEW__VIEW_FIELD_SETS = UI_VIEW__VIEW_FIELD_SETS;

	/**
	 * The feature id for the '<em><b>Page Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_PARAM_VIEW__PAGE_SIZE = UI_VIEW__PAGE_SIZE;

	/**
	 * The feature id for the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_PARAM_VIEW__IS_DEFAULT = UI_VIEW__IS_DEFAULT;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_PARAM_VIEW__COLUMNS = UI_VIEW__COLUMNS;

	/**
	 * The number of structural features of the '<em>UI Param View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_PARAM_VIEW_FEATURE_COUNT = UI_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>UI Param View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_PARAM_VIEW_OPERATION_COUNT = UI_VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ui.impl.UIAttributeComponentTypeImpl <em>UI Attribute Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui.impl.UIAttributeComponentTypeImpl
	 * @see ui.impl.UiPackageImpl#getUIAttributeComponentType()
	 * @generated
	 */
	int UI_ATTRIBUTE_COMPONENT_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ATTRIBUTE_COMPONENT_TYPE__UUID = UI_COMPONENT_TYPE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ATTRIBUTE_COMPONENT_TYPE__NAME = UI_COMPONENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ATTRIBUTE_COMPONENT_TYPE__VALUE = UI_COMPONENT_TYPE__VALUE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ATTRIBUTE_COMPONENT_TYPE__LOWER = UI_COMPONENT_TYPE__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ATTRIBUTE_COMPONENT_TYPE__UPPER = UI_COMPONENT_TYPE__UPPER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ATTRIBUTE_COMPONENT_TYPE__TYPE = UI_COMPONENT_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ATTRIBUTE_COMPONENT_TYPE__INTERVAL = UI_COMPONENT_TYPE__INTERVAL;

	/**
	 * The feature id for the '<em><b>Intervals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ATTRIBUTE_COMPONENT_TYPE__INTERVALS = UI_COMPONENT_TYPE__INTERVALS;

	/**
	 * The feature id for the '<em><b>Inherited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ATTRIBUTE_COMPONENT_TYPE__INHERITED = UI_COMPONENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ATTRIBUTE_COMPONENT_TYPE__DERIVED = UI_COMPONENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ATTRIBUTE_COMPONENT_TYPE__PRIVATE = UI_COMPONENT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Readonly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ATTRIBUTE_COMPONENT_TYPE__READONLY = UI_COMPONENT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Disable On Create</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ATTRIBUTE_COMPONENT_TYPE__DISABLE_ON_CREATE = UI_COMPONENT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Owner Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ATTRIBUTE_COMPONENT_TYPE__OWNER_CLASS = UI_COMPONENT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>UI Attribute Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ATTRIBUTE_COMPONENT_TYPE_FEATURE_COUNT = UI_COMPONENT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>UI Attribute Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ATTRIBUTE_COMPONENT_TYPE_OPERATION_COUNT = UI_COMPONENT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ui.impl.UIBaseComponentTypeImpl <em>UI Base Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui.impl.UIBaseComponentTypeImpl
	 * @see ui.impl.UiPackageImpl#getUIBaseComponentType()
	 * @generated
	 */
	int UI_BASE_COMPONENT_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BASE_COMPONENT_TYPE__UUID = UI_ATTRIBUTE_COMPONENT_TYPE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BASE_COMPONENT_TYPE__NAME = UI_ATTRIBUTE_COMPONENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BASE_COMPONENT_TYPE__VALUE = UI_ATTRIBUTE_COMPONENT_TYPE__VALUE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BASE_COMPONENT_TYPE__LOWER = UI_ATTRIBUTE_COMPONENT_TYPE__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BASE_COMPONENT_TYPE__UPPER = UI_ATTRIBUTE_COMPONENT_TYPE__UPPER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BASE_COMPONENT_TYPE__TYPE = UI_ATTRIBUTE_COMPONENT_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BASE_COMPONENT_TYPE__INTERVAL = UI_ATTRIBUTE_COMPONENT_TYPE__INTERVAL;

	/**
	 * The feature id for the '<em><b>Intervals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BASE_COMPONENT_TYPE__INTERVALS = UI_ATTRIBUTE_COMPONENT_TYPE__INTERVALS;

	/**
	 * The feature id for the '<em><b>Inherited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BASE_COMPONENT_TYPE__INHERITED = UI_ATTRIBUTE_COMPONENT_TYPE__INHERITED;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BASE_COMPONENT_TYPE__DERIVED = UI_ATTRIBUTE_COMPONENT_TYPE__DERIVED;

	/**
	 * The feature id for the '<em><b>Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BASE_COMPONENT_TYPE__PRIVATE = UI_ATTRIBUTE_COMPONENT_TYPE__PRIVATE;

	/**
	 * The feature id for the '<em><b>Readonly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BASE_COMPONENT_TYPE__READONLY = UI_ATTRIBUTE_COMPONENT_TYPE__READONLY;

	/**
	 * The feature id for the '<em><b>Disable On Create</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BASE_COMPONENT_TYPE__DISABLE_ON_CREATE = UI_ATTRIBUTE_COMPONENT_TYPE__DISABLE_ON_CREATE;

	/**
	 * The feature id for the '<em><b>Owner Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BASE_COMPONENT_TYPE__OWNER_CLASS = UI_ATTRIBUTE_COMPONENT_TYPE__OWNER_CLASS;

	/**
	 * The feature id for the '<em><b>Regexp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BASE_COMPONENT_TYPE__REGEXP = UI_ATTRIBUTE_COMPONENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Decimals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BASE_COMPONENT_TYPE__DECIMALS = UI_ATTRIBUTE_COMPONENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BASE_COMPONENT_TYPE__PLACEHOLDER = UI_ATTRIBUTE_COMPONENT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BASE_COMPONENT_TYPE__REPRESENTATION = UI_ATTRIBUTE_COMPONENT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>UI Base Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BASE_COMPONENT_TYPE_FEATURE_COUNT = UI_ATTRIBUTE_COMPONENT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>UI Base Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BASE_COMPONENT_TYPE_OPERATION_COUNT = UI_ATTRIBUTE_COMPONENT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ui.impl.UIReferenceComponentTypeImpl <em>UI Reference Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui.impl.UIReferenceComponentTypeImpl
	 * @see ui.impl.UiPackageImpl#getUIReferenceComponentType()
	 * @generated
	 */
	int UI_REFERENCE_COMPONENT_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REFERENCE_COMPONENT_TYPE__UUID = UI_ATTRIBUTE_COMPONENT_TYPE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REFERENCE_COMPONENT_TYPE__NAME = UI_ATTRIBUTE_COMPONENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REFERENCE_COMPONENT_TYPE__VALUE = UI_ATTRIBUTE_COMPONENT_TYPE__VALUE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REFERENCE_COMPONENT_TYPE__LOWER = UI_ATTRIBUTE_COMPONENT_TYPE__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REFERENCE_COMPONENT_TYPE__UPPER = UI_ATTRIBUTE_COMPONENT_TYPE__UPPER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REFERENCE_COMPONENT_TYPE__TYPE = UI_ATTRIBUTE_COMPONENT_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REFERENCE_COMPONENT_TYPE__INTERVAL = UI_ATTRIBUTE_COMPONENT_TYPE__INTERVAL;

	/**
	 * The feature id for the '<em><b>Intervals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REFERENCE_COMPONENT_TYPE__INTERVALS = UI_ATTRIBUTE_COMPONENT_TYPE__INTERVALS;

	/**
	 * The feature id for the '<em><b>Inherited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REFERENCE_COMPONENT_TYPE__INHERITED = UI_ATTRIBUTE_COMPONENT_TYPE__INHERITED;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REFERENCE_COMPONENT_TYPE__DERIVED = UI_ATTRIBUTE_COMPONENT_TYPE__DERIVED;

	/**
	 * The feature id for the '<em><b>Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REFERENCE_COMPONENT_TYPE__PRIVATE = UI_ATTRIBUTE_COMPONENT_TYPE__PRIVATE;

	/**
	 * The feature id for the '<em><b>Readonly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REFERENCE_COMPONENT_TYPE__READONLY = UI_ATTRIBUTE_COMPONENT_TYPE__READONLY;

	/**
	 * The feature id for the '<em><b>Disable On Create</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REFERENCE_COMPONENT_TYPE__DISABLE_ON_CREATE = UI_ATTRIBUTE_COMPONENT_TYPE__DISABLE_ON_CREATE;

	/**
	 * The feature id for the '<em><b>Owner Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REFERENCE_COMPONENT_TYPE__OWNER_CLASS = UI_ATTRIBUTE_COMPONENT_TYPE__OWNER_CLASS;

	/**
	 * The feature id for the '<em><b>Referenced</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REFERENCE_COMPONENT_TYPE__REFERENCED = UI_ATTRIBUTE_COMPONENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REFERENCE_COMPONENT_TYPE__OPPOSITE = UI_ATTRIBUTE_COMPONENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Navigable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REFERENCE_COMPONENT_TYPE__NAVIGABLE = UI_ATTRIBUTE_COMPONENT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REFERENCE_COMPONENT_TYPE__KIND = UI_ATTRIBUTE_COMPONENT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>UI Reference Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REFERENCE_COMPONENT_TYPE_FEATURE_COUNT = UI_ATTRIBUTE_COMPONENT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>UI Reference Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REFERENCE_COMPONENT_TYPE_OPERATION_COUNT = UI_ATTRIBUTE_COMPONENT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ui.impl.UIParameterComponentTypeImpl <em>UI Parameter Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui.impl.UIParameterComponentTypeImpl
	 * @see ui.impl.UiPackageImpl#getUIParameterComponentType()
	 * @generated
	 */
	int UI_PARAMETER_COMPONENT_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_PARAMETER_COMPONENT_TYPE__UUID = UI_COMPONENT_TYPE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_PARAMETER_COMPONENT_TYPE__NAME = UI_COMPONENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_PARAMETER_COMPONENT_TYPE__VALUE = UI_COMPONENT_TYPE__VALUE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_PARAMETER_COMPONENT_TYPE__LOWER = UI_COMPONENT_TYPE__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_PARAMETER_COMPONENT_TYPE__UPPER = UI_COMPONENT_TYPE__UPPER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_PARAMETER_COMPONENT_TYPE__TYPE = UI_COMPONENT_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_PARAMETER_COMPONENT_TYPE__INTERVAL = UI_COMPONENT_TYPE__INTERVAL;

	/**
	 * The feature id for the '<em><b>Intervals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_PARAMETER_COMPONENT_TYPE__INTERVALS = UI_COMPONENT_TYPE__INTERVALS;

	/**
	 * The feature id for the '<em><b>Referenced</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_PARAMETER_COMPONENT_TYPE__REFERENCED = UI_COMPONENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UI Parameter Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_PARAMETER_COMPONENT_TYPE_FEATURE_COUNT = UI_COMPONENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>UI Parameter Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_PARAMETER_COMPONENT_TYPE_OPERATION_COUNT = UI_COMPONENT_TYPE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link ui.UIModule <em>UI Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Module</em>'.
	 * @see ui.UIModule
	 * @generated
	 */
	EClass getUIModule();

	/**
	 * Returns the meta object for the attribute '{@link ui.UIModule#getFullyQualifiedName <em>Fully Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fully Qualified Name</em>'.
	 * @see ui.UIModule#getFullyQualifiedName()
	 * @see #getUIModule()
	 * @generated
	 */
	EAttribute getUIModule_FullyQualifiedName();

	/**
	 * Returns the meta object for the containment reference list '{@link ui.UIModule#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see ui.UIModule#getClasses()
	 * @see #getUIModule()
	 * @generated
	 */
	EReference getUIModule_Classes();

	/**
	 * Returns the meta object for the attribute '{@link ui.UIModule#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see ui.UIModule#getVersion()
	 * @see #getUIModule()
	 * @generated
	 */
	EAttribute getUIModule_Version();

	/**
	 * Returns the meta object for class '{@link ui.UIClass <em>UI Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Class</em>'.
	 * @see ui.UIClass
	 * @generated
	 */
	EClass getUIClass();

	/**
	 * Returns the meta object for the containment reference list '{@link ui.UIClass#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see ui.UIClass#getActions()
	 * @see #getUIClass()
	 * @generated
	 */
	EReference getUIClass_Actions();

	/**
	 * Returns the meta object for the containment reference list '{@link ui.UIClass#getClassViews <em>Class Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Class Views</em>'.
	 * @see ui.UIClass#getClassViews()
	 * @see #getUIClass()
	 * @generated
	 */
	EReference getUIClass_ClassViews();

	/**
	 * Returns the meta object for the containment reference list '{@link ui.UIClass#getListViews <em>List Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Views</em>'.
	 * @see ui.UIClass#getListViews()
	 * @see #getUIClass()
	 * @generated
	 */
	EReference getUIClass_ListViews();

	/**
	 * Returns the meta object for the reference list '{@link ui.UIClass#getChildClassViews <em>Child Class Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Child Class Views</em>'.
	 * @see ui.UIClass#getChildClassViews()
	 * @see #getUIClass()
	 * @generated
	 */
	EReference getUIClass_ChildClassViews();

	/**
	 * Returns the meta object for the attribute '{@link ui.UIClass#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see ui.UIClass#isAbstract()
	 * @see #getUIClass()
	 * @generated
	 */
	EAttribute getUIClass_Abstract();

	/**
	 * Returns the meta object for the reference '{@link ui.UIClass#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selector</em>'.
	 * @see ui.UIClass#getSelector()
	 * @see #getUIClass()
	 * @generated
	 */
	EReference getUIClass_Selector();

	/**
	 * Returns the meta object for the attribute '{@link ui.UIClass#isReadonly <em>Readonly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Readonly</em>'.
	 * @see ui.UIClass#isReadonly()
	 * @see #getUIClass()
	 * @generated
	 */
	EAttribute getUIClass_Readonly();

	/**
	 * Returns the meta object for the attribute '{@link ui.UIClass#isEnumClass <em>Enum Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enum Class</em>'.
	 * @see ui.UIClass#isEnumClass()
	 * @see #getUIClass()
	 * @generated
	 */
	EAttribute getUIClass_EnumClass();

	/**
	 * Returns the meta object for the attribute '{@link ui.UIClass#isSingleton <em>Singleton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Singleton</em>'.
	 * @see ui.UIClass#isSingleton()
	 * @see #getUIClass()
	 * @generated
	 */
	EAttribute getUIClass_Singleton();

	/**
	 * Returns the meta object for the reference '{@link ui.UIClass#getSuper <em>Super</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super</em>'.
	 * @see ui.UIClass#getSuper()
	 * @see #getUIClass()
	 * @generated
	 */
	EReference getUIClass_Super();

	/**
	 * Returns the meta object for the reference '{@link ui.UIClass#getRepresentation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Representation</em>'.
	 * @see ui.UIClass#getRepresentation()
	 * @see #getUIClass()
	 * @generated
	 */
	EReference getUIClass_Representation();

	/**
	 * Returns the meta object for the containment reference list '{@link ui.UIClass#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see ui.UIClass#getAttributes()
	 * @see #getUIClass()
	 * @generated
	 */
	EReference getUIClass_Attributes();

	/**
	 * Returns the meta object for class '{@link ui.UIAction <em>UI Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Action</em>'.
	 * @see ui.UIAction
	 * @generated
	 */
	EClass getUIAction();

	/**
	 * Returns the meta object for the containment reference '{@link ui.UIAction#getParamView <em>Param View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Param View</em>'.
	 * @see ui.UIAction#getParamView()
	 * @see #getUIAction()
	 * @generated
	 */
	EReference getUIAction_ParamView();

	/**
	 * Returns the meta object for the attribute '{@link ui.UIAction#isInherited <em>Inherited</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited</em>'.
	 * @see ui.UIAction#isInherited()
	 * @see #getUIAction()
	 * @generated
	 */
	EAttribute getUIAction_Inherited();

	/**
	 * Returns the meta object for the attribute '{@link ui.UIAction#isClassBased <em>Class Based</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Based</em>'.
	 * @see ui.UIAction#isClassBased()
	 * @see #getUIAction()
	 * @generated
	 */
	EAttribute getUIAction_ClassBased();

	/**
	 * Returns the meta object for the attribute '{@link ui.UIAction#isToBeConfirmed <em>To Be Confirmed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Be Confirmed</em>'.
	 * @see ui.UIAction#isToBeConfirmed()
	 * @see #getUIAction()
	 * @generated
	 */
	EAttribute getUIAction_ToBeConfirmed();

	/**
	 * Returns the meta object for the attribute '{@link ui.UIAction#isNotBulk <em>Not Bulk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Bulk</em>'.
	 * @see ui.UIAction#isNotBulk()
	 * @see #getUIAction()
	 * @generated
	 */
	EAttribute getUIAction_NotBulk();

	/**
	 * Returns the meta object for the attribute '{@link ui.UIAction#isIsQuery <em>Is Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Query</em>'.
	 * @see ui.UIAction#isIsQuery()
	 * @see #getUIAction()
	 * @generated
	 */
	EAttribute getUIAction_IsQuery();

	/**
	 * Returns the meta object for the containment reference '{@link ui.UIAction#getResultView <em>Result View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result View</em>'.
	 * @see ui.UIAction#getResultView()
	 * @see #getUIAction()
	 * @generated
	 */
	EReference getUIAction_ResultView();

	/**
	 * Returns the meta object for the containment reference '{@link ui.UIAction#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see ui.UIAction#getResult()
	 * @see #getUIAction()
	 * @generated
	 */
	EReference getUIAction_Result();

	/**
	 * Returns the meta object for the containment reference list '{@link ui.UIAction#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see ui.UIAction#getParameters()
	 * @see #getUIAction()
	 * @generated
	 */
	EReference getUIAction_Parameters();

	/**
	 * Returns the meta object for class '{@link ui.UIViewField <em>UI View Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI View Field</em>'.
	 * @see ui.UIViewField
	 * @generated
	 */
	EClass getUIViewField();

	/**
	 * Returns the meta object for the attribute '{@link ui.UIViewField#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see ui.UIViewField#getPosition()
	 * @see #getUIViewField()
	 * @generated
	 */
	EAttribute getUIViewField_Position();

	/**
	 * Returns the meta object for the attribute '{@link ui.UIViewField#isSearchable <em>Searchable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Searchable</em>'.
	 * @see ui.UIViewField#isSearchable()
	 * @see #getUIViewField()
	 * @generated
	 */
	EAttribute getUIViewField_Searchable();

	/**
	 * Returns the meta object for the attribute '{@link ui.UIViewField#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see ui.UIViewField#getOrder()
	 * @see #getUIViewField()
	 * @generated
	 */
	EAttribute getUIViewField_Order();

	/**
	 * Returns the meta object for the attribute '{@link ui.UIViewField#isShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see ui.UIViewField#isShow()
	 * @see #getUIViewField()
	 * @generated
	 */
	EAttribute getUIViewField_Show();

	/**
	 * Returns the meta object for the reference '{@link ui.UIViewField#getComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Type</em>'.
	 * @see ui.UIViewField#getComponentType()
	 * @see #getUIViewField()
	 * @generated
	 */
	EReference getUIViewField_ComponentType();

	/**
	 * Returns the meta object for class '{@link ui.UIViewFieldSet <em>UI View Field Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI View Field Set</em>'.
	 * @see ui.UIViewFieldSet
	 * @generated
	 */
	EClass getUIViewFieldSet();

	/**
	 * Returns the meta object for the containment reference list '{@link ui.UIViewFieldSet#getViewFields <em>View Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View Fields</em>'.
	 * @see ui.UIViewFieldSet#getViewFields()
	 * @see #getUIViewFieldSet()
	 * @generated
	 */
	EReference getUIViewFieldSet_ViewFields();

	/**
	 * Returns the meta object for the attribute '{@link ui.UIViewFieldSet#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see ui.UIViewFieldSet#getPosition()
	 * @see #getUIViewFieldSet()
	 * @generated
	 */
	EAttribute getUIViewFieldSet_Position();

	/**
	 * Returns the meta object for class '{@link ui.UIView <em>UI View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI View</em>'.
	 * @see ui.UIView
	 * @generated
	 */
	EClass getUIView();

	/**
	 * Returns the meta object for the containment reference list '{@link ui.UIView#getViewFieldSets <em>View Field Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View Field Sets</em>'.
	 * @see ui.UIView#getViewFieldSets()
	 * @see #getUIView()
	 * @generated
	 */
	EReference getUIView_ViewFieldSets();

	/**
	 * Returns the meta object for the attribute '{@link ui.UIView#getPageSize <em>Page Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page Size</em>'.
	 * @see ui.UIView#getPageSize()
	 * @see #getUIView()
	 * @generated
	 */
	EAttribute getUIView_PageSize();

	/**
	 * Returns the meta object for the attribute '{@link ui.UIView#isIsDefault <em>Is Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Default</em>'.
	 * @see ui.UIView#isIsDefault()
	 * @see #getUIView()
	 * @generated
	 */
	EAttribute getUIView_IsDefault();

	/**
	 * Returns the meta object for the attribute '{@link ui.UIView#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Columns</em>'.
	 * @see ui.UIView#getColumns()
	 * @see #getUIView()
	 * @generated
	 */
	EAttribute getUIView_Columns();

	/**
	 * Returns the meta object for class '{@link ui.UIBase <em>UI Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Base</em>'.
	 * @see ui.UIBase
	 * @generated
	 */
	EClass getUIBase();

	/**
	 * Returns the meta object for the containment reference list '{@link ui.UIBase#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modules</em>'.
	 * @see ui.UIBase#getModules()
	 * @see #getUIBase()
	 * @generated
	 */
	EReference getUIBase_Modules();

	/**
	 * Returns the meta object for the containment reference '{@link ui.UIBase#getInfo <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Info</em>'.
	 * @see ui.UIBase#getInfo()
	 * @see #getUIBase()
	 * @generated
	 */
	EReference getUIBase_Info();

	/**
	 * Returns the meta object for the containment reference '{@link ui.UIBase#getMainMenu <em>Main Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Main Menu</em>'.
	 * @see ui.UIBase#getMainMenu()
	 * @see #getUIBase()
	 * @generated
	 */
	EReference getUIBase_MainMenu();

	/**
	 * Returns the meta object for class '{@link ui.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable</em>'.
	 * @see ui.Identifiable
	 * @generated
	 */
	EClass getIdentifiable();

	/**
	 * Returns the meta object for the attribute '{@link ui.Identifiable#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see ui.Identifiable#getUuid()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EAttribute getIdentifiable_Uuid();

	/**
	 * Returns the meta object for the attribute '{@link ui.Identifiable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ui.Identifiable#getName()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EAttribute getIdentifiable_Name();

	/**
	 * Returns the meta object for class '{@link ui.UIMenuItem <em>UI Menu Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Menu Item</em>'.
	 * @see ui.UIMenuItem
	 * @generated
	 */
	EClass getUIMenuItem();

	/**
	 * Returns the meta object for the reference '{@link ui.UIMenuItem#getMenuView <em>Menu View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Menu View</em>'.
	 * @see ui.UIMenuItem#getMenuView()
	 * @see #getUIMenuItem()
	 * @generated
	 */
	EReference getUIMenuItem_MenuView();

	/**
	 * Returns the meta object for the containment reference list '{@link ui.UIMenuItem#getFilters <em>Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filters</em>'.
	 * @see ui.UIMenuItem#getFilters()
	 * @see #getUIMenuItem()
	 * @generated
	 */
	EReference getUIMenuItem_Filters();

	/**
	 * Returns the meta object for the containment reference list '{@link ui.UIMenuItem#getMenuItems <em>Menu Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Menu Items</em>'.
	 * @see ui.UIMenuItem#getMenuItems()
	 * @see #getUIMenuItem()
	 * @generated
	 */
	EReference getUIMenuItem_MenuItems();

	/**
	 * Returns the meta object for the container reference '{@link ui.UIMenuItem#getOwnerMenuItem <em>Owner Menu Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner Menu Item</em>'.
	 * @see ui.UIMenuItem#getOwnerMenuItem()
	 * @see #getUIMenuItem()
	 * @generated
	 */
	EReference getUIMenuItem_OwnerMenuItem();

	/**
	 * Returns the meta object for class '{@link ui.UIFilter <em>UI Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Filter</em>'.
	 * @see ui.UIFilter
	 * @generated
	 */
	EClass getUIFilter();

	/**
	 * Returns the meta object for the attribute '{@link ui.UIFilter#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute</em>'.
	 * @see ui.UIFilter#getAttribute()
	 * @see #getUIFilter()
	 * @generated
	 */
	EAttribute getUIFilter_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link ui.UIFilter#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see ui.UIFilter#getOperator()
	 * @see #getUIFilter()
	 * @generated
	 */
	EAttribute getUIFilter_Operator();

	/**
	 * Returns the meta object for the attribute '{@link ui.UIFilter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ui.UIFilter#getValue()
	 * @see #getUIFilter()
	 * @generated
	 */
	EAttribute getUIFilter_Value();

	/**
	 * Returns the meta object for the attribute '{@link ui.UIFilter#isFixed <em>Fixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed</em>'.
	 * @see ui.UIFilter#isFixed()
	 * @see #getUIFilter()
	 * @generated
	 */
	EAttribute getUIFilter_Fixed();

	/**
	 * Returns the meta object for class '{@link ui.UIInterval <em>UI Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Interval</em>'.
	 * @see ui.UIInterval
	 * @generated
	 */
	EClass getUIInterval();

	/**
	 * Returns the meta object for the attribute '{@link ui.UIInterval#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see ui.UIInterval#getMin()
	 * @see #getUIInterval()
	 * @generated
	 */
	EAttribute getUIInterval_Min();

	/**
	 * Returns the meta object for the attribute '{@link ui.UIInterval#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see ui.UIInterval#getMax()
	 * @see #getUIInterval()
	 * @generated
	 */
	EAttribute getUIInterval_Max();

	/**
	 * Returns the meta object for the attribute '{@link ui.UIInterval#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step</em>'.
	 * @see ui.UIInterval#getStep()
	 * @see #getUIInterval()
	 * @generated
	 */
	EAttribute getUIInterval_Step();

	/**
	 * Returns the meta object for class '{@link ui.UIInfo <em>UI Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Info</em>'.
	 * @see ui.UIInfo
	 * @generated
	 */
	EClass getUIInfo();

	/**
	 * Returns the meta object for the attribute '{@link ui.UIInfo#getUserClass <em>User Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Class</em>'.
	 * @see ui.UIInfo#getUserClass()
	 * @see #getUIInfo()
	 * @generated
	 */
	EAttribute getUIInfo_UserClass();

	/**
	 * Returns the meta object for the attribute list '{@link ui.UIInfo#getVersions <em>Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Versions</em>'.
	 * @see ui.UIInfo#getVersions()
	 * @see #getUIInfo()
	 * @generated
	 */
	EAttribute getUIInfo_Versions();

	/**
	 * Returns the meta object for the attribute list '{@link ui.UIInfo#getSubmodels <em>Submodels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Submodels</em>'.
	 * @see ui.UIInfo#getSubmodels()
	 * @see #getUIInfo()
	 * @generated
	 */
	EAttribute getUIInfo_Submodels();

	/**
	 * Returns the meta object for class '{@link ui.UIComponentType <em>UI Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Component Type</em>'.
	 * @see ui.UIComponentType
	 * @generated
	 */
	EClass getUIComponentType();

	/**
	 * Returns the meta object for the attribute '{@link ui.UIComponentType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ui.UIComponentType#getValue()
	 * @see #getUIComponentType()
	 * @generated
	 */
	EAttribute getUIComponentType_Value();

	/**
	 * Returns the meta object for the attribute '{@link ui.UIComponentType#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower</em>'.
	 * @see ui.UIComponentType#getLower()
	 * @see #getUIComponentType()
	 * @generated
	 */
	EAttribute getUIComponentType_Lower();

	/**
	 * Returns the meta object for the attribute '{@link ui.UIComponentType#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper</em>'.
	 * @see ui.UIComponentType#getUpper()
	 * @see #getUIComponentType()
	 * @generated
	 */
	EAttribute getUIComponentType_Upper();

	/**
	 * Returns the meta object for the attribute '{@link ui.UIComponentType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ui.UIComponentType#getType()
	 * @see #getUIComponentType()
	 * @generated
	 */
	EAttribute getUIComponentType_Type();

	/**
	 * Returns the meta object for the attribute '{@link ui.UIComponentType#getInterval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval</em>'.
	 * @see ui.UIComponentType#getInterval()
	 * @see #getUIComponentType()
	 * @generated
	 */
	EAttribute getUIComponentType_Interval();

	/**
	 * Returns the meta object for the containment reference list '{@link ui.UIComponentType#getIntervals <em>Intervals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intervals</em>'.
	 * @see ui.UIComponentType#getIntervals()
	 * @see #getUIComponentType()
	 * @generated
	 */
	EReference getUIComponentType_Intervals();

	/**
	 * Returns the meta object for class '{@link ui.UIListView <em>UI List View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI List View</em>'.
	 * @see ui.UIListView
	 * @generated
	 */
	EClass getUIListView();

	/**
	 * Returns the meta object for the reference '{@link ui.UIListView#getDetailView <em>Detail View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Detail View</em>'.
	 * @see ui.UIListView#getDetailView()
	 * @see #getUIListView()
	 * @generated
	 */
	EReference getUIListView_DetailView();

	/**
	 * Returns the meta object for the reference '{@link ui.UIListView#getOwnerClass <em>Owner Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner Class</em>'.
	 * @see ui.UIListView#getOwnerClass()
	 * @see #getUIListView()
	 * @generated
	 */
	EReference getUIListView_OwnerClass();

	/**
	 * Returns the meta object for class '{@link ui.UIClassView <em>UI Class View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Class View</em>'.
	 * @see ui.UIClassView
	 * @generated
	 */
	EClass getUIClassView();

	/**
	 * Returns the meta object for class '{@link ui.UIResultView <em>UI Result View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Result View</em>'.
	 * @see ui.UIResultView
	 * @generated
	 */
	EClass getUIResultView();

	/**
	 * Returns the meta object for class '{@link ui.UIParamView <em>UI Param View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Param View</em>'.
	 * @see ui.UIParamView
	 * @generated
	 */
	EClass getUIParamView();

	/**
	 * Returns the meta object for class '{@link ui.UIBaseComponentType <em>UI Base Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Base Component Type</em>'.
	 * @see ui.UIBaseComponentType
	 * @generated
	 */
	EClass getUIBaseComponentType();

	/**
	 * Returns the meta object for the attribute '{@link ui.UIBaseComponentType#getRegexp <em>Regexp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regexp</em>'.
	 * @see ui.UIBaseComponentType#getRegexp()
	 * @see #getUIBaseComponentType()
	 * @generated
	 */
	EAttribute getUIBaseComponentType_Regexp();

	/**
	 * Returns the meta object for the attribute '{@link ui.UIBaseComponentType#getDecimals <em>Decimals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decimals</em>'.
	 * @see ui.UIBaseComponentType#getDecimals()
	 * @see #getUIBaseComponentType()
	 * @generated
	 */
	EAttribute getUIBaseComponentType_Decimals();

	/**
	 * Returns the meta object for the attribute '{@link ui.UIBaseComponentType#getPlaceholder <em>Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholder</em>'.
	 * @see ui.UIBaseComponentType#getPlaceholder()
	 * @see #getUIBaseComponentType()
	 * @generated
	 */
	EAttribute getUIBaseComponentType_Placeholder();

	/**
	 * Returns the meta object for the attribute '{@link ui.UIBaseComponentType#isRepresentation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Representation</em>'.
	 * @see ui.UIBaseComponentType#isRepresentation()
	 * @see #getUIBaseComponentType()
	 * @generated
	 */
	EAttribute getUIBaseComponentType_Representation();

	/**
	 * Returns the meta object for class '{@link ui.UIReferenceComponentType <em>UI Reference Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Reference Component Type</em>'.
	 * @see ui.UIReferenceComponentType
	 * @generated
	 */
	EClass getUIReferenceComponentType();

	/**
	 * Returns the meta object for the reference '{@link ui.UIReferenceComponentType#getReferenced <em>Referenced</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced</em>'.
	 * @see ui.UIReferenceComponentType#getReferenced()
	 * @see #getUIReferenceComponentType()
	 * @generated
	 */
	EReference getUIReferenceComponentType_Referenced();

	/**
	 * Returns the meta object for the reference '{@link ui.UIReferenceComponentType#getOpposite <em>Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Opposite</em>'.
	 * @see ui.UIReferenceComponentType#getOpposite()
	 * @see #getUIReferenceComponentType()
	 * @generated
	 */
	EReference getUIReferenceComponentType_Opposite();

	/**
	 * Returns the meta object for the attribute '{@link ui.UIReferenceComponentType#isNavigable <em>Navigable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navigable</em>'.
	 * @see ui.UIReferenceComponentType#isNavigable()
	 * @see #getUIReferenceComponentType()
	 * @generated
	 */
	EAttribute getUIReferenceComponentType_Navigable();

	/**
	 * Returns the meta object for the attribute '{@link ui.UIReferenceComponentType#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see ui.UIReferenceComponentType#getKind()
	 * @see #getUIReferenceComponentType()
	 * @generated
	 */
	EAttribute getUIReferenceComponentType_Kind();

	/**
	 * Returns the meta object for class '{@link ui.UIParameterComponentType <em>UI Parameter Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Parameter Component Type</em>'.
	 * @see ui.UIParameterComponentType
	 * @generated
	 */
	EClass getUIParameterComponentType();

	/**
	 * Returns the meta object for the reference '{@link ui.UIParameterComponentType#getReferenced <em>Referenced</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced</em>'.
	 * @see ui.UIParameterComponentType#getReferenced()
	 * @see #getUIParameterComponentType()
	 * @generated
	 */
	EReference getUIParameterComponentType_Referenced();

	/**
	 * Returns the meta object for class '{@link ui.UIAttributeComponentType <em>UI Attribute Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Attribute Component Type</em>'.
	 * @see ui.UIAttributeComponentType
	 * @generated
	 */
	EClass getUIAttributeComponentType();

	/**
	 * Returns the meta object for the attribute '{@link ui.UIAttributeComponentType#isInherited <em>Inherited</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited</em>'.
	 * @see ui.UIAttributeComponentType#isInherited()
	 * @see #getUIAttributeComponentType()
	 * @generated
	 */
	EAttribute getUIAttributeComponentType_Inherited();

	/**
	 * Returns the meta object for the attribute '{@link ui.UIAttributeComponentType#isDerived <em>Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derived</em>'.
	 * @see ui.UIAttributeComponentType#isDerived()
	 * @see #getUIAttributeComponentType()
	 * @generated
	 */
	EAttribute getUIAttributeComponentType_Derived();

	/**
	 * Returns the meta object for the attribute '{@link ui.UIAttributeComponentType#isPrivate <em>Private</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private</em>'.
	 * @see ui.UIAttributeComponentType#isPrivate()
	 * @see #getUIAttributeComponentType()
	 * @generated
	 */
	EAttribute getUIAttributeComponentType_Private();

	/**
	 * Returns the meta object for the attribute '{@link ui.UIAttributeComponentType#isReadonly <em>Readonly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Readonly</em>'.
	 * @see ui.UIAttributeComponentType#isReadonly()
	 * @see #getUIAttributeComponentType()
	 * @generated
	 */
	EAttribute getUIAttributeComponentType_Readonly();

	/**
	 * Returns the meta object for the attribute '{@link ui.UIAttributeComponentType#isDisableOnCreate <em>Disable On Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disable On Create</em>'.
	 * @see ui.UIAttributeComponentType#isDisableOnCreate()
	 * @see #getUIAttributeComponentType()
	 * @generated
	 */
	EAttribute getUIAttributeComponentType_DisableOnCreate();

	/**
	 * Returns the meta object for the container reference '{@link ui.UIAttributeComponentType#getOwnerClass <em>Owner Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner Class</em>'.
	 * @see ui.UIAttributeComponentType#getOwnerClass()
	 * @see #getUIAttributeComponentType()
	 * @generated
	 */
	EReference getUIAttributeComponentType_OwnerClass();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UiFactory getUiFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ui.impl.UIModuleImpl <em>UI Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui.impl.UIModuleImpl
		 * @see ui.impl.UiPackageImpl#getUIModule()
		 * @generated
		 */
		EClass UI_MODULE = eINSTANCE.getUIModule();

		/**
		 * The meta object literal for the '<em><b>Fully Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_MODULE__FULLY_QUALIFIED_NAME = eINSTANCE.getUIModule_FullyQualifiedName();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_MODULE__CLASSES = eINSTANCE.getUIModule_Classes();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_MODULE__VERSION = eINSTANCE.getUIModule_Version();

		/**
		 * The meta object literal for the '{@link ui.impl.UIClassImpl <em>UI Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui.impl.UIClassImpl
		 * @see ui.impl.UiPackageImpl#getUIClass()
		 * @generated
		 */
		EClass UI_CLASS = eINSTANCE.getUIClass();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_CLASS__ACTIONS = eINSTANCE.getUIClass_Actions();

		/**
		 * The meta object literal for the '<em><b>Class Views</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_CLASS__CLASS_VIEWS = eINSTANCE.getUIClass_ClassViews();

		/**
		 * The meta object literal for the '<em><b>List Views</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_CLASS__LIST_VIEWS = eINSTANCE.getUIClass_ListViews();

		/**
		 * The meta object literal for the '<em><b>Child Class Views</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_CLASS__CHILD_CLASS_VIEWS = eINSTANCE.getUIClass_ChildClassViews();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_CLASS__ABSTRACT = eINSTANCE.getUIClass_Abstract();

		/**
		 * The meta object literal for the '<em><b>Selector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_CLASS__SELECTOR = eINSTANCE.getUIClass_Selector();

		/**
		 * The meta object literal for the '<em><b>Readonly</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_CLASS__READONLY = eINSTANCE.getUIClass_Readonly();

		/**
		 * The meta object literal for the '<em><b>Enum Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_CLASS__ENUM_CLASS = eINSTANCE.getUIClass_EnumClass();

		/**
		 * The meta object literal for the '<em><b>Singleton</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_CLASS__SINGLETON = eINSTANCE.getUIClass_Singleton();

		/**
		 * The meta object literal for the '<em><b>Super</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_CLASS__SUPER = eINSTANCE.getUIClass_Super();

		/**
		 * The meta object literal for the '<em><b>Representation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_CLASS__REPRESENTATION = eINSTANCE.getUIClass_Representation();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_CLASS__ATTRIBUTES = eINSTANCE.getUIClass_Attributes();

		/**
		 * The meta object literal for the '{@link ui.impl.UIActionImpl <em>UI Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui.impl.UIActionImpl
		 * @see ui.impl.UiPackageImpl#getUIAction()
		 * @generated
		 */
		EClass UI_ACTION = eINSTANCE.getUIAction();

		/**
		 * The meta object literal for the '<em><b>Param View</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_ACTION__PARAM_VIEW = eINSTANCE.getUIAction_ParamView();

		/**
		 * The meta object literal for the '<em><b>Inherited</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_ACTION__INHERITED = eINSTANCE.getUIAction_Inherited();

		/**
		 * The meta object literal for the '<em><b>Class Based</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_ACTION__CLASS_BASED = eINSTANCE.getUIAction_ClassBased();

		/**
		 * The meta object literal for the '<em><b>To Be Confirmed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_ACTION__TO_BE_CONFIRMED = eINSTANCE.getUIAction_ToBeConfirmed();

		/**
		 * The meta object literal for the '<em><b>Not Bulk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_ACTION__NOT_BULK = eINSTANCE.getUIAction_NotBulk();

		/**
		 * The meta object literal for the '<em><b>Is Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_ACTION__IS_QUERY = eINSTANCE.getUIAction_IsQuery();

		/**
		 * The meta object literal for the '<em><b>Result View</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_ACTION__RESULT_VIEW = eINSTANCE.getUIAction_ResultView();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_ACTION__RESULT = eINSTANCE.getUIAction_Result();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_ACTION__PARAMETERS = eINSTANCE.getUIAction_Parameters();

		/**
		 * The meta object literal for the '{@link ui.impl.UIViewFieldImpl <em>UI View Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui.impl.UIViewFieldImpl
		 * @see ui.impl.UiPackageImpl#getUIViewField()
		 * @generated
		 */
		EClass UI_VIEW_FIELD = eINSTANCE.getUIViewField();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_VIEW_FIELD__POSITION = eINSTANCE.getUIViewField_Position();

		/**
		 * The meta object literal for the '<em><b>Searchable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_VIEW_FIELD__SEARCHABLE = eINSTANCE.getUIViewField_Searchable();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_VIEW_FIELD__ORDER = eINSTANCE.getUIViewField_Order();

		/**
		 * The meta object literal for the '<em><b>Show</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_VIEW_FIELD__SHOW = eINSTANCE.getUIViewField_Show();

		/**
		 * The meta object literal for the '<em><b>Component Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_VIEW_FIELD__COMPONENT_TYPE = eINSTANCE.getUIViewField_ComponentType();

		/**
		 * The meta object literal for the '{@link ui.impl.UIViewFieldSetImpl <em>UI View Field Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui.impl.UIViewFieldSetImpl
		 * @see ui.impl.UiPackageImpl#getUIViewFieldSet()
		 * @generated
		 */
		EClass UI_VIEW_FIELD_SET = eINSTANCE.getUIViewFieldSet();

		/**
		 * The meta object literal for the '<em><b>View Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_VIEW_FIELD_SET__VIEW_FIELDS = eINSTANCE.getUIViewFieldSet_ViewFields();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_VIEW_FIELD_SET__POSITION = eINSTANCE.getUIViewFieldSet_Position();

		/**
		 * The meta object literal for the '{@link ui.impl.UIViewImpl <em>UI View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui.impl.UIViewImpl
		 * @see ui.impl.UiPackageImpl#getUIView()
		 * @generated
		 */
		EClass UI_VIEW = eINSTANCE.getUIView();

		/**
		 * The meta object literal for the '<em><b>View Field Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_VIEW__VIEW_FIELD_SETS = eINSTANCE.getUIView_ViewFieldSets();

		/**
		 * The meta object literal for the '<em><b>Page Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_VIEW__PAGE_SIZE = eINSTANCE.getUIView_PageSize();

		/**
		 * The meta object literal for the '<em><b>Is Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_VIEW__IS_DEFAULT = eINSTANCE.getUIView_IsDefault();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_VIEW__COLUMNS = eINSTANCE.getUIView_Columns();

		/**
		 * The meta object literal for the '{@link ui.impl.UIBaseImpl <em>UI Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui.impl.UIBaseImpl
		 * @see ui.impl.UiPackageImpl#getUIBase()
		 * @generated
		 */
		EClass UI_BASE = eINSTANCE.getUIBase();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_BASE__MODULES = eINSTANCE.getUIBase_Modules();

		/**
		 * The meta object literal for the '<em><b>Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_BASE__INFO = eINSTANCE.getUIBase_Info();

		/**
		 * The meta object literal for the '<em><b>Main Menu</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_BASE__MAIN_MENU = eINSTANCE.getUIBase_MainMenu();

		/**
		 * The meta object literal for the '{@link ui.impl.IdentifiableImpl <em>Identifiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui.impl.IdentifiableImpl
		 * @see ui.impl.UiPackageImpl#getIdentifiable()
		 * @generated
		 */
		EClass IDENTIFIABLE = eINSTANCE.getIdentifiable();

		/**
		 * The meta object literal for the '<em><b>Uuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE__UUID = eINSTANCE.getIdentifiable_Uuid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE__NAME = eINSTANCE.getIdentifiable_Name();

		/**
		 * The meta object literal for the '{@link ui.impl.UIMenuItemImpl <em>UI Menu Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui.impl.UIMenuItemImpl
		 * @see ui.impl.UiPackageImpl#getUIMenuItem()
		 * @generated
		 */
		EClass UI_MENU_ITEM = eINSTANCE.getUIMenuItem();

		/**
		 * The meta object literal for the '<em><b>Menu View</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_MENU_ITEM__MENU_VIEW = eINSTANCE.getUIMenuItem_MenuView();

		/**
		 * The meta object literal for the '<em><b>Filters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_MENU_ITEM__FILTERS = eINSTANCE.getUIMenuItem_Filters();

		/**
		 * The meta object literal for the '<em><b>Menu Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_MENU_ITEM__MENU_ITEMS = eINSTANCE.getUIMenuItem_MenuItems();

		/**
		 * The meta object literal for the '<em><b>Owner Menu Item</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_MENU_ITEM__OWNER_MENU_ITEM = eINSTANCE.getUIMenuItem_OwnerMenuItem();

		/**
		 * The meta object literal for the '{@link ui.impl.UIFilterImpl <em>UI Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui.impl.UIFilterImpl
		 * @see ui.impl.UiPackageImpl#getUIFilter()
		 * @generated
		 */
		EClass UI_FILTER = eINSTANCE.getUIFilter();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_FILTER__ATTRIBUTE = eINSTANCE.getUIFilter_Attribute();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_FILTER__OPERATOR = eINSTANCE.getUIFilter_Operator();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_FILTER__VALUE = eINSTANCE.getUIFilter_Value();

		/**
		 * The meta object literal for the '<em><b>Fixed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_FILTER__FIXED = eINSTANCE.getUIFilter_Fixed();

		/**
		 * The meta object literal for the '{@link ui.impl.UIIntervalImpl <em>UI Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui.impl.UIIntervalImpl
		 * @see ui.impl.UiPackageImpl#getUIInterval()
		 * @generated
		 */
		EClass UI_INTERVAL = eINSTANCE.getUIInterval();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_INTERVAL__MIN = eINSTANCE.getUIInterval_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_INTERVAL__MAX = eINSTANCE.getUIInterval_Max();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_INTERVAL__STEP = eINSTANCE.getUIInterval_Step();

		/**
		 * The meta object literal for the '{@link ui.impl.UIInfoImpl <em>UI Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui.impl.UIInfoImpl
		 * @see ui.impl.UiPackageImpl#getUIInfo()
		 * @generated
		 */
		EClass UI_INFO = eINSTANCE.getUIInfo();

		/**
		 * The meta object literal for the '<em><b>User Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_INFO__USER_CLASS = eINSTANCE.getUIInfo_UserClass();

		/**
		 * The meta object literal for the '<em><b>Versions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_INFO__VERSIONS = eINSTANCE.getUIInfo_Versions();

		/**
		 * The meta object literal for the '<em><b>Submodels</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_INFO__SUBMODELS = eINSTANCE.getUIInfo_Submodels();

		/**
		 * The meta object literal for the '{@link ui.impl.UIComponentTypeImpl <em>UI Component Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui.impl.UIComponentTypeImpl
		 * @see ui.impl.UiPackageImpl#getUIComponentType()
		 * @generated
		 */
		EClass UI_COMPONENT_TYPE = eINSTANCE.getUIComponentType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_COMPONENT_TYPE__VALUE = eINSTANCE.getUIComponentType_Value();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_COMPONENT_TYPE__LOWER = eINSTANCE.getUIComponentType_Lower();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_COMPONENT_TYPE__UPPER = eINSTANCE.getUIComponentType_Upper();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_COMPONENT_TYPE__TYPE = eINSTANCE.getUIComponentType_Type();

		/**
		 * The meta object literal for the '<em><b>Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_COMPONENT_TYPE__INTERVAL = eINSTANCE.getUIComponentType_Interval();

		/**
		 * The meta object literal for the '<em><b>Intervals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_COMPONENT_TYPE__INTERVALS = eINSTANCE.getUIComponentType_Intervals();

		/**
		 * The meta object literal for the '{@link ui.impl.UIListViewImpl <em>UI List View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui.impl.UIListViewImpl
		 * @see ui.impl.UiPackageImpl#getUIListView()
		 * @generated
		 */
		EClass UI_LIST_VIEW = eINSTANCE.getUIListView();

		/**
		 * The meta object literal for the '<em><b>Detail View</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_LIST_VIEW__DETAIL_VIEW = eINSTANCE.getUIListView_DetailView();

		/**
		 * The meta object literal for the '<em><b>Owner Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_LIST_VIEW__OWNER_CLASS = eINSTANCE.getUIListView_OwnerClass();

		/**
		 * The meta object literal for the '{@link ui.impl.UIClassViewImpl <em>UI Class View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui.impl.UIClassViewImpl
		 * @see ui.impl.UiPackageImpl#getUIClassView()
		 * @generated
		 */
		EClass UI_CLASS_VIEW = eINSTANCE.getUIClassView();

		/**
		 * The meta object literal for the '{@link ui.impl.UIResultViewImpl <em>UI Result View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui.impl.UIResultViewImpl
		 * @see ui.impl.UiPackageImpl#getUIResultView()
		 * @generated
		 */
		EClass UI_RESULT_VIEW = eINSTANCE.getUIResultView();

		/**
		 * The meta object literal for the '{@link ui.impl.UIParamViewImpl <em>UI Param View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui.impl.UIParamViewImpl
		 * @see ui.impl.UiPackageImpl#getUIParamView()
		 * @generated
		 */
		EClass UI_PARAM_VIEW = eINSTANCE.getUIParamView();

		/**
		 * The meta object literal for the '{@link ui.impl.UIBaseComponentTypeImpl <em>UI Base Component Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui.impl.UIBaseComponentTypeImpl
		 * @see ui.impl.UiPackageImpl#getUIBaseComponentType()
		 * @generated
		 */
		EClass UI_BASE_COMPONENT_TYPE = eINSTANCE.getUIBaseComponentType();

		/**
		 * The meta object literal for the '<em><b>Regexp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_BASE_COMPONENT_TYPE__REGEXP = eINSTANCE.getUIBaseComponentType_Regexp();

		/**
		 * The meta object literal for the '<em><b>Decimals</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_BASE_COMPONENT_TYPE__DECIMALS = eINSTANCE.getUIBaseComponentType_Decimals();

		/**
		 * The meta object literal for the '<em><b>Placeholder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_BASE_COMPONENT_TYPE__PLACEHOLDER = eINSTANCE.getUIBaseComponentType_Placeholder();

		/**
		 * The meta object literal for the '<em><b>Representation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_BASE_COMPONENT_TYPE__REPRESENTATION = eINSTANCE.getUIBaseComponentType_Representation();

		/**
		 * The meta object literal for the '{@link ui.impl.UIReferenceComponentTypeImpl <em>UI Reference Component Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui.impl.UIReferenceComponentTypeImpl
		 * @see ui.impl.UiPackageImpl#getUIReferenceComponentType()
		 * @generated
		 */
		EClass UI_REFERENCE_COMPONENT_TYPE = eINSTANCE.getUIReferenceComponentType();

		/**
		 * The meta object literal for the '<em><b>Referenced</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_REFERENCE_COMPONENT_TYPE__REFERENCED = eINSTANCE.getUIReferenceComponentType_Referenced();

		/**
		 * The meta object literal for the '<em><b>Opposite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_REFERENCE_COMPONENT_TYPE__OPPOSITE = eINSTANCE.getUIReferenceComponentType_Opposite();

		/**
		 * The meta object literal for the '<em><b>Navigable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_REFERENCE_COMPONENT_TYPE__NAVIGABLE = eINSTANCE.getUIReferenceComponentType_Navigable();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_REFERENCE_COMPONENT_TYPE__KIND = eINSTANCE.getUIReferenceComponentType_Kind();

		/**
		 * The meta object literal for the '{@link ui.impl.UIParameterComponentTypeImpl <em>UI Parameter Component Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui.impl.UIParameterComponentTypeImpl
		 * @see ui.impl.UiPackageImpl#getUIParameterComponentType()
		 * @generated
		 */
		EClass UI_PARAMETER_COMPONENT_TYPE = eINSTANCE.getUIParameterComponentType();

		/**
		 * The meta object literal for the '<em><b>Referenced</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_PARAMETER_COMPONENT_TYPE__REFERENCED = eINSTANCE.getUIParameterComponentType_Referenced();

		/**
		 * The meta object literal for the '{@link ui.impl.UIAttributeComponentTypeImpl <em>UI Attribute Component Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui.impl.UIAttributeComponentTypeImpl
		 * @see ui.impl.UiPackageImpl#getUIAttributeComponentType()
		 * @generated
		 */
		EClass UI_ATTRIBUTE_COMPONENT_TYPE = eINSTANCE.getUIAttributeComponentType();

		/**
		 * The meta object literal for the '<em><b>Inherited</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_ATTRIBUTE_COMPONENT_TYPE__INHERITED = eINSTANCE.getUIAttributeComponentType_Inherited();

		/**
		 * The meta object literal for the '<em><b>Derived</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_ATTRIBUTE_COMPONENT_TYPE__DERIVED = eINSTANCE.getUIAttributeComponentType_Derived();

		/**
		 * The meta object literal for the '<em><b>Private</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_ATTRIBUTE_COMPONENT_TYPE__PRIVATE = eINSTANCE.getUIAttributeComponentType_Private();

		/**
		 * The meta object literal for the '<em><b>Readonly</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_ATTRIBUTE_COMPONENT_TYPE__READONLY = eINSTANCE.getUIAttributeComponentType_Readonly();

		/**
		 * The meta object literal for the '<em><b>Disable On Create</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_ATTRIBUTE_COMPONENT_TYPE__DISABLE_ON_CREATE = eINSTANCE.getUIAttributeComponentType_DisableOnCreate();

		/**
		 * The meta object literal for the '<em><b>Owner Class</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_ATTRIBUTE_COMPONENT_TYPE__OWNER_CLASS = eINSTANCE.getUIAttributeComponentType_OwnerClass();

	}

} //UiPackage
