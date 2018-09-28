/**
 */
package ui.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ui.UIComponentType;
import ui.UIViewField;
import ui.UiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI View Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ui.impl.UIViewFieldImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link ui.impl.UIViewFieldImpl#isSearchable <em>Searchable</em>}</li>
 *   <li>{@link ui.impl.UIViewFieldImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link ui.impl.UIViewFieldImpl#isShow <em>Show</em>}</li>
 *   <li>{@link ui.impl.UIViewFieldImpl#getComponentType <em>Component Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UIViewFieldImpl extends IdentifiableImpl implements UIViewField {
	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final int POSITION_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected int position = POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #isSearchable() <em>Searchable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSearchable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SEARCHABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSearchable() <em>Searchable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSearchable()
	 * @generated
	 * @ordered
	 */
	protected boolean searchable = SEARCHABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected static final int ORDER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected int order = ORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #isShow() <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShow()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isShow() <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShow()
	 * @generated
	 * @ordered
	 */
	protected boolean show = SHOW_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UIViewFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiPackage.Literals.UI_VIEW_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(int newPosition) {
		int oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI_VIEW_FIELD__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSearchable() {
		return searchable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSearchable(boolean newSearchable) {
		boolean oldSearchable = searchable;
		searchable = newSearchable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI_VIEW_FIELD__SEARCHABLE, oldSearchable, searchable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(int newOrder) {
		int oldOrder = order;
		order = newOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI_VIEW_FIELD__ORDER, oldOrder, order));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShow() {
		return show;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShow(boolean newShow) {
		boolean oldShow = show;
		show = newShow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI_VIEW_FIELD__SHOW, oldShow, show));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiPackage.UI_VIEW_FIELD__COMPONENT_TYPE, oldComponentType, componentType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI_VIEW_FIELD__COMPONENT_TYPE, oldComponentType, componentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UiPackage.UI_VIEW_FIELD__POSITION:
				return getPosition();
			case UiPackage.UI_VIEW_FIELD__SEARCHABLE:
				return isSearchable();
			case UiPackage.UI_VIEW_FIELD__ORDER:
				return getOrder();
			case UiPackage.UI_VIEW_FIELD__SHOW:
				return isShow();
			case UiPackage.UI_VIEW_FIELD__COMPONENT_TYPE:
				if (resolve) return getComponentType();
				return basicGetComponentType();
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
			case UiPackage.UI_VIEW_FIELD__POSITION:
				setPosition((Integer)newValue);
				return;
			case UiPackage.UI_VIEW_FIELD__SEARCHABLE:
				setSearchable((Boolean)newValue);
				return;
			case UiPackage.UI_VIEW_FIELD__ORDER:
				setOrder((Integer)newValue);
				return;
			case UiPackage.UI_VIEW_FIELD__SHOW:
				setShow((Boolean)newValue);
				return;
			case UiPackage.UI_VIEW_FIELD__COMPONENT_TYPE:
				setComponentType((UIComponentType)newValue);
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
			case UiPackage.UI_VIEW_FIELD__POSITION:
				setPosition(POSITION_EDEFAULT);
				return;
			case UiPackage.UI_VIEW_FIELD__SEARCHABLE:
				setSearchable(SEARCHABLE_EDEFAULT);
				return;
			case UiPackage.UI_VIEW_FIELD__ORDER:
				setOrder(ORDER_EDEFAULT);
				return;
			case UiPackage.UI_VIEW_FIELD__SHOW:
				setShow(SHOW_EDEFAULT);
				return;
			case UiPackage.UI_VIEW_FIELD__COMPONENT_TYPE:
				setComponentType((UIComponentType)null);
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
			case UiPackage.UI_VIEW_FIELD__POSITION:
				return position != POSITION_EDEFAULT;
			case UiPackage.UI_VIEW_FIELD__SEARCHABLE:
				return searchable != SEARCHABLE_EDEFAULT;
			case UiPackage.UI_VIEW_FIELD__ORDER:
				return order != ORDER_EDEFAULT;
			case UiPackage.UI_VIEW_FIELD__SHOW:
				return show != SHOW_EDEFAULT;
			case UiPackage.UI_VIEW_FIELD__COMPONENT_TYPE:
				return componentType != null;
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
		result.append(" (position: ");
		result.append(position);
		result.append(", searchable: ");
		result.append(searchable);
		result.append(", order: ");
		result.append(order);
		result.append(", show: ");
		result.append(show);
		result.append(')');
		return result.toString();
	}

} //UIViewFieldImpl
