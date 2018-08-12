/**
 */
package psm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JUI Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link psm.JUIFilter#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link psm.JUIFilter#getOperator <em>Operator</em>}</li>
 *   <li>{@link psm.JUIFilter#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see psm.PsmPackage#getJUIFilter()
 * @model
 * @generated
 */
public interface JUIFilter extends JElement {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(JAttribute)
	 * @see psm.PsmPackage#getJUIFilter_Attribute()
	 * @model required="true"
	 * @generated
	 */
	JAttribute getAttribute();

	/**
	 * Sets the value of the '{@link psm.JUIFilter#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(JAttribute value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link psm.JOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see psm.JOperator
	 * @see #setOperator(JOperator)
	 * @see psm.PsmPackage#getJUIFilter_Operator()
	 * @model required="true"
	 * @generated
	 */
	JOperator getOperator();

	/**
	 * Sets the value of the '{@link psm.JUIFilter#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see psm.JOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(JOperator value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see psm.PsmPackage#getJUIFilter_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link psm.JUIFilter#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // JUIFilter
