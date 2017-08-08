/**
 */
package fr.tpt.mem4csd.dssl.model.dssl;

import fr.labsticc.framework.constraints.model.constraints.NaturalConstraintLanguage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concrete Syntax</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.mem4csd.dssl.model.dssl.ConcreteSyntax#getLanguage <em>Language</em>}</li>
 * </ul>
 *
 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslPackage#getConcreteSyntax()
 * @model abstract="true"
 * @generated
 */
public interface ConcreteSyntax extends Syntax {
	/**
	 * Returns the value of the '<em><b>Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' reference.
	 * @see #setLanguage(NaturalConstraintLanguage)
	 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslPackage#getConcreteSyntax_Language()
	 * @model
	 * @generated
	 */
	NaturalConstraintLanguage getLanguage();

	/**
	 * Sets the value of the '{@link fr.tpt.mem4csd.dssl.model.dssl.ConcreteSyntax#getLanguage <em>Language</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' reference.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(NaturalConstraintLanguage value);

} // ConcreteSyntax
