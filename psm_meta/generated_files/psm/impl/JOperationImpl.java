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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import psm.JClass;
import psm.JOperation;
import psm.JOperationKind;
import psm.JParameter;
import psm.JTransition;
import psm.PsmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JOperation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link psm.impl.JOperationImpl#isClassBased <em>Class Based</em>}</li>
 *   <li>{@link psm.impl.JOperationImpl#getOwnerClass <em>Owner Class</em>}</li>
 *   <li>{@link psm.impl.JOperationImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link psm.impl.JOperationImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link psm.impl.JOperationImpl#isBulk <em>Bulk</em>}</li>
 *   <li>{@link psm.impl.JOperationImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link psm.impl.JOperationImpl#isUiMustConfirm <em>Ui Must Confirm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JOperationImpl extends JElementImpl implements JOperation {
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
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<JParameter> parameters;

	/**
	 * The cached value of the '{@link #getTransition() <em>Transition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<JTransition> transition;

	/**
	 * The default value of the '{@link #isBulk() <em>Bulk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBulk()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BULK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBulk() <em>Bulk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBulk()
	 * @generated
	 * @ordered
	 */
	protected boolean bulk = BULK_EDEFAULT;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final JOperationKind KIND_EDEFAULT = JOperationKind.CUSTOM;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected JOperationKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #isUiMustConfirm() <em>Ui Must Confirm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUiMustConfirm()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UI_MUST_CONFIRM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUiMustConfirm() <em>Ui Must Confirm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUiMustConfirm()
	 * @generated
	 * @ordered
	 */
	protected boolean uiMustConfirm = UI_MUST_CONFIRM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PsmPackage.Literals.JOPERATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JOPERATION__CLASS_BASED, oldClassBased, classBased));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JClass getOwnerClass() {
		if (eContainerFeatureID() != PsmPackage.JOPERATION__OWNER_CLASS) return null;
		return (JClass)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnerClass(JClass newOwnerClass, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnerClass, PsmPackage.JOPERATION__OWNER_CLASS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerClass(JClass newOwnerClass) {
		if (newOwnerClass != eInternalContainer() || (eContainerFeatureID() != PsmPackage.JOPERATION__OWNER_CLASS && newOwnerClass != null)) {
			if (EcoreUtil.isAncestor(this, newOwnerClass))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnerClass != null)
				msgs = ((InternalEObject)newOwnerClass).eInverseAdd(this, PsmPackage.JCLASS__OPERATIONS, JClass.class, msgs);
			msgs = basicSetOwnerClass(newOwnerClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JOPERATION__OWNER_CLASS, newOwnerClass, newOwnerClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentWithInverseEList<JParameter>(JParameter.class, this, PsmPackage.JOPERATION__PARAMETERS, PsmPackage.JPARAMETER__OWNER_OPERATION);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JTransition> getTransition() {
		if (transition == null) {
			transition = new EObjectWithInverseResolvingEList<JTransition>(JTransition.class, this, PsmPackage.JOPERATION__TRANSITION, PsmPackage.JTRANSITION__EXECUTING_OPERATION);
		}
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBulk() {
		return bulk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBulk(boolean newBulk) {
		boolean oldBulk = bulk;
		bulk = newBulk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JOPERATION__BULK, oldBulk, bulk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JOperationKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(JOperationKind newKind) {
		JOperationKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JOPERATION__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUiMustConfirm() {
		return uiMustConfirm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUiMustConfirm(boolean newUiMustConfirm) {
		boolean oldUiMustConfirm = uiMustConfirm;
		uiMustConfirm = newUiMustConfirm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JOPERATION__UI_MUST_CONFIRM, oldUiMustConfirm, uiMustConfirm));
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
			case PsmPackage.JOPERATION__OWNER_CLASS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnerClass((JClass)otherEnd, msgs);
			case PsmPackage.JOPERATION__PARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParameters()).basicAdd(otherEnd, msgs);
			case PsmPackage.JOPERATION__TRANSITION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransition()).basicAdd(otherEnd, msgs);
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
			case PsmPackage.JOPERATION__OWNER_CLASS:
				return basicSetOwnerClass(null, msgs);
			case PsmPackage.JOPERATION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case PsmPackage.JOPERATION__TRANSITION:
				return ((InternalEList<?>)getTransition()).basicRemove(otherEnd, msgs);
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
			case PsmPackage.JOPERATION__OWNER_CLASS:
				return eInternalContainer().eInverseRemove(this, PsmPackage.JCLASS__OPERATIONS, JClass.class, msgs);
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
			case PsmPackage.JOPERATION__CLASS_BASED:
				return isClassBased();
			case PsmPackage.JOPERATION__OWNER_CLASS:
				return getOwnerClass();
			case PsmPackage.JOPERATION__PARAMETERS:
				return getParameters();
			case PsmPackage.JOPERATION__TRANSITION:
				return getTransition();
			case PsmPackage.JOPERATION__BULK:
				return isBulk();
			case PsmPackage.JOPERATION__KIND:
				return getKind();
			case PsmPackage.JOPERATION__UI_MUST_CONFIRM:
				return isUiMustConfirm();
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
			case PsmPackage.JOPERATION__CLASS_BASED:
				setClassBased((Boolean)newValue);
				return;
			case PsmPackage.JOPERATION__OWNER_CLASS:
				setOwnerClass((JClass)newValue);
				return;
			case PsmPackage.JOPERATION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends JParameter>)newValue);
				return;
			case PsmPackage.JOPERATION__TRANSITION:
				getTransition().clear();
				getTransition().addAll((Collection<? extends JTransition>)newValue);
				return;
			case PsmPackage.JOPERATION__BULK:
				setBulk((Boolean)newValue);
				return;
			case PsmPackage.JOPERATION__KIND:
				setKind((JOperationKind)newValue);
				return;
			case PsmPackage.JOPERATION__UI_MUST_CONFIRM:
				setUiMustConfirm((Boolean)newValue);
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
			case PsmPackage.JOPERATION__CLASS_BASED:
				setClassBased(CLASS_BASED_EDEFAULT);
				return;
			case PsmPackage.JOPERATION__OWNER_CLASS:
				setOwnerClass((JClass)null);
				return;
			case PsmPackage.JOPERATION__PARAMETERS:
				getParameters().clear();
				return;
			case PsmPackage.JOPERATION__TRANSITION:
				getTransition().clear();
				return;
			case PsmPackage.JOPERATION__BULK:
				setBulk(BULK_EDEFAULT);
				return;
			case PsmPackage.JOPERATION__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case PsmPackage.JOPERATION__UI_MUST_CONFIRM:
				setUiMustConfirm(UI_MUST_CONFIRM_EDEFAULT);
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
			case PsmPackage.JOPERATION__CLASS_BASED:
				return classBased != CLASS_BASED_EDEFAULT;
			case PsmPackage.JOPERATION__OWNER_CLASS:
				return getOwnerClass() != null;
			case PsmPackage.JOPERATION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case PsmPackage.JOPERATION__TRANSITION:
				return transition != null && !transition.isEmpty();
			case PsmPackage.JOPERATION__BULK:
				return bulk != BULK_EDEFAULT;
			case PsmPackage.JOPERATION__KIND:
				return kind != KIND_EDEFAULT;
			case PsmPackage.JOPERATION__UI_MUST_CONFIRM:
				return uiMustConfirm != UI_MUST_CONFIRM_EDEFAULT;
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
		result.append(" (classBased: ");
		result.append(classBased);
		result.append(", bulk: ");
		result.append(bulk);
		result.append(", kind: ");
		result.append(kind);
		result.append(", uiMustConfirm: ");
		result.append(uiMustConfirm);
		result.append(')');
		return result.toString();
	}

} //JOperationImpl
