/**
 */
package psm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see psm.PsmPackage
 * @generated
 */
public interface PsmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PsmFactory eINSTANCE = psm.impl.PsmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>JPrimitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JPrimitive</em>'.
	 * @generated
	 */
	JPrimitive createJPrimitive();

	/**
	 * Returns a new object of class '<em>JEnumeration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JEnumeration</em>'.
	 * @generated
	 */
	JEnumeration createJEnumeration();

	/**
	 * Returns a new object of class '<em>JClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JClass</em>'.
	 * @generated
	 */
	JClass createJClass();

	/**
	 * Returns a new object of class '<em>JAttribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JAttribute</em>'.
	 * @generated
	 */
	JAttribute createJAttribute();

	/**
	 * Returns a new object of class '<em>JOperation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JOperation</em>'.
	 * @generated
	 */
	JOperation createJOperation();

	/**
	 * Returns a new object of class '<em>JParameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JParameter</em>'.
	 * @generated
	 */
	JParameter createJParameter();

	/**
	 * Returns a new object of class '<em>JRelationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JRelationship</em>'.
	 * @generated
	 */
	JRelationship createJRelationship();

	/**
	 * Returns a new object of class '<em>JRole</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JRole</em>'.
	 * @generated
	 */
	JRole createJRole();

	/**
	 * Returns a new object of class '<em>JLiteral</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JLiteral</em>'.
	 * @generated
	 */
	JLiteral createJLiteral();

	/**
	 * Returns a new object of class '<em>JPackage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JPackage</em>'.
	 * @generated
	 */
	JPackage createJPackage();

	/**
	 * Returns a new object of class '<em>JState Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JState Machine</em>'.
	 * @generated
	 */
	JStateMachine createJStateMachine();

	/**
	 * Returns a new object of class '<em>JTransition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JTransition</em>'.
	 * @generated
	 */
	JTransition createJTransition();

	/**
	 * Returns a new object of class '<em>JState</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JState</em>'.
	 * @generated
	 */
	JState createJState();

	/**
	 * Returns a new object of class '<em>JGuard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JGuard</em>'.
	 * @generated
	 */
	JGuard createJGuard();

	/**
	 * Returns a new object of class '<em>JModel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JModel</em>'.
	 * @generated
	 */
	JModel createJModel();

	/**
	 * Returns a new object of class '<em>JUI Menu Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JUI Menu Item</em>'.
	 * @generated
	 */
	JUIMenuItem createJUIMenuItem();

	/**
	 * Returns a new object of class '<em>JUI Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JUI Attribute Group</em>'.
	 * @generated
	 */
	JUIAttributeGroup createJUIAttributeGroup();

	/**
	 * Returns a new object of class '<em>JUI Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JUI Filter</em>'.
	 * @generated
	 */
	JUIFilter createJUIFilter();

	/**
	 * Returns a new object of class '<em>JUI Alias</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JUI Alias</em>'.
	 * @generated
	 */
	JUIAlias createJUIAlias();

	/**
	 * Returns a new object of class '<em>JInfo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JInfo</em>'.
	 * @generated
	 */
	JInfo createJInfo();

	/**
	 * Returns a new object of class '<em>JSubmodel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JSubmodel</em>'.
	 * @generated
	 */
	JSubmodel createJSubmodel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PsmPackage getPsmPackage();

} //PsmFactory
