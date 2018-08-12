/**
 */
package psm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JRole</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link psm.JRole#getLower <em>Lower</em>}</li>
 *   <li>{@link psm.JRole#getUpper <em>Upper</em>}</li>
 *   <li>{@link psm.JRole#isNavigable <em>Navigable</em>}</li>
 *   <li>{@link psm.JRole#isUnique <em>Unique</em>}</li>
 *   <li>{@link psm.JRole#isOrdered <em>Ordered</em>}</li>
 *   <li>{@link psm.JRole#getOwnerRelationship <em>Owner Relationship</em>}</li>
 *   <li>{@link psm.JRole#getDerivedExpression <em>Derived Expression</em>}</li>
 *   <li>{@link psm.JRole#getDerivedDescription <em>Derived Description</em>}</li>
 *   <li>{@link psm.JRole#getKind <em>Kind</em>}</li>
 *   <li>{@link psm.JRole#getOptionScript <em>Option Script</em>}</li>
 *   <li>{@link psm.JRole#getOwnerClass <em>Owner Class</em>}</li>
 *   <li>{@link psm.JRole#getValue <em>Value</em>}</li>
 *   <li>{@link psm.JRole#isCalculated <em>Calculated</em>}</li>
 *   <li>{@link psm.JRole#getInterval <em>Interval</em>}</li>
 * </ul>
 *
 * @see psm.PsmPackage#getJRole()
 * @model
 * @generated
 */
public interface JRole extends JElement {
	/**
	 * Returns the value of the '<em><b>Lower</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower</em>' attribute.
	 * @see #setLower(int)
	 * @see psm.PsmPackage#getJRole_Lower()
	 * @model default="0"
	 * @generated
	 */
	int getLower();

	/**
	 * Sets the value of the '{@link psm.JRole#getLower <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower</em>' attribute.
	 * @see #getLower()
	 * @generated
	 */
	void setLower(int value);

	/**
	 * Returns the value of the '<em><b>Upper</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper</em>' attribute.
	 * @see #setUpper(int)
	 * @see psm.PsmPackage#getJRole_Upper()
	 * @model default="1"
	 * @generated
	 */
	int getUpper();

	/**
	 * Sets the value of the '{@link psm.JRole#getUpper <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper</em>' attribute.
	 * @see #getUpper()
	 * @generated
	 */
	void setUpper(int value);

	/**
	 * Returns the value of the '<em><b>Navigable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Navigable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigable</em>' attribute.
	 * @see #setNavigable(boolean)
	 * @see psm.PsmPackage#getJRole_Navigable()
	 * @model
	 * @generated
	 */
	boolean isNavigable();

	/**
	 * Sets the value of the '{@link psm.JRole#isNavigable <em>Navigable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navigable</em>' attribute.
	 * @see #isNavigable()
	 * @generated
	 */
	void setNavigable(boolean value);

	/**
	 * Returns the value of the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique</em>' attribute.
	 * @see #setUnique(boolean)
	 * @see psm.PsmPackage#getJRole_Unique()
	 * @model
	 * @generated
	 */
	boolean isUnique();

	/**
	 * Sets the value of the '{@link psm.JRole#isUnique <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique</em>' attribute.
	 * @see #isUnique()
	 * @generated
	 */
	void setUnique(boolean value);

	/**
	 * Returns the value of the '<em><b>Ordered</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ordered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordered</em>' attribute.
	 * @see #setOrdered(boolean)
	 * @see psm.PsmPackage#getJRole_Ordered()
	 * @model default="true"
	 * @generated
	 */
	boolean isOrdered();

	/**
	 * Sets the value of the '{@link psm.JRole#isOrdered <em>Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordered</em>' attribute.
	 * @see #isOrdered()
	 * @generated
	 */
	void setOrdered(boolean value);

	/**
	 * Returns the value of the '<em><b>Owner Relationship</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link psm.JRelationship#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner Relationship</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Relationship</em>' container reference.
	 * @see #setOwnerRelationship(JRelationship)
	 * @see psm.PsmPackage#getJRole_OwnerRelationship()
	 * @see psm.JRelationship#getRoles
	 * @model opposite="roles" required="true" transient="false"
	 * @generated
	 */
	JRelationship getOwnerRelationship();

	/**
	 * Sets the value of the '{@link psm.JRole#getOwnerRelationship <em>Owner Relationship</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Relationship</em>' container reference.
	 * @see #getOwnerRelationship()
	 * @generated
	 */
	void setOwnerRelationship(JRelationship value);

	/**
	 * Returns the value of the '<em><b>Derived Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derived Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived Expression</em>' attribute.
	 * @see #setDerivedExpression(String)
	 * @see psm.PsmPackage#getJRole_DerivedExpression()
	 * @model
	 * @generated
	 */
	String getDerivedExpression();

	/**
	 * Sets the value of the '{@link psm.JRole#getDerivedExpression <em>Derived Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived Expression</em>' attribute.
	 * @see #getDerivedExpression()
	 * @generated
	 */
	void setDerivedExpression(String value);

	/**
	 * Returns the value of the '<em><b>Derived Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derived Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived Description</em>' attribute.
	 * @see #setDerivedDescription(String)
	 * @see psm.PsmPackage#getJRole_DerivedDescription()
	 * @model
	 * @generated
	 */
	String getDerivedDescription();

	/**
	 * Sets the value of the '{@link psm.JRole#getDerivedDescription <em>Derived Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived Description</em>' attribute.
	 * @see #getDerivedDescription()
	 * @generated
	 */
	void setDerivedDescription(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"ASSOCIATION"</code>.
	 * The literals are from the enumeration {@link psm.JAssociationKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see psm.JAssociationKind
	 * @see #setKind(JAssociationKind)
	 * @see psm.PsmPackage#getJRole_Kind()
	 * @model default="ASSOCIATION"
	 * @generated
	 */
	JAssociationKind getKind();

	/**
	 * Sets the value of the '{@link psm.JRole#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see psm.JAssociationKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(JAssociationKind value);

	/**
	 * Returns the value of the '<em><b>Option Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Option Script</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option Script</em>' attribute.
	 * @see #setOptionScript(String)
	 * @see psm.PsmPackage#getJRole_OptionScript()
	 * @model
	 * @generated
	 */
	String getOptionScript();

	/**
	 * Sets the value of the '{@link psm.JRole#getOptionScript <em>Option Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option Script</em>' attribute.
	 * @see #getOptionScript()
	 * @generated
	 */
	void setOptionScript(String value);

	/**
	 * Returns the value of the '<em><b>Owner Class</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link psm.JClass#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Class</em>' reference.
	 * @see #setOwnerClass(JClass)
	 * @see psm.PsmPackage#getJRole_OwnerClass()
	 * @see psm.JClass#getRoles
	 * @model opposite="roles" required="true"
	 * @generated
	 */
	JClass getOwnerClass();

	/**
	 * Sets the value of the '{@link psm.JRole#getOwnerClass <em>Owner Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Class</em>' reference.
	 * @see #getOwnerClass()
	 * @generated
	 */
	void setOwnerClass(JClass value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see psm.PsmPackage#getJRole_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link psm.JRole#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Calculated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calculated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calculated</em>' attribute.
	 * @see #setCalculated(boolean)
	 * @see psm.PsmPackage#getJRole_Calculated()
	 * @model
	 * @generated
	 */
	boolean isCalculated();

	/**
	 * Sets the value of the '{@link psm.JRole#isCalculated <em>Calculated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calculated</em>' attribute.
	 * @see #isCalculated()
	 * @generated
	 */
	void setCalculated(boolean value);

	/**
	 * Returns the value of the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval</em>' attribute.
	 * @see #setInterval(String)
	 * @see psm.PsmPackage#getJRole_Interval()
	 * @model
	 * @generated
	 */
	String getInterval();

	/**
	 * Sets the value of the '{@link psm.JRole#getInterval <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval</em>' attribute.
	 * @see #getInterval()
	 * @generated
	 */
	void setInterval(String value);

} // JRole
