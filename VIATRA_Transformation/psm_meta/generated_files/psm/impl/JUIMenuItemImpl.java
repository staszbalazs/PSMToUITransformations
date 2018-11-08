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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import psm.JClass;
import psm.JMenuItemType;
import psm.JUIAlias;
import psm.JUIFilter;
import psm.JUIMenuItem;
import psm.PsmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JUI Menu Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link psm.impl.JUIMenuItemImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link psm.impl.JUIMenuItemImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link psm.impl.JUIMenuItemImpl#getRepresent <em>Represent</em>}</li>
 *   <li>{@link psm.impl.JUIMenuItemImpl#getUifilters <em>Uifilters</em>}</li>
 *   <li>{@link psm.impl.JUIMenuItemImpl#getType <em>Type</em>}</li>
 *   <li>{@link psm.impl.JUIMenuItemImpl#getAlias <em>Alias</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JUIMenuItemImpl extends JElementImpl implements JUIMenuItem {
	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<JUIMenuItem> children;

	/**
	 * The cached value of the '{@link #getRepresent() <em>Represent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresent()
	 * @generated
	 * @ordered
	 */
	protected JClass represent;

	/**
	 * The cached value of the '{@link #getUifilters() <em>Uifilters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUifilters()
	 * @generated
	 * @ordered
	 */
	protected EList<JUIFilter> uifilters;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final JMenuItemType TYPE_EDEFAULT = JMenuItemType.OBJECT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected JMenuItemType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAlias() <em>Alias</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected JUIAlias alias;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JUIMenuItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PsmPackage.Literals.JUI_MENU_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JUIMenuItem> getChildren() {
		if (children == null) {
			children = new EObjectContainmentWithInverseEList<JUIMenuItem>(JUIMenuItem.class, this, PsmPackage.JUI_MENU_ITEM__CHILDREN, PsmPackage.JUI_MENU_ITEM__PARENT);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JUIMenuItem getParent() {
		if (eContainerFeatureID() != PsmPackage.JUI_MENU_ITEM__PARENT) return null;
		return (JUIMenuItem)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(JUIMenuItem newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, PsmPackage.JUI_MENU_ITEM__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(JUIMenuItem newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != PsmPackage.JUI_MENU_ITEM__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, PsmPackage.JUI_MENU_ITEM__CHILDREN, JUIMenuItem.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JUI_MENU_ITEM__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JClass getRepresent() {
		if (represent != null && represent.eIsProxy()) {
			InternalEObject oldRepresent = (InternalEObject)represent;
			represent = (JClass)eResolveProxy(oldRepresent);
			if (represent != oldRepresent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PsmPackage.JUI_MENU_ITEM__REPRESENT, oldRepresent, represent));
			}
		}
		return represent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JClass basicGetRepresent() {
		return represent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresent(JClass newRepresent) {
		JClass oldRepresent = represent;
		represent = newRepresent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JUI_MENU_ITEM__REPRESENT, oldRepresent, represent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JUIFilter> getUifilters() {
		if (uifilters == null) {
			uifilters = new EObjectContainmentEList<JUIFilter>(JUIFilter.class, this, PsmPackage.JUI_MENU_ITEM__UIFILTERS);
		}
		return uifilters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JMenuItemType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(JMenuItemType newType) {
		JMenuItemType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JUI_MENU_ITEM__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JUIAlias getAlias() {
		if (alias != null && alias.eIsProxy()) {
			InternalEObject oldAlias = (InternalEObject)alias;
			alias = (JUIAlias)eResolveProxy(oldAlias);
			if (alias != oldAlias) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PsmPackage.JUI_MENU_ITEM__ALIAS, oldAlias, alias));
			}
		}
		return alias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JUIAlias basicGetAlias() {
		return alias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlias(JUIAlias newAlias) {
		JUIAlias oldAlias = alias;
		alias = newAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JUI_MENU_ITEM__ALIAS, oldAlias, alias));
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
			case PsmPackage.JUI_MENU_ITEM__CHILDREN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(otherEnd, msgs);
			case PsmPackage.JUI_MENU_ITEM__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((JUIMenuItem)otherEnd, msgs);
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
			case PsmPackage.JUI_MENU_ITEM__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case PsmPackage.JUI_MENU_ITEM__PARENT:
				return basicSetParent(null, msgs);
			case PsmPackage.JUI_MENU_ITEM__UIFILTERS:
				return ((InternalEList<?>)getUifilters()).basicRemove(otherEnd, msgs);
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
			case PsmPackage.JUI_MENU_ITEM__PARENT:
				return eInternalContainer().eInverseRemove(this, PsmPackage.JUI_MENU_ITEM__CHILDREN, JUIMenuItem.class, msgs);
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
			case PsmPackage.JUI_MENU_ITEM__CHILDREN:
				return getChildren();
			case PsmPackage.JUI_MENU_ITEM__PARENT:
				return getParent();
			case PsmPackage.JUI_MENU_ITEM__REPRESENT:
				if (resolve) return getRepresent();
				return basicGetRepresent();
			case PsmPackage.JUI_MENU_ITEM__UIFILTERS:
				return getUifilters();
			case PsmPackage.JUI_MENU_ITEM__TYPE:
				return getType();
			case PsmPackage.JUI_MENU_ITEM__ALIAS:
				if (resolve) return getAlias();
				return basicGetAlias();
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
			case PsmPackage.JUI_MENU_ITEM__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends JUIMenuItem>)newValue);
				return;
			case PsmPackage.JUI_MENU_ITEM__PARENT:
				setParent((JUIMenuItem)newValue);
				return;
			case PsmPackage.JUI_MENU_ITEM__REPRESENT:
				setRepresent((JClass)newValue);
				return;
			case PsmPackage.JUI_MENU_ITEM__UIFILTERS:
				getUifilters().clear();
				getUifilters().addAll((Collection<? extends JUIFilter>)newValue);
				return;
			case PsmPackage.JUI_MENU_ITEM__TYPE:
				setType((JMenuItemType)newValue);
				return;
			case PsmPackage.JUI_MENU_ITEM__ALIAS:
				setAlias((JUIAlias)newValue);
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
			case PsmPackage.JUI_MENU_ITEM__CHILDREN:
				getChildren().clear();
				return;
			case PsmPackage.JUI_MENU_ITEM__PARENT:
				setParent((JUIMenuItem)null);
				return;
			case PsmPackage.JUI_MENU_ITEM__REPRESENT:
				setRepresent((JClass)null);
				return;
			case PsmPackage.JUI_MENU_ITEM__UIFILTERS:
				getUifilters().clear();
				return;
			case PsmPackage.JUI_MENU_ITEM__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case PsmPackage.JUI_MENU_ITEM__ALIAS:
				setAlias((JUIAlias)null);
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
			case PsmPackage.JUI_MENU_ITEM__CHILDREN:
				return children != null && !children.isEmpty();
			case PsmPackage.JUI_MENU_ITEM__PARENT:
				return getParent() != null;
			case PsmPackage.JUI_MENU_ITEM__REPRESENT:
				return represent != null;
			case PsmPackage.JUI_MENU_ITEM__UIFILTERS:
				return uifilters != null && !uifilters.isEmpty();
			case PsmPackage.JUI_MENU_ITEM__TYPE:
				return type != TYPE_EDEFAULT;
			case PsmPackage.JUI_MENU_ITEM__ALIAS:
				return alias != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //JUIMenuItemImpl
