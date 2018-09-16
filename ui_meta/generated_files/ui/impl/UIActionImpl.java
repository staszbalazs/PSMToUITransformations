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

import ui.UIAction;
import ui.UIParamView;
import ui.UIParameterComponentType;
import ui.UIResultView;
import ui.UiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ui.impl.UIActionImpl#getParamView <em>Param View</em>}</li>
 *   <li>{@link ui.impl.UIActionImpl#isInherited <em>Inherited</em>}</li>
 *   <li>{@link ui.impl.UIActionImpl#isClassBased <em>Class Based</em>}</li>
 *   <li>{@link ui.impl.UIActionImpl#isToBeConfirmed <em>To Be Confirmed</em>}</li>
 *   <li>{@link ui.impl.UIActionImpl#isNotBulk <em>Not Bulk</em>}</li>
 *   <li>{@link ui.impl.UIActionImpl#isIsQuery <em>Is Query</em>}</li>
 *   <li>{@link ui.impl.UIActionImpl#getResultView <em>Result View</em>}</li>
 *   <li>{@link ui.impl.UIActionImpl#getResult <em>Result</em>}</li>
 *   <li>{@link ui.impl.UIActionImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UIActionImpl extends IdentifiableImpl implements UIAction {
	/**
	 * The cached value of the '{@link #getParamView() <em>Param View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamView()
	 * @generated
	 * @ordered
	 */
	protected UIParamView paramView;

	/**
	 * The default value of the '{@link #isInherited() <em>Inherited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInherited()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INHERITED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInherited() <em>Inherited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInherited()
	 * @generated
	 * @ordered
	 */
	protected boolean inherited = INHERITED_EDEFAULT;

	/**
	 * The default value of the '{@link #isClassBased() <em>Class Based</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClassBased()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CLASS_BASED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isClassBased() <em>Class Based</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClassBased()
	 * @generated
	 * @ordered
	 */
	protected boolean classBased = CLASS_BASED_EDEFAULT;

	/**
	 * The default value of the '{@link #isToBeConfirmed() <em>To Be Confirmed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isToBeConfirmed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TO_BE_CONFIRMED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isToBeConfirmed() <em>To Be Confirmed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isToBeConfirmed()
	 * @generated
	 * @ordered
	 */
	protected boolean toBeConfirmed = TO_BE_CONFIRMED_EDEFAULT;

	/**
	 * The default value of the '{@link #isNotBulk() <em>Not Bulk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNotBulk()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NOT_BULK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNotBulk() <em>Not Bulk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNotBulk()
	 * @generated
	 * @ordered
	 */
	protected boolean notBulk = NOT_BULK_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsQuery() <em>Is Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsQuery()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_QUERY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsQuery() <em>Is Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsQuery()
	 * @generated
	 * @ordered
	 */
	protected boolean isQuery = IS_QUERY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResultView() <em>Result View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultView()
	 * @generated
	 * @ordered
	 */
	protected UIResultView resultView;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected UIParameterComponentType result;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<UIParameterComponentType> parameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UIActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiPackage.Literals.UI_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIParamView getParamView() {
		return paramView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParamView(UIParamView newParamView, NotificationChain msgs) {
		UIParamView oldParamView = paramView;
		paramView = newParamView;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiPackage.UI_ACTION__PARAM_VIEW, oldParamView, newParamView);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParamView(UIParamView newParamView) {
		if (newParamView != paramView) {
			NotificationChain msgs = null;
			if (paramView != null)
				msgs = ((InternalEObject)paramView).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiPackage.UI_ACTION__PARAM_VIEW, null, msgs);
			if (newParamView != null)
				msgs = ((InternalEObject)newParamView).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiPackage.UI_ACTION__PARAM_VIEW, null, msgs);
			msgs = basicSetParamView(newParamView, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI_ACTION__PARAM_VIEW, newParamView, newParamView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInherited() {
		return inherited;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInherited(boolean newInherited) {
		boolean oldInherited = inherited;
		inherited = newInherited;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI_ACTION__INHERITED, oldInherited, inherited));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isClassBased() {
		return classBased;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassBased(boolean newClassBased) {
		boolean oldClassBased = classBased;
		classBased = newClassBased;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI_ACTION__CLASS_BASED, oldClassBased, classBased));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isToBeConfirmed() {
		return toBeConfirmed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToBeConfirmed(boolean newToBeConfirmed) {
		boolean oldToBeConfirmed = toBeConfirmed;
		toBeConfirmed = newToBeConfirmed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI_ACTION__TO_BE_CONFIRMED, oldToBeConfirmed, toBeConfirmed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNotBulk() {
		return notBulk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotBulk(boolean newNotBulk) {
		boolean oldNotBulk = notBulk;
		notBulk = newNotBulk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI_ACTION__NOT_BULK, oldNotBulk, notBulk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsQuery() {
		return isQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsQuery(boolean newIsQuery) {
		boolean oldIsQuery = isQuery;
		isQuery = newIsQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI_ACTION__IS_QUERY, oldIsQuery, isQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIResultView getResultView() {
		return resultView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResultView(UIResultView newResultView, NotificationChain msgs) {
		UIResultView oldResultView = resultView;
		resultView = newResultView;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiPackage.UI_ACTION__RESULT_VIEW, oldResultView, newResultView);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultView(UIResultView newResultView) {
		if (newResultView != resultView) {
			NotificationChain msgs = null;
			if (resultView != null)
				msgs = ((InternalEObject)resultView).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiPackage.UI_ACTION__RESULT_VIEW, null, msgs);
			if (newResultView != null)
				msgs = ((InternalEObject)newResultView).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiPackage.UI_ACTION__RESULT_VIEW, null, msgs);
			msgs = basicSetResultView(newResultView, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI_ACTION__RESULT_VIEW, newResultView, newResultView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIParameterComponentType getResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResult(UIParameterComponentType newResult, NotificationChain msgs) {
		UIParameterComponentType oldResult = result;
		result = newResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiPackage.UI_ACTION__RESULT, oldResult, newResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResult(UIParameterComponentType newResult) {
		if (newResult != result) {
			NotificationChain msgs = null;
			if (result != null)
				msgs = ((InternalEObject)result).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiPackage.UI_ACTION__RESULT, null, msgs);
			if (newResult != null)
				msgs = ((InternalEObject)newResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiPackage.UI_ACTION__RESULT, null, msgs);
			msgs = basicSetResult(newResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI_ACTION__RESULT, newResult, newResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UIParameterComponentType> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<UIParameterComponentType>(UIParameterComponentType.class, this, UiPackage.UI_ACTION__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiPackage.UI_ACTION__PARAM_VIEW:
				return basicSetParamView(null, msgs);
			case UiPackage.UI_ACTION__RESULT_VIEW:
				return basicSetResultView(null, msgs);
			case UiPackage.UI_ACTION__RESULT:
				return basicSetResult(null, msgs);
			case UiPackage.UI_ACTION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
			case UiPackage.UI_ACTION__PARAM_VIEW:
				return getParamView();
			case UiPackage.UI_ACTION__INHERITED:
				return isInherited();
			case UiPackage.UI_ACTION__CLASS_BASED:
				return isClassBased();
			case UiPackage.UI_ACTION__TO_BE_CONFIRMED:
				return isToBeConfirmed();
			case UiPackage.UI_ACTION__NOT_BULK:
				return isNotBulk();
			case UiPackage.UI_ACTION__IS_QUERY:
				return isIsQuery();
			case UiPackage.UI_ACTION__RESULT_VIEW:
				return getResultView();
			case UiPackage.UI_ACTION__RESULT:
				return getResult();
			case UiPackage.UI_ACTION__PARAMETERS:
				return getParameters();
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
			case UiPackage.UI_ACTION__PARAM_VIEW:
				setParamView((UIParamView)newValue);
				return;
			case UiPackage.UI_ACTION__INHERITED:
				setInherited((Boolean)newValue);
				return;
			case UiPackage.UI_ACTION__CLASS_BASED:
				setClassBased((Boolean)newValue);
				return;
			case UiPackage.UI_ACTION__TO_BE_CONFIRMED:
				setToBeConfirmed((Boolean)newValue);
				return;
			case UiPackage.UI_ACTION__NOT_BULK:
				setNotBulk((Boolean)newValue);
				return;
			case UiPackage.UI_ACTION__IS_QUERY:
				setIsQuery((Boolean)newValue);
				return;
			case UiPackage.UI_ACTION__RESULT_VIEW:
				setResultView((UIResultView)newValue);
				return;
			case UiPackage.UI_ACTION__RESULT:
				setResult((UIParameterComponentType)newValue);
				return;
			case UiPackage.UI_ACTION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends UIParameterComponentType>)newValue);
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
			case UiPackage.UI_ACTION__PARAM_VIEW:
				setParamView((UIParamView)null);
				return;
			case UiPackage.UI_ACTION__INHERITED:
				setInherited(INHERITED_EDEFAULT);
				return;
			case UiPackage.UI_ACTION__CLASS_BASED:
				setClassBased(CLASS_BASED_EDEFAULT);
				return;
			case UiPackage.UI_ACTION__TO_BE_CONFIRMED:
				setToBeConfirmed(TO_BE_CONFIRMED_EDEFAULT);
				return;
			case UiPackage.UI_ACTION__NOT_BULK:
				setNotBulk(NOT_BULK_EDEFAULT);
				return;
			case UiPackage.UI_ACTION__IS_QUERY:
				setIsQuery(IS_QUERY_EDEFAULT);
				return;
			case UiPackage.UI_ACTION__RESULT_VIEW:
				setResultView((UIResultView)null);
				return;
			case UiPackage.UI_ACTION__RESULT:
				setResult((UIParameterComponentType)null);
				return;
			case UiPackage.UI_ACTION__PARAMETERS:
				getParameters().clear();
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
			case UiPackage.UI_ACTION__PARAM_VIEW:
				return paramView != null;
			case UiPackage.UI_ACTION__INHERITED:
				return inherited != INHERITED_EDEFAULT;
			case UiPackage.UI_ACTION__CLASS_BASED:
				return classBased != CLASS_BASED_EDEFAULT;
			case UiPackage.UI_ACTION__TO_BE_CONFIRMED:
				return toBeConfirmed != TO_BE_CONFIRMED_EDEFAULT;
			case UiPackage.UI_ACTION__NOT_BULK:
				return notBulk != NOT_BULK_EDEFAULT;
			case UiPackage.UI_ACTION__IS_QUERY:
				return isQuery != IS_QUERY_EDEFAULT;
			case UiPackage.UI_ACTION__RESULT_VIEW:
				return resultView != null;
			case UiPackage.UI_ACTION__RESULT:
				return result != null;
			case UiPackage.UI_ACTION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
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
		result.append(" (inherited: ");
		result.append(inherited);
		result.append(", classBased: ");
		result.append(classBased);
		result.append(", toBeConfirmed: ");
		result.append(toBeConfirmed);
		result.append(", notBulk: ");
		result.append(notBulk);
		result.append(", isQuery: ");
		result.append(isQuery);
		result.append(')');
		return result.toString();
	}

} //UIActionImpl
