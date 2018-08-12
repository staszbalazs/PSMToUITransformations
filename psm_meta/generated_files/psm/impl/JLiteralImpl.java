/**
 */
package psm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import psm.JEnumeration;
import psm.JLiteral;
import psm.PsmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JLiteral</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link psm.impl.JLiteralImpl#getEnumeration <em>Enumeration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JLiteralImpl extends JElementImpl implements JLiteral {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PsmPackage.Literals.JLITERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JEnumeration getEnumeration() {
		if (eContainerFeatureID() != PsmPackage.JLITERAL__ENUMERATION) return null;
		return (JEnumeration)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnumeration(JEnumeration newEnumeration, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEnumeration, PsmPackage.JLITERAL__ENUMERATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumeration(JEnumeration newEnumeration) {
		if (newEnumeration != eInternalContainer() || (eContainerFeatureID() != PsmPackage.JLITERAL__ENUMERATION && newEnumeration != null)) {
			if (EcoreUtil.isAncestor(this, newEnumeration))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEnumeration != null)
				msgs = ((InternalEObject)newEnumeration).eInverseAdd(this, PsmPackage.JENUMERATION__LITERALS, JEnumeration.class, msgs);
			msgs = basicSetEnumeration(newEnumeration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JLITERAL__ENUMERATION, newEnumeration, newEnumeration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PsmPackage.JLITERAL__ENUMERATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEnumeration((JEnumeration)otherEnd, msgs);
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
			case PsmPackage.JLITERAL__ENUMERATION:
				return basicSetEnumeration(null, msgs);
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
			case PsmPackage.JLITERAL__ENUMERATION:
				return eInternalContainer().eInverseRemove(this, PsmPackage.JENUMERATION__LITERALS, JEnumeration.class, msgs);
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
			case PsmPackage.JLITERAL__ENUMERATION:
				return getEnumeration();
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
			case PsmPackage.JLITERAL__ENUMERATION:
				setEnumeration((JEnumeration)newValue);
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
			case PsmPackage.JLITERAL__ENUMERATION:
				setEnumeration((JEnumeration)null);
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
			case PsmPackage.JLITERAL__ENUMERATION:
				return getEnumeration() != null;
		}
		return super.eIsSet(featureID);
	}

} //JLiteralImpl
