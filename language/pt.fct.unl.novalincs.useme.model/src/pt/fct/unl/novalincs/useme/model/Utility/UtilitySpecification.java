/**
 */
package pt.fct.unl.novalincs.useme.model.Utility;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import pt.fct.unl.novalincs.useme.model.EvaluationModeling.Documentation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.UtilitySpecification#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.UtilitySpecification#getDSL <em>DSL</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.UtilitySpecification#getFunctionalGoal <em>Functional Goal</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.UtilitySpecification#getProcessModel <em>Process Model</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.UtilitySpecification#getSurveyEngine <em>Survey Engine</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.UtilitySpecification#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.UtilitySpecification#getOutsideRef <em>Outside Ref</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.UtilitySpecification#getRequirement <em>Requirement</em>}</li>
 * </ul>
 *
 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage#getUtilitySpecification()
 * @model
 * @generated
 */
public interface UtilitySpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage#getUtilitySpecification_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.Utility.UtilitySpecification#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>DSL</b></em>' containment reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.Utility.DSL}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DSL</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DSL</em>' containment reference list.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage#getUtilitySpecification_DSL()
	 * @model containment="true"
	 * @generated
	 */
	EList<DSL> getDSL();

	/**
	 * Returns the value of the '<em><b>Functional Goal</b></em>' containment reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.Utility.FunctionalGoal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functional Goal</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functional Goal</em>' containment reference list.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage#getUtilitySpecification_FunctionalGoal()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionalGoal> getFunctionalGoal();

	/**
	 * Returns the value of the '<em><b>Process Model</b></em>' containment reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.Utility.ProcessModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Model</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Model</em>' containment reference list.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage#getUtilitySpecification_ProcessModel()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProcessModel> getProcessModel();

	/**
	 * Returns the value of the '<em><b>Survey Engine</b></em>' containment reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.Utility.SurveyEngine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Survey Engine</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Survey Engine</em>' containment reference list.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage#getUtilitySpecification_SurveyEngine()
	 * @model containment="true"
	 * @generated
	 */
	EList<SurveyEngine> getSurveyEngine();

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.Documentation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference list.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage#getUtilitySpecification_Documentation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Documentation> getDocumentation();

	/**
	 * Returns the value of the '<em><b>Outside Ref</b></em>' containment reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.Utility.OutsideRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outside Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outside Ref</em>' containment reference list.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage#getUtilitySpecification_OutsideRef()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutsideRef> getOutsideRef();

	/**
	 * Returns the value of the '<em><b>Requirement</b></em>' containment reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.Utility.Requirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement</em>' containment reference list.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage#getUtilitySpecification_Requirement()
	 * @model containment="true"
	 * @generated
	 */
	EList<Requirement> getRequirement();

} // UtilitySpecification
