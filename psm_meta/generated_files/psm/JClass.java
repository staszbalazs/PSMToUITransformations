/**
 */
package psm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link psm.JClass#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link psm.JClass#getStateMachines <em>State Machines</em>}</li>
 *   <li>{@link psm.JClass#getOperations <em>Operations</em>}</li>
 *   <li>{@link psm.JClass#getAttributeOrder <em>Attribute Order</em>}</li>
 *   <li>{@link psm.JClass#getAttributesForListing <em>Attributes For Listing</em>}</li>
 *   <li>{@link psm.JClass#getFixedEnum <em>Fixed Enum</em>}</li>
 *   <li>{@link psm.JClass#isRepresentsTenant <em>Represents Tenant</em>}</li>
 *   <li>{@link psm.JClass#isTenantMember <em>Tenant Member</em>}</li>
 *   <li>{@link psm.JClass#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link psm.JClass#isRepresentsEnum <em>Represents Enum</em>}</li>
 *   <li>{@link psm.JClass#isRepresentsTenantUser <em>Represents Tenant User</em>}</li>
 *   <li>{@link psm.JClass#isRepresentsUser <em>Represents User</em>}</li>
 *   <li>{@link psm.JClass#getSupertype <em>Supertype</em>}</li>
 *   <li>{@link psm.JClass#getPackage <em>Package</em>}</li>
 *   <li>{@link psm.JClass#getRoles <em>Roles</em>}</li>
 *   <li>{@link psm.JClass#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link psm.JClass#isBusinessSingleton <em>Business Singleton</em>}</li>
 *   <li>{@link psm.JClass#getAliases <em>Aliases</em>}</li>
 *   <li>{@link psm.JClass#isWatched <em>Watched</em>}</li>
 *   <li>{@link psm.JClass#isRepresentsEnumValue <em>Represents Enum Value</em>}</li>
 * </ul>
 *
 * @see psm.PsmPackage#getJClass()
 * @model
 * @generated
 */
public interface JClass extends JType {
	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see psm.PsmPackage#getJClass_Abstract()
	 * @model
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link psm.JClass#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>State Machines</b></em>' containment reference list.
	 * The list contents are of type {@link psm.JStateMachine}.
	 * It is bidirectional and its opposite is '{@link psm.JStateMachine#getOwnerClass <em>Owner Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Machines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Machines</em>' containment reference list.
	 * @see psm.PsmPackage#getJClass_StateMachines()
	 * @see psm.JStateMachine#getOwnerClass
	 * @model opposite="ownerClass" containment="true"
	 * @generated
	 */
	EList<JStateMachine> getStateMachines();

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link psm.JOperation}.
	 * It is bidirectional and its opposite is '{@link psm.JOperation#getOwnerClass <em>Owner Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see psm.PsmPackage#getJClass_Operations()
	 * @see psm.JOperation#getOwnerClass
	 * @model opposite="ownerClass" containment="true"
	 *        extendedMetaData="kind='simple'"
	 * @generated
	 */
	EList<JOperation> getOperations();

	/**
	 * Returns the value of the '<em><b>Attribute Order</b></em>' containment reference list.
	 * The list contents are of type {@link psm.JUIAttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Order</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Order</em>' containment reference list.
	 * @see psm.PsmPackage#getJClass_AttributeOrder()
	 * @model containment="true"
	 * @generated
	 */
	EList<JUIAttributeGroup> getAttributeOrder();

	/**
	 * Returns the value of the '<em><b>Attributes For Listing</b></em>' reference list.
	 * The list contents are of type {@link psm.JAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes For Listing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes For Listing</em>' reference list.
	 * @see psm.PsmPackage#getJClass_AttributesForListing()
	 * @model
	 * @generated
	 */
	EList<JAttribute> getAttributesForListing();

	/**
	 * Returns the value of the '<em><b>Fixed Enum</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link psm.JEnumeration#getClassRepresentation <em>Class Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Enum</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Enum</em>' reference.
	 * @see #setFixedEnum(JEnumeration)
	 * @see psm.PsmPackage#getJClass_FixedEnum()
	 * @see psm.JEnumeration#getClassRepresentation
	 * @model opposite="classRepresentation"
	 * @generated
	 */
	JEnumeration getFixedEnum();

	/**
	 * Sets the value of the '{@link psm.JClass#getFixedEnum <em>Fixed Enum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Enum</em>' reference.
	 * @see #getFixedEnum()
	 * @generated
	 */
	void setFixedEnum(JEnumeration value);

	/**
	 * Returns the value of the '<em><b>Represents Tenant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Represents Tenant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Represents Tenant</em>' attribute.
	 * @see #setRepresentsTenant(boolean)
	 * @see psm.PsmPackage#getJClass_RepresentsTenant()
	 * @model
	 * @generated
	 */
	boolean isRepresentsTenant();

	/**
	 * Sets the value of the '{@link psm.JClass#isRepresentsTenant <em>Represents Tenant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Represents Tenant</em>' attribute.
	 * @see #isRepresentsTenant()
	 * @generated
	 */
	void setRepresentsTenant(boolean value);

	/**
	 * Returns the value of the '<em><b>Tenant Member</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tenant Member</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tenant Member</em>' attribute.
	 * @see #setTenantMember(boolean)
	 * @see psm.PsmPackage#getJClass_TenantMember()
	 * @model
	 * @generated
	 */
	boolean isTenantMember();

	/**
	 * Sets the value of the '{@link psm.JClass#isTenantMember <em>Tenant Member</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tenant Member</em>' attribute.
	 * @see #isTenantMember()
	 * @generated
	 */
	void setTenantMember(boolean value);

	/**
	 * Returns the value of the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Representation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representation</em>' reference.
	 * @see #setRepresentation(JAttribute)
	 * @see psm.PsmPackage#getJClass_Representation()
	 * @model
	 * @generated
	 */
	JAttribute getRepresentation();

	/**
	 * Sets the value of the '{@link psm.JClass#getRepresentation <em>Representation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation</em>' reference.
	 * @see #getRepresentation()
	 * @generated
	 */
	void setRepresentation(JAttribute value);

	/**
	 * Returns the value of the '<em><b>Represents Enum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Represents Enum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Represents Enum</em>' attribute.
	 * @see #setRepresentsEnum(boolean)
	 * @see psm.PsmPackage#getJClass_RepresentsEnum()
	 * @model
	 * @generated
	 */
	boolean isRepresentsEnum();

	/**
	 * Sets the value of the '{@link psm.JClass#isRepresentsEnum <em>Represents Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Represents Enum</em>' attribute.
	 * @see #isRepresentsEnum()
	 * @generated
	 */
	void setRepresentsEnum(boolean value);

	/**
	 * Returns the value of the '<em><b>Represents Tenant User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Represents Tenant User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Represents Tenant User</em>' attribute.
	 * @see #setRepresentsTenantUser(boolean)
	 * @see psm.PsmPackage#getJClass_RepresentsTenantUser()
	 * @model
	 * @generated
	 */
	boolean isRepresentsTenantUser();

	/**
	 * Sets the value of the '{@link psm.JClass#isRepresentsTenantUser <em>Represents Tenant User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Represents Tenant User</em>' attribute.
	 * @see #isRepresentsTenantUser()
	 * @generated
	 */
	void setRepresentsTenantUser(boolean value);

	/**
	 * Returns the value of the '<em><b>Represents User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Represents User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Represents User</em>' attribute.
	 * @see #setRepresentsUser(boolean)
	 * @see psm.PsmPackage#getJClass_RepresentsUser()
	 * @model
	 * @generated
	 */
	boolean isRepresentsUser();

	/**
	 * Sets the value of the '{@link psm.JClass#isRepresentsUser <em>Represents User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Represents User</em>' attribute.
	 * @see #isRepresentsUser()
	 * @generated
	 */
	void setRepresentsUser(boolean value);

	/**
	 * Returns the value of the '<em><b>Supertype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supertype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supertype</em>' reference.
	 * @see #setSupertype(JClass)
	 * @see psm.PsmPackage#getJClass_Supertype()
	 * @model
	 * @generated
	 */
	JClass getSupertype();

	/**
	 * Sets the value of the '{@link psm.JClass#getSupertype <em>Supertype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supertype</em>' reference.
	 * @see #getSupertype()
	 * @generated
	 */
	void setSupertype(JClass value);

	/**
	 * Returns the value of the '<em><b>Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link psm.JPackage#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' container reference.
	 * @see #setPackage(JPackage)
	 * @see psm.PsmPackage#getJClass_Package()
	 * @see psm.JPackage#getClasses
	 * @model opposite="classes" transient="false"
	 * @generated
	 */
	JPackage getPackage();

	/**
	 * Sets the value of the '{@link psm.JClass#getPackage <em>Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' container reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(JPackage value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference list.
	 * The list contents are of type {@link psm.JRole}.
	 * It is bidirectional and its opposite is '{@link psm.JRole#getOwnerClass <em>Owner Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' reference list.
	 * @see psm.PsmPackage#getJClass_Roles()
	 * @see psm.JRole#getOwnerClass
	 * @model opposite="ownerClass"
	 * @generated
	 */
	EList<JRole> getRoles();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link psm.JAttribute}.
	 * It is bidirectional and its opposite is '{@link psm.JAttribute#getOwnerClass <em>Owner Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see psm.PsmPackage#getJClass_Attributes()
	 * @see psm.JAttribute#getOwnerClass
	 * @model opposite="ownerClass" containment="true"
	 * @generated
	 */
	EList<JAttribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Business Singleton</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Singleton</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Singleton</em>' attribute.
	 * @see #setBusinessSingleton(boolean)
	 * @see psm.PsmPackage#getJClass_BusinessSingleton()
	 * @model
	 * @generated
	 */
	boolean isBusinessSingleton();

	/**
	 * Sets the value of the '{@link psm.JClass#isBusinessSingleton <em>Business Singleton</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Singleton</em>' attribute.
	 * @see #isBusinessSingleton()
	 * @generated
	 */
	void setBusinessSingleton(boolean value);

	/**
	 * Returns the value of the '<em><b>Aliases</b></em>' containment reference list.
	 * The list contents are of type {@link psm.JUIAlias}.
	 * It is bidirectional and its opposite is '{@link psm.JUIAlias#getOwnerClass <em>Owner Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aliases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aliases</em>' containment reference list.
	 * @see psm.PsmPackage#getJClass_Aliases()
	 * @see psm.JUIAlias#getOwnerClass
	 * @model opposite="ownerClass" containment="true"
	 * @generated
	 */
	EList<JUIAlias> getAliases();

	/**
	 * Returns the value of the '<em><b>Watched</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Watched</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Watched</em>' attribute.
	 * @see #setWatched(boolean)
	 * @see psm.PsmPackage#getJClass_Watched()
	 * @model default="false"
	 * @generated
	 */
	boolean isWatched();

	/**
	 * Sets the value of the '{@link psm.JClass#isWatched <em>Watched</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Watched</em>' attribute.
	 * @see #isWatched()
	 * @generated
	 */
	void setWatched(boolean value);

	/**
	 * Returns the value of the '<em><b>Represents Enum Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Represents Enum Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Represents Enum Value</em>' attribute.
	 * @see #setRepresentsEnumValue(boolean)
	 * @see psm.PsmPackage#getJClass_RepresentsEnumValue()
	 * @model
	 * @generated
	 */
	boolean isRepresentsEnumValue();

	/**
	 * Sets the value of the '{@link psm.JClass#isRepresentsEnumValue <em>Represents Enum Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Represents Enum Value</em>' attribute.
	 * @see #isRepresentsEnumValue()
	 * @generated
	 */
	void setRepresentsEnumValue(boolean value);

} // JClass
