/**
 */
package psm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JUI Menu Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link psm.JUIMenuItem#getChildren <em>Children</em>}</li>
 *   <li>{@link psm.JUIMenuItem#getParent <em>Parent</em>}</li>
 *   <li>{@link psm.JUIMenuItem#getRepresent <em>Represent</em>}</li>
 *   <li>{@link psm.JUIMenuItem#getUifilters <em>Uifilters</em>}</li>
 *   <li>{@link psm.JUIMenuItem#getType <em>Type</em>}</li>
 *   <li>{@link psm.JUIMenuItem#getAlias <em>Alias</em>}</li>
 * </ul>
 *
 * @see psm.PsmPackage#getJUIMenuItem()
 * @model
 * @generated
 */
public interface JUIMenuItem extends JElement {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link psm.JUIMenuItem}.
	 * It is bidirectional and its opposite is '{@link psm.JUIMenuItem#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see psm.PsmPackage#getJUIMenuItem_Children()
	 * @see psm.JUIMenuItem#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<JUIMenuItem> getChildren();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link psm.JUIMenuItem#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(JUIMenuItem)
	 * @see psm.PsmPackage#getJUIMenuItem_Parent()
	 * @see psm.JUIMenuItem#getChildren
	 * @model opposite="children" transient="false"
	 * @generated
	 */
	JUIMenuItem getParent();

	/**
	 * Sets the value of the '{@link psm.JUIMenuItem#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(JUIMenuItem value);

	/**
	 * Returns the value of the '<em><b>Represent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Represent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Represent</em>' reference.
	 * @see #setRepresent(JClass)
	 * @see psm.PsmPackage#getJUIMenuItem_Represent()
	 * @model
	 * @generated
	 */
	JClass getRepresent();

	/**
	 * Sets the value of the '{@link psm.JUIMenuItem#getRepresent <em>Represent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Represent</em>' reference.
	 * @see #getRepresent()
	 * @generated
	 */
	void setRepresent(JClass value);

	/**
	 * Returns the value of the '<em><b>Uifilters</b></em>' containment reference list.
	 * The list contents are of type {@link psm.JUIFilter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uifilters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uifilters</em>' containment reference list.
	 * @see psm.PsmPackage#getJUIMenuItem_Uifilters()
	 * @model containment="true"
	 * @generated
	 */
	EList<JUIFilter> getUifilters();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link psm.JMenuItemType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see psm.JMenuItemType
	 * @see #setType(JMenuItemType)
	 * @see psm.PsmPackage#getJUIMenuItem_Type()
	 * @model
	 * @generated
	 */
	JMenuItemType getType();

	/**
	 * Sets the value of the '{@link psm.JUIMenuItem#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see psm.JMenuItemType
	 * @see #getType()
	 * @generated
	 */
	void setType(JMenuItemType value);

	/**
	 * Returns the value of the '<em><b>Alias</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' reference.
	 * @see #setAlias(JUIAlias)
	 * @see psm.PsmPackage#getJUIMenuItem_Alias()
	 * @model
	 * @generated
	 */
	JUIAlias getAlias();

	/**
	 * Sets the value of the '{@link psm.JUIMenuItem#getAlias <em>Alias</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' reference.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(JUIAlias value);

} // JUIMenuItem
