/**
 */
package psm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import psm.JAssociationKind;
import psm.JClass;
import psm.JRelationship;
import psm.JRole;
import psm.PsmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JRole</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link psm.impl.JRoleImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link psm.impl.JRoleImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link psm.impl.JRoleImpl#isNavigable <em>Navigable</em>}</li>
 *   <li>{@link psm.impl.JRoleImpl#isUnique <em>Unique</em>}</li>
 *   <li>{@link psm.impl.JRoleImpl#isOrdered <em>Ordered</em>}</li>
 *   <li>{@link psm.impl.JRoleImpl#getOwnerRelationship <em>Owner Relationship</em>}</li>
 *   <li>{@link psm.impl.JRoleImpl#getDerivedExpression <em>Derived Expression</em>}</li>
 *   <li>{@link psm.impl.JRoleImpl#getDerivedDescription <em>Derived Description</em>}</li>
 *   <li>{@link psm.impl.JRoleImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link psm.impl.JRoleImpl#getOptionScript <em>Option Script</em>}</li>
 *   <li>{@link psm.impl.JRoleImpl#getOwnerClass <em>Owner Class</em>}</li>
 *   <li>{@link psm.impl.JRoleImpl#getValue <em>Value</em>}</li>
 *   <li>{@link psm.impl.JRoleImpl#isCalculated <em>Calculated</em>}</li>
 *   <li>{@link psm.impl.JRoleImpl#getInterval <em>Interval</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JRoleImpl extends JElementImpl implements JRole {
	/**
	 * The default value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected int lower = LOWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected static final int UPPER_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected int upper = UPPER_EDEFAULT;

	/**
	 * The default value of the '{@link #isNavigable() <em>Navigable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNavigable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NAVIGABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNavigable() <em>Navigable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNavigable()
	 * @generated
	 * @ordered
	 */
	protected boolean navigable = NAVIGABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean unique = UNIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isOrdered() <em>Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ORDERED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isOrdered() <em>Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrdered()
	 * @generated
	 * @ordered
	 */
	protected boolean ordered = ORDERED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDerivedExpression() <em>Derived Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String DERIVED_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDerivedExpression() <em>Derived Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedExpression()
	 * @generated
	 * @ordered
	 */
	protected String derivedExpression = DERIVED_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDerivedDescription() <em>Derived Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DERIVED_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDerivedDescription() <em>Derived Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedDescription()
	 * @generated
	 * @ordered
	 */
	protected String derivedDescription = DERIVED_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final JAssociationKind KIND_EDEFAULT = JAssociationKind.ASSOCIATION;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected JAssociationKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getOptionScript() <em>Option Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionScript()
	 * @generated
	 * @ordered
	 */
	protected static final String OPTION_SCRIPT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOptionScript() <em>Option Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionScript()
	 * @generated
	 * @ordered
	 */
	protected String optionScript = OPTION_SCRIPT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnerClass() <em>Owner Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnerClass()
	 * @generated
	 * @ordered
	 */
	protected JClass ownerClass;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isCalculated() <em>Calculated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCalculated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CALCULATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCalculated() <em>Calculated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCalculated()
	 * @generated
	 * @ordered
	 */
	protected boolean calculated = CALCULATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterval() <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterval()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterval() <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterval()
	 * @generated
	 * @ordered
	 */
	protected String interval = INTERVAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PsmPackage.Literals.JROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLower() {
		return lower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLower(int newLower) {
		int oldLower = lower;
		lower = newLower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JROLE__LOWER, oldLower, lower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUpper() {
		return upper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpper(int newUpper) {
		int oldUpper = upper;
		upper = newUpper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JROLE__UPPER, oldUpper, upper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNavigable() {
		return navigable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNavigable(boolean newNavigable) {
		boolean oldNavigable = navigable;
		navigable = newNavigable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JROLE__NAVIGABLE, oldNavigable, navigable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnique() {
		return unique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnique(boolean newUnique) {
		boolean oldUnique = unique;
		unique = newUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JROLE__UNIQUE, oldUnique, unique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOrdered() {
		return ordered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrdered(boolean newOrdered) {
		boolean oldOrdered = ordered;
		ordered = newOrdered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JROLE__ORDERED, oldOrdered, ordered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JRelationship getOwnerRelationship() {
		if (eContainerFeatureID() != PsmPackage.JROLE__OWNER_RELATIONSHIP) return null;
		return (JRelationship)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnerRelationship(JRelationship newOwnerRelationship, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnerRelationship, PsmPackage.JROLE__OWNER_RELATIONSHIP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerRelationship(JRelationship newOwnerRelationship) {
		if (newOwnerRelationship != eInternalContainer() || (eContainerFeatureID() != PsmPackage.JROLE__OWNER_RELATIONSHIP && newOwnerRelationship != null)) {
			if (EcoreUtil.isAncestor(this, newOwnerRelationship))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnerRelationship != null)
				msgs = ((InternalEObject)newOwnerRelationship).eInverseAdd(this, PsmPackage.JRELATIONSHIP__ROLES, JRelationship.class, msgs);
			msgs = basicSetOwnerRelationship(newOwnerRelationship, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JROLE__OWNER_RELATIONSHIP, newOwnerRelationship, newOwnerRelationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDerivedExpression() {
		return derivedExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivedExpression(String newDerivedExpression) {
		String oldDerivedExpression = derivedExpression;
		derivedExpression = newDerivedExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JROLE__DERIVED_EXPRESSION, oldDerivedExpression, derivedExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDerivedDescription() {
		return derivedDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivedDescription(String newDerivedDescription) {
		String oldDerivedDescription = derivedDescription;
		derivedDescription = newDerivedDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JROLE__DERIVED_DESCRIPTION, oldDerivedDescription, derivedDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JAssociationKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(JAssociationKind newKind) {
		JAssociationKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JROLE__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOptionScript() {
		return optionScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptionScript(String newOptionScript) {
		String oldOptionScript = optionScript;
		optionScript = newOptionScript;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JROLE__OPTION_SCRIPT, oldOptionScript, optionScript));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JClass getOwnerClass() {
		if (ownerClass != null && ownerClass.eIsProxy()) {
			InternalEObject oldOwnerClass = (InternalEObject)ownerClass;
			ownerClass = (JClass)eResolveProxy(oldOwnerClass);
			if (ownerClass != oldOwnerClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PsmPackage.JROLE__OWNER_CLASS, oldOwnerClass, ownerClass));
			}
		}
		return ownerClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JClass basicGetOwnerClass() {
		return ownerClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnerClass(JClass newOwnerClass, NotificationChain msgs) {
		JClass oldOwnerClass = ownerClass;
		ownerClass = newOwnerClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PsmPackage.JROLE__OWNER_CLASS, oldOwnerClass, newOwnerClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerClass(JClass newOwnerClass) {
		if (newOwnerClass != ownerClass) {
			NotificationChain msgs = null;
			if (ownerClass != null)
				msgs = ((InternalEObject)ownerClass).eInverseRemove(this, PsmPackage.JCLASS__ROLES, JClass.class, msgs);
			if (newOwnerClass != null)
				msgs = ((InternalEObject)newOwnerClass).eInverseAdd(this, PsmPackage.JCLASS__ROLES, JClass.class, msgs);
			msgs = basicSetOwnerClass(newOwnerClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JROLE__OWNER_CLASS, newOwnerClass, newOwnerClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JROLE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCalculated() {
		return calculated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalculated(boolean newCalculated) {
		boolean oldCalculated = calculated;
		calculated = newCalculated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JROLE__CALCULATED, oldCalculated, calculated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInterval() {
		return interval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterval(String newInterval) {
		String oldInterval = interval;
		interval = newInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JROLE__INTERVAL, oldInterval, interval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PsmPackage.JROLE__OWNER_RELATIONSHIP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnerRelationship((JRelationship)otherEnd, msgs);
			case PsmPackage.JROLE__OWNER_CLASS:
				if (ownerClass != null)
					msgs = ((InternalEObject)ownerClass).eInverseRemove(this, PsmPackage.JCLASS__ROLES, JClass.class, msgs);
				return basicSetOwnerClass((JClass)otherEnd, msgs);
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
			case PsmPackage.JROLE__OWNER_RELATIONSHIP:
				return basicSetOwnerRelationship(null, msgs);
			case PsmPackage.JROLE__OWNER_CLASS:
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
			case PsmPackage.JROLE__OWNER_RELATIONSHIP:
				return eInternalContainer().eInverseRemove(this, PsmPackage.JRELATIONSHIP__ROLES, JRelationship.class, msgs);
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
			case PsmPackage.JROLE__LOWER:
				return getLower();
			case PsmPackage.JROLE__UPPER:
				return getUpper();
			case PsmPackage.JROLE__NAVIGABLE:
				return isNavigable();
			case PsmPackage.JROLE__UNIQUE:
				return isUnique();
			case PsmPackage.JROLE__ORDERED:
				return isOrdered();
			case PsmPackage.JROLE__OWNER_RELATIONSHIP:
				return getOwnerRelationship();
			case PsmPackage.JROLE__DERIVED_EXPRESSION:
				return getDerivedExpression();
			case PsmPackage.JROLE__DERIVED_DESCRIPTION:
				return getDerivedDescription();
			case PsmPackage.JROLE__KIND:
				return getKind();
			case PsmPackage.JROLE__OPTION_SCRIPT:
				return getOptionScript();
			case PsmPackage.JROLE__OWNER_CLASS:
				if (resolve) return getOwnerClass();
				return basicGetOwnerClass();
			case PsmPackage.JROLE__VALUE:
				return getValue();
			case PsmPackage.JROLE__CALCULATED:
				return isCalculated();
			case PsmPackage.JROLE__INTERVAL:
				return getInterval();
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
			case PsmPackage.JROLE__LOWER:
				setLower((Integer)newValue);
				return;
			case PsmPackage.JROLE__UPPER:
				setUpper((Integer)newValue);
				return;
			case PsmPackage.JROLE__NAVIGABLE:
				setNavigable((Boolean)newValue);
				return;
			case PsmPackage.JROLE__UNIQUE:
				setUnique((Boolean)newValue);
				return;
			case PsmPackage.JROLE__ORDERED:
				setOrdered((Boolean)newValue);
				return;
			case PsmPackage.JROLE__OWNER_RELATIONSHIP:
				setOwnerRelationship((JRelationship)newValue);
				return;
			case PsmPackage.JROLE__DERIVED_EXPRESSION:
				setDerivedExpression((String)newValue);
				return;
			case PsmPackage.JROLE__DERIVED_DESCRIPTION:
				setDerivedDescription((String)newValue);
				return;
			case PsmPackage.JROLE__KIND:
				setKind((JAssociationKind)newValue);
				return;
			case PsmPackage.JROLE__OPTION_SCRIPT:
				setOptionScript((String)newValue);
				return;
			case PsmPackage.JROLE__OWNER_CLASS:
				setOwnerClass((JClass)newValue);
				return;
			case PsmPackage.JROLE__VALUE:
				setValue((String)newValue);
				return;
			case PsmPackage.JROLE__CALCULATED:
				setCalculated((Boolean)newValue);
				return;
			case PsmPackage.JROLE__INTERVAL:
				setInterval((String)newValue);
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
			case PsmPackage.JROLE__LOWER:
				setLower(LOWER_EDEFAULT);
				return;
			case PsmPackage.JROLE__UPPER:
				setUpper(UPPER_EDEFAULT);
				return;
			case PsmPackage.JROLE__NAVIGABLE:
				setNavigable(NAVIGABLE_EDEFAULT);
				return;
			case PsmPackage.JROLE__UNIQUE:
				setUnique(UNIQUE_EDEFAULT);
				return;
			case PsmPackage.JROLE__ORDERED:
				setOrdered(ORDERED_EDEFAULT);
				return;
			case PsmPackage.JROLE__OWNER_RELATIONSHIP:
				setOwnerRelationship((JRelationship)null);
				return;
			case PsmPackage.JROLE__DERIVED_EXPRESSION:
				setDerivedExpression(DERIVED_EXPRESSION_EDEFAULT);
				return;
			case PsmPackage.JROLE__DERIVED_DESCRIPTION:
				setDerivedDescription(DERIVED_DESCRIPTION_EDEFAULT);
				return;
			case PsmPackage.JROLE__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case PsmPackage.JROLE__OPTION_SCRIPT:
				setOptionScript(OPTION_SCRIPT_EDEFAULT);
				return;
			case PsmPackage.JROLE__OWNER_CLASS:
				setOwnerClass((JClass)null);
				return;
			case PsmPackage.JROLE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case PsmPackage.JROLE__CALCULATED:
				setCalculated(CALCULATED_EDEFAULT);
				return;
			case PsmPackage.JROLE__INTERVAL:
				setInterval(INTERVAL_EDEFAULT);
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
			case PsmPackage.JROLE__LOWER:
				return lower != LOWER_EDEFAULT;
			case PsmPackage.JROLE__UPPER:
				return upper != UPPER_EDEFAULT;
			case PsmPackage.JROLE__NAVIGABLE:
				return navigable != NAVIGABLE_EDEFAULT;
			case PsmPackage.JROLE__UNIQUE:
				return unique != UNIQUE_EDEFAULT;
			case PsmPackage.JROLE__ORDERED:
				return ordered != ORDERED_EDEFAULT;
			case PsmPackage.JROLE__OWNER_RELATIONSHIP:
				return getOwnerRelationship() != null;
			case PsmPackage.JROLE__DERIVED_EXPRESSION:
				return DERIVED_EXPRESSION_EDEFAULT == null ? derivedExpression != null : !DERIVED_EXPRESSION_EDEFAULT.equals(derivedExpression);
			case PsmPackage.JROLE__DERIVED_DESCRIPTION:
				return DERIVED_DESCRIPTION_EDEFAULT == null ? derivedDescription != null : !DERIVED_DESCRIPTION_EDEFAULT.equals(derivedDescription);
			case PsmPackage.JROLE__KIND:
				return kind != KIND_EDEFAULT;
			case PsmPackage.JROLE__OPTION_SCRIPT:
				return OPTION_SCRIPT_EDEFAULT == null ? optionScript != null : !OPTION_SCRIPT_EDEFAULT.equals(optionScript);
			case PsmPackage.JROLE__OWNER_CLASS:
				return ownerClass != null;
			case PsmPackage.JROLE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case PsmPackage.JROLE__CALCULATED:
				return calculated != CALCULATED_EDEFAULT;
			case PsmPackage.JROLE__INTERVAL:
				return INTERVAL_EDEFAULT == null ? interval != null : !INTERVAL_EDEFAULT.equals(interval);
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
		result.append(" (lower: ");
		result.append(lower);
		result.append(", upper: ");
		result.append(upper);
		result.append(", navigable: ");
		result.append(navigable);
		result.append(", unique: ");
		result.append(unique);
		result.append(", ordered: ");
		result.append(ordered);
		result.append(", derivedExpression: ");
		result.append(derivedExpression);
		result.append(", derivedDescription: ");
		result.append(derivedDescription);
		result.append(", kind: ");
		result.append(kind);
		result.append(", optionScript: ");
		result.append(optionScript);
		result.append(", value: ");
		result.append(value);
		result.append(", calculated: ");
		result.append(calculated);
		result.append(", interval: ");
		result.append(interval);
		result.append(')');
		return result.toString();
	}

} //JRoleImpl
