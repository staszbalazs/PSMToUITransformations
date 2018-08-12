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

import ui.UIBase;
import ui.UIInfo;
import ui.UIMenuItem;
import ui.UIModule;
import ui.UiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ui.impl.UIBaseImpl#getModules <em>Modules</em>}</li>
 *   <li>{@link ui.impl.UIBaseImpl#getInfo <em>Info</em>}</li>
 *   <li>{@link ui.impl.UIBaseImpl#getMainMenu <em>Main Menu</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UIBaseImpl extends IdentifiableImpl implements UIBase {
	/**
	 * The cached value of the '{@link #getModules() <em>Modules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModules()
	 * @generated
	 * @ordered
	 */
	protected EList<UIModule> modules;

	/**
	 * The cached value of the '{@link #getInfo() <em>Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfo()
	 * @generated
	 * @ordered
	 */
	protected UIInfo info;

	/**
	 * The cached value of the '{@link #getMainMenu() <em>Main Menu</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainMenu()
	 * @generated
	 * @ordered
	 */
	protected UIMenuItem mainMenu;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UIBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiPackage.Literals.UI_BASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UIModule> getModules() {
		if (modules == null) {
			modules = new EObjectContainmentEList<UIModule>(UIModule.class, this, UiPackage.UI_BASE__MODULES);
		}
		return modules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIInfo getInfo() {
		return info;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInfo(UIInfo newInfo, NotificationChain msgs) {
		UIInfo oldInfo = info;
		info = newInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiPackage.UI_BASE__INFO, oldInfo, newInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfo(UIInfo newInfo) {
		if (newInfo != info) {
			NotificationChain msgs = null;
			if (info != null)
				msgs = ((InternalEObject)info).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiPackage.UI_BASE__INFO, null, msgs);
			if (newInfo != null)
				msgs = ((InternalEObject)newInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiPackage.UI_BASE__INFO, null, msgs);
			msgs = basicSetInfo(newInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI_BASE__INFO, newInfo, newInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIMenuItem getMainMenu() {
		return mainMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMainMenu(UIMenuItem newMainMenu, NotificationChain msgs) {
		UIMenuItem oldMainMenu = mainMenu;
		mainMenu = newMainMenu;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiPackage.UI_BASE__MAIN_MENU, oldMainMenu, newMainMenu);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainMenu(UIMenuItem newMainMenu) {
		if (newMainMenu != mainMenu) {
			NotificationChain msgs = null;
			if (mainMenu != null)
				msgs = ((InternalEObject)mainMenu).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiPackage.UI_BASE__MAIN_MENU, null, msgs);
			if (newMainMenu != null)
				msgs = ((InternalEObject)newMainMenu).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiPackage.UI_BASE__MAIN_MENU, null, msgs);
			msgs = basicSetMainMenu(newMainMenu, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI_BASE__MAIN_MENU, newMainMenu, newMainMenu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiPackage.UI_BASE__MODULES:
				return ((InternalEList<?>)getModules()).basicRemove(otherEnd, msgs);
			case UiPackage.UI_BASE__INFO:
				return basicSetInfo(null, msgs);
			case UiPackage.UI_BASE__MAIN_MENU:
				return basicSetMainMenu(null, msgs);
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
			case UiPackage.UI_BASE__MODULES:
				return getModules();
			case UiPackage.UI_BASE__INFO:
				return getInfo();
			case UiPackage.UI_BASE__MAIN_MENU:
				return getMainMenu();
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
			case UiPackage.UI_BASE__MODULES:
				getModules().clear();
				getModules().addAll((Collection<? extends UIModule>)newValue);
				return;
			case UiPackage.UI_BASE__INFO:
				setInfo((UIInfo)newValue);
				return;
			case UiPackage.UI_BASE__MAIN_MENU:
				setMainMenu((UIMenuItem)newValue);
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
			case UiPackage.UI_BASE__MODULES:
				getModules().clear();
				return;
			case UiPackage.UI_BASE__INFO:
				setInfo((UIInfo)null);
				return;
			case UiPackage.UI_BASE__MAIN_MENU:
				setMainMenu((UIMenuItem)null);
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
			case UiPackage.UI_BASE__MODULES:
				return modules != null && !modules.isEmpty();
			case UiPackage.UI_BASE__INFO:
				return info != null;
			case UiPackage.UI_BASE__MAIN_MENU:
				return mainMenu != null;
		}
		return super.eIsSet(featureID);
	}

} //UIBaseImpl
