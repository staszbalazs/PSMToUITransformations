/**
 */
package psmToUiTypeMapping.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import psm.JPrimitive;

import psmToUiTypeMapping.Mapping;
import psmToUiTypeMapping.PsmToUiTypeMappingPackage;

import ui.UIComponentType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link psmToUiTypeMapping.impl.MappingImpl#getPsmType <em>Psm Type</em>}</li>
 *   <li>{@link psmToUiTypeMapping.impl.MappingImpl#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link psmToUiTypeMapping.impl.MappingImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappingImpl extends MinimalEObjectImpl.Container implements Mapping {
	/**
	 * The cached value of the '{@link #getPsmType() <em>Psm Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPsmType()
	 * @generated
	 * @ordered
	 */
	protected JPrimitive psmType;

	/**
	 * The cached value of the '{@link #getComponentType() <em>Component Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentType()
	 * @generated
	 * @ordered
	 */
	protected UIComponentType componentType;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PsmToUiTypeMappingPackage.Literals.MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JPrimitive getPsmType() {
		if (psmType != null && psmType.eIsProxy()) {
			InternalEObject oldPsmType = (InternalEObject)psmType;
			psmType = (JPrimitive)eResolveProxy(oldPsmType);
			if (psmType != oldPsmType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PsmToUiTypeMappingPackage.MAPPING__PSM_TYPE, oldPsmType, psmType));
			}
		}
		return psmType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JPrimitive basicGetPsmType() {
		return psmType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPsmType(JPrimitive newPsmType) {
		JPrimitive oldPsmType = psmType;
		psmType = newPsmType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmToUiTypeMappingPackage.MAPPING__PSM_TYPE, oldPsmType, psmType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIComponentType getComponentType() {
		if (componentType != null && componentType.eIsProxy()) {
			InternalEObject oldComponentType = (InternalEObject)componentType;
			componentType = (UIComponentType)eResolveProxy(oldComponentType);
			if (componentType != oldComponentType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PsmToUiTypeMappingPackage.MAPPING__COMPONENT_TYPE, oldComponentType, componentType));
			}
		}
		return componentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIComponentType basicGetComponentType() {
		return componentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentType(UIComponentType newComponentType) {
		UIComponentType oldComponentType = componentType;
		componentType = newComponentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmToUiTypeMappingPackage.MAPPING__COMPONENT_TYPE, oldComponentType, componentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmToUiTypeMappingPackage.MAPPING__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PsmToUiTypeMappingPackage.MAPPING__PSM_TYPE:
				if (resolve) return getPsmType();
				return basicGetPsmType();
			case PsmToUiTypeMappingPackage.MAPPING__COMPONENT_TYPE:
				if (resolve) return getComponentType();
				return basicGetComponentType();
			case PsmToUiTypeMappingPackage.MAPPING__NAME:
				return getName();
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
			case PsmToUiTypeMappingPackage.MAPPING__PSM_TYPE:
				setPsmType((JPrimitive)newValue);
				return;
			case PsmToUiTypeMappingPackage.MAPPING__COMPONENT_TYPE:
				setComponentType((UIComponentType)newValue);
				return;
			case PsmToUiTypeMappingPackage.MAPPING__NAME:
				setName((String)newValue);
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
			case PsmToUiTypeMappingPackage.MAPPING__PSM_TYPE:
				setPsmType((JPrimitive)null);
				return;
			case PsmToUiTypeMappingPackage.MAPPING__COMPONENT_TYPE:
				setComponentType((UIComponentType)null);
				return;
			case PsmToUiTypeMappingPackage.MAPPING__NAME:
				setName(NAME_EDEFAULT);
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
			case PsmToUiTypeMappingPackage.MAPPING__PSM_TYPE:
				return psmType != null;
			case PsmToUiTypeMappingPackage.MAPPING__COMPONENT_TYPE:
				return componentType != null;
			case PsmToUiTypeMappingPackage.MAPPING__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MappingImpl
