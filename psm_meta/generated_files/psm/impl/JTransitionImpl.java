/**
 */
package psm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import psm.JGuard;
import psm.JOperation;
import psm.JState;
import psm.JStateMachine;
import psm.JTransition;
import psm.PsmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JTransition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link psm.impl.JTransitionImpl#getStateMachine <em>State Machine</em>}</li>
 *   <li>{@link psm.impl.JTransitionImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link psm.impl.JTransitionImpl#getToState <em>To State</em>}</li>
 *   <li>{@link psm.impl.JTransitionImpl#getFromState <em>From State</em>}</li>
 *   <li>{@link psm.impl.JTransitionImpl#getExecutingOperation <em>Executing Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JTransitionImpl extends JElementImpl implements JTransition {
	/**
	 * The cached value of the '{@link #getGuard() <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected JGuard guard;

	/**
	 * The cached value of the '{@link #getToState() <em>To State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToState()
	 * @generated
	 * @ordered
	 */
	protected JState toState;

	/**
	 * The cached value of the '{@link #getFromState() <em>From State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromState()
	 * @generated
	 * @ordered
	 */
	protected JState fromState;

	/**
	 * The cached value of the '{@link #getExecutingOperation() <em>Executing Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutingOperation()
	 * @generated
	 * @ordered
	 */
	protected JOperation executingOperation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PsmPackage.Literals.JTRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JStateMachine getStateMachine() {
		if (eContainerFeatureID() != PsmPackage.JTRANSITION__STATE_MACHINE) return null;
		return (JStateMachine)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStateMachine(JStateMachine newStateMachine, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStateMachine, PsmPackage.JTRANSITION__STATE_MACHINE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateMachine(JStateMachine newStateMachine) {
		if (newStateMachine != eInternalContainer() || (eContainerFeatureID() != PsmPackage.JTRANSITION__STATE_MACHINE && newStateMachine != null)) {
			if (EcoreUtil.isAncestor(this, newStateMachine))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStateMachine != null)
				msgs = ((InternalEObject)newStateMachine).eInverseAdd(this, PsmPackage.JSTATE_MACHINE__TRANSITIONS, JStateMachine.class, msgs);
			msgs = basicSetStateMachine(newStateMachine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JTRANSITION__STATE_MACHINE, newStateMachine, newStateMachine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JGuard getGuard() {
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuard(JGuard newGuard, NotificationChain msgs) {
		JGuard oldGuard = guard;
		guard = newGuard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PsmPackage.JTRANSITION__GUARD, oldGuard, newGuard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuard(JGuard newGuard) {
		if (newGuard != guard) {
			NotificationChain msgs = null;
			if (guard != null)
				msgs = ((InternalEObject)guard).eInverseRemove(this, PsmPackage.JGUARD__TRANSITION, JGuard.class, msgs);
			if (newGuard != null)
				msgs = ((InternalEObject)newGuard).eInverseAdd(this, PsmPackage.JGUARD__TRANSITION, JGuard.class, msgs);
			msgs = basicSetGuard(newGuard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JTRANSITION__GUARD, newGuard, newGuard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JState getToState() {
		if (toState != null && toState.eIsProxy()) {
			InternalEObject oldToState = (InternalEObject)toState;
			toState = (JState)eResolveProxy(oldToState);
			if (toState != oldToState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PsmPackage.JTRANSITION__TO_STATE, oldToState, toState));
			}
		}
		return toState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JState basicGetToState() {
		return toState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToState(JState newToState, NotificationChain msgs) {
		JState oldToState = toState;
		toState = newToState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PsmPackage.JTRANSITION__TO_STATE, oldToState, newToState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToState(JState newToState) {
		if (newToState != toState) {
			NotificationChain msgs = null;
			if (toState != null)
				msgs = ((InternalEObject)toState).eInverseRemove(this, PsmPackage.JSTATE__INCOMING_TRANSITIONS, JState.class, msgs);
			if (newToState != null)
				msgs = ((InternalEObject)newToState).eInverseAdd(this, PsmPackage.JSTATE__INCOMING_TRANSITIONS, JState.class, msgs);
			msgs = basicSetToState(newToState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JTRANSITION__TO_STATE, newToState, newToState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JState getFromState() {
		if (fromState != null && fromState.eIsProxy()) {
			InternalEObject oldFromState = (InternalEObject)fromState;
			fromState = (JState)eResolveProxy(oldFromState);
			if (fromState != oldFromState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PsmPackage.JTRANSITION__FROM_STATE, oldFromState, fromState));
			}
		}
		return fromState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JState basicGetFromState() {
		return fromState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromState(JState newFromState, NotificationChain msgs) {
		JState oldFromState = fromState;
		fromState = newFromState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PsmPackage.JTRANSITION__FROM_STATE, oldFromState, newFromState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromState(JState newFromState) {
		if (newFromState != fromState) {
			NotificationChain msgs = null;
			if (fromState != null)
				msgs = ((InternalEObject)fromState).eInverseRemove(this, PsmPackage.JSTATE__OUTGOING_TRANSITIONS, JState.class, msgs);
			if (newFromState != null)
				msgs = ((InternalEObject)newFromState).eInverseAdd(this, PsmPackage.JSTATE__OUTGOING_TRANSITIONS, JState.class, msgs);
			msgs = basicSetFromState(newFromState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JTRANSITION__FROM_STATE, newFromState, newFromState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JOperation getExecutingOperation() {
		if (executingOperation != null && executingOperation.eIsProxy()) {
			InternalEObject oldExecutingOperation = (InternalEObject)executingOperation;
			executingOperation = (JOperation)eResolveProxy(oldExecutingOperation);
			if (executingOperation != oldExecutingOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PsmPackage.JTRANSITION__EXECUTING_OPERATION, oldExecutingOperation, executingOperation));
			}
		}
		return executingOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JOperation basicGetExecutingOperation() {
		return executingOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExecutingOperation(JOperation newExecutingOperation, NotificationChain msgs) {
		JOperation oldExecutingOperation = executingOperation;
		executingOperation = newExecutingOperation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PsmPackage.JTRANSITION__EXECUTING_OPERATION, oldExecutingOperation, newExecutingOperation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutingOperation(JOperation newExecutingOperation) {
		if (newExecutingOperation != executingOperation) {
			NotificationChain msgs = null;
			if (executingOperation != null)
				msgs = ((InternalEObject)executingOperation).eInverseRemove(this, PsmPackage.JOPERATION__TRANSITION, JOperation.class, msgs);
			if (newExecutingOperation != null)
				msgs = ((InternalEObject)newExecutingOperation).eInverseAdd(this, PsmPackage.JOPERATION__TRANSITION, JOperation.class, msgs);
			msgs = basicSetExecutingOperation(newExecutingOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JTRANSITION__EXECUTING_OPERATION, newExecutingOperation, newExecutingOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PsmPackage.JTRANSITION__STATE_MACHINE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStateMachine((JStateMachine)otherEnd, msgs);
			case PsmPackage.JTRANSITION__GUARD:
				if (guard != null)
					msgs = ((InternalEObject)guard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PsmPackage.JTRANSITION__GUARD, null, msgs);
				return basicSetGuard((JGuard)otherEnd, msgs);
			case PsmPackage.JTRANSITION__TO_STATE:
				if (toState != null)
					msgs = ((InternalEObject)toState).eInverseRemove(this, PsmPackage.JSTATE__INCOMING_TRANSITIONS, JState.class, msgs);
				return basicSetToState((JState)otherEnd, msgs);
			case PsmPackage.JTRANSITION__FROM_STATE:
				if (fromState != null)
					msgs = ((InternalEObject)fromState).eInverseRemove(this, PsmPackage.JSTATE__OUTGOING_TRANSITIONS, JState.class, msgs);
				return basicSetFromState((JState)otherEnd, msgs);
			case PsmPackage.JTRANSITION__EXECUTING_OPERATION:
				if (executingOperation != null)
					msgs = ((InternalEObject)executingOperation).eInverseRemove(this, PsmPackage.JOPERATION__TRANSITION, JOperation.class, msgs);
				return basicSetExecutingOperation((JOperation)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PsmPackage.JTRANSITION__STATE_MACHINE:
				return basicSetStateMachine(null, msgs);
			case PsmPackage.JTRANSITION__GUARD:
				return basicSetGuard(null, msgs);
			case PsmPackage.JTRANSITION__TO_STATE:
				return basicSetToState(null, msgs);
			case PsmPackage.JTRANSITION__FROM_STATE:
				return basicSetFromState(null, msgs);
			case PsmPackage.JTRANSITION__EXECUTING_OPERATION:
				return basicSetExecutingOperation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case PsmPackage.JTRANSITION__STATE_MACHINE:
				return eInternalContainer().eInverseRemove(this, PsmPackage.JSTATE_MACHINE__TRANSITIONS, JStateMachine.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PsmPackage.JTRANSITION__STATE_MACHINE:
				return getStateMachine();
			case PsmPackage.JTRANSITION__GUARD:
				return getGuard();
			case PsmPackage.JTRANSITION__TO_STATE:
				if (resolve) return getToState();
				return basicGetToState();
			case PsmPackage.JTRANSITION__FROM_STATE:
				if (resolve) return getFromState();
				return basicGetFromState();
			case PsmPackage.JTRANSITION__EXECUTING_OPERATION:
				if (resolve) return getExecutingOperation();
				return basicGetExecutingOperation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PsmPackage.JTRANSITION__STATE_MACHINE:
				setStateMachine((JStateMachine)newValue);
				return;
			case PsmPackage.JTRANSITION__GUARD:
				setGuard((JGuard)newValue);
				return;
			case PsmPackage.JTRANSITION__TO_STATE:
				setToState((JState)newValue);
				return;
			case PsmPackage.JTRANSITION__FROM_STATE:
				setFromState((JState)newValue);
				return;
			case PsmPackage.JTRANSITION__EXECUTING_OPERATION:
				setExecutingOperation((JOperation)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PsmPackage.JTRANSITION__STATE_MACHINE:
				setStateMachine((JStateMachine)null);
				return;
			case PsmPackage.JTRANSITION__GUARD:
				setGuard((JGuard)null);
				return;
			case PsmPackage.JTRANSITION__TO_STATE:
				setToState((JState)null);
				return;
			case PsmPackage.JTRANSITION__FROM_STATE:
				setFromState((JState)null);
				return;
			case PsmPackage.JTRANSITION__EXECUTING_OPERATION:
				setExecutingOperation((JOperation)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PsmPackage.JTRANSITION__STATE_MACHINE:
				return getStateMachine() != null;
			case PsmPackage.JTRANSITION__GUARD:
				return guard != null;
			case PsmPackage.JTRANSITION__TO_STATE:
				return toState != null;
			case PsmPackage.JTRANSITION__FROM_STATE:
				return fromState != null;
			case PsmPackage.JTRANSITION__EXECUTING_OPERATION:
				return executingOperation != null;
		}
		return super.eIsSet(featureID);
	}

} //JTransitionImpl
