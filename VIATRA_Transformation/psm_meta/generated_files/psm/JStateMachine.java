/**
 */
package psm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JState Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link psm.JStateMachine#getOwnerClass <em>Owner Class</em>}</li>
 *   <li>{@link psm.JStateMachine#getStates <em>States</em>}</li>
 *   <li>{@link psm.JStateMachine#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link psm.JStateMachine#getCorrespondingEnum <em>Corresponding Enum</em>}</li>
 * </ul>
 *
 * @see psm.PsmPackage#getJStateMachine()
 * @model
 * @generated
 */
public interface JStateMachine extends JElement {
	/**
	 * Returns the value of the '<em><b>Owner Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link psm.JClass#getStateMachines <em>State Machines</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner Class</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Class</em>' container reference.
	 * @see #setOwnerClass(JClass)
	 * @see psm.PsmPackage#getJStateMachine_OwnerClass()
	 * @see psm.JClass#getStateMachines
	 * @model opposite="stateMachines" transient="false"
	 * @generated
	 */
	JClass getOwnerClass();

	/**
	 * Sets the value of the '{@link psm.JStateMachine#getOwnerClass <em>Owner Class</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Class</em>' container reference.
	 * @see #getOwnerClass()
	 * @generated
	 */
	void setOwnerClass(JClass value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link psm.JState}.
	 * It is bidirectional and its opposite is '{@link psm.JState#getOwnerStateMachine <em>Owner State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see psm.PsmPackage#getJStateMachine_States()
	 * @see psm.JState#getOwnerStateMachine
	 * @model opposite="ownerStateMachine" containment="true"
	 * @generated
	 */
	EList<JState> getStates();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link psm.JTransition}.
	 * It is bidirectional and its opposite is '{@link psm.JTransition#getStateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see psm.PsmPackage#getJStateMachine_Transitions()
	 * @see psm.JTransition#getStateMachine
	 * @model opposite="stateMachine" containment="true"
	 * @generated
	 */
	EList<JTransition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Corresponding Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Corresponding Enum</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corresponding Enum</em>' reference.
	 * @see #setCorrespondingEnum(JEnumeration)
	 * @see psm.PsmPackage#getJStateMachine_CorrespondingEnum()
	 * @model required="true"
	 * @generated
	 */
	JEnumeration getCorrespondingEnum();

	/**
	 * Sets the value of the '{@link psm.JStateMachine#getCorrespondingEnum <em>Corresponding Enum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corresponding Enum</em>' reference.
	 * @see #getCorrespondingEnum()
	 * @generated
	 */
	void setCorrespondingEnum(JEnumeration value);

} // JStateMachine
