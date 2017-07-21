/**
 */
package pt.fct.unl.novalincs.useme.model.Utility;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import pt.fct.unl.novalincs.useme.model.SurveyModeling.BackgroundQs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.LogicalExpression#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.LogicalExpression#getClassifierName <em>Classifier Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.LogicalExpression#getExpression <em>Expression</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.LogicalExpression#getProfileTemplate <em>Profile Template</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.LogicalExpression#getQuestion <em>Question</em>}</li>
 * </ul>
 *
 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage#getLogicalExpression()
 * @model
 * @generated
 */
public interface LogicalExpression extends EObject {
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
	 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage#getLogicalExpression_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.Utility.LogicalExpression#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Classifier Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifier Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier Name</em>' attribute.
	 * @see #setClassifierName(String)
	 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage#getLogicalExpression_ClassifierName()
	 * @model default="" required="true"
	 * @generated
	 */
	String getClassifierName();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.Utility.LogicalExpression#getClassifierName <em>Classifier Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier Name</em>' attribute.
	 * @see #getClassifierName()
	 * @generated
	 */
	void setClassifierName(String value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute list.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage#getLogicalExpression_Expression()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getExpression();

	/**
	 * Returns the value of the '<em><b>Profile Template</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.Utility.ProfileTemplate}.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.Utility.ProfileTemplate#getClassifiers <em>Classifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile Template</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile Template</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage#getLogicalExpression_ProfileTemplate()
	 * @see pt.fct.unl.novalincs.useme.model.Utility.ProfileTemplate#getClassifiers
	 * @model opposite="classifiers" ordered="false"
	 * @generated
	 */
	EList<ProfileTemplate> getProfileTemplate();

	/**
	 * Returns the value of the '<em><b>Question</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.SurveyModeling.BackgroundQs}.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.BackgroundQs#getLogicalExpression <em>Logical Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Question</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage#getLogicalExpression_Question()
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.BackgroundQs#getLogicalExpression
	 * @model opposite="logicalExpression"
	 * @generated
	 */
	EList<BackgroundQs> getQuestion();

} // LogicalExpression
