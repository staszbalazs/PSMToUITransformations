/**
 */
package psm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import psm.JPackage;
import psm.JPrimitive;
import psm.PsmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JPrimitive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link psm.impl.JPrimitiveImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link psm.impl.JPrimitiveImpl#isUseForIdType <em>Use For Id Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JPrimitiveImpl extends JTypeImpl implements JPrimitive {
	/**
	 * The default value of the '{@link #isUseForIdType() <em>Use For Id Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseForIdType()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_FOR_ID_TYPE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseForIdType() <em>Use For Id Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseForIdType()
	 * @generated
	 * @ordered
	 */
	protected boolean useForIdType = USE_FOR_ID_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JPrimitiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PsmPackage.Literals.JPRIMITIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JPackage getPackage() {
		if (eContainerFeatureID() != PsmPackage.JPRIMITIVE__PACKAGE) return null;
		return (JPackage)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackage(JPackage newPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPackage, PsmPackage.JPRIMITIVE__PACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(JPackage newPackage) {
		if (newPackage != eInternalContainer() || (eContainerFeatureID() != PsmPackage.JPRIMITIVE__PACKAGE && newPackage != null)) {
			if (EcoreUtil.isAncestor(this, newPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPackage != null)
				msgs = ((InternalEObject)newPackage).eInverseAdd(this, PsmPackage.JPACKAGE__PRIMITIVES, JPackage.class, msgs);
			msgs = basicSetPackage(newPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JPRIMITIVE__PACKAGE, newPackage, newPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseForIdType() {
		return useForIdType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseForIdType(boolean newUseForIdType) {
		boolean oldUseForIdType = useForIdType;
		useForIdType = newUseForIdType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JPRIMITIVE__USE_FOR_ID_TYPE, oldUseForIdType, useForIdType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PsmPackage.JPRIMITIVE__PACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPackage((JPackage)otherEnd, msgs);
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
			case PsmPackage.JPRIMITIVE__PACKAGE:
				return basicSetPackage(null, msgs);
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
			case PsmPackage.JPRIMITIVE__PACKAGE:
				return eInternalContainer().eInverseRemove(this, PsmPackage.JPACKAGE__PRIMITIVES, JPackage.class, msgs);
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
			case PsmPackage.JPRIMITIVE__PACKAGE:
				return getPackage();
			case PsmPackage.JPRIMITIVE__USE_FOR_ID_TYPE:
				return isUseForIdType();
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
			case PsmPackage.JPRIMITIVE__PACKAGE:
				setPackage((JPackage)newValue);
				return;
			case PsmPackage.JPRIMITIVE__USE_FOR_ID_TYPE:
				setUseForIdType((Boolean)newValue);
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
			case PsmPackage.JPRIMITIVE__PACKAGE:
				setPackage((JPackage)null);
				return;
			case PsmPackage.JPRIMITIVE__USE_FOR_ID_TYPE:
				setUseForIdType(USE_FOR_ID_TYPE_EDEFAULT);
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
			case PsmPackage.JPRIMITIVE__PACKAGE:
				return getPackage() != null;
			case PsmPackage.JPRIMITIVE__USE_FOR_ID_TYPE:
				return useForIdType != USE_FOR_ID_TYPE_EDEFAULT;
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
		result.append(" (useForIdType: ");
		result.append(useForIdType);
		result.append(')');
		return result.toString();
	}

} //JPrimitiveImpl
