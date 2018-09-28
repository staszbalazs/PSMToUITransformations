/**
 */
package psm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JParameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link psm.JParameter#getOwnerOperation <em>Owner Operation</em>}</li>
 *   <li>{@link psm.JParameter#isInput <em>Input</em>}</li>
 *   <li>{@link psm.JParameter#getInterval <em>Interval</em>}</li>
 * </ul>
 *
 * @see psm.PsmPackage#getJParameter()
 * @model
 * @generated
 */
public interface JParameter extends JTypedElement {
	/**
	 * Returns the value of the '<em><b>Owner Operation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link psm.JOperation#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner Operation</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Operation</em>' container reference.
	 * @see #setOwnerOperation(JOperation)
	 * @see psm.PsmPackage#getJParameter_OwnerOperation()
	 * @see psm.JOperation#getParameters
	 * @model opposite="parameters" transient="false"
	 * @generated
	 */
	JOperation getOwnerOperation();

	/**
	 * Sets the value of the '{@link psm.JParameter#getOwnerOperation <em>Owner Operation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Operation</em>' container reference.
	 * @see #getOwnerOperation()
	 * @generated
	 */
	void setOwnerOperation(JOperation value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' attribute.
	 * @see #setInput(boolean)
	 * @see psm.PsmPackage#getJParameter_Input()
	 * @model default="true"
	 * @generated
	 */
	boolean isInput();

	/**
	 * Sets the value of the '{@link psm.JParameter#isInput <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' attribute.
	 * @see #isInput()
	 * @generated
	 */
	void setInput(boolean value);

	/**
	 * Returns the value of the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval</em>' attribute.
	 * @see #setInterval(String)
	 * @see psm.PsmPackage#getJParameter_Interval()
	 * @model
	 * @generated
	 */
	String getInterval();

	/**
	 * Sets the value of the '{@link psm.JParameter#getInterval <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval</em>' attribute.
	 * @see #getInterval()
	 * @generated
	 */
	void setInterval(String value);

} // JParameter
