/**
 */
package ui;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ui.UIModule#getFullyQualifiedName <em>Fully Qualified Name</em>}</li>
 *   <li>{@link ui.UIModule#getClasses <em>Classes</em>}</li>
 *   <li>{@link ui.UIModule#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see ui.UiPackage#getUIModule()
 * @model
 * @generated
 */
public interface UIModule extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Fully Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fully Qualified Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fully Qualified Name</em>' attribute.
	 * @see #setFullyQualifiedName(String)
	 * @see ui.UiPackage#getUIModule_FullyQualifiedName()
	 * @model required="true"
	 * @generated
	 */
	String getFullyQualifiedName();

	/**
	 * Sets the value of the '{@link ui.UIModule#getFullyQualifiedName <em>Fully Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fully Qualified Name</em>' attribute.
	 * @see #getFullyQualifiedName()
	 * @generated
	 */
	void setFullyQualifiedName(String value);

	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link ui.UIClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see ui.UiPackage#getUIModule_Classes()
	 * @model containment="true"
	 * @generated
	 */
	EList<UIClass> getClasses();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see ui.UiPackage#getUIModule_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link ui.UIModule#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // UIModule
