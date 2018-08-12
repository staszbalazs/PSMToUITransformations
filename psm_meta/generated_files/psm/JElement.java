/**
 */
package psm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JElement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link psm.JElement#getUuid <em>Uuid</em>}</li>
 *   <li>{@link psm.JElement#getName <em>Name</em>}</li>
 *   <li>{@link psm.JElement#getShortName <em>Short Name</em>}</li>
 *   <li>{@link psm.JElement#getFullName <em>Full Name</em>}</li>
 *   <li>{@link psm.JElement#getDescription <em>Description</em>}</li>
 *   <li>{@link psm.JElement#isFramework <em>Framework</em>}</li>
 *   <li>{@link psm.JElement#getParticipates <em>Participates</em>}</li>
 *   <li>{@link psm.JElement#getVisibility <em>Visibility</em>}</li>
 * </ul>
 *
 * @see psm.PsmPackage#getJElement()
 * @model abstract="true"
 * @generated
 */
public interface JElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uuid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(String)
	 * @see psm.PsmPackage#getJElement_Uuid()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link psm.JElement#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see psm.PsmPackage#getJElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link psm.JElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Short Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Name</em>' attribute.
	 * @see #setShortName(String)
	 * @see psm.PsmPackage#getJElement_ShortName()
	 * @model
	 * @generated
	 */
	String getShortName();

	/**
	 * Sets the value of the '{@link psm.JElement#getShortName <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Name</em>' attribute.
	 * @see #getShortName()
	 * @generated
	 */
	void setShortName(String value);

	/**
	 * Returns the value of the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Full Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Name</em>' attribute.
	 * @see #setFullName(String)
	 * @see psm.PsmPackage#getJElement_FullName()
	 * @model
	 * @generated
	 */
	String getFullName();

	/**
	 * Sets the value of the '{@link psm.JElement#getFullName <em>Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Name</em>' attribute.
	 * @see #getFullName()
	 * @generated
	 */
	void setFullName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see psm.PsmPackage#getJElement_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link psm.JElement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Framework</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Framework</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Framework</em>' attribute.
	 * @see #setFramework(boolean)
	 * @see psm.PsmPackage#getJElement_Framework()
	 * @model
	 * @generated
	 */
	boolean isFramework();

	/**
	 * Sets the value of the '{@link psm.JElement#isFramework <em>Framework</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Framework</em>' attribute.
	 * @see #isFramework()
	 * @generated
	 */
	void setFramework(boolean value);

	/**
	 * Returns the value of the '<em><b>Participates</b></em>' attribute list.
	 * The list contents are of type {@link psm.JLayer}.
	 * The literals are from the enumeration {@link psm.JLayer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participates</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participates</em>' attribute list.
	 * @see psm.JLayer
	 * @see psm.PsmPackage#getJElement_Participates()
	 * @model
	 * @generated
	 */
	EList<JLayer> getParticipates();

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link psm.JVisibility}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see psm.JVisibility
	 * @see #setVisibility(JVisibility)
	 * @see psm.PsmPackage#getJElement_Visibility()
	 * @model
	 * @generated
	 */
	JVisibility getVisibility();

	/**
	 * Sets the value of the '{@link psm.JElement#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see psm.JVisibility
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(JVisibility value);

} // JElement
