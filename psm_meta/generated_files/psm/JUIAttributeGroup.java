/**
 */
package psm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JUI Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link psm.JUIAttributeGroup#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link psm.JUIAttributeGroup#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see psm.PsmPackage#getJUIAttributeGroup()
 * @model
 * @generated
 */
public interface JUIAttributeGroup extends JElement {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' reference list.
	 * The list contents are of type {@link psm.JAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' reference list.
	 * @see psm.PsmPackage#getJUIAttributeGroup_Attributes()
	 * @model
	 * @generated
	 */
	EList<JAttribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(int)
	 * @see psm.PsmPackage#getJUIAttributeGroup_Position()
	 * @model
	 * @generated
	 */
	int getPosition();

	/**
	 * Sets the value of the '{@link psm.JUIAttributeGroup#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(int value);

} // JUIAttributeGroup
