/**
 */
package psm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JState</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link psm.JState#getOwnerStateMachine <em>Owner State Machine</em>}</li>
 *   <li>{@link psm.JState#getIncomingTransitions <em>Incoming Transitions</em>}</li>
 *   <li>{@link psm.JState#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 *   <li>{@link psm.JState#isInitialState <em>Initial State</em>}</li>
 *   <li>{@link psm.JState#isFinalState <em>Final State</em>}</li>
 * </ul>
 *
 * @see psm.PsmPackage#getJState()
 * @model
 * @generated
 */
public interface JState extends JElement {
	/**
	 * Returns the value of the '<em><b>Owner State Machine</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link psm.JStateMachine#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner State Machine</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner State Machine</em>' container reference.
	 * @see #setOwnerStateMachine(JStateMachine)
	 * @see psm.PsmPackage#getJState_OwnerStateMachine()
	 * @see psm.JStateMachine#getStates
	 * @model opposite="states" transient="false"
	 * @generated
	 */
	JStateMachine getOwnerStateMachine();

	/**
	 * Sets the value of the '{@link psm.JState#getOwnerStateMachine <em>Owner State Machine</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner State Machine</em>' container reference.
	 * @see #getOwnerStateMachine()
	 * @generated
	 */
	void setOwnerStateMachine(JStateMachine value);

	/**
	 * Returns the value of the '<em><b>Incoming Transitions</b></em>' reference list.
	 * The list contents are of type {@link psm.JTransition}.
	 * It is bidirectional and its opposite is '{@link psm.JTransition#getToState <em>To State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Transitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Transitions</em>' reference list.
	 * @see psm.PsmPackage#getJState_IncomingTransitions()
	 * @see psm.JTransition#getToState
	 * @model opposite="toState"
	 * @generated
	 */
	EList<JTransition> getIncomingTransitions();

	/**
	 * Returns the value of the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * The list contents are of type {@link psm.JTransition}.
	 * It is bidirectional and its opposite is '{@link psm.JTransition#getFromState <em>From State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Transitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Transitions</em>' reference list.
	 * @see psm.PsmPackage#getJState_OutgoingTransitions()
	 * @see psm.JTransition#getFromState
	 * @model opposite="fromState"
	 * @generated
	 */
	EList<JTransition> getOutgoingTransitions();

	/**
	 * Returns the value of the '<em><b>Initial State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial State</em>' attribute.
	 * @see #setInitialState(boolean)
	 * @see psm.PsmPackage#getJState_InitialState()
	 * @model
	 * @generated
	 */
	boolean isInitialState();

	/**
	 * Sets the value of the '{@link psm.JState#isInitialState <em>Initial State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial State</em>' attribute.
	 * @see #isInitialState()
	 * @generated
	 */
	void setInitialState(boolean value);

	/**
	 * Returns the value of the '<em><b>Final State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final State</em>' attribute.
	 * @see #setFinalState(boolean)
	 * @see psm.PsmPackage#getJState_FinalState()
	 * @model
	 * @generated
	 */
	boolean isFinalState();

	/**
	 * Sets the value of the '{@link psm.JState#isFinalState <em>Final State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final State</em>' attribute.
	 * @see #isFinalState()
	 * @generated
	 */
	void setFinalState(boolean value);

} // JState
