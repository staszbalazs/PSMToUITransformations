/**
 */
package psmToUiTypeMapping.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import psmToUiTypeMapping.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PsmToUiTypeMappingFactoryImpl extends EFactoryImpl implements PsmToUiTypeMappingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PsmToUiTypeMappingFactory init() {
		try {
			PsmToUiTypeMappingFactory thePsmToUiTypeMappingFactory = (PsmToUiTypeMappingFactory)EPackage.Registry.INSTANCE.getEFactory(PsmToUiTypeMappingPackage.eNS_URI);
			if (thePsmToUiTypeMappingFactory != null) {
				return thePsmToUiTypeMappingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PsmToUiTypeMappingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PsmToUiTypeMappingFactoryImpl() {
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
			case PsmToUiTypeMappingPackage.MAPPING: return createMapping();
			case PsmToUiTypeMappingPackage.MAPPINGS: return createMappings();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mapping createMapping() {
		MappingImpl mapping = new MappingImpl();
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mappings createMappings() {
		MappingsImpl mappings = new MappingsImpl();
		return mappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PsmToUiTypeMappingPackage getPsmToUiTypeMappingPackage() {
		return (PsmToUiTypeMappingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PsmToUiTypeMappingPackage getPackage() {
		return PsmToUiTypeMappingPackage.eINSTANCE;
	}

} //PsmToUiTypeMappingFactoryImpl
