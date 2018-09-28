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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import ui.UIFilter;
import ui.UIMenuItem;
import ui.UIView;
import ui.UiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI Menu Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ui.impl.UIMenuItemImpl#getMenuView <em>Menu View</em>}</li>
 *   <li>{@link ui.impl.UIMenuItemImpl#getFilters <em>Filters</em>}</li>
 *   <li>{@link ui.impl.UIMenuItemImpl#getMenuItems <em>Menu Items</em>}</li>
 *   <li>{@link ui.impl.UIMenuItemImpl#getOwnerMenuItem <em>Owner Menu Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UIMenuItemImpl extends IdentifiableImpl implements UIMenuItem {
	/**
	 * The cached value of the '{@link #getMenuView() <em>Menu View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenuView()
	 * @generated
	 * @ordered
	 */
	protected UIView menuView;

	/**
	 * The cached value of the '{@link #getFilters() <em>Filters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilters()
	 * @generated
	 * @ordered
	 */
	protected EList<UIFilter> filters;

	/**
	 * The cached value of the '{@link #getMenuItems() <em>Menu Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenuItems()
	 * @generated
	 * @ordered
	 */
	protected EList<UIMenuItem> menuItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UIMenuItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiPackage.Literals.UI_MENU_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIView getMenuView() {
		if (menuView != null && menuView.eIsProxy()) {
			InternalEObject oldMenuView = (InternalEObject)menuView;
			menuView = (UIView)eResolveProxy(oldMenuView);
			if (menuView != oldMenuView) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiPackage.UI_MENU_ITEM__MENU_VIEW, oldMenuView, menuView));
			}
		}
		return menuView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIView basicGetMenuView() {
		return menuView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMenuView(UIView newMenuView) {
		UIView oldMenuView = menuView;
		menuView = newMenuView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI_MENU_ITEM__MENU_VIEW, oldMenuView, menuView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UIFilter> getFilters() {
		if (filters == null) {
			filters = new EObjectContainmentEList<UIFilter>(UIFilter.class, this, UiPackage.UI_MENU_ITEM__FILTERS);
		}
		return filters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UIMenuItem> getMenuItems() {
		if (menuItems == null) {
			menuItems = new EObjectContainmentWithInverseEList<UIMenuItem>(UIMenuItem.class, this, UiPackage.UI_MENU_ITEM__MENU_ITEMS, UiPackage.UI_MENU_ITEM__OWNER_MENU_ITEM);
		}
		return menuItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIMenuItem getOwnerMenuItem() {
		if (eContainerFeatureID() != UiPackage.UI_MENU_ITEM__OWNER_MENU_ITEM) return null;
		return (UIMenuItem)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnerMenuItem(UIMenuItem newOwnerMenuItem, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnerMenuItem, UiPackage.UI_MENU_ITEM__OWNER_MENU_ITEM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerMenuItem(UIMenuItem newOwnerMenuItem) {
		if (newOwnerMenuItem != eInternalContainer() || (eContainerFeatureID() != UiPackage.UI_MENU_ITEM__OWNER_MENU_ITEM && newOwnerMenuItem != null)) {
			if (EcoreUtil.isAncestor(this, newOwnerMenuItem))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnerMenuItem != null)
				msgs = ((InternalEObject)newOwnerMenuItem).eInverseAdd(this, UiPackage.UI_MENU_ITEM__MENU_ITEMS, UIMenuItem.class, msgs);
			msgs = basicSetOwnerMenuItem(newOwnerMenuItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI_MENU_ITEM__OWNER_MENU_ITEM, newOwnerMenuItem, newOwnerMenuItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiPackage.UI_MENU_ITEM__MENU_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMenuItems()).basicAdd(otherEnd, msgs);
			case UiPackage.UI_MENU_ITEM__OWNER_MENU_ITEM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnerMenuItem((UIMenuItem)otherEnd, msgs);
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
			case UiPackage.UI_MENU_ITEM__FILTERS:
				return ((InternalEList<?>)getFilters()).basicRemove(otherEnd, msgs);
			case UiPackage.UI_MENU_ITEM__MENU_ITEMS:
				return ((InternalEList<?>)getMenuItems()).basicRemove(otherEnd, msgs);
			case UiPackage.UI_MENU_ITEM__OWNER_MENU_ITEM:
				return basicSetOwnerMenuItem(null, msgs);
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
			case UiPackage.UI_MENU_ITEM__OWNER_MENU_ITEM:
				return eInternalContainer().eInverseRemove(this, UiPackage.UI_MENU_ITEM__MENU_ITEMS, UIMenuItem.class, msgs);
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
			case UiPackage.UI_MENU_ITEM__MENU_VIEW:
				if (resolve) return getMenuView();
				return basicGetMenuView();
			case UiPackage.UI_MENU_ITEM__FILTERS:
				return getFilters();
			case UiPackage.UI_MENU_ITEM__MENU_ITEMS:
				return getMenuItems();
			case UiPackage.UI_MENU_ITEM__OWNER_MENU_ITEM:
				return getOwnerMenuItem();
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
			case UiPackage.UI_MENU_ITEM__MENU_VIEW:
				setMenuView((UIView)newValue);
				return;
			case UiPackage.UI_MENU_ITEM__FILTERS:
				getFilters().clear();
				getFilters().addAll((Collection<? extends UIFilter>)newValue);
				return;
			case UiPackage.UI_MENU_ITEM__MENU_ITEMS:
				getMenuItems().clear();
				getMenuItems().addAll((Collection<? extends UIMenuItem>)newValue);
				return;
			case UiPackage.UI_MENU_ITEM__OWNER_MENU_ITEM:
				setOwnerMenuItem((UIMenuItem)newValue);
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
			case UiPackage.UI_MENU_ITEM__MENU_VIEW:
				setMenuView((UIView)null);
				return;
			case UiPackage.UI_MENU_ITEM__FILTERS:
				getFilters().clear();
				return;
			case UiPackage.UI_MENU_ITEM__MENU_ITEMS:
				getMenuItems().clear();
				return;
			case UiPackage.UI_MENU_ITEM__OWNER_MENU_ITEM:
				setOwnerMenuItem((UIMenuItem)null);
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
			case UiPackage.UI_MENU_ITEM__MENU_VIEW:
				return menuView != null;
			case UiPackage.UI_MENU_ITEM__FILTERS:
				return filters != null && !filters.isEmpty();
			case UiPackage.UI_MENU_ITEM__MENU_ITEMS:
				return menuItems != null && !menuItems.isEmpty();
			case UiPackage.UI_MENU_ITEM__OWNER_MENU_ITEM:
				return getOwnerMenuItem() != null;
		}
		return super.eIsSet(featureID);
	}

} //UIMenuItemImpl
