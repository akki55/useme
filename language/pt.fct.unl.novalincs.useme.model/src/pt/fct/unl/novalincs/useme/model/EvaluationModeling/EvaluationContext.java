/**
 */
package pt.fct.unl.novalincs.useme.model.EvaluationModeling;

import org.eclipse.emf.common.util.EList;

import pt.fct.unl.novalincs.useme.model.ContextModeling.Scenario;

import pt.fct.unl.novalincs.useme.model.GoalModeling.Scope;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluation Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationContext#getEvaluationModel <em>Evaluation Model</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationContext#getScenario <em>Scenario</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationContext#getEnviromentInstance <em>Enviroment Instance</em>}</li>
 * </ul>
 *
 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage#getEvaluationContext()
 * @model
 * @generated
 */
public interface EvaluationContext extends Scope {
	/**
	 * Returns the value of the '<em><b>Evaluation Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModel#getEvaluationContext <em>Evaluation Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluation Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluation Model</em>' reference.
	 * @see #setEvaluationModel(EvaluationModel)
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage#getEvaluationContext_EvaluationModel()
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModel#getEvaluationContext
	 * @model opposite="evaluationContext" required="true" ordered="false"
	 * @generated
	 */
	EvaluationModel getEvaluationModel();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationContext#getEvaluationModel <em>Evaluation Model</em>}' reference.
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
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage#getEvaluationContext_Scenario()
	 * @model
	 * @generated
	 */
	EList<Scenario> getScenario();

	/**
	 * Returns the value of the '<em><b>Enviroment Instance</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enviroment Instance</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enviroment Instance</em>' attribute list.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage#getEvaluationContext_EnviromentInstance()
	 * @model
	 * @generated
	 */
	EList<String> getEnviromentInstance();

} // EvaluationContext
