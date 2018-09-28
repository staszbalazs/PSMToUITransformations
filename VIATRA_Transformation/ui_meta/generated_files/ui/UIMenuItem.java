/**
 */
package ui;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Menu Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ui.UIMenuItem#getMenuView <em>Menu View</em>}</li>
 *   <li>{@link ui.UIMenuItem#getFilters <em>Filters</em>}</li>
 *   <li>{@link ui.UIMenuItem#getMenuItems <em>Menu Items</em>}</li>
 *   <li>{@link ui.UIMenuItem#getOwnerMenuItem <em>Owner Menu Item</em>}</li>
 * </ul>
 *
 * @see ui.UiPackage#getUIMenuItem()
 * @model
 * @generated
 */
public interface UIMenuItem extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Menu View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menu View</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menu View</em>' reference.
	 * @see #setMenuView(UIView)
	 * @see ui.UiPackage#getUIMenuItem_MenuView()
	 * @model
	 * @generated
	 */
	UIView getMenuView();

	/**
	 * Sets the value of the '{@link ui.UIMenuItem#getMenuView <em>Menu View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Menu View</em>' reference.
	 * @see #getMenuView()
	 * @generated
	 */
	void setMenuView(UIView value);

	/**
	 * Returns the value of the '<em><b>Filters</b></em>' containment reference list.
	 * The list contents are of type {@link ui.UIFilter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filters</em>' containment reference list.
	 * @see ui.UiPackage#getUIMenuItem_Filters()
	 * @model containment="true"
	 * @generated
	 */
	EList<UIFilter> getFilters();

	/**
	 * Returns the value of the '<em><b>Menu Items</b></em>' containment reference list.
	 * The list contents are of type {@link ui.UIMenuItem}.
	 * It is bidirectional and its opposite is '{@link ui.UIMenuItem#getOwnerMenuItem <em>Owner Menu Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menu Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menu Items</em>' containment reference list.
	 * @see ui.UiPackage#getUIMenuItem_MenuItems()
	 * @see ui.UIMenuItem#getOwnerMenuItem
	 * @model opposite="ownerMenuItem" containment="true"
	 * @generated
	 */
	EList<UIMenuItem> getMenuItems();

	/**
	 * Returns the value of the '<em><b>Owner Menu Item</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ui.UIMenuItem#getMenuItems <em>Menu Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner Menu Item</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Menu Item</em>' container reference.
	 * @see #setOwnerMenuItem(UIMenuItem)
	 * @see ui.UiPackage#getUIMenuItem_OwnerMenuItem()
	 * @see ui.UIMenuItem#getMenuItems
	 * @model opposite="menuItems" transient="false"
	 * @generated
	 */
	UIMenuItem getOwnerMenuItem();

	/**
	 * Sets the value of the '{@link ui.UIMenuItem#getOwnerMenuItem <em>Owner Menu Item</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Menu Item</em>' container reference.
	 * @see #getOwnerMenuItem()
	 * @generated
	 */
	void setOwnerMenuItem(UIMenuItem value);

} // UIMenuItem
