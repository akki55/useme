/**
 */
package pt.fct.unl.novalincs.useme.model.EvaluationModeling;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModelingPackage;

import pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage;

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
 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingFactory
 * @model kind="package"
 * @generated
 */
public interface EvaluationModelingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "EvaluationModeling";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://nova-lincs.di.fct.unl.pt/useme.evaluationmodeling";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "useme.evaluationmodeling";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EvaluationModelingPackage eINSTANCE = pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationModelingPackageImpl.init();

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationSpecificationImpl <em>Evaluation Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationSpecificationImpl
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationModelingPackageImpl#getEvaluationSpecification()
	 * @generated
	 */
	int EVALUATION_SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_SPECIFICATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Evaluation Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_SPECIFICATION__EVALUATION_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Evaluation Goal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_SPECIFICATION__EVALUATION_GOAL = 2;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_SPECIFICATION__PARTICIPANT = 3;

	/**
	 * The feature id for the '<em><b>Documentaton</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_SPECIFICATION__DOCUMENTATON = 4;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_SPECIFICATION__LANGUAGE = 5;

	/**
	 * The feature id for the '<em><b>Evaluation Context</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_SPECIFICATION__EVALUATION_CONTEXT = 6;

	/**
	 * The feature id for the '<em><b>Process</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_SPECIFICATION__PROCESS = 7;

	/**
	 * The feature id for the '<em><b>Test Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_SPECIFICATION__TEST_MODEL = 8;

	/**
	 * The number of structural features of the '<em>Evaluation Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_SPECIFICATION_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Evaluation Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationModelImpl <em>Evaluation Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationModelImpl
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationModelingPackageImpl#getEvaluationModel()
	 * @generated
	 */
	int EVALUATION_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Evaluation Goal</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_MODEL__EVALUATION_GOAL = 1;

	/**
	 * The feature id for the '<em><b>Evaluation Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_MODEL__EVALUATION_CONTEXT = 2;

	/**
	 * The feature id for the '<em><b>Language</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_MODEL__LANGUAGE = 3;

	/**
	 * The feature id for the '<em><b>Process</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_MODEL__PROCESS = 4;

	/**
	 * The feature id for the '<em><b>Test Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_MODEL__TEST_MODEL = 5;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_MODEL__DOC = 6;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_MODEL__PARTICIPANT = 7;

	/**
	 * The number of structural features of the '<em>Evaluation Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_MODEL_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Evaluation Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationGoalImpl <em>Evaluation Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationGoalImpl
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationModelingPackageImpl#getEvaluationGoal()
	 * @generated
	 */
	int EVALUATION_GOAL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_GOAL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Evaluation Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_GOAL__EVALUATION_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Comperative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_GOAL__COMPERATIVE = 2;

	/**
	 * The feature id for the '<em><b>Language</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_GOAL__LANGUAGE = 3;

	/**
	 * The feature id for the '<em><b>Research Question</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_GOAL__RESEARCH_QUESTION = 4;

	/**
	 * The feature id for the '<em><b>Usability Goal</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_GOAL__USABILITY_GOAL = 5;

	/**
	 * The feature id for the '<em><b>Mesurment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_GOAL__MESURMENT = 6;

	/**
	 * The feature id for the '<em><b>Usability Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_GOAL__USABILITY_REQUIREMENT = 7;

	/**
	 * The feature id for the '<em><b>Hypothesis</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_GOAL__HYPOTHESIS = 8;

	/**
	 * The feature id for the '<em><b>Responsible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_GOAL__RESPONSIBLE = 9;

	/**
	 * The feature id for the '<em><b>Problem Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_GOAL__PROBLEM_DESCRIPTION = 10;

	/**
	 * The number of structural features of the '<em>Evaluation Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_GOAL_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Evaluation Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_GOAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.LanguageImpl <em>Language</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.LanguageImpl
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationModelingPackageImpl#getLanguage()
	 * @generated
	 */
	int LANGUAGE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Evaluation Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__EVALUATION_MODEL = 2;

	/**
	 * The feature id for the '<em><b>DSL</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__DSL = 3;

	/**
	 * The number of structural features of the '<em>Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationContextImpl <em>Evaluation Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationContextImpl
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationModelingPackageImpl#getEvaluationContext()
	 * @generated
	 */
	int EVALUATION_CONTEXT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_CONTEXT__NAME = GoalModelingPackage.SCOPE__NAME;

	/**
	 * The feature id for the '<em><b>Context Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_CONTEXT__CONTEXT_MODEL = GoalModelingPackage.SCOPE__CONTEXT_MODEL;

	/**
	 * The feature id for the '<em><b>Usability Goal</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_CONTEXT__USABILITY_GOAL = GoalModelingPackage.SCOPE__USABILITY_GOAL;

	/**
	 * The feature id for the '<em><b>User Profile Selection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_CONTEXT__USER_PROFILE_SELECTION = GoalModelingPackage.SCOPE__USER_PROFILE_SELECTION;

	/**
	 * The feature id for the '<em><b>Context Environment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_CONTEXT__CONTEXT_ENVIRONMENT = GoalModelingPackage.SCOPE__CONTEXT_ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Workflow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_CONTEXT__WORKFLOW = GoalModelingPackage.SCOPE__WORKFLOW;

	/**
	 * The feature id for the '<em><b>Evaluation Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_CONTEXT__EVALUATION_MODEL = GoalModelingPackage.SCOPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_CONTEXT__SCENARIO = GoalModelingPackage.SCOPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Enviroment Instance</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_CONTEXT__ENVIROMENT_INSTANCE = GoalModelingPackage.SCOPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Evaluation Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_CONTEXT_FEATURE_COUNT = GoalModelingPackage.SCOPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Evaluation Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_CONTEXT_OPERATION_COUNT = GoalModelingPackage.SCOPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.ProcessImpl
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationModelingPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Evaluation Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__EVALUATION_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Process Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PROCESS_MODEL = 2;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.TestModelImpl <em>Test Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.TestModelImpl
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationModelingPackageImpl#getTestModel()
	 * @generated
	 */
	int TEST_MODEL = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Evaluation Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_MODEL__EVALUATION_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_MODEL__PARTICIPANT = 2;

	/**
	 * The number of structural features of the '<em>Test Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Test Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.ParticipantImpl <em>Participant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.ParticipantImpl
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationModelingPackageImpl#getParticipant()
	 * @generated
	 */
	int PARTICIPANT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__CONTACT = 1;

	/**
	 * The feature id for the '<em><b>Evaluation Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__EVALUATION_MODEL = 2;

	/**
	 * The feature id for the '<em><b>User Profile</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__USER_PROFILE = 3;

	/**
	 * The number of structural features of the '<em>Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationDocumentationImpl <em>Evaluation Documentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationDocumentationImpl
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationModelingPackageImpl#getEvaluationDocumentation()
	 * @generated
	 */
	int EVALUATION_DOCUMENTATION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_DOCUMENTATION__NAME = UtilityPackage.DOCUMENTATION__NAME;

	/**
	 * The feature id for the '<em><b>Outside Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_DOCUMENTATION__OUTSIDE_REF = UtilityPackage.DOCUMENTATION__OUTSIDE_REF;

	/**
	 * The feature id for the '<em><b>Evaluation Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_DOCUMENTATION__EVALUATION_MODEL = UtilityPackage.DOCUMENTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_DOCUMENTATION__SCENARIO = UtilityPackage.DOCUMENTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Related Documentation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_DOCUMENTATION__RELATED_DOCUMENTATION = UtilityPackage.DOCUMENTATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Evaluation Documentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_DOCUMENTATION_FEATURE_COUNT = UtilityPackage.DOCUMENTATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Evaluation Documentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_DOCUMENTATION_OPERATION_COUNT = UtilityPackage.DOCUMENTATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationSpecification <em>Evaluation Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluation Specification</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationSpecification
	 * @generated
	 */
	EClass getEvaluationSpecification();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationSpecification#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationSpecification#getName()
	 * @see #getEvaluationSpecification()
	 * @generated
	 */
	EAttribute getEvaluationSpecification_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationSpecification#getEvaluationModel <em>Evaluation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Evaluation Model</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationSpecification#getEvaluationModel()
	 * @see #getEvaluationSpecification()
	 * @generated
	 */
	EReference getEvaluationSpecification_EvaluationModel();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationSpecification#getEvaluationGoal <em>Evaluation Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Evaluation Goal</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationSpecification#getEvaluationGoal()
	 * @see #getEvaluationSpecification()
	 * @generated
	 */
	EReference getEvaluationSpecification_EvaluationGoal();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationSpecification#getParticipant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participant</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationSpecification#getParticipant()
	 * @see #getEvaluationSpecification()
	 * @generated
	 */
	EReference getEvaluationSpecification_Participant();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationSpecification#getDocumentaton <em>Documentaton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentaton</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationSpecification#getDocumentaton()
	 * @see #getEvaluationSpecification()
	 * @generated
	 */
	EReference getEvaluationSpecification_Documentaton();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationSpecification#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Language</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationSpecification#getLanguage()
	 * @see #getEvaluationSpecification()
	 * @generated
	 */
	EReference getEvaluationSpecification_Language();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationSpecification#getEvaluationContext <em>Evaluation Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Evaluation Context</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationSpecification#getEvaluationContext()
	 * @see #getEvaluationSpecification()
	 * @generated
	 */
	EReference getEvaluationSpecification_EvaluationContext();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationSpecification#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Process</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationSpecification#getProcess()
	 * @see #getEvaluationSpecification()
	 * @generated
	 */
	EReference getEvaluationSpecification_Process();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationSpecification#getTestModel <em>Test Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Test Model</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationSpecification#getTestModel()
	 * @see #getEvaluationSpecification()
	 * @generated
	 */
	EReference getEvaluationSpecification_TestModel();

	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModel <em>Evaluation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluation Model</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModel
	 * @generated
	 */
	EClass getEvaluationModel();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModel#getName()
	 * @see #getEvaluationModel()
	 * @generated
	 */
	EAttribute getEvaluationModel_Name();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModel#getEvaluationGoal <em>Evaluation Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Evaluation Goal</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModel#getEvaluationGoal()
	 * @see #getEvaluationModel()
	 * @generated
	 */
	EReference getEvaluationModel_EvaluationGoal();

	/**
	 * Returns the meta object for the reference '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModel#getEvaluationContext <em>Evaluation Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Evaluation Context</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModel#getEvaluationContext()
	 * @see #getEvaluationModel()
	 * @generated
	 */
	EReference getEvaluationModel_EvaluationContext();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModel#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Language</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModel#getLanguage()
	 * @see #getEvaluationModel()
	 * @generated
	 */
	EReference getEvaluationModel_Language();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModel#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Process</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModel#getProcess()
	 * @see #getEvaluationModel()
	 * @generated
	 */
	EReference getEvaluationModel_Process();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModel#getTestModel <em>Test Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Test Model</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModel#getTestModel()
	 * @see #getEvaluationModel()
	 * @generated
	 */
	EReference getEvaluationModel_TestModel();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModel#getDoc <em>Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Doc</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModel#getDoc()
	 * @see #getEvaluationModel()
	 * @generated
	 */
	EReference getEvaluationModel_Doc();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModel#getParticipant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participant</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModel#getParticipant()
	 * @see #getEvaluationModel()
	 * @generated
	 */
	EReference getEvaluationModel_Participant();

	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationGoal <em>Evaluation Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluation Goal</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationGoal
	 * @generated
	 */
	EClass getEvaluationGoal();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationGoal#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationGoal#getName()
	 * @see #getEvaluationGoal()
	 * @generated
	 */
	EAttribute getEvaluationGoal_Name();

	/**
	 * Returns the meta object for the reference '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationGoal#getEvaluationModel <em>Evaluation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Evaluation Model</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationGoal#getEvaluationModel()
	 * @see #getEvaluationGoal()
	 * @generated
	 */
	EReference getEvaluationGoal_EvaluationModel();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationGoal#isComperative <em>Comperative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comperative</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationGoal#isComperative()
	 * @see #getEvaluationGoal()
	 * @generated
	 */
	EAttribute getEvaluationGoal_Comperative();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationGoal#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Language</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationGoal#getLanguage()
	 * @see #getEvaluationGoal()
	 * @generated
	 */
	EReference getEvaluationGoal_Language();

	/**
	 * Returns the meta object for the attribute list '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationGoal#getResearchQuestion <em>Research Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Research Question</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationGoal#getResearchQuestion()
	 * @see #getEvaluationGoal()
	 * @generated
	 */
	EAttribute getEvaluationGoal_ResearchQuestion();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationGoal#getUsabilityGoal <em>Usability Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Usability Goal</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationGoal#getUsabilityGoal()
	 * @see #getEvaluationGoal()
	 * @generated
	 */
	EReference getEvaluationGoal_UsabilityGoal();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationGoal#getMesurment <em>Mesurment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mesurment</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationGoal#getMesurment()
	 * @see #getEvaluationGoal()
	 * @generated
	 */
	EReference getEvaluationGoal_Mesurment();

	/**
	 * Returns the meta object for the reference '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationGoal#getUsabilityRequirement <em>Usability Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Usability Requirement</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationGoal#getUsabilityRequirement()
	 * @see #getEvaluationGoal()
	 * @generated
	 */
	EReference getEvaluationGoal_UsabilityRequirement();

	/**
	 * Returns the meta object for the attribute list '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationGoal#getHypothesis <em>Hypothesis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Hypothesis</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationGoal#getHypothesis()
	 * @see #getEvaluationGoal()
	 * @generated
	 */
	EAttribute getEvaluationGoal_Hypothesis();

	/**
	 * Returns the meta object for the reference '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationGoal#getResponsible <em>Responsible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Responsible</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationGoal#getResponsible()
	 * @see #getEvaluationGoal()
	 * @generated
	 */
	EReference getEvaluationGoal_Responsible();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationGoal#getProblemDescription <em>Problem Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Problem Description</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationGoal#getProblemDescription()
	 * @see #getEvaluationGoal()
	 * @generated
	 */
	EAttribute getEvaluationGoal_ProblemDescription();

	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.Language <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.Language
	 * @generated
	 */
	EClass getLanguage();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.Language#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.Language#getName()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_Name();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.Language#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.Language#getVersion()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_Version();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.Language#getEvaluationModel <em>Evaluation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Evaluation Model</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.Language#getEvaluationModel()
	 * @see #getLanguage()
	 * @generated
	 */
	EReference getLanguage_EvaluationModel();

	/**
	 * Returns the meta object for the reference '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.Language#getDSL <em>DSL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>DSL</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.Language#getDSL()
	 * @see #getLanguage()
	 * @generated
	 */
	EReference getLanguage_DSL();

	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationContext <em>Evaluation Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluation Context</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationContext
	 * @generated
	 */
	EClass getEvaluationContext();

	/**
	 * Returns the meta object for the reference '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationContext#getEvaluationModel <em>Evaluation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Evaluation Model</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationContext#getEvaluationModel()
	 * @see #getEvaluationContext()
	 * @generated
	 */
	EReference getEvaluationContext_EvaluationModel();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationContext#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scenario</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationContext#getScenario()
	 * @see #getEvaluationContext()
	 * @generated
	 */
	EReference getEvaluationContext_Scenario();

	/**
	 * Returns the meta object for the attribute list '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationContext#getEnviromentInstance <em>Enviroment Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Enviroment Instance</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationContext#getEnviromentInstance()
	 * @see #getEvaluationContext()
	 * @generated
	 */
	EAttribute getEvaluationContext_EnviromentInstance();

	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.Process#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.Process#getName()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Name();

	/**
	 * Returns the meta object for the reference '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.Process#getEvaluationModel <em>Evaluation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Evaluation Model</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.Process#getEvaluationModel()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_EvaluationModel();

	/**
	 * Returns the meta object for the reference '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.Process#getProcessModel <em>Process Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Process Model</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.Process#getProcessModel()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_ProcessModel();

	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.TestModel <em>Test Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Model</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.TestModel
	 * @generated
	 */
	EClass getTestModel();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.TestModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.TestModel#getName()
	 * @see #getTestModel()
	 * @generated
	 */
	EAttribute getTestModel_Name();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.TestModel#getEvaluationModel <em>Evaluation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Evaluation Model</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.TestModel#getEvaluationModel()
	 * @see #getTestModel()
	 * @generated
	 */
	EReference getTestModel_EvaluationModel();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.TestModel#getParticipant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participant</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.TestModel#getParticipant()
	 * @see #getTestModel()
	 * @generated
	 */
	EReference getTestModel_Participant();

	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.Participant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Participant</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.Participant
	 * @generated
	 */
	EClass getParticipant();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.Participant#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.Participant#getName()
	 * @see #getParticipant()
	 * @generated
	 */
	EAttribute getParticipant_Name();

	/**
	 * Returns the meta object for the attribute list '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.Participant#getContact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Contact</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.Participant#getContact()
	 * @see #getParticipant()
	 * @generated
	 */
	EAttribute getParticipant_Contact();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.Participant#getEvaluationModel <em>Evaluation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Evaluation Model</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.Participant#getEvaluationModel()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_EvaluationModel();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.Participant#getUserProfile <em>User Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>User Profile</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.Participant#getUserProfile()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_UserProfile();

	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationDocumentation <em>Evaluation Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluation Documentation</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationDocumentation
	 * @generated
	 */
	EClass getEvaluationDocumentation();

	/**
	 * Returns the meta object for the reference '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationDocumentation#getEvaluationModel <em>Evaluation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Evaluation Model</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationDocumentation#getEvaluationModel()
	 * @see #getEvaluationDocumentation()
	 * @generated
	 */
	EReference getEvaluationDocumentation_EvaluationModel();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationDocumentation#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scenario</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationDocumentation#getScenario()
	 * @see #getEvaluationDocumentation()
	 * @generated
	 */
	EReference getEvaluationDocumentation_Scenario();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationDocumentation#getRelatedDocumentation <em>Related Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Documentation</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationDocumentation#getRelatedDocumentation()
	 * @see #getEvaluationDocumentation()
	 * @generated
	 */
	EReference getEvaluationDocumentation_RelatedDocumentation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EvaluationModelingFactory getEvaluationModelingFactory();

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
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationSpecificationImpl <em>Evaluation Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationSpecificationImpl
		 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationModelingPackageImpl#getEvaluationSpecification()
		 * @generated
		 */
		EClass EVALUATION_SPECIFICATION = eINSTANCE.getEvaluationSpecification();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_SPECIFICATION__NAME = eINSTANCE.getEvaluationSpecification_Name();

		/**
		 * The meta object literal for the '<em><b>Evaluation Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION_SPECIFICATION__EVALUATION_MODEL = eINSTANCE.getEvaluationSpecification_EvaluationModel();

		/**
		 * The meta object literal for the '<em><b>Evaluation Goal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION_SPECIFICATION__EVALUATION_GOAL = eINSTANCE.getEvaluationSpecification_EvaluationGoal();

		/**
		 * The meta object literal for the '<em><b>Participant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION_SPECIFICATION__PARTICIPANT = eINSTANCE.getEvaluationSpecification_Participant();

		/**
		 * The meta object literal for the '<em><b>Documentaton</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION_SPECIFICATION__DOCUMENTATON = eINSTANCE.getEvaluationSpecification_Documentaton();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION_SPECIFICATION__LANGUAGE = eINSTANCE.getEvaluationSpecification_Language();

		/**
		 * The meta object literal for the '<em><b>Evaluation Context</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION_SPECIFICATION__EVALUATION_CONTEXT = eINSTANCE.getEvaluationSpecification_EvaluationContext();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION_SPECIFICATION__PROCESS = eINSTANCE.getEvaluationSpecification_Process();

		/**
		 * The meta object literal for the '<em><b>Test Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION_SPECIFICATION__TEST_MODEL = eINSTANCE.getEvaluationSpecification_TestModel();

		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationModelImpl <em>Evaluation Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationModelImpl
		 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationModelingPackageImpl#getEvaluationModel()
		 * @generated
		 */
		EClass EVALUATION_MODEL = eINSTANCE.getEvaluationModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_MODEL__NAME = eINSTANCE.getEvaluationModel_Name();

		/**
		 * The meta object literal for the '<em><b>Evaluation Goal</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION_MODEL__EVALUATION_GOAL = eINSTANCE.getEvaluationModel_EvaluationGoal();

		/**
		 * The meta object literal for the '<em><b>Evaluation Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION_MODEL__EVALUATION_CONTEXT = eINSTANCE.getEvaluationModel_EvaluationContext();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION_MODEL__LANGUAGE = eINSTANCE.getEvaluationModel_Language();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION_MODEL__PROCESS = eINSTANCE.getEvaluationModel_Process();

		/**
		 * The meta object literal for the '<em><b>Test Model</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION_MODEL__TEST_MODEL = eINSTANCE.getEvaluationModel_TestModel();

		/**
		 * The meta object literal for the '<em><b>Doc</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION_MODEL__DOC = eINSTANCE.getEvaluationModel_Doc();

		/**
		 * The meta object literal for the '<em><b>Participant</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION_MODEL__PARTICIPANT = eINSTANCE.getEvaluationModel_Participant();

		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationGoalImpl <em>Evaluation Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationGoalImpl
		 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationModelingPackageImpl#getEvaluationGoal()
		 * @generated
		 */
		EClass EVALUATION_GOAL = eINSTANCE.getEvaluationGoal();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_GOAL__NAME = eINSTANCE.getEvaluationGoal_Name();

		/**
		 * The meta object literal for the '<em><b>Evaluation Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION_GOAL__EVALUATION_MODEL = eINSTANCE.getEvaluationGoal_EvaluationModel();

		/**
		 * The meta object literal for the '<em><b>Comperative</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_GOAL__COMPERATIVE = eINSTANCE.getEvaluationGoal_Comperative();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION_GOAL__LANGUAGE = eINSTANCE.getEvaluationGoal_Language();

		/**
		 * The meta object literal for the '<em><b>Research Question</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_GOAL__RESEARCH_QUESTION = eINSTANCE.getEvaluationGoal_ResearchQuestion();

		/**
		 * The meta object literal for the '<em><b>Usability Goal</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION_GOAL__USABILITY_GOAL = eINSTANCE.getEvaluationGoal_UsabilityGoal();

		/**
		 * The meta object literal for the '<em><b>Mesurment</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION_GOAL__MESURMENT = eINSTANCE.getEvaluationGoal_Mesurment();

		/**
		 * The meta object literal for the '<em><b>Usability Requirement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION_GOAL__USABILITY_REQUIREMENT = eINSTANCE.getEvaluationGoal_UsabilityRequirement();

		/**
		 * The meta object literal for the '<em><b>Hypothesis</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_GOAL__HYPOTHESIS = eINSTANCE.getEvaluationGoal_Hypothesis();

		/**
		 * The meta object literal for the '<em><b>Responsible</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION_GOAL__RESPONSIBLE = eINSTANCE.getEvaluationGoal_Responsible();

		/**
		 * The meta object literal for the '<em><b>Problem Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_GOAL__PROBLEM_DESCRIPTION = eINSTANCE.getEvaluationGoal_ProblemDescription();

		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.LanguageImpl <em>Language</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.LanguageImpl
		 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationModelingPackageImpl#getLanguage()
		 * @generated
		 */
		EClass LANGUAGE = eINSTANCE.getLanguage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE__NAME = eINSTANCE.getLanguage_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE__VERSION = eINSTANCE.getLanguage_Version();

		/**
		 * The meta object literal for the '<em><b>Evaluation Model</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGE__EVALUATION_MODEL = eINSTANCE.getLanguage_EvaluationModel();

		/**
		 * The meta object literal for the '<em><b>DSL</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGE__DSL = eINSTANCE.getLanguage_DSL();

		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationContextImpl <em>Evaluation Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationContextImpl
		 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationModelingPackageImpl#getEvaluationContext()
		 * @generated
		 */
		EClass EVALUATION_CONTEXT = eINSTANCE.getEvaluationContext();

		/**
		 * The meta object literal for the '<em><b>Evaluation Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION_CONTEXT__EVALUATION_MODEL = eINSTANCE.getEvaluationContext_EvaluationModel();

		/**
		 * The meta object literal for the '<em><b>Scenario</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION_CONTEXT__SCENARIO = eINSTANCE.getEvaluationContext_Scenario();

		/**
		 * The meta object literal for the '<em><b>Enviroment Instance</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_CONTEXT__ENVIROMENT_INSTANCE = eINSTANCE.getEvaluationContext_EnviromentInstance();

		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.ProcessImpl
		 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationModelingPackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__NAME = eINSTANCE.getProcess_Name();

		/**
		 * The meta object literal for the '<em><b>Evaluation Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__EVALUATION_MODEL = eINSTANCE.getProcess_EvaluationModel();

		/**
		 * The meta object literal for the '<em><b>Process Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__PROCESS_MODEL = eINSTANCE.getProcess_ProcessModel();

		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.TestModelImpl <em>Test Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.TestModelImpl
		 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationModelingPackageImpl#getTestModel()
		 * @generated
		 */
		EClass TEST_MODEL = eINSTANCE.getTestModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_MODEL__NAME = eINSTANCE.getTestModel_Name();

		/**
		 * The meta object literal for the '<em><b>Evaluation Model</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_MODEL__EVALUATION_MODEL = eINSTANCE.getTestModel_EvaluationModel();

		/**
		 * The meta object literal for the '<em><b>Participant</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_MODEL__PARTICIPANT = eINSTANCE.getTestModel_Participant();

		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.ParticipantImpl <em>Participant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.ParticipantImpl
		 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationModelingPackageImpl#getParticipant()
		 * @generated
		 */
		EClass PARTICIPANT = eINSTANCE.getParticipant();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTICIPANT__NAME = eINSTANCE.getParticipant_Name();

		/**
		 * The meta object literal for the '<em><b>Contact</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTICIPANT__CONTACT = eINSTANCE.getParticipant_Contact();

		/**
		 * The meta object literal for the '<em><b>Evaluation Model</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANT__EVALUATION_MODEL = eINSTANCE.getParticipant_EvaluationModel();

		/**
		 * The meta object literal for the '<em><b>User Profile</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANT__USER_PROFILE = eINSTANCE.getParticipant_UserProfile();

		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationDocumentationImpl <em>Evaluation Documentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationDocumentationImpl
		 * @see pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationModelingPackageImpl#getEvaluationDocumentation()
		 * @generated
		 */
		EClass EVALUATION_DOCUMENTATION = eINSTANCE.getEvaluationDocumentation();

		/**
		 * The meta object literal for the '<em><b>Evaluation Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION_DOCUMENTATION__EVALUATION_MODEL = eINSTANCE.getEvaluationDocumentation_EvaluationModel();

		/**
		 * The meta object literal for the '<em><b>Scenario</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION_DOCUMENTATION__SCENARIO = eINSTANCE.getEvaluationDocumentation_Scenario();

		/**
		 * The meta object literal for the '<em><b>Related Documentation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION_DOCUMENTATION__RELATED_DOCUMENTATION = eINSTANCE.getEvaluationDocumentation_RelatedDocumentation();

	}

} //EvaluationModelingPackage
