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
import psm.JModel;
import psm.JPackage;
import psm.JPrimitive;
import psm.JRelationship;
import psm.PsmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JPackage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link psm.impl.JPackageImpl#getEnumerations <em>Enumerations</em>}</li>
 *   <li>{@link psm.impl.JPackageImpl#getPrimitives <em>Primitives</em>}</li>
 *   <li>{@link psm.impl.JPackageImpl#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link psm.impl.JPackageImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link psm.impl.JPackageImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link psm.impl.JPackageImpl#getOwnerModel <em>Owner Model</em>}</li>
 *   <li>{@link psm.impl.JPackageImpl#getClasses <em>Classes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JPackageImpl extends JElementImpl implements JPackage {
	/**
	 * The cached value of the '{@link #getEnumerations() <em>Enumerations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumerations()
	 * @generated
	 * @ordered
	 */
	protected EList<JEnumeration> enumerations;

	/**
	 * The cached value of the '{@link #getPrimitives() <em>Primitives</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitives()
	 * @generated
	 * @ordered
	 */
	protected EList<JPrimitive> primitives;

	/**
	 * The cached value of the '{@link #getRelationships() <em>Relationships</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationships()
	 * @generated
	 * @ordered
	 */
	protected EList<JRelationship> relationships;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<JPackage> children;

	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<JClass> classes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PsmPackage.Literals.JPACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JEnumeration> getEnumerations() {
		if (enumerations == null) {
			enumerations = new EObjectContainmentWithInverseEList<JEnumeration>(JEnumeration.class, this, PsmPackage.JPACKAGE__ENUMERATIONS, PsmPackage.JENUMERATION__PACKAGE);
		}
		return enumerations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JPrimitive> getPrimitives() {
		if (primitives == null) {
			primitives = new EObjectContainmentWithInverseEList<JPrimitive>(JPrimitive.class, this, PsmPackage.JPACKAGE__PRIMITIVES, PsmPackage.JPRIMITIVE__PACKAGE);
		}
		return primitives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JRelationship> getRelationships() {
		if (relationships == null) {
			relationships = new EObjectContainmentWithInverseEList<JRelationship>(JRelationship.class, this, PsmPackage.JPACKAGE__RELATIONSHIPS, PsmPackage.JRELATIONSHIP__PACKAGE);
		}
		return relationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JPackage> getChildren() {
		if (children == null) {
			children = new EObjectContainmentWithInverseEList<JPackage>(JPackage.class, this, PsmPackage.JPACKAGE__CHILDREN, PsmPackage.JPACKAGE__PARENT);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JPackage getParent() {
		if (eContainerFeatureID() != PsmPackage.JPACKAGE__PARENT) return null;
		return (JPackage)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(JPackage newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, PsmPackage.JPACKAGE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(JPackage newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != PsmPackage.JPACKAGE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, PsmPackage.JPACKAGE__CHILDREN, JPackage.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JPACKAGE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JModel getOwnerModel() {
		if (eContainerFeatureID() != PsmPackage.JPACKAGE__OWNER_MODEL) return null;
		return (JModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnerModel(JModel newOwnerModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnerModel, PsmPackage.JPACKAGE__OWNER_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerModel(JModel newOwnerModel) {
		if (newOwnerModel != eInternalContainer() || (eContainerFeatureID() != PsmPackage.JPACKAGE__OWNER_MODEL && newOwnerModel != null)) {
			if (EcoreUtil.isAncestor(this, newOwnerModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnerModel != null)
				msgs = ((InternalEObject)newOwnerModel).eInverseAdd(this, PsmPackage.JMODEL__PACKAGES, JModel.class, msgs);
			msgs = basicSetOwnerModel(newOwnerModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsmPackage.JPACKAGE__OWNER_MODEL, newOwnerModel, newOwnerModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JClass> getClasses() {
		if (classes == null) {
			classes = new EObjectContainmentWithInverseEList<JClass>(JClass.class, this, PsmPackage.JPACKAGE__CLASSES, PsmPackage.JCLASS__PACKAGE);
		}
		return classes;
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
			case PsmPackage.JPACKAGE__ENUMERATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEnumerations()).basicAdd(otherEnd, msgs);
			case PsmPackage.JPACKAGE__PRIMITIVES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPrimitives()).basicAdd(otherEnd, msgs);
			case PsmPackage.JPACKAGE__RELATIONSHIPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRelationships()).basicAdd(otherEnd, msgs);
			case PsmPackage.JPACKAGE__CHILDREN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(otherEnd, msgs);
			case PsmPackage.JPACKAGE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((JPackage)otherEnd, msgs);
			case PsmPackage.JPACKAGE__OWNER_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnerModel((JModel)otherEnd, msgs);
			case PsmPackage.JPACKAGE__CLASSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getClasses()).basicAdd(otherEnd, msgs);
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
			case PsmPackage.JPACKAGE__ENUMERATIONS:
				return ((InternalEList<?>)getEnumerations()).basicRemove(otherEnd, msgs);
			case PsmPackage.JPACKAGE__PRIMITIVES:
				return ((InternalEList<?>)getPrimitives()).basicRemove(otherEnd, msgs);
			case PsmPackage.JPACKAGE__RELATIONSHIPS:
				return ((InternalEList<?>)getRelationships()).basicRemove(otherEnd, msgs);
			case PsmPackage.JPACKAGE__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case PsmPackage.JPACKAGE__PARENT:
				return basicSetParent(null, msgs);
			case PsmPackage.JPACKAGE__OWNER_MODEL:
				return basicSetOwnerModel(null, msgs);
			case PsmPackage.JPACKAGE__CLASSES:
				return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
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
			case PsmPackage.JPACKAGE__PARENT:
				return eInternalContainer().eInverseRemove(this, PsmPackage.JPACKAGE__CHILDREN, JPackage.class, msgs);
			case PsmPackage.JPACKAGE__OWNER_MODEL:
				return eInternalContainer().eInverseRemove(this, PsmPackage.JMODEL__PACKAGES, JModel.class, msgs);
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
			case PsmPackage.JPACKAGE__ENUMERATIONS:
				return getEnumerations();
			case PsmPackage.JPACKAGE__PRIMITIVES:
				return getPrimitives();
			case PsmPackage.JPACKAGE__RELATIONSHIPS:
				return getRelationships();
			case PsmPackage.JPACKAGE__CHILDREN:
				return getChildren();
			case PsmPackage.JPACKAGE__PARENT:
				return getParent();
			case PsmPackage.JPACKAGE__OWNER_MODEL:
				return getOwnerModel();
			case PsmPackage.JPACKAGE__CLASSES:
				return getClasses();
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
			case PsmPackage.JPACKAGE__ENUMERATIONS:
				getEnumerations().clear();
				getEnumerations().addAll((Collection<? extends JEnumeration>)newValue);
				return;
			case PsmPackage.JPACKAGE__PRIMITIVES:
				getPrimitives().clear();
				getPrimitives().addAll((Collection<? extends JPrimitive>)newValue);
				return;
			case PsmPackage.JPACKAGE__RELATIONSHIPS:
				getRelationships().clear();
				getRelationships().addAll((Collection<? extends JRelationship>)newValue);
				return;
			case PsmPackage.JPACKAGE__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends JPackage>)newValue);
				return;
			case PsmPackage.JPACKAGE__PARENT:
				setParent((JPackage)newValue);
				return;
			case PsmPackage.JPACKAGE__OWNER_MODEL:
				setOwnerModel((JModel)newValue);
				return;
			case PsmPackage.JPACKAGE__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends JClass>)newValue);
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
			case PsmPackage.JPACKAGE__ENUMERATIONS:
				getEnumerations().clear();
				return;
			case PsmPackage.JPACKAGE__PRIMITIVES:
				getPrimitives().clear();
				return;
			case PsmPackage.JPACKAGE__RELATIONSHIPS:
				getRelationships().clear();
				return;
			case PsmPackage.JPACKAGE__CHILDREN:
				getChildren().clear();
				return;
			case PsmPackage.JPACKAGE__PARENT:
				setParent((JPackage)null);
				return;
			case PsmPackage.JPACKAGE__OWNER_MODEL:
				setOwnerModel((JModel)null);
				return;
			case PsmPackage.JPACKAGE__CLASSES:
				getClasses().clear();
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
			case PsmPackage.JPACKAGE__ENUMERATIONS:
				return enumerations != null && !enumerations.isEmpty();
			case PsmPackage.JPACKAGE__PRIMITIVES:
				return primitives != null && !primitives.isEmpty();
			case PsmPackage.JPACKAGE__RELATIONSHIPS:
				return relationships != null && !relationships.isEmpty();
			case PsmPackage.JPACKAGE__CHILDREN:
				return children != null && !children.isEmpty();
			case PsmPackage.JPACKAGE__PARENT:
				return getParent() != null;
			case PsmPackage.JPACKAGE__OWNER_MODEL:
				return getOwnerModel() != null;
			case PsmPackage.JPACKAGE__CLASSES:
				return classes != null && !classes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //JPackageImpl
