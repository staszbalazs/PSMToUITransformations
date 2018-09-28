/**
 */
package psm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JAttribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link psm.JAttribute#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link psm.JAttribute#getRegexp <em>Regexp</em>}</li>
 *   <li>{@link psm.JAttribute#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link psm.JAttribute#getDecimals <em>Decimals</em>}</li>
 *   <li>{@link psm.JAttribute#getInterval <em>Interval</em>}</li>
 *   <li>{@link psm.JAttribute#isTechnical <em>Technical</em>}</li>
 *   <li>{@link psm.JAttribute#getOwnerClass <em>Owner Class</em>}</li>
 *   <li>{@link psm.JAttribute#isUiNoSearch <em>Ui No Search</em>}</li>
 *   <li>{@link psm.JAttribute#isWatched <em>Watched</em>}</li>
 *   <li>{@link psm.JAttribute#isRepresentsId <em>Represents Id</em>}</li>
 * </ul>
 *
 * @see psm.PsmPackage#getJAttribute()
 * @model
 * @generated
 */
public interface JAttribute extends JTypedElement {
	/**
	 * Returns the value of the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placeholder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placeholder</em>' attribute.
	 * @see #setPlaceholder(String)
	 * @see psm.PsmPackage#getJAttribute_Placeholder()
	 * @model
	 * @generated
	 */
	String getPlaceholder();

	/**
	 * Sets the value of the '{@link psm.JAttribute#getPlaceholder <em>Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placeholder</em>' attribute.
	 * @see #getPlaceholder()
	 * @generated
	 */
	void setPlaceholder(String value);

	/**
	 * Returns the value of the '<em><b>Regexp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regexp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regexp</em>' attribute.
	 * @see #setRegexp(String)
	 * @see psm.PsmPackage#getJAttribute_Regexp()
	 * @model
	 * @generated
	 */
	String getRegexp();

	/**
	 * Sets the value of the '{@link psm.JAttribute#getRegexp <em>Regexp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regexp</em>' attribute.
	 * @see #getRegexp()
	 * @generated
	 */
	void setRegexp(String value);

	/**
	 * Returns the value of the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mandatory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory</em>' attribute.
	 * @see #setMandatory(boolean)
	 * @see psm.PsmPackage#getJAttribute_Mandatory()
	 * @model
	 * @generated
	 */
	boolean isMandatory();

	/**
	 * Sets the value of the '{@link psm.JAttribute#isMandatory <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory</em>' attribute.
	 * @see #isMandatory()
	 * @generated
	 */
	void setMandatory(boolean value);

	/**
	 * Returns the value of the '<em><b>Decimals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decimals</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decimals</em>' attribute.
	 * @see #setDecimals(int)
	 * @see psm.PsmPackage#getJAttribute_Decimals()
	 * @model
	 * @generated
	 */
	int getDecimals();

	/**
	 * Sets the value of the '{@link psm.JAttribute#getDecimals <em>Decimals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decimals</em>' attribute.
	 * @see #getDecimals()
	 * @generated
	 */
	void setDecimals(int value);

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
	 * @see psm.PsmPackage#getJAttribute_Interval()
	 * @model
	 * @generated
	 */
	String getInterval();

	/**
	 * Sets the value of the '{@link psm.JAttribute#getInterval <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval</em>' attribute.
	 * @see #getInterval()
	 * @generated
	 */
	void setInterval(String value);

	/**
	 * Returns the value of the '<em><b>Technical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Technical</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technical</em>' attribute.
	 * @see #setTechnical(boolean)
	 * @see psm.PsmPackage#getJAttribute_Technical()
	 * @model
	 * @generated
	 */
	boolean isTechnical();

	/**
	 * Sets the value of the '{@link psm.JAttribute#isTechnical <em>Technical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technical</em>' attribute.
	 * @see #isTechnical()
	 * @generated
	 */
	void setTechnical(boolean value);

	/**
	 * Returns the value of the '<em><b>Owner Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link psm.JClass#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner Class</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Class</em>' container reference.
	 * @see #setOwnerClass(JClass)
	 * @see psm.PsmPackage#getJAttribute_OwnerClass()
	 * @see psm.JClass#getAttributes
	 * @model opposite="attributes" transient="false"
	 * @generated
	 */
	JClass getOwnerClass();

	/**
	 * Sets the value of the '{@link psm.JAttribute#getOwnerClass <em>Owner Class</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Class</em>' container reference.
	 * @see #getOwnerClass()
	 * @generated
	 */
	void setOwnerClass(JClass value);

	/**
	 * Returns the value of the '<em><b>Ui No Search</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ui No Search</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ui No Search</em>' attribute.
	 * @see #setUiNoSearch(boolean)
	 * @see psm.PsmPackage#getJAttribute_UiNoSearch()
	 * @model default="false"
	 * @generated
	 */
	boolean isUiNoSearch();

	/**
	 * Sets the value of the '{@link psm.JAttribute#isUiNoSearch <em>Ui No Search</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ui No Search</em>' attribute.
	 * @see #isUiNoSearch()
	 * @generated
	 */
	void setUiNoSearch(boolean value);

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
	 * @see psm.PsmPackage#getJAttribute_Watched()
	 * @model default="false"
	 * @generated
	 */
	boolean isWatched();

	/**
	 * Sets the value of the '{@link psm.JAttribute#isWatched <em>Watched</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Watched</em>' attribute.
	 * @see #isWatched()
	 * @generated
	 */
	void setWatched(boolean value);

	/**
	 * Returns the value of the '<em><b>Represents Id</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Represents Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Represents Id</em>' attribute.
	 * @see #setRepresentsId(boolean)
	 * @see psm.PsmPackage#getJAttribute_RepresentsId()
	 * @model default="false"
	 * @generated
	 */
	boolean isRepresentsId();

	/**
	 * Sets the value of the '{@link psm.JAttribute#isRepresentsId <em>Represents Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Represents Id</em>' attribute.
	 * @see #isRepresentsId()
	 * @generated
	 */
	void setRepresentsId(boolean value);

} // JAttribute
