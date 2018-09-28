/**
 */
package psm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import psm.JAttribute;
import psm.JClass;
import psm.PsmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JAttribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link psm.impl.JAttributeImpl#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link psm.impl.JAttributeImpl#getRegexp <em>Regexp</em>}</li>
 *   <li>{@link psm.impl.JAttributeImpl#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link psm.impl.JAttributeImpl#getDecimals <em>Decimals</em>}</li>
 *   <li>{@link psm.impl.JAttributeImpl#getInterval <em>Interval</em>}</li>
 *   <li>{@link psm.impl.JAttributeImpl#isTechnical <em>Technical</em>}</li>
 *   <li>{@link psm.impl.JAttributeImpl#getOwnerClass <em>Owner Class</em>}</li>
 *   <li>{@link psm.impl.JAttributeImpl#isUiNoSearch <em>Ui No Search</em>}</li>
 *   <li>{@link psm.impl.JAttributeImpl#isWatched <em>Watched</em>}</li>
 *   <li>{@link psm.impl.JAttributeImpl#isRepresentsId <em>Represents Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JAttributeImpl extends JTypedElementImpl implements JAttribute {
	/**
	 * The default value of the '{@link #getPlaceholder() <em>Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceholder()
	 * @generated
	 * @ordered
	 */
	protected static final String PLACEHOLDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlaceholder() <em>Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceholder()
	 * @generated
	 * @ordered
	 */
	protected String placeholder = PLACEHOLDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegexp() <em>Regexp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegexp()
	 * @generated
	 * @ordered
	 */
	protected static final String REGEXP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegexp() <em>Regexp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegexp()
	 * @generated
	 * @ordered
	 */
	protected String regexp = REGEXP_EDEFAULT;

	/**
	 * The default value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMandatory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANDATORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMandatory()
	 * @generated
	 * @ordered
	 */
	protected boolean mandatory = MANDATORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDecimals() <em>Decimals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimals()
	 * @generated
	 * @ordered
	 */
	protected static final int DECIMALS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDecimals() <em>Decimals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimals()
	 * @generated
	 * @ordered
	 */
	protected int decimals = DECIMALS_EDEFAULT;

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
	 * The default value of the '{@link #isTechnical() <em>Technical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTechnical()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TECHNICAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTechnical() <em>Technical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTechnical()
	 * @generated
	 * @ordered
	 */
	protected boolean technical = TECHNICAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isUiNoSearch() <em>Ui No Search</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUiNoSearch()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UI_NO_SEARCH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUiNoSearch() <em>Ui No Search</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUiNoSearch()
	 * @generated
	 * @ordered
	 */
	protected boolean uiNoSearch = UI_NO_SEARCH_EDEFAULT;

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
	 * The default value of the '{@link #isRepresentsId() <em>Represents Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRepresentsId()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REPRESENTS_ID_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRepresentsId() <em>Represents Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRepresentsId()
	 * @generated
	 * @ordered
	 */
	protected boolean representsId = REPRESENTS_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PsmPackage.Literals.JATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlaceholder() {
		return placeholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlaceholder(String newPlaceholder) {
		String oldPlaceholder = placeholder;
		placeholder = newPlaceholder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JATTRIBUTE__PLACEHOLDER, oldPlaceholder, placeholder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegexp() {
		return regexp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegexp(String newRegexp) {
		String oldRegexp = regexp;
		regexp = newRegexp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JATTRIBUTE__REGEXP, oldRegexp, regexp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMandatory() {
		return mandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMandatory(boolean newMandatory) {
		boolean oldMandatory = mandatory;
		mandatory = newMandatory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JATTRIBUTE__MANDATORY, oldMandatory, mandatory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDecimals() {
		return decimals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecimals(int newDecimals) {
		int oldDecimals = decimals;
		decimals = newDecimals;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JATTRIBUTE__DECIMALS, oldDecimals, decimals));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JATTRIBUTE__INTERVAL, oldInterval, interval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTechnical() {
		return technical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTechnical(boolean newTechnical) {
		boolean oldTechnical = technical;
		technical = newTechnical;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JATTRIBUTE__TECHNICAL, oldTechnical, technical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JClass getOwnerClass() {
		if (eContainerFeatureID() != PsmPackage.JATTRIBUTE__OWNER_CLASS) return null;
		return (JClass)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnerClass(JClass newOwnerClass, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnerClass, PsmPackage.JATTRIBUTE__OWNER_CLASS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerClass(JClass newOwnerClass) {
		if (newOwnerClass != eInternalContainer() || (eContainerFeatureID() != PsmPackage.JATTRIBUTE__OWNER_CLASS && newOwnerClass != null)) {
			if (EcoreUtil.isAncestor(this, newOwnerClass))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnerClass != null)
				msgs = ((InternalEObject)newOwnerClass).eInverseAdd(this, PsmPackage.JCLASS__ATTRIBUTES, JClass.class, msgs);
			msgs = basicSetOwnerClass(newOwnerClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JATTRIBUTE__OWNER_CLASS, newOwnerClass, newOwnerClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUiNoSearch() {
		return uiNoSearch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUiNoSearch(boolean newUiNoSearch) {
		boolean oldUiNoSearch = uiNoSearch;
		uiNoSearch = newUiNoSearch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JATTRIBUTE__UI_NO_SEARCH, oldUiNoSearch, uiNoSearch));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JATTRIBUTE__WATCHED, oldWatched, watched));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRepresentsId() {
		return representsId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentsId(boolean newRepresentsId) {
		boolean oldRepresentsId = representsId;
		representsId = newRepresentsId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JATTRIBUTE__REPRESENTS_ID, oldRepresentsId, representsId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PsmPackage.JATTRIBUTE__OWNER_CLASS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
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
			case PsmPackage.JATTRIBUTE__OWNER_CLASS:
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
			case PsmPackage.JATTRIBUTE__OWNER_CLASS:
				return eInternalContainer().eInverseRemove(this, PsmPackage.JCLASS__ATTRIBUTES, JClass.class, msgs);
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
			case PsmPackage.JATTRIBUTE__PLACEHOLDER:
				return getPlaceholder();
			case PsmPackage.JATTRIBUTE__REGEXP:
				return getRegexp();
			case PsmPackage.JATTRIBUTE__MANDATORY:
				return isMandatory();
			case PsmPackage.JATTRIBUTE__DECIMALS:
				return getDecimals();
			case PsmPackage.JATTRIBUTE__INTERVAL:
				return getInterval();
			case PsmPackage.JATTRIBUTE__TECHNICAL:
				return isTechnical();
			case PsmPackage.JATTRIBUTE__OWNER_CLASS:
				return getOwnerClass();
			case PsmPackage.JATTRIBUTE__UI_NO_SEARCH:
				return isUiNoSearch();
			case PsmPackage.JATTRIBUTE__WATCHED:
				return isWatched();
			case PsmPackage.JATTRIBUTE__REPRESENTS_ID:
				return isRepresentsId();
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
			case PsmPackage.JATTRIBUTE__PLACEHOLDER:
				setPlaceholder((String)newValue);
				return;
			case PsmPackage.JATTRIBUTE__REGEXP:
				setRegexp((String)newValue);
				return;
			case PsmPackage.JATTRIBUTE__MANDATORY:
				setMandatory((Boolean)newValue);
				return;
			case PsmPackage.JATTRIBUTE__DECIMALS:
				setDecimals((Integer)newValue);
				return;
			case PsmPackage.JATTRIBUTE__INTERVAL:
				setInterval((String)newValue);
				return;
			case PsmPackage.JATTRIBUTE__TECHNICAL:
				setTechnical((Boolean)newValue);
				return;
			case PsmPackage.JATTRIBUTE__OWNER_CLASS:
				setOwnerClass((JClass)newValue);
				return;
			case PsmPackage.JATTRIBUTE__UI_NO_SEARCH:
				setUiNoSearch((Boolean)newValue);
				return;
			case PsmPackage.JATTRIBUTE__WATCHED:
				setWatched((Boolean)newValue);
				return;
			case PsmPackage.JATTRIBUTE__REPRESENTS_ID:
				setRepresentsId((Boolean)newValue);
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
			case PsmPackage.JATTRIBUTE__PLACEHOLDER:
				setPlaceholder(PLACEHOLDER_EDEFAULT);
				return;
			case PsmPackage.JATTRIBUTE__REGEXP:
				setRegexp(REGEXP_EDEFAULT);
				return;
			case PsmPackage.JATTRIBUTE__MANDATORY:
				setMandatory(MANDATORY_EDEFAULT);
				return;
			case PsmPackage.JATTRIBUTE__DECIMALS:
				setDecimals(DECIMALS_EDEFAULT);
				return;
			case PsmPackage.JATTRIBUTE__INTERVAL:
				setInterval(INTERVAL_EDEFAULT);
				return;
			case PsmPackage.JATTRIBUTE__TECHNICAL:
				setTechnical(TECHNICAL_EDEFAULT);
				return;
			case PsmPackage.JATTRIBUTE__OWNER_CLASS:
				setOwnerClass((JClass)null);
				return;
			case PsmPackage.JATTRIBUTE__UI_NO_SEARCH:
				setUiNoSearch(UI_NO_SEARCH_EDEFAULT);
				return;
			case PsmPackage.JATTRIBUTE__WATCHED:
				setWatched(WATCHED_EDEFAULT);
				return;
			case PsmPackage.JATTRIBUTE__REPRESENTS_ID:
				setRepresentsId(REPRESENTS_ID_EDEFAULT);
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
			case PsmPackage.JATTRIBUTE__PLACEHOLDER:
				return PLACEHOLDER_EDEFAULT == null ? placeholder != null : !PLACEHOLDER_EDEFAULT.equals(placeholder);
			case PsmPackage.JATTRIBUTE__REGEXP:
				return REGEXP_EDEFAULT == null ? regexp != null : !REGEXP_EDEFAULT.equals(regexp);
			case PsmPackage.JATTRIBUTE__MANDATORY:
				return mandatory != MANDATORY_EDEFAULT;
			case PsmPackage.JATTRIBUTE__DECIMALS:
				return decimals != DECIMALS_EDEFAULT;
			case PsmPackage.JATTRIBUTE__INTERVAL:
				return INTERVAL_EDEFAULT == null ? interval != null : !INTERVAL_EDEFAULT.equals(interval);
			case PsmPackage.JATTRIBUTE__TECHNICAL:
				return technical != TECHNICAL_EDEFAULT;
			case PsmPackage.JATTRIBUTE__OWNER_CLASS:
				return getOwnerClass() != null;
			case PsmPackage.JATTRIBUTE__UI_NO_SEARCH:
				return uiNoSearch != UI_NO_SEARCH_EDEFAULT;
			case PsmPackage.JATTRIBUTE__WATCHED:
				return watched != WATCHED_EDEFAULT;
			case PsmPackage.JATTRIBUTE__REPRESENTS_ID:
				return representsId != REPRESENTS_ID_EDEFAULT;
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
		result.append(" (placeholder: ");
		result.append(placeholder);
		result.append(", regexp: ");
		result.append(regexp);
		result.append(", mandatory: ");
		result.append(mandatory);
		result.append(", decimals: ");
		result.append(decimals);
		result.append(", interval: ");
		result.append(interval);
		result.append(", technical: ");
		result.append(technical);
		result.append(", uiNoSearch: ");
		result.append(uiNoSearch);
		result.append(", watched: ");
		result.append(watched);
		result.append(", representsId: ");
		result.append(representsId);
		result.append(')');
		return result.toString();
	}

} //JAttributeImpl
