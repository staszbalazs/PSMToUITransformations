/**
 */
package psm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JEnumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link psm.JEnumeration#getPackage <em>Package</em>}</li>
 *   <li>{@link psm.JEnumeration#getLiterals <em>Literals</em>}</li>
 *   <li>{@link psm.JEnumeration#getClassRepresentation <em>Class Representation</em>}</li>
 * </ul>
 *
 * @see psm.PsmPackage#getJEnumeration()
 * @model
 * @generated
 */
public interface JEnumeration extends JType {
	/**
	 * Returns the value of the '<em><b>Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link psm.JPackage#getEnumerations <em>Enumerations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' container reference.
	 * @see #setPackage(JPackage)
	 * @see psm.PsmPackage#getJEnumeration_Package()
	 * @see psm.JPackage#getEnumerations
	 * @model opposite="enumerations" transient="false"
	 * @generated
	 */
	JPackage getPackage();

	/**
	 * Sets the value of the '{@link psm.JEnumeration#getPackage <em>Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' container reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(JPackage value);

	/**
	 * Returns the value of the '<em><b>Literals</b></em>' containment reference list.
	 * The list contents are of type {@link psm.JLiteral}.
	 * It is bidirectional and its opposite is '{@link psm.JLiteral#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literals</em>' containment reference list.
	 * @see psm.PsmPackage#getJEnumeration_Literals()
	 * @see psm.JLiteral#getEnumeration
	 * @model opposite="enumeration" containment="true"
	 * @generated
	 */
	EList<JLiteral> getLiterals();

	/**
	 * Returns the value of the '<em><b>Class Representation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link psm.JClass#getFixedEnum <em>Fixed Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Representation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Representation</em>' reference.
	 * @see #setClassRepresentation(JClass)
	 * @see psm.PsmPackage#getJEnumeration_ClassRepresentation()
	 * @see psm.JClass#getFixedEnum
	 * @model opposite="fixedEnum"
	 * @generated
	 */
	JClass getClassRepresentation();

	/**
	 * Sets the value of the '{@link psm.JEnumeration#getClassRepresentation <em>Class Representation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Representation</em>' reference.
	 * @see #getClassRepresentation()
	 * @generated
	 */
	void setClassRepresentation(JClass value);

} // JEnumeration
