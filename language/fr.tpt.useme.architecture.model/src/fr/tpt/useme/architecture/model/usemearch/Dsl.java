/**
 */
package fr.tpt.useme.architecture.model.usemearch;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dsl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.Dsl#getOwnedSyntaxes <em>Owned Syntaxes</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.Dsl#getConcreteSyntaxes <em>Concrete Syntaxes</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.Dsl#getAbstractsyntax <em>Abstractsyntax</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.Dsl#getSupportingTools <em>Supporting Tools</em>}</li>
 * </ul>
 *
 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getDsl()
 * @model
 * @generated
 */
public interface Dsl extends EnvironmentalElement {
	/**
	 * Returns the value of the '<em><b>Owned Syntaxes</b></em>' containment reference list.
	 * The list contents are of type {@link fr.tpt.useme.architecture.model.usemearch.Syntax}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Syntaxes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Syntaxes</em>' containment reference list.
	 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getDsl_OwnedSyntaxes()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Syntax> getOwnedSyntaxes();

	/**
	 * Returns the value of the '<em><b>Concrete Syntaxes</b></em>' reference list.
	 * The list contents are of type {@link fr.tpt.useme.architecture.model.usemearch.ConcreteSyntax}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete Syntaxes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete Syntaxes</em>' reference list.
	 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getDsl_ConcreteSyntaxes()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<ConcreteSyntax> getConcreteSyntaxes();

	/**
	 * Returns the value of the '<em><b>Abstractsyntax</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstractsyntax</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstractsyntax</em>' reference.
	 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getDsl_Abstractsyntax()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	AbstractSyntax getAbstractsyntax();

	/**
	 * Returns the value of the '<em><b>Supporting Tools</b></em>' reference list.
	 * The list contents are of type {@link fr.tpt.useme.architecture.model.usemearch.SoftwareTool}.
	 * It is bidirectional and its opposite is '{@link fr.tpt.useme.architecture.model.usemearch.SoftwareTool#getSupportedLanguages <em>Supported Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supporting Tools</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supporting Tools</em>' reference list.
	 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getDsl_SupportingTools()
	 * @see fr.tpt.useme.architecture.model.usemearch.SoftwareTool#getSupportedLanguages
	 * @model opposite="supportedLanguages"
	 * @generated
	 */
	EList<SoftwareTool> getSupportingTools();

} // Dsl
