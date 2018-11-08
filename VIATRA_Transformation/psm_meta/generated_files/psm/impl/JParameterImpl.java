/**
 */
package psm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import psm.JOperation;
import psm.JParameter;
import psm.PsmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JParameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link psm.impl.JParameterImpl#getOwnerOperation <em>Owner Operation</em>}</li>
 *   <li>{@link psm.impl.JParameterImpl#isInput <em>Input</em>}</li>
 *   <li>{@link psm.impl.JParameterImpl#getInterval <em>Interval</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JParameterImpl extends JTypedElementImpl implements JParameter {
	/**
	 * The default value of the '{@link #isInput() <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInput()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INPUT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isInput() <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInput()
	 * @generated
	 * @ordered
	 */
	protected boolean input = INPUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterval() <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterval()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterval() <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterval()
	 * @generated
	 * @ordered
	 */
	protected String interval = INTERVAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PsmPackage.Literals.JPARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JOperation getOwnerOperation() {
		if (eContainerFeatureID() != PsmPackage.JPARAMETER__OWNER_OPERATION) return null;
		return (JOperation)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnerOperation(JOperation newOwnerOperation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnerOperation, PsmPackage.JPARAMETER__OWNER_OPERATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerOperation(JOperation newOwnerOperation) {
		if (newOwnerOperation != eInternalContainer() || (eContainerFeatureID() != PsmPackage.JPARAMETER__OWNER_OPERATION && newOwnerOperation != null)) {
			if (EcoreUtil.isAncestor(this, newOwnerOperation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnerOperation != null)
				msgs = ((InternalEObject)newOwnerOperation).eInverseAdd(this, PsmPackage.JOPERATION__PARAMETERS, JOperation.class, msgs);
			msgs = basicSetOwnerOperation(newOwnerOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JPARAMETER__OWNER_OPERATION, newOwnerOperation, newOwnerOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInput() {
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput(boolean newInput) {
		boolean oldInput = input;
		input = newInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JPARAMETER__INPUT, oldInput, input));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInterval() {
		return interval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterval(String newInterval) {
		String oldInterval = interval;
		interval = newInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JPARAMETER__INTERVAL, oldInterval, interval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PsmPackage.JPARAMETER__OWNER_OPERATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnerOperation((JOperation)otherEnd, msgs);
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
			case PsmPackage.JPARAMETER__OWNER_OPERATION:
				return basicSetOwnerOperation(null, msgs);
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
			case PsmPackage.JPARAMETER__OWNER_OPERATION:
				return eInternalContainer().eInverseRemove(this, PsmPackage.JOPERATION__PARAMETERS, JOperation.class, msgs);
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
			case PsmPackage.JPARAMETER__OWNER_OPERATION:
				return getOwnerOperation();
			case PsmPackage.JPARAMETER__INPUT:
				return isInput();
			case PsmPackage.JPARAMETER__INTERVAL:
				return getInterval();
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
			case PsmPackage.JPARAMETER__OWNER_OPERATION:
				setOwnerOperation((JOperation)newValue);
				return;
			case PsmPackage.JPARAMETER__INPUT:
				setInput((Boolean)newValue);
				return;
			case PsmPackage.JPARAMETER__INTERVAL:
				setInterval((String)newValue);
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
			case PsmPackage.JPARAMETER__OWNER_OPERATION:
				setOwnerOperation((JOperation)null);
				return;
			case PsmPackage.JPARAMETER__INPUT:
				setInput(INPUT_EDEFAULT);
				return;
			case PsmPackage.JPARAMETER__INTERVAL:
				setInterval(INTERVAL_EDEFAULT);
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
			case PsmPackage.JPARAMETER__OWNER_OPERATION:
				return getOwnerOperation() != null;
			case PsmPackage.JPARAMETER__INPUT:
				return input != INPUT_EDEFAULT;
			case PsmPackage.JPARAMETER__INTERVAL:
				return INTERVAL_EDEFAULT == null ? interval != null : !INTERVAL_EDEFAULT.equals(interval);
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (input: ");
		result.append(input);
		result.append(", interval: ");
		result.append(interval);
		result.append(')');
		return result.toString();
	}

} //JParameterImpl
