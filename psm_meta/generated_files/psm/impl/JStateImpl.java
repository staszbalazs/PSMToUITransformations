/**
 */
package psm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import psm.JState;
import psm.JStateMachine;
import psm.JTransition;
import psm.PsmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JState</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link psm.impl.JStateImpl#getOwnerStateMachine <em>Owner State Machine</em>}</li>
 *   <li>{@link psm.impl.JStateImpl#getIncomingTransitions <em>Incoming Transitions</em>}</li>
 *   <li>{@link psm.impl.JStateImpl#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 *   <li>{@link psm.impl.JStateImpl#isInitialState <em>Initial State</em>}</li>
 *   <li>{@link psm.impl.JStateImpl#isFinalState <em>Final State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JStateImpl extends JElementImpl implements JState {
	/**
	 * The cached value of the '{@link #getIncomingTransitions() <em>Incoming Transitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<JTransition> incomingTransitions;

	/**
	 * The cached value of the '{@link #getOutgoingTransitions() <em>Outgoing Transitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<JTransition> outgoingTransitions;

	/**
	 * The default value of the '{@link #isInitialState() <em>Initial State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitialState()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INITIAL_STATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInitialState() <em>Initial State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitialState()
	 * @generated
	 * @ordered
	 */
	protected boolean initialState = INITIAL_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isFinalState() <em>Final State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinalState()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FINAL_STATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFinalState() <em>Final State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinalState()
	 * @generated
	 * @ordered
	 */
	protected boolean finalState = FINAL_STATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PsmPackage.Literals.JSTATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JStateMachine getOwnerStateMachine() {
		if (eContainerFeatureID() != PsmPackage.JSTATE__OWNER_STATE_MACHINE) return null;
		return (JStateMachine)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnerStateMachine(JStateMachine newOwnerStateMachine, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnerStateMachine, PsmPackage.JSTATE__OWNER_STATE_MACHINE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerStateMachine(JStateMachine newOwnerStateMachine) {
		if (newOwnerStateMachine != eInternalContainer() || (eContainerFeatureID() != PsmPackage.JSTATE__OWNER_STATE_MACHINE && newOwnerStateMachine != null)) {
			if (EcoreUtil.isAncestor(this, newOwnerStateMachine))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnerStateMachine != null)
				msgs = ((InternalEObject)newOwnerStateMachine).eInverseAdd(this, PsmPackage.JSTATE_MACHINE__STATES, JStateMachine.class, msgs);
			msgs = basicSetOwnerStateMachine(newOwnerStateMachine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JSTATE__OWNER_STATE_MACHINE, newOwnerStateMachine, newOwnerStateMachine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JTransition> getIncomingTransitions() {
		if (incomingTransitions == null) {
			incomingTransitions = new EObjectWithInverseResolvingEList<JTransition>(JTransition.class, this, PsmPackage.JSTATE__INCOMING_TRANSITIONS, PsmPackage.JTRANSITION__TO_STATE);
		}
		return incomingTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JTransition> getOutgoingTransitions() {
		if (outgoingTransitions == null) {
			outgoingTransitions = new EObjectWithInverseResolvingEList<JTransition>(JTransition.class, this, PsmPackage.JSTATE__OUTGOING_TRANSITIONS, PsmPackage.JTRANSITION__FROM_STATE);
		}
		return outgoingTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInitialState() {
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialState(boolean newInitialState) {
		boolean oldInitialState = initialState;
		initialState = newInitialState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JSTATE__INITIAL_STATE, oldInitialState, initialState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFinalState() {
		return finalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinalState(boolean newFinalState) {
		boolean oldFinalState = finalState;
		finalState = newFinalState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JSTATE__FINAL_STATE, oldFinalState, finalState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PsmPackage.JSTATE__OWNER_STATE_MACHINE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnerStateMachine((JStateMachine)otherEnd, msgs);
			case PsmPackage.JSTATE__INCOMING_TRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingTransitions()).basicAdd(otherEnd, msgs);
			case PsmPackage.JSTATE__OUTGOING_TRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingTransitions()).basicAdd(otherEnd, msgs);
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
			case PsmPackage.JSTATE__OWNER_STATE_MACHINE:
				return basicSetOwnerStateMachine(null, msgs);
			case PsmPackage.JSTATE__INCOMING_TRANSITIONS:
				return ((InternalEList<?>)getIncomingTransitions()).basicRemove(otherEnd, msgs);
			case PsmPackage.JSTATE__OUTGOING_TRANSITIONS:
				return ((InternalEList<?>)getOutgoingTransitions()).basicRemove(otherEnd, msgs);
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
			case PsmPackage.JSTATE__OWNER_STATE_MACHINE:
				return eInternalContainer().eInverseRemove(this, PsmPackage.JSTATE_MACHINE__STATES, JStateMachine.class, msgs);
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
			case PsmPackage.JSTATE__OWNER_STATE_MACHINE:
				return getOwnerStateMachine();
			case PsmPackage.JSTATE__INCOMING_TRANSITIONS:
				return getIncomingTransitions();
			case PsmPackage.JSTATE__OUTGOING_TRANSITIONS:
				return getOutgoingTransitions();
			case PsmPackage.JSTATE__INITIAL_STATE:
				return isInitialState();
			case PsmPackage.JSTATE__FINAL_STATE:
				return isFinalState();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PsmPackage.JSTATE__OWNER_STATE_MACHINE:
				setOwnerStateMachine((JStateMachine)newValue);
				return;
			case PsmPackage.JSTATE__INCOMING_TRANSITIONS:
				getIncomingTransitions().clear();
				getIncomingTransitions().addAll((Collection<? extends JTransition>)newValue);
				return;
			case PsmPackage.JSTATE__OUTGOING_TRANSITIONS:
				getOutgoingTransitions().clear();
				getOutgoingTransitions().addAll((Collection<? extends JTransition>)newValue);
				return;
			case PsmPackage.JSTATE__INITIAL_STATE:
				setInitialState((Boolean)newValue);
				return;
			case PsmPackage.JSTATE__FINAL_STATE:
				setFinalState((Boolean)newValue);
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
			case PsmPackage.JSTATE__OWNER_STATE_MACHINE:
				setOwnerStateMachine((JStateMachine)null);
				return;
			case PsmPackage.JSTATE__INCOMING_TRANSITIONS:
				getIncomingTransitions().clear();
				return;
			case PsmPackage.JSTATE__OUTGOING_TRANSITIONS:
				getOutgoingTransitions().clear();
				return;
			case PsmPackage.JSTATE__INITIAL_STATE:
				setInitialState(INITIAL_STATE_EDEFAULT);
				return;
			case PsmPackage.JSTATE__FINAL_STATE:
				setFinalState(FINAL_STATE_EDEFAULT);
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
			case PsmPackage.JSTATE__OWNER_STATE_MACHINE:
				return getOwnerStateMachine() != null;
			case PsmPackage.JSTATE__INCOMING_TRANSITIONS:
				return incomingTransitions != null && !incomingTransitions.isEmpty();
			case PsmPackage.JSTATE__OUTGOING_TRANSITIONS:
				return outgoingTransitions != null && !outgoingTransitions.isEmpty();
			case PsmPackage.JSTATE__INITIAL_STATE:
				return initialState != INITIAL_STATE_EDEFAULT;
			case PsmPackage.JSTATE__FINAL_STATE:
				return finalState != FINAL_STATE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (initialState: ");
		result.append(initialState);
		result.append(", finalState: ");
		result.append(finalState);
		result.append(')');
		return result.toString();
	}

} //JStateImpl
