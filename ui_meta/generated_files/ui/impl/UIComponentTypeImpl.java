/**
 */
package ui.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ui.UIComponentType;
import ui.UIInterval;
import ui.UiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI Component Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ui.impl.UIComponentTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link ui.impl.UIComponentTypeImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link ui.impl.UIComponentTypeImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link ui.impl.UIComponentTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link ui.impl.UIComponentTypeImpl#getInterval <em>Interval</em>}</li>
 *   <li>{@link ui.impl.UIComponentTypeImpl#getIntervals <em>Intervals</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class UIComponentTypeImpl extends IdentifiableImpl implements UIComponentType {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected int lower = LOWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected static final int UPPER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected int upper = UPPER_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

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
	 * The cached value of the '{@link #getIntervals() <em>Intervals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervals()
	 * @generated
	 * @ordered
	 */
	protected EList<UIInterval> intervals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UIComponentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiPackage.Literals.UI_COMPONENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI_COMPONENT_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLower() {
		return lower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLower(int newLower) {
		int oldLower = lower;
		lower = newLower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI_COMPONENT_TYPE__LOWER, oldLower, lower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUpper() {
		return upper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpper(int newUpper) {
		int oldUpper = upper;
		upper = newUpper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI_COMPONENT_TYPE__UPPER, oldUpper, upper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI_COMPONENT_TYPE__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI_COMPONENT_TYPE__INTERVAL, oldInterval, interval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UIInterval> getIntervals() {
		if (intervals == null) {
			intervals = new EObjectContainmentEList<UIInterval>(UIInterval.class, this, UiPackage.UI_COMPONENT_TYPE__INTERVALS);
		}
		return intervals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiPackage.UI_COMPONENT_TYPE__INTERVALS:
				return ((InternalEList<?>)getIntervals()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UiPackage.UI_COMPONENT_TYPE__VALUE:
				return getValue();
			case UiPackage.UI_COMPONENT_TYPE__LOWER:
				return getLower();
			case UiPackage.UI_COMPONENT_TYPE__UPPER:
				return getUpper();
			case UiPackage.UI_COMPONENT_TYPE__TYPE:
				return getType();
			case UiPackage.UI_COMPONENT_TYPE__INTERVAL:
				return getInterval();
			case UiPackage.UI_COMPONENT_TYPE__INTERVALS:
				return getIntervals();
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
			case UiPackage.UI_COMPONENT_TYPE__VALUE:
				setValue((String)newValue);
				return;
			case UiPackage.UI_COMPONENT_TYPE__LOWER:
				setLower((Integer)newValue);
				return;
			case UiPackage.UI_COMPONENT_TYPE__UPPER:
				setUpper((Integer)newValue);
				return;
			case UiPackage.UI_COMPONENT_TYPE__TYPE:
				setType((String)newValue);
				return;
			case UiPackage.UI_COMPONENT_TYPE__INTERVAL:
				setInterval((String)newValue);
				return;
			case UiPackage.UI_COMPONENT_TYPE__INTERVALS:
				getIntervals().clear();
				getIntervals().addAll((Collection<? extends UIInterval>)newValue);
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
			case UiPackage.UI_COMPONENT_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case UiPackage.UI_COMPONENT_TYPE__LOWER:
				setLower(LOWER_EDEFAULT);
				return;
			case UiPackage.UI_COMPONENT_TYPE__UPPER:
				setUpper(UPPER_EDEFAULT);
				return;
			case UiPackage.UI_COMPONENT_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case UiPackage.UI_COMPONENT_TYPE__INTERVAL:
				setInterval(INTERVAL_EDEFAULT);
				return;
			case UiPackage.UI_COMPONENT_TYPE__INTERVALS:
				getIntervals().clear();
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
			case UiPackage.UI_COMPONENT_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case UiPackage.UI_COMPONENT_TYPE__LOWER:
				return lower != LOWER_EDEFAULT;
			case UiPackage.UI_COMPONENT_TYPE__UPPER:
				return upper != UPPER_EDEFAULT;
			case UiPackage.UI_COMPONENT_TYPE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case UiPackage.UI_COMPONENT_TYPE__INTERVAL:
				return INTERVAL_EDEFAULT == null ? interval != null : !INTERVAL_EDEFAULT.equals(interval);
			case UiPackage.UI_COMPONENT_TYPE__INTERVALS:
				return intervals != null && !intervals.isEmpty();
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
		result.append(" (value: ");
		result.append(value);
		result.append(", lower: ");
		result.append(lower);
		result.append(", upper: ");
		result.append(upper);
		result.append(", type: ");
		result.append(type);
		result.append(", interval: ");
		result.append(interval);
		result.append(')');
		return result.toString();
	}

} //UIComponentTypeImpl
