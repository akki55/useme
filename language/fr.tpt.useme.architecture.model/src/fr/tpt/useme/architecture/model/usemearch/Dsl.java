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
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.Dsl#getSemantics <em>Semantics</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.Dsl#getDomainConcepts <em>Domain Concepts</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.Dsl#getFeatureDiagrams <em>Feature Diagrams</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.Dsl#getModelCheckers <em>Model Checkers</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.Dsl#getModelSimulators <em>Model Simulators</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.Dsl#getDocumentations <em>Documentations</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.Dsl#getMaintenanceService <em>Maintenance Service</em>}</li>
 * </ul>
 *
 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getDsl()
 * @model
 * @generated
 */
public interface Dsl extends ContextElementType {
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

	/**
	 * Returns the value of the '<em><b>Semantics</b></em>' reference list.
	 * The list contents are of type {@link fr.tpt.useme.architecture.model.usemearch.Semantic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semantics</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantics</em>' reference list.
	 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getDsl_Semantics()
	 * @model
	 * @generated
	 */
	EList<Semantic> getSemantics();

	/**
	 * Returns the value of the '<em><b>Domain Concepts</b></em>' reference list.
	 * The list contents are of type {@link fr.tpt.useme.architecture.model.usemearch.DomainConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Concepts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Concepts</em>' reference list.
	 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getDsl_DomainConcepts()
	 * @model
	 * @generated
	 */
	EList<DomainConcept> getDomainConcepts();

	/**
	 * Returns the value of the '<em><b>Feature Diagrams</b></em>' reference list.
	 * The list contents are of type {@link fr.tpt.useme.architecture.model.usemearch.FeatureDiagram}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Diagrams</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Diagrams</em>' reference list.
	 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getDsl_FeatureDiagrams()
	 * @model
	 * @generated
	 */
	EList<FeatureDiagram> getFeatureDiagrams();

	/**
	 * Returns the value of the '<em><b>Model Checkers</b></em>' reference list.
	 * The list contents are of type {@link fr.tpt.useme.architecture.model.usemearch.ModelChecker}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Checkers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Checkers</em>' reference list.
	 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getDsl_ModelCheckers()
	 * @model
	 * @generated
	 */
	EList<ModelChecker> getModelCheckers();

	/**
	 * Returns the value of the '<em><b>Model Simulators</b></em>' reference list.
	 * The list contents are of type {@link fr.tpt.useme.architecture.model.usemearch.ModelSimulator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Simulators</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Simulators</em>' reference list.
	 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getDsl_ModelSimulators()
	 * @model
	 * @generated
	 */
	EList<ModelSimulator> getModelSimulators();

	/**
	 * Returns the value of the '<em><b>Documentations</b></em>' reference list.
	 * The list contents are of type {@link fr.tpt.useme.architecture.model.usemearch.Documentation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentations</em>' reference list.
	 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getDsl_Documentations()
	 * @model
	 * @generated
	 */
	EList<Documentation> getDocumentations();

	/**
	 * Returns the value of the '<em><b>Maintenance Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maintenance Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maintenance Service</em>' reference.
	 * @see #setMaintenanceService(MaintenanceService)
	 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getDsl_MaintenanceService()
	 * @model
	 * @generated
	 */
	MaintenanceService getMaintenanceService();

	/**
	 * Sets the value of the '{@link fr.tpt.useme.architecture.model.usemearch.Dsl#getMaintenanceService <em>Maintenance Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maintenance Service</em>' reference.
	 * @see #getMaintenanceService()
	 * @generated
	 */
	void setMaintenanceService(MaintenanceService value);

} // Dsl
