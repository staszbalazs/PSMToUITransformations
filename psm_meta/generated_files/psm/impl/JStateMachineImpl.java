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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import psm.JClass;
import psm.JEnumeration;
import psm.JState;
import psm.JStateMachine;
import psm.JTransition;
import psm.PsmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JState Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link psm.impl.JStateMachineImpl#getOwnerClass <em>Owner Class</em>}</li>
 *   <li>{@link psm.impl.JStateMachineImpl#getStates <em>States</em>}</li>
 *   <li>{@link psm.impl.JStateMachineImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link psm.impl.JStateMachineImpl#getCorrespondingEnum <em>Corresponding Enum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JStateMachineImpl extends JElementImpl implements JStateMachine {
	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<JState> states;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<JTransition> transitions;

	/**
	 * The cached value of the '{@link #getCorrespondingEnum() <em>Corresponding Enum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrespondingEnum()
	 * @generated
	 * @ordered
	 */
	protected JEnumeration correspondingEnum;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JStateMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PsmPackage.Literals.JSTATE_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JClass getOwnerClass() {
		if (eContainerFeatureID() != PsmPackage.JSTATE_MACHINE__OWNER_CLASS) return null;
		return (JClass)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnerClass(JClass newOwnerClass, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnerClass, PsmPackage.JSTATE_MACHINE__OWNER_CLASS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerClass(JClass newOwnerClass) {
		if (newOwnerClass != eInternalContainer() || (eContainerFeatureID() != PsmPackage.JSTATE_MACHINE__OWNER_CLASS && newOwnerClass != null)) {
			if (EcoreUtil.isAncestor(this, newOwnerClass))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnerClass != null)
				msgs = ((InternalEObject)newOwnerClass).eInverseAdd(this, PsmPackage.JCLASS__STATE_MACHINES, JClass.class, msgs);
			msgs = basicSetOwnerClass(newOwnerClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JSTATE_MACHINE__OWNER_CLASS, newOwnerClass, newOwnerClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JState> getStates() {
		if (states == null) {
			states = new EObjectContainmentWithInverseEList<JState>(JState.class, this, PsmPackage.JSTATE_MACHINE__STATES, PsmPackage.JSTATE__OWNER_STATE_MACHINE);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JTransition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentWithInverseEList<JTransition>(JTransition.class, this, PsmPackage.JSTATE_MACHINE__TRANSITIONS, PsmPackage.JTRANSITION__STATE_MACHINE);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JEnumeration getCorrespondingEnum() {
		if (correspondingEnum != null && correspondingEnum.eIsProxy()) {
			InternalEObject oldCorrespondingEnum = (InternalEObject)correspondingEnum;
			correspondingEnum = (JEnumeration)eResolveProxy(oldCorrespondingEnum);
			if (correspondingEnum != oldCorrespondingEnum) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PsmPackage.JSTATE_MACHINE__CORRESPONDING_ENUM, oldCorrespondingEnum, correspondingEnum));
			}
		}
		return correspondingEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JEnumeration basicGetCorrespondingEnum() {
		return correspondingEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrespondingEnum(JEnumeration newCorrespondingEnum) {
		JEnumeration oldCorrespondingEnum = correspondingEnum;
		correspondingEnum = newCorrespondingEnum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JSTATE_MACHINE__CORRESPONDING_ENUM, oldCorrespondingEnum, correspondingEnum));
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
			case PsmPackage.JSTATE_MACHINE__OWNER_CLASS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnerClass((JClass)otherEnd, msgs);
			case PsmPackage.JSTATE_MACHINE__STATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStates()).basicAdd(otherEnd, msgs);
			case PsmPackage.JSTATE_MACHINE__TRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransitions()).basicAdd(otherEnd, msgs);
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
			case PsmPackage.JSTATE_MACHINE__OWNER_CLASS:
				return basicSetOwnerClass(null, msgs);
			case PsmPackage.JSTATE_MACHINE__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
			case PsmPackage.JSTATE_MACHINE__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
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
			case PsmPackage.JSTATE_MACHINE__OWNER_CLASS:
				return eInternalContainer().eInverseRemove(this, PsmPackage.JCLASS__STATE_MACHINES, JClass.class, msgs);
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
			case PsmPackage.JSTATE_MACHINE__OWNER_CLASS:
				return getOwnerClass();
			case PsmPackage.JSTATE_MACHINE__STATES:
				return getStates();
			case PsmPackage.JSTATE_MACHINE__TRANSITIONS:
				return getTransitions();
			case PsmPackage.JSTATE_MACHINE__CORRESPONDING_ENUM:
				if (resolve) return getCorrespondingEnum();
				return basicGetCorrespondingEnum();
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
			case PsmPackage.JSTATE_MACHINE__OWNER_CLASS:
				setOwnerClass((JClass)newValue);
				return;
			case PsmPackage.JSTATE_MACHINE__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends JState>)newValue);
				return;
			case PsmPackage.JSTATE_MACHINE__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends JTransition>)newValue);
				return;
			case PsmPackage.JSTATE_MACHINE__CORRESPONDING_ENUM:
				setCorrespondingEnum((JEnumeration)newValue);
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
			case PsmPackage.JSTATE_MACHINE__OWNER_CLASS:
				setOwnerClass((JClass)null);
				return;
			case PsmPackage.JSTATE_MACHINE__STATES:
				getStates().clear();
				return;
			case PsmPackage.JSTATE_MACHINE__TRANSITIONS:
				getTransitions().clear();
				return;
			case PsmPackage.JSTATE_MACHINE__CORRESPONDING_ENUM:
				setCorrespondingEnum((JEnumeration)null);
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
			case PsmPackage.JSTATE_MACHINE__OWNER_CLASS:
				return getOwnerClass() != null;
			case PsmPackage.JSTATE_MACHINE__STATES:
				return states != null && !states.isEmpty();
			case PsmPackage.JSTATE_MACHINE__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case PsmPackage.JSTATE_MACHINE__CORRESPONDING_ENUM:
				return correspondingEnum != null;
		}
		return super.eIsSet(featureID);
	}

} //JStateMachineImpl
