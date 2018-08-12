/**
 */
package traceability.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import psm.PsmPackage;

import traceability.PSMToUI;
import traceability.PSMToUITrace;
import traceability.TraceabilityFactory;
import traceability.TraceabilityPackage;

import ui.UiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TraceabilityPackageImpl extends EPackageImpl implements TraceabilityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass psmToUIEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass psmToUITraceEClass = null;

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
	 * @see traceability.TraceabilityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TraceabilityPackageImpl() {
		super(eNS_URI, TraceabilityFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TraceabilityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TraceabilityPackage init() {
		if (isInited) return (TraceabilityPackage)EPackage.Registry.INSTANCE.getEPackage(TraceabilityPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTraceabilityPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TraceabilityPackageImpl theTraceabilityPackage = registeredTraceabilityPackage instanceof TraceabilityPackageImpl ? (TraceabilityPackageImpl)registeredTraceabilityPackage : new TraceabilityPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		PsmPackage.eINSTANCE.eClass();
		UiPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTraceabilityPackage.createPackageContents();

		// Initialize created meta-data
		theTraceabilityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTraceabilityPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TraceabilityPackage.eNS_URI, theTraceabilityPackage);
		return theTraceabilityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPSMToUI() {
		return psmToUIEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSMToUI_JModel() {
		return (EReference)psmToUIEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSMToUI_UiBase() {
		return (EReference)psmToUIEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSMToUI_Traces() {
		return (EReference)psmToUIEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPSMToUITrace() {
		return psmToUITraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSMToUITrace_UiElements() {
		return (EReference)psmToUITraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSMToUITrace_PsmElements() {
		return (EReference)psmToUITraceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceabilityFactory getTraceabilityFactory() {
		return (TraceabilityFactory)getEFactoryInstance();
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
		psmToUIEClass = createEClass(PSM_TO_UI);
		createEReference(psmToUIEClass, PSM_TO_UI__JMODEL);
		createEReference(psmToUIEClass, PSM_TO_UI__UI_BASE);
		createEReference(psmToUIEClass, PSM_TO_UI__TRACES);

		psmToUITraceEClass = createEClass(PSM_TO_UI_TRACE);
		createEReference(psmToUITraceEClass, PSM_TO_UI_TRACE__UI_ELEMENTS);
		createEReference(psmToUITraceEClass, PSM_TO_UI_TRACE__PSM_ELEMENTS);
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

		// Obtain other dependent packages
		PsmPackage thePsmPackage = (PsmPackage)EPackage.Registry.INSTANCE.getEPackage(PsmPackage.eNS_URI);
		UiPackage theUiPackage = (UiPackage)EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(psmToUIEClass, PSMToUI.class, "PSMToUI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPSMToUI_JModel(), thePsmPackage.getJModel(), null, "jModel", null, 0, 1, PSMToUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPSMToUI_UiBase(), theUiPackage.getUIBase(), null, "uiBase", null, 0, 1, PSMToUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPSMToUI_Traces(), this.getPSMToUITrace(), null, "traces", null, 0, -1, PSMToUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(psmToUITraceEClass, PSMToUITrace.class, "PSMToUITrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPSMToUITrace_UiElements(), theUiPackage.getIdentifiable(), null, "uiElements", null, 0, -1, PSMToUITrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPSMToUITrace_PsmElements(), thePsmPackage.getJElement(), null, "psmElements", null, 0, -1, PSMToUITrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //TraceabilityPackageImpl
