/**
 */
package psm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import psm.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PsmFactoryImpl extends EFactoryImpl implements PsmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PsmFactory init() {
		try {
			PsmFactory thePsmFactory = (PsmFactory)EPackage.Registry.INSTANCE.getEFactory(PsmPackage.eNS_URI);
			if (thePsmFactory != null) {
				return thePsmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PsmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PsmFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PsmPackage.JPRIMITIVE: return createJPrimitive();
			case PsmPackage.JENUMERATION: return createJEnumeration();
			case PsmPackage.JCLASS: return createJClass();
			case PsmPackage.JATTRIBUTE: return createJAttribute();
			case PsmPackage.JOPERATION: return createJOperation();
			case PsmPackage.JPARAMETER: return createJParameter();
			case PsmPackage.JRELATIONSHIP: return createJRelationship();
			case PsmPackage.JROLE: return createJRole();
			case PsmPackage.JLITERAL: return createJLiteral();
			case PsmPackage.JPACKAGE: return createJPackage();
			case PsmPackage.JSTATE_MACHINE: return createJStateMachine();
			case PsmPackage.JTRANSITION: return createJTransition();
			case PsmPackage.JSTATE: return createJState();
			case PsmPackage.JGUARD: return createJGuard();
			case PsmPackage.JMODEL: return createJModel();
			case PsmPackage.JUI_MENU_ITEM: return createJUIMenuItem();
			case PsmPackage.JUI_ATTRIBUTE_GROUP: return createJUIAttributeGroup();
			case PsmPackage.JUI_FILTER: return createJUIFilter();
			case PsmPackage.JUI_ALIAS: return createJUIAlias();
			case PsmPackage.JINFO: return createJInfo();
			case PsmPackage.JSUBMODEL: return createJSubmodel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PsmPackage.JVISIBILITY:
				return createJVisibilityFromString(eDataType, initialValue);
			case PsmPackage.JASSOCIATION_KIND:
				return createJAssociationKindFromString(eDataType, initialValue);
			case PsmPackage.JOPERATION_KIND:
				return createJOperationKindFromString(eDataType, initialValue);
			case PsmPackage.JLAYER:
				return createJLayerFromString(eDataType, initialValue);
			case PsmPackage.JMENU_ITEM_TYPE:
				return createJMenuItemTypeFromString(eDataType, initialValue);
			case PsmPackage.JOPERATOR:
				return createJOperatorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PsmPackage.JVISIBILITY:
				return convertJVisibilityToString(eDataType, instanceValue);
			case PsmPackage.JASSOCIATION_KIND:
				return convertJAssociationKindToString(eDataType, instanceValue);
			case PsmPackage.JOPERATION_KIND:
				return convertJOperationKindToString(eDataType, instanceValue);
			case PsmPackage.JLAYER:
				return convertJLayerToString(eDataType, instanceValue);
			case PsmPackage.JMENU_ITEM_TYPE:
				return convertJMenuItemTypeToString(eDataType, instanceValue);
			case PsmPackage.JOPERATOR:
				return convertJOperatorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JPrimitive createJPrimitive() {
		JPrimitiveImpl jPrimitive = new JPrimitiveImpl();
		return jPrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JEnumeration createJEnumeration() {
		JEnumerationImpl jEnumeration = new JEnumerationImpl();
		return jEnumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JClass createJClass() {
		JClassImpl jClass = new JClassImpl();
		return jClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JAttribute createJAttribute() {
		JAttributeImpl jAttribute = new JAttributeImpl();
		return jAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JOperation createJOperation() {
		JOperationImpl jOperation = new JOperationImpl();
		return jOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JParameter createJParameter() {
		JParameterImpl jParameter = new JParameterImpl();
		return jParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JRelationship createJRelationship() {
		JRelationshipImpl jRelationship = new JRelationshipImpl();
		return jRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JRole createJRole() {
		JRoleImpl jRole = new JRoleImpl();
		return jRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JLiteral createJLiteral() {
		JLiteralImpl jLiteral = new JLiteralImpl();
		return jLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JPackage createJPackage() {
		JPackageImpl jPackage = new JPackageImpl();
		return jPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JStateMachine createJStateMachine() {
		JStateMachineImpl jStateMachine = new JStateMachineImpl();
		return jStateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JTransition createJTransition() {
		JTransitionImpl jTransition = new JTransitionImpl();
		return jTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JState createJState() {
		JStateImpl jState = new JStateImpl();
		return jState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JGuard createJGuard() {
		JGuardImpl jGuard = new JGuardImpl();
		return jGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JModel createJModel() {
		JModelImpl jModel = new JModelImpl();
		return jModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JUIMenuItem createJUIMenuItem() {
		JUIMenuItemImpl juiMenuItem = new JUIMenuItemImpl();
		return juiMenuItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JUIAttributeGroup createJUIAttributeGroup() {
		JUIAttributeGroupImpl juiAttributeGroup = new JUIAttributeGroupImpl();
		return juiAttributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JUIFilter createJUIFilter() {
		JUIFilterImpl juiFilter = new JUIFilterImpl();
		return juiFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JUIAlias createJUIAlias() {
		JUIAliasImpl juiAlias = new JUIAliasImpl();
		return juiAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JInfo createJInfo() {
		JInfoImpl jInfo = new JInfoImpl();
		return jInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSubmodel createJSubmodel() {
		JSubmodelImpl jSubmodel = new JSubmodelImpl();
		return jSubmodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JVisibility createJVisibilityFromString(EDataType eDataType, String initialValue) {
		JVisibility result = JVisibility.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJVisibilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JAssociationKind createJAssociationKindFromString(EDataType eDataType, String initialValue) {
		JAssociationKind result = JAssociationKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJAssociationKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JOperationKind createJOperationKindFromString(EDataType eDataType, String initialValue) {
		JOperationKind result = JOperationKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJOperationKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JLayer createJLayerFromString(EDataType eDataType, String initialValue) {
		JLayer result = JLayer.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJLayerToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JMenuItemType createJMenuItemTypeFromString(EDataType eDataType, String initialValue) {
		JMenuItemType result = JMenuItemType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJMenuItemTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JOperator createJOperatorFromString(EDataType eDataType, String initialValue) {
		JOperator result = JOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PsmPackage getPsmPackage() {
		return (PsmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PsmPackage getPackage() {
		return PsmPackage.eINSTANCE;
	}

} //PsmFactoryImpl
