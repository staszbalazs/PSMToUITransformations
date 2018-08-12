/**
 */
package ui.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ui.UIClass;
import ui.UIClassView;
import ui.UIListView;
import ui.UiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI List View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ui.impl.UIListViewImpl#getDetailView <em>Detail View</em>}</li>
 *   <li>{@link ui.impl.UIListViewImpl#getOwnerClass <em>Owner Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UIListViewImpl extends UIViewImpl implements UIListView {
	/**
	 * The cached value of the '{@link #getDetailView() <em>Detail View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailView()
	 * @generated
	 * @ordered
	 */
	protected UIClassView detailView;

	/**
	 * The cached value of the '{@link #getOwnerClass() <em>Owner Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnerClass()
	 * @generated
	 * @ordered
	 */
	protected UIClass ownerClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UIListViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiPackage.Literals.UI_LIST_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIClassView getDetailView() {
		if (detailView != null && detailView.eIsProxy()) {
			InternalEObject oldDetailView = (InternalEObject)detailView;
			detailView = (UIClassView)eResolveProxy(oldDetailView);
			if (detailView != oldDetailView) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiPackage.UI_LIST_VIEW__DETAIL_VIEW, oldDetailView, detailView));
			}
		}
		return detailView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIClassView basicGetDetailView() {
		return detailView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetailView(UIClassView newDetailView) {
		UIClassView oldDetailView = detailView;
		detailView = newDetailView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI_LIST_VIEW__DETAIL_VIEW, oldDetailView, detailView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIClass getOwnerClass() {
		if (ownerClass != null && ownerClass.eIsProxy()) {
			InternalEObject oldOwnerClass = (InternalEObject)ownerClass;
			ownerClass = (UIClass)eResolveProxy(oldOwnerClass);
			if (ownerClass != oldOwnerClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiPackage.UI_LIST_VIEW__OWNER_CLASS, oldOwnerClass, ownerClass));
			}
		}
		return ownerClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIClass basicGetOwnerClass() {
		return ownerClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnerClass(UIClass newOwnerClass, NotificationChain msgs) {
		UIClass oldOwnerClass = ownerClass;
		ownerClass = newOwnerClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiPackage.UI_LIST_VIEW__OWNER_CLASS, oldOwnerClass, newOwnerClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerClass(UIClass newOwnerClass) {
		if (newOwnerClass != ownerClass) {
			NotificationChain msgs = null;
			if (ownerClass != null)
				msgs = ((InternalEObject)ownerClass).eInverseRemove(this, UiPackage.UI_CLASS__SELECTOR, UIClass.class, msgs);
			if (newOwnerClass != null)
				msgs = ((InternalEObject)newOwnerClass).eInverseAdd(this, UiPackage.UI_CLASS__SELECTOR, UIClass.class, msgs);
			msgs = basicSetOwnerClass(newOwnerClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI_LIST_VIEW__OWNER_CLASS, newOwnerClass, newOwnerClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiPackage.UI_LIST_VIEW__OWNER_CLASS:
				if (ownerClass != null)
					msgs = ((InternalEObject)ownerClass).eInverseRemove(this, UiPackage.UI_CLASS__SELECTOR, UIClass.class, msgs);
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
			case UiPackage.UI_LIST_VIEW__OWNER_CLASS:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UiPackage.UI_LIST_VIEW__DETAIL_VIEW:
				if (resolve) return getDetailView();
				return basicGetDetailView();
			case UiPackage.UI_LIST_VIEW__OWNER_CLASS:
				if (resolve) return getOwnerClass();
				return basicGetOwnerClass();
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
			case UiPackage.UI_LIST_VIEW__DETAIL_VIEW:
				setDetailView((UIClassView)newValue);
				return;
			case UiPackage.UI_LIST_VIEW__OWNER_CLASS:
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
			case UiPackage.UI_LIST_VIEW__DETAIL_VIEW:
				setDetailView((UIClassView)null);
				return;
			case UiPackage.UI_LIST_VIEW__OWNER_CLASS:
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
			case UiPackage.UI_LIST_VIEW__DETAIL_VIEW:
				return detailView != null;
			case UiPackage.UI_LIST_VIEW__OWNER_CLASS:
				return ownerClass != null;
		}
		return super.eIsSet(featureID);
	}

} //UIListViewImpl
