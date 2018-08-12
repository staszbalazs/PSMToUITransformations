/**
 */
package ui.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import ui.UIAttributeComponentType;
import ui.UIClass;
import ui.UiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI Attribute Component Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ui.impl.UIAttributeComponentTypeImpl#isInherited <em>Inherited</em>}</li>
 *   <li>{@link ui.impl.UIAttributeComponentTypeImpl#isDerived <em>Derived</em>}</li>
 *   <li>{@link ui.impl.UIAttributeComponentTypeImpl#isPrivate <em>Private</em>}</li>
 *   <li>{@link ui.impl.UIAttributeComponentTypeImpl#isReadonly <em>Readonly</em>}</li>
 *   <li>{@link ui.impl.UIAttributeComponentTypeImpl#isDisableOnCreate <em>Disable On Create</em>}</li>
 *   <li>{@link ui.impl.UIAttributeComponentTypeImpl#getOwnerClass <em>Owner Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class UIAttributeComponentTypeImpl extends UIComponentTypeImpl implements UIAttributeComponentType {
	/**
	 * The default value of the '{@link #isInherited() <em>Inherited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInherited()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INHERITED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInherited() <em>Inherited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInherited()
	 * @generated
	 * @ordered
	 */
	protected boolean inherited = INHERITED_EDEFAULT;

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
	 * The default value of the '{@link #isPrivate() <em>Private</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrivate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRIVATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPrivate() <em>Private</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrivate()
	 * @generated
	 * @ordered
	 */
	protected boolean private_ = PRIVATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isReadonly() <em>Readonly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadonly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReadonly() <em>Readonly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadonly()
	 * @generated
	 * @ordered
	 */
	protected boolean readonly = READONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #isDisableOnCreate() <em>Disable On Create</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisableOnCreate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISABLE_ON_CREATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDisableOnCreate() <em>Disable On Create</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisableOnCreate()
	 * @generated
	 * @ordered
	 */
	protected boolean disableOnCreate = DISABLE_ON_CREATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UIAttributeComponentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiPackage.Literals.UI_ATTRIBUTE_COMPONENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInherited() {
		return inherited;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInherited(boolean newInherited) {
		boolean oldInherited = inherited;
		inherited = newInherited;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI_ATTRIBUTE_COMPONENT_TYPE__INHERITED, oldInherited, inherited));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI_ATTRIBUTE_COMPONENT_TYPE__DERIVED, oldDerived, derived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPrivate() {
		return private_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivate(boolean newPrivate) {
		boolean oldPrivate = private_;
		private_ = newPrivate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI_ATTRIBUTE_COMPONENT_TYPE__PRIVATE, oldPrivate, private_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReadonly() {
		return readonly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadonly(boolean newReadonly) {
		boolean oldReadonly = readonly;
		readonly = newReadonly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI_ATTRIBUTE_COMPONENT_TYPE__READONLY, oldReadonly, readonly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDisableOnCreate() {
		return disableOnCreate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisableOnCreate(boolean newDisableOnCreate) {
		boolean oldDisableOnCreate = disableOnCreate;
		disableOnCreate = newDisableOnCreate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI_ATTRIBUTE_COMPONENT_TYPE__DISABLE_ON_CREATE, oldDisableOnCreate, disableOnCreate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIClass getOwnerClass() {
		if (eContainerFeatureID() != UiPackage.UI_ATTRIBUTE_COMPONENT_TYPE__OWNER_CLASS) return null;
		return (UIClass)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnerClass(UIClass newOwnerClass, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnerClass, UiPackage.UI_ATTRIBUTE_COMPONENT_TYPE__OWNER_CLASS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerClass(UIClass newOwnerClass) {
		if (newOwnerClass != eInternalContainer() || (eContainerFeatureID() != UiPackage.UI_ATTRIBUTE_COMPONENT_TYPE__OWNER_CLASS && newOwnerClass != null)) {
			if (EcoreUtil.isAncestor(this, newOwnerClass))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnerClass != null)
				msgs = ((InternalEObject)newOwnerClass).eInverseAdd(this, UiPackage.UI_CLASS__ATTRIBUTES, UIClass.class, msgs);
			msgs = basicSetOwnerClass(newOwnerClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI_ATTRIBUTE_COMPONENT_TYPE__OWNER_CLASS, newOwnerClass, newOwnerClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiPackage.UI_ATTRIBUTE_COMPONENT_TYPE__OWNER_CLASS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnerClass((UIClass)otherEnd, msgs);
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
			case UiPackage.UI_ATTRIBUTE_COMPONENT_TYPE__OWNER_CLASS:
				return basicSetOwnerClass(null, msgs);
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
			case UiPackage.UI_ATTRIBUTE_COMPONENT_TYPE__OWNER_CLASS:
				return eInternalContainer().eInverseRemove(this, UiPackage.UI_CLASS__ATTRIBUTES, UIClass.class, msgs);
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
			case UiPackage.UI_ATTRIBUTE_COMPONENT_TYPE__INHERITED:
				return isInherited();
			case UiPackage.UI_ATTRIBUTE_COMPONENT_TYPE__DERIVED:
				return isDerived();
			case UiPackage.UI_ATTRIBUTE_COMPONENT_TYPE__PRIVATE:
				return isPrivate();
			case UiPackage.UI_ATTRIBUTE_COMPONENT_TYPE__READONLY:
				return isReadonly();
			case UiPackage.UI_ATTRIBUTE_COMPONENT_TYPE__DISABLE_ON_CREATE:
				return isDisableOnCreate();
			case UiPackage.UI_ATTRIBUTE_COMPONENT_TYPE__OWNER_CLASS:
				return getOwnerClass();
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
			case UiPackage.UI_ATTRIBUTE_COMPONENT_TYPE__INHERITED:
				setInherited((Boolean)newValue);
				return;
			case UiPackage.UI_ATTRIBUTE_COMPONENT_TYPE__DERIVED:
				setDerived((Boolean)newValue);
				return;
			case UiPackage.UI_ATTRIBUTE_COMPONENT_TYPE__PRIVATE:
				setPrivate((Boolean)newValue);
				return;
			case UiPackage.UI_ATTRIBUTE_COMPONENT_TYPE__READONLY:
				setReadonly((Boolean)newValue);
				return;
			case UiPackage.UI_ATTRIBUTE_COMPONENT_TYPE__DISABLE_ON_CREATE:
				setDisableOnCreate((Boolean)newValue);
				return;
			case UiPackage.UI_ATTRIBUTE_COMPONENT_TYPE__OWNER_CLASS:
				setOwnerClass((UIClass)newValue);
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
			case UiPackage.UI_ATTRIBUTE_COMPONENT_TYPE__INHERITED:
				setInherited(INHERITED_EDEFAULT);
				return;
			case UiPackage.UI_ATTRIBUTE_COMPONENT_TYPE__DERIVED:
				setDerived(DERIVED_EDEFAULT);
				return;
			case UiPackage.UI_ATTRIBUTE_COMPONENT_TYPE__PRIVATE:
				setPrivate(PRIVATE_EDEFAULT);
				return;
			case UiPackage.UI_ATTRIBUTE_COMPONENT_TYPE__READONLY:
				setReadonly(READONLY_EDEFAULT);
				return;
			case UiPackage.UI_ATTRIBUTE_COMPONENT_TYPE__DISABLE_ON_CREATE:
				setDisableOnCreate(DISABLE_ON_CREATE_EDEFAULT);
				return;
			case UiPackage.UI_ATTRIBUTE_COMPONENT_TYPE__OWNER_CLASS:
				setOwnerClass((UIClass)null);
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
			case UiPackage.UI_ATTRIBUTE_COMPONENT_TYPE__INHERITED:
				return inherited != INHERITED_EDEFAULT;
			case UiPackage.UI_ATTRIBUTE_COMPONENT_TYPE__DERIVED:
				return derived != DERIVED_EDEFAULT;
			case UiPackage.UI_ATTRIBUTE_COMPONENT_TYPE__PRIVATE:
				return private_ != PRIVATE_EDEFAULT;
			case UiPackage.UI_ATTRIBUTE_COMPONENT_TYPE__READONLY:
				return readonly != READONLY_EDEFAULT;
			case UiPackage.UI_ATTRIBUTE_COMPONENT_TYPE__DISABLE_ON_CREATE:
				return disableOnCreate != DISABLE_ON_CREATE_EDEFAULT;
			case UiPackage.UI_ATTRIBUTE_COMPONENT_TYPE__OWNER_CLASS:
				return getOwnerClass() != null;
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
		result.append(" (inherited: ");
		result.append(inherited);
		result.append(", derived: ");
		result.append(derived);
		result.append(", private: ");
		result.append(private_);
		result.append(", readonly: ");
		result.append(readonly);
		result.append(", disableOnCreate: ");
		result.append(disableOnCreate);
		result.append(')');
		return result.toString();
	}

} //UIAttributeComponentTypeImpl
