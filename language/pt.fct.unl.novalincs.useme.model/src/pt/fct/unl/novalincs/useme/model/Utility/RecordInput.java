/**
 */
package pt.fct.unl.novalincs.useme.model.Utility;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Record Input</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage#getRecordInput()
 * @model
 * @generated
 */
public enum RecordInput implements Enumerator {
	/**
	 * The '<em><b>Screen Record</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCREEN_RECORD_VALUE
	 * @generated
	 * @ordered
	 */
	SCREEN_RECORD(1, "screenRecord", "Screen  Record"),

	/**
	 * The '<em><b>Live Observation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIVE_OBSERVATION_VALUE
	 * @generated
	 * @ordered
	 */
	LIVE_OBSERVATION(2, "liveObservation", "liveObservation"),

	/**
	 * The '<em><b>Think Aloud</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THINK_ALOUD_VALUE
	 * @generated
	 * @ordered
	 */
	THINK_ALOUD(3, "thinkAloud", "thinkAloud");

	/**
	 * The '<em><b>Screen Record</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Screen Record</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCREEN_RECORD
	 * @model name="screenRecord" literal="Screen  Record"
	 * @generated
	 * @ordered
	 */
	public static final int SCREEN_RECORD_VALUE = 1;

	/**
	 * The '<em><b>Live Observation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Live Observation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIVE_OBSERVATION
	 * @model name="liveObservation"
	 * @generated
	 * @ordered
	 */
	public static final int LIVE_OBSERVATION_VALUE = 2;

	/**
	 * The '<em><b>Think Aloud</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Think Aloud</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #THINK_ALOUD
	 * @model name="thinkAloud"
	 * @generated
	 * @ordered
	 */
	public static final int THINK_ALOUD_VALUE = 3;

	/**
	 * An array of all the '<em><b>Record Input</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RecordInput[] VALUES_ARRAY =
		new RecordInput[] {
			SCREEN_RECORD,
			LIVE_OBSERVATION,
			THINK_ALOUD,
		};

	/**
	 * A public read-only list of all the '<em><b>Record Input</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RecordInput> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Record Input</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RecordInput get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RecordInput result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Record Input</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RecordInput getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RecordInput result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Record Input</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RecordInput get(int value) {
		switch (value) {
			case SCREEN_RECORD_VALUE: return SCREEN_RECORD;
			case LIVE_OBSERVATION_VALUE: return LIVE_OBSERVATION;
			case THINK_ALOUD_VALUE: return THINK_ALOUD;
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
	private RecordInput(int value, String name, String literal) {
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
	
} //RecordInput
