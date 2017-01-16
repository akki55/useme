/**
 */
package pt.fct.unl.novalincs.useme.model.SurveyModeling;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage;

import pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModelingPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModelingFactory
 * @model kind="package"
 * @generated
 */
public interface SurveyModelingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SurveyModeling";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://nova-lincs.di.fct.unl.pt/useme.surveymodeling";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "useme.surveymodeling";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SurveyModelingPackage eINSTANCE = pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.SurveyModelingPackageImpl.init();

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.SurveySpecificationImpl <em>Survey Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.SurveySpecificationImpl
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.SurveyModelingPackageImpl#getSurveySpecification()
	 * @generated
	 */
	int SURVEY_SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_SPECIFICATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Survey Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_SPECIFICATION__SURVEY_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Questionnaire</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_SPECIFICATION__QUESTIONNAIRE = 2;

	/**
	 * The feature id for the '<em><b>Survey Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_SPECIFICATION__SURVEY_RESULT = 3;

	/**
	 * The feature id for the '<em><b>Question</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_SPECIFICATION__QUESTION = 4;

	/**
	 * The number of structural features of the '<em>Survey Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_SPECIFICATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Survey Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.SurveyModelImpl <em>Survey Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.SurveyModelImpl
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.SurveyModelingPackageImpl#getSurveyModel()
	 * @generated
	 */
	int SURVEY_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_MODEL__NAME = EvaluationModelingPackage.TEST_MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Evaluation Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_MODEL__EVALUATION_MODEL = EvaluationModelingPackage.TEST_MODEL__EVALUATION_MODEL;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_MODEL__PARTICIPANT = EvaluationModelingPackage.TEST_MODEL__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Questionnaire</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_MODEL__QUESTIONNAIRE = EvaluationModelingPackage.TEST_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Survey Engine</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_MODEL__SURVEY_ENGINE = EvaluationModelingPackage.TEST_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Survey Result</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_MODEL__SURVEY_RESULT = EvaluationModelingPackage.TEST_MODEL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Survey Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_MODEL_FEATURE_COUNT = EvaluationModelingPackage.TEST_MODEL_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Survey Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_MODEL_OPERATION_COUNT = EvaluationModelingPackage.TEST_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.QuestionImpl
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.SurveyModelingPackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__QUESTION = 1;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__SCALE = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Questionnaire</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__QUESTIONNAIRE = 4;

	/**
	 * The number of structural features of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.SurveyResultImpl <em>Survey Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.SurveyResultImpl
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.SurveyModelingPackageImpl#getSurveyResult()
	 * @generated
	 */
	int SURVEY_RESULT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_RESULT__NAME = ReportModelingPackage.EVALUATION_RESULT__NAME;

	/**
	 * The feature id for the '<em><b>Outside Reference</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_RESULT__OUTSIDE_REFERENCE = ReportModelingPackage.EVALUATION_RESULT__OUTSIDE_REFERENCE;

	/**
	 * The feature id for the '<em><b>Report Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_RESULT__REPORT_MODEL = ReportModelingPackage.EVALUATION_RESULT__REPORT_MODEL;

	/**
	 * The feature id for the '<em><b>Evaluation Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_RESULT__EVALUATION_CONTEXT = ReportModelingPackage.EVALUATION_RESULT__EVALUATION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Survey Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_RESULT__SURVEY_MODEL = ReportModelingPackage.EVALUATION_RESULT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Survey Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_RESULT_FEATURE_COUNT = ReportModelingPackage.EVALUATION_RESULT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Survey Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_RESULT_OPERATION_COUNT = ReportModelingPackage.EVALUATION_RESULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.BackgroundQsImpl <em>Background Qs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.BackgroundQsImpl
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.SurveyModelingPackageImpl#getBackgroundQs()
	 * @generated
	 */
	int BACKGROUND_QS = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_QS__NAME = QUESTION__NAME;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_QS__QUESTION = QUESTION__QUESTION;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_QS__SCALE = QUESTION__SCALE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_QS__TYPE = QUESTION__TYPE;

	/**
	 * The feature id for the '<em><b>Questionnaire</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_QS__QUESTIONNAIRE = QUESTION__QUESTIONNAIRE;

	/**
	 * The feature id for the '<em><b>User Profile</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_QS__USER_PROFILE = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Logical Expression</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_QS__LOGICAL_EXPRESSION = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Background Qs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_QS_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Background Qs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_QS_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.FeedbackQsImpl <em>Feedback Qs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.FeedbackQsImpl
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.SurveyModelingPackageImpl#getFeedbackQs()
	 * @generated
	 */
	int FEEDBACK_QS = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_QS__NAME = QUESTION__NAME;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_QS__QUESTION = QUESTION__QUESTION;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_QS__SCALE = QUESTION__SCALE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_QS__TYPE = QUESTION__TYPE;

	/**
	 * The feature id for the '<em><b>Questionnaire</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_QS__QUESTIONNAIRE = QUESTION__QUESTIONNAIRE;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_QS__SCENARIO = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feedback Qs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_QS_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Feedback Qs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_QS_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.QuestionnaireImpl <em>Questionnaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.QuestionnaireImpl
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.SurveyModelingPackageImpl#getQuestionnaire()
	 * @generated
	 */
	int QUESTIONNAIRE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Question</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE__QUESTION = 1;

	/**
	 * The feature id for the '<em><b>Survey Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE__SURVEY_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Usability Requirement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE__USABILITY_REQUIREMENT = 3;

	/**
	 * The number of structural features of the '<em>Questionnaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Questionnaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveySpecification <em>Survey Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Survey Specification</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveySpecification
	 * @generated
	 */
	EClass getSurveySpecification();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveySpecification#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveySpecification#getName()
	 * @see #getSurveySpecification()
	 * @generated
	 */
	EAttribute getSurveySpecification_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveySpecification#getSurveyModel <em>Survey Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Survey Model</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveySpecification#getSurveyModel()
	 * @see #getSurveySpecification()
	 * @generated
	 */
	EReference getSurveySpecification_SurveyModel();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveySpecification#getQuestionnaire <em>Questionnaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Questionnaire</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveySpecification#getQuestionnaire()
	 * @see #getSurveySpecification()
	 * @generated
	 */
	EReference getSurveySpecification_Questionnaire();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveySpecification#getSurveyResult <em>Survey Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Survey Result</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveySpecification#getSurveyResult()
	 * @see #getSurveySpecification()
	 * @generated
	 */
	EReference getSurveySpecification_SurveyResult();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveySpecification#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Question</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveySpecification#getQuestion()
	 * @see #getSurveySpecification()
	 * @generated
	 */
	EReference getSurveySpecification_Question();

	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModel <em>Survey Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Survey Model</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModel
	 * @generated
	 */
	EClass getSurveyModel();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModel#getQuestionnaire <em>Questionnaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Questionnaire</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModel#getQuestionnaire()
	 * @see #getSurveyModel()
	 * @generated
	 */
	EReference getSurveyModel_Questionnaire();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModel#getSurveyEngine <em>Survey Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Survey Engine</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModel#getSurveyEngine()
	 * @see #getSurveyModel()
	 * @generated
	 */
	EReference getSurveyModel_SurveyEngine();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModel#getSurveyResult <em>Survey Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Survey Result</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModel#getSurveyResult()
	 * @see #getSurveyModel()
	 * @generated
	 */
	EReference getSurveyModel_SurveyResult();

	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.Question
	 * @generated
	 */
	EClass getQuestion();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.Question#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.Question#getName()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Name();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.Question#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Question</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.Question#getQuestion()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Question();

	/**
	 * Returns the meta object for the attribute list '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.Question#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Scale</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.Question#getScale()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Scale();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.Question#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.Question#getType()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Type();

	/**
	 * Returns the meta object for the reference '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.Question#getQuestionnaire <em>Questionnaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Questionnaire</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.Question#getQuestionnaire()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_Questionnaire();

	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyResult <em>Survey Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Survey Result</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyResult
	 * @generated
	 */
	EClass getSurveyResult();

	/**
	 * Returns the meta object for the reference '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyResult#getSurveyModel <em>Survey Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Survey Model</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyResult#getSurveyModel()
	 * @see #getSurveyResult()
	 * @generated
	 */
	EReference getSurveyResult_SurveyModel();

	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.BackgroundQs <em>Background Qs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Background Qs</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.BackgroundQs
	 * @generated
	 */
	EClass getBackgroundQs();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.BackgroundQs#getUserProfile <em>User Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>User Profile</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.BackgroundQs#getUserProfile()
	 * @see #getBackgroundQs()
	 * @generated
	 */
	EReference getBackgroundQs_UserProfile();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.BackgroundQs#getLogicalExpression <em>Logical Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Logical Expression</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.BackgroundQs#getLogicalExpression()
	 * @see #getBackgroundQs()
	 * @generated
	 */
	EReference getBackgroundQs_LogicalExpression();

	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.FeedbackQs <em>Feedback Qs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feedback Qs</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.FeedbackQs
	 * @generated
	 */
	EClass getFeedbackQs();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.FeedbackQs#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scenario</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.FeedbackQs#getScenario()
	 * @see #getFeedbackQs()
	 * @generated
	 */
	EReference getFeedbackQs_Scenario();

	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.Questionnaire <em>Questionnaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Questionnaire</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.Questionnaire
	 * @generated
	 */
	EClass getQuestionnaire();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.Questionnaire#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.Questionnaire#getName()
	 * @see #getQuestionnaire()
	 * @generated
	 */
	EAttribute getQuestionnaire_Name();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.Questionnaire#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Question</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.Questionnaire#getQuestion()
	 * @see #getQuestionnaire()
	 * @generated
	 */
	EReference getQuestionnaire_Question();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.Questionnaire#getSurveyModel <em>Survey Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Survey Model</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.Questionnaire#getSurveyModel()
	 * @see #getQuestionnaire()
	 * @generated
	 */
	EReference getQuestionnaire_SurveyModel();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.Questionnaire#getUsabilityRequirement <em>Usability Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Usability Requirement</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.Questionnaire#getUsabilityRequirement()
	 * @see #getQuestionnaire()
	 * @generated
	 */
	EReference getQuestionnaire_UsabilityRequirement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SurveyModelingFactory getSurveyModelingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.SurveySpecificationImpl <em>Survey Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.SurveySpecificationImpl
		 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.SurveyModelingPackageImpl#getSurveySpecification()
		 * @generated
		 */
		EClass SURVEY_SPECIFICATION = eINSTANCE.getSurveySpecification();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_SPECIFICATION__NAME = eINSTANCE.getSurveySpecification_Name();

		/**
		 * The meta object literal for the '<em><b>Survey Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURVEY_SPECIFICATION__SURVEY_MODEL = eINSTANCE.getSurveySpecification_SurveyModel();

		/**
		 * The meta object literal for the '<em><b>Questionnaire</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURVEY_SPECIFICATION__QUESTIONNAIRE = eINSTANCE.getSurveySpecification_Questionnaire();

		/**
		 * The meta object literal for the '<em><b>Survey Result</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURVEY_SPECIFICATION__SURVEY_RESULT = eINSTANCE.getSurveySpecification_SurveyResult();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURVEY_SPECIFICATION__QUESTION = eINSTANCE.getSurveySpecification_Question();

		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.SurveyModelImpl <em>Survey Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.SurveyModelImpl
		 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.SurveyModelingPackageImpl#getSurveyModel()
		 * @generated
		 */
		EClass SURVEY_MODEL = eINSTANCE.getSurveyModel();

		/**
		 * The meta object literal for the '<em><b>Questionnaire</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURVEY_MODEL__QUESTIONNAIRE = eINSTANCE.getSurveyModel_Questionnaire();

		/**
		 * The meta object literal for the '<em><b>Survey Engine</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURVEY_MODEL__SURVEY_ENGINE = eINSTANCE.getSurveyModel_SurveyEngine();

		/**
		 * The meta object literal for the '<em><b>Survey Result</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURVEY_MODEL__SURVEY_RESULT = eINSTANCE.getSurveyModel_SurveyResult();

		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.QuestionImpl
		 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.SurveyModelingPackageImpl#getQuestion()
		 * @generated
		 */
		EClass QUESTION = eINSTANCE.getQuestion();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__NAME = eINSTANCE.getQuestion_Name();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__QUESTION = eINSTANCE.getQuestion_Question();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__SCALE = eINSTANCE.getQuestion_Scale();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__TYPE = eINSTANCE.getQuestion_Type();

		/**
		 * The meta object literal for the '<em><b>Questionnaire</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__QUESTIONNAIRE = eINSTANCE.getQuestion_Questionnaire();

		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.SurveyResultImpl <em>Survey Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.SurveyResultImpl
		 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.SurveyModelingPackageImpl#getSurveyResult()
		 * @generated
		 */
		EClass SURVEY_RESULT = eINSTANCE.getSurveyResult();

		/**
		 * The meta object literal for the '<em><b>Survey Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURVEY_RESULT__SURVEY_MODEL = eINSTANCE.getSurveyResult_SurveyModel();

		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.BackgroundQsImpl <em>Background Qs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.BackgroundQsImpl
		 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.SurveyModelingPackageImpl#getBackgroundQs()
		 * @generated
		 */
		EClass BACKGROUND_QS = eINSTANCE.getBackgroundQs();

		/**
		 * The meta object literal for the '<em><b>User Profile</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BACKGROUND_QS__USER_PROFILE = eINSTANCE.getBackgroundQs_UserProfile();

		/**
		 * The meta object literal for the '<em><b>Logical Expression</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BACKGROUND_QS__LOGICAL_EXPRESSION = eINSTANCE.getBackgroundQs_LogicalExpression();

		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.FeedbackQsImpl <em>Feedback Qs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.FeedbackQsImpl
		 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.SurveyModelingPackageImpl#getFeedbackQs()
		 * @generated
		 */
		EClass FEEDBACK_QS = eINSTANCE.getFeedbackQs();

		/**
		 * The meta object literal for the '<em><b>Scenario</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEEDBACK_QS__SCENARIO = eINSTANCE.getFeedbackQs_Scenario();

		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.QuestionnaireImpl <em>Questionnaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.QuestionnaireImpl
		 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.SurveyModelingPackageImpl#getQuestionnaire()
		 * @generated
		 */
		EClass QUESTIONNAIRE = eINSTANCE.getQuestionnaire();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTIONNAIRE__NAME = eINSTANCE.getQuestionnaire_Name();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTIONNAIRE__QUESTION = eINSTANCE.getQuestionnaire_Question();

		/**
		 * The meta object literal for the '<em><b>Survey Model</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTIONNAIRE__SURVEY_MODEL = eINSTANCE.getQuestionnaire_SurveyModel();

		/**
		 * The meta object literal for the '<em><b>Usability Requirement</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTIONNAIRE__USABILITY_REQUIREMENT = eINSTANCE.getQuestionnaire_UsabilityRequirement();

	}

} //SurveyModelingPackage
