/**
 */
package pt.fct.unl.novalincs.useme.model.SurveyModeling;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.Question#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.Question#getQuestion <em>Question</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.Question#getScale <em>Scale</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.Question#getType <em>Type</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.Question#getQuestionnaire <em>Questionnaire</em>}</li>
 * </ul>
 *
 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModelingPackage#getQuestion()
 * @model
 * @generated
 */
public interface Question extends EObject {
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
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModelingPackage#getQuestion_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.Question#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Question</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Question</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question</em>' attribute.
	 * @see #setQuestion(String)
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModelingPackage#getQuestion_Question()
	 * @model default="" required="true"
	 * @generated
	 */
	String getQuestion();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.Question#getQuestion <em>Question</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question</em>' attribute.
	 * @see #getQuestion()
	 * @generated
	 */
	void setQuestion(String value);

	/**
	 * Returns the value of the '<em><b>Scale</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' attribute list.
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModelingPackage#getQuestion_Scale()
	 * @model
	 * @generated
	 */
	EList<String> getScale();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModelingPackage#getQuestion_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.Question#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Questionnaire</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.Questionnaire#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Questionnaire</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Questionnaire</em>' reference.
	 * @see #setQuestionnaire(Questionnaire)
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModelingPackage#getQuestion_Questionnaire()
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.Questionnaire#getQuestion
	 * @model opposite="question"
	 * @generated
	 */
	Questionnaire getQuestionnaire();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.Question#getQuestionnaire <em>Questionnaire</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Questionnaire</em>' reference.
	 * @see #getQuestionnaire()
	 * @generated
	 */
	void setQuestionnaire(Questionnaire value);

} // Question
