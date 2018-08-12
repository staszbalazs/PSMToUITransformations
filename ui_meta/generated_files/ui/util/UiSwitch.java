/**
 */
package ui.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import ui.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ui.UiPackage
 * @generated
 */
public class UiSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UiPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiSwitch() {
		if (modelPackage == null) {
			modelPackage = UiPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case UiPackage.UI_MODULE: {
				UIModule uiModule = (UIModule)theEObject;
				T result = caseUIModule(uiModule);
				if (result == null) result = caseIdentifiable(uiModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.UI_CLASS: {
				UIClass uiClass = (UIClass)theEObject;
				T result = caseUIClass(uiClass);
				if (result == null) result = caseIdentifiable(uiClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.UI_ACTION: {
				UIAction uiAction = (UIAction)theEObject;
				T result = caseUIAction(uiAction);
				if (result == null) result = caseIdentifiable(uiAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.UI_VIEW_FIELD: {
				UIViewField uiViewField = (UIViewField)theEObject;
				T result = caseUIViewField(uiViewField);
				if (result == null) result = caseIdentifiable(uiViewField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.UI_VIEW_FIELD_SET: {
				UIViewFieldSet uiViewFieldSet = (UIViewFieldSet)theEObject;
				T result = caseUIViewFieldSet(uiViewFieldSet);
				if (result == null) result = caseIdentifiable(uiViewFieldSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.UI_VIEW: {
				UIView uiView = (UIView)theEObject;
				T result = caseUIView(uiView);
				if (result == null) result = caseIdentifiable(uiView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.UI_BASE: {
				UIBase uiBase = (UIBase)theEObject;
				T result = caseUIBase(uiBase);
				if (result == null) result = caseIdentifiable(uiBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.IDENTIFIABLE: {
				Identifiable identifiable = (Identifiable)theEObject;
				T result = caseIdentifiable(identifiable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.UI_MENU_ITEM: {
				UIMenuItem uiMenuItem = (UIMenuItem)theEObject;
				T result = caseUIMenuItem(uiMenuItem);
				if (result == null) result = caseIdentifiable(uiMenuItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.UI_FILTER: {
				UIFilter uiFilter = (UIFilter)theEObject;
				T result = caseUIFilter(uiFilter);
				if (result == null) result = caseIdentifiable(uiFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.UI_INTERVAL: {
				UIInterval uiInterval = (UIInterval)theEObject;
				T result = caseUIInterval(uiInterval);
				if (result == null) result = caseIdentifiable(uiInterval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.UI_INFO: {
				UIInfo uiInfo = (UIInfo)theEObject;
				T result = caseUIInfo(uiInfo);
				if (result == null) result = caseIdentifiable(uiInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.UI_COMPONENT_TYPE: {
				UIComponentType uiComponentType = (UIComponentType)theEObject;
				T result = caseUIComponentType(uiComponentType);
				if (result == null) result = caseIdentifiable(uiComponentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.UI_LIST_VIEW: {
				UIListView uiListView = (UIListView)theEObject;
				T result = caseUIListView(uiListView);
				if (result == null) result = caseUIView(uiListView);
				if (result == null) result = caseIdentifiable(uiListView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.UI_CLASS_VIEW: {
				UIClassView uiClassView = (UIClassView)theEObject;
				T result = caseUIClassView(uiClassView);
				if (result == null) result = caseUIView(uiClassView);
				if (result == null) result = caseIdentifiable(uiClassView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.UI_RESULT_VIEW: {
				UIResultView uiResultView = (UIResultView)theEObject;
				T result = caseUIResultView(uiResultView);
				if (result == null) result = caseUIView(uiResultView);
				if (result == null) result = caseIdentifiable(uiResultView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.UI_PARAM_VIEW: {
				UIParamView uiParamView = (UIParamView)theEObject;
				T result = caseUIParamView(uiParamView);
				if (result == null) result = caseUIView(uiParamView);
				if (result == null) result = caseIdentifiable(uiParamView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.UI_BASE_COMPONENT_TYPE: {
				UIBaseComponentType uiBaseComponentType = (UIBaseComponentType)theEObject;
				T result = caseUIBaseComponentType(uiBaseComponentType);
				if (result == null) result = caseUIAttributeComponentType(uiBaseComponentType);
				if (result == null) result = caseUIComponentType(uiBaseComponentType);
				if (result == null) result = caseIdentifiable(uiBaseComponentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.UI_REFERENCE_COMPONENT_TYPE: {
				UIReferenceComponentType uiReferenceComponentType = (UIReferenceComponentType)theEObject;
				T result = caseUIReferenceComponentType(uiReferenceComponentType);
				if (result == null) result = caseUIAttributeComponentType(uiReferenceComponentType);
				if (result == null) result = caseUIComponentType(uiReferenceComponentType);
				if (result == null) result = caseIdentifiable(uiReferenceComponentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.UI_PARAMETER_COMPONENT_TYPE: {
				UIParameterComponentType uiParameterComponentType = (UIParameterComponentType)theEObject;
				T result = caseUIParameterComponentType(uiParameterComponentType);
				if (result == null) result = caseUIComponentType(uiParameterComponentType);
				if (result == null) result = caseIdentifiable(uiParameterComponentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiPackage.UI_ATTRIBUTE_COMPONENT_TYPE: {
				UIAttributeComponentType uiAttributeComponentType = (UIAttributeComponentType)theEObject;
				T result = caseUIAttributeComponentType(uiAttributeComponentType);
				if (result == null) result = caseUIComponentType(uiAttributeComponentType);
				if (result == null) result = caseIdentifiable(uiAttributeComponentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIModule(UIModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIClass(UIClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIAction(UIAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI View Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI View Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIViewField(UIViewField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI View Field Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI View Field Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIViewFieldSet(UIViewFieldSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIView(UIView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIBase(UIBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiable(Identifiable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Menu Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Menu Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIMenuItem(UIMenuItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIFilter(UIFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIInterval(UIInterval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIInfo(UIInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Component Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIComponentType(UIComponentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI List View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI List View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIListView(UIListView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Class View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Class View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIClassView(UIClassView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Result View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Result View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIResultView(UIResultView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Param View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Param View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIParamView(UIParamView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Base Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Base Component Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIBaseComponentType(UIBaseComponentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Reference Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Reference Component Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIReferenceComponentType(UIReferenceComponentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Parameter Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Parameter Component Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIParameterComponentType(UIParameterComponentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Attribute Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Attribute Component Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIAttributeComponentType(UIAttributeComponentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //UiSwitch
