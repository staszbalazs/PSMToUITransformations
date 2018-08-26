/**
 */
package ui;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ui.UIClass#getActions <em>Actions</em>}</li>
 *   <li>{@link ui.UIClass#getClassViews <em>Class Views</em>}</li>
 *   <li>{@link ui.UIClass#getListViews <em>List Views</em>}</li>
 *   <li>{@link ui.UIClass#getChildClassViews <em>Child Class Views</em>}</li>
 *   <li>{@link ui.UIClass#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link ui.UIClass#getSelector <em>Selector</em>}</li>
 *   <li>{@link ui.UIClass#isReadonly <em>Readonly</em>}</li>
 *   <li>{@link ui.UIClass#isEnumClass <em>Enum Class</em>}</li>
 *   <li>{@link ui.UIClass#isSingleton <em>Singleton</em>}</li>
 *   <li>{@link ui.UIClass#getSuper <em>Super</em>}</li>
 *   <li>{@link ui.UIClass#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link ui.UIClass#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link ui.UIClass#getInheritedAttributes <em>Inherited Attributes</em>}</li>
 *   <li>{@link ui.UIClass#getInheritedActions <em>Inherited Actions</em>}</li>
 * </ul>
 *
 * @see ui.UiPackage#getUIClass()
 * @model
 * @generated
 */
public interface UIClass extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link ui.UIAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see ui.UiPackage#getUIClass_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<UIAction> getActions();

	/**
	 * Returns the value of the '<em><b>Class Views</b></em>' containment reference list.
	 * The list contents are of type {@link ui.UIClassView}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Views</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Views</em>' containment reference list.
	 * @see ui.UiPackage#getUIClass_ClassViews()
	 * @model containment="true"
	 * @generated
	 */
	EList<UIClassView> getClassViews();

	/**
	 * Returns the value of the '<em><b>List Views</b></em>' containment reference list.
	 * The list contents are of type {@link ui.UIListView}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Views</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Views</em>' containment reference list.
	 * @see ui.UiPackage#getUIClass_ListViews()
	 * @model containment="true"
	 * @generated
	 */
	EList<UIListView> getListViews();

	/**
	 * Returns the value of the '<em><b>Child Class Views</b></em>' reference list.
	 * The list contents are of type {@link ui.UIClassView}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Class Views</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Class Views</em>' reference list.
	 * @see ui.UiPackage#getUIClass_ChildClassViews()
	 * @model
	 * @generated
	 */
	EList<UIClassView> getChildClassViews();

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see ui.UiPackage#getUIClass_Abstract()
	 * @model
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link ui.UIClass#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Selector</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ui.UIListView#getOwnerClass <em>Owner Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selector</em>' reference.
	 * @see #setSelector(UIListView)
	 * @see ui.UiPackage#getUIClass_Selector()
	 * @see ui.UIListView#getOwnerClass
	 * @model opposite="ownerClass" required="true"
	 * @generated
	 */
	UIListView getSelector();

	/**
	 * Sets the value of the '{@link ui.UIClass#getSelector <em>Selector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selector</em>' reference.
	 * @see #getSelector()
	 * @generated
	 */
	void setSelector(UIListView value);

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
	 * @see ui.UiPackage#getUIClass_Readonly()
	 * @model
	 * @generated
	 */
	boolean isReadonly();

	/**
	 * Sets the value of the '{@link ui.UIClass#isReadonly <em>Readonly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Readonly</em>' attribute.
	 * @see #isReadonly()
	 * @generated
	 */
	void setReadonly(boolean value);

	/**
	 * Returns the value of the '<em><b>Enum Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Class</em>' attribute.
	 * @see #setEnumClass(boolean)
	 * @see ui.UiPackage#getUIClass_EnumClass()
	 * @model
	 * @generated
	 */
	boolean isEnumClass();

	/**
	 * Sets the value of the '{@link ui.UIClass#isEnumClass <em>Enum Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum Class</em>' attribute.
	 * @see #isEnumClass()
	 * @generated
	 */
	void setEnumClass(boolean value);

	/**
	 * Returns the value of the '<em><b>Singleton</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Singleton</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Singleton</em>' attribute.
	 * @see #setSingleton(boolean)
	 * @see ui.UiPackage#getUIClass_Singleton()
	 * @model
	 * @generated
	 */
	boolean isSingleton();

	/**
	 * Sets the value of the '{@link ui.UIClass#isSingleton <em>Singleton</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Singleton</em>' attribute.
	 * @see #isSingleton()
	 * @generated
	 */
	void setSingleton(boolean value);

	/**
	 * Returns the value of the '<em><b>Super</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super</em>' reference.
	 * @see #setSuper(UIClass)
	 * @see ui.UiPackage#getUIClass_Super()
	 * @model
	 * @generated
	 */
	UIClass getSuper();

	/**
	 * Sets the value of the '{@link ui.UIClass#getSuper <em>Super</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super</em>' reference.
	 * @see #getSuper()
	 * @generated
	 */
	void setSuper(UIClass value);

	/**
	 * Returns the value of the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Representation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representation</em>' reference.
	 * @see #setRepresentation(UIBaseComponentType)
	 * @see ui.UiPackage#getUIClass_Representation()
	 * @model
	 * @generated
	 */
	UIBaseComponentType getRepresentation();

	/**
	 * Sets the value of the '{@link ui.UIClass#getRepresentation <em>Representation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation</em>' reference.
	 * @see #getRepresentation()
	 * @generated
	 */
	void setRepresentation(UIBaseComponentType value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link ui.UIAttributeComponentType}.
	 * It is bidirectional and its opposite is '{@link ui.UIAttributeComponentType#getOwnerClass <em>Owner Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see ui.UiPackage#getUIClass_Attributes()
	 * @see ui.UIAttributeComponentType#getOwnerClass
	 * @model opposite="ownerClass" containment="true"
	 * @generated
	 */
	EList<UIAttributeComponentType> getAttributes();

	/**
	 * Returns the value of the '<em><b>Inherited Attributes</b></em>' reference list.
	 * The list contents are of type {@link ui.UIAttributeComponentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inherited Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inherited Attributes</em>' reference list.
	 * @see ui.UiPackage#getUIClass_InheritedAttributes()
	 * @model
	 * @generated
	 */
	EList<UIAttributeComponentType> getInheritedAttributes();

	/**
	 * Returns the value of the '<em><b>Inherited Actions</b></em>' reference list.
	 * The list contents are of type {@link ui.UIAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inherited Actions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inherited Actions</em>' reference list.
	 * @see ui.UiPackage#getUIClass_InheritedActions()
	 * @model
	 * @generated
	 */
	EList<UIAction> getInheritedActions();

} // UIClass
