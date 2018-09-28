/**
 */
package psm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JPackage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link psm.JPackage#getEnumerations <em>Enumerations</em>}</li>
 *   <li>{@link psm.JPackage#getPrimitives <em>Primitives</em>}</li>
 *   <li>{@link psm.JPackage#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link psm.JPackage#getChildren <em>Children</em>}</li>
 *   <li>{@link psm.JPackage#getParent <em>Parent</em>}</li>
 *   <li>{@link psm.JPackage#getOwnerModel <em>Owner Model</em>}</li>
 *   <li>{@link psm.JPackage#getClasses <em>Classes</em>}</li>
 * </ul>
 *
 * @see psm.PsmPackage#getJPackage()
 * @model
 * @generated
 */
public interface JPackage extends JElement {
	/**
	 * Returns the value of the '<em><b>Enumerations</b></em>' containment reference list.
	 * The list contents are of type {@link psm.JEnumeration}.
	 * It is bidirectional and its opposite is '{@link psm.JEnumeration#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumerations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumerations</em>' containment reference list.
	 * @see psm.PsmPackage#getJPackage_Enumerations()
	 * @see psm.JEnumeration#getPackage
	 * @model opposite="package" containment="true"
	 * @generated
	 */
	EList<JEnumeration> getEnumerations();

	/**
	 * Returns the value of the '<em><b>Primitives</b></em>' containment reference list.
	 * The list contents are of type {@link psm.JPrimitive}.
	 * It is bidirectional and its opposite is '{@link psm.JPrimitive#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primitives</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitives</em>' containment reference list.
	 * @see psm.PsmPackage#getJPackage_Primitives()
	 * @see psm.JPrimitive#getPackage
	 * @model opposite="package" containment="true"
	 * @generated
	 */
	EList<JPrimitive> getPrimitives();

	/**
	 * Returns the value of the '<em><b>Relationships</b></em>' containment reference list.
	 * The list contents are of type {@link psm.JRelationship}.
	 * It is bidirectional and its opposite is '{@link psm.JRelationship#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationships</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationships</em>' containment reference list.
	 * @see psm.PsmPackage#getJPackage_Relationships()
	 * @see psm.JRelationship#getPackage
	 * @model opposite="package" containment="true"
	 * @generated
	 */
	EList<JRelationship> getRelationships();

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link psm.JPackage}.
	 * It is bidirectional and its opposite is '{@link psm.JPackage#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see psm.PsmPackage#getJPackage_Children()
	 * @see psm.JPackage#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<JPackage> getChildren();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link psm.JPackage#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(JPackage)
	 * @see psm.PsmPackage#getJPackage_Parent()
	 * @see psm.JPackage#getChildren
	 * @model opposite="children" transient="false"
	 * @generated
	 */
	JPackage getParent();

	/**
	 * Sets the value of the '{@link psm.JPackage#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(JPackage value);

	/**
	 * Returns the value of the '<em><b>Owner Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link psm.JModel#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Model</em>' container reference.
	 * @see #setOwnerModel(JModel)
	 * @see psm.PsmPackage#getJPackage_OwnerModel()
	 * @see psm.JModel#getPackages
	 * @model opposite="packages" transient="false"
	 * @generated
	 */
	JModel getOwnerModel();

	/**
	 * Sets the value of the '{@link psm.JPackage#getOwnerModel <em>Owner Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Model</em>' container reference.
	 * @see #getOwnerModel()
	 * @generated
	 */
	void setOwnerModel(JModel value);

	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link psm.JClass}.
	 * It is bidirectional and its opposite is '{@link psm.JClass#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see psm.PsmPackage#getJPackage_Classes()
	 * @see psm.JClass#getPackage
	 * @model opposite="package" containment="true"
	 * @generated
	 */
	EList<JClass> getClasses();

} // JPackage
