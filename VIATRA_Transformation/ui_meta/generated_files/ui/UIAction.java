/**
 */
package ui;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ui.UIAction#getParamView <em>Param View</em>}</li>
 *   <li>{@link ui.UIAction#isInherited <em>Inherited</em>}</li>
 *   <li>{@link ui.UIAction#isClassBased <em>Class Based</em>}</li>
 *   <li>{@link ui.UIAction#isToBeConfirmed <em>To Be Confirmed</em>}</li>
 *   <li>{@link ui.UIAction#isNotBulk <em>Not Bulk</em>}</li>
 *   <li>{@link ui.UIAction#isIsQuery <em>Is Query</em>}</li>
 *   <li>{@link ui.UIAction#getResultView <em>Result View</em>}</li>
 *   <li>{@link ui.UIAction#getResult <em>Result</em>}</li>
 *   <li>{@link ui.UIAction#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see ui.UiPackage#getUIAction()
 * @model
 * @generated
 */
public interface UIAction extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Param View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param View</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param View</em>' containment reference.
	 * @see #setParamView(UIParamView)
	 * @see ui.UiPackage#getUIAction_ParamView()
	 * @model containment="true" required="true"
	 * @generated
	 */
	UIParamView getParamView();

	/**
	 * Sets the value of the '{@link ui.UIAction#getParamView <em>Param View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param View</em>' containment reference.
	 * @see #getParamView()
	 * @generated
	 */
	void setParamView(UIParamView value);

	/**
	 * Returns the value of the '<em><b>Inherited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inherited</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inherited</em>' attribute.
	 * @see #setInherited(boolean)
	 * @see ui.UiPackage#getUIAction_Inherited()
	 * @model
	 * @generated
	 */
	boolean isInherited();

	/**
	 * Sets the value of the '{@link ui.UIAction#isInherited <em>Inherited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inherited</em>' attribute.
	 * @see #isInherited()
	 * @generated
	 */
	void setInherited(boolean value);

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
	 * @see ui.UiPackage#getUIAction_ClassBased()
	 * @model
	 * @generated
	 */
	boolean isClassBased();

	/**
	 * Sets the value of the '{@link ui.UIAction#isClassBased <em>Class Based</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Based</em>' attribute.
	 * @see #isClassBased()
	 * @generated
	 */
	void setClassBased(boolean value);

	/**
	 * Returns the value of the '<em><b>To Be Confirmed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Be Confirmed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Be Confirmed</em>' attribute.
	 * @see #setToBeConfirmed(boolean)
	 * @see ui.UiPackage#getUIAction_ToBeConfirmed()
	 * @model
	 * @generated
	 */
	boolean isToBeConfirmed();

	/**
	 * Sets the value of the '{@link ui.UIAction#isToBeConfirmed <em>To Be Confirmed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Be Confirmed</em>' attribute.
	 * @see #isToBeConfirmed()
	 * @generated
	 */
	void setToBeConfirmed(boolean value);

	/**
	 * Returns the value of the '<em><b>Not Bulk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Not Bulk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Bulk</em>' attribute.
	 * @see #setNotBulk(boolean)
	 * @see ui.UiPackage#getUIAction_NotBulk()
	 * @model
	 * @generated
	 */
	boolean isNotBulk();

	/**
	 * Sets the value of the '{@link ui.UIAction#isNotBulk <em>Not Bulk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not Bulk</em>' attribute.
	 * @see #isNotBulk()
	 * @generated
	 */
	void setNotBulk(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Query</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Query</em>' attribute.
	 * @see #setIsQuery(boolean)
	 * @see ui.UiPackage#getUIAction_IsQuery()
	 * @model
	 * @generated
	 */
	boolean isIsQuery();

	/**
	 * Sets the value of the '{@link ui.UIAction#isIsQuery <em>Is Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Query</em>' attribute.
	 * @see #isIsQuery()
	 * @generated
	 */
	void setIsQuery(boolean value);

	/**
	 * Returns the value of the '<em><b>Result View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result View</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result View</em>' containment reference.
	 * @see #setResultView(UIResultView)
	 * @see ui.UiPackage#getUIAction_ResultView()
	 * @model containment="true"
	 * @generated
	 */
	UIResultView getResultView();

	/**
	 * Sets the value of the '{@link ui.UIAction#getResultView <em>Result View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result View</em>' containment reference.
	 * @see #getResultView()
	 * @generated
	 */
	void setResultView(UIResultView value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(UIParameterComponentType)
	 * @see ui.UiPackage#getUIAction_Result()
	 * @model containment="true"
	 * @generated
	 */
	UIParameterComponentType getResult();

	/**
	 * Sets the value of the '{@link ui.UIAction#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(UIParameterComponentType value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link ui.UIParameterComponentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see ui.UiPackage#getUIAction_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<UIParameterComponentType> getParameters();

} // UIAction
