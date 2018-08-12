/**
 */
package ui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI List View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ui.UIListView#getDetailView <em>Detail View</em>}</li>
 *   <li>{@link ui.UIListView#getOwnerClass <em>Owner Class</em>}</li>
 * </ul>
 *
 * @see ui.UiPackage#getUIListView()
 * @model
 * @generated
 */
public interface UIListView extends UIView {
	/**
	 * Returns the value of the '<em><b>Detail View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detail View</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detail View</em>' reference.
	 * @see #setDetailView(UIClassView)
	 * @see ui.UiPackage#getUIListView_DetailView()
	 * @model
	 * @generated
	 */
	UIClassView getDetailView();

	/**
	 * Sets the value of the '{@link ui.UIListView#getDetailView <em>Detail View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail View</em>' reference.
	 * @see #getDetailView()
	 * @generated
	 */
	void setDetailView(UIClassView value);

	/**
	 * Returns the value of the '<em><b>Owner Class</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ui.UIClass#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Class</em>' reference.
	 * @see #setOwnerClass(UIClass)
	 * @see ui.UiPackage#getUIListView_OwnerClass()
	 * @see ui.UIClass#getSelector
	 * @model opposite="selector"
	 * @generated
	 */
	UIClass getOwnerClass();

	/**
	 * Sets the value of the '{@link ui.UIListView#getOwnerClass <em>Owner Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Class</em>' reference.
	 * @see #getOwnerClass()
	 * @generated
	 */
	void setOwnerClass(UIClass value);

} // UIListView
