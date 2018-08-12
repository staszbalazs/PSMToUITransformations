/**
 */
package ui;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ui.UIView#getViewFieldSets <em>View Field Sets</em>}</li>
 *   <li>{@link ui.UIView#getPageSize <em>Page Size</em>}</li>
 *   <li>{@link ui.UIView#isIsDefault <em>Is Default</em>}</li>
 *   <li>{@link ui.UIView#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @see ui.UiPackage#getUIView()
 * @model abstract="true"
 * @generated
 */
public interface UIView extends Identifiable {
	/**
	 * Returns the value of the '<em><b>View Field Sets</b></em>' containment reference list.
	 * The list contents are of type {@link ui.UIViewFieldSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Field Sets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Field Sets</em>' containment reference list.
	 * @see ui.UiPackage#getUIView_ViewFieldSets()
	 * @model containment="true"
	 * @generated
	 */
	EList<UIViewFieldSet> getViewFieldSets();

	/**
	 * Returns the value of the '<em><b>Page Size</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Size</em>' attribute.
	 * @see #setPageSize(int)
	 * @see ui.UiPackage#getUIView_PageSize()
	 * @model default="1"
	 * @generated
	 */
	int getPageSize();

	/**
	 * Sets the value of the '{@link ui.UIView#getPageSize <em>Page Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Size</em>' attribute.
	 * @see #getPageSize()
	 * @generated
	 */
	void setPageSize(int value);

	/**
	 * Returns the value of the '<em><b>Is Default</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Default</em>' attribute.
	 * @see #setIsDefault(boolean)
	 * @see ui.UiPackage#getUIView_IsDefault()
	 * @model default="true"
	 * @generated
	 */
	boolean isIsDefault();

	/**
	 * Sets the value of the '{@link ui.UIView#isIsDefault <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Default</em>' attribute.
	 * @see #isIsDefault()
	 * @generated
	 */
	void setIsDefault(boolean value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' attribute.
	 * @see #setColumns(int)
	 * @see ui.UiPackage#getUIView_Columns()
	 * @model default="2"
	 * @generated
	 */
	int getColumns();

	/**
	 * Sets the value of the '{@link ui.UIView#getColumns <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columns</em>' attribute.
	 * @see #getColumns()
	 * @generated
	 */
	void setColumns(int value);

} // UIView
