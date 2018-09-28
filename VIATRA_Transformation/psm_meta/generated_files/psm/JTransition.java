/**
 */
package psm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JTransition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link psm.JTransition#getStateMachine <em>State Machine</em>}</li>
 *   <li>{@link psm.JTransition#getGuard <em>Guard</em>}</li>
 *   <li>{@link psm.JTransition#getToState <em>To State</em>}</li>
 *   <li>{@link psm.JTransition#getFromState <em>From State</em>}</li>
 *   <li>{@link psm.JTransition#getExecutingOperation <em>Executing Operation</em>}</li>
 * </ul>
 *
 * @see psm.PsmPackage#getJTransition()
 * @model
 * @generated
 */
public interface JTransition extends JElement {
	/**
	 * Returns the value of the '<em><b>State Machine</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link psm.JStateMachine#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Machine</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Machine</em>' container reference.
	 * @see #setStateMachine(JStateMachine)
	 * @see psm.PsmPackage#getJTransition_StateMachine()
	 * @see psm.JStateMachine#getTransitions
	 * @model opposite="transitions" transient="false"
	 * @generated
	 */
	JStateMachine getStateMachine();

	/**
	 * Sets the value of the '{@link psm.JTransition#getStateMachine <em>State Machine</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Machine</em>' container reference.
	 * @see #getStateMachine()
	 * @generated
	 */
	void setStateMachine(JStateMachine value);

	/**
	 * Returns the value of the '<em><b>Guard</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link psm.JGuard#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' containment reference.
	 * @see #setGuard(JGuard)
	 * @see psm.PsmPackage#getJTransition_Guard()
	 * @see psm.JGuard#getTransition
	 * @model opposite="transition" containment="true"
	 * @generated
	 */
	JGuard getGuard();

	/**
	 * Sets the value of the '{@link psm.JTransition#getGuard <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' containment reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(JGuard value);

	/**
	 * Returns the value of the '<em><b>To State</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link psm.JState#getIncomingTransitions <em>Incoming Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To State</em>' reference.
	 * @see #setToState(JState)
	 * @see psm.PsmPackage#getJTransition_ToState()
	 * @see psm.JState#getIncomingTransitions
	 * @model opposite="incomingTransitions" required="true"
	 * @generated
	 */
	JState getToState();

	/**
	 * Sets the value of the '{@link psm.JTransition#getToState <em>To State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To State</em>' reference.
	 * @see #getToState()
	 * @generated
	 */
	void setToState(JState value);

	/**
	 * Returns the value of the '<em><b>From State</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link psm.JState#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From State</em>' reference.
	 * @see #setFromState(JState)
	 * @see psm.PsmPackage#getJTransition_FromState()
	 * @see psm.JState#getOutgoingTransitions
	 * @model opposite="outgoingTransitions" required="true"
	 * @generated
	 */
	JState getFromState();

	/**
	 * Sets the value of the '{@link psm.JTransition#getFromState <em>From State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From State</em>' reference.
	 * @see #getFromState()
	 * @generated
	 */
	void setFromState(JState value);

	/**
	 * Returns the value of the '<em><b>Executing Operation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link psm.JOperation#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executing Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executing Operation</em>' reference.
	 * @see #setExecutingOperation(JOperation)
	 * @see psm.PsmPackage#getJTransition_ExecutingOperation()
	 * @see psm.JOperation#getTransition
	 * @model opposite="transition"
	 * @generated
	 */
	JOperation getExecutingOperation();

	/**
	 * Sets the value of the '{@link psm.JTransition#getExecutingOperation <em>Executing Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executing Operation</em>' reference.
	 * @see #getExecutingOperation()
	 * @generated
	 */
	void setExecutingOperation(JOperation value);

} // JTransition
