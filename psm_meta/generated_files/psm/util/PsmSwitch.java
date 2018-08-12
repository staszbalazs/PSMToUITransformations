/**
 */
package psm.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import psm.*;

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
 * @see psm.PsmPackage
 * @generated
 */
public class PsmSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PsmPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PsmSwitch() {
		if (modelPackage == null) {
			modelPackage = PsmPackage.eINSTANCE;
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
			case PsmPackage.JELEMENT: {
				JElement jElement = (JElement)theEObject;
				T result = caseJElement(jElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PsmPackage.JTYPE: {
				JType jType = (JType)theEObject;
				T result = caseJType(jType);
				if (result == null) result = caseJElement(jType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PsmPackage.JTYPED_ELEMENT: {
				JTypedElement jTypedElement = (JTypedElement)theEObject;
				T result = caseJTypedElement(jTypedElement);
				if (result == null) result = caseJElement(jTypedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PsmPackage.JPRIMITIVE: {
				JPrimitive jPrimitive = (JPrimitive)theEObject;
				T result = caseJPrimitive(jPrimitive);
				if (result == null) result = caseJType(jPrimitive);
				if (result == null) result = caseJElement(jPrimitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PsmPackage.JENUMERATION: {
				JEnumeration jEnumeration = (JEnumeration)theEObject;
				T result = caseJEnumeration(jEnumeration);
				if (result == null) result = caseJType(jEnumeration);
				if (result == null) result = caseJElement(jEnumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PsmPackage.JCLASS: {
				JClass jClass = (JClass)theEObject;
				T result = caseJClass(jClass);
				if (result == null) result = caseJType(jClass);
				if (result == null) result = caseJElement(jClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PsmPackage.JATTRIBUTE: {
				JAttribute jAttribute = (JAttribute)theEObject;
				T result = caseJAttribute(jAttribute);
				if (result == null) result = caseJTypedElement(jAttribute);
				if (result == null) result = caseJElement(jAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PsmPackage.JOPERATION: {
				JOperation jOperation = (JOperation)theEObject;
				T result = caseJOperation(jOperation);
				if (result == null) result = caseJElement(jOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PsmPackage.JPARAMETER: {
				JParameter jParameter = (JParameter)theEObject;
				T result = caseJParameter(jParameter);
				if (result == null) result = caseJTypedElement(jParameter);
				if (result == null) result = caseJElement(jParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PsmPackage.JRELATIONSHIP: {
				JRelationship jRelationship = (JRelationship)theEObject;
				T result = caseJRelationship(jRelationship);
				if (result == null) result = caseJElement(jRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PsmPackage.JROLE: {
				JRole jRole = (JRole)theEObject;
				T result = caseJRole(jRole);
				if (result == null) result = caseJElement(jRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PsmPackage.JLITERAL: {
				JLiteral jLiteral = (JLiteral)theEObject;
				T result = caseJLiteral(jLiteral);
				if (result == null) result = caseJElement(jLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PsmPackage.JPACKAGE: {
				JPackage jPackage = (JPackage)theEObject;
				T result = caseJPackage(jPackage);
				if (result == null) result = caseJElement(jPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PsmPackage.JSTATE_MACHINE: {
				JStateMachine jStateMachine = (JStateMachine)theEObject;
				T result = caseJStateMachine(jStateMachine);
				if (result == null) result = caseJElement(jStateMachine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PsmPackage.JTRANSITION: {
				JTransition jTransition = (JTransition)theEObject;
				T result = caseJTransition(jTransition);
				if (result == null) result = caseJElement(jTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PsmPackage.JSTATE: {
				JState jState = (JState)theEObject;
				T result = caseJState(jState);
				if (result == null) result = caseJElement(jState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PsmPackage.JGUARD: {
				JGuard jGuard = (JGuard)theEObject;
				T result = caseJGuard(jGuard);
				if (result == null) result = caseJElement(jGuard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PsmPackage.JMODEL: {
				JModel jModel = (JModel)theEObject;
				T result = caseJModel(jModel);
				if (result == null) result = caseJElement(jModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PsmPackage.JUI_MENU_ITEM: {
				JUIMenuItem juiMenuItem = (JUIMenuItem)theEObject;
				T result = caseJUIMenuItem(juiMenuItem);
				if (result == null) result = caseJElement(juiMenuItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PsmPackage.JUI_ATTRIBUTE_GROUP: {
				JUIAttributeGroup juiAttributeGroup = (JUIAttributeGroup)theEObject;
				T result = caseJUIAttributeGroup(juiAttributeGroup);
				if (result == null) result = caseJElement(juiAttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PsmPackage.JUI_FILTER: {
				JUIFilter juiFilter = (JUIFilter)theEObject;
				T result = caseJUIFilter(juiFilter);
				if (result == null) result = caseJElement(juiFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PsmPackage.JUI_ALIAS: {
				JUIAlias juiAlias = (JUIAlias)theEObject;
				T result = caseJUIAlias(juiAlias);
				if (result == null) result = caseJElement(juiAlias);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PsmPackage.JINFO: {
				JInfo jInfo = (JInfo)theEObject;
				T result = caseJInfo(jInfo);
				if (result == null) result = caseJElement(jInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PsmPackage.JSUBMODEL: {
				JSubmodel jSubmodel = (JSubmodel)theEObject;
				T result = caseJSubmodel(jSubmodel);
				if (result == null) result = caseJElement(jSubmodel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JElement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JElement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJElement(JElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJType(JType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JTyped Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JTyped Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJTypedElement(JTypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JPrimitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JPrimitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJPrimitive(JPrimitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JEnumeration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JEnumeration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJEnumeration(JEnumeration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJClass(JClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JAttribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JAttribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJAttribute(JAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JOperation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JOperation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJOperation(JOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JParameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JParameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJParameter(JParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JRelationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JRelationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJRelationship(JRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JRole</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JRole</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJRole(JRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JLiteral</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JLiteral</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJLiteral(JLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JPackage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJPackage(JPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JState Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JState Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJStateMachine(JStateMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JTransition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JTransition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJTransition(JTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JState</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JState</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJState(JState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JGuard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JGuard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJGuard(JGuard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JModel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JModel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJModel(JModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JUI Menu Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JUI Menu Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJUIMenuItem(JUIMenuItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JUI Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JUI Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJUIAttributeGroup(JUIAttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JUI Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JUI Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJUIFilter(JUIFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JUI Alias</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JUI Alias</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJUIAlias(JUIAlias object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JInfo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JInfo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJInfo(JInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JSubmodel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JSubmodel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJSubmodel(JSubmodel object) {
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

} //PsmSwitch
