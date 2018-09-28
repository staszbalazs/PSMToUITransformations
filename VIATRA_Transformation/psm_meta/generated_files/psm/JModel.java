/**
 */
package psm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JModel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link psm.JModel#getPackages <em>Packages</em>}</li>
 *   <li>{@link psm.JModel#getPackagePrefix <em>Package Prefix</em>}</li>
 *   <li>{@link psm.JModel#getApplicationTop <em>Application Top</em>}</li>
 *   <li>{@link psm.JModel#getRootMenuItems <em>Root Menu Items</em>}</li>
 *   <li>{@link psm.JModel#getInfo <em>Info</em>}</li>
 * </ul>
 *
 * @see psm.PsmPackage#getJModel()
 * @model
 * @generated
 */
public interface JModel extends JElement {
	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
	 * The list contents are of type {@link psm.JPackage}.
	 * It is bidirectional and its opposite is '{@link psm.JPackage#getOwnerModel <em>Owner Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see psm.PsmPackage#getJModel_Packages()
	 * @see psm.JPackage#getOwnerModel
	 * @model opposite="ownerModel" containment="true"
	 * @generated
	 */
	EList<JPackage> getPackages();

	/**
	 * Returns the value of the '<em><b>Package Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Prefix</em>' attribute.
	 * @see #setPackagePrefix(String)
	 * @see psm.PsmPackage#getJModel_PackagePrefix()
	 * @model
	 * @generated
	 */
	String getPackagePrefix();

	/**
	 * Sets the value of the '{@link psm.JModel#getPackagePrefix <em>Package Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Prefix</em>' attribute.
	 * @see #getPackagePrefix()
	 * @generated
	 */
	void setPackagePrefix(String value);

	/**
	 * Returns the value of the '<em><b>Application Top</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Top</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Top</em>' reference.
	 * @see #setApplicationTop(JPackage)
	 * @see psm.PsmPackage#getJModel_ApplicationTop()
	 * @model required="true"
	 * @generated
	 */
	JPackage getApplicationTop();

	/**
	 * Sets the value of the '{@link psm.JModel#getApplicationTop <em>Application Top</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Top</em>' reference.
	 * @see #getApplicationTop()
	 * @generated
	 */
	void setApplicationTop(JPackage value);

	/**
	 * Returns the value of the '<em><b>Root Menu Items</b></em>' containment reference list.
	 * The list contents are of type {@link psm.JUIMenuItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Menu Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Menu Items</em>' containment reference list.
	 * @see psm.PsmPackage#getJModel_RootMenuItems()
	 * @model containment="true"
	 * @generated
	 */
	EList<JUIMenuItem> getRootMenuItems();

	/**
	 * Returns the value of the '<em><b>Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info</em>' containment reference.
	 * @see #setInfo(JInfo)
	 * @see psm.PsmPackage#getJModel_Info()
	 * @model containment="true"
	 * @generated
	 */
	JInfo getInfo();

	/**
	 * Sets the value of the '{@link psm.JModel#getInfo <em>Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Info</em>' containment reference.
	 * @see #getInfo()
	 * @generated
	 */
	void setInfo(JInfo value);

} // JModel
