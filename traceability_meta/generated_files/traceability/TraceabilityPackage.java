/**
 */
package traceability;

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
 * @see traceability.TraceabilityFactory
 * @model kind="package"
 * @generated
 */
public interface TraceabilityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "traceability";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://blackbelt.hu/judo/meta/psm/ui/traceability";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "traceability";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TraceabilityPackage eINSTANCE = traceability.impl.TraceabilityPackageImpl.init();

	/**
	 * The meta object id for the '{@link traceability.impl.PSMToUIImpl <em>PSM To UI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see traceability.impl.PSMToUIImpl
	 * @see traceability.impl.TraceabilityPackageImpl#getPSMToUI()
	 * @generated
	 */
	int PSM_TO_UI = 0;

	/**
	 * The feature id for the '<em><b>Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSM_TO_UI__TRACES = 0;

	/**
	 * The feature id for the '<em><b>JModel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSM_TO_UI__JMODEL = 1;

	/**
	 * The feature id for the '<em><b>Ui Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSM_TO_UI__UI_BASE = 2;

	/**
	 * The number of structural features of the '<em>PSM To UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSM_TO_UI_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>PSM To UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSM_TO_UI_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link traceability.impl.PSMToUITraceImpl <em>PSM To UI Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see traceability.impl.PSMToUITraceImpl
	 * @see traceability.impl.TraceabilityPackageImpl#getPSMToUITrace()
	 * @generated
	 */
	int PSM_TO_UI_TRACE = 1;

	/**
	 * The feature id for the '<em><b>Ui Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSM_TO_UI_TRACE__UI_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Psm Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSM_TO_UI_TRACE__PSM_ELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>PSM To UI Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSM_TO_UI_TRACE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>PSM To UI Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSM_TO_UI_TRACE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link traceability.PSMToUI <em>PSM To UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PSM To UI</em>'.
	 * @see traceability.PSMToUI
	 * @generated
	 */
	EClass getPSMToUI();

	/**
	 * Returns the meta object for the reference list '{@link traceability.PSMToUI#getTraces <em>Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Traces</em>'.
	 * @see traceability.PSMToUI#getTraces()
	 * @see #getPSMToUI()
	 * @generated
	 */
	EReference getPSMToUI_Traces();

	/**
	 * Returns the meta object for the reference '{@link traceability.PSMToUI#getJModel <em>JModel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>JModel</em>'.
	 * @see traceability.PSMToUI#getJModel()
	 * @see #getPSMToUI()
	 * @generated
	 */
	EReference getPSMToUI_JModel();

	/**
	 * Returns the meta object for the reference '{@link traceability.PSMToUI#getUiBase <em>Ui Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ui Base</em>'.
	 * @see traceability.PSMToUI#getUiBase()
	 * @see #getPSMToUI()
	 * @generated
	 */
	EReference getPSMToUI_UiBase();

	/**
	 * Returns the meta object for class '{@link traceability.PSMToUITrace <em>PSM To UI Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PSM To UI Trace</em>'.
	 * @see traceability.PSMToUITrace
	 * @generated
	 */
	EClass getPSMToUITrace();

	/**
	 * Returns the meta object for the reference list '{@link traceability.PSMToUITrace#getUiElements <em>Ui Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ui Elements</em>'.
	 * @see traceability.PSMToUITrace#getUiElements()
	 * @see #getPSMToUITrace()
	 * @generated
	 */
	EReference getPSMToUITrace_UiElements();

	/**
	 * Returns the meta object for the reference list '{@link traceability.PSMToUITrace#getPsmElements <em>Psm Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Psm Elements</em>'.
	 * @see traceability.PSMToUITrace#getPsmElements()
	 * @see #getPSMToUITrace()
	 * @generated
	 */
	EReference getPSMToUITrace_PsmElements();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TraceabilityFactory getTraceabilityFactory();

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
		 * The meta object literal for the '{@link traceability.impl.PSMToUIImpl <em>PSM To UI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see traceability.impl.PSMToUIImpl
		 * @see traceability.impl.TraceabilityPackageImpl#getPSMToUI()
		 * @generated
		 */
		EClass PSM_TO_UI = eINSTANCE.getPSMToUI();

		/**
		 * The meta object literal for the '<em><b>Traces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSM_TO_UI__TRACES = eINSTANCE.getPSMToUI_Traces();

		/**
		 * The meta object literal for the '<em><b>JModel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSM_TO_UI__JMODEL = eINSTANCE.getPSMToUI_JModel();

		/**
		 * The meta object literal for the '<em><b>Ui Base</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSM_TO_UI__UI_BASE = eINSTANCE.getPSMToUI_UiBase();

		/**
		 * The meta object literal for the '{@link traceability.impl.PSMToUITraceImpl <em>PSM To UI Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see traceability.impl.PSMToUITraceImpl
		 * @see traceability.impl.TraceabilityPackageImpl#getPSMToUITrace()
		 * @generated
		 */
		EClass PSM_TO_UI_TRACE = eINSTANCE.getPSMToUITrace();

		/**
		 * The meta object literal for the '<em><b>Ui Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSM_TO_UI_TRACE__UI_ELEMENTS = eINSTANCE.getPSMToUITrace_UiElements();

		/**
		 * The meta object literal for the '<em><b>Psm Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSM_TO_UI_TRACE__PSM_ELEMENTS = eINSTANCE.getPSMToUITrace_PsmElements();

	}

} //TraceabilityPackage
