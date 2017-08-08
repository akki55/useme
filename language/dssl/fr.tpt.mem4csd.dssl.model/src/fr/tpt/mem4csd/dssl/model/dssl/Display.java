/**
 */
package fr.tpt.mem4csd.dssl.model.dssl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Display</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.mem4csd.dssl.model.dssl.Display#getResolutionX <em>Resolution X</em>}</li>
 *   <li>{@link fr.tpt.mem4csd.dssl.model.dssl.Display#getResolutionY <em>Resolution Y</em>}</li>
 *   <li>{@link fr.tpt.mem4csd.dssl.model.dssl.Display#getSupportedColors <em>Supported Colors</em>}</li>
 * </ul>
 *
 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslPackage#getDisplay()
 * @model
 * @generated
 */
public interface Display extends HardwareTool {
	/**
	 * Returns the value of the '<em><b>Resolution X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolution X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolution X</em>' attribute.
	 * @see #setResolutionX(int)
	 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslPackage#getDisplay_ResolutionX()
	 * @model required="true"
	 * @generated
	 */
	int getResolutionX();

	/**
	 * Sets the value of the '{@link fr.tpt.mem4csd.dssl.model.dssl.Display#getResolutionX <em>Resolution X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution X</em>' attribute.
	 * @see #getResolutionX()
	 * @generated
	 */
	void setResolutionX(int value);

	/**
	 * Returns the value of the '<em><b>Resolution Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolution Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolution Y</em>' attribute.
	 * @see #setResolutionY(int)
	 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslPackage#getDisplay_ResolutionY()
	 * @model required="true"
	 * @generated
	 */
	int getResolutionY();

	/**
	 * Sets the value of the '{@link fr.tpt.mem4csd.dssl.model.dssl.Display#getResolutionY <em>Resolution Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution Y</em>' attribute.
	 * @see #getResolutionY()
	 * @generated
	 */
	void setResolutionY(int value);

	/**
	 * Returns the value of the '<em><b>Supported Colors</b></em>' attribute list.
	 * The list contents are of type {@link fr.tpt.mem4csd.dssl.model.dssl.ColorScheme}.
	 * The literals are from the enumeration {@link fr.tpt.mem4csd.dssl.model.dssl.ColorScheme}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported Colors</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Colors</em>' attribute list.
	 * @see fr.tpt.mem4csd.dssl.model.dssl.ColorScheme
	 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslPackage#getDisplay_SupportedColors()
	 * @model required="true"
	 * @generated
	 */
	EList<ColorScheme> getSupportedColors();

} // Display
