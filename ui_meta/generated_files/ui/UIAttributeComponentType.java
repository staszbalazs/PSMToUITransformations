/**
 */
package ui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Attribute Component Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ui.UIAttributeComponentType#isInherited <em>Inherited</em>}</li>
 *   <li>{@link ui.UIAttributeComponentType#isDerived <em>Derived</em>}</li>
 *   <li>{@link ui.UIAttributeComponentType#isPrivate <em>Private</em>}</li>
 *   <li>{@link ui.UIAttributeComponentType#isReadonly <em>Readonly</em>}</li>
 *   <li>{@link ui.UIAttributeComponentType#isDisableOnCreate <em>Disable On Create</em>}</li>
 *   <li>{@link ui.UIAttributeComponentType#getOwnerClass <em>Owner Class</em>}</li>
 * </ul>
 *
 * @see ui.UiPackage#getUIAttributeComponentType()
 * @model abstract="true"
 * @generated
 */
public interface UIAttributeComponentType extends UIComponentType {
	/**
	 * Returns the value of the '<em><b>Inherited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inherited</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inherited</em>' attribute.
	 * @see #setInherited(boolean)
	 * @see ui.UiPackage#getUIAttributeComponentType_Inherited()
	 * @model
	 * @generated
	 */
	boolean isInherited();

	/**
	 * Sets the value of the '{@link ui.UIAttributeComponentType#isInherited <em>Inherited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inherited</em>' attribute.
	 * @see #isInherited()
	 * @generated
	 */
	void setInherited(boolean value);

	/**
	 * Returns the value of the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derived</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived</em>' attribute.
	 * @see #setDerived(boolean)
	 * @see ui.UiPackage#getUIAttributeComponentType_Derived()
	 * @model
	 * @generated
	 */
	boolean isDerived();

	/**
	 * Sets the value of the '{@link ui.UIAttributeComponentType#isDerived <em>Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived</em>' attribute.
	 * @see #isDerived()
	 * @generated
	 */
	void setDerived(boolean value);

	/**
	 * Returns the value of the '<em><b>Private</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Private</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Private</em>' attribute.
	 * @see #setPrivate(boolean)
	 * @see ui.UiPackage#getUIAttributeComponentType_Private()
	 * @model default="false"
	 * @generated
	 */
	boolean isPrivate();

	/**
	 * Sets the value of the '{@link ui.UIAttributeComponentType#isPrivate <em>Private</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private</em>' attribute.
	 * @see #isPrivate()
	 * @generated
	 */
	void setPrivate(boolean value);

	/**
	 * Returns the value of the '<em><b>Readonly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Readonly</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Readonly</em>' attribute.
	 * @see #setReadonly(boolean)
	 * @see ui.UiPackage#getUIAttributeComponentType_Readonly()
	 * @model
	 * @generated
	 */
	boolean isReadonly();

	/**
	 * Sets the value of the '{@link ui.UIAttributeComponentType#isReadonly <em>Readonly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Readonly</em>' attribute.
	 * @see #isReadonly()
	 * @generated
	 */
	void setReadonly(boolean value);

	/**
	 * Returns the value of the '<em><b>Disable On Create</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disable On Create</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disable On Create</em>' attribute.
	 * @see #setDisableOnCreate(boolean)
	 * @see ui.UiPackage#getUIAttributeComponentType_DisableOnCreate()
	 * @model default="false"
	 * @generated
	 */
	boolean isDisableOnCreate();

	/**
	 * Sets the value of the '{@link ui.UIAttributeComponentType#isDisableOnCreate <em>Disable On Create</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disable On Create</em>' attribute.
	 * @see #isDisableOnCreate()
	 * @generated
	 */
	void setDisableOnCreate(boolean value);

	/**
	 * Returns the value of the '<em><b>Owner Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ui.UIClass#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner Class</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Class</em>' container reference.
	 * @see #setOwnerClass(UIClass)
	 * @see ui.UiPackage#getUIAttributeComponentType_OwnerClass()
	 * @see ui.UIClass#getAttributes
	 * @model opposite="attributes" required="true" transient="false"
	 * @generated
	 */
	UIClass getOwnerClass();

	/**
	 * Sets the value of the '{@link ui.UIAttributeComponentType#getOwnerClass <em>Owner Class</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Class</em>' container reference.
	 * @see #getOwnerClass()
	 * @generated
	 */
	void setOwnerClass(UIClass value);

} // UIAttributeComponentType
