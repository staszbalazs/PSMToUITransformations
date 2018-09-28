/**
 */
package traceability;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import psm.JElement;

import ui.Identifiable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PSM To UI Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link traceability.PSMToUITrace#getUiElements <em>Ui Elements</em>}</li>
 *   <li>{@link traceability.PSMToUITrace#getPsmElements <em>Psm Elements</em>}</li>
 * </ul>
 *
 * @see traceability.TraceabilityPackage#getPSMToUITrace()
 * @model
 * @generated
 */
public interface PSMToUITrace extends EObject {
	/**
	 * Returns the value of the '<em><b>Ui Elements</b></em>' reference list.
	 * The list contents are of type {@link ui.Identifiable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ui Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ui Elements</em>' reference list.
	 * @see traceability.TraceabilityPackage#getPSMToUITrace_UiElements()
	 * @model
	 * @generated
	 */
	EList<Identifiable> getUiElements();

	/**
	 * Returns the value of the '<em><b>Psm Elements</b></em>' reference list.
	 * The list contents are of type {@link psm.JElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Psm Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Psm Elements</em>' reference list.
	 * @see traceability.TraceabilityPackage#getPSMToUITrace_PsmElements()
	 * @model
	 * @generated
	 */
	EList<JElement> getPsmElements();

} // PSMToUITrace
