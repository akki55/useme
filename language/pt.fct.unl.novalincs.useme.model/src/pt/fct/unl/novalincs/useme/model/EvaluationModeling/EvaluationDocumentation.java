/**
 */
package pt.fct.unl.novalincs.useme.model.EvaluationModeling;

import org.eclipse.emf.common.util.EList;

import pt.fct.unl.novalincs.useme.model.ContextModeling.Scenario;

import pt.fct.unl.novalincs.useme.model.Utility.Documentation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluation Documentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationDocumentation#getEvaluationModel <em>Evaluation Model</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationDocumentation#getScenario <em>Scenario</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationDocumentation#getRelatedDocumentation <em>Related Documentation</em>}</li>
 * </ul>
 *
 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage#getEvaluationDocumentation()
 * @model
 * @generated
 */
public interface EvaluationDocumentation extends Documentation {
	/**
	 * Returns the value of the '<em><b>Evaluation Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluation Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluation Model</em>' reference.
	 * @see #setEvaluationModel(EvaluationModel)
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage#getEvaluationDocumentation_EvaluationModel()
	 * @model ordered="false"
	 * @generated
	 */
	EvaluationModel getEvaluationModel();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationDocumentation#getEvaluationModel <em>Evaluation Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evaluation Model</em>' reference.
	 * @see #getEvaluationModel()
	 * @generated
	 */
	void setEvaluationModel(EvaluationModel value);

	/**
	 * Returns the value of the '<em><b>Scenario</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.ContextModeling.Scenario}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenario</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage#getEvaluationDocumentation_Scenario()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Scenario> getScenario();

	/**
	 * Returns the value of the '<em><b>Related Documentation</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.Utility.Documentation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Documentation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Documentation</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage#getEvaluationDocumentation_RelatedDocumentation()
	 * @model
	 * @generated
	 */
	EList<Documentation> getRelatedDocumentation();

} // EvaluationDocumentation
