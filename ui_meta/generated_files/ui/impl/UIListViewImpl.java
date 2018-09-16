/**
 */
package ui.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UiPackage.UI_LIST_VIEW__DETAIL_VIEW:
				if (resolve) return getDetailView();
				return basicGetDetailView();
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
		}
		return super.eIsSet(featureID);
	}

} //UIListViewImpl
