/**
 */
package ui;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ui.UIInfo#getUserClass <em>User Class</em>}</li>
 *   <li>{@link ui.UIInfo#getVersions <em>Versions</em>}</li>
 *   <li>{@link ui.UIInfo#getSubmodels <em>Submodels</em>}</li>
 * </ul>
 *
 * @see ui.UiPackage#getUIInfo()
 * @model
 * @generated
 */
public interface UIInfo extends Identifiable {
	/**
	 * Returns the value of the '<em><b>User Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Class</em>' attribute.
	 * @see #setUserClass(String)
	 * @see ui.UiPackage#getUIInfo_UserClass()
	 * @model
	 * @generated
	 */
	String getUserClass();

	/**
	 * Sets the value of the '{@link ui.UIInfo#getUserClass <em>User Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Class</em>' attribute.
	 * @see #getUserClass()
	 * @generated
	 */
	void setUserClass(String value);

	/**
	 * Returns the value of the '<em><b>Versions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Versions</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Versions</em>' attribute list.
	 * @see ui.UiPackage#getUIInfo_Versions()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getVersions();

	/**
	 * Returns the value of the '<em><b>Submodels</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Submodels</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submodels</em>' attribute list.
	 * @see ui.UiPackage#getUIInfo_Submodels()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getSubmodels();

} // UIInfo
