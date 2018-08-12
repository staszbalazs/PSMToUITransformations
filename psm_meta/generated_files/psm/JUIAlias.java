/**
 */
package psm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JUI Alias</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link psm.JUIAlias#getOwnerClass <em>Owner Class</em>}</li>
 * </ul>
 *
 * @see psm.PsmPackage#getJUIAlias()
 * @model
 * @generated
 */
public interface JUIAlias extends JElement {
	/**
	 * Returns the value of the '<em><b>Owner Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link psm.JClass#getAliases <em>Aliases</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner Class</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Class</em>' container reference.
	 * @see #setOwnerClass(JClass)
	 * @see psm.PsmPackage#getJUIAlias_OwnerClass()
	 * @see psm.JClass#getAliases
	 * @model opposite="aliases" required="true" transient="false"
	 * @generated
	 */
	JClass getOwnerClass();

	/**
	 * Sets the value of the '{@link psm.JUIAlias#getOwnerClass <em>Owner Class</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Class</em>' container reference.
	 * @see #getOwnerClass()
	 * @generated
	 */
	void setOwnerClass(JClass value);

} // JUIAlias
