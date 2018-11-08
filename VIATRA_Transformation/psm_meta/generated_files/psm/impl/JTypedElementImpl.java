/**
 */
package psm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import psm.JType;
import psm.JTypedElement;
import psm.PsmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JTyped Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link psm.impl.JTypedElementImpl#getType <em>Type</em>}</li>
 *   <li>{@link psm.impl.JTypedElementImpl#getValue <em>Value</em>}</li>
 *   <li>{@link psm.impl.JTypedElementImpl#isDerived <em>Derived</em>}</li>
 *   <li>{@link psm.impl.JTypedElementImpl#isCalculated <em>Calculated</em>}</li>
 *   <li>{@link psm.impl.JTypedElementImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link psm.impl.JTypedElementImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link psm.impl.JTypedElementImpl#isOrdered <em>Ordered</em>}</li>
 *   <li>{@link psm.impl.JTypedElementImpl#isUnique <em>Unique</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class JTypedElementImpl extends JElementImpl implements JTypedElement {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected JType type;

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
	 * The default value of the '{@link #isDerived() <em>Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDerived()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DERIVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDerived() <em>Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDerived()
	 * @generated
	 * @ordered
	 */
	protected boolean derived = DERIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #isCalculated() <em>Calculated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCalculated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CALCULATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCalculated() <em>Calculated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCalculated()
	 * @generated
	 * @ordered
	 */
	protected boolean calculated = CALCULATED_EDEFAULT;

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
	protected static final int UPPER_EDEFAULT = 1;

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
	 * The default value of the '{@link #isOrdered() <em>Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ORDERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOrdered() <em>Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrdered()
	 * @generated
	 * @ordered
	 */
	protected boolean ordered = ORDERED_EDEFAULT;

	/**
	 * The default value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean unique = UNIQUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JTypedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PsmPackage.Literals.JTYPED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (JType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PsmPackage.JTYPED_ELEMENT__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(JType newType) {
		JType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JTYPED_ELEMENT__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JTYPED_ELEMENT__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDerived() {
		return derived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerived(boolean newDerived) {
		boolean oldDerived = derived;
		derived = newDerived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JTYPED_ELEMENT__DERIVED, oldDerived, derived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCalculated() {
		return calculated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalculated(boolean newCalculated) {
		boolean oldCalculated = calculated;
		calculated = newCalculated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JTYPED_ELEMENT__CALCULATED, oldCalculated, calculated));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JTYPED_ELEMENT__LOWER, oldLower, lower));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JTYPED_ELEMENT__UPPER, oldUpper, upper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOrdered() {
		return ordered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrdered(boolean newOrdered) {
		boolean oldOrdered = ordered;
		ordered = newOrdered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JTYPED_ELEMENT__ORDERED, oldOrdered, ordered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnique() {
		return unique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnique(boolean newUnique) {
		boolean oldUnique = unique;
		unique = newUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JTYPED_ELEMENT__UNIQUE, oldUnique, unique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PsmPackage.JTYPED_ELEMENT__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case PsmPackage.JTYPED_ELEMENT__VALUE:
				return getValue();
			case PsmPackage.JTYPED_ELEMENT__DERIVED:
				return isDerived();
			case PsmPackage.JTYPED_ELEMENT__CALCULATED:
				return isCalculated();
			case PsmPackage.JTYPED_ELEMENT__LOWER:
				return getLower();
			case PsmPackage.JTYPED_ELEMENT__UPPER:
				return getUpper();
			case PsmPackage.JTYPED_ELEMENT__ORDERED:
				return isOrdered();
			case PsmPackage.JTYPED_ELEMENT__UNIQUE:
				return isUnique();
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
			case PsmPackage.JTYPED_ELEMENT__TYPE:
				setType((JType)newValue);
				return;
			case PsmPackage.JTYPED_ELEMENT__VALUE:
				setValue((String)newValue);
				return;
			case PsmPackage.JTYPED_ELEMENT__DERIVED:
				setDerived((Boolean)newValue);
				return;
			case PsmPackage.JTYPED_ELEMENT__CALCULATED:
				setCalculated((Boolean)newValue);
				return;
			case PsmPackage.JTYPED_ELEMENT__LOWER:
				setLower((Integer)newValue);
				return;
			case PsmPackage.JTYPED_ELEMENT__UPPER:
				setUpper((Integer)newValue);
				return;
			case PsmPackage.JTYPED_ELEMENT__ORDERED:
				setOrdered((Boolean)newValue);
				return;
			case PsmPackage.JTYPED_ELEMENT__UNIQUE:
				setUnique((Boolean)newValue);
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
			case PsmPackage.JTYPED_ELEMENT__TYPE:
				setType((JType)null);
				return;
			case PsmPackage.JTYPED_ELEMENT__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case PsmPackage.JTYPED_ELEMENT__DERIVED:
				setDerived(DERIVED_EDEFAULT);
				return;
			case PsmPackage.JTYPED_ELEMENT__CALCULATED:
				setCalculated(CALCULATED_EDEFAULT);
				return;
			case PsmPackage.JTYPED_ELEMENT__LOWER:
				setLower(LOWER_EDEFAULT);
				return;
			case PsmPackage.JTYPED_ELEMENT__UPPER:
				setUpper(UPPER_EDEFAULT);
				return;
			case PsmPackage.JTYPED_ELEMENT__ORDERED:
				setOrdered(ORDERED_EDEFAULT);
				return;
			case PsmPackage.JTYPED_ELEMENT__UNIQUE:
				setUnique(UNIQUE_EDEFAULT);
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
			case PsmPackage.JTYPED_ELEMENT__TYPE:
				return type != null;
			case PsmPackage.JTYPED_ELEMENT__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case PsmPackage.JTYPED_ELEMENT__DERIVED:
				return derived != DERIVED_EDEFAULT;
			case PsmPackage.JTYPED_ELEMENT__CALCULATED:
				return calculated != CALCULATED_EDEFAULT;
			case PsmPackage.JTYPED_ELEMENT__LOWER:
				return lower != LOWER_EDEFAULT;
			case PsmPackage.JTYPED_ELEMENT__UPPER:
				return upper != UPPER_EDEFAULT;
			case PsmPackage.JTYPED_ELEMENT__ORDERED:
				return ordered != ORDERED_EDEFAULT;
			case PsmPackage.JTYPED_ELEMENT__UNIQUE:
				return unique != UNIQUE_EDEFAULT;
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
		result.append(" (value: ");
		result.append(value);
		result.append(", derived: ");
		result.append(derived);
		result.append(", calculated: ");
		result.append(calculated);
		result.append(", lower: ");
		result.append(lower);
		result.append(", upper: ");
		result.append(upper);
		result.append(", ordered: ");
		result.append(ordered);
		result.append(", unique: ");
		result.append(unique);
		result.append(')');
		return result.toString();
	}

} //JTypedElementImpl
