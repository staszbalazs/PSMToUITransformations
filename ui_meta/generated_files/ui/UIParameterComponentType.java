/**
 */
package ui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Parameter Component Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ui.UIParameterComponentType#getReferenced <em>Referenced</em>}</li>
 * </ul>
 *
 * @see ui.UiPackage#getUIParameterComponentType()
 * @model
 * @generated
 */
public interface UIParameterComponentType extends UIComponentType {
	/**
	 * Returns the value of the '<em><b>Referenced</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced</em>' reference.
	 * @see #setReferenced(UIClass)
	 * @see ui.UiPackage#getUIParameterComponentType_Referenced()
	 * @model
	 * @generated
	 */
	UIClass getReferenced();

	/**
	 * Sets the value of the '{@link ui.UIParameterComponentType#getReferenced <em>Referenced</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced</em>' reference.
	 * @see #getReferenced()
	 * @generated
	 */
	void setReferenced(UIClass value);

} // UIParameterComponentType
