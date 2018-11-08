/**
 */
package psm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see psm.PsmFactory
 * @model kind="package"
 * @generated
 */
public interface PsmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "psm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://blackbelt/judo/meta/psm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "psm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PsmPackage eINSTANCE = psm.impl.PsmPackageImpl.init();

	/**
	 * The meta object id for the '{@link psm.impl.JElementImpl <em>JElement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psm.impl.JElementImpl
	 * @see psm.impl.PsmPackageImpl#getJElement()
	 * @generated
	 */
	int JELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JELEMENT__UUID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JELEMENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JELEMENT__SHORT_NAME = 2;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JELEMENT__FULL_NAME = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JELEMENT__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Framework</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JELEMENT__FRAMEWORK = 5;

	/**
	 * The feature id for the '<em><b>Participates</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JELEMENT__PARTICIPATES = 6;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JELEMENT__VISIBILITY = 7;

	/**
	 * The number of structural features of the '<em>JElement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JELEMENT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>JElement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link psm.impl.JTypeImpl <em>JType</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psm.impl.JTypeImpl
	 * @see psm.impl.PsmPackageImpl#getJType()
	 * @generated
	 */
	int JTYPE = 1;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTYPE__UUID = JELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTYPE__NAME = JELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTYPE__SHORT_NAME = JELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTYPE__FULL_NAME = JELEMENT__FULL_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTYPE__DESCRIPTION = JELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Framework</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTYPE__FRAMEWORK = JELEMENT__FRAMEWORK;

	/**
	 * The feature id for the '<em><b>Participates</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTYPE__PARTICIPATES = JELEMENT__PARTICIPATES;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTYPE__VISIBILITY = JELEMENT__VISIBILITY;

	/**
	 * The number of structural features of the '<em>JType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTYPE_FEATURE_COUNT = JELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>JType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTYPE_OPERATION_COUNT = JELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link psm.impl.JTypedElementImpl <em>JTyped Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psm.impl.JTypedElementImpl
	 * @see psm.impl.PsmPackageImpl#getJTypedElement()
	 * @generated
	 */
	int JTYPED_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTYPED_ELEMENT__UUID = JELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTYPED_ELEMENT__NAME = JELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTYPED_ELEMENT__SHORT_NAME = JELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTYPED_ELEMENT__FULL_NAME = JELEMENT__FULL_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTYPED_ELEMENT__DESCRIPTION = JELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Framework</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTYPED_ELEMENT__FRAMEWORK = JELEMENT__FRAMEWORK;

	/**
	 * The feature id for the '<em><b>Participates</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTYPED_ELEMENT__PARTICIPATES = JELEMENT__PARTICIPATES;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTYPED_ELEMENT__VISIBILITY = JELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTYPED_ELEMENT__TYPE = JELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTYPED_ELEMENT__VALUE = JELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTYPED_ELEMENT__DERIVED = JELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Calculated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTYPED_ELEMENT__CALCULATED = JELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTYPED_ELEMENT__LOWER = JELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTYPED_ELEMENT__UPPER = JELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTYPED_ELEMENT__ORDERED = JELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTYPED_ELEMENT__UNIQUE = JELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>JTyped Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTYPED_ELEMENT_FEATURE_COUNT = JELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>JTyped Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTYPED_ELEMENT_OPERATION_COUNT = JELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link psm.impl.JPrimitiveImpl <em>JPrimitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psm.impl.JPrimitiveImpl
	 * @see psm.impl.PsmPackageImpl#getJPrimitive()
	 * @generated
	 */
	int JPRIMITIVE = 3;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPRIMITIVE__UUID = JTYPE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPRIMITIVE__NAME = JTYPE__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPRIMITIVE__SHORT_NAME = JTYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPRIMITIVE__FULL_NAME = JTYPE__FULL_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPRIMITIVE__DESCRIPTION = JTYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Framework</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPRIMITIVE__FRAMEWORK = JTYPE__FRAMEWORK;

	/**
	 * The feature id for the '<em><b>Participates</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPRIMITIVE__PARTICIPATES = JTYPE__PARTICIPATES;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPRIMITIVE__VISIBILITY = JTYPE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPRIMITIVE__PACKAGE = JTYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Use For Id Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPRIMITIVE__USE_FOR_ID_TYPE = JTYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>JPrimitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPRIMITIVE_FEATURE_COUNT = JTYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>JPrimitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPRIMITIVE_OPERATION_COUNT = JTYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link psm.impl.JEnumerationImpl <em>JEnumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psm.impl.JEnumerationImpl
	 * @see psm.impl.PsmPackageImpl#getJEnumeration()
	 * @generated
	 */
	int JENUMERATION = 4;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JENUMERATION__UUID = JTYPE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JENUMERATION__NAME = JTYPE__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JENUMERATION__SHORT_NAME = JTYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JENUMERATION__FULL_NAME = JTYPE__FULL_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JENUMERATION__DESCRIPTION = JTYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Framework</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JENUMERATION__FRAMEWORK = JTYPE__FRAMEWORK;

	/**
	 * The feature id for the '<em><b>Participates</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JENUMERATION__PARTICIPATES = JTYPE__PARTICIPATES;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JENUMERATION__VISIBILITY = JTYPE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JENUMERATION__PACKAGE = JTYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JENUMERATION__LITERALS = JTYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Class Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JENUMERATION__CLASS_REPRESENTATION = JTYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>JEnumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JENUMERATION_FEATURE_COUNT = JTYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>JEnumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JENUMERATION_OPERATION_COUNT = JTYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link psm.impl.JClassImpl <em>JClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psm.impl.JClassImpl
	 * @see psm.impl.PsmPackageImpl#getJClass()
	 * @generated
	 */
	int JCLASS = 5;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__UUID = JTYPE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__NAME = JTYPE__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__SHORT_NAME = JTYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__FULL_NAME = JTYPE__FULL_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__DESCRIPTION = JTYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Framework</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__FRAMEWORK = JTYPE__FRAMEWORK;

	/**
	 * The feature id for the '<em><b>Participates</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__PARTICIPATES = JTYPE__PARTICIPATES;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__VISIBILITY = JTYPE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__ABSTRACT = JTYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>State Machines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__STATE_MACHINES = JTYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__OPERATIONS = JTYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attribute Order</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__ATTRIBUTE_ORDER = JTYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Attributes For Listing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__ATTRIBUTES_FOR_LISTING = JTYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Fixed Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__FIXED_ENUM = JTYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Represents Tenant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__REPRESENTS_TENANT = JTYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Tenant Member</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__TENANT_MEMBER = JTYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__REPRESENTATION = JTYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Represents Enum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__REPRESENTS_ENUM = JTYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Represents Tenant User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__REPRESENTS_TENANT_USER = JTYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Represents User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__REPRESENTS_USER = JTYPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Supertype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__SUPERTYPE = JTYPE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__PACKAGE = JTYPE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__ROLES = JTYPE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__ATTRIBUTES = JTYPE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Business Singleton</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__BUSINESS_SINGLETON = JTYPE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__ALIASES = JTYPE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Watched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__WATCHED = JTYPE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Represents Enum Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__REPRESENTS_ENUM_VALUE = JTYPE_FEATURE_COUNT + 19;

	/**
	 * The number of structural features of the '<em>JClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS_FEATURE_COUNT = JTYPE_FEATURE_COUNT + 20;

	/**
	 * The number of operations of the '<em>JClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS_OPERATION_COUNT = JTYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link psm.impl.JAttributeImpl <em>JAttribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psm.impl.JAttributeImpl
	 * @see psm.impl.PsmPackageImpl#getJAttribute()
	 * @generated
	 */
	int JATTRIBUTE = 6;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JATTRIBUTE__UUID = JTYPED_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JATTRIBUTE__NAME = JTYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JATTRIBUTE__SHORT_NAME = JTYPED_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JATTRIBUTE__FULL_NAME = JTYPED_ELEMENT__FULL_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JATTRIBUTE__DESCRIPTION = JTYPED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Framework</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JATTRIBUTE__FRAMEWORK = JTYPED_ELEMENT__FRAMEWORK;

	/**
	 * The feature id for the '<em><b>Participates</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JATTRIBUTE__PARTICIPATES = JTYPED_ELEMENT__PARTICIPATES;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JATTRIBUTE__VISIBILITY = JTYPED_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JATTRIBUTE__TYPE = JTYPED_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JATTRIBUTE__VALUE = JTYPED_ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JATTRIBUTE__DERIVED = JTYPED_ELEMENT__DERIVED;

	/**
	 * The feature id for the '<em><b>Calculated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JATTRIBUTE__CALCULATED = JTYPED_ELEMENT__CALCULATED;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JATTRIBUTE__LOWER = JTYPED_ELEMENT__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JATTRIBUTE__UPPER = JTYPED_ELEMENT__UPPER;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JATTRIBUTE__ORDERED = JTYPED_ELEMENT__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JATTRIBUTE__UNIQUE = JTYPED_ELEMENT__UNIQUE;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JATTRIBUTE__PLACEHOLDER = JTYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Regexp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JATTRIBUTE__REGEXP = JTYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JATTRIBUTE__MANDATORY = JTYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Decimals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JATTRIBUTE__DECIMALS = JTYPED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JATTRIBUTE__INTERVAL = JTYPED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Technical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JATTRIBUTE__TECHNICAL = JTYPED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Owner Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JATTRIBUTE__OWNER_CLASS = JTYPED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Ui No Search</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JATTRIBUTE__UI_NO_SEARCH = JTYPED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Watched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JATTRIBUTE__WATCHED = JTYPED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Represents Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JATTRIBUTE__REPRESENTS_ID = JTYPED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>JAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JATTRIBUTE_FEATURE_COUNT = JTYPED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>JAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JATTRIBUTE_OPERATION_COUNT = JTYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link psm.impl.JOperationImpl <em>JOperation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psm.impl.JOperationImpl
	 * @see psm.impl.PsmPackageImpl#getJOperation()
	 * @generated
	 */
	int JOPERATION = 7;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOPERATION__UUID = JELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOPERATION__NAME = JELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOPERATION__SHORT_NAME = JELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOPERATION__FULL_NAME = JELEMENT__FULL_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOPERATION__DESCRIPTION = JELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Framework</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOPERATION__FRAMEWORK = JELEMENT__FRAMEWORK;

	/**
	 * The feature id for the '<em><b>Participates</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOPERATION__PARTICIPATES = JELEMENT__PARTICIPATES;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOPERATION__VISIBILITY = JELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Class Based</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOPERATION__CLASS_BASED = JELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owner Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOPERATION__OWNER_CLASS = JELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOPERATION__PARAMETERS = JELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOPERATION__TRANSITION = JELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bulk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOPERATION__BULK = JELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOPERATION__KIND = JELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ui Must Confirm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOPERATION__UI_MUST_CONFIRM = JELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>JOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOPERATION_FEATURE_COUNT = JELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>JOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOPERATION_OPERATION_COUNT = JELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link psm.impl.JParameterImpl <em>JParameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psm.impl.JParameterImpl
	 * @see psm.impl.PsmPackageImpl#getJParameter()
	 * @generated
	 */
	int JPARAMETER = 8;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPARAMETER__UUID = JTYPED_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPARAMETER__NAME = JTYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPARAMETER__SHORT_NAME = JTYPED_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPARAMETER__FULL_NAME = JTYPED_ELEMENT__FULL_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPARAMETER__DESCRIPTION = JTYPED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Framework</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPARAMETER__FRAMEWORK = JTYPED_ELEMENT__FRAMEWORK;

	/**
	 * The feature id for the '<em><b>Participates</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPARAMETER__PARTICIPATES = JTYPED_ELEMENT__PARTICIPATES;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPARAMETER__VISIBILITY = JTYPED_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPARAMETER__TYPE = JTYPED_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPARAMETER__VALUE = JTYPED_ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPARAMETER__DERIVED = JTYPED_ELEMENT__DERIVED;

	/**
	 * The feature id for the '<em><b>Calculated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPARAMETER__CALCULATED = JTYPED_ELEMENT__CALCULATED;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPARAMETER__LOWER = JTYPED_ELEMENT__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPARAMETER__UPPER = JTYPED_ELEMENT__UPPER;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPARAMETER__ORDERED = JTYPED_ELEMENT__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPARAMETER__UNIQUE = JTYPED_ELEMENT__UNIQUE;

	/**
	 * The feature id for the '<em><b>Owner Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPARAMETER__OWNER_OPERATION = JTYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPARAMETER__INPUT = JTYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPARAMETER__INTERVAL = JTYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>JParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPARAMETER_FEATURE_COUNT = JTYPED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>JParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPARAMETER_OPERATION_COUNT = JTYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link psm.impl.JRelationshipImpl <em>JRelationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psm.impl.JRelationshipImpl
	 * @see psm.impl.PsmPackageImpl#getJRelationship()
	 * @generated
	 */
	int JRELATIONSHIP = 9;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JRELATIONSHIP__UUID = JELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JRELATIONSHIP__NAME = JELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JRELATIONSHIP__SHORT_NAME = JELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JRELATIONSHIP__FULL_NAME = JELEMENT__FULL_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JRELATIONSHIP__DESCRIPTION = JELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Framework</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JRELATIONSHIP__FRAMEWORK = JELEMENT__FRAMEWORK;

	/**
	 * The feature id for the '<em><b>Participates</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JRELATIONSHIP__PARTICIPATES = JELEMENT__PARTICIPATES;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JRELATIONSHIP__VISIBILITY = JELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JRELATIONSHIP__PACKAGE = JELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JRELATIONSHIP__ROLES = JELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JRELATIONSHIP__DERIVED = JELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>JRelationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JRELATIONSHIP_FEATURE_COUNT = JELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>JRelationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JRELATIONSHIP_OPERATION_COUNT = JELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link psm.impl.JRoleImpl <em>JRole</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psm.impl.JRoleImpl
	 * @see psm.impl.PsmPackageImpl#getJRole()
	 * @generated
	 */
	int JROLE = 10;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JROLE__UUID = JELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JROLE__NAME = JELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JROLE__SHORT_NAME = JELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JROLE__FULL_NAME = JELEMENT__FULL_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JROLE__DESCRIPTION = JELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Framework</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JROLE__FRAMEWORK = JELEMENT__FRAMEWORK;

	/**
	 * The feature id for the '<em><b>Participates</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JROLE__PARTICIPATES = JELEMENT__PARTICIPATES;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JROLE__VISIBILITY = JELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JROLE__LOWER = JELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JROLE__UPPER = JELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Navigable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JROLE__NAVIGABLE = JELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JROLE__UNIQUE = JELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JROLE__ORDERED = JELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Owner Relationship</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JROLE__OWNER_RELATIONSHIP = JELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Derived Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JROLE__DERIVED_EXPRESSION = JELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Derived Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JROLE__DERIVED_DESCRIPTION = JELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JROLE__KIND = JELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Option Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JROLE__OPTION_SCRIPT = JELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Owner Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JROLE__OWNER_CLASS = JELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JROLE__VALUE = JELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Calculated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JROLE__CALCULATED = JELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JROLE__INTERVAL = JELEMENT_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>JRole</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JROLE_FEATURE_COUNT = JELEMENT_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>JRole</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JROLE_OPERATION_COUNT = JELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link psm.impl.JLiteralImpl <em>JLiteral</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psm.impl.JLiteralImpl
	 * @see psm.impl.PsmPackageImpl#getJLiteral()
	 * @generated
	 */
	int JLITERAL = 11;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JLITERAL__UUID = JELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JLITERAL__NAME = JELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JLITERAL__SHORT_NAME = JELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JLITERAL__FULL_NAME = JELEMENT__FULL_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JLITERAL__DESCRIPTION = JELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Framework</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JLITERAL__FRAMEWORK = JELEMENT__FRAMEWORK;

	/**
	 * The feature id for the '<em><b>Participates</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JLITERAL__PARTICIPATES = JELEMENT__PARTICIPATES;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JLITERAL__VISIBILITY = JELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Enumeration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JLITERAL__ENUMERATION = JELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>JLiteral</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JLITERAL_FEATURE_COUNT = JELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>JLiteral</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JLITERAL_OPERATION_COUNT = JELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link psm.impl.JPackageImpl <em>JPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psm.impl.JPackageImpl
	 * @see psm.impl.PsmPackageImpl#getJPackage()
	 * @generated
	 */
	int JPACKAGE = 12;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPACKAGE__UUID = JELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPACKAGE__NAME = JELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPACKAGE__SHORT_NAME = JELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPACKAGE__FULL_NAME = JELEMENT__FULL_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPACKAGE__DESCRIPTION = JELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Framework</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPACKAGE__FRAMEWORK = JELEMENT__FRAMEWORK;

	/**
	 * The feature id for the '<em><b>Participates</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPACKAGE__PARTICIPATES = JELEMENT__PARTICIPATES;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPACKAGE__VISIBILITY = JELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Enumerations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPACKAGE__ENUMERATIONS = JELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Primitives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPACKAGE__PRIMITIVES = JELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPACKAGE__RELATIONSHIPS = JELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPACKAGE__CHILDREN = JELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPACKAGE__PARENT = JELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Owner Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPACKAGE__OWNER_MODEL = JELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPACKAGE__CLASSES = JELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>JPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPACKAGE_FEATURE_COUNT = JELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>JPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPACKAGE_OPERATION_COUNT = JELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link psm.impl.JStateMachineImpl <em>JState Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psm.impl.JStateMachineImpl
	 * @see psm.impl.PsmPackageImpl#getJStateMachine()
	 * @generated
	 */
	int JSTATE_MACHINE = 13;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSTATE_MACHINE__UUID = JELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSTATE_MACHINE__NAME = JELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSTATE_MACHINE__SHORT_NAME = JELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSTATE_MACHINE__FULL_NAME = JELEMENT__FULL_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSTATE_MACHINE__DESCRIPTION = JELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Framework</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSTATE_MACHINE__FRAMEWORK = JELEMENT__FRAMEWORK;

	/**
	 * The feature id for the '<em><b>Participates</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSTATE_MACHINE__PARTICIPATES = JELEMENT__PARTICIPATES;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSTATE_MACHINE__VISIBILITY = JELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owner Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSTATE_MACHINE__OWNER_CLASS = JELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSTATE_MACHINE__STATES = JELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSTATE_MACHINE__TRANSITIONS = JELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Corresponding Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSTATE_MACHINE__CORRESPONDING_ENUM = JELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>JState Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSTATE_MACHINE_FEATURE_COUNT = JELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>JState Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSTATE_MACHINE_OPERATION_COUNT = JELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link psm.impl.JTransitionImpl <em>JTransition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psm.impl.JTransitionImpl
	 * @see psm.impl.PsmPackageImpl#getJTransition()
	 * @generated
	 */
	int JTRANSITION = 14;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTRANSITION__UUID = JELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTRANSITION__NAME = JELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTRANSITION__SHORT_NAME = JELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTRANSITION__FULL_NAME = JELEMENT__FULL_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTRANSITION__DESCRIPTION = JELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Framework</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTRANSITION__FRAMEWORK = JELEMENT__FRAMEWORK;

	/**
	 * The feature id for the '<em><b>Participates</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTRANSITION__PARTICIPATES = JELEMENT__PARTICIPATES;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTRANSITION__VISIBILITY = JELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>State Machine</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTRANSITION__STATE_MACHINE = JELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTRANSITION__GUARD = JELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>To State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTRANSITION__TO_STATE = JELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>From State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTRANSITION__FROM_STATE = JELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Executing Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTRANSITION__EXECUTING_OPERATION = JELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>JTransition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTRANSITION_FEATURE_COUNT = JELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>JTransition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTRANSITION_OPERATION_COUNT = JELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link psm.impl.JStateImpl <em>JState</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psm.impl.JStateImpl
	 * @see psm.impl.PsmPackageImpl#getJState()
	 * @generated
	 */
	int JSTATE = 15;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSTATE__UUID = JELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSTATE__NAME = JELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSTATE__SHORT_NAME = JELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSTATE__FULL_NAME = JELEMENT__FULL_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSTATE__DESCRIPTION = JELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Framework</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSTATE__FRAMEWORK = JELEMENT__FRAMEWORK;

	/**
	 * The feature id for the '<em><b>Participates</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSTATE__PARTICIPATES = JELEMENT__PARTICIPATES;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSTATE__VISIBILITY = JELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owner State Machine</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSTATE__OWNER_STATE_MACHINE = JELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSTATE__INCOMING_TRANSITIONS = JELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSTATE__OUTGOING_TRANSITIONS = JELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSTATE__INITIAL_STATE = JELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Final State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSTATE__FINAL_STATE = JELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>JState</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSTATE_FEATURE_COUNT = JELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>JState</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSTATE_OPERATION_COUNT = JELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link psm.impl.JGuardImpl <em>JGuard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psm.impl.JGuardImpl
	 * @see psm.impl.PsmPackageImpl#getJGuard()
	 * @generated
	 */
	int JGUARD = 16;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JGUARD__UUID = JELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JGUARD__NAME = JELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JGUARD__SHORT_NAME = JELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JGUARD__FULL_NAME = JELEMENT__FULL_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JGUARD__DESCRIPTION = JELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Framework</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JGUARD__FRAMEWORK = JELEMENT__FRAMEWORK;

	/**
	 * The feature id for the '<em><b>Participates</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JGUARD__PARTICIPATES = JELEMENT__PARTICIPATES;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JGUARD__VISIBILITY = JELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JGUARD__TRANSITION = JELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JGUARD__TEXT = JELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JGUARD__EXPRESSION = JELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>JGuard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JGUARD_FEATURE_COUNT = JELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>JGuard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JGUARD_OPERATION_COUNT = JELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link psm.impl.JModelImpl <em>JModel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psm.impl.JModelImpl
	 * @see psm.impl.PsmPackageImpl#getJModel()
	 * @generated
	 */
	int JMODEL = 17;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMODEL__UUID = JELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMODEL__NAME = JELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMODEL__SHORT_NAME = JELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMODEL__FULL_NAME = JELEMENT__FULL_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMODEL__DESCRIPTION = JELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Framework</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMODEL__FRAMEWORK = JELEMENT__FRAMEWORK;

	/**
	 * The feature id for the '<em><b>Participates</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMODEL__PARTICIPATES = JELEMENT__PARTICIPATES;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMODEL__VISIBILITY = JELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMODEL__PACKAGES = JELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Package Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMODEL__PACKAGE_PREFIX = JELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Application Top</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMODEL__APPLICATION_TOP = JELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Root Menu Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMODEL__ROOT_MENU_ITEMS = JELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMODEL__INFO = JELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>JModel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMODEL_FEATURE_COUNT = JELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>JModel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMODEL_OPERATION_COUNT = JELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link psm.impl.JUIMenuItemImpl <em>JUI Menu Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psm.impl.JUIMenuItemImpl
	 * @see psm.impl.PsmPackageImpl#getJUIMenuItem()
	 * @generated
	 */
	int JUI_MENU_ITEM = 18;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUI_MENU_ITEM__UUID = JELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUI_MENU_ITEM__NAME = JELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUI_MENU_ITEM__SHORT_NAME = JELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUI_MENU_ITEM__FULL_NAME = JELEMENT__FULL_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUI_MENU_ITEM__DESCRIPTION = JELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Framework</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUI_MENU_ITEM__FRAMEWORK = JELEMENT__FRAMEWORK;

	/**
	 * The feature id for the '<em><b>Participates</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUI_MENU_ITEM__PARTICIPATES = JELEMENT__PARTICIPATES;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUI_MENU_ITEM__VISIBILITY = JELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUI_MENU_ITEM__CHILDREN = JELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUI_MENU_ITEM__PARENT = JELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Represent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUI_MENU_ITEM__REPRESENT = JELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Uifilters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUI_MENU_ITEM__UIFILTERS = JELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUI_MENU_ITEM__TYPE = JELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUI_MENU_ITEM__ALIAS = JELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>JUI Menu Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUI_MENU_ITEM_FEATURE_COUNT = JELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>JUI Menu Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUI_MENU_ITEM_OPERATION_COUNT = JELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link psm.impl.JUIAttributeGroupImpl <em>JUI Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psm.impl.JUIAttributeGroupImpl
	 * @see psm.impl.PsmPackageImpl#getJUIAttributeGroup()
	 * @generated
	 */
	int JUI_ATTRIBUTE_GROUP = 19;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUI_ATTRIBUTE_GROUP__UUID = JELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUI_ATTRIBUTE_GROUP__NAME = JELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUI_ATTRIBUTE_GROUP__SHORT_NAME = JELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUI_ATTRIBUTE_GROUP__FULL_NAME = JELEMENT__FULL_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUI_ATTRIBUTE_GROUP__DESCRIPTION = JELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Framework</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUI_ATTRIBUTE_GROUP__FRAMEWORK = JELEMENT__FRAMEWORK;

	/**
	 * The feature id for the '<em><b>Participates</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUI_ATTRIBUTE_GROUP__PARTICIPATES = JELEMENT__PARTICIPATES;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUI_ATTRIBUTE_GROUP__VISIBILITY = JELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUI_ATTRIBUTE_GROUP__ATTRIBUTES = JELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUI_ATTRIBUTE_GROUP__POSITION = JELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>JUI Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUI_ATTRIBUTE_GROUP_FEATURE_COUNT = JELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>JUI Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUI_ATTRIBUTE_GROUP_OPERATION_COUNT = JELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link psm.impl.JUIFilterImpl <em>JUI Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psm.impl.JUIFilterImpl
	 * @see psm.impl.PsmPackageImpl#getJUIFilter()
	 * @generated
	 */
	int JUI_FILTER = 20;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUI_FILTER__UUID = JELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUI_FILTER__NAME = JELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUI_FILTER__SHORT_NAME = JELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUI_FILTER__FULL_NAME = JELEMENT__FULL_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUI_FILTER__DESCRIPTION = JELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Framework</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUI_FILTER__FRAMEWORK = JELEMENT__FRAMEWORK;

	/**
	 * The feature id for the '<em><b>Participates</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUI_FILTER__PARTICIPATES = JELEMENT__PARTICIPATES;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUI_FILTER__VISIBILITY = JELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUI_FILTER__ATTRIBUTE = JELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUI_FILTER__OPERATOR = JELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUI_FILTER__VALUE = JELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>JUI Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUI_FILTER_FEATURE_COUNT = JELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>JUI Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUI_FILTER_OPERATION_COUNT = JELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link psm.impl.JUIAliasImpl <em>JUI Alias</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psm.impl.JUIAliasImpl
	 * @see psm.impl.PsmPackageImpl#getJUIAlias()
	 * @generated
	 */
	int JUI_ALIAS = 21;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUI_ALIAS__UUID = JELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUI_ALIAS__NAME = JELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUI_ALIAS__SHORT_NAME = JELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUI_ALIAS__FULL_NAME = JELEMENT__FULL_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUI_ALIAS__DESCRIPTION = JELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Framework</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUI_ALIAS__FRAMEWORK = JELEMENT__FRAMEWORK;

	/**
	 * The feature id for the '<em><b>Participates</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUI_ALIAS__PARTICIPATES = JELEMENT__PARTICIPATES;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUI_ALIAS__VISIBILITY = JELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owner Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUI_ALIAS__OWNER_CLASS = JELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>JUI Alias</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUI_ALIAS_FEATURE_COUNT = JELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>JUI Alias</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUI_ALIAS_OPERATION_COUNT = JELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link psm.impl.JInfoImpl <em>JInfo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psm.impl.JInfoImpl
	 * @see psm.impl.PsmPackageImpl#getJInfo()
	 * @generated
	 */
	int JINFO = 22;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JINFO__UUID = JELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JINFO__NAME = JELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JINFO__SHORT_NAME = JELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JINFO__FULL_NAME = JELEMENT__FULL_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JINFO__DESCRIPTION = JELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Framework</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JINFO__FRAMEWORK = JELEMENT__FRAMEWORK;

	/**
	 * The feature id for the '<em><b>Participates</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JINFO__PARTICIPATES = JELEMENT__PARTICIPATES;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JINFO__VISIBILITY = JELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Submodels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JINFO__SUBMODELS = JELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>JInfo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JINFO_FEATURE_COUNT = JELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>JInfo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JINFO_OPERATION_COUNT = JELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link psm.impl.JSubmodelImpl <em>JSubmodel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psm.impl.JSubmodelImpl
	 * @see psm.impl.PsmPackageImpl#getJSubmodel()
	 * @generated
	 */
	int JSUBMODEL = 23;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSUBMODEL__UUID = JELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSUBMODEL__NAME = JELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSUBMODEL__SHORT_NAME = JELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSUBMODEL__FULL_NAME = JELEMENT__FULL_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSUBMODEL__DESCRIPTION = JELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Framework</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSUBMODEL__FRAMEWORK = JELEMENT__FRAMEWORK;

	/**
	 * The feature id for the '<em><b>Participates</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSUBMODEL__PARTICIPATES = JELEMENT__PARTICIPATES;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSUBMODEL__VISIBILITY = JELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSUBMODEL__VERSION = JELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>JSubmodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSUBMODEL_FEATURE_COUNT = JELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>JSubmodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSUBMODEL_OPERATION_COUNT = JELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link psm.JVisibility <em>JVisibility</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psm.JVisibility
	 * @see psm.impl.PsmPackageImpl#getJVisibility()
	 * @generated
	 */
	int JVISIBILITY = 24;

	/**
	 * The meta object id for the '{@link psm.JAssociationKind <em>JAssociation Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psm.JAssociationKind
	 * @see psm.impl.PsmPackageImpl#getJAssociationKind()
	 * @generated
	 */
	int JASSOCIATION_KIND = 25;

	/**
	 * The meta object id for the '{@link psm.JOperationKind <em>JOperation Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psm.JOperationKind
	 * @see psm.impl.PsmPackageImpl#getJOperationKind()
	 * @generated
	 */
	int JOPERATION_KIND = 26;

	/**
	 * The meta object id for the '{@link psm.JLayer <em>JLayer</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psm.JLayer
	 * @see psm.impl.PsmPackageImpl#getJLayer()
	 * @generated
	 */
	int JLAYER = 27;

	/**
	 * The meta object id for the '{@link psm.JMenuItemType <em>JMenu Item Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psm.JMenuItemType
	 * @see psm.impl.PsmPackageImpl#getJMenuItemType()
	 * @generated
	 */
	int JMENU_ITEM_TYPE = 28;

	/**
	 * The meta object id for the '{@link psm.JOperator <em>JOperator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psm.JOperator
	 * @see psm.impl.PsmPackageImpl#getJOperator()
	 * @generated
	 */
	int JOPERATOR = 29;


	/**
	 * Returns the meta object for class '{@link psm.JElement <em>JElement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JElement</em>'.
	 * @see psm.JElement
	 * @generated
	 */
	EClass getJElement();

	/**
	 * Returns the meta object for the attribute '{@link psm.JElement#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see psm.JElement#getUuid()
	 * @see #getJElement()
	 * @generated
	 */
	EAttribute getJElement_Uuid();

	/**
	 * Returns the meta object for the attribute '{@link psm.JElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see psm.JElement#getName()
	 * @see #getJElement()
	 * @generated
	 */
	EAttribute getJElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link psm.JElement#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Name</em>'.
	 * @see psm.JElement#getShortName()
	 * @see #getJElement()
	 * @generated
	 */
	EAttribute getJElement_ShortName();

	/**
	 * Returns the meta object for the attribute '{@link psm.JElement#getFullName <em>Full Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Name</em>'.
	 * @see psm.JElement#getFullName()
	 * @see #getJElement()
	 * @generated
	 */
	EAttribute getJElement_FullName();

	/**
	 * Returns the meta object for the attribute '{@link psm.JElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see psm.JElement#getDescription()
	 * @see #getJElement()
	 * @generated
	 */
	EAttribute getJElement_Description();

	/**
	 * Returns the meta object for the attribute '{@link psm.JElement#isFramework <em>Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Framework</em>'.
	 * @see psm.JElement#isFramework()
	 * @see #getJElement()
	 * @generated
	 */
	EAttribute getJElement_Framework();

	/**
	 * Returns the meta object for the attribute list '{@link psm.JElement#getParticipates <em>Participates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Participates</em>'.
	 * @see psm.JElement#getParticipates()
	 * @see #getJElement()
	 * @generated
	 */
	EAttribute getJElement_Participates();

	/**
	 * Returns the meta object for the attribute '{@link psm.JElement#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see psm.JElement#getVisibility()
	 * @see #getJElement()
	 * @generated
	 */
	EAttribute getJElement_Visibility();

	/**
	 * Returns the meta object for class '{@link psm.JType <em>JType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JType</em>'.
	 * @see psm.JType
	 * @generated
	 */
	EClass getJType();

	/**
	 * Returns the meta object for class '{@link psm.JTypedElement <em>JTyped Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JTyped Element</em>'.
	 * @see psm.JTypedElement
	 * @generated
	 */
	EClass getJTypedElement();

	/**
	 * Returns the meta object for the reference '{@link psm.JTypedElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see psm.JTypedElement#getType()
	 * @see #getJTypedElement()
	 * @generated
	 */
	EReference getJTypedElement_Type();

	/**
	 * Returns the meta object for the attribute '{@link psm.JTypedElement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see psm.JTypedElement#getValue()
	 * @see #getJTypedElement()
	 * @generated
	 */
	EAttribute getJTypedElement_Value();

	/**
	 * Returns the meta object for the attribute '{@link psm.JTypedElement#isDerived <em>Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derived</em>'.
	 * @see psm.JTypedElement#isDerived()
	 * @see #getJTypedElement()
	 * @generated
	 */
	EAttribute getJTypedElement_Derived();

	/**
	 * Returns the meta object for the attribute '{@link psm.JTypedElement#isCalculated <em>Calculated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calculated</em>'.
	 * @see psm.JTypedElement#isCalculated()
	 * @see #getJTypedElement()
	 * @generated
	 */
	EAttribute getJTypedElement_Calculated();

	/**
	 * Returns the meta object for the attribute '{@link psm.JTypedElement#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower</em>'.
	 * @see psm.JTypedElement#getLower()
	 * @see #getJTypedElement()
	 * @generated
	 */
	EAttribute getJTypedElement_Lower();

	/**
	 * Returns the meta object for the attribute '{@link psm.JTypedElement#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper</em>'.
	 * @see psm.JTypedElement#getUpper()
	 * @see #getJTypedElement()
	 * @generated
	 */
	EAttribute getJTypedElement_Upper();

	/**
	 * Returns the meta object for the attribute '{@link psm.JTypedElement#isOrdered <em>Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordered</em>'.
	 * @see psm.JTypedElement#isOrdered()
	 * @see #getJTypedElement()
	 * @generated
	 */
	EAttribute getJTypedElement_Ordered();

	/**
	 * Returns the meta object for the attribute '{@link psm.JTypedElement#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see psm.JTypedElement#isUnique()
	 * @see #getJTypedElement()
	 * @generated
	 */
	EAttribute getJTypedElement_Unique();

	/**
	 * Returns the meta object for class '{@link psm.JPrimitive <em>JPrimitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JPrimitive</em>'.
	 * @see psm.JPrimitive
	 * @generated
	 */
	EClass getJPrimitive();

	/**
	 * Returns the meta object for the container reference '{@link psm.JPrimitive#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Package</em>'.
	 * @see psm.JPrimitive#getPackage()
	 * @see #getJPrimitive()
	 * @generated
	 */
	EReference getJPrimitive_Package();

	/**
	 * Returns the meta object for the attribute '{@link psm.JPrimitive#isUseForIdType <em>Use For Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use For Id Type</em>'.
	 * @see psm.JPrimitive#isUseForIdType()
	 * @see #getJPrimitive()
	 * @generated
	 */
	EAttribute getJPrimitive_UseForIdType();

	/**
	 * Returns the meta object for class '{@link psm.JEnumeration <em>JEnumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JEnumeration</em>'.
	 * @see psm.JEnumeration
	 * @generated
	 */
	EClass getJEnumeration();

	/**
	 * Returns the meta object for the container reference '{@link psm.JEnumeration#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Package</em>'.
	 * @see psm.JEnumeration#getPackage()
	 * @see #getJEnumeration()
	 * @generated
	 */
	EReference getJEnumeration_Package();

	/**
	 * Returns the meta object for the containment reference list '{@link psm.JEnumeration#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literals</em>'.
	 * @see psm.JEnumeration#getLiterals()
	 * @see #getJEnumeration()
	 * @generated
	 */
	EReference getJEnumeration_Literals();

	/**
	 * Returns the meta object for the reference '{@link psm.JEnumeration#getClassRepresentation <em>Class Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class Representation</em>'.
	 * @see psm.JEnumeration#getClassRepresentation()
	 * @see #getJEnumeration()
	 * @generated
	 */
	EReference getJEnumeration_ClassRepresentation();

	/**
	 * Returns the meta object for class '{@link psm.JClass <em>JClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JClass</em>'.
	 * @see psm.JClass
	 * @generated
	 */
	EClass getJClass();

	/**
	 * Returns the meta object for the attribute '{@link psm.JClass#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see psm.JClass#isAbstract()
	 * @see #getJClass()
	 * @generated
	 */
	EAttribute getJClass_Abstract();

	/**
	 * Returns the meta object for the containment reference list '{@link psm.JClass#getStateMachines <em>State Machines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State Machines</em>'.
	 * @see psm.JClass#getStateMachines()
	 * @see #getJClass()
	 * @generated
	 */
	EReference getJClass_StateMachines();

	/**
	 * Returns the meta object for the containment reference list '{@link psm.JClass#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see psm.JClass#getOperations()
	 * @see #getJClass()
	 * @generated
	 */
	EReference getJClass_Operations();

	/**
	 * Returns the meta object for the containment reference list '{@link psm.JClass#getAttributeOrder <em>Attribute Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Order</em>'.
	 * @see psm.JClass#getAttributeOrder()
	 * @see #getJClass()
	 * @generated
	 */
	EReference getJClass_AttributeOrder();

	/**
	 * Returns the meta object for the reference list '{@link psm.JClass#getAttributesForListing <em>Attributes For Listing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attributes For Listing</em>'.
	 * @see psm.JClass#getAttributesForListing()
	 * @see #getJClass()
	 * @generated
	 */
	EReference getJClass_AttributesForListing();

	/**
	 * Returns the meta object for the reference '{@link psm.JClass#getFixedEnum <em>Fixed Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fixed Enum</em>'.
	 * @see psm.JClass#getFixedEnum()
	 * @see #getJClass()
	 * @generated
	 */
	EReference getJClass_FixedEnum();

	/**
	 * Returns the meta object for the attribute '{@link psm.JClass#isRepresentsTenant <em>Represents Tenant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Represents Tenant</em>'.
	 * @see psm.JClass#isRepresentsTenant()
	 * @see #getJClass()
	 * @generated
	 */
	EAttribute getJClass_RepresentsTenant();

	/**
	 * Returns the meta object for the attribute '{@link psm.JClass#isTenantMember <em>Tenant Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tenant Member</em>'.
	 * @see psm.JClass#isTenantMember()
	 * @see #getJClass()
	 * @generated
	 */
	EAttribute getJClass_TenantMember();

	/**
	 * Returns the meta object for the reference '{@link psm.JClass#getRepresentation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Representation</em>'.
	 * @see psm.JClass#getRepresentation()
	 * @see #getJClass()
	 * @generated
	 */
	EReference getJClass_Representation();

	/**
	 * Returns the meta object for the attribute '{@link psm.JClass#isRepresentsEnum <em>Represents Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Represents Enum</em>'.
	 * @see psm.JClass#isRepresentsEnum()
	 * @see #getJClass()
	 * @generated
	 */
	EAttribute getJClass_RepresentsEnum();

	/**
	 * Returns the meta object for the attribute '{@link psm.JClass#isRepresentsTenantUser <em>Represents Tenant User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Represents Tenant User</em>'.
	 * @see psm.JClass#isRepresentsTenantUser()
	 * @see #getJClass()
	 * @generated
	 */
	EAttribute getJClass_RepresentsTenantUser();

	/**
	 * Returns the meta object for the attribute '{@link psm.JClass#isRepresentsUser <em>Represents User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Represents User</em>'.
	 * @see psm.JClass#isRepresentsUser()
	 * @see #getJClass()
	 * @generated
	 */
	EAttribute getJClass_RepresentsUser();

	/**
	 * Returns the meta object for the reference '{@link psm.JClass#getSupertype <em>Supertype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Supertype</em>'.
	 * @see psm.JClass#getSupertype()
	 * @see #getJClass()
	 * @generated
	 */
	EReference getJClass_Supertype();

	/**
	 * Returns the meta object for the container reference '{@link psm.JClass#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Package</em>'.
	 * @see psm.JClass#getPackage()
	 * @see #getJClass()
	 * @generated
	 */
	EReference getJClass_Package();

	/**
	 * Returns the meta object for the reference list '{@link psm.JClass#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roles</em>'.
	 * @see psm.JClass#getRoles()
	 * @see #getJClass()
	 * @generated
	 */
	EReference getJClass_Roles();

	/**
	 * Returns the meta object for the containment reference list '{@link psm.JClass#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see psm.JClass#getAttributes()
	 * @see #getJClass()
	 * @generated
	 */
	EReference getJClass_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link psm.JClass#isBusinessSingleton <em>Business Singleton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Business Singleton</em>'.
	 * @see psm.JClass#isBusinessSingleton()
	 * @see #getJClass()
	 * @generated
	 */
	EAttribute getJClass_BusinessSingleton();

	/**
	 * Returns the meta object for the containment reference list '{@link psm.JClass#getAliases <em>Aliases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aliases</em>'.
	 * @see psm.JClass#getAliases()
	 * @see #getJClass()
	 * @generated
	 */
	EReference getJClass_Aliases();

	/**
	 * Returns the meta object for the attribute '{@link psm.JClass#isWatched <em>Watched</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Watched</em>'.
	 * @see psm.JClass#isWatched()
	 * @see #getJClass()
	 * @generated
	 */
	EAttribute getJClass_Watched();

	/**
	 * Returns the meta object for the attribute '{@link psm.JClass#isRepresentsEnumValue <em>Represents Enum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Represents Enum Value</em>'.
	 * @see psm.JClass#isRepresentsEnumValue()
	 * @see #getJClass()
	 * @generated
	 */
	EAttribute getJClass_RepresentsEnumValue();

	/**
	 * Returns the meta object for class '{@link psm.JAttribute <em>JAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JAttribute</em>'.
	 * @see psm.JAttribute
	 * @generated
	 */
	EClass getJAttribute();

	/**
	 * Returns the meta object for the attribute '{@link psm.JAttribute#getPlaceholder <em>Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholder</em>'.
	 * @see psm.JAttribute#getPlaceholder()
	 * @see #getJAttribute()
	 * @generated
	 */
	EAttribute getJAttribute_Placeholder();

	/**
	 * Returns the meta object for the attribute '{@link psm.JAttribute#getRegexp <em>Regexp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regexp</em>'.
	 * @see psm.JAttribute#getRegexp()
	 * @see #getJAttribute()
	 * @generated
	 */
	EAttribute getJAttribute_Regexp();

	/**
	 * Returns the meta object for the attribute '{@link psm.JAttribute#isMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mandatory</em>'.
	 * @see psm.JAttribute#isMandatory()
	 * @see #getJAttribute()
	 * @generated
	 */
	EAttribute getJAttribute_Mandatory();

	/**
	 * Returns the meta object for the attribute '{@link psm.JAttribute#getDecimals <em>Decimals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decimals</em>'.
	 * @see psm.JAttribute#getDecimals()
	 * @see #getJAttribute()
	 * @generated
	 */
	EAttribute getJAttribute_Decimals();

	/**
	 * Returns the meta object for the attribute '{@link psm.JAttribute#getInterval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval</em>'.
	 * @see psm.JAttribute#getInterval()
	 * @see #getJAttribute()
	 * @generated
	 */
	EAttribute getJAttribute_Interval();

	/**
	 * Returns the meta object for the attribute '{@link psm.JAttribute#isTechnical <em>Technical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Technical</em>'.
	 * @see psm.JAttribute#isTechnical()
	 * @see #getJAttribute()
	 * @generated
	 */
	EAttribute getJAttribute_Technical();

	/**
	 * Returns the meta object for the container reference '{@link psm.JAttribute#getOwnerClass <em>Owner Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner Class</em>'.
	 * @see psm.JAttribute#getOwnerClass()
	 * @see #getJAttribute()
	 * @generated
	 */
	EReference getJAttribute_OwnerClass();

	/**
	 * Returns the meta object for the attribute '{@link psm.JAttribute#isUiNoSearch <em>Ui No Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ui No Search</em>'.
	 * @see psm.JAttribute#isUiNoSearch()
	 * @see #getJAttribute()
	 * @generated
	 */
	EAttribute getJAttribute_UiNoSearch();

	/**
	 * Returns the meta object for the attribute '{@link psm.JAttribute#isWatched <em>Watched</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Watched</em>'.
	 * @see psm.JAttribute#isWatched()
	 * @see #getJAttribute()
	 * @generated
	 */
	EAttribute getJAttribute_Watched();

	/**
	 * Returns the meta object for the attribute '{@link psm.JAttribute#isRepresentsId <em>Represents Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Represents Id</em>'.
	 * @see psm.JAttribute#isRepresentsId()
	 * @see #getJAttribute()
	 * @generated
	 */
	EAttribute getJAttribute_RepresentsId();

	/**
	 * Returns the meta object for class '{@link psm.JOperation <em>JOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JOperation</em>'.
	 * @see psm.JOperation
	 * @generated
	 */
	EClass getJOperation();

	/**
	 * Returns the meta object for the attribute '{@link psm.JOperation#isClassBased <em>Class Based</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Based</em>'.
	 * @see psm.JOperation#isClassBased()
	 * @see #getJOperation()
	 * @generated
	 */
	EAttribute getJOperation_ClassBased();

	/**
	 * Returns the meta object for the container reference '{@link psm.JOperation#getOwnerClass <em>Owner Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner Class</em>'.
	 * @see psm.JOperation#getOwnerClass()
	 * @see #getJOperation()
	 * @generated
	 */
	EReference getJOperation_OwnerClass();

	/**
	 * Returns the meta object for the containment reference list '{@link psm.JOperation#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see psm.JOperation#getParameters()
	 * @see #getJOperation()
	 * @generated
	 */
	EReference getJOperation_Parameters();

	/**
	 * Returns the meta object for the reference list '{@link psm.JOperation#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transition</em>'.
	 * @see psm.JOperation#getTransition()
	 * @see #getJOperation()
	 * @generated
	 */
	EReference getJOperation_Transition();

	/**
	 * Returns the meta object for the attribute '{@link psm.JOperation#isBulk <em>Bulk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bulk</em>'.
	 * @see psm.JOperation#isBulk()
	 * @see #getJOperation()
	 * @generated
	 */
	EAttribute getJOperation_Bulk();

	/**
	 * Returns the meta object for the attribute '{@link psm.JOperation#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see psm.JOperation#getKind()
	 * @see #getJOperation()
	 * @generated
	 */
	EAttribute getJOperation_Kind();

	/**
	 * Returns the meta object for the attribute '{@link psm.JOperation#isUiMustConfirm <em>Ui Must Confirm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ui Must Confirm</em>'.
	 * @see psm.JOperation#isUiMustConfirm()
	 * @see #getJOperation()
	 * @generated
	 */
	EAttribute getJOperation_UiMustConfirm();

	/**
	 * Returns the meta object for class '{@link psm.JParameter <em>JParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JParameter</em>'.
	 * @see psm.JParameter
	 * @generated
	 */
	EClass getJParameter();

	/**
	 * Returns the meta object for the container reference '{@link psm.JParameter#getOwnerOperation <em>Owner Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner Operation</em>'.
	 * @see psm.JParameter#getOwnerOperation()
	 * @see #getJParameter()
	 * @generated
	 */
	EReference getJParameter_OwnerOperation();

	/**
	 * Returns the meta object for the attribute '{@link psm.JParameter#isInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input</em>'.
	 * @see psm.JParameter#isInput()
	 * @see #getJParameter()
	 * @generated
	 */
	EAttribute getJParameter_Input();

	/**
	 * Returns the meta object for the attribute '{@link psm.JParameter#getInterval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval</em>'.
	 * @see psm.JParameter#getInterval()
	 * @see #getJParameter()
	 * @generated
	 */
	EAttribute getJParameter_Interval();

	/**
	 * Returns the meta object for class '{@link psm.JRelationship <em>JRelationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JRelationship</em>'.
	 * @see psm.JRelationship
	 * @generated
	 */
	EClass getJRelationship();

	/**
	 * Returns the meta object for the container reference '{@link psm.JRelationship#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Package</em>'.
	 * @see psm.JRelationship#getPackage()
	 * @see #getJRelationship()
	 * @generated
	 */
	EReference getJRelationship_Package();

	/**
	 * Returns the meta object for the containment reference list '{@link psm.JRelationship#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see psm.JRelationship#getRoles()
	 * @see #getJRelationship()
	 * @generated
	 */
	EReference getJRelationship_Roles();

	/**
	 * Returns the meta object for the attribute '{@link psm.JRelationship#isDerived <em>Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derived</em>'.
	 * @see psm.JRelationship#isDerived()
	 * @see #getJRelationship()
	 * @generated
	 */
	EAttribute getJRelationship_Derived();

	/**
	 * Returns the meta object for class '{@link psm.JRole <em>JRole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JRole</em>'.
	 * @see psm.JRole
	 * @generated
	 */
	EClass getJRole();

	/**
	 * Returns the meta object for the attribute '{@link psm.JRole#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower</em>'.
	 * @see psm.JRole#getLower()
	 * @see #getJRole()
	 * @generated
	 */
	EAttribute getJRole_Lower();

	/**
	 * Returns the meta object for the attribute '{@link psm.JRole#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper</em>'.
	 * @see psm.JRole#getUpper()
	 * @see #getJRole()
	 * @generated
	 */
	EAttribute getJRole_Upper();

	/**
	 * Returns the meta object for the attribute '{@link psm.JRole#isNavigable <em>Navigable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navigable</em>'.
	 * @see psm.JRole#isNavigable()
	 * @see #getJRole()
	 * @generated
	 */
	EAttribute getJRole_Navigable();

	/**
	 * Returns the meta object for the attribute '{@link psm.JRole#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see psm.JRole#isUnique()
	 * @see #getJRole()
	 * @generated
	 */
	EAttribute getJRole_Unique();

	/**
	 * Returns the meta object for the attribute '{@link psm.JRole#isOrdered <em>Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordered</em>'.
	 * @see psm.JRole#isOrdered()
	 * @see #getJRole()
	 * @generated
	 */
	EAttribute getJRole_Ordered();

	/**
	 * Returns the meta object for the container reference '{@link psm.JRole#getOwnerRelationship <em>Owner Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner Relationship</em>'.
	 * @see psm.JRole#getOwnerRelationship()
	 * @see #getJRole()
	 * @generated
	 */
	EReference getJRole_OwnerRelationship();

	/**
	 * Returns the meta object for the attribute '{@link psm.JRole#getDerivedExpression <em>Derived Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derived Expression</em>'.
	 * @see psm.JRole#getDerivedExpression()
	 * @see #getJRole()
	 * @generated
	 */
	EAttribute getJRole_DerivedExpression();

	/**
	 * Returns the meta object for the attribute '{@link psm.JRole#getDerivedDescription <em>Derived Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derived Description</em>'.
	 * @see psm.JRole#getDerivedDescription()
	 * @see #getJRole()
	 * @generated
	 */
	EAttribute getJRole_DerivedDescription();

	/**
	 * Returns the meta object for the attribute '{@link psm.JRole#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see psm.JRole#getKind()
	 * @see #getJRole()
	 * @generated
	 */
	EAttribute getJRole_Kind();

	/**
	 * Returns the meta object for the attribute '{@link psm.JRole#getOptionScript <em>Option Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Option Script</em>'.
	 * @see psm.JRole#getOptionScript()
	 * @see #getJRole()
	 * @generated
	 */
	EAttribute getJRole_OptionScript();

	/**
	 * Returns the meta object for the reference '{@link psm.JRole#getOwnerClass <em>Owner Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner Class</em>'.
	 * @see psm.JRole#getOwnerClass()
	 * @see #getJRole()
	 * @generated
	 */
	EReference getJRole_OwnerClass();

	/**
	 * Returns the meta object for the attribute '{@link psm.JRole#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see psm.JRole#getValue()
	 * @see #getJRole()
	 * @generated
	 */
	EAttribute getJRole_Value();

	/**
	 * Returns the meta object for the attribute '{@link psm.JRole#isCalculated <em>Calculated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calculated</em>'.
	 * @see psm.JRole#isCalculated()
	 * @see #getJRole()
	 * @generated
	 */
	EAttribute getJRole_Calculated();

	/**
	 * Returns the meta object for the attribute '{@link psm.JRole#getInterval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval</em>'.
	 * @see psm.JRole#getInterval()
	 * @see #getJRole()
	 * @generated
	 */
	EAttribute getJRole_Interval();

	/**
	 * Returns the meta object for class '{@link psm.JLiteral <em>JLiteral</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JLiteral</em>'.
	 * @see psm.JLiteral
	 * @generated
	 */
	EClass getJLiteral();

	/**
	 * Returns the meta object for the container reference '{@link psm.JLiteral#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Enumeration</em>'.
	 * @see psm.JLiteral#getEnumeration()
	 * @see #getJLiteral()
	 * @generated
	 */
	EReference getJLiteral_Enumeration();

	/**
	 * Returns the meta object for class '{@link psm.JPackage <em>JPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JPackage</em>'.
	 * @see psm.JPackage
	 * @generated
	 */
	EClass getJPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link psm.JPackage#getEnumerations <em>Enumerations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enumerations</em>'.
	 * @see psm.JPackage#getEnumerations()
	 * @see #getJPackage()
	 * @generated
	 */
	EReference getJPackage_Enumerations();

	/**
	 * Returns the meta object for the containment reference list '{@link psm.JPackage#getPrimitives <em>Primitives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Primitives</em>'.
	 * @see psm.JPackage#getPrimitives()
	 * @see #getJPackage()
	 * @generated
	 */
	EReference getJPackage_Primitives();

	/**
	 * Returns the meta object for the containment reference list '{@link psm.JPackage#getRelationships <em>Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationships</em>'.
	 * @see psm.JPackage#getRelationships()
	 * @see #getJPackage()
	 * @generated
	 */
	EReference getJPackage_Relationships();

	/**
	 * Returns the meta object for the containment reference list '{@link psm.JPackage#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see psm.JPackage#getChildren()
	 * @see #getJPackage()
	 * @generated
	 */
	EReference getJPackage_Children();

	/**
	 * Returns the meta object for the container reference '{@link psm.JPackage#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see psm.JPackage#getParent()
	 * @see #getJPackage()
	 * @generated
	 */
	EReference getJPackage_Parent();

	/**
	 * Returns the meta object for the container reference '{@link psm.JPackage#getOwnerModel <em>Owner Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner Model</em>'.
	 * @see psm.JPackage#getOwnerModel()
	 * @see #getJPackage()
	 * @generated
	 */
	EReference getJPackage_OwnerModel();

	/**
	 * Returns the meta object for the containment reference list '{@link psm.JPackage#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see psm.JPackage#getClasses()
	 * @see #getJPackage()
	 * @generated
	 */
	EReference getJPackage_Classes();

	/**
	 * Returns the meta object for class '{@link psm.JStateMachine <em>JState Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JState Machine</em>'.
	 * @see psm.JStateMachine
	 * @generated
	 */
	EClass getJStateMachine();

	/**
	 * Returns the meta object for the container reference '{@link psm.JStateMachine#getOwnerClass <em>Owner Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner Class</em>'.
	 * @see psm.JStateMachine#getOwnerClass()
	 * @see #getJStateMachine()
	 * @generated
	 */
	EReference getJStateMachine_OwnerClass();

	/**
	 * Returns the meta object for the containment reference list '{@link psm.JStateMachine#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see psm.JStateMachine#getStates()
	 * @see #getJStateMachine()
	 * @generated
	 */
	EReference getJStateMachine_States();

	/**
	 * Returns the meta object for the containment reference list '{@link psm.JStateMachine#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see psm.JStateMachine#getTransitions()
	 * @see #getJStateMachine()
	 * @generated
	 */
	EReference getJStateMachine_Transitions();

	/**
	 * Returns the meta object for the reference '{@link psm.JStateMachine#getCorrespondingEnum <em>Corresponding Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Corresponding Enum</em>'.
	 * @see psm.JStateMachine#getCorrespondingEnum()
	 * @see #getJStateMachine()
	 * @generated
	 */
	EReference getJStateMachine_CorrespondingEnum();

	/**
	 * Returns the meta object for class '{@link psm.JTransition <em>JTransition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JTransition</em>'.
	 * @see psm.JTransition
	 * @generated
	 */
	EClass getJTransition();

	/**
	 * Returns the meta object for the container reference '{@link psm.JTransition#getStateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>State Machine</em>'.
	 * @see psm.JTransition#getStateMachine()
	 * @see #getJTransition()
	 * @generated
	 */
	EReference getJTransition_StateMachine();

	/**
	 * Returns the meta object for the containment reference '{@link psm.JTransition#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guard</em>'.
	 * @see psm.JTransition#getGuard()
	 * @see #getJTransition()
	 * @generated
	 */
	EReference getJTransition_Guard();

	/**
	 * Returns the meta object for the reference '{@link psm.JTransition#getToState <em>To State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To State</em>'.
	 * @see psm.JTransition#getToState()
	 * @see #getJTransition()
	 * @generated
	 */
	EReference getJTransition_ToState();

	/**
	 * Returns the meta object for the reference '{@link psm.JTransition#getFromState <em>From State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From State</em>'.
	 * @see psm.JTransition#getFromState()
	 * @see #getJTransition()
	 * @generated
	 */
	EReference getJTransition_FromState();

	/**
	 * Returns the meta object for the reference '{@link psm.JTransition#getExecutingOperation <em>Executing Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Executing Operation</em>'.
	 * @see psm.JTransition#getExecutingOperation()
	 * @see #getJTransition()
	 * @generated
	 */
	EReference getJTransition_ExecutingOperation();

	/**
	 * Returns the meta object for class '{@link psm.JState <em>JState</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JState</em>'.
	 * @see psm.JState
	 * @generated
	 */
	EClass getJState();

	/**
	 * Returns the meta object for the container reference '{@link psm.JState#getOwnerStateMachine <em>Owner State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner State Machine</em>'.
	 * @see psm.JState#getOwnerStateMachine()
	 * @see #getJState()
	 * @generated
	 */
	EReference getJState_OwnerStateMachine();

	/**
	 * Returns the meta object for the reference list '{@link psm.JState#getIncomingTransitions <em>Incoming Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Transitions</em>'.
	 * @see psm.JState#getIncomingTransitions()
	 * @see #getJState()
	 * @generated
	 */
	EReference getJState_IncomingTransitions();

	/**
	 * Returns the meta object for the reference list '{@link psm.JState#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Transitions</em>'.
	 * @see psm.JState#getOutgoingTransitions()
	 * @see #getJState()
	 * @generated
	 */
	EReference getJState_OutgoingTransitions();

	/**
	 * Returns the meta object for the attribute '{@link psm.JState#isInitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial State</em>'.
	 * @see psm.JState#isInitialState()
	 * @see #getJState()
	 * @generated
	 */
	EAttribute getJState_InitialState();

	/**
	 * Returns the meta object for the attribute '{@link psm.JState#isFinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final State</em>'.
	 * @see psm.JState#isFinalState()
	 * @see #getJState()
	 * @generated
	 */
	EAttribute getJState_FinalState();

	/**
	 * Returns the meta object for class '{@link psm.JGuard <em>JGuard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JGuard</em>'.
	 * @see psm.JGuard
	 * @generated
	 */
	EClass getJGuard();

	/**
	 * Returns the meta object for the container reference '{@link psm.JGuard#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Transition</em>'.
	 * @see psm.JGuard#getTransition()
	 * @see #getJGuard()
	 * @generated
	 */
	EReference getJGuard_Transition();

	/**
	 * Returns the meta object for the attribute '{@link psm.JGuard#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see psm.JGuard#getText()
	 * @see #getJGuard()
	 * @generated
	 */
	EAttribute getJGuard_Text();

	/**
	 * Returns the meta object for the attribute '{@link psm.JGuard#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see psm.JGuard#getExpression()
	 * @see #getJGuard()
	 * @generated
	 */
	EAttribute getJGuard_Expression();

	/**
	 * Returns the meta object for class '{@link psm.JModel <em>JModel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JModel</em>'.
	 * @see psm.JModel
	 * @generated
	 */
	EClass getJModel();

	/**
	 * Returns the meta object for the containment reference list '{@link psm.JModel#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see psm.JModel#getPackages()
	 * @see #getJModel()
	 * @generated
	 */
	EReference getJModel_Packages();

	/**
	 * Returns the meta object for the attribute '{@link psm.JModel#getPackagePrefix <em>Package Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Prefix</em>'.
	 * @see psm.JModel#getPackagePrefix()
	 * @see #getJModel()
	 * @generated
	 */
	EAttribute getJModel_PackagePrefix();

	/**
	 * Returns the meta object for the reference '{@link psm.JModel#getApplicationTop <em>Application Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Application Top</em>'.
	 * @see psm.JModel#getApplicationTop()
	 * @see #getJModel()
	 * @generated
	 */
	EReference getJModel_ApplicationTop();

	/**
	 * Returns the meta object for the containment reference list '{@link psm.JModel#getRootMenuItems <em>Root Menu Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Root Menu Items</em>'.
	 * @see psm.JModel#getRootMenuItems()
	 * @see #getJModel()
	 * @generated
	 */
	EReference getJModel_RootMenuItems();

	/**
	 * Returns the meta object for the containment reference '{@link psm.JModel#getInfo <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Info</em>'.
	 * @see psm.JModel#getInfo()
	 * @see #getJModel()
	 * @generated
	 */
	EReference getJModel_Info();

	/**
	 * Returns the meta object for class '{@link psm.JUIMenuItem <em>JUI Menu Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JUI Menu Item</em>'.
	 * @see psm.JUIMenuItem
	 * @generated
	 */
	EClass getJUIMenuItem();

	/**
	 * Returns the meta object for the containment reference list '{@link psm.JUIMenuItem#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see psm.JUIMenuItem#getChildren()
	 * @see #getJUIMenuItem()
	 * @generated
	 */
	EReference getJUIMenuItem_Children();

	/**
	 * Returns the meta object for the container reference '{@link psm.JUIMenuItem#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see psm.JUIMenuItem#getParent()
	 * @see #getJUIMenuItem()
	 * @generated
	 */
	EReference getJUIMenuItem_Parent();

	/**
	 * Returns the meta object for the reference '{@link psm.JUIMenuItem#getRepresent <em>Represent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Represent</em>'.
	 * @see psm.JUIMenuItem#getRepresent()
	 * @see #getJUIMenuItem()
	 * @generated
	 */
	EReference getJUIMenuItem_Represent();

	/**
	 * Returns the meta object for the containment reference list '{@link psm.JUIMenuItem#getUifilters <em>Uifilters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uifilters</em>'.
	 * @see psm.JUIMenuItem#getUifilters()
	 * @see #getJUIMenuItem()
	 * @generated
	 */
	EReference getJUIMenuItem_Uifilters();

	/**
	 * Returns the meta object for the attribute '{@link psm.JUIMenuItem#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see psm.JUIMenuItem#getType()
	 * @see #getJUIMenuItem()
	 * @generated
	 */
	EAttribute getJUIMenuItem_Type();

	/**
	 * Returns the meta object for the reference '{@link psm.JUIMenuItem#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Alias</em>'.
	 * @see psm.JUIMenuItem#getAlias()
	 * @see #getJUIMenuItem()
	 * @generated
	 */
	EReference getJUIMenuItem_Alias();

	/**
	 * Returns the meta object for class '{@link psm.JUIAttributeGroup <em>JUI Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JUI Attribute Group</em>'.
	 * @see psm.JUIAttributeGroup
	 * @generated
	 */
	EClass getJUIAttributeGroup();

	/**
	 * Returns the meta object for the reference list '{@link psm.JUIAttributeGroup#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attributes</em>'.
	 * @see psm.JUIAttributeGroup#getAttributes()
	 * @see #getJUIAttributeGroup()
	 * @generated
	 */
	EReference getJUIAttributeGroup_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link psm.JUIAttributeGroup#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see psm.JUIAttributeGroup#getPosition()
	 * @see #getJUIAttributeGroup()
	 * @generated
	 */
	EAttribute getJUIAttributeGroup_Position();

	/**
	 * Returns the meta object for class '{@link psm.JUIFilter <em>JUI Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JUI Filter</em>'.
	 * @see psm.JUIFilter
	 * @generated
	 */
	EClass getJUIFilter();

	/**
	 * Returns the meta object for the reference '{@link psm.JUIFilter#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see psm.JUIFilter#getAttribute()
	 * @see #getJUIFilter()
	 * @generated
	 */
	EReference getJUIFilter_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link psm.JUIFilter#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see psm.JUIFilter#getOperator()
	 * @see #getJUIFilter()
	 * @generated
	 */
	EAttribute getJUIFilter_Operator();

	/**
	 * Returns the meta object for the attribute '{@link psm.JUIFilter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see psm.JUIFilter#getValue()
	 * @see #getJUIFilter()
	 * @generated
	 */
	EAttribute getJUIFilter_Value();

	/**
	 * Returns the meta object for class '{@link psm.JUIAlias <em>JUI Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JUI Alias</em>'.
	 * @see psm.JUIAlias
	 * @generated
	 */
	EClass getJUIAlias();

	/**
	 * Returns the meta object for the container reference '{@link psm.JUIAlias#getOwnerClass <em>Owner Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner Class</em>'.
	 * @see psm.JUIAlias#getOwnerClass()
	 * @see #getJUIAlias()
	 * @generated
	 */
	EReference getJUIAlias_OwnerClass();

	/**
	 * Returns the meta object for class '{@link psm.JInfo <em>JInfo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JInfo</em>'.
	 * @see psm.JInfo
	 * @generated
	 */
	EClass getJInfo();

	/**
	 * Returns the meta object for the containment reference list '{@link psm.JInfo#getSubmodels <em>Submodels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Submodels</em>'.
	 * @see psm.JInfo#getSubmodels()
	 * @see #getJInfo()
	 * @generated
	 */
	EReference getJInfo_Submodels();

	/**
	 * Returns the meta object for class '{@link psm.JSubmodel <em>JSubmodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JSubmodel</em>'.
	 * @see psm.JSubmodel
	 * @generated
	 */
	EClass getJSubmodel();

	/**
	 * Returns the meta object for the attribute '{@link psm.JSubmodel#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see psm.JSubmodel#getVersion()
	 * @see #getJSubmodel()
	 * @generated
	 */
	EAttribute getJSubmodel_Version();

	/**
	 * Returns the meta object for enum '{@link psm.JVisibility <em>JVisibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>JVisibility</em>'.
	 * @see psm.JVisibility
	 * @generated
	 */
	EEnum getJVisibility();

	/**
	 * Returns the meta object for enum '{@link psm.JAssociationKind <em>JAssociation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>JAssociation Kind</em>'.
	 * @see psm.JAssociationKind
	 * @generated
	 */
	EEnum getJAssociationKind();

	/**
	 * Returns the meta object for enum '{@link psm.JOperationKind <em>JOperation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>JOperation Kind</em>'.
	 * @see psm.JOperationKind
	 * @generated
	 */
	EEnum getJOperationKind();

	/**
	 * Returns the meta object for enum '{@link psm.JLayer <em>JLayer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>JLayer</em>'.
	 * @see psm.JLayer
	 * @generated
	 */
	EEnum getJLayer();

	/**
	 * Returns the meta object for enum '{@link psm.JMenuItemType <em>JMenu Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>JMenu Item Type</em>'.
	 * @see psm.JMenuItemType
	 * @generated
	 */
	EEnum getJMenuItemType();

	/**
	 * Returns the meta object for enum '{@link psm.JOperator <em>JOperator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>JOperator</em>'.
	 * @see psm.JOperator
	 * @generated
	 */
	EEnum getJOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PsmFactory getPsmFactory();

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
		 * The meta object literal for the '{@link psm.impl.JElementImpl <em>JElement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psm.impl.JElementImpl
		 * @see psm.impl.PsmPackageImpl#getJElement()
		 * @generated
		 */
		EClass JELEMENT = eINSTANCE.getJElement();

		/**
		 * The meta object literal for the '<em><b>Uuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JELEMENT__UUID = eINSTANCE.getJElement_Uuid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JELEMENT__NAME = eINSTANCE.getJElement_Name();

		/**
		 * The meta object literal for the '<em><b>Short Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JELEMENT__SHORT_NAME = eINSTANCE.getJElement_ShortName();

		/**
		 * The meta object literal for the '<em><b>Full Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JELEMENT__FULL_NAME = eINSTANCE.getJElement_FullName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JELEMENT__DESCRIPTION = eINSTANCE.getJElement_Description();

		/**
		 * The meta object literal for the '<em><b>Framework</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JELEMENT__FRAMEWORK = eINSTANCE.getJElement_Framework();

		/**
		 * The meta object literal for the '<em><b>Participates</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JELEMENT__PARTICIPATES = eINSTANCE.getJElement_Participates();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JELEMENT__VISIBILITY = eINSTANCE.getJElement_Visibility();

		/**
		 * The meta object literal for the '{@link psm.impl.JTypeImpl <em>JType</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psm.impl.JTypeImpl
		 * @see psm.impl.PsmPackageImpl#getJType()
		 * @generated
		 */
		EClass JTYPE = eINSTANCE.getJType();

		/**
		 * The meta object literal for the '{@link psm.impl.JTypedElementImpl <em>JTyped Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psm.impl.JTypedElementImpl
		 * @see psm.impl.PsmPackageImpl#getJTypedElement()
		 * @generated
		 */
		EClass JTYPED_ELEMENT = eINSTANCE.getJTypedElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JTYPED_ELEMENT__TYPE = eINSTANCE.getJTypedElement_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JTYPED_ELEMENT__VALUE = eINSTANCE.getJTypedElement_Value();

		/**
		 * The meta object literal for the '<em><b>Derived</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JTYPED_ELEMENT__DERIVED = eINSTANCE.getJTypedElement_Derived();

		/**
		 * The meta object literal for the '<em><b>Calculated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JTYPED_ELEMENT__CALCULATED = eINSTANCE.getJTypedElement_Calculated();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JTYPED_ELEMENT__LOWER = eINSTANCE.getJTypedElement_Lower();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JTYPED_ELEMENT__UPPER = eINSTANCE.getJTypedElement_Upper();

		/**
		 * The meta object literal for the '<em><b>Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JTYPED_ELEMENT__ORDERED = eINSTANCE.getJTypedElement_Ordered();

		/**
		 * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JTYPED_ELEMENT__UNIQUE = eINSTANCE.getJTypedElement_Unique();

		/**
		 * The meta object literal for the '{@link psm.impl.JPrimitiveImpl <em>JPrimitive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psm.impl.JPrimitiveImpl
		 * @see psm.impl.PsmPackageImpl#getJPrimitive()
		 * @generated
		 */
		EClass JPRIMITIVE = eINSTANCE.getJPrimitive();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JPRIMITIVE__PACKAGE = eINSTANCE.getJPrimitive_Package();

		/**
		 * The meta object literal for the '<em><b>Use For Id Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JPRIMITIVE__USE_FOR_ID_TYPE = eINSTANCE.getJPrimitive_UseForIdType();

		/**
		 * The meta object literal for the '{@link psm.impl.JEnumerationImpl <em>JEnumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psm.impl.JEnumerationImpl
		 * @see psm.impl.PsmPackageImpl#getJEnumeration()
		 * @generated
		 */
		EClass JENUMERATION = eINSTANCE.getJEnumeration();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JENUMERATION__PACKAGE = eINSTANCE.getJEnumeration_Package();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JENUMERATION__LITERALS = eINSTANCE.getJEnumeration_Literals();

		/**
		 * The meta object literal for the '<em><b>Class Representation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JENUMERATION__CLASS_REPRESENTATION = eINSTANCE.getJEnumeration_ClassRepresentation();

		/**
		 * The meta object literal for the '{@link psm.impl.JClassImpl <em>JClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psm.impl.JClassImpl
		 * @see psm.impl.PsmPackageImpl#getJClass()
		 * @generated
		 */
		EClass JCLASS = eINSTANCE.getJClass();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JCLASS__ABSTRACT = eINSTANCE.getJClass_Abstract();

		/**
		 * The meta object literal for the '<em><b>State Machines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JCLASS__STATE_MACHINES = eINSTANCE.getJClass_StateMachines();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JCLASS__OPERATIONS = eINSTANCE.getJClass_Operations();

		/**
		 * The meta object literal for the '<em><b>Attribute Order</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JCLASS__ATTRIBUTE_ORDER = eINSTANCE.getJClass_AttributeOrder();

		/**
		 * The meta object literal for the '<em><b>Attributes For Listing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JCLASS__ATTRIBUTES_FOR_LISTING = eINSTANCE.getJClass_AttributesForListing();

		/**
		 * The meta object literal for the '<em><b>Fixed Enum</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JCLASS__FIXED_ENUM = eINSTANCE.getJClass_FixedEnum();

		/**
		 * The meta object literal for the '<em><b>Represents Tenant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JCLASS__REPRESENTS_TENANT = eINSTANCE.getJClass_RepresentsTenant();

		/**
		 * The meta object literal for the '<em><b>Tenant Member</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JCLASS__TENANT_MEMBER = eINSTANCE.getJClass_TenantMember();

		/**
		 * The meta object literal for the '<em><b>Representation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JCLASS__REPRESENTATION = eINSTANCE.getJClass_Representation();

		/**
		 * The meta object literal for the '<em><b>Represents Enum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JCLASS__REPRESENTS_ENUM = eINSTANCE.getJClass_RepresentsEnum();

		/**
		 * The meta object literal for the '<em><b>Represents Tenant User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JCLASS__REPRESENTS_TENANT_USER = eINSTANCE.getJClass_RepresentsTenantUser();

		/**
		 * The meta object literal for the '<em><b>Represents User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JCLASS__REPRESENTS_USER = eINSTANCE.getJClass_RepresentsUser();

		/**
		 * The meta object literal for the '<em><b>Supertype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JCLASS__SUPERTYPE = eINSTANCE.getJClass_Supertype();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JCLASS__PACKAGE = eINSTANCE.getJClass_Package();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JCLASS__ROLES = eINSTANCE.getJClass_Roles();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JCLASS__ATTRIBUTES = eINSTANCE.getJClass_Attributes();

		/**
		 * The meta object literal for the '<em><b>Business Singleton</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JCLASS__BUSINESS_SINGLETON = eINSTANCE.getJClass_BusinessSingleton();

		/**
		 * The meta object literal for the '<em><b>Aliases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JCLASS__ALIASES = eINSTANCE.getJClass_Aliases();

		/**
		 * The meta object literal for the '<em><b>Watched</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JCLASS__WATCHED = eINSTANCE.getJClass_Watched();

		/**
		 * The meta object literal for the '<em><b>Represents Enum Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JCLASS__REPRESENTS_ENUM_VALUE = eINSTANCE.getJClass_RepresentsEnumValue();

		/**
		 * The meta object literal for the '{@link psm.impl.JAttributeImpl <em>JAttribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psm.impl.JAttributeImpl
		 * @see psm.impl.PsmPackageImpl#getJAttribute()
		 * @generated
		 */
		EClass JATTRIBUTE = eINSTANCE.getJAttribute();

		/**
		 * The meta object literal for the '<em><b>Placeholder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JATTRIBUTE__PLACEHOLDER = eINSTANCE.getJAttribute_Placeholder();

		/**
		 * The meta object literal for the '<em><b>Regexp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JATTRIBUTE__REGEXP = eINSTANCE.getJAttribute_Regexp();

		/**
		 * The meta object literal for the '<em><b>Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JATTRIBUTE__MANDATORY = eINSTANCE.getJAttribute_Mandatory();

		/**
		 * The meta object literal for the '<em><b>Decimals</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JATTRIBUTE__DECIMALS = eINSTANCE.getJAttribute_Decimals();

		/**
		 * The meta object literal for the '<em><b>Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JATTRIBUTE__INTERVAL = eINSTANCE.getJAttribute_Interval();

		/**
		 * The meta object literal for the '<em><b>Technical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JATTRIBUTE__TECHNICAL = eINSTANCE.getJAttribute_Technical();

		/**
		 * The meta object literal for the '<em><b>Owner Class</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JATTRIBUTE__OWNER_CLASS = eINSTANCE.getJAttribute_OwnerClass();

		/**
		 * The meta object literal for the '<em><b>Ui No Search</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JATTRIBUTE__UI_NO_SEARCH = eINSTANCE.getJAttribute_UiNoSearch();

		/**
		 * The meta object literal for the '<em><b>Watched</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JATTRIBUTE__WATCHED = eINSTANCE.getJAttribute_Watched();

		/**
		 * The meta object literal for the '<em><b>Represents Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JATTRIBUTE__REPRESENTS_ID = eINSTANCE.getJAttribute_RepresentsId();

		/**
		 * The meta object literal for the '{@link psm.impl.JOperationImpl <em>JOperation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psm.impl.JOperationImpl
		 * @see psm.impl.PsmPackageImpl#getJOperation()
		 * @generated
		 */
		EClass JOPERATION = eINSTANCE.getJOperation();

		/**
		 * The meta object literal for the '<em><b>Class Based</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOPERATION__CLASS_BASED = eINSTANCE.getJOperation_ClassBased();

		/**
		 * The meta object literal for the '<em><b>Owner Class</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOPERATION__OWNER_CLASS = eINSTANCE.getJOperation_OwnerClass();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOPERATION__PARAMETERS = eINSTANCE.getJOperation_Parameters();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOPERATION__TRANSITION = eINSTANCE.getJOperation_Transition();

		/**
		 * The meta object literal for the '<em><b>Bulk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOPERATION__BULK = eINSTANCE.getJOperation_Bulk();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOPERATION__KIND = eINSTANCE.getJOperation_Kind();

		/**
		 * The meta object literal for the '<em><b>Ui Must Confirm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOPERATION__UI_MUST_CONFIRM = eINSTANCE.getJOperation_UiMustConfirm();

		/**
		 * The meta object literal for the '{@link psm.impl.JParameterImpl <em>JParameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psm.impl.JParameterImpl
		 * @see psm.impl.PsmPackageImpl#getJParameter()
		 * @generated
		 */
		EClass JPARAMETER = eINSTANCE.getJParameter();

		/**
		 * The meta object literal for the '<em><b>Owner Operation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JPARAMETER__OWNER_OPERATION = eINSTANCE.getJParameter_OwnerOperation();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JPARAMETER__INPUT = eINSTANCE.getJParameter_Input();

		/**
		 * The meta object literal for the '<em><b>Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JPARAMETER__INTERVAL = eINSTANCE.getJParameter_Interval();

		/**
		 * The meta object literal for the '{@link psm.impl.JRelationshipImpl <em>JRelationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psm.impl.JRelationshipImpl
		 * @see psm.impl.PsmPackageImpl#getJRelationship()
		 * @generated
		 */
		EClass JRELATIONSHIP = eINSTANCE.getJRelationship();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JRELATIONSHIP__PACKAGE = eINSTANCE.getJRelationship_Package();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JRELATIONSHIP__ROLES = eINSTANCE.getJRelationship_Roles();

		/**
		 * The meta object literal for the '<em><b>Derived</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JRELATIONSHIP__DERIVED = eINSTANCE.getJRelationship_Derived();

		/**
		 * The meta object literal for the '{@link psm.impl.JRoleImpl <em>JRole</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psm.impl.JRoleImpl
		 * @see psm.impl.PsmPackageImpl#getJRole()
		 * @generated
		 */
		EClass JROLE = eINSTANCE.getJRole();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JROLE__LOWER = eINSTANCE.getJRole_Lower();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JROLE__UPPER = eINSTANCE.getJRole_Upper();

		/**
		 * The meta object literal for the '<em><b>Navigable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JROLE__NAVIGABLE = eINSTANCE.getJRole_Navigable();

		/**
		 * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JROLE__UNIQUE = eINSTANCE.getJRole_Unique();

		/**
		 * The meta object literal for the '<em><b>Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JROLE__ORDERED = eINSTANCE.getJRole_Ordered();

		/**
		 * The meta object literal for the '<em><b>Owner Relationship</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JROLE__OWNER_RELATIONSHIP = eINSTANCE.getJRole_OwnerRelationship();

		/**
		 * The meta object literal for the '<em><b>Derived Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JROLE__DERIVED_EXPRESSION = eINSTANCE.getJRole_DerivedExpression();

		/**
		 * The meta object literal for the '<em><b>Derived Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JROLE__DERIVED_DESCRIPTION = eINSTANCE.getJRole_DerivedDescription();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JROLE__KIND = eINSTANCE.getJRole_Kind();

		/**
		 * The meta object literal for the '<em><b>Option Script</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JROLE__OPTION_SCRIPT = eINSTANCE.getJRole_OptionScript();

		/**
		 * The meta object literal for the '<em><b>Owner Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JROLE__OWNER_CLASS = eINSTANCE.getJRole_OwnerClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JROLE__VALUE = eINSTANCE.getJRole_Value();

		/**
		 * The meta object literal for the '<em><b>Calculated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JROLE__CALCULATED = eINSTANCE.getJRole_Calculated();

		/**
		 * The meta object literal for the '<em><b>Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JROLE__INTERVAL = eINSTANCE.getJRole_Interval();

		/**
		 * The meta object literal for the '{@link psm.impl.JLiteralImpl <em>JLiteral</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psm.impl.JLiteralImpl
		 * @see psm.impl.PsmPackageImpl#getJLiteral()
		 * @generated
		 */
		EClass JLITERAL = eINSTANCE.getJLiteral();

		/**
		 * The meta object literal for the '<em><b>Enumeration</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JLITERAL__ENUMERATION = eINSTANCE.getJLiteral_Enumeration();

		/**
		 * The meta object literal for the '{@link psm.impl.JPackageImpl <em>JPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psm.impl.JPackageImpl
		 * @see psm.impl.PsmPackageImpl#getJPackage()
		 * @generated
		 */
		EClass JPACKAGE = eINSTANCE.getJPackage();

		/**
		 * The meta object literal for the '<em><b>Enumerations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JPACKAGE__ENUMERATIONS = eINSTANCE.getJPackage_Enumerations();

		/**
		 * The meta object literal for the '<em><b>Primitives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JPACKAGE__PRIMITIVES = eINSTANCE.getJPackage_Primitives();

		/**
		 * The meta object literal for the '<em><b>Relationships</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JPACKAGE__RELATIONSHIPS = eINSTANCE.getJPackage_Relationships();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JPACKAGE__CHILDREN = eINSTANCE.getJPackage_Children();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JPACKAGE__PARENT = eINSTANCE.getJPackage_Parent();

		/**
		 * The meta object literal for the '<em><b>Owner Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JPACKAGE__OWNER_MODEL = eINSTANCE.getJPackage_OwnerModel();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JPACKAGE__CLASSES = eINSTANCE.getJPackage_Classes();

		/**
		 * The meta object literal for the '{@link psm.impl.JStateMachineImpl <em>JState Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psm.impl.JStateMachineImpl
		 * @see psm.impl.PsmPackageImpl#getJStateMachine()
		 * @generated
		 */
		EClass JSTATE_MACHINE = eINSTANCE.getJStateMachine();

		/**
		 * The meta object literal for the '<em><b>Owner Class</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JSTATE_MACHINE__OWNER_CLASS = eINSTANCE.getJStateMachine_OwnerClass();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JSTATE_MACHINE__STATES = eINSTANCE.getJStateMachine_States();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JSTATE_MACHINE__TRANSITIONS = eINSTANCE.getJStateMachine_Transitions();

		/**
		 * The meta object literal for the '<em><b>Corresponding Enum</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JSTATE_MACHINE__CORRESPONDING_ENUM = eINSTANCE.getJStateMachine_CorrespondingEnum();

		/**
		 * The meta object literal for the '{@link psm.impl.JTransitionImpl <em>JTransition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psm.impl.JTransitionImpl
		 * @see psm.impl.PsmPackageImpl#getJTransition()
		 * @generated
		 */
		EClass JTRANSITION = eINSTANCE.getJTransition();

		/**
		 * The meta object literal for the '<em><b>State Machine</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JTRANSITION__STATE_MACHINE = eINSTANCE.getJTransition_StateMachine();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JTRANSITION__GUARD = eINSTANCE.getJTransition_Guard();

		/**
		 * The meta object literal for the '<em><b>To State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JTRANSITION__TO_STATE = eINSTANCE.getJTransition_ToState();

		/**
		 * The meta object literal for the '<em><b>From State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JTRANSITION__FROM_STATE = eINSTANCE.getJTransition_FromState();

		/**
		 * The meta object literal for the '<em><b>Executing Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JTRANSITION__EXECUTING_OPERATION = eINSTANCE.getJTransition_ExecutingOperation();

		/**
		 * The meta object literal for the '{@link psm.impl.JStateImpl <em>JState</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psm.impl.JStateImpl
		 * @see psm.impl.PsmPackageImpl#getJState()
		 * @generated
		 */
		EClass JSTATE = eINSTANCE.getJState();

		/**
		 * The meta object literal for the '<em><b>Owner State Machine</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JSTATE__OWNER_STATE_MACHINE = eINSTANCE.getJState_OwnerStateMachine();

		/**
		 * The meta object literal for the '<em><b>Incoming Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JSTATE__INCOMING_TRANSITIONS = eINSTANCE.getJState_IncomingTransitions();

		/**
		 * The meta object literal for the '<em><b>Outgoing Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JSTATE__OUTGOING_TRANSITIONS = eINSTANCE.getJState_OutgoingTransitions();

		/**
		 * The meta object literal for the '<em><b>Initial State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSTATE__INITIAL_STATE = eINSTANCE.getJState_InitialState();

		/**
		 * The meta object literal for the '<em><b>Final State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSTATE__FINAL_STATE = eINSTANCE.getJState_FinalState();

		/**
		 * The meta object literal for the '{@link psm.impl.JGuardImpl <em>JGuard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psm.impl.JGuardImpl
		 * @see psm.impl.PsmPackageImpl#getJGuard()
		 * @generated
		 */
		EClass JGUARD = eINSTANCE.getJGuard();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JGUARD__TRANSITION = eINSTANCE.getJGuard_Transition();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JGUARD__TEXT = eINSTANCE.getJGuard_Text();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JGUARD__EXPRESSION = eINSTANCE.getJGuard_Expression();

		/**
		 * The meta object literal for the '{@link psm.impl.JModelImpl <em>JModel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psm.impl.JModelImpl
		 * @see psm.impl.PsmPackageImpl#getJModel()
		 * @generated
		 */
		EClass JMODEL = eINSTANCE.getJModel();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JMODEL__PACKAGES = eINSTANCE.getJModel_Packages();

		/**
		 * The meta object literal for the '<em><b>Package Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JMODEL__PACKAGE_PREFIX = eINSTANCE.getJModel_PackagePrefix();

		/**
		 * The meta object literal for the '<em><b>Application Top</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JMODEL__APPLICATION_TOP = eINSTANCE.getJModel_ApplicationTop();

		/**
		 * The meta object literal for the '<em><b>Root Menu Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JMODEL__ROOT_MENU_ITEMS = eINSTANCE.getJModel_RootMenuItems();

		/**
		 * The meta object literal for the '<em><b>Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JMODEL__INFO = eINSTANCE.getJModel_Info();

		/**
		 * The meta object literal for the '{@link psm.impl.JUIMenuItemImpl <em>JUI Menu Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psm.impl.JUIMenuItemImpl
		 * @see psm.impl.PsmPackageImpl#getJUIMenuItem()
		 * @generated
		 */
		EClass JUI_MENU_ITEM = eINSTANCE.getJUIMenuItem();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JUI_MENU_ITEM__CHILDREN = eINSTANCE.getJUIMenuItem_Children();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JUI_MENU_ITEM__PARENT = eINSTANCE.getJUIMenuItem_Parent();

		/**
		 * The meta object literal for the '<em><b>Represent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JUI_MENU_ITEM__REPRESENT = eINSTANCE.getJUIMenuItem_Represent();

		/**
		 * The meta object literal for the '<em><b>Uifilters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JUI_MENU_ITEM__UIFILTERS = eINSTANCE.getJUIMenuItem_Uifilters();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUI_MENU_ITEM__TYPE = eINSTANCE.getJUIMenuItem_Type();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JUI_MENU_ITEM__ALIAS = eINSTANCE.getJUIMenuItem_Alias();

		/**
		 * The meta object literal for the '{@link psm.impl.JUIAttributeGroupImpl <em>JUI Attribute Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psm.impl.JUIAttributeGroupImpl
		 * @see psm.impl.PsmPackageImpl#getJUIAttributeGroup()
		 * @generated
		 */
		EClass JUI_ATTRIBUTE_GROUP = eINSTANCE.getJUIAttributeGroup();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JUI_ATTRIBUTE_GROUP__ATTRIBUTES = eINSTANCE.getJUIAttributeGroup_Attributes();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUI_ATTRIBUTE_GROUP__POSITION = eINSTANCE.getJUIAttributeGroup_Position();

		/**
		 * The meta object literal for the '{@link psm.impl.JUIFilterImpl <em>JUI Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psm.impl.JUIFilterImpl
		 * @see psm.impl.PsmPackageImpl#getJUIFilter()
		 * @generated
		 */
		EClass JUI_FILTER = eINSTANCE.getJUIFilter();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JUI_FILTER__ATTRIBUTE = eINSTANCE.getJUIFilter_Attribute();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUI_FILTER__OPERATOR = eINSTANCE.getJUIFilter_Operator();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUI_FILTER__VALUE = eINSTANCE.getJUIFilter_Value();

		/**
		 * The meta object literal for the '{@link psm.impl.JUIAliasImpl <em>JUI Alias</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psm.impl.JUIAliasImpl
		 * @see psm.impl.PsmPackageImpl#getJUIAlias()
		 * @generated
		 */
		EClass JUI_ALIAS = eINSTANCE.getJUIAlias();

		/**
		 * The meta object literal for the '<em><b>Owner Class</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JUI_ALIAS__OWNER_CLASS = eINSTANCE.getJUIAlias_OwnerClass();

		/**
		 * The meta object literal for the '{@link psm.impl.JInfoImpl <em>JInfo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psm.impl.JInfoImpl
		 * @see psm.impl.PsmPackageImpl#getJInfo()
		 * @generated
		 */
		EClass JINFO = eINSTANCE.getJInfo();

		/**
		 * The meta object literal for the '<em><b>Submodels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JINFO__SUBMODELS = eINSTANCE.getJInfo_Submodels();

		/**
		 * The meta object literal for the '{@link psm.impl.JSubmodelImpl <em>JSubmodel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psm.impl.JSubmodelImpl
		 * @see psm.impl.PsmPackageImpl#getJSubmodel()
		 * @generated
		 */
		EClass JSUBMODEL = eINSTANCE.getJSubmodel();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSUBMODEL__VERSION = eINSTANCE.getJSubmodel_Version();

		/**
		 * The meta object literal for the '{@link psm.JVisibility <em>JVisibility</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psm.JVisibility
		 * @see psm.impl.PsmPackageImpl#getJVisibility()
		 * @generated
		 */
		EEnum JVISIBILITY = eINSTANCE.getJVisibility();

		/**
		 * The meta object literal for the '{@link psm.JAssociationKind <em>JAssociation Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psm.JAssociationKind
		 * @see psm.impl.PsmPackageImpl#getJAssociationKind()
		 * @generated
		 */
		EEnum JASSOCIATION_KIND = eINSTANCE.getJAssociationKind();

		/**
		 * The meta object literal for the '{@link psm.JOperationKind <em>JOperation Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psm.JOperationKind
		 * @see psm.impl.PsmPackageImpl#getJOperationKind()
		 * @generated
		 */
		EEnum JOPERATION_KIND = eINSTANCE.getJOperationKind();

		/**
		 * The meta object literal for the '{@link psm.JLayer <em>JLayer</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psm.JLayer
		 * @see psm.impl.PsmPackageImpl#getJLayer()
		 * @generated
		 */
		EEnum JLAYER = eINSTANCE.getJLayer();

		/**
		 * The meta object literal for the '{@link psm.JMenuItemType <em>JMenu Item Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psm.JMenuItemType
		 * @see psm.impl.PsmPackageImpl#getJMenuItemType()
		 * @generated
		 */
		EEnum JMENU_ITEM_TYPE = eINSTANCE.getJMenuItemType();

		/**
		 * The meta object literal for the '{@link psm.JOperator <em>JOperator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psm.JOperator
		 * @see psm.impl.PsmPackageImpl#getJOperator()
		 * @generated
		 */
		EEnum JOPERATOR = eINSTANCE.getJOperator();

	}

} //PsmPackage
