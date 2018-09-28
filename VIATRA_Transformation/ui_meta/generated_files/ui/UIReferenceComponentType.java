/**
 */
package ui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Reference Component Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ui.UIReferenceComponentType#getReferenced <em>Referenced</em>}</li>
 *   <li>{@link ui.UIReferenceComponentType#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link ui.UIReferenceComponentType#isNavigable <em>Navigable</em>}</li>
 *   <li>{@link ui.UIReferenceComponentType#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see ui.UiPackage#getUIReferenceComponentType()
 * @model
 * @generated
 */
public interface UIReferenceComponentType extends UIAttributeComponentType {
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
	 * @see ui.UiPackage#getUIReferenceComponentType_Referenced()
	 * @model required="true"
	 * @generated
	 */
	UIClass getReferenced();

	/**
	 * Sets the value of the '{@link ui.UIReferenceComponentType#getReferenced <em>Referenced</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced</em>' reference.
	 * @see #getReferenced()
	 * @generated
	 */
	void setReferenced(UIClass value);

	/**
	 * Returns the value of the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opposite</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opposite</em>' reference.
	 * @see #setOpposite(UIReferenceComponentType)
	 * @see ui.UiPackage#getUIReferenceComponentType_Opposite()
	 * @model
	 * @generated
	 */
	UIReferenceComponentType getOpposite();

	/**
	 * Sets the value of the '{@link ui.UIReferenceComponentType#getOpposite <em>Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opposite</em>' reference.
	 * @see #getOpposite()
	 * @generated
	 */
	void setOpposite(UIReferenceComponentType value);

	/**
	 * Returns the value of the '<em><b>Navigable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Navigable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigable</em>' attribute.
	 * @see #setNavigable(boolean)
	 * @see ui.UiPackage#getUIReferenceComponentType_Navigable()
	 * @model default="false"
	 * @generated
	 */
	boolean isNavigable();

	/**
	 * Sets the value of the '{@link ui.UIReferenceComponentType#isNavigable <em>Navigable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navigable</em>' attribute.
	 * @see #isNavigable()
	 * @generated
	 */
	void setNavigable(boolean value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Aggregation/Composition/Association
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see #setKind(String)
	 * @see ui.UiPackage#getUIReferenceComponentType_Kind()
	 * @model
	 * @generated
	 */
	String getKind();

	/**
	 * Sets the value of the '{@link ui.UIReferenceComponentType#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(String value);

} // UIReferenceComponentType
