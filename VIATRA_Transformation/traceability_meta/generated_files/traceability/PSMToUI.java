/**
 */
package traceability;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import psm.JModel;

import psmToUiTypeMapping.Mappings;
import ui.UIBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PSM To UI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link traceability.PSMToUI#getTraces <em>Traces</em>}</li>
 *   <li>{@link traceability.PSMToUI#getJModel <em>JModel</em>}</li>
 *   <li>{@link traceability.PSMToUI#getUiBase <em>Ui Base</em>}</li>
 *   <li>{@link traceability.PSMToUI#getTypeMappings <em>Type Mappings</em>}</li>
 * </ul>
 *
 * @see traceability.TraceabilityPackage#getPSMToUI()
 * @model
 * @generated
 */
public interface PSMToUI extends EObject {
	/**
	 * Returns the value of the '<em><b>Traces</b></em>' containment reference list.
	 * The list contents are of type {@link traceability.PSMToUITrace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Traces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traces</em>' containment reference list.
	 * @see traceability.TraceabilityPackage#getPSMToUI_Traces()
	 * @model containment="true"
	 * @generated
	 */
	EList<PSMToUITrace> getTraces();

	/**
	 * Returns the value of the '<em><b>JModel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>JModel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>JModel</em>' reference.
	 * @see #setJModel(JModel)
	 * @see traceability.TraceabilityPackage#getPSMToUI_JModel()
	 * @model
	 * @generated
	 */
	JModel getJModel();

	/**
	 * Sets the value of the '{@link traceability.PSMToUI#getJModel <em>JModel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>JModel</em>' reference.
	 * @see #getJModel()
	 * @generated
	 */
	void setJModel(JModel value);

	/**
	 * Returns the value of the '<em><b>Ui Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ui Base</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ui Base</em>' reference.
	 * @see #setUiBase(UIBase)
	 * @see traceability.TraceabilityPackage#getPSMToUI_UiBase()
	 * @model
	 * @generated
	 */
	UIBase getUiBase();

	/**
	 * Sets the value of the '{@link traceability.PSMToUI#getUiBase <em>Ui Base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ui Base</em>' reference.
	 * @see #getUiBase()
	 * @generated
	 */
	void setUiBase(UIBase value);

	/**
	 * Returns the value of the '<em><b>Type Mappings</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Mappings</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Mappings</em>' reference.
	 * @see #setTypeMappings(Mappings)
	 * @see traceability.TraceabilityPackage#getPSMToUI_TypeMappings()
	 * @model
	 * @generated
	 */
	Mappings getTypeMappings();

	/**
	 * Sets the value of the '{@link traceability.PSMToUI#getTypeMappings <em>Type Mappings</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Mappings</em>' reference.
	 * @see #getTypeMappings()
	 * @generated
	 */
	void setTypeMappings(Mappings value);

} // PSMToUI
