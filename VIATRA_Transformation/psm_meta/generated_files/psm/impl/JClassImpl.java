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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import psm.JAttribute;
import psm.JClass;
import psm.JEnumeration;
import psm.JOperation;
import psm.JPackage;
import psm.JRole;
import psm.JStateMachine;
import psm.JUIAlias;
import psm.JUIAttributeGroup;
import psm.PsmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link psm.impl.JClassImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link psm.impl.JClassImpl#getStateMachines <em>State Machines</em>}</li>
 *   <li>{@link psm.impl.JClassImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link psm.impl.JClassImpl#getAttributeOrder <em>Attribute Order</em>}</li>
 *   <li>{@link psm.impl.JClassImpl#getAttributesForListing <em>Attributes For Listing</em>}</li>
 *   <li>{@link psm.impl.JClassImpl#getFixedEnum <em>Fixed Enum</em>}</li>
 *   <li>{@link psm.impl.JClassImpl#isRepresentsTenant <em>Represents Tenant</em>}</li>
 *   <li>{@link psm.impl.JClassImpl#isTenantMember <em>Tenant Member</em>}</li>
 *   <li>{@link psm.impl.JClassImpl#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link psm.impl.JClassImpl#isRepresentsEnum <em>Represents Enum</em>}</li>
 *   <li>{@link psm.impl.JClassImpl#isRepresentsTenantUser <em>Represents Tenant User</em>}</li>
 *   <li>{@link psm.impl.JClassImpl#isRepresentsUser <em>Represents User</em>}</li>
 *   <li>{@link psm.impl.JClassImpl#getSupertype <em>Supertype</em>}</li>
 *   <li>{@link psm.impl.JClassImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link psm.impl.JClassImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link psm.impl.JClassImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link psm.impl.JClassImpl#isBusinessSingleton <em>Business Singleton</em>}</li>
 *   <li>{@link psm.impl.JClassImpl#getAliases <em>Aliases</em>}</li>
 *   <li>{@link psm.impl.JClassImpl#isWatched <em>Watched</em>}</li>
 *   <li>{@link psm.impl.JClassImpl#isRepresentsEnumValue <em>Represents Enum Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JClassImpl extends JTypeImpl implements JClass {
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
	 * The cached value of the '{@link #getStateMachines() <em>State Machines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateMachines()
	 * @generated
	 * @ordered
	 */
	protected EList<JStateMachine> stateMachines;

	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<JOperation> operations;

	/**
	 * The cached value of the '{@link #getAttributeOrder() <em>Attribute Order</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeOrder()
	 * @generated
	 * @ordered
	 */
	protected EList<JUIAttributeGroup> attributeOrder;

	/**
	 * The cached value of the '{@link #getAttributesForListing() <em>Attributes For Listing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributesForListing()
	 * @generated
	 * @ordered
	 */
	protected EList<JAttribute> attributesForListing;

	/**
	 * The cached value of the '{@link #getFixedEnum() <em>Fixed Enum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedEnum()
	 * @generated
	 * @ordered
	 */
	protected JEnumeration fixedEnum;

	/**
	 * The default value of the '{@link #isRepresentsTenant() <em>Represents Tenant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRepresentsTenant()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REPRESENTS_TENANT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRepresentsTenant() <em>Represents Tenant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRepresentsTenant()
	 * @generated
	 * @ordered
	 */
	protected boolean representsTenant = REPRESENTS_TENANT_EDEFAULT;

	/**
	 * The default value of the '{@link #isTenantMember() <em>Tenant Member</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTenantMember()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TENANT_MEMBER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTenantMember() <em>Tenant Member</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTenantMember()
	 * @generated
	 * @ordered
	 */
	protected boolean tenantMember = TENANT_MEMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRepresentation() <em>Representation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentation()
	 * @generated
	 * @ordered
	 */
	protected JAttribute representation;

	/**
	 * The default value of the '{@link #isRepresentsEnum() <em>Represents Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRepresentsEnum()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REPRESENTS_ENUM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRepresentsEnum() <em>Represents Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRepresentsEnum()
	 * @generated
	 * @ordered
	 */
	protected boolean representsEnum = REPRESENTS_ENUM_EDEFAULT;

	/**
	 * The default value of the '{@link #isRepresentsTenantUser() <em>Represents Tenant User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRepresentsTenantUser()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REPRESENTS_TENANT_USER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRepresentsTenantUser() <em>Represents Tenant User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRepresentsTenantUser()
	 * @generated
	 * @ordered
	 */
	protected boolean representsTenantUser = REPRESENTS_TENANT_USER_EDEFAULT;

	/**
	 * The default value of the '{@link #isRepresentsUser() <em>Represents User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRepresentsUser()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REPRESENTS_USER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRepresentsUser() <em>Represents User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRepresentsUser()
	 * @generated
	 * @ordered
	 */
	protected boolean representsUser = REPRESENTS_USER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSupertype() <em>Supertype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupertype()
	 * @generated
	 * @ordered
	 */
	protected JClass supertype;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<JRole> roles;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<JAttribute> attributes;

	/**
	 * The default value of the '{@link #isBusinessSingleton() <em>Business Singleton</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBusinessSingleton()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BUSINESS_SINGLETON_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBusinessSingleton() <em>Business Singleton</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBusinessSingleton()
	 * @generated
	 * @ordered
	 */
	protected boolean businessSingleton = BUSINESS_SINGLETON_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAliases() <em>Aliases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliases()
	 * @generated
	 * @ordered
	 */
	protected EList<JUIAlias> aliases;

	/**
	 * The default value of the '{@link #isWatched() <em>Watched</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWatched()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WATCHED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWatched() <em>Watched</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWatched()
	 * @generated
	 * @ordered
	 */
	protected boolean watched = WATCHED_EDEFAULT;

	/**
	 * The default value of the '{@link #isRepresentsEnumValue() <em>Represents Enum Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRepresentsEnumValue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REPRESENTS_ENUM_VALUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRepresentsEnumValue() <em>Represents Enum Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRepresentsEnumValue()
	 * @generated
	 * @ordered
	 */
	protected boolean representsEnumValue = REPRESENTS_ENUM_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PsmPackage.Literals.JCLASS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JCLASS__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JStateMachine> getStateMachines() {
		if (stateMachines == null) {
			stateMachines = new EObjectContainmentWithInverseEList<JStateMachine>(JStateMachine.class, this, PsmPackage.JCLASS__STATE_MACHINES, PsmPackage.JSTATE_MACHINE__OWNER_CLASS);
		}
		return stateMachines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JOperation> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentWithInverseEList<JOperation>(JOperation.class, this, PsmPackage.JCLASS__OPERATIONS, PsmPackage.JOPERATION__OWNER_CLASS);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JUIAttributeGroup> getAttributeOrder() {
		if (attributeOrder == null) {
			attributeOrder = new EObjectContainmentEList<JUIAttributeGroup>(JUIAttributeGroup.class, this, PsmPackage.JCLASS__ATTRIBUTE_ORDER);
		}
		return attributeOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JAttribute> getAttributesForListing() {
		if (attributesForListing == null) {
			attributesForListing = new EObjectResolvingEList<JAttribute>(JAttribute.class, this, PsmPackage.JCLASS__ATTRIBUTES_FOR_LISTING);
		}
		return attributesForListing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JEnumeration getFixedEnum() {
		if (fixedEnum != null && fixedEnum.eIsProxy()) {
			InternalEObject oldFixedEnum = (InternalEObject)fixedEnum;
			fixedEnum = (JEnumeration)eResolveProxy(oldFixedEnum);
			if (fixedEnum != oldFixedEnum) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PsmPackage.JCLASS__FIXED_ENUM, oldFixedEnum, fixedEnum));
			}
		}
		return fixedEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JEnumeration basicGetFixedEnum() {
		return fixedEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedEnum(JEnumeration newFixedEnum, NotificationChain msgs) {
		JEnumeration oldFixedEnum = fixedEnum;
		fixedEnum = newFixedEnum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PsmPackage.JCLASS__FIXED_ENUM, oldFixedEnum, newFixedEnum);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedEnum(JEnumeration newFixedEnum) {
		if (newFixedEnum != fixedEnum) {
			NotificationChain msgs = null;
			if (fixedEnum != null)
				msgs = ((InternalEObject)fixedEnum).eInverseRemove(this, PsmPackage.JENUMERATION__CLASS_REPRESENTATION, JEnumeration.class, msgs);
			if (newFixedEnum != null)
				msgs = ((InternalEObject)newFixedEnum).eInverseAdd(this, PsmPackage.JENUMERATION__CLASS_REPRESENTATION, JEnumeration.class, msgs);
			msgs = basicSetFixedEnum(newFixedEnum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JCLASS__FIXED_ENUM, newFixedEnum, newFixedEnum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRepresentsTenant() {
		return representsTenant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentsTenant(boolean newRepresentsTenant) {
		boolean oldRepresentsTenant = representsTenant;
		representsTenant = newRepresentsTenant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JCLASS__REPRESENTS_TENANT, oldRepresentsTenant, representsTenant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTenantMember() {
		return tenantMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTenantMember(boolean newTenantMember) {
		boolean oldTenantMember = tenantMember;
		tenantMember = newTenantMember;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JCLASS__TENANT_MEMBER, oldTenantMember, tenantMember));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JAttribute getRepresentation() {
		if (representation != null && representation.eIsProxy()) {
			InternalEObject oldRepresentation = (InternalEObject)representation;
			representation = (JAttribute)eResolveProxy(oldRepresentation);
			if (representation != oldRepresentation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PsmPackage.JCLASS__REPRESENTATION, oldRepresentation, representation));
			}
		}
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JAttribute basicGetRepresentation() {
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentation(JAttribute newRepresentation) {
		JAttribute oldRepresentation = representation;
		representation = newRepresentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JCLASS__REPRESENTATION, oldRepresentation, representation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRepresentsEnum() {
		return representsEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentsEnum(boolean newRepresentsEnum) {
		boolean oldRepresentsEnum = representsEnum;
		representsEnum = newRepresentsEnum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JCLASS__REPRESENTS_ENUM, oldRepresentsEnum, representsEnum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRepresentsTenantUser() {
		return representsTenantUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentsTenantUser(boolean newRepresentsTenantUser) {
		boolean oldRepresentsTenantUser = representsTenantUser;
		representsTenantUser = newRepresentsTenantUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JCLASS__REPRESENTS_TENANT_USER, oldRepresentsTenantUser, representsTenantUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRepresentsUser() {
		return representsUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentsUser(boolean newRepresentsUser) {
		boolean oldRepresentsUser = representsUser;
		representsUser = newRepresentsUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JCLASS__REPRESENTS_USER, oldRepresentsUser, representsUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JClass getSupertype() {
		if (supertype != null && supertype.eIsProxy()) {
			InternalEObject oldSupertype = (InternalEObject)supertype;
			supertype = (JClass)eResolveProxy(oldSupertype);
			if (supertype != oldSupertype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PsmPackage.JCLASS__SUPERTYPE, oldSupertype, supertype));
			}
		}
		return supertype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JClass basicGetSupertype() {
		return supertype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupertype(JClass newSupertype) {
		JClass oldSupertype = supertype;
		supertype = newSupertype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JCLASS__SUPERTYPE, oldSupertype, supertype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JPackage getPackage() {
		if (eContainerFeatureID() != PsmPackage.JCLASS__PACKAGE) return null;
		return (JPackage)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackage(JPackage newPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPackage, PsmPackage.JCLASS__PACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(JPackage newPackage) {
		if (newPackage != eInternalContainer() || (eContainerFeatureID() != PsmPackage.JCLASS__PACKAGE && newPackage != null)) {
			if (EcoreUtil.isAncestor(this, newPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPackage != null)
				msgs = ((InternalEObject)newPackage).eInverseAdd(this, PsmPackage.JPACKAGE__CLASSES, JPackage.class, msgs);
			msgs = basicSetPackage(newPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JCLASS__PACKAGE, newPackage, newPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JRole> getRoles() {
		if (roles == null) {
			roles = new EObjectWithInverseResolvingEList<JRole>(JRole.class, this, PsmPackage.JCLASS__ROLES, PsmPackage.JROLE__OWNER_CLASS);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JAttribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentWithInverseEList<JAttribute>(JAttribute.class, this, PsmPackage.JCLASS__ATTRIBUTES, PsmPackage.JATTRIBUTE__OWNER_CLASS);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBusinessSingleton() {
		return businessSingleton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessSingleton(boolean newBusinessSingleton) {
		boolean oldBusinessSingleton = businessSingleton;
		businessSingleton = newBusinessSingleton;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JCLASS__BUSINESS_SINGLETON, oldBusinessSingleton, businessSingleton));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JUIAlias> getAliases() {
		if (aliases == null) {
			aliases = new EObjectContainmentWithInverseEList<JUIAlias>(JUIAlias.class, this, PsmPackage.JCLASS__ALIASES, PsmPackage.JUI_ALIAS__OWNER_CLASS);
		}
		return aliases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWatched() {
		return watched;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWatched(boolean newWatched) {
		boolean oldWatched = watched;
		watched = newWatched;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JCLASS__WATCHED, oldWatched, watched));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRepresentsEnumValue() {
		return representsEnumValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentsEnumValue(boolean newRepresentsEnumValue) {
		boolean oldRepresentsEnumValue = representsEnumValue;
		representsEnumValue = newRepresentsEnumValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JCLASS__REPRESENTS_ENUM_VALUE, oldRepresentsEnumValue, representsEnumValue));
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
			case PsmPackage.JCLASS__STATE_MACHINES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStateMachines()).basicAdd(otherEnd, msgs);
			case PsmPackage.JCLASS__OPERATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperations()).basicAdd(otherEnd, msgs);
			case PsmPackage.JCLASS__FIXED_ENUM:
				if (fixedEnum != null)
					msgs = ((InternalEObject)fixedEnum).eInverseRemove(this, PsmPackage.JENUMERATION__CLASS_REPRESENTATION, JEnumeration.class, msgs);
				return basicSetFixedEnum((JEnumeration)otherEnd, msgs);
			case PsmPackage.JCLASS__PACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPackage((JPackage)otherEnd, msgs);
			case PsmPackage.JCLASS__ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRoles()).basicAdd(otherEnd, msgs);
			case PsmPackage.JCLASS__ATTRIBUTES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAttributes()).basicAdd(otherEnd, msgs);
			case PsmPackage.JCLASS__ALIASES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAliases()).basicAdd(otherEnd, msgs);
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
			case PsmPackage.JCLASS__STATE_MACHINES:
				return ((InternalEList<?>)getStateMachines()).basicRemove(otherEnd, msgs);
			case PsmPackage.JCLASS__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
			case PsmPackage.JCLASS__ATTRIBUTE_ORDER:
				return ((InternalEList<?>)getAttributeOrder()).basicRemove(otherEnd, msgs);
			case PsmPackage.JCLASS__FIXED_ENUM:
				return basicSetFixedEnum(null, msgs);
			case PsmPackage.JCLASS__PACKAGE:
				return basicSetPackage(null, msgs);
			case PsmPackage.JCLASS__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
			case PsmPackage.JCLASS__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case PsmPackage.JCLASS__ALIASES:
				return ((InternalEList<?>)getAliases()).basicRemove(otherEnd, msgs);
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
			case PsmPackage.JCLASS__PACKAGE:
				return eInternalContainer().eInverseRemove(this, PsmPackage.JPACKAGE__CLASSES, JPackage.class, msgs);
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
			case PsmPackage.JCLASS__ABSTRACT:
				return isAbstract();
			case PsmPackage.JCLASS__STATE_MACHINES:
				return getStateMachines();
			case PsmPackage.JCLASS__OPERATIONS:
				return getOperations();
			case PsmPackage.JCLASS__ATTRIBUTE_ORDER:
				return getAttributeOrder();
			case PsmPackage.JCLASS__ATTRIBUTES_FOR_LISTING:
				return getAttributesForListing();
			case PsmPackage.JCLASS__FIXED_ENUM:
				if (resolve) return getFixedEnum();
				return basicGetFixedEnum();
			case PsmPackage.JCLASS__REPRESENTS_TENANT:
				return isRepresentsTenant();
			case PsmPackage.JCLASS__TENANT_MEMBER:
				return isTenantMember();
			case PsmPackage.JCLASS__REPRESENTATION:
				if (resolve) return getRepresentation();
				return basicGetRepresentation();
			case PsmPackage.JCLASS__REPRESENTS_ENUM:
				return isRepresentsEnum();
			case PsmPackage.JCLASS__REPRESENTS_TENANT_USER:
				return isRepresentsTenantUser();
			case PsmPackage.JCLASS__REPRESENTS_USER:
				return isRepresentsUser();
			case PsmPackage.JCLASS__SUPERTYPE:
				if (resolve) return getSupertype();
				return basicGetSupertype();
			case PsmPackage.JCLASS__PACKAGE:
				return getPackage();
			case PsmPackage.JCLASS__ROLES:
				return getRoles();
			case PsmPackage.JCLASS__ATTRIBUTES:
				return getAttributes();
			case PsmPackage.JCLASS__BUSINESS_SINGLETON:
				return isBusinessSingleton();
			case PsmPackage.JCLASS__ALIASES:
				return getAliases();
			case PsmPackage.JCLASS__WATCHED:
				return isWatched();
			case PsmPackage.JCLASS__REPRESENTS_ENUM_VALUE:
				return isRepresentsEnumValue();
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
			case PsmPackage.JCLASS__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case PsmPackage.JCLASS__STATE_MACHINES:
				getStateMachines().clear();
				getStateMachines().addAll((Collection<? extends JStateMachine>)newValue);
				return;
			case PsmPackage.JCLASS__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends JOperation>)newValue);
				return;
			case PsmPackage.JCLASS__ATTRIBUTE_ORDER:
				getAttributeOrder().clear();
				getAttributeOrder().addAll((Collection<? extends JUIAttributeGroup>)newValue);
				return;
			case PsmPackage.JCLASS__ATTRIBUTES_FOR_LISTING:
				getAttributesForListing().clear();
				getAttributesForListing().addAll((Collection<? extends JAttribute>)newValue);
				return;
			case PsmPackage.JCLASS__FIXED_ENUM:
				setFixedEnum((JEnumeration)newValue);
				return;
			case PsmPackage.JCLASS__REPRESENTS_TENANT:
				setRepresentsTenant((Boolean)newValue);
				return;
			case PsmPackage.JCLASS__TENANT_MEMBER:
				setTenantMember((Boolean)newValue);
				return;
			case PsmPackage.JCLASS__REPRESENTATION:
				setRepresentation((JAttribute)newValue);
				return;
			case PsmPackage.JCLASS__REPRESENTS_ENUM:
				setRepresentsEnum((Boolean)newValue);
				return;
			case PsmPackage.JCLASS__REPRESENTS_TENANT_USER:
				setRepresentsTenantUser((Boolean)newValue);
				return;
			case PsmPackage.JCLASS__REPRESENTS_USER:
				setRepresentsUser((Boolean)newValue);
				return;
			case PsmPackage.JCLASS__SUPERTYPE:
				setSupertype((JClass)newValue);
				return;
			case PsmPackage.JCLASS__PACKAGE:
				setPackage((JPackage)newValue);
				return;
			case PsmPackage.JCLASS__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends JRole>)newValue);
				return;
			case PsmPackage.JCLASS__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends JAttribute>)newValue);
				return;
			case PsmPackage.JCLASS__BUSINESS_SINGLETON:
				setBusinessSingleton((Boolean)newValue);
				return;
			case PsmPackage.JCLASS__ALIASES:
				getAliases().clear();
				getAliases().addAll((Collection<? extends JUIAlias>)newValue);
				return;
			case PsmPackage.JCLASS__WATCHED:
				setWatched((Boolean)newValue);
				return;
			case PsmPackage.JCLASS__REPRESENTS_ENUM_VALUE:
				setRepresentsEnumValue((Boolean)newValue);
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
			case PsmPackage.JCLASS__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case PsmPackage.JCLASS__STATE_MACHINES:
				getStateMachines().clear();
				return;
			case PsmPackage.JCLASS__OPERATIONS:
				getOperations().clear();
				return;
			case PsmPackage.JCLASS__ATTRIBUTE_ORDER:
				getAttributeOrder().clear();
				return;
			case PsmPackage.JCLASS__ATTRIBUTES_FOR_LISTING:
				getAttributesForListing().clear();
				return;
			case PsmPackage.JCLASS__FIXED_ENUM:
				setFixedEnum((JEnumeration)null);
				return;
			case PsmPackage.JCLASS__REPRESENTS_TENANT:
				setRepresentsTenant(REPRESENTS_TENANT_EDEFAULT);
				return;
			case PsmPackage.JCLASS__TENANT_MEMBER:
				setTenantMember(TENANT_MEMBER_EDEFAULT);
				return;
			case PsmPackage.JCLASS__REPRESENTATION:
				setRepresentation((JAttribute)null);
				return;
			case PsmPackage.JCLASS__REPRESENTS_ENUM:
				setRepresentsEnum(REPRESENTS_ENUM_EDEFAULT);
				return;
			case PsmPackage.JCLASS__REPRESENTS_TENANT_USER:
				setRepresentsTenantUser(REPRESENTS_TENANT_USER_EDEFAULT);
				return;
			case PsmPackage.JCLASS__REPRESENTS_USER:
				setRepresentsUser(REPRESENTS_USER_EDEFAULT);
				return;
			case PsmPackage.JCLASS__SUPERTYPE:
				setSupertype((JClass)null);
				return;
			case PsmPackage.JCLASS__PACKAGE:
				setPackage((JPackage)null);
				return;
			case PsmPackage.JCLASS__ROLES:
				getRoles().clear();
				return;
			case PsmPackage.JCLASS__ATTRIBUTES:
				getAttributes().clear();
				return;
			case PsmPackage.JCLASS__BUSINESS_SINGLETON:
				setBusinessSingleton(BUSINESS_SINGLETON_EDEFAULT);
				return;
			case PsmPackage.JCLASS__ALIASES:
				getAliases().clear();
				return;
			case PsmPackage.JCLASS__WATCHED:
				setWatched(WATCHED_EDEFAULT);
				return;
			case PsmPackage.JCLASS__REPRESENTS_ENUM_VALUE:
				setRepresentsEnumValue(REPRESENTS_ENUM_VALUE_EDEFAULT);
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
			case PsmPackage.JCLASS__ABSTRACT:
				return abstract_ != ABSTRACT_EDEFAULT;
			case PsmPackage.JCLASS__STATE_MACHINES:
				return stateMachines != null && !stateMachines.isEmpty();
			case PsmPackage.JCLASS__OPERATIONS:
				return operations != null && !operations.isEmpty();
			case PsmPackage.JCLASS__ATTRIBUTE_ORDER:
				return attributeOrder != null && !attributeOrder.isEmpty();
			case PsmPackage.JCLASS__ATTRIBUTES_FOR_LISTING:
				return attributesForListing != null && !attributesForListing.isEmpty();
			case PsmPackage.JCLASS__FIXED_ENUM:
				return fixedEnum != null;
			case PsmPackage.JCLASS__REPRESENTS_TENANT:
				return representsTenant != REPRESENTS_TENANT_EDEFAULT;
			case PsmPackage.JCLASS__TENANT_MEMBER:
				return tenantMember != TENANT_MEMBER_EDEFAULT;
			case PsmPackage.JCLASS__REPRESENTATION:
				return representation != null;
			case PsmPackage.JCLASS__REPRESENTS_ENUM:
				return representsEnum != REPRESENTS_ENUM_EDEFAULT;
			case PsmPackage.JCLASS__REPRESENTS_TENANT_USER:
				return representsTenantUser != REPRESENTS_TENANT_USER_EDEFAULT;
			case PsmPackage.JCLASS__REPRESENTS_USER:
				return representsUser != REPRESENTS_USER_EDEFAULT;
			case PsmPackage.JCLASS__SUPERTYPE:
				return supertype != null;
			case PsmPackage.JCLASS__PACKAGE:
				return getPackage() != null;
			case PsmPackage.JCLASS__ROLES:
				return roles != null && !roles.isEmpty();
			case PsmPackage.JCLASS__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case PsmPackage.JCLASS__BUSINESS_SINGLETON:
				return businessSingleton != BUSINESS_SINGLETON_EDEFAULT;
			case PsmPackage.JCLASS__ALIASES:
				return aliases != null && !aliases.isEmpty();
			case PsmPackage.JCLASS__WATCHED:
				return watched != WATCHED_EDEFAULT;
			case PsmPackage.JCLASS__REPRESENTS_ENUM_VALUE:
				return representsEnumValue != REPRESENTS_ENUM_VALUE_EDEFAULT;
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
		result.append(" (abstract: ");
		result.append(abstract_);
		result.append(", representsTenant: ");
		result.append(representsTenant);
		result.append(", tenantMember: ");
		result.append(tenantMember);
		result.append(", representsEnum: ");
		result.append(representsEnum);
		result.append(", representsTenantUser: ");
		result.append(representsTenantUser);
		result.append(", representsUser: ");
		result.append(representsUser);
		result.append(", businessSingleton: ");
		result.append(businessSingleton);
		result.append(", watched: ");
		result.append(watched);
		result.append(", representsEnumValue: ");
		result.append(representsEnumValue);
		result.append(')');
		return result.toString();
	}

} //JClassImpl
