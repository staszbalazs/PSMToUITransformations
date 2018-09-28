/**
 */
package psm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JOperation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link psm.JOperation#isClassBased <em>Class Based</em>}</li>
 *   <li>{@link psm.JOperation#getOwnerClass <em>Owner Class</em>}</li>
 *   <li>{@link psm.JOperation#getParameters <em>Parameters</em>}</li>
 *   <li>{@link psm.JOperation#getTransition <em>Transition</em>}</li>
 *   <li>{@link psm.JOperation#isBulk <em>Bulk</em>}</li>
 *   <li>{@link psm.JOperation#getKind <em>Kind</em>}</li>
 *   <li>{@link psm.JOperation#isUiMustConfirm <em>Ui Must Confirm</em>}</li>
 * </ul>
 *
 * @see psm.PsmPackage#getJOperation()
 * @model
 * @generated
 */
public interface JOperation extends JElement {
	/**
	 * Returns the value of the '<em><b>Class Based</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Based</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Based</em>' attribute.
	 * @see #setClassBased(boolean)
	 * @see psm.PsmPackage#getJOperation_ClassBased()
	 * @model
	 * @generated
	 */
	boolean isClassBased();

	/**
	 * Sets the value of the '{@link psm.JOperation#isClassBased <em>Class Based</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Based</em>' attribute.
	 * @see #isClassBased()
	 * @generated
	 */
	void setClassBased(boolean value);

	/**
	 * Returns the value of the '<em><b>Owner Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link psm.JClass#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner Class</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Class</em>' container reference.
	 * @see #setOwnerClass(JClass)
	 * @see psm.PsmPackage#getJOperation_OwnerClass()
	 * @see psm.JClass#getOperations
	 * @model opposite="operations" transient="false"
	 * @generated
	 */
	JClass getOwnerClass();

	/**
	 * Sets the value of the '{@link psm.JOperation#getOwnerClass <em>Owner Class</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Class</em>' container reference.
	 * @see #getOwnerClass()
	 * @generated
	 */
	void setOwnerClass(JClass value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link psm.JParameter}.
	 * It is bidirectional and its opposite is '{@link psm.JParameter#getOwnerOperation <em>Owner Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see psm.PsmPackage#getJOperation_Parameters()
	 * @see psm.JParameter#getOwnerOperation
	 * @model opposite="ownerOperation" containment="true"
	 * @generated
	 */
	EList<JParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' reference list.
	 * The list contents are of type {@link psm.JTransition}.
	 * It is bidirectional and its opposite is '{@link psm.JTransition#getExecutingOperation <em>Executing Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' reference list.
	 * @see psm.PsmPackage#getJOperation_Transition()
	 * @see psm.JTransition#getExecutingOperation
	 * @model opposite="executingOperation"
	 * @generated
	 */
	EList<JTransition> getTransition();

	/**
	 * Returns the value of the '<em><b>Bulk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bulk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bulk</em>' attribute.
	 * @see #setBulk(boolean)
	 * @see psm.PsmPackage#getJOperation_Bulk()
	 * @model
	 * @generated
	 */
	boolean isBulk();

	/**
	 * Sets the value of the '{@link psm.JOperation#isBulk <em>Bulk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bulk</em>' attribute.
	 * @see #isBulk()
	 * @generated
	 */
	void setBulk(boolean value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link psm.JOperationKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see psm.JOperationKind
	 * @see #setKind(JOperationKind)
	 * @see psm.PsmPackage#getJOperation_Kind()
	 * @model
	 * @generated
	 */
	JOperationKind getKind();

	/**
	 * Sets the value of the '{@link psm.JOperation#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see psm.JOperationKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(JOperationKind value);

	/**
	 * Returns the value of the '<em><b>Ui Must Confirm</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ui Must Confirm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ui Must Confirm</em>' attribute.
	 * @see #setUiMustConfirm(boolean)
	 * @see psm.PsmPackage#getJOperation_UiMustConfirm()
	 * @model default="false"
	 * @generated
	 */
	boolean isUiMustConfirm();

	/**
	 * Sets the value of the '{@link psm.JOperation#isUiMustConfirm <em>Ui Must Confirm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ui Must Confirm</em>' attribute.
	 * @see #isUiMustConfirm()
	 * @generated
	 */
	void setUiMustConfirm(boolean value);

} // JOperation
