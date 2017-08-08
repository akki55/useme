/**
 */
package fr.tpt.mem4csd.dssl.model.dssl;

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
 *   <li>{@link fr.tpt.mem4csd.dssl.model.dssl.Dsl#getOwnedSyntaxes <em>Owned Syntaxes</em>}</li>
 *   <li>{@link fr.tpt.mem4csd.dssl.model.dssl.Dsl#getConcreteSyntaxes <em>Concrete Syntaxes</em>}</li>
 *   <li>{@link fr.tpt.mem4csd.dssl.model.dssl.Dsl#getAbstractsyntax <em>Abstractsyntax</em>}</li>
 *   <li>{@link fr.tpt.mem4csd.dssl.model.dssl.Dsl#getSupportingTools <em>Supporting Tools</em>}</li>
 *   <li>{@link fr.tpt.mem4csd.dssl.model.dssl.Dsl#getOwnedSemantics <em>Owned Semantics</em>}</li>
 *   <li>{@link fr.tpt.mem4csd.dssl.model.dssl.Dsl#getOwnedFeatureDiagrams <em>Owned Feature Diagrams</em>}</li>
 *   <li>{@link fr.tpt.mem4csd.dssl.model.dssl.Dsl#getOwnedDocumentations <em>Owned Documentations</em>}</li>
 *   <li>{@link fr.tpt.mem4csd.dssl.model.dssl.Dsl#getMaintenanceService <em>Maintenance Service</em>}</li>
 * </ul>
 *
 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslPackage#getDsl()
 * @model
 * @generated
 */
public interface Dsl extends EntityType {
	/**
	 * Returns the value of the '<em><b>Owned Syntaxes</b></em>' containment reference list.
	 * The list contents are of type {@link fr.tpt.mem4csd.dssl.model.dssl.Syntax}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Syntaxes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Syntaxes</em>' containment reference list.
	 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslPackage#getDsl_OwnedSyntaxes()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Syntax> getOwnedSyntaxes();

	/**
	 * Returns the value of the '<em><b>Concrete Syntaxes</b></em>' reference list.
	 * The list contents are of type {@link fr.tpt.mem4csd.dssl.model.dssl.ConcreteSyntax}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete Syntaxes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete Syntaxes</em>' reference list.
	 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslPackage#getDsl_ConcreteSyntaxes()
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
	 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslPackage#getDsl_Abstractsyntax()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	AbstractSyntax getAbstractsyntax();

	/**
	 * Returns the value of the '<em><b>Supporting Tools</b></em>' reference list.
	 * The list contents are of type {@link fr.tpt.mem4csd.dssl.model.dssl.SoftwareTool}.
	 * It is bidirectional and its opposite is '{@link fr.tpt.mem4csd.dssl.model.dssl.SoftwareTool#getSupportedLanguages <em>Supported Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supporting Tools</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supporting Tools</em>' reference list.
	 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslPackage#getDsl_SupportingTools()
	 * @see fr.tpt.mem4csd.dssl.model.dssl.SoftwareTool#getSupportedLanguages
	 * @model opposite="supportedLanguages"
	 * @generated
	 */
	EList<SoftwareTool> getSupportingTools();

	/**
	 * Returns the value of the '<em><b>Owned Semantics</b></em>' containment reference list.
	 * The list contents are of type {@link fr.tpt.mem4csd.dssl.model.dssl.Semantics}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Semantics</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Semantics</em>' containment reference list.
	 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslPackage#getDsl_OwnedSemantics()
	 * @model containment="true"
	 * @generated
	 */
	EList<Semantics> getOwnedSemantics();

	/**
	 * Returns the value of the '<em><b>Owned Feature Diagrams</b></em>' containment reference list.
	 * The list contents are of type {@link fr.tpt.mem4csd.dssl.model.dssl.FeatureDiagram}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Feature Diagrams</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Feature Diagrams</em>' containment reference list.
	 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslPackage#getDsl_OwnedFeatureDiagrams()
	 * @model containment="true"
	 * @generated
	 */
	EList<FeatureDiagram> getOwnedFeatureDiagrams();

	/**
	 * Returns the value of the '<em><b>Owned Documentations</b></em>' containment reference list.
	 * The list contents are of type {@link fr.tpt.mem4csd.dssl.model.dssl.Documentation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Documentations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Documentations</em>' containment reference list.
	 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslPackage#getDsl_OwnedDocumentations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Documentation> getOwnedDocumentations();

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
	 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslPackage#getDsl_MaintenanceService()
	 * @model
	 * @generated
	 */
	MaintenanceService getMaintenanceService();

	/**
	 * Sets the value of the '{@link fr.tpt.mem4csd.dssl.model.dssl.Dsl#getMaintenanceService <em>Maintenance Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maintenance Service</em>' reference.
	 * @see #getMaintenanceService()
	 * @generated
	 */
	void setMaintenanceService(MaintenanceService value);

} // Dsl
