/**
 */
package ui.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import ui.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ui.UiPackage
 * @generated
 */
public class UiAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UiPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UiPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UiSwitch<Adapter> modelSwitch =
		new UiSwitch<Adapter>() {
			@Override
			public Adapter caseUIModule(UIModule object) {
				return createUIModuleAdapter();
			}
			@Override
			public Adapter caseUIClass(UIClass object) {
				return createUIClassAdapter();
			}
			@Override
			public Adapter caseUIAction(UIAction object) {
				return createUIActionAdapter();
			}
			@Override
			public Adapter caseUIViewField(UIViewField object) {
				return createUIViewFieldAdapter();
			}
			@Override
			public Adapter caseUIViewFieldSet(UIViewFieldSet object) {
				return createUIViewFieldSetAdapter();
			}
			@Override
			public Adapter caseUIView(UIView object) {
				return createUIViewAdapter();
			}
			@Override
			public Adapter caseUIBase(UIBase object) {
				return createUIBaseAdapter();
			}
			@Override
			public Adapter caseIdentifiable(Identifiable object) {
				return createIdentifiableAdapter();
			}
			@Override
			public Adapter caseUIMenuItem(UIMenuItem object) {
				return createUIMenuItemAdapter();
			}
			@Override
			public Adapter caseUIFilter(UIFilter object) {
				return createUIFilterAdapter();
			}
			@Override
			public Adapter caseUIInterval(UIInterval object) {
				return createUIIntervalAdapter();
			}
			@Override
			public Adapter caseUIInfo(UIInfo object) {
				return createUIInfoAdapter();
			}
			@Override
			public Adapter caseUIComponentType(UIComponentType object) {
				return createUIComponentTypeAdapter();
			}
			@Override
			public Adapter caseUIListView(UIListView object) {
				return createUIListViewAdapter();
			}
			@Override
			public Adapter caseUIClassView(UIClassView object) {
				return createUIClassViewAdapter();
			}
			@Override
			public Adapter caseUIResultView(UIResultView object) {
				return createUIResultViewAdapter();
			}
			@Override
			public Adapter caseUIParamView(UIParamView object) {
				return createUIParamViewAdapter();
			}
			@Override
			public Adapter caseUIBaseComponentType(UIBaseComponentType object) {
				return createUIBaseComponentTypeAdapter();
			}
			@Override
			public Adapter caseUIReferenceComponentType(UIReferenceComponentType object) {
				return createUIReferenceComponentTypeAdapter();
			}
			@Override
			public Adapter caseUIParameterComponentType(UIParameterComponentType object) {
				return createUIParameterComponentTypeAdapter();
			}
			@Override
			public Adapter caseUIAttributeComponentType(UIAttributeComponentType object) {
				return createUIAttributeComponentTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ui.UIModule <em>UI Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ui.UIModule
	 * @generated
	 */
	public Adapter createUIModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ui.UIClass <em>UI Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ui.UIClass
	 * @generated
	 */
	public Adapter createUIClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ui.UIAction <em>UI Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ui.UIAction
	 * @generated
	 */
	public Adapter createUIActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ui.UIViewField <em>UI View Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ui.UIViewField
	 * @generated
	 */
	public Adapter createUIViewFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ui.UIViewFieldSet <em>UI View Field Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ui.UIViewFieldSet
	 * @generated
	 */
	public Adapter createUIViewFieldSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ui.UIView <em>UI View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ui.UIView
	 * @generated
	 */
	public Adapter createUIViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ui.UIBase <em>UI Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ui.UIBase
	 * @generated
	 */
	public Adapter createUIBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ui.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ui.Identifiable
	 * @generated
	 */
	public Adapter createIdentifiableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ui.UIMenuItem <em>UI Menu Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ui.UIMenuItem
	 * @generated
	 */
	public Adapter createUIMenuItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ui.UIFilter <em>UI Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ui.UIFilter
	 * @generated
	 */
	public Adapter createUIFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ui.UIInterval <em>UI Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ui.UIInterval
	 * @generated
	 */
	public Adapter createUIIntervalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ui.UIInfo <em>UI Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ui.UIInfo
	 * @generated
	 */
	public Adapter createUIInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ui.UIComponentType <em>UI Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ui.UIComponentType
	 * @generated
	 */
	public Adapter createUIComponentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ui.UIListView <em>UI List View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ui.UIListView
	 * @generated
	 */
	public Adapter createUIListViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ui.UIClassView <em>UI Class View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ui.UIClassView
	 * @generated
	 */
	public Adapter createUIClassViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ui.UIResultView <em>UI Result View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ui.UIResultView
	 * @generated
	 */
	public Adapter createUIResultViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ui.UIParamView <em>UI Param View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ui.UIParamView
	 * @generated
	 */
	public Adapter createUIParamViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ui.UIBaseComponentType <em>UI Base Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ui.UIBaseComponentType
	 * @generated
	 */
	public Adapter createUIBaseComponentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ui.UIReferenceComponentType <em>UI Reference Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ui.UIReferenceComponentType
	 * @generated
	 */
	public Adapter createUIReferenceComponentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ui.UIParameterComponentType <em>UI Parameter Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ui.UIParameterComponentType
	 * @generated
	 */
	public Adapter createUIParameterComponentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ui.UIAttributeComponentType <em>UI Attribute Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ui.UIAttributeComponentType
	 * @generated
	 */
	public Adapter createUIAttributeComponentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //UiAdapterFactory
