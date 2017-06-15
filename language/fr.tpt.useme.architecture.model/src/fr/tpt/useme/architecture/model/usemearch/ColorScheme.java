/**
 */
package fr.tpt.useme.architecture.model.usemearch;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Color Scheme</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getColorScheme()
 * @model
 * @generated
 */
public enum ColorScheme implements Enumerator {
	/**
	 * The '<em><b>Colors True</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLORS_TRUE_VALUE
	 * @generated
	 * @ordered
	 */
	COLORS_TRUE(0, "ColorsTrue", "ColorsTrue"),

	/**
	 * The '<em><b>Colors65536</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLORS65536_VALUE
	 * @generated
	 * @ordered
	 */
	COLORS65536(1, "Colors65536", "Colors65536"), /**
	 * The '<em><b>Mono Chrome</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONO_CHROME_VALUE
	 * @generated
	 * @ordered
	 */
	MONO_CHROME(2, "MonoChrome", "MonoChrome");

	/**
	 * The '<em><b>Colors True</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Colors True</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLORS_TRUE
	 * @model name="ColorsTrue"
	 * @generated
	 * @ordered
	 */
	public static final int COLORS_TRUE_VALUE = 0;

	/**
	 * The '<em><b>Colors65536</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Colors65536</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLORS65536
	 * @model name="Colors65536"
	 * @generated
	 * @ordered
	 */
	public static final int COLORS65536_VALUE = 1;

	/**
	 * The '<em><b>Mono Chrome</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mono Chrome</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MONO_CHROME
	 * @model name="MonoChrome"
	 * @generated
	 * @ordered
	 */
	public static final int MONO_CHROME_VALUE = 2;

	/**
	 * An array of all the '<em><b>Color Scheme</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ColorScheme[] VALUES_ARRAY =
		new ColorScheme[] {
			COLORS_TRUE,
			COLORS65536,
			MONO_CHROME,
		};

	/**
	 * A public read-only list of all the '<em><b>Color Scheme</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ColorScheme> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Color Scheme</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ColorScheme get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ColorScheme result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Color Scheme</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ColorScheme getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ColorScheme result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Color Scheme</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ColorScheme get(int value) {
		switch (value) {
			case COLORS_TRUE_VALUE: return COLORS_TRUE;
			case COLORS65536_VALUE: return COLORS65536;
			case MONO_CHROME_VALUE: return MONO_CHROME;
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
	private ColorScheme(int value, String name, String literal) {
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
	
} //ColorScheme
