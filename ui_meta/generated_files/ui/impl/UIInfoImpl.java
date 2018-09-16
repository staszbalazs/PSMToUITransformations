/**
 */
package ui.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import ui.UIInfo;
import ui.UiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ui.impl.UIInfoImpl#getUserClass <em>User Class</em>}</li>
 *   <li>{@link ui.impl.UIInfoImpl#getVersions <em>Versions</em>}</li>
 *   <li>{@link ui.impl.UIInfoImpl#getSubmodels <em>Submodels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UIInfoImpl extends IdentifiableImpl implements UIInfo {
	/**
	 * The default value of the '{@link #getUserClass() <em>User Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserClass()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserClass() <em>User Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserClass()
	 * @generated
	 * @ordered
	 */
	protected String userClass = USER_CLASS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVersions() <em>Versions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> versions;

	/**
	 * The cached value of the '{@link #getSubmodels() <em>Submodels</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmodels()
	 * @generated
	 * @ordered
	 */
	protected EList<String> submodels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UIInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiPackage.Literals.UI_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserClass() {
		return userClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserClass(String newUserClass) {
		String oldUserClass = userClass;
		userClass = newUserClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI_INFO__USER_CLASS, oldUserClass, userClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getVersions() {
		if (versions == null) {
			versions = new EDataTypeEList<String>(String.class, this, UiPackage.UI_INFO__VERSIONS);
		}
		return versions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSubmodels() {
		if (submodels == null) {
			submodels = new EDataTypeEList<String>(String.class, this, UiPackage.UI_INFO__SUBMODELS);
		}
		return submodels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UiPackage.UI_INFO__USER_CLASS:
				return getUserClass();
			case UiPackage.UI_INFO__VERSIONS:
				return getVersions();
			case UiPackage.UI_INFO__SUBMODELS:
				return getSubmodels();
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
			case UiPackage.UI_INFO__USER_CLASS:
				setUserClass((String)newValue);
				return;
			case UiPackage.UI_INFO__VERSIONS:
				getVersions().clear();
				getVersions().addAll((Collection<? extends String>)newValue);
				return;
			case UiPackage.UI_INFO__SUBMODELS:
				getSubmodels().clear();
				getSubmodels().addAll((Collection<? extends String>)newValue);
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
			case UiPackage.UI_INFO__USER_CLASS:
				setUserClass(USER_CLASS_EDEFAULT);
				return;
			case UiPackage.UI_INFO__VERSIONS:
				getVersions().clear();
				return;
			case UiPackage.UI_INFO__SUBMODELS:
				getSubmodels().clear();
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
			case UiPackage.UI_INFO__USER_CLASS:
				return USER_CLASS_EDEFAULT == null ? userClass != null : !USER_CLASS_EDEFAULT.equals(userClass);
			case UiPackage.UI_INFO__VERSIONS:
				return versions != null && !versions.isEmpty();
			case UiPackage.UI_INFO__SUBMODELS:
				return submodels != null && !submodels.isEmpty();
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
		result.append(" (userClass: ");
		result.append(userClass);
		result.append(", versions: ");
		result.append(versions);
		result.append(", submodels: ");
		result.append(submodels);
		result.append(')');
		return result.toString();
	}

} //UIInfoImpl
