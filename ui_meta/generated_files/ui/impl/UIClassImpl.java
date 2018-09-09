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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ui.UIAction;
import ui.UIAttributeComponentType;
import ui.UIBaseComponentType;
import ui.UIClass;
import ui.UIClassView;
import ui.UIListView;
import ui.UiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ui.impl.UIClassImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link ui.impl.UIClassImpl#getClassView <em>Class View</em>}</li>
 *   <li>{@link ui.impl.UIClassImpl#getListView <em>List View</em>}</li>
 *   <li>{@link ui.impl.UIClassImpl#getChildClassViews <em>Child Class Views</em>}</li>
 *   <li>{@link ui.impl.UIClassImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link ui.impl.UIClassImpl#isReadonly <em>Readonly</em>}</li>
 *   <li>{@link ui.impl.UIClassImpl#isEnumClass <em>Enum Class</em>}</li>
 *   <li>{@link ui.impl.UIClassImpl#isSingleton <em>Singleton</em>}</li>
 *   <li>{@link ui.impl.UIClassImpl#getSuper <em>Super</em>}</li>
 *   <li>{@link ui.impl.UIClassImpl#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link ui.impl.UIClassImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link ui.impl.UIClassImpl#getInheritedAttributes <em>Inherited Attributes</em>}</li>
 *   <li>{@link ui.impl.UIClassImpl#getInheritedActions <em>Inherited Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UIClassImpl extends IdentifiableImpl implements UIClass {
	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<UIAction> actions;

	/**
	 * The cached value of the '{@link #getClassView() <em>Class View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassView()
	 * @generated
	 * @ordered
	 */
	protected UIClassView classView;

	/**
	 * The cached value of the '{@link #getListView() <em>List View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListView()
	 * @generated
	 * @ordered
	 */
	protected UIListView listView;

	/**
	 * The cached value of the '{@link #getChildClassViews() <em>Child Class Views</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildClassViews()
	 * @generated
	 * @ordered
	 */
	protected EList<UIClassView> childClassViews;

	/**
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean abstract_ = ABSTRACT_EDEFAULT;

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
	 * The default value of the '{@link #isEnumClass() <em>Enum Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnumClass()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENUM_CLASS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnumClass() <em>Enum Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnumClass()
	 * @generated
	 * @ordered
	 */
	protected boolean enumClass = ENUM_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #isSingleton() <em>Singleton</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSingleton()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SINGLETON_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSingleton() <em>Singleton</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSingleton()
	 * @generated
	 * @ordered
	 */
	protected boolean singleton = SINGLETON_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSuper() <em>Super</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuper()
	 * @generated
	 * @ordered
	 */
	protected UIClass super_;

	/**
	 * The cached value of the '{@link #getRepresentation() <em>Representation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentation()
	 * @generated
	 * @ordered
	 */
	protected UIBaseComponentType representation;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<UIAttributeComponentType> attributes;

	/**
	 * The cached value of the '{@link #getInheritedAttributes() <em>Inherited Attributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritedAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<UIAttributeComponentType> inheritedAttributes;

	/**
	 * The cached value of the '{@link #getInheritedActions() <em>Inherited Actions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritedActions()
	 * @generated
	 * @ordered
	 */
	protected EList<UIAction> inheritedActions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UIClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiPackage.Literals.UI_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UIAction> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<UIAction>(UIAction.class, this, UiPackage.UI_CLASS__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIClassView getClassView() {
		return classView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassView(UIClassView newClassView, NotificationChain msgs) {
		UIClassView oldClassView = classView;
		classView = newClassView;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiPackage.UI_CLASS__CLASS_VIEW, oldClassView, newClassView);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassView(UIClassView newClassView) {
		if (newClassView != classView) {
			NotificationChain msgs = null;
			if (classView != null)
				msgs = ((InternalEObject)classView).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiPackage.UI_CLASS__CLASS_VIEW, null, msgs);
			if (newClassView != null)
				msgs = ((InternalEObject)newClassView).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiPackage.UI_CLASS__CLASS_VIEW, null, msgs);
			msgs = basicSetClassView(newClassView, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI_CLASS__CLASS_VIEW, newClassView, newClassView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIListView getListView() {
		return listView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListView(UIListView newListView, NotificationChain msgs) {
		UIListView oldListView = listView;
		listView = newListView;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiPackage.UI_CLASS__LIST_VIEW, oldListView, newListView);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListView(UIListView newListView) {
		if (newListView != listView) {
			NotificationChain msgs = null;
			if (listView != null)
				msgs = ((InternalEObject)listView).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiPackage.UI_CLASS__LIST_VIEW, null, msgs);
			if (newListView != null)
				msgs = ((InternalEObject)newListView).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiPackage.UI_CLASS__LIST_VIEW, null, msgs);
			msgs = basicSetListView(newListView, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI_CLASS__LIST_VIEW, newListView, newListView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UIClassView> getChildClassViews() {
		if (childClassViews == null) {
			childClassViews = new EObjectResolvingEList<UIClassView>(UIClassView.class, this, UiPackage.UI_CLASS__CHILD_CLASS_VIEWS);
		}
		return childClassViews;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(boolean newAbstract) {
		boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI_CLASS__ABSTRACT, oldAbstract, abstract_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI_CLASS__READONLY, oldReadonly, readonly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnumClass() {
		return enumClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumClass(boolean newEnumClass) {
		boolean oldEnumClass = enumClass;
		enumClass = newEnumClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI_CLASS__ENUM_CLASS, oldEnumClass, enumClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSingleton() {
		return singleton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingleton(boolean newSingleton) {
		boolean oldSingleton = singleton;
		singleton = newSingleton;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI_CLASS__SINGLETON, oldSingleton, singleton));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIClass getSuper() {
		if (super_ != null && super_.eIsProxy()) {
			InternalEObject oldSuper = (InternalEObject)super_;
			super_ = (UIClass)eResolveProxy(oldSuper);
			if (super_ != oldSuper) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiPackage.UI_CLASS__SUPER, oldSuper, super_));
			}
		}
		return super_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIClass basicGetSuper() {
		return super_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuper(UIClass newSuper) {
		UIClass oldSuper = super_;
		super_ = newSuper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI_CLASS__SUPER, oldSuper, super_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIBaseComponentType getRepresentation() {
		if (representation != null && representation.eIsProxy()) {
			InternalEObject oldRepresentation = (InternalEObject)representation;
			representation = (UIBaseComponentType)eResolveProxy(oldRepresentation);
			if (representation != oldRepresentation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiPackage.UI_CLASS__REPRESENTATION, oldRepresentation, representation));
			}
		}
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIBaseComponentType basicGetRepresentation() {
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentation(UIBaseComponentType newRepresentation) {
		UIBaseComponentType oldRepresentation = representation;
		representation = newRepresentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI_CLASS__REPRESENTATION, oldRepresentation, representation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UIAttributeComponentType> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentWithInverseEList<UIAttributeComponentType>(UIAttributeComponentType.class, this, UiPackage.UI_CLASS__ATTRIBUTES, UiPackage.UI_ATTRIBUTE_COMPONENT_TYPE__OWNER_CLASS);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UIAttributeComponentType> getInheritedAttributes() {
		if (inheritedAttributes == null) {
			inheritedAttributes = new EObjectResolvingEList<UIAttributeComponentType>(UIAttributeComponentType.class, this, UiPackage.UI_CLASS__INHERITED_ATTRIBUTES);
		}
		return inheritedAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UIAction> getInheritedActions() {
		if (inheritedActions == null) {
			inheritedActions = new EObjectResolvingEList<UIAction>(UIAction.class, this, UiPackage.UI_CLASS__INHERITED_ACTIONS);
		}
		return inheritedActions;
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
			case UiPackage.UI_CLASS__ATTRIBUTES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAttributes()).basicAdd(otherEnd, msgs);
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
			case UiPackage.UI_CLASS__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
			case UiPackage.UI_CLASS__CLASS_VIEW:
				return basicSetClassView(null, msgs);
			case UiPackage.UI_CLASS__LIST_VIEW:
				return basicSetListView(null, msgs);
			case UiPackage.UI_CLASS__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
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
			case UiPackage.UI_CLASS__ACTIONS:
				return getActions();
			case UiPackage.UI_CLASS__CLASS_VIEW:
				return getClassView();
			case UiPackage.UI_CLASS__LIST_VIEW:
				return getListView();
			case UiPackage.UI_CLASS__CHILD_CLASS_VIEWS:
				return getChildClassViews();
			case UiPackage.UI_CLASS__ABSTRACT:
				return isAbstract();
			case UiPackage.UI_CLASS__READONLY:
				return isReadonly();
			case UiPackage.UI_CLASS__ENUM_CLASS:
				return isEnumClass();
			case UiPackage.UI_CLASS__SINGLETON:
				return isSingleton();
			case UiPackage.UI_CLASS__SUPER:
				if (resolve) return getSuper();
				return basicGetSuper();
			case UiPackage.UI_CLASS__REPRESENTATION:
				if (resolve) return getRepresentation();
				return basicGetRepresentation();
			case UiPackage.UI_CLASS__ATTRIBUTES:
				return getAttributes();
			case UiPackage.UI_CLASS__INHERITED_ATTRIBUTES:
				return getInheritedAttributes();
			case UiPackage.UI_CLASS__INHERITED_ACTIONS:
				return getInheritedActions();
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
			case UiPackage.UI_CLASS__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends UIAction>)newValue);
				return;
			case UiPackage.UI_CLASS__CLASS_VIEW:
				setClassView((UIClassView)newValue);
				return;
			case UiPackage.UI_CLASS__LIST_VIEW:
				setListView((UIListView)newValue);
				return;
			case UiPackage.UI_CLASS__CHILD_CLASS_VIEWS:
				getChildClassViews().clear();
				getChildClassViews().addAll((Collection<? extends UIClassView>)newValue);
				return;
			case UiPackage.UI_CLASS__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case UiPackage.UI_CLASS__READONLY:
				setReadonly((Boolean)newValue);
				return;
			case UiPackage.UI_CLASS__ENUM_CLASS:
				setEnumClass((Boolean)newValue);
				return;
			case UiPackage.UI_CLASS__SINGLETON:
				setSingleton((Boolean)newValue);
				return;
			case UiPackage.UI_CLASS__SUPER:
				setSuper((UIClass)newValue);
				return;
			case UiPackage.UI_CLASS__REPRESENTATION:
				setRepresentation((UIBaseComponentType)newValue);
				return;
			case UiPackage.UI_CLASS__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends UIAttributeComponentType>)newValue);
				return;
			case UiPackage.UI_CLASS__INHERITED_ATTRIBUTES:
				getInheritedAttributes().clear();
				getInheritedAttributes().addAll((Collection<? extends UIAttributeComponentType>)newValue);
				return;
			case UiPackage.UI_CLASS__INHERITED_ACTIONS:
				getInheritedActions().clear();
				getInheritedActions().addAll((Collection<? extends UIAction>)newValue);
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
			case UiPackage.UI_CLASS__ACTIONS:
				getActions().clear();
				return;
			case UiPackage.UI_CLASS__CLASS_VIEW:
				setClassView((UIClassView)null);
				return;
			case UiPackage.UI_CLASS__LIST_VIEW:
				setListView((UIListView)null);
				return;
			case UiPackage.UI_CLASS__CHILD_CLASS_VIEWS:
				getChildClassViews().clear();
				return;
			case UiPackage.UI_CLASS__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case UiPackage.UI_CLASS__READONLY:
				setReadonly(READONLY_EDEFAULT);
				return;
			case UiPackage.UI_CLASS__ENUM_CLASS:
				setEnumClass(ENUM_CLASS_EDEFAULT);
				return;
			case UiPackage.UI_CLASS__SINGLETON:
				setSingleton(SINGLETON_EDEFAULT);
				return;
			case UiPackage.UI_CLASS__SUPER:
				setSuper((UIClass)null);
				return;
			case UiPackage.UI_CLASS__REPRESENTATION:
				setRepresentation((UIBaseComponentType)null);
				return;
			case UiPackage.UI_CLASS__ATTRIBUTES:
				getAttributes().clear();
				return;
			case UiPackage.UI_CLASS__INHERITED_ATTRIBUTES:
				getInheritedAttributes().clear();
				return;
			case UiPackage.UI_CLASS__INHERITED_ACTIONS:
				getInheritedActions().clear();
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
			case UiPackage.UI_CLASS__ACTIONS:
				return actions != null && !actions.isEmpty();
			case UiPackage.UI_CLASS__CLASS_VIEW:
				return classView != null;
			case UiPackage.UI_CLASS__LIST_VIEW:
				return listView != null;
			case UiPackage.UI_CLASS__CHILD_CLASS_VIEWS:
				return childClassViews != null && !childClassViews.isEmpty();
			case UiPackage.UI_CLASS__ABSTRACT:
				return abstract_ != ABSTRACT_EDEFAULT;
			case UiPackage.UI_CLASS__READONLY:
				return readonly != READONLY_EDEFAULT;
			case UiPackage.UI_CLASS__ENUM_CLASS:
				return enumClass != ENUM_CLASS_EDEFAULT;
			case UiPackage.UI_CLASS__SINGLETON:
				return singleton != SINGLETON_EDEFAULT;
			case UiPackage.UI_CLASS__SUPER:
				return super_ != null;
			case UiPackage.UI_CLASS__REPRESENTATION:
				return representation != null;
			case UiPackage.UI_CLASS__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case UiPackage.UI_CLASS__INHERITED_ATTRIBUTES:
				return inheritedAttributes != null && !inheritedAttributes.isEmpty();
			case UiPackage.UI_CLASS__INHERITED_ACTIONS:
				return inheritedActions != null && !inheritedActions.isEmpty();
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
		result.append(" (abstract: ");
		result.append(abstract_);
		result.append(", readonly: ");
		result.append(readonly);
		result.append(", enumClass: ");
		result.append(enumClass);
		result.append(", singleton: ");
		result.append(singleton);
		result.append(')');
		return result.toString();
	}

} //UIClassImpl
