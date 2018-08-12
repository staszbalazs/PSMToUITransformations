/**
 */
package psm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JInfo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link psm.JInfo#getSubmodels <em>Submodels</em>}</li>
 * </ul>
 *
 * @see psm.PsmPackage#getJInfo()
 * @model
 * @generated
 */
public interface JInfo extends JElement {
	/**
	 * Returns the value of the '<em><b>Submodels</b></em>' containment reference list.
	 * The list contents are of type {@link psm.JSubmodel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Submodels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submodels</em>' containment reference list.
	 * @see psm.PsmPackage#getJInfo_Submodels()
	 * @model containment="true"
	 * @generated
	 */
	EList<JSubmodel> getSubmodels();

} // JInfo
