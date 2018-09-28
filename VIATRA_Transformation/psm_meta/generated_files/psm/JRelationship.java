/**
 */
package psm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JRelationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link psm.JRelationship#getPackage <em>Package</em>}</li>
 *   <li>{@link psm.JRelationship#getRoles <em>Roles</em>}</li>
 *   <li>{@link psm.JRelationship#isDerived <em>Derived</em>}</li>
 * </ul>
 *
 * @see psm.PsmPackage#getJRelationship()
 * @model
 * @generated
 */
public interface JRelationship extends JElement {
	/**
	 * Returns the value of the '<em><b>Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link psm.JPackage#getRelationships <em>Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' container reference.
	 * @see #setPackage(JPackage)
	 * @see psm.PsmPackage#getJRelationship_Package()
	 * @see psm.JPackage#getRelationships
	 * @model opposite="relationships" transient="false"
	 * @generated
	 */
	JPackage getPackage();

	/**
	 * Sets the value of the '{@link psm.JRelationship#getPackage <em>Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' container reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(JPackage value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link psm.JRole}.
	 * It is bidirectional and its opposite is '{@link psm.JRole#getOwnerRelationship <em>Owner Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see psm.PsmPackage#getJRelationship_Roles()
	 * @see psm.JRole#getOwnerRelationship
	 * @model opposite="ownerRelationship" containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<JRole> getRoles();

	/**
	 * Returns the value of the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derived</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived</em>' attribute.
	 * @see #setDerived(boolean)
	 * @see psm.PsmPackage#getJRelationship_Derived()
	 * @model
	 * @generated
	 */
	boolean isDerived();

	/**
	 * Sets the value of the '{@link psm.JRelationship#isDerived <em>Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived</em>' attribute.
	 * @see #isDerived()
	 * @generated
	 */
	void setDerived(boolean value);

} // JRelationship
