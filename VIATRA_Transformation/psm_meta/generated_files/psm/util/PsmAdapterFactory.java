/**
 */
package psm.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import psm.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see psm.PsmPackage
 * @generated
 */
public class PsmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PsmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PsmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PsmPackage.eINSTANCE;
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
	protected PsmSwitch<Adapter> modelSwitch =
		new PsmSwitch<Adapter>() {
			@Override
			public Adapter caseJElement(JElement object) {
				return createJElementAdapter();
			}
			@Override
			public Adapter caseJType(JType object) {
				return createJTypeAdapter();
			}
			@Override
			public Adapter caseJTypedElement(JTypedElement object) {
				return createJTypedElementAdapter();
			}
			@Override
			public Adapter caseJPrimitive(JPrimitive object) {
				return createJPrimitiveAdapter();
			}
			@Override
			public Adapter caseJEnumeration(JEnumeration object) {
				return createJEnumerationAdapter();
			}
			@Override
			public Adapter caseJClass(JClass object) {
				return createJClassAdapter();
			}
			@Override
			public Adapter caseJAttribute(JAttribute object) {
				return createJAttributeAdapter();
			}
			@Override
			public Adapter caseJOperation(JOperation object) {
				return createJOperationAdapter();
			}
			@Override
			public Adapter caseJParameter(JParameter object) {
				return createJParameterAdapter();
			}
			@Override
			public Adapter caseJRelationship(JRelationship object) {
				return createJRelationshipAdapter();
			}
			@Override
			public Adapter caseJRole(JRole object) {
				return createJRoleAdapter();
			}
			@Override
			public Adapter caseJLiteral(JLiteral object) {
				return createJLiteralAdapter();
			}
			@Override
			public Adapter caseJPackage(JPackage object) {
				return createJPackageAdapter();
			}
			@Override
			public Adapter caseJStateMachine(JStateMachine object) {
				return createJStateMachineAdapter();
			}
			@Override
			public Adapter caseJTransition(JTransition object) {
				return createJTransitionAdapter();
			}
			@Override
			public Adapter caseJState(JState object) {
				return createJStateAdapter();
			}
			@Override
			public Adapter caseJGuard(JGuard object) {
				return createJGuardAdapter();
			}
			@Override
			public Adapter caseJModel(JModel object) {
				return createJModelAdapter();
			}
			@Override
			public Adapter caseJUIMenuItem(JUIMenuItem object) {
				return createJUIMenuItemAdapter();
			}
			@Override
			public Adapter caseJUIAttributeGroup(JUIAttributeGroup object) {
				return createJUIAttributeGroupAdapter();
			}
			@Override
			public Adapter caseJUIFilter(JUIFilter object) {
				return createJUIFilterAdapter();
			}
			@Override
			public Adapter caseJUIAlias(JUIAlias object) {
				return createJUIAliasAdapter();
			}
			@Override
			public Adapter caseJInfo(JInfo object) {
				return createJInfoAdapter();
			}
			@Override
			public Adapter caseJSubmodel(JSubmodel object) {
				return createJSubmodelAdapter();
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
	 * Creates a new adapter for an object of class '{@link psm.JElement <em>JElement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see psm.JElement
	 * @generated
	 */
	public Adapter createJElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link psm.JType <em>JType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see psm.JType
	 * @generated
	 */
	public Adapter createJTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link psm.JTypedElement <em>JTyped Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see psm.JTypedElement
	 * @generated
	 */
	public Adapter createJTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link psm.JPrimitive <em>JPrimitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see psm.JPrimitive
	 * @generated
	 */
	public Adapter createJPrimitiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link psm.JEnumeration <em>JEnumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see psm.JEnumeration
	 * @generated
	 */
	public Adapter createJEnumerationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link psm.JClass <em>JClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see psm.JClass
	 * @generated
	 */
	public Adapter createJClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link psm.JAttribute <em>JAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see psm.JAttribute
	 * @generated
	 */
	public Adapter createJAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link psm.JOperation <em>JOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see psm.JOperation
	 * @generated
	 */
	public Adapter createJOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link psm.JParameter <em>JParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see psm.JParameter
	 * @generated
	 */
	public Adapter createJParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link psm.JRelationship <em>JRelationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see psm.JRelationship
	 * @generated
	 */
	public Adapter createJRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link psm.JRole <em>JRole</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see psm.JRole
	 * @generated
	 */
	public Adapter createJRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link psm.JLiteral <em>JLiteral</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see psm.JLiteral
	 * @generated
	 */
	public Adapter createJLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link psm.JPackage <em>JPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see psm.JPackage
	 * @generated
	 */
	public Adapter createJPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link psm.JStateMachine <em>JState Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see psm.JStateMachine
	 * @generated
	 */
	public Adapter createJStateMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link psm.JTransition <em>JTransition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see psm.JTransition
	 * @generated
	 */
	public Adapter createJTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link psm.JState <em>JState</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see psm.JState
	 * @generated
	 */
	public Adapter createJStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link psm.JGuard <em>JGuard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see psm.JGuard
	 * @generated
	 */
	public Adapter createJGuardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link psm.JModel <em>JModel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see psm.JModel
	 * @generated
	 */
	public Adapter createJModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link psm.JUIMenuItem <em>JUI Menu Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see psm.JUIMenuItem
	 * @generated
	 */
	public Adapter createJUIMenuItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link psm.JUIAttributeGroup <em>JUI Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see psm.JUIAttributeGroup
	 * @generated
	 */
	public Adapter createJUIAttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link psm.JUIFilter <em>JUI Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see psm.JUIFilter
	 * @generated
	 */
	public Adapter createJUIFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link psm.JUIAlias <em>JUI Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see psm.JUIAlias
	 * @generated
	 */
	public Adapter createJUIAliasAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link psm.JInfo <em>JInfo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see psm.JInfo
	 * @generated
	 */
	public Adapter createJInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link psm.JSubmodel <em>JSubmodel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see psm.JSubmodel
	 * @generated
	 */
	public Adapter createJSubmodelAdapter() {
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

} //PsmAdapterFactory
