/**
 */
package ui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Base Component Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ui.UIBaseComponentType#getRegexp <em>Regexp</em>}</li>
 *   <li>{@link ui.UIBaseComponentType#getDecimals <em>Decimals</em>}</li>
 *   <li>{@link ui.UIBaseComponentType#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link ui.UIBaseComponentType#isRepresentation <em>Representation</em>}</li>
 * </ul>
 *
 * @see ui.UiPackage#getUIBaseComponentType()
 * @model
 * @generated
 */
public interface UIBaseComponentType extends UIAttributeComponentType {
	/**
	 * Returns the value of the '<em><b>Regexp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regexp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regexp</em>' attribute.
	 * @see #setRegexp(String)
	 * @see ui.UiPackage#getUIBaseComponentType_Regexp()
	 * @model
	 * @generated
	 */
	String getRegexp();

	/**
	 * Sets the value of the '{@link ui.UIBaseComponentType#getRegexp <em>Regexp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regexp</em>' attribute.
	 * @see #getRegexp()
	 * @generated
	 */
	void setRegexp(String value);

	/**
	 * Returns the value of the '<em><b>Decimals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decimals</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decimals</em>' attribute.
	 * @see #setDecimals(int)
	 * @see ui.UiPackage#getUIBaseComponentType_Decimals()
	 * @model
	 * @generated
	 */
	int getDecimals();

	/**
	 * Sets the value of the '{@link ui.UIBaseComponentType#getDecimals <em>Decimals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decimals</em>' attribute.
	 * @see #getDecimals()
	 * @generated
	 */
	void setDecimals(int value);

	/**
	 * Returns the value of the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placeholder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placeholder</em>' attribute.
	 * @see #setPlaceholder(String)
	 * @see ui.UiPackage#getUIBaseComponentType_Placeholder()
	 * @model
	 * @generated
	 */
	String getPlaceholder();

	/**
	 * Sets the value of the '{@link ui.UIBaseComponentType#getPlaceholder <em>Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placeholder</em>' attribute.
	 * @see #getPlaceholder()
	 * @generated
	 */
	void setPlaceholder(String value);

	/**
	 * Returns the value of the '<em><b>Representation</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Representation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representation</em>' attribute.
	 * @see #setRepresentation(boolean)
	 * @see ui.UiPackage#getUIBaseComponentType_Representation()
	 * @model default="false"
	 * @generated
	 */
	boolean isRepresentation();

	/**
	 * Sets the value of the '{@link ui.UIBaseComponentType#isRepresentation <em>Representation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation</em>' attribute.
	 * @see #isRepresentation()
	 * @generated
	 */
	void setRepresentation(boolean value);

} // UIBaseComponentType
