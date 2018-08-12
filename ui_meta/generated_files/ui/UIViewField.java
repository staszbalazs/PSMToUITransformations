/**
 */
package ui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI View Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ui.UIViewField#getPosition <em>Position</em>}</li>
 *   <li>{@link ui.UIViewField#isSearchable <em>Searchable</em>}</li>
 *   <li>{@link ui.UIViewField#getOrder <em>Order</em>}</li>
 *   <li>{@link ui.UIViewField#isShow <em>Show</em>}</li>
 *   <li>{@link ui.UIViewField#getComponentType <em>Component Type</em>}</li>
 * </ul>
 *
 * @see ui.UiPackage#getUIViewField()
 * @model
 * @generated
 */
public interface UIViewField extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(int)
	 * @see ui.UiPackage#getUIViewField_Position()
	 * @model default="1"
	 * @generated
	 */
	int getPosition();

	/**
	 * Sets the value of the '{@link ui.UIViewField#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(int value);

	/**
	 * Returns the value of the '<em><b>Searchable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Searchable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Searchable</em>' attribute.
	 * @see #setSearchable(boolean)
	 * @see ui.UiPackage#getUIViewField_Searchable()
	 * @model
	 * @generated
	 */
	boolean isSearchable();

	/**
	 * Sets the value of the '{@link ui.UIViewField#isSearchable <em>Searchable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Searchable</em>' attribute.
	 * @see #isSearchable()
	 * @generated
	 */
	void setSearchable(boolean value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see #setOrder(int)
	 * @see ui.UiPackage#getUIViewField_Order()
	 * @model default="0"
	 * @generated
	 */
	int getOrder();

	/**
	 * Sets the value of the '{@link ui.UIViewField#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(int value);

	/**
	 * Returns the value of the '<em><b>Show</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show</em>' attribute.
	 * @see #setShow(boolean)
	 * @see ui.UiPackage#getUIViewField_Show()
	 * @model default="true"
	 * @generated
	 */
	boolean isShow();

	/**
	 * Sets the value of the '{@link ui.UIViewField#isShow <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show</em>' attribute.
	 * @see #isShow()
	 * @generated
	 */
	void setShow(boolean value);

	/**
	 * Returns the value of the '<em><b>Component Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Type</em>' reference.
	 * @see #setComponentType(UIComponentType)
	 * @see ui.UiPackage#getUIViewField_ComponentType()
	 * @model required="true"
	 * @generated
	 */
	UIComponentType getComponentType();

	/**
	 * Sets the value of the '{@link ui.UIViewField#getComponentType <em>Component Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Type</em>' reference.
	 * @see #getComponentType()
	 * @generated
	 */
	void setComponentType(UIComponentType value);

} // UIViewField
