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

} // UIListView
