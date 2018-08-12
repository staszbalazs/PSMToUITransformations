/**
 */
package ui.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ui.UIBaseComponentType;
import ui.UiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI Base Component Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ui.impl.UIBaseComponentTypeImpl#getRegexp <em>Regexp</em>}</li>
 *   <li>{@link ui.impl.UIBaseComponentTypeImpl#getDecimals <em>Decimals</em>}</li>
 *   <li>{@link ui.impl.UIBaseComponentTypeImpl#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link ui.impl.UIBaseComponentTypeImpl#isRepresentation <em>Representation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UIBaseComponentTypeImpl extends UIAttributeComponentTypeImpl implements UIBaseComponentType {
	/**
	 * The default value of the '{@link #getRegexp() <em>Regexp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegexp()
	 * @generated
	 * @ordered
	 */
	protected static final String REGEXP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegexp() <em>Regexp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegexp()
	 * @generated
	 * @ordered
	 */
	protected String regexp = REGEXP_EDEFAULT;

	/**
	 * The default value of the '{@link #getDecimals() <em>Decimals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimals()
	 * @generated
	 * @ordered
	 */
	protected static final int DECIMALS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDecimals() <em>Decimals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimals()
	 * @generated
	 * @ordered
	 */
	protected int decimals = DECIMALS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlaceholder() <em>Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceholder()
	 * @generated
	 * @ordered
	 */
	protected static final String PLACEHOLDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlaceholder() <em>Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceholder()
	 * @generated
	 * @ordered
	 */
	protected String placeholder = PLACEHOLDER_EDEFAULT;

	/**
	 * The default value of the '{@link #isRepresentation() <em>Representation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRepresentation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REPRESENTATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRepresentation() <em>Representation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRepresentation()
	 * @generated
	 * @ordered
	 */
	protected boolean representation = REPRESENTATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UIBaseComponentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiPackage.Literals.UI_BASE_COMPONENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegexp() {
		return regexp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegexp(String newRegexp) {
		String oldRegexp = regexp;
		regexp = newRegexp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI_BASE_COMPONENT_TYPE__REGEXP, oldRegexp, regexp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDecimals() {
		return decimals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecimals(int newDecimals) {
		int oldDecimals = decimals;
		decimals = newDecimals;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI_BASE_COMPONENT_TYPE__DECIMALS, oldDecimals, decimals));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlaceholder() {
		return placeholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlaceholder(String newPlaceholder) {
		String oldPlaceholder = placeholder;
		placeholder = newPlaceholder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI_BASE_COMPONENT_TYPE__PLACEHOLDER, oldPlaceholder, placeholder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRepresentation() {
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentation(boolean newRepresentation) {
		boolean oldRepresentation = representation;
		representation = newRepresentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI_BASE_COMPONENT_TYPE__REPRESENTATION, oldRepresentation, representation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UiPackage.UI_BASE_COMPONENT_TYPE__REGEXP:
				return getRegexp();
			case UiPackage.UI_BASE_COMPONENT_TYPE__DECIMALS:
				return getDecimals();
			case UiPackage.UI_BASE_COMPONENT_TYPE__PLACEHOLDER:
				return getPlaceholder();
			case UiPackage.UI_BASE_COMPONENT_TYPE__REPRESENTATION:
				return isRepresentation();
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
			case UiPackage.UI_BASE_COMPONENT_TYPE__REGEXP:
				setRegexp((String)newValue);
				return;
			case UiPackage.UI_BASE_COMPONENT_TYPE__DECIMALS:
				setDecimals((Integer)newValue);
				return;
			case UiPackage.UI_BASE_COMPONENT_TYPE__PLACEHOLDER:
				setPlaceholder((String)newValue);
				return;
			case UiPackage.UI_BASE_COMPONENT_TYPE__REPRESENTATION:
				setRepresentation((Boolean)newValue);
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
			case UiPackage.UI_BASE_COMPONENT_TYPE__REGEXP:
				setRegexp(REGEXP_EDEFAULT);
				return;
			case UiPackage.UI_BASE_COMPONENT_TYPE__DECIMALS:
				setDecimals(DECIMALS_EDEFAULT);
				return;
			case UiPackage.UI_BASE_COMPONENT_TYPE__PLACEHOLDER:
				setPlaceholder(PLACEHOLDER_EDEFAULT);
				return;
			case UiPackage.UI_BASE_COMPONENT_TYPE__REPRESENTATION:
				setRepresentation(REPRESENTATION_EDEFAULT);
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
			case UiPackage.UI_BASE_COMPONENT_TYPE__REGEXP:
				return REGEXP_EDEFAULT == null ? regexp != null : !REGEXP_EDEFAULT.equals(regexp);
			case UiPackage.UI_BASE_COMPONENT_TYPE__DECIMALS:
				return decimals != DECIMALS_EDEFAULT;
			case UiPackage.UI_BASE_COMPONENT_TYPE__PLACEHOLDER:
				return PLACEHOLDER_EDEFAULT == null ? placeholder != null : !PLACEHOLDER_EDEFAULT.equals(placeholder);
			case UiPackage.UI_BASE_COMPONENT_TYPE__REPRESENTATION:
				return representation != REPRESENTATION_EDEFAULT;
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
		result.append(" (regexp: ");
		result.append(regexp);
		result.append(", decimals: ");
		result.append(decimals);
		result.append(", placeholder: ");
		result.append(placeholder);
		result.append(", representation: ");
		result.append(representation);
		result.append(')');
		return result.toString();
	}

} //UIBaseComponentTypeImpl
