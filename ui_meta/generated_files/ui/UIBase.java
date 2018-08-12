/**
 */
package ui;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ui.UIBase#getModules <em>Modules</em>}</li>
 *   <li>{@link ui.UIBase#getInfo <em>Info</em>}</li>
 *   <li>{@link ui.UIBase#getMainMenu <em>Main Menu</em>}</li>
 * </ul>
 *
 * @see ui.UiPackage#getUIBase()
 * @model
 * @generated
 */
public interface UIBase extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
	 * The list contents are of type {@link ui.UIModule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' containment reference list.
	 * @see ui.UiPackage#getUIBase_Modules()
	 * @model containment="true"
	 * @generated
	 */
	EList<UIModule> getModules();

	/**
	 * Returns the value of the '<em><b>Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info</em>' containment reference.
	 * @see #setInfo(UIInfo)
	 * @see ui.UiPackage#getUIBase_Info()
	 * @model containment="true" required="true"
	 * @generated
	 */
	UIInfo getInfo();

	/**
	 * Sets the value of the '{@link ui.UIBase#getInfo <em>Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Info</em>' containment reference.
	 * @see #getInfo()
	 * @generated
	 */
	void setInfo(UIInfo value);

	/**
	 * Returns the value of the '<em><b>Main Menu</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Menu</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Menu</em>' containment reference.
	 * @see #setMainMenu(UIMenuItem)
	 * @see ui.UiPackage#getUIBase_MainMenu()
	 * @model containment="true" required="true"
	 * @generated
	 */
	UIMenuItem getMainMenu();

	/**
	 * Sets the value of the '{@link ui.UIBase#getMainMenu <em>Main Menu</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Menu</em>' containment reference.
	 * @see #getMainMenu()
	 * @generated
	 */
	void setMainMenu(UIMenuItem value);

} // UIBase
