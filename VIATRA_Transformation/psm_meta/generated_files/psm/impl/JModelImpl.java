/**
 */
package psm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import psm.JInfo;
import psm.JModel;
import psm.JPackage;
import psm.JUIMenuItem;
import psm.PsmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JModel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link psm.impl.JModelImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link psm.impl.JModelImpl#getPackagePrefix <em>Package Prefix</em>}</li>
 *   <li>{@link psm.impl.JModelImpl#getApplicationTop <em>Application Top</em>}</li>
 *   <li>{@link psm.impl.JModelImpl#getRootMenuItems <em>Root Menu Items</em>}</li>
 *   <li>{@link psm.impl.JModelImpl#getInfo <em>Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JModelImpl extends JElementImpl implements JModel {
	/**
	 * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<JPackage> packages;

	/**
	 * The default value of the '{@link #getPackagePrefix() <em>Package Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackagePrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackagePrefix() <em>Package Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackagePrefix()
	 * @generated
	 * @ordered
	 */
	protected String packagePrefix = PACKAGE_PREFIX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getApplicationTop() <em>Application Top</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationTop()
	 * @generated
	 * @ordered
	 */
	protected JPackage applicationTop;

	/**
	 * The cached value of the '{@link #getRootMenuItems() <em>Root Menu Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootMenuItems()
	 * @generated
	 * @ordered
	 */
	protected EList<JUIMenuItem> rootMenuItems;

	/**
	 * The cached value of the '{@link #getInfo() <em>Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfo()
	 * @generated
	 * @ordered
	 */
	protected JInfo info;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PsmPackage.Literals.JMODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JPackage> getPackages() {
		if (packages == null) {
			packages = new EObjectContainmentWithInverseEList<JPackage>(JPackage.class, this, PsmPackage.JMODEL__PACKAGES, PsmPackage.JPACKAGE__OWNER_MODEL);
		}
		return packages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackagePrefix() {
		return packagePrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackagePrefix(String newPackagePrefix) {
		String oldPackagePrefix = packagePrefix;
		packagePrefix = newPackagePrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JMODEL__PACKAGE_PREFIX, oldPackagePrefix, packagePrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JPackage getApplicationTop() {
		if (applicationTop != null && applicationTop.eIsProxy()) {
			InternalEObject oldApplicationTop = (InternalEObject)applicationTop;
			applicationTop = (JPackage)eResolveProxy(oldApplicationTop);
			if (applicationTop != oldApplicationTop) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PsmPackage.JMODEL__APPLICATION_TOP, oldApplicationTop, applicationTop));
			}
		}
		return applicationTop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JPackage basicGetApplicationTop() {
		return applicationTop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationTop(JPackage newApplicationTop) {
		JPackage oldApplicationTop = applicationTop;
		applicationTop = newApplicationTop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JMODEL__APPLICATION_TOP, oldApplicationTop, applicationTop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JUIMenuItem> getRootMenuItems() {
		if (rootMenuItems == null) {
			rootMenuItems = new EObjectContainmentEList<JUIMenuItem>(JUIMenuItem.class, this, PsmPackage.JMODEL__ROOT_MENU_ITEMS);
		}
		return rootMenuItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JInfo getInfo() {
		return info;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInfo(JInfo newInfo, NotificationChain msgs) {
		JInfo oldInfo = info;
		info = newInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PsmPackage.JMODEL__INFO, oldInfo, newInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfo(JInfo newInfo) {
		if (newInfo != info) {
			NotificationChain msgs = null;
			if (info != null)
				msgs = ((InternalEObject)info).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PsmPackage.JMODEL__INFO, null, msgs);
			if (newInfo != null)
				msgs = ((InternalEObject)newInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PsmPackage.JMODEL__INFO, null, msgs);
			msgs = basicSetInfo(newInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JMODEL__INFO, newInfo, newInfo));
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
			case PsmPackage.JMODEL__PACKAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPackages()).basicAdd(otherEnd, msgs);
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
			case PsmPackage.JMODEL__PACKAGES:
				return ((InternalEList<?>)getPackages()).basicRemove(otherEnd, msgs);
			case PsmPackage.JMODEL__ROOT_MENU_ITEMS:
				return ((InternalEList<?>)getRootMenuItems()).basicRemove(otherEnd, msgs);
			case PsmPackage.JMODEL__INFO:
				return basicSetInfo(null, msgs);
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
			case PsmPackage.JMODEL__PACKAGES:
				return getPackages();
			case PsmPackage.JMODEL__PACKAGE_PREFIX:
				return getPackagePrefix();
			case PsmPackage.JMODEL__APPLICATION_TOP:
				if (resolve) return getApplicationTop();
				return basicGetApplicationTop();
			case PsmPackage.JMODEL__ROOT_MENU_ITEMS:
				return getRootMenuItems();
			case PsmPackage.JMODEL__INFO:
				return getInfo();
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
			case PsmPackage.JMODEL__PACKAGES:
				getPackages().clear();
				getPackages().addAll((Collection<? extends JPackage>)newValue);
				return;
			case PsmPackage.JMODEL__PACKAGE_PREFIX:
				setPackagePrefix((String)newValue);
				return;
			case PsmPackage.JMODEL__APPLICATION_TOP:
				setApplicationTop((JPackage)newValue);
				return;
			case PsmPackage.JMODEL__ROOT_MENU_ITEMS:
				getRootMenuItems().clear();
				getRootMenuItems().addAll((Collection<? extends JUIMenuItem>)newValue);
				return;
			case PsmPackage.JMODEL__INFO:
				setInfo((JInfo)newValue);
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
			case PsmPackage.JMODEL__PACKAGES:
				getPackages().clear();
				return;
			case PsmPackage.JMODEL__PACKAGE_PREFIX:
				setPackagePrefix(PACKAGE_PREFIX_EDEFAULT);
				return;
			case PsmPackage.JMODEL__APPLICATION_TOP:
				setApplicationTop((JPackage)null);
				return;
			case PsmPackage.JMODEL__ROOT_MENU_ITEMS:
				getRootMenuItems().clear();
				return;
			case PsmPackage.JMODEL__INFO:
				setInfo((JInfo)null);
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
			case PsmPackage.JMODEL__PACKAGES:
				return packages != null && !packages.isEmpty();
			case PsmPackage.JMODEL__PACKAGE_PREFIX:
				return PACKAGE_PREFIX_EDEFAULT == null ? packagePrefix != null : !PACKAGE_PREFIX_EDEFAULT.equals(packagePrefix);
			case PsmPackage.JMODEL__APPLICATION_TOP:
				return applicationTop != null;
			case PsmPackage.JMODEL__ROOT_MENU_ITEMS:
				return rootMenuItems != null && !rootMenuItems.isEmpty();
			case PsmPackage.JMODEL__INFO:
				return info != null;
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
		result.append(" (packagePrefix: ");
		result.append(packagePrefix);
		result.append(')');
		return result.toString();
	}

} //JModelImpl
