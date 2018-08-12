/**
 */
package ui;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI View Field Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ui.UIViewFieldSet#getViewFields <em>View Fields</em>}</li>
 *   <li>{@link ui.UIViewFieldSet#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see ui.UiPackage#getUIViewFieldSet()
 * @model
 * @generated
 */
public interface UIViewFieldSet extends Identifiable {
	/**
	 * Returns the value of the '<em><b>View Fields</b></em>' containment reference list.
	 * The list contents are of type {@link ui.UIViewField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Fields</em>' containment reference list.
	 * @see ui.UiPackage#getUIViewFieldSet_ViewFields()
	 * @model containment="true"
	 * @generated
	 */
	EList<UIViewField> getViewFields();

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
	 * @see ui.UiPackage#getUIViewFieldSet_Position()
	 * @model default="1"
	 * @generated
	 */
	int getPosition();

	/**
	 * Sets the value of the '{@link ui.UIViewFieldSet#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(int value);

} // UIViewFieldSet
