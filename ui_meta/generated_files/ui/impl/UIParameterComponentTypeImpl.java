/**
 */
package ui.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ui.UIClass;
import ui.UIParameterComponentType;
import ui.UiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI Parameter Component Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ui.impl.UIParameterComponentTypeImpl#getReferenced <em>Referenced</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UIParameterComponentTypeImpl extends UIComponentTypeImpl implements UIParameterComponentType {
	/**
	 * The cached value of the '{@link #getReferenced() <em>Referenced</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenced()
	 * @generated
	 * @ordered
	 */
	protected UIClass referenced;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UIParameterComponentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiPackage.Literals.UI_PARAMETER_COMPONENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIClass getReferenced() {
		if (referenced != null && referenced.eIsProxy()) {
			InternalEObject oldReferenced = (InternalEObject)referenced;
			referenced = (UIClass)eResolveProxy(oldReferenced);
			if (referenced != oldReferenced) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiPackage.UI_PARAMETER_COMPONENT_TYPE__REFERENCED, oldReferenced, referenced));
			}
		}
		return referenced;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIClass basicGetReferenced() {
		return referenced;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenced(UIClass newReferenced) {
		UIClass oldReferenced = referenced;
		referenced = newReferenced;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI_PARAMETER_COMPONENT_TYPE__REFERENCED, oldReferenced, referenced));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UiPackage.UI_PARAMETER_COMPONENT_TYPE__REFERENCED:
				if (resolve) return getReferenced();
				return basicGetReferenced();
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
			case UiPackage.UI_PARAMETER_COMPONENT_TYPE__REFERENCED:
				setReferenced((UIClass)newValue);
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
			case UiPackage.UI_PARAMETER_COMPONENT_TYPE__REFERENCED:
				setReferenced((UIClass)null);
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
			case UiPackage.UI_PARAMETER_COMPONENT_TYPE__REFERENCED:
				return referenced != null;
		}
		return super.eIsSet(featureID);
	}

} //UIParameterComponentTypeImpl
