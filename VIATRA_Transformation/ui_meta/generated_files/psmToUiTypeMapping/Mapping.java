/**
 */
package psmToUiTypeMapping;

import org.eclipse.emf.ecore.EObject;

import psm.JPrimitive;

import ui.UIBaseComponentType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link psmToUiTypeMapping.Mapping#getPsmType <em>Psm Type</em>}</li>
 *   <li>{@link psmToUiTypeMapping.Mapping#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link psmToUiTypeMapping.Mapping#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see psmToUiTypeMapping.PsmToUiTypeMappingPackage#getMapping()
 * @model
 * @generated
 */
public interface Mapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Psm Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Psm Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Psm Type</em>' reference.
	 * @see #setPsmType(JPrimitive)
	 * @see psmToUiTypeMapping.PsmToUiTypeMappingPackage#getMapping_PsmType()
	 * @model required="true"
	 * @generated
	 */
	JPrimitive getPsmType();

	/**
	 * Sets the value of the '{@link psmToUiTypeMapping.Mapping#getPsmType <em>Psm Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Psm Type</em>' reference.
	 * @see #getPsmType()
	 * @generated
	 */
	void setPsmType(JPrimitive value);

	/**
	 * Returns the value of the '<em><b>Component Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Type</em>' reference.
	 * @see #setComponentType(UIBaseComponentType)
	 * @see psmToUiTypeMapping.PsmToUiTypeMappingPackage#getMapping_ComponentType()
	 * @model required="true"
	 * @generated
	 */
	UIBaseComponentType getComponentType();

	/**
	 * Sets the value of the '{@link psmToUiTypeMapping.Mapping#getComponentType <em>Component Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Type</em>' reference.
	 * @see #getComponentType()
	 * @generated
	 */
	void setComponentType(UIBaseComponentType value);

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
	 * @see psmToUiTypeMapping.PsmToUiTypeMappingPackage#getMapping_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link psmToUiTypeMapping.Mapping#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Mapping
