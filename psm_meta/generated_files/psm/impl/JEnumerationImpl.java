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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import psm.JClass;
import psm.JEnumeration;
import psm.JLiteral;
import psm.JPackage;
import psm.PsmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JEnumeration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link psm.impl.JEnumerationImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link psm.impl.JEnumerationImpl#getLiterals <em>Literals</em>}</li>
 *   <li>{@link psm.impl.JEnumerationImpl#getClassRepresentation <em>Class Representation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JEnumerationImpl extends JTypeImpl implements JEnumeration {
	/**
	 * The cached value of the '{@link #getLiterals() <em>Literals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiterals()
	 * @generated
	 * @ordered
	 */
	protected EList<JLiteral> literals;

	/**
	 * The cached value of the '{@link #getClassRepresentation() <em>Class Representation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassRepresentation()
	 * @generated
	 * @ordered
	 */
	protected JClass classRepresentation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JEnumerationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PsmPackage.Literals.JENUMERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JPackage getPackage() {
		if (eContainerFeatureID() != PsmPackage.JENUMERATION__PACKAGE) return null;
		return (JPackage)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackage(JPackage newPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPackage, PsmPackage.JENUMERATION__PACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(JPackage newPackage) {
		if (newPackage != eInternalContainer() || (eContainerFeatureID() != PsmPackage.JENUMERATION__PACKAGE && newPackage != null)) {
			if (EcoreUtil.isAncestor(this, newPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPackage != null)
				msgs = ((InternalEObject)newPackage).eInverseAdd(this, PsmPackage.JPACKAGE__ENUMERATIONS, JPackage.class, msgs);
			msgs = basicSetPackage(newPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JENUMERATION__PACKAGE, newPackage, newPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JLiteral> getLiterals() {
		if (literals == null) {
			literals = new EObjectContainmentWithInverseEList<JLiteral>(JLiteral.class, this, PsmPackage.JENUMERATION__LITERALS, PsmPackage.JLITERAL__ENUMERATION);
		}
		return literals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JClass getClassRepresentation() {
		if (classRepresentation != null && classRepresentation.eIsProxy()) {
			InternalEObject oldClassRepresentation = (InternalEObject)classRepresentation;
			classRepresentation = (JClass)eResolveProxy(oldClassRepresentation);
			if (classRepresentation != oldClassRepresentation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PsmPackage.JENUMERATION__CLASS_REPRESENTATION, oldClassRepresentation, classRepresentation));
			}
		}
		return classRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JClass basicGetClassRepresentation() {
		return classRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassRepresentation(JClass newClassRepresentation, NotificationChain msgs) {
		JClass oldClassRepresentation = classRepresentation;
		classRepresentation = newClassRepresentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PsmPackage.JENUMERATION__CLASS_REPRESENTATION, oldClassRepresentation, newClassRepresentation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassRepresentation(JClass newClassRepresentation) {
		if (newClassRepresentation != classRepresentation) {
			NotificationChain msgs = null;
			if (classRepresentation != null)
				msgs = ((InternalEObject)classRepresentation).eInverseRemove(this, PsmPackage.JCLASS__FIXED_ENUM, JClass.class, msgs);
			if (newClassRepresentation != null)
				msgs = ((InternalEObject)newClassRepresentation).eInverseAdd(this, PsmPackage.JCLASS__FIXED_ENUM, JClass.class, msgs);
			msgs = basicSetClassRepresentation(newClassRepresentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JENUMERATION__CLASS_REPRESENTATION, newClassRepresentation, newClassRepresentation));
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
			case PsmPackage.JENUMERATION__PACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPackage((JPackage)otherEnd, msgs);
			case PsmPackage.JENUMERATION__LITERALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLiterals()).basicAdd(otherEnd, msgs);
			case PsmPackage.JENUMERATION__CLASS_REPRESENTATION:
				if (classRepresentation != null)
					msgs = ((InternalEObject)classRepresentation).eInverseRemove(this, PsmPackage.JCLASS__FIXED_ENUM, JClass.class, msgs);
				return basicSetClassRepresentation((JClass)otherEnd, msgs);
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
			case PsmPackage.JENUMERATION__PACKAGE:
				return basicSetPackage(null, msgs);
			case PsmPackage.JENUMERATION__LITERALS:
				return ((InternalEList<?>)getLiterals()).basicRemove(otherEnd, msgs);
			case PsmPackage.JENUMERATION__CLASS_REPRESENTATION:
				return basicSetClassRepresentation(null, msgs);
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
			case PsmPackage.JENUMERATION__PACKAGE:
				return eInternalContainer().eInverseRemove(this, PsmPackage.JPACKAGE__ENUMERATIONS, JPackage.class, msgs);
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
			case PsmPackage.JENUMERATION__PACKAGE:
				return getPackage();
			case PsmPackage.JENUMERATION__LITERALS:
				return getLiterals();
			case PsmPackage.JENUMERATION__CLASS_REPRESENTATION:
				if (resolve) return getClassRepresentation();
				return basicGetClassRepresentation();
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
			case PsmPackage.JENUMERATION__PACKAGE:
				setPackage((JPackage)newValue);
				return;
			case PsmPackage.JENUMERATION__LITERALS:
				getLiterals().clear();
				getLiterals().addAll((Collection<? extends JLiteral>)newValue);
				return;
			case PsmPackage.JENUMERATION__CLASS_REPRESENTATION:
				setClassRepresentation((JClass)newValue);
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
			case PsmPackage.JENUMERATION__PACKAGE:
				setPackage((JPackage)null);
				return;
			case PsmPackage.JENUMERATION__LITERALS:
				getLiterals().clear();
				return;
			case PsmPackage.JENUMERATION__CLASS_REPRESENTATION:
				setClassRepresentation((JClass)null);
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
			case PsmPackage.JENUMERATION__PACKAGE:
				return getPackage() != null;
			case PsmPackage.JENUMERATION__LITERALS:
				return literals != null && !literals.isEmpty();
			case PsmPackage.JENUMERATION__CLASS_REPRESENTATION:
				return classRepresentation != null;
		}
		return super.eIsSet(featureID);
	}

} //JEnumerationImpl
