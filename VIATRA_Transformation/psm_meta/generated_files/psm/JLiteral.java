/**
 */
package psm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JLiteral</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link psm.JLiteral#getEnumeration <em>Enumeration</em>}</li>
 * </ul>
 *
 * @see psm.PsmPackage#getJLiteral()
 * @model
 * @generated
 */
public interface JLiteral extends JElement {
	/**
	 * Returns the value of the '<em><b>Enumeration</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link psm.JEnumeration#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumeration</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumeration</em>' container reference.
	 * @see #setEnumeration(JEnumeration)
	 * @see psm.PsmPackage#getJLiteral_Enumeration()
	 * @see psm.JEnumeration#getLiterals
	 * @model opposite="literals" transient="false"
	 * @generated
	 */
	JEnumeration getEnumeration();

	/**
	 * Sets the value of the '{@link psm.JLiteral#getEnumeration <em>Enumeration</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enumeration</em>' container reference.
	 * @see #getEnumeration()
	 * @generated
	 */
	void setEnumeration(JEnumeration value);

} // JLiteral
