/**
 */
package psm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>JLayer</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see psm.PsmPackage#getJLayer()
 * @model
 * @generated
 */
public enum JLayer implements Enumerator {
	/**
	 * The '<em><b>ALL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_VALUE
	 * @generated
	 * @ordered
	 */
	ALL(0, "ALL", "ALL"),

	/**
	 * The '<em><b>PERSISTENCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERSISTENCE_VALUE
	 * @generated
	 * @ordered
	 */
	PERSISTENCE(1, "PERSISTENCE", "PERSISTENCE"),

	/**
	 * The '<em><b>SERVICE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	SERVICE(2, "SERVICE", "SERVICE"),

	/**
	 * The '<em><b>OPERATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATION_VALUE
	 * @generated
	 * @ordered
	 */
	OPERATION(3, "OPERATION", "OPERATION"),

	/**
	 * The '<em><b>REST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REST_VALUE
	 * @generated
	 * @ordered
	 */
	REST(4, "REST", "REST"),

	/**
	 * The '<em><b>UI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UI_VALUE
	 * @generated
	 * @ordered
	 */
	UI(5, "UI", "UI"),

	/**
	 * The '<em><b>DOCUMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCUMENT_VALUE
	 * @generated
	 * @ordered
	 */
	DOCUMENT(6, "DOCUMENT", "DOCUMENT"),

	/**
	 * The '<em><b>PERMISSION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERMISSION_VALUE
	 * @generated
	 * @ordered
	 */
	PERMISSION(7, "PERMISSION", "PERMISSION"),

	/**
	 * The '<em><b>SCREEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCREEN_VALUE
	 * @generated
	 * @ordered
	 */
	SCREEN(8, "SCREEN", "SCREEN");

	/**
	 * The '<em><b>ALL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ALL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ALL_VALUE = 0;

	/**
	 * The '<em><b>PERSISTENCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PERSISTENCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERSISTENCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PERSISTENCE_VALUE = 1;

	/**
	 * The '<em><b>SERVICE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SERVICE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SERVICE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_VALUE = 2;

	/**
	 * The '<em><b>OPERATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OPERATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPERATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPERATION_VALUE = 3;

	/**
	 * The '<em><b>REST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REST_VALUE = 4;

	/**
	 * The '<em><b>UI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UI</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UI_VALUE = 5;

	/**
	 * The '<em><b>DOCUMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DOCUMENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOCUMENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT_VALUE = 6;

	/**
	 * The '<em><b>PERMISSION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PERMISSION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERMISSION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PERMISSION_VALUE = 7;

	/**
	 * The '<em><b>SCREEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SCREEN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCREEN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SCREEN_VALUE = 8;

	/**
	 * An array of all the '<em><b>JLayer</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final JLayer[] VALUES_ARRAY =
		new JLayer[] {
			ALL,
			PERSISTENCE,
			SERVICE,
			OPERATION,
			REST,
			UI,
			DOCUMENT,
			PERMISSION,
			SCREEN,
		};

	/**
	 * A public read-only list of all the '<em><b>JLayer</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<JLayer> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>JLayer</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static JLayer get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			JLayer result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>JLayer</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static JLayer getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			JLayer result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>JLayer</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static JLayer get(int value) {
		switch (value) {
			case ALL_VALUE: return ALL;
			case PERSISTENCE_VALUE: return PERSISTENCE;
			case SERVICE_VALUE: return SERVICE;
			case OPERATION_VALUE: return OPERATION;
			case REST_VALUE: return REST;
			case UI_VALUE: return UI;
			case DOCUMENT_VALUE: return DOCUMENT;
			case PERMISSION_VALUE: return PERMISSION;
			case SCREEN_VALUE: return SCREEN;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private JLayer(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //JLayer
