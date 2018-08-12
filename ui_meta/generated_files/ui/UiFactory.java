/**
 */
package ui;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ui.UiPackage
 * @generated
 */
public interface UiFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UiFactory eINSTANCE = ui.impl.UiFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>UI Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI Module</em>'.
	 * @generated
	 */
	UIModule createUIModule();

	/**
	 * Returns a new object of class '<em>UI Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI Class</em>'.
	 * @generated
	 */
	UIClass createUIClass();

	/**
	 * Returns a new object of class '<em>UI Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI Action</em>'.
	 * @generated
	 */
	UIAction createUIAction();

	/**
	 * Returns a new object of class '<em>UI View Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI View Field</em>'.
	 * @generated
	 */
	UIViewField createUIViewField();

	/**
	 * Returns a new object of class '<em>UI View Field Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI View Field Set</em>'.
	 * @generated
	 */
	UIViewFieldSet createUIViewFieldSet();

	/**
	 * Returns a new object of class '<em>UI Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI Base</em>'.
	 * @generated
	 */
	UIBase createUIBase();

	/**
	 * Returns a new object of class '<em>UI Menu Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI Menu Item</em>'.
	 * @generated
	 */
	UIMenuItem createUIMenuItem();

	/**
	 * Returns a new object of class '<em>UI Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI Filter</em>'.
	 * @generated
	 */
	UIFilter createUIFilter();

	/**
	 * Returns a new object of class '<em>UI Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI Interval</em>'.
	 * @generated
	 */
	UIInterval createUIInterval();

	/**
	 * Returns a new object of class '<em>UI Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI Info</em>'.
	 * @generated
	 */
	UIInfo createUIInfo();

	/**
	 * Returns a new object of class '<em>UI List View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI List View</em>'.
	 * @generated
	 */
	UIListView createUIListView();

	/**
	 * Returns a new object of class '<em>UI Class View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI Class View</em>'.
	 * @generated
	 */
	UIClassView createUIClassView();

	/**
	 * Returns a new object of class '<em>UI Result View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI Result View</em>'.
	 * @generated
	 */
	UIResultView createUIResultView();

	/**
	 * Returns a new object of class '<em>UI Param View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI Param View</em>'.
	 * @generated
	 */
	UIParamView createUIParamView();

	/**
	 * Returns a new object of class '<em>UI Base Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI Base Component Type</em>'.
	 * @generated
	 */
	UIBaseComponentType createUIBaseComponentType();

	/**
	 * Returns a new object of class '<em>UI Reference Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI Reference Component Type</em>'.
	 * @generated
	 */
	UIReferenceComponentType createUIReferenceComponentType();

	/**
	 * Returns a new object of class '<em>UI Parameter Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI Parameter Component Type</em>'.
	 * @generated
	 */
	UIParameterComponentType createUIParameterComponentType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UiPackage getUiPackage();

} //UiFactory
