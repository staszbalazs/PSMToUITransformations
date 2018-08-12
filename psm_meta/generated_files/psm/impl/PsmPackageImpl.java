/**
 */
package psm.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import psm.JAssociationKind;
import psm.JAttribute;
import psm.JClass;
import psm.JElement;
import psm.JEnumeration;
import psm.JGuard;
import psm.JInfo;
import psm.JLayer;
import psm.JLiteral;
import psm.JMenuItemType;
import psm.JModel;
import psm.JOperation;
import psm.JOperationKind;
import psm.JOperator;
import psm.JPackage;
import psm.JParameter;
import psm.JPrimitive;
import psm.JRelationship;
import psm.JRole;
import psm.JState;
import psm.JStateMachine;
import psm.JSubmodel;
import psm.JTransition;
import psm.JType;
import psm.JTypedElement;
import psm.JUIAlias;
import psm.JUIAttributeGroup;
import psm.JUIFilter;
import psm.JUIMenuItem;
import psm.JVisibility;
import psm.PsmFactory;
import psm.PsmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PsmPackageImpl extends EPackageImpl implements PsmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jTypedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jPrimitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jEnumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jStateMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jGuardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass juiMenuItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass juiAttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass juiFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass juiAliasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jSubmodelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum jVisibilityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum jAssociationKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum jOperationKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum jLayerEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum jMenuItemTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum jOperatorEEnum = null;

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
	 * @see psm.PsmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PsmPackageImpl() {
		super(eNS_URI, PsmFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PsmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PsmPackage init() {
		if (isInited) return (PsmPackage)EPackage.Registry.INSTANCE.getEPackage(PsmPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPsmPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PsmPackageImpl thePsmPackage = registeredPsmPackage instanceof PsmPackageImpl ? (PsmPackageImpl)registeredPsmPackage : new PsmPackageImpl();

		isInited = true;

		// Create package meta-data objects
		thePsmPackage.createPackageContents();

		// Initialize created meta-data
		thePsmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePsmPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PsmPackage.eNS_URI, thePsmPackage);
		return thePsmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJElement() {
		return jElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJElement_Uuid() {
		return (EAttribute)jElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJElement_Name() {
		return (EAttribute)jElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJElement_ShortName() {
		return (EAttribute)jElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJElement_FullName() {
		return (EAttribute)jElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJElement_Description() {
		return (EAttribute)jElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJElement_Framework() {
		return (EAttribute)jElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJElement_Participates() {
		return (EAttribute)jElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJElement_Visibility() {
		return (EAttribute)jElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJType() {
		return jTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJTypedElement() {
		return jTypedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJTypedElement_Type() {
		return (EReference)jTypedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJTypedElement_Value() {
		return (EAttribute)jTypedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJTypedElement_Derived() {
		return (EAttribute)jTypedElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJTypedElement_Calculated() {
		return (EAttribute)jTypedElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJTypedElement_Lower() {
		return (EAttribute)jTypedElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJTypedElement_Upper() {
		return (EAttribute)jTypedElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJTypedElement_Ordered() {
		return (EAttribute)jTypedElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJTypedElement_Unique() {
		return (EAttribute)jTypedElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJPrimitive() {
		return jPrimitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJPrimitive_Package() {
		return (EReference)jPrimitiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJPrimitive_UseForIdType() {
		return (EAttribute)jPrimitiveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJEnumeration() {
		return jEnumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJEnumeration_Package() {
		return (EReference)jEnumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJEnumeration_Literals() {
		return (EReference)jEnumerationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJEnumeration_ClassRepresentation() {
		return (EReference)jEnumerationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJClass() {
		return jClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJClass_Abstract() {
		return (EAttribute)jClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJClass_StateMachines() {
		return (EReference)jClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJClass_Operations() {
		return (EReference)jClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJClass_AttributeOrder() {
		return (EReference)jClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJClass_AttributesForListing() {
		return (EReference)jClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJClass_FixedEnum() {
		return (EReference)jClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJClass_RepresentsTenant() {
		return (EAttribute)jClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJClass_TenantMember() {
		return (EAttribute)jClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJClass_Representation() {
		return (EReference)jClassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJClass_RepresentsEnum() {
		return (EAttribute)jClassEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJClass_RepresentsTenantUser() {
		return (EAttribute)jClassEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJClass_RepresentsUser() {
		return (EAttribute)jClassEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJClass_Supertype() {
		return (EReference)jClassEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJClass_Package() {
		return (EReference)jClassEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJClass_Roles() {
		return (EReference)jClassEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJClass_Attributes() {
		return (EReference)jClassEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJClass_BusinessSingleton() {
		return (EAttribute)jClassEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJClass_Aliases() {
		return (EReference)jClassEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJClass_Watched() {
		return (EAttribute)jClassEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJClass_RepresentsEnumValue() {
		return (EAttribute)jClassEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJAttribute() {
		return jAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJAttribute_Placeholder() {
		return (EAttribute)jAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJAttribute_Regexp() {
		return (EAttribute)jAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJAttribute_Mandatory() {
		return (EAttribute)jAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJAttribute_Decimals() {
		return (EAttribute)jAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJAttribute_Interval() {
		return (EAttribute)jAttributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJAttribute_Technical() {
		return (EAttribute)jAttributeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJAttribute_OwnerClass() {
		return (EReference)jAttributeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJAttribute_UiNoSearch() {
		return (EAttribute)jAttributeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJAttribute_Watched() {
		return (EAttribute)jAttributeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJAttribute_RepresentsId() {
		return (EAttribute)jAttributeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJOperation() {
		return jOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJOperation_ClassBased() {
		return (EAttribute)jOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJOperation_OwnerClass() {
		return (EReference)jOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJOperation_Parameters() {
		return (EReference)jOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJOperation_Transition() {
		return (EReference)jOperationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJOperation_Bulk() {
		return (EAttribute)jOperationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJOperation_Kind() {
		return (EAttribute)jOperationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJOperation_UiMustConfirm() {
		return (EAttribute)jOperationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJParameter() {
		return jParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJParameter_OwnerOperation() {
		return (EReference)jParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJParameter_Input() {
		return (EAttribute)jParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJParameter_Interval() {
		return (EAttribute)jParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJRelationship() {
		return jRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJRelationship_Package() {
		return (EReference)jRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJRelationship_Roles() {
		return (EReference)jRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJRelationship_Derived() {
		return (EAttribute)jRelationshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJRole() {
		return jRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJRole_Lower() {
		return (EAttribute)jRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJRole_Upper() {
		return (EAttribute)jRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJRole_Navigable() {
		return (EAttribute)jRoleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJRole_Unique() {
		return (EAttribute)jRoleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJRole_Ordered() {
		return (EAttribute)jRoleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJRole_OwnerRelationship() {
		return (EReference)jRoleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJRole_DerivedExpression() {
		return (EAttribute)jRoleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJRole_DerivedDescription() {
		return (EAttribute)jRoleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJRole_Kind() {
		return (EAttribute)jRoleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJRole_OptionScript() {
		return (EAttribute)jRoleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJRole_OwnerClass() {
		return (EReference)jRoleEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJRole_Value() {
		return (EAttribute)jRoleEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJRole_Calculated() {
		return (EAttribute)jRoleEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJRole_Interval() {
		return (EAttribute)jRoleEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJLiteral() {
		return jLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJLiteral_Enumeration() {
		return (EReference)jLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJPackage() {
		return jPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJPackage_Enumerations() {
		return (EReference)jPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJPackage_Primitives() {
		return (EReference)jPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJPackage_Relationships() {
		return (EReference)jPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJPackage_Children() {
		return (EReference)jPackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJPackage_Parent() {
		return (EReference)jPackageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJPackage_OwnerModel() {
		return (EReference)jPackageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJPackage_Classes() {
		return (EReference)jPackageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJStateMachine() {
		return jStateMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJStateMachine_OwnerClass() {
		return (EReference)jStateMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJStateMachine_States() {
		return (EReference)jStateMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJStateMachine_Transitions() {
		return (EReference)jStateMachineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJStateMachine_CorrespondingEnum() {
		return (EReference)jStateMachineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJTransition() {
		return jTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJTransition_StateMachine() {
		return (EReference)jTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJTransition_Guard() {
		return (EReference)jTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJTransition_ToState() {
		return (EReference)jTransitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJTransition_FromState() {
		return (EReference)jTransitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJTransition_ExecutingOperation() {
		return (EReference)jTransitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJState() {
		return jStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJState_OwnerStateMachine() {
		return (EReference)jStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJState_IncomingTransitions() {
		return (EReference)jStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJState_OutgoingTransitions() {
		return (EReference)jStateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJState_InitialState() {
		return (EAttribute)jStateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJState_FinalState() {
		return (EAttribute)jStateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJGuard() {
		return jGuardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJGuard_Transition() {
		return (EReference)jGuardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJGuard_Text() {
		return (EAttribute)jGuardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJGuard_Expression() {
		return (EAttribute)jGuardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJModel() {
		return jModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJModel_Packages() {
		return (EReference)jModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJModel_PackagePrefix() {
		return (EAttribute)jModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJModel_ApplicationTop() {
		return (EReference)jModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJModel_RootMenuItems() {
		return (EReference)jModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJModel_Info() {
		return (EReference)jModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJUIMenuItem() {
		return juiMenuItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJUIMenuItem_Children() {
		return (EReference)juiMenuItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJUIMenuItem_Parent() {
		return (EReference)juiMenuItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJUIMenuItem_Represent() {
		return (EReference)juiMenuItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJUIMenuItem_Uifilters() {
		return (EReference)juiMenuItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJUIMenuItem_Type() {
		return (EAttribute)juiMenuItemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJUIMenuItem_Alias() {
		return (EReference)juiMenuItemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJUIAttributeGroup() {
		return juiAttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJUIAttributeGroup_Attributes() {
		return (EReference)juiAttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJUIAttributeGroup_Position() {
		return (EAttribute)juiAttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJUIFilter() {
		return juiFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJUIFilter_Attribute() {
		return (EReference)juiFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJUIFilter_Operator() {
		return (EAttribute)juiFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJUIFilter_Value() {
		return (EAttribute)juiFilterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJUIAlias() {
		return juiAliasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJUIAlias_OwnerClass() {
		return (EReference)juiAliasEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJInfo() {
		return jInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJInfo_Submodels() {
		return (EReference)jInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJSubmodel() {
		return jSubmodelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJSubmodel_Version() {
		return (EAttribute)jSubmodelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getJVisibility() {
		return jVisibilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getJAssociationKind() {
		return jAssociationKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getJOperationKind() {
		return jOperationKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getJLayer() {
		return jLayerEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getJMenuItemType() {
		return jMenuItemTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getJOperator() {
		return jOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PsmFactory getPsmFactory() {
		return (PsmFactory)getEFactoryInstance();
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
		jElementEClass = createEClass(JELEMENT);
		createEAttribute(jElementEClass, JELEMENT__UUID);
		createEAttribute(jElementEClass, JELEMENT__NAME);
		createEAttribute(jElementEClass, JELEMENT__SHORT_NAME);
		createEAttribute(jElementEClass, JELEMENT__FULL_NAME);
		createEAttribute(jElementEClass, JELEMENT__DESCRIPTION);
		createEAttribute(jElementEClass, JELEMENT__FRAMEWORK);
		createEAttribute(jElementEClass, JELEMENT__PARTICIPATES);
		createEAttribute(jElementEClass, JELEMENT__VISIBILITY);

		jTypeEClass = createEClass(JTYPE);

		jTypedElementEClass = createEClass(JTYPED_ELEMENT);
		createEReference(jTypedElementEClass, JTYPED_ELEMENT__TYPE);
		createEAttribute(jTypedElementEClass, JTYPED_ELEMENT__VALUE);
		createEAttribute(jTypedElementEClass, JTYPED_ELEMENT__DERIVED);
		createEAttribute(jTypedElementEClass, JTYPED_ELEMENT__CALCULATED);
		createEAttribute(jTypedElementEClass, JTYPED_ELEMENT__LOWER);
		createEAttribute(jTypedElementEClass, JTYPED_ELEMENT__UPPER);
		createEAttribute(jTypedElementEClass, JTYPED_ELEMENT__ORDERED);
		createEAttribute(jTypedElementEClass, JTYPED_ELEMENT__UNIQUE);

		jPrimitiveEClass = createEClass(JPRIMITIVE);
		createEReference(jPrimitiveEClass, JPRIMITIVE__PACKAGE);
		createEAttribute(jPrimitiveEClass, JPRIMITIVE__USE_FOR_ID_TYPE);

		jEnumerationEClass = createEClass(JENUMERATION);
		createEReference(jEnumerationEClass, JENUMERATION__PACKAGE);
		createEReference(jEnumerationEClass, JENUMERATION__LITERALS);
		createEReference(jEnumerationEClass, JENUMERATION__CLASS_REPRESENTATION);

		jClassEClass = createEClass(JCLASS);
		createEAttribute(jClassEClass, JCLASS__ABSTRACT);
		createEReference(jClassEClass, JCLASS__STATE_MACHINES);
		createEReference(jClassEClass, JCLASS__OPERATIONS);
		createEReference(jClassEClass, JCLASS__ATTRIBUTE_ORDER);
		createEReference(jClassEClass, JCLASS__ATTRIBUTES_FOR_LISTING);
		createEReference(jClassEClass, JCLASS__FIXED_ENUM);
		createEAttribute(jClassEClass, JCLASS__REPRESENTS_TENANT);
		createEAttribute(jClassEClass, JCLASS__TENANT_MEMBER);
		createEReference(jClassEClass, JCLASS__REPRESENTATION);
		createEAttribute(jClassEClass, JCLASS__REPRESENTS_ENUM);
		createEAttribute(jClassEClass, JCLASS__REPRESENTS_TENANT_USER);
		createEAttribute(jClassEClass, JCLASS__REPRESENTS_USER);
		createEReference(jClassEClass, JCLASS__SUPERTYPE);
		createEReference(jClassEClass, JCLASS__PACKAGE);
		createEReference(jClassEClass, JCLASS__ROLES);
		createEReference(jClassEClass, JCLASS__ATTRIBUTES);
		createEAttribute(jClassEClass, JCLASS__BUSINESS_SINGLETON);
		createEReference(jClassEClass, JCLASS__ALIASES);
		createEAttribute(jClassEClass, JCLASS__WATCHED);
		createEAttribute(jClassEClass, JCLASS__REPRESENTS_ENUM_VALUE);

		jAttributeEClass = createEClass(JATTRIBUTE);
		createEAttribute(jAttributeEClass, JATTRIBUTE__PLACEHOLDER);
		createEAttribute(jAttributeEClass, JATTRIBUTE__REGEXP);
		createEAttribute(jAttributeEClass, JATTRIBUTE__MANDATORY);
		createEAttribute(jAttributeEClass, JATTRIBUTE__DECIMALS);
		createEAttribute(jAttributeEClass, JATTRIBUTE__INTERVAL);
		createEAttribute(jAttributeEClass, JATTRIBUTE__TECHNICAL);
		createEReference(jAttributeEClass, JATTRIBUTE__OWNER_CLASS);
		createEAttribute(jAttributeEClass, JATTRIBUTE__UI_NO_SEARCH);
		createEAttribute(jAttributeEClass, JATTRIBUTE__WATCHED);
		createEAttribute(jAttributeEClass, JATTRIBUTE__REPRESENTS_ID);

		jOperationEClass = createEClass(JOPERATION);
		createEAttribute(jOperationEClass, JOPERATION__CLASS_BASED);
		createEReference(jOperationEClass, JOPERATION__OWNER_CLASS);
		createEReference(jOperationEClass, JOPERATION__PARAMETERS);
		createEReference(jOperationEClass, JOPERATION__TRANSITION);
		createEAttribute(jOperationEClass, JOPERATION__BULK);
		createEAttribute(jOperationEClass, JOPERATION__KIND);
		createEAttribute(jOperationEClass, JOPERATION__UI_MUST_CONFIRM);

		jParameterEClass = createEClass(JPARAMETER);
		createEReference(jParameterEClass, JPARAMETER__OWNER_OPERATION);
		createEAttribute(jParameterEClass, JPARAMETER__INPUT);
		createEAttribute(jParameterEClass, JPARAMETER__INTERVAL);

		jRelationshipEClass = createEClass(JRELATIONSHIP);
		createEReference(jRelationshipEClass, JRELATIONSHIP__PACKAGE);
		createEReference(jRelationshipEClass, JRELATIONSHIP__ROLES);
		createEAttribute(jRelationshipEClass, JRELATIONSHIP__DERIVED);

		jRoleEClass = createEClass(JROLE);
		createEAttribute(jRoleEClass, JROLE__LOWER);
		createEAttribute(jRoleEClass, JROLE__UPPER);
		createEAttribute(jRoleEClass, JROLE__NAVIGABLE);
		createEAttribute(jRoleEClass, JROLE__UNIQUE);
		createEAttribute(jRoleEClass, JROLE__ORDERED);
		createEReference(jRoleEClass, JROLE__OWNER_RELATIONSHIP);
		createEAttribute(jRoleEClass, JROLE__DERIVED_EXPRESSION);
		createEAttribute(jRoleEClass, JROLE__DERIVED_DESCRIPTION);
		createEAttribute(jRoleEClass, JROLE__KIND);
		createEAttribute(jRoleEClass, JROLE__OPTION_SCRIPT);
		createEReference(jRoleEClass, JROLE__OWNER_CLASS);
		createEAttribute(jRoleEClass, JROLE__VALUE);
		createEAttribute(jRoleEClass, JROLE__CALCULATED);
		createEAttribute(jRoleEClass, JROLE__INTERVAL);

		jLiteralEClass = createEClass(JLITERAL);
		createEReference(jLiteralEClass, JLITERAL__ENUMERATION);

		jPackageEClass = createEClass(JPACKAGE);
		createEReference(jPackageEClass, JPACKAGE__ENUMERATIONS);
		createEReference(jPackageEClass, JPACKAGE__PRIMITIVES);
		createEReference(jPackageEClass, JPACKAGE__RELATIONSHIPS);
		createEReference(jPackageEClass, JPACKAGE__CHILDREN);
		createEReference(jPackageEClass, JPACKAGE__PARENT);
		createEReference(jPackageEClass, JPACKAGE__OWNER_MODEL);
		createEReference(jPackageEClass, JPACKAGE__CLASSES);

		jStateMachineEClass = createEClass(JSTATE_MACHINE);
		createEReference(jStateMachineEClass, JSTATE_MACHINE__OWNER_CLASS);
		createEReference(jStateMachineEClass, JSTATE_MACHINE__STATES);
		createEReference(jStateMachineEClass, JSTATE_MACHINE__TRANSITIONS);
		createEReference(jStateMachineEClass, JSTATE_MACHINE__CORRESPONDING_ENUM);

		jTransitionEClass = createEClass(JTRANSITION);
		createEReference(jTransitionEClass, JTRANSITION__STATE_MACHINE);
		createEReference(jTransitionEClass, JTRANSITION__GUARD);
		createEReference(jTransitionEClass, JTRANSITION__TO_STATE);
		createEReference(jTransitionEClass, JTRANSITION__FROM_STATE);
		createEReference(jTransitionEClass, JTRANSITION__EXECUTING_OPERATION);

		jStateEClass = createEClass(JSTATE);
		createEReference(jStateEClass, JSTATE__OWNER_STATE_MACHINE);
		createEReference(jStateEClass, JSTATE__INCOMING_TRANSITIONS);
		createEReference(jStateEClass, JSTATE__OUTGOING_TRANSITIONS);
		createEAttribute(jStateEClass, JSTATE__INITIAL_STATE);
		createEAttribute(jStateEClass, JSTATE__FINAL_STATE);

		jGuardEClass = createEClass(JGUARD);
		createEReference(jGuardEClass, JGUARD__TRANSITION);
		createEAttribute(jGuardEClass, JGUARD__TEXT);
		createEAttribute(jGuardEClass, JGUARD__EXPRESSION);

		jModelEClass = createEClass(JMODEL);
		createEReference(jModelEClass, JMODEL__PACKAGES);
		createEAttribute(jModelEClass, JMODEL__PACKAGE_PREFIX);
		createEReference(jModelEClass, JMODEL__APPLICATION_TOP);
		createEReference(jModelEClass, JMODEL__ROOT_MENU_ITEMS);
		createEReference(jModelEClass, JMODEL__INFO);

		juiMenuItemEClass = createEClass(JUI_MENU_ITEM);
		createEReference(juiMenuItemEClass, JUI_MENU_ITEM__CHILDREN);
		createEReference(juiMenuItemEClass, JUI_MENU_ITEM__PARENT);
		createEReference(juiMenuItemEClass, JUI_MENU_ITEM__REPRESENT);
		createEReference(juiMenuItemEClass, JUI_MENU_ITEM__UIFILTERS);
		createEAttribute(juiMenuItemEClass, JUI_MENU_ITEM__TYPE);
		createEReference(juiMenuItemEClass, JUI_MENU_ITEM__ALIAS);

		juiAttributeGroupEClass = createEClass(JUI_ATTRIBUTE_GROUP);
		createEReference(juiAttributeGroupEClass, JUI_ATTRIBUTE_GROUP__ATTRIBUTES);
		createEAttribute(juiAttributeGroupEClass, JUI_ATTRIBUTE_GROUP__POSITION);

		juiFilterEClass = createEClass(JUI_FILTER);
		createEReference(juiFilterEClass, JUI_FILTER__ATTRIBUTE);
		createEAttribute(juiFilterEClass, JUI_FILTER__OPERATOR);
		createEAttribute(juiFilterEClass, JUI_FILTER__VALUE);

		juiAliasEClass = createEClass(JUI_ALIAS);
		createEReference(juiAliasEClass, JUI_ALIAS__OWNER_CLASS);

		jInfoEClass = createEClass(JINFO);
		createEReference(jInfoEClass, JINFO__SUBMODELS);

		jSubmodelEClass = createEClass(JSUBMODEL);
		createEAttribute(jSubmodelEClass, JSUBMODEL__VERSION);

		// Create enums
		jVisibilityEEnum = createEEnum(JVISIBILITY);
		jAssociationKindEEnum = createEEnum(JASSOCIATION_KIND);
		jOperationKindEEnum = createEEnum(JOPERATION_KIND);
		jLayerEEnum = createEEnum(JLAYER);
		jMenuItemTypeEEnum = createEEnum(JMENU_ITEM_TYPE);
		jOperatorEEnum = createEEnum(JOPERATOR);
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
		jTypeEClass.getESuperTypes().add(this.getJElement());
		jTypedElementEClass.getESuperTypes().add(this.getJElement());
		jPrimitiveEClass.getESuperTypes().add(this.getJType());
		jEnumerationEClass.getESuperTypes().add(this.getJType());
		jClassEClass.getESuperTypes().add(this.getJType());
		jAttributeEClass.getESuperTypes().add(this.getJTypedElement());
		jOperationEClass.getESuperTypes().add(this.getJElement());
		jParameterEClass.getESuperTypes().add(this.getJTypedElement());
		jRelationshipEClass.getESuperTypes().add(this.getJElement());
		jRoleEClass.getESuperTypes().add(this.getJElement());
		jLiteralEClass.getESuperTypes().add(this.getJElement());
		jPackageEClass.getESuperTypes().add(this.getJElement());
		jStateMachineEClass.getESuperTypes().add(this.getJElement());
		jTransitionEClass.getESuperTypes().add(this.getJElement());
		jStateEClass.getESuperTypes().add(this.getJElement());
		jGuardEClass.getESuperTypes().add(this.getJElement());
		jModelEClass.getESuperTypes().add(this.getJElement());
		juiMenuItemEClass.getESuperTypes().add(this.getJElement());
		juiAttributeGroupEClass.getESuperTypes().add(this.getJElement());
		juiFilterEClass.getESuperTypes().add(this.getJElement());
		juiAliasEClass.getESuperTypes().add(this.getJElement());
		jInfoEClass.getESuperTypes().add(this.getJElement());
		jSubmodelEClass.getESuperTypes().add(this.getJElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(jElementEClass, JElement.class, "JElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJElement_Uuid(), ecorePackage.getEString(), "uuid", null, 1, 1, JElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, JElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJElement_ShortName(), ecorePackage.getEString(), "shortName", null, 0, 1, JElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJElement_FullName(), ecorePackage.getEString(), "fullName", null, 0, 1, JElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, JElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJElement_Framework(), ecorePackage.getEBoolean(), "framework", null, 0, 1, JElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJElement_Participates(), this.getJLayer(), "participates", null, 0, -1, JElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJElement_Visibility(), this.getJVisibility(), "visibility", null, 0, 1, JElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jTypeEClass, JType.class, "JType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(jTypedElementEClass, JTypedElement.class, "JTypedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJTypedElement_Type(), this.getJType(), null, "type", null, 1, 1, JTypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJTypedElement_Value(), ecorePackage.getEString(), "value", null, 0, 1, JTypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJTypedElement_Derived(), ecorePackage.getEBoolean(), "derived", null, 0, 1, JTypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJTypedElement_Calculated(), ecorePackage.getEBoolean(), "calculated", null, 0, 1, JTypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJTypedElement_Lower(), ecorePackage.getEInt(), "lower", "0", 0, 1, JTypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJTypedElement_Upper(), ecorePackage.getEInt(), "upper", "1", 0, 1, JTypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJTypedElement_Ordered(), ecorePackage.getEBoolean(), "ordered", null, 0, 1, JTypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJTypedElement_Unique(), ecorePackage.getEBoolean(), "unique", null, 0, 1, JTypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jPrimitiveEClass, JPrimitive.class, "JPrimitive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJPrimitive_Package(), this.getJPackage(), this.getJPackage_Primitives(), "package", null, 0, 1, JPrimitive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJPrimitive_UseForIdType(), ecorePackage.getEBoolean(), "useForIdType", null, 0, 1, JPrimitive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jEnumerationEClass, JEnumeration.class, "JEnumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJEnumeration_Package(), this.getJPackage(), this.getJPackage_Enumerations(), "package", null, 0, 1, JEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJEnumeration_Literals(), this.getJLiteral(), this.getJLiteral_Enumeration(), "literals", null, 0, -1, JEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJEnumeration_ClassRepresentation(), this.getJClass(), this.getJClass_FixedEnum(), "classRepresentation", null, 0, 1, JEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jClassEClass, JClass.class, "JClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJClass_Abstract(), ecorePackage.getEBoolean(), "abstract", null, 0, 1, JClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJClass_StateMachines(), this.getJStateMachine(), this.getJStateMachine_OwnerClass(), "stateMachines", null, 0, -1, JClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJClass_Operations(), this.getJOperation(), this.getJOperation_OwnerClass(), "operations", null, 0, -1, JClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJClass_AttributeOrder(), this.getJUIAttributeGroup(), null, "attributeOrder", null, 0, -1, JClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJClass_AttributesForListing(), this.getJAttribute(), null, "attributesForListing", null, 0, -1, JClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJClass_FixedEnum(), this.getJEnumeration(), this.getJEnumeration_ClassRepresentation(), "fixedEnum", null, 0, 1, JClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJClass_RepresentsTenant(), ecorePackage.getEBoolean(), "representsTenant", null, 0, 1, JClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJClass_TenantMember(), ecorePackage.getEBoolean(), "tenantMember", null, 0, 1, JClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJClass_Representation(), this.getJAttribute(), null, "representation", null, 0, 1, JClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJClass_RepresentsEnum(), ecorePackage.getEBoolean(), "representsEnum", null, 0, 1, JClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJClass_RepresentsTenantUser(), ecorePackage.getEBoolean(), "representsTenantUser", null, 0, 1, JClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJClass_RepresentsUser(), ecorePackage.getEBoolean(), "representsUser", null, 0, 1, JClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJClass_Supertype(), this.getJClass(), null, "supertype", null, 0, 1, JClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJClass_Package(), this.getJPackage(), this.getJPackage_Classes(), "package", null, 0, 1, JClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJClass_Roles(), this.getJRole(), this.getJRole_OwnerClass(), "roles", null, 0, -1, JClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJClass_Attributes(), this.getJAttribute(), this.getJAttribute_OwnerClass(), "attributes", null, 0, -1, JClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJClass_BusinessSingleton(), ecorePackage.getEBoolean(), "businessSingleton", null, 0, 1, JClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJClass_Aliases(), this.getJUIAlias(), this.getJUIAlias_OwnerClass(), "aliases", null, 0, -1, JClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJClass_Watched(), ecorePackage.getEBoolean(), "watched", "false", 0, 1, JClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJClass_RepresentsEnumValue(), ecorePackage.getEBoolean(), "representsEnumValue", null, 0, 1, JClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jAttributeEClass, JAttribute.class, "JAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJAttribute_Placeholder(), ecorePackage.getEString(), "placeholder", null, 0, 1, JAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJAttribute_Regexp(), ecorePackage.getEString(), "regexp", null, 0, 1, JAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJAttribute_Mandatory(), ecorePackage.getEBoolean(), "mandatory", null, 0, 1, JAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJAttribute_Decimals(), ecorePackage.getEInt(), "decimals", null, 0, 1, JAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJAttribute_Interval(), ecorePackage.getEString(), "interval", null, 0, 1, JAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJAttribute_Technical(), ecorePackage.getEBoolean(), "technical", null, 0, 1, JAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJAttribute_OwnerClass(), this.getJClass(), this.getJClass_Attributes(), "ownerClass", null, 0, 1, JAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJAttribute_UiNoSearch(), ecorePackage.getEBoolean(), "uiNoSearch", "false", 0, 1, JAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJAttribute_Watched(), ecorePackage.getEBoolean(), "watched", "false", 0, 1, JAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJAttribute_RepresentsId(), ecorePackage.getEBoolean(), "representsId", "false", 0, 1, JAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jOperationEClass, JOperation.class, "JOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJOperation_ClassBased(), ecorePackage.getEBoolean(), "classBased", null, 0, 1, JOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJOperation_OwnerClass(), this.getJClass(), this.getJClass_Operations(), "ownerClass", null, 0, 1, JOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJOperation_Parameters(), this.getJParameter(), this.getJParameter_OwnerOperation(), "parameters", null, 0, -1, JOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJOperation_Transition(), this.getJTransition(), this.getJTransition_ExecutingOperation(), "transition", null, 0, -1, JOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJOperation_Bulk(), ecorePackage.getEBoolean(), "bulk", null, 0, 1, JOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJOperation_Kind(), this.getJOperationKind(), "kind", null, 0, 1, JOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJOperation_UiMustConfirm(), ecorePackage.getEBoolean(), "uiMustConfirm", "false", 0, 1, JOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jParameterEClass, JParameter.class, "JParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJParameter_OwnerOperation(), this.getJOperation(), this.getJOperation_Parameters(), "ownerOperation", null, 0, 1, JParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJParameter_Input(), ecorePackage.getEBoolean(), "input", "true", 0, 1, JParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJParameter_Interval(), ecorePackage.getEString(), "interval", null, 0, 1, JParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jRelationshipEClass, JRelationship.class, "JRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJRelationship_Package(), this.getJPackage(), this.getJPackage_Relationships(), "package", null, 0, 1, JRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJRelationship_Roles(), this.getJRole(), this.getJRole_OwnerRelationship(), "roles", null, 2, 2, JRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJRelationship_Derived(), ecorePackage.getEBoolean(), "derived", null, 0, 1, JRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jRoleEClass, JRole.class, "JRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJRole_Lower(), ecorePackage.getEInt(), "lower", "0", 0, 1, JRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJRole_Upper(), ecorePackage.getEInt(), "upper", "1", 0, 1, JRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJRole_Navigable(), ecorePackage.getEBoolean(), "navigable", null, 0, 1, JRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJRole_Unique(), ecorePackage.getEBoolean(), "unique", null, 0, 1, JRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJRole_Ordered(), ecorePackage.getEBoolean(), "ordered", "true", 0, 1, JRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJRole_OwnerRelationship(), this.getJRelationship(), this.getJRelationship_Roles(), "ownerRelationship", null, 1, 1, JRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJRole_DerivedExpression(), ecorePackage.getEString(), "derivedExpression", null, 0, 1, JRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJRole_DerivedDescription(), ecorePackage.getEString(), "derivedDescription", null, 0, 1, JRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJRole_Kind(), this.getJAssociationKind(), "kind", "ASSOCIATION", 0, 1, JRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJRole_OptionScript(), ecorePackage.getEString(), "optionScript", null, 0, 1, JRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJRole_OwnerClass(), this.getJClass(), this.getJClass_Roles(), "ownerClass", null, 1, 1, JRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJRole_Value(), ecorePackage.getEString(), "value", null, 0, 1, JRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJRole_Calculated(), ecorePackage.getEBoolean(), "calculated", null, 0, 1, JRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJRole_Interval(), ecorePackage.getEString(), "interval", null, 0, 1, JRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jLiteralEClass, JLiteral.class, "JLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJLiteral_Enumeration(), this.getJEnumeration(), this.getJEnumeration_Literals(), "enumeration", null, 0, 1, JLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jPackageEClass, JPackage.class, "JPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJPackage_Enumerations(), this.getJEnumeration(), this.getJEnumeration_Package(), "enumerations", null, 0, -1, JPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJPackage_Primitives(), this.getJPrimitive(), this.getJPrimitive_Package(), "primitives", null, 0, -1, JPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJPackage_Relationships(), this.getJRelationship(), this.getJRelationship_Package(), "relationships", null, 0, -1, JPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJPackage_Children(), this.getJPackage(), this.getJPackage_Parent(), "children", null, 0, -1, JPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJPackage_Parent(), this.getJPackage(), this.getJPackage_Children(), "parent", null, 0, 1, JPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJPackage_OwnerModel(), this.getJModel(), this.getJModel_Packages(), "ownerModel", null, 0, 1, JPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJPackage_Classes(), this.getJClass(), this.getJClass_Package(), "classes", null, 0, -1, JPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jStateMachineEClass, JStateMachine.class, "JStateMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJStateMachine_OwnerClass(), this.getJClass(), this.getJClass_StateMachines(), "ownerClass", null, 0, 1, JStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJStateMachine_States(), this.getJState(), this.getJState_OwnerStateMachine(), "states", null, 0, -1, JStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJStateMachine_Transitions(), this.getJTransition(), this.getJTransition_StateMachine(), "transitions", null, 0, -1, JStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJStateMachine_CorrespondingEnum(), this.getJEnumeration(), null, "correspondingEnum", null, 1, 1, JStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jTransitionEClass, JTransition.class, "JTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJTransition_StateMachine(), this.getJStateMachine(), this.getJStateMachine_Transitions(), "stateMachine", null, 0, 1, JTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJTransition_Guard(), this.getJGuard(), this.getJGuard_Transition(), "guard", null, 0, 1, JTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJTransition_ToState(), this.getJState(), this.getJState_IncomingTransitions(), "toState", null, 1, 1, JTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJTransition_FromState(), this.getJState(), this.getJState_OutgoingTransitions(), "fromState", null, 1, 1, JTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJTransition_ExecutingOperation(), this.getJOperation(), this.getJOperation_Transition(), "executingOperation", null, 0, 1, JTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jStateEClass, JState.class, "JState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJState_OwnerStateMachine(), this.getJStateMachine(), this.getJStateMachine_States(), "ownerStateMachine", null, 0, 1, JState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJState_IncomingTransitions(), this.getJTransition(), this.getJTransition_ToState(), "incomingTransitions", null, 0, -1, JState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJState_OutgoingTransitions(), this.getJTransition(), this.getJTransition_FromState(), "outgoingTransitions", null, 0, -1, JState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJState_InitialState(), ecorePackage.getEBoolean(), "initialState", null, 0, 1, JState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJState_FinalState(), ecorePackage.getEBoolean(), "finalState", null, 0, 1, JState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jGuardEClass, JGuard.class, "JGuard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJGuard_Transition(), this.getJTransition(), this.getJTransition_Guard(), "transition", null, 0, 1, JGuard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJGuard_Text(), ecorePackage.getEString(), "text", null, 0, 1, JGuard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJGuard_Expression(), ecorePackage.getEString(), "expression", null, 0, 1, JGuard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jModelEClass, JModel.class, "JModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJModel_Packages(), this.getJPackage(), this.getJPackage_OwnerModel(), "packages", null, 0, -1, JModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJModel_PackagePrefix(), ecorePackage.getEString(), "packagePrefix", null, 0, 1, JModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJModel_ApplicationTop(), this.getJPackage(), null, "applicationTop", null, 1, 1, JModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJModel_RootMenuItems(), this.getJUIMenuItem(), null, "rootMenuItems", null, 0, -1, JModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJModel_Info(), this.getJInfo(), null, "info", null, 0, 1, JModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(juiMenuItemEClass, JUIMenuItem.class, "JUIMenuItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJUIMenuItem_Children(), this.getJUIMenuItem(), this.getJUIMenuItem_Parent(), "children", null, 0, -1, JUIMenuItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJUIMenuItem_Parent(), this.getJUIMenuItem(), this.getJUIMenuItem_Children(), "parent", null, 0, 1, JUIMenuItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJUIMenuItem_Represent(), this.getJClass(), null, "represent", null, 0, 1, JUIMenuItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJUIMenuItem_Uifilters(), this.getJUIFilter(), null, "uifilters", null, 0, -1, JUIMenuItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJUIMenuItem_Type(), this.getJMenuItemType(), "type", null, 0, 1, JUIMenuItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJUIMenuItem_Alias(), this.getJUIAlias(), null, "alias", null, 0, 1, JUIMenuItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(juiAttributeGroupEClass, JUIAttributeGroup.class, "JUIAttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJUIAttributeGroup_Attributes(), this.getJAttribute(), null, "attributes", null, 0, -1, JUIAttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJUIAttributeGroup_Position(), ecorePackage.getEInt(), "position", null, 0, 1, JUIAttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(juiFilterEClass, JUIFilter.class, "JUIFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJUIFilter_Attribute(), this.getJAttribute(), null, "attribute", null, 1, 1, JUIFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJUIFilter_Operator(), this.getJOperator(), "operator", null, 1, 1, JUIFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJUIFilter_Value(), ecorePackage.getEString(), "value", null, 1, 1, JUIFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(juiAliasEClass, JUIAlias.class, "JUIAlias", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJUIAlias_OwnerClass(), this.getJClass(), this.getJClass_Aliases(), "ownerClass", null, 1, 1, JUIAlias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jInfoEClass, JInfo.class, "JInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJInfo_Submodels(), this.getJSubmodel(), null, "submodels", null, 0, -1, JInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jSubmodelEClass, JSubmodel.class, "JSubmodel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJSubmodel_Version(), ecorePackage.getEString(), "version", null, 0, 1, JSubmodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(jVisibilityEEnum, JVisibility.class, "JVisibility");
		addEEnumLiteral(jVisibilityEEnum, JVisibility.PUBLIC);
		addEEnumLiteral(jVisibilityEEnum, JVisibility.PROTECTED);
		addEEnumLiteral(jVisibilityEEnum, JVisibility.PACKAGE);
		addEEnumLiteral(jVisibilityEEnum, JVisibility.PRIVATE);

		initEEnum(jAssociationKindEEnum, JAssociationKind.class, "JAssociationKind");
		addEEnumLiteral(jAssociationKindEEnum, JAssociationKind.ASSOCIATION);
		addEEnumLiteral(jAssociationKindEEnum, JAssociationKind.AGGREGATION);
		addEEnumLiteral(jAssociationKindEEnum, JAssociationKind.COMPOSITION);

		initEEnum(jOperationKindEEnum, JOperationKind.class, "JOperationKind");
		addEEnumLiteral(jOperationKindEEnum, JOperationKind.CUSTOM);
		addEEnumLiteral(jOperationKindEEnum, JOperationKind.QUERY);

		initEEnum(jLayerEEnum, JLayer.class, "JLayer");
		addEEnumLiteral(jLayerEEnum, JLayer.ALL);
		addEEnumLiteral(jLayerEEnum, JLayer.PERSISTENCE);
		addEEnumLiteral(jLayerEEnum, JLayer.SERVICE);
		addEEnumLiteral(jLayerEEnum, JLayer.OPERATION);
		addEEnumLiteral(jLayerEEnum, JLayer.REST);
		addEEnumLiteral(jLayerEEnum, JLayer.UI);
		addEEnumLiteral(jLayerEEnum, JLayer.DOCUMENT);
		addEEnumLiteral(jLayerEEnum, JLayer.PERMISSION);
		addEEnumLiteral(jLayerEEnum, JLayer.SCREEN);

		initEEnum(jMenuItemTypeEEnum, JMenuItemType.class, "JMenuItemType");
		addEEnumLiteral(jMenuItemTypeEEnum, JMenuItemType.OBJECT);
		addEEnumLiteral(jMenuItemTypeEEnum, JMenuItemType.LIST);
		addEEnumLiteral(jMenuItemTypeEEnum, JMenuItemType.NONE);

		initEEnum(jOperatorEEnum, JOperator.class, "JOperator");
		addEEnumLiteral(jOperatorEEnum, JOperator.EQ);
		addEEnumLiteral(jOperatorEEnum, JOperator.NE);
		addEEnumLiteral(jOperatorEEnum, JOperator.LT);
		addEEnumLiteral(jOperatorEEnum, JOperator.LTE);
		addEEnumLiteral(jOperatorEEnum, JOperator.GT);
		addEEnumLiteral(jOperatorEEnum, JOperator.GTE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (getJClass_Operations(),
		   source,
		   new String[] {
			   "kind", "simple"
		   });
	}

} //PsmPackageImpl
