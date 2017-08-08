/**
 */
package pt.fct.unl.novalincs.useme.model.Utility;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModel;

import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModel;

import pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DSL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.DSL#getConcreteSyntax <em>Concrete Syntax</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.DSL#getAbstractSyntax <em>Abstract Syntax</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.DSL#getDslName <em>Dsl Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.DSL#getContextModel <em>Context Model</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.DSL#getGoalModel <em>Goal Model</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.DSL#getEvaluationModel <em>Evaluation Model</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.DSL#getExistingGoalModel <em>Existing Goal Model</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.DSL#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 *
 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage#getDSL()
 * @model
 * @generated
 */
public interface DSL extends EObject {
	/**
	 * Returns the value of the '<em><b>Concrete Syntax</b></em>' containment reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.Utility.ConcreteSyntax}.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.Utility.ConcreteSyntax#getDsl <em>Dsl</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete Syntax</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete Syntax</em>' containment reference list.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage#getDSL_ConcreteSyntax()
	 * @see pt.fct.unl.novalincs.useme.model.Utility.ConcreteSyntax#getDsl
	 * @model opposite="dsl" containment="true" ordered="false"
	 * @generated
	 */
	EList<ConcreteSyntax> getConcreteSyntax();

	/**
	 * Returns the value of the '<em><b>Abstract Syntax</b></em>' containment reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.Utility.AbstractSyntax}.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.Utility.AbstractSyntax#getDsl <em>Dsl</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Syntax</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Syntax</em>' containment reference list.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage#getDSL_AbstractSyntax()
	 * @see pt.fct.unl.novalincs.useme.model.Utility.AbstractSyntax#getDsl
	 * @model opposite="dsl" containment="true" ordered="false"
	 * @generated
	 */
	EList<AbstractSyntax> getAbstractSyntax();

	/**
	 * Returns the value of the '<em><b>Dsl Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dsl Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dsl Name</em>' attribute.
	 * @see #setDslName(String)
	 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage#getDSL_DslName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getDslName();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.Utility.DSL#getDslName <em>Dsl Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dsl Name</em>' attribute.
	 * @see #getDslName()
	 * @generated
	 */
	void setDslName(String value);

	/**
	 * Returns the value of the '<em><b>Context Model</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModel}.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModel#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Model</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Model</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage#getDSL_ContextModel()
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModel#getLanguage
	 * @model opposite="language"
	 * @generated
	 */
	EList<ContextModel> getContextModel();

	/**
	 * Returns the value of the '<em><b>Goal Model</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal Model</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal Model</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage#getDSL_GoalModel()
	 * @model
	 * @generated
	 */
	EList<GoalModel> getGoalModel();

	/**
	 * Returns the value of the '<em><b>Evaluation Model</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluation Model</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluation Model</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage#getDSL_EvaluationModel()
	 * @model
	 * @generated
	 */
	EList<EvaluationModel> getEvaluationModel();

	/**
	 * Returns the value of the '<em><b>Existing Goal Model</b></em>' containment reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.Utility.ExistingGM}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Existing Goal Model</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Existing Goal Model</em>' containment reference list.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage#getDSL_ExistingGoalModel()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExistingGM> getExistingGoalModel();

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.Utility.Documentation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage#getDSL_Documentation()
	 * @model
	 * @generated
	 */
	EList<Documentation> getDocumentation();

} // DSL
