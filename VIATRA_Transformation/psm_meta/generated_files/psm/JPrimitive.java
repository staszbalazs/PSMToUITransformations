/**
 */
package psm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JPrimitive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link psm.JPrimitive#getPackage <em>Package</em>}</li>
 *   <li>{@link psm.JPrimitive#isUseForIdType <em>Use For Id Type</em>}</li>
 * </ul>
 *
 * @see psm.PsmPackage#getJPrimitive()
 * @model
 * @generated
 */
public interface JPrimitive extends JType {
	/**
	 * Returns the value of the '<em><b>Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link psm.JPackage#getPrimitives <em>Primitives</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' container reference.
	 * @see #setPackage(JPackage)
	 * @see psm.PsmPackage#getJPrimitive_Package()
	 * @see psm.JPackage#getPrimitives
	 * @model opposite="primitives" transient="false"
	 * @generated
	 */
	JPackage getPackage();

	/**
	 * Sets the value of the '{@link psm.JPrimitive#getPackage <em>Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' container reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(JPackage value);

	/**
	 * Returns the value of the '<em><b>Use For Id Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use For Id Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use For Id Type</em>' attribute.
	 * @see #setUseForIdType(boolean)
	 * @see psm.PsmPackage#getJPrimitive_UseForIdType()
	 * @model
	 * @generated
	 */
	boolean isUseForIdType();

	/**
	 * Sets the value of the '{@link psm.JPrimitive#isUseForIdType <em>Use For Id Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use For Id Type</em>' attribute.
	 * @see #isUseForIdType()
	 * @generated
	 */
	void setUseForIdType(boolean value);

} // JPrimitive
