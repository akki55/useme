/**
 */
package pt.fct.unl.novalincs.useme.model.GoalModeling;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
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
 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModelingFactory
 * @model kind="package"
 * @generated
 */
public interface GoalModelingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "GoalModeling";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://nova-lincs.di.fct.unl.pt/useme.goalmodeling";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "useme.goalmodeling";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GoalModelingPackage eINSTANCE = pt.fct.unl.novalincs.useme.model.GoalModeling.impl.GoalModelingPackageImpl.init();

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.GoalSpecificationImpl <em>Goal Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.impl.GoalSpecificationImpl
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.impl.GoalModelingPackageImpl#getGoalSpecification()
	 * @generated
	 */
	int GOAL_SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_SPECIFICATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Usability Requirement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_SPECIFICATION__USABILITY_REQUIREMENT = 1;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_SPECIFICATION__METHOD = 2;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_SPECIFICATION__ACTOR = 3;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_SPECIFICATION__SCOPE = 4;

	/**
	 * The feature id for the '<em><b>Success Coverage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_SPECIFICATION__SUCCESS_COVERAGE = 5;

	/**
	 * The feature id for the '<em><b>Goal Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_SPECIFICATION__GOAL_MODEL = 6;

	/**
	 * The number of structural features of the '<em>Goal Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_SPECIFICATION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Goal Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.GoalModelImpl <em>Goal Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.impl.GoalModelImpl
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.impl.GoalModelingPackageImpl#getGoalModel()
	 * @generated
	 */
	int GOAL_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_MODEL__LANGUAGE = 1;

	/**
	 * The feature id for the '<em><b>Usability Goal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_MODEL__USABILITY_GOAL = 2;

	/**
	 * The number of structural features of the '<em>Goal Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Goal Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.UsabilityGoalImpl <em>Usability Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.impl.UsabilityGoalImpl
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.impl.GoalModelingPackageImpl#getUsabilityGoal()
	 * @generated
	 */
	int USABILITY_GOAL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USABILITY_GOAL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Responsible Actor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USABILITY_GOAL__RESPONSIBLE_ACTOR = 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USABILITY_GOAL__PRIORITY = 2;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USABILITY_GOAL__QUESTION = 3;

	/**
	 * The feature id for the '<em><b>Method</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USABILITY_GOAL__METHOD = 4;

	/**
	 * The feature id for the '<em><b>Success Coverage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USABILITY_GOAL__SUCCESS_COVERAGE = 5;

	/**
	 * The feature id for the '<em><b>Provided Functionality</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USABILITY_GOAL__PROVIDED_FUNCTIONALITY = 6;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USABILITY_GOAL__SCOPE = 7;

	/**
	 * The feature id for the '<em><b>Sub Goal</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USABILITY_GOAL__SUB_GOAL = 8;

	/**
	 * The feature id for the '<em><b>Evaluation Goal</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USABILITY_GOAL__EVALUATION_GOAL = 9;

	/**
	 * The feature id for the '<em><b>Goal Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USABILITY_GOAL__GOAL_MODEL = 10;

	/**
	 * The feature id for the '<em><b>Parent Goal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USABILITY_GOAL__PARENT_GOAL = 11;

	/**
	 * The number of structural features of the '<em>Usability Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USABILITY_GOAL_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Usability Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USABILITY_GOAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.impl.ActorImpl
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.impl.GoalModelingPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ORGANIZATION = 1;

	/**
	 * The feature id for the '<em><b>Responsible For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__RESPONSIBLE_FOR = 2;

	/**
	 * The feature id for the '<em><b>Stakeholder</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__STAKEHOLDER = 3;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.ScopeImpl <em>Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.impl.ScopeImpl
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.impl.GoalModelingPackageImpl#getScope()
	 * @generated
	 */
	int SCOPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Context Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__CONTEXT_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Usability Goal</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__USABILITY_GOAL = 2;

	/**
	 * The feature id for the '<em><b>User Profile Selection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__USER_PROFILE_SELECTION = 3;

	/**
	 * The feature id for the '<em><b>Context Environment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__CONTEXT_ENVIRONMENT = 4;

	/**
	 * The feature id for the '<em><b>Workflow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__WORKFLOW = 5;

	/**
	 * The number of structural features of the '<em>Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.impl.MethodImpl
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.impl.GoalModelingPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Method Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__METHOD_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Usability Goal</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__USABILITY_GOAL = 2;

	/**
	 * The feature id for the '<em><b>Test Case</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__TEST_CASE = 3;

	/**
	 * The feature id for the '<em><b>Usability Requirement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__USABILITY_REQUIREMENT = 4;

	/**
	 * The feature id for the '<em><b>Functional Goal</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__FUNCTIONAL_GOAL = 5;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.SuccessCoverageImpl <em>Success Coverage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.impl.SuccessCoverageImpl
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.impl.GoalModelingPackageImpl#getSuccessCoverage()
	 * @generated
	 */
	int SUCCESS_COVERAGE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_COVERAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Usability Goal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_COVERAGE__USABILITY_GOAL = 1;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_COVERAGE__SCOPE = 2;

	/**
	 * The feature id for the '<em><b>Success Factor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_COVERAGE__SUCCESS_FACTOR = 3;

	/**
	 * The number of structural features of the '<em>Success Coverage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_COVERAGE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Success Coverage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_COVERAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.UsabilityRequirementImpl <em>Usability Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.impl.UsabilityRequirementImpl
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.impl.GoalModelingPackageImpl#getUsabilityRequirement()
	 * @generated
	 */
	int USABILITY_REQUIREMENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USABILITY_REQUIREMENT__NAME = UtilityPackage.REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USABILITY_REQUIREMENT__DESCRIPTION = UtilityPackage.REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Old name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USABILITY_REQUIREMENT__OLD_NAME = UtilityPackage.REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description old</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USABILITY_REQUIREMENT__DESCRIPTION_OLD = UtilityPackage.REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USABILITY_REQUIREMENT__METRIC = UtilityPackage.REQUIREMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Questionnaire</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USABILITY_REQUIREMENT__QUESTIONNAIRE = UtilityPackage.REQUIREMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USABILITY_REQUIREMENT__EVENT = UtilityPackage.REQUIREMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Usability Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USABILITY_REQUIREMENT_FEATURE_COUNT = UtilityPackage.REQUIREMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Usability Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USABILITY_REQUIREMENT_OPERATION_COUNT = UtilityPackage.REQUIREMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.GoalSpecification <em>Goal Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal Specification</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.GoalSpecification
	 * @generated
	 */
	EClass getGoalSpecification();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.GoalSpecification#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.GoalSpecification#getName()
	 * @see #getGoalSpecification()
	 * @generated
	 */
	EAttribute getGoalSpecification_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.GoalSpecification#getUsabilityRequirement <em>Usability Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Usability Requirement</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.GoalSpecification#getUsabilityRequirement()
	 * @see #getGoalSpecification()
	 * @generated
	 */
	EReference getGoalSpecification_UsabilityRequirement();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.GoalSpecification#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Method</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.GoalSpecification#getMethod()
	 * @see #getGoalSpecification()
	 * @generated
	 */
	EReference getGoalSpecification_Method();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.GoalSpecification#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actor</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.GoalSpecification#getActor()
	 * @see #getGoalSpecification()
	 * @generated
	 */
	EReference getGoalSpecification_Actor();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.GoalSpecification#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scope</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.GoalSpecification#getScope()
	 * @see #getGoalSpecification()
	 * @generated
	 */
	EReference getGoalSpecification_Scope();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.GoalSpecification#getSuccessCoverage <em>Success Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Success Coverage</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.GoalSpecification#getSuccessCoverage()
	 * @see #getGoalSpecification()
	 * @generated
	 */
	EReference getGoalSpecification_SuccessCoverage();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.GoalSpecification#getGoalModel <em>Goal Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Goal Model</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.GoalSpecification#getGoalModel()
	 * @see #getGoalSpecification()
	 * @generated
	 */
	EReference getGoalSpecification_GoalModel();

	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModel <em>Goal Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal Model</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModel
	 * @generated
	 */
	EClass getGoalModel();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModel#getName()
	 * @see #getGoalModel()
	 * @generated
	 */
	EAttribute getGoalModel_Name();

	/**
	 * Returns the meta object for the reference '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModel#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Language</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModel#getLanguage()
	 * @see #getGoalModel()
	 * @generated
	 */
	EReference getGoalModel_Language();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModel#getUsabilityGoal <em>Usability Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Usability Goal</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModel#getUsabilityGoal()
	 * @see #getGoalModel()
	 * @generated
	 */
	EReference getGoalModel_UsabilityGoal();

	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal <em>Usability Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usability Goal</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal
	 * @generated
	 */
	EClass getUsabilityGoal();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal#getName()
	 * @see #getUsabilityGoal()
	 * @generated
	 */
	EAttribute getUsabilityGoal_Name();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal#getResponsibleActor <em>Responsible Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Responsible Actor</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal#getResponsibleActor()
	 * @see #getUsabilityGoal()
	 * @generated
	 */
	EReference getUsabilityGoal_ResponsibleActor();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal#getPriority()
	 * @see #getUsabilityGoal()
	 * @generated
	 */
	EAttribute getUsabilityGoal_Priority();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Question</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal#getQuestion()
	 * @see #getUsabilityGoal()
	 * @generated
	 */
	EAttribute getUsabilityGoal_Question();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Method</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal#getMethod()
	 * @see #getUsabilityGoal()
	 * @generated
	 */
	EReference getUsabilityGoal_Method();

	/**
	 * Returns the meta object for the reference '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal#getSuccessCoverage <em>Success Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Success Coverage</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal#getSuccessCoverage()
	 * @see #getUsabilityGoal()
	 * @generated
	 */
	EReference getUsabilityGoal_SuccessCoverage();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal#getProvidedFunctionality <em>Provided Functionality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provided Functionality</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal#getProvidedFunctionality()
	 * @see #getUsabilityGoal()
	 * @generated
	 */
	EReference getUsabilityGoal_ProvidedFunctionality();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scope</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal#getScope()
	 * @see #getUsabilityGoal()
	 * @generated
	 */
	EReference getUsabilityGoal_Scope();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal#getSubGoal <em>Sub Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Goal</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal#getSubGoal()
	 * @see #getUsabilityGoal()
	 * @generated
	 */
	EReference getUsabilityGoal_SubGoal();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal#getEvaluationGoal <em>Evaluation Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Evaluation Goal</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal#getEvaluationGoal()
	 * @see #getUsabilityGoal()
	 * @generated
	 */
	EReference getUsabilityGoal_EvaluationGoal();

	/**
	 * Returns the meta object for the container reference '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal#getGoalModel <em>Goal Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Goal Model</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal#getGoalModel()
	 * @see #getUsabilityGoal()
	 * @generated
	 */
	EReference getUsabilityGoal_GoalModel();

	/**
	 * Returns the meta object for the reference '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal#getParentGoal <em>Parent Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Goal</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal#getParentGoal()
	 * @see #getUsabilityGoal()
	 * @generated
	 */
	EReference getUsabilityGoal_ParentGoal();

	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.Actor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.Actor#getName()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Name();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.Actor#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.Actor#getOrganization()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Organization();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.Actor#getResponsibleFor <em>Responsible For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Responsible For</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.Actor#getResponsibleFor()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_ResponsibleFor();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.Actor#getStakeholder <em>Stakeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stakeholder</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.Actor#getStakeholder()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Stakeholder();

	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.Scope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scope</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.Scope
	 * @generated
	 */
	EClass getScope();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.Scope#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.Scope#getName()
	 * @see #getScope()
	 * @generated
	 */
	EAttribute getScope_Name();

	/**
	 * Returns the meta object for the reference '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.Scope#getContextModel <em>Context Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context Model</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.Scope#getContextModel()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_ContextModel();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.Scope#getUsabilityGoal <em>Usability Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Usability Goal</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.Scope#getUsabilityGoal()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_UsabilityGoal();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.Scope#getUserProfileSelection <em>User Profile Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>User Profile Selection</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.Scope#getUserProfileSelection()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_UserProfileSelection();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.Scope#getContextEnvironment <em>Context Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Context Environment</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.Scope#getContextEnvironment()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_ContextEnvironment();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.Scope#getWorkflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Workflow</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.Scope#getWorkflow()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_Workflow();

	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.Method#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.Method#getName()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Name();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.Method#getMethodDescription <em>Method Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Description</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.Method#getMethodDescription()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_MethodDescription();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.Method#getUsabilityGoal <em>Usability Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Usability Goal</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.Method#getUsabilityGoal()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_UsabilityGoal();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.Method#getTestCase <em>Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Test Case</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.Method#getTestCase()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_TestCase();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.Method#getUsabilityRequirement <em>Usability Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Usability Requirement</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.Method#getUsabilityRequirement()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_UsabilityRequirement();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.Method#getFunctionalGoal <em>Functional Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Functional Goal</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.Method#getFunctionalGoal()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_FunctionalGoal();

	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.SuccessCoverage <em>Success Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Success Coverage</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.SuccessCoverage
	 * @generated
	 */
	EClass getSuccessCoverage();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.SuccessCoverage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.SuccessCoverage#getName()
	 * @see #getSuccessCoverage()
	 * @generated
	 */
	EAttribute getSuccessCoverage_Name();

	/**
	 * Returns the meta object for the reference '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.SuccessCoverage#getUsabilityGoal <em>Usability Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Usability Goal</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.SuccessCoverage#getUsabilityGoal()
	 * @see #getSuccessCoverage()
	 * @generated
	 */
	EReference getSuccessCoverage_UsabilityGoal();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.SuccessCoverage#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scope</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.SuccessCoverage#getScope()
	 * @see #getSuccessCoverage()
	 * @generated
	 */
	EReference getSuccessCoverage_Scope();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.SuccessCoverage#getSuccessFactor <em>Success Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Success Factor</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.SuccessCoverage#getSuccessFactor()
	 * @see #getSuccessCoverage()
	 * @generated
	 */
	EReference getSuccessCoverage_SuccessFactor();

	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityRequirement <em>Usability Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usability Requirement</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityRequirement
	 * @generated
	 */
	EClass getUsabilityRequirement();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityRequirement#getOld_name <em>Old name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old name</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityRequirement#getOld_name()
	 * @see #getUsabilityRequirement()
	 * @generated
	 */
	EAttribute getUsabilityRequirement_Old_name();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityRequirement#getDescription_old <em>Description old</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description old</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityRequirement#getDescription_old()
	 * @see #getUsabilityRequirement()
	 * @generated
	 */
	EAttribute getUsabilityRequirement_Description_old();

	/**
	 * Returns the meta object for the attribute list '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityRequirement#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Metric</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityRequirement#getMetric()
	 * @see #getUsabilityRequirement()
	 * @generated
	 */
	EAttribute getUsabilityRequirement_Metric();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityRequirement#getQuestionnaire <em>Questionnaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Questionnaire</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityRequirement#getQuestionnaire()
	 * @see #getUsabilityRequirement()
	 * @generated
	 */
	EReference getUsabilityRequirement_Questionnaire();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityRequirement#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Event</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityRequirement#getEvent()
	 * @see #getUsabilityRequirement()
	 * @generated
	 */
	EReference getUsabilityRequirement_Event();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GoalModelingFactory getGoalModelingFactory();

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
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.GoalSpecificationImpl <em>Goal Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.impl.GoalSpecificationImpl
		 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.impl.GoalModelingPackageImpl#getGoalSpecification()
		 * @generated
		 */
		EClass GOAL_SPECIFICATION = eINSTANCE.getGoalSpecification();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL_SPECIFICATION__NAME = eINSTANCE.getGoalSpecification_Name();

		/**
		 * The meta object literal for the '<em><b>Usability Requirement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_SPECIFICATION__USABILITY_REQUIREMENT = eINSTANCE.getGoalSpecification_UsabilityRequirement();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_SPECIFICATION__METHOD = eINSTANCE.getGoalSpecification_Method();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_SPECIFICATION__ACTOR = eINSTANCE.getGoalSpecification_Actor();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_SPECIFICATION__SCOPE = eINSTANCE.getGoalSpecification_Scope();

		/**
		 * The meta object literal for the '<em><b>Success Coverage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_SPECIFICATION__SUCCESS_COVERAGE = eINSTANCE.getGoalSpecification_SuccessCoverage();

		/**
		 * The meta object literal for the '<em><b>Goal Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_SPECIFICATION__GOAL_MODEL = eINSTANCE.getGoalSpecification_GoalModel();

		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.GoalModelImpl <em>Goal Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.impl.GoalModelImpl
		 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.impl.GoalModelingPackageImpl#getGoalModel()
		 * @generated
		 */
		EClass GOAL_MODEL = eINSTANCE.getGoalModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL_MODEL__NAME = eINSTANCE.getGoalModel_Name();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_MODEL__LANGUAGE = eINSTANCE.getGoalModel_Language();

		/**
		 * The meta object literal for the '<em><b>Usability Goal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_MODEL__USABILITY_GOAL = eINSTANCE.getGoalModel_UsabilityGoal();

		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.UsabilityGoalImpl <em>Usability Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.impl.UsabilityGoalImpl
		 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.impl.GoalModelingPackageImpl#getUsabilityGoal()
		 * @generated
		 */
		EClass USABILITY_GOAL = eINSTANCE.getUsabilityGoal();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USABILITY_GOAL__NAME = eINSTANCE.getUsabilityGoal_Name();

		/**
		 * The meta object literal for the '<em><b>Responsible Actor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USABILITY_GOAL__RESPONSIBLE_ACTOR = eINSTANCE.getUsabilityGoal_ResponsibleActor();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USABILITY_GOAL__PRIORITY = eINSTANCE.getUsabilityGoal_Priority();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USABILITY_GOAL__QUESTION = eINSTANCE.getUsabilityGoal_Question();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USABILITY_GOAL__METHOD = eINSTANCE.getUsabilityGoal_Method();

		/**
		 * The meta object literal for the '<em><b>Success Coverage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USABILITY_GOAL__SUCCESS_COVERAGE = eINSTANCE.getUsabilityGoal_SuccessCoverage();

		/**
		 * The meta object literal for the '<em><b>Provided Functionality</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USABILITY_GOAL__PROVIDED_FUNCTIONALITY = eINSTANCE.getUsabilityGoal_ProvidedFunctionality();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USABILITY_GOAL__SCOPE = eINSTANCE.getUsabilityGoal_Scope();

		/**
		 * The meta object literal for the '<em><b>Sub Goal</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USABILITY_GOAL__SUB_GOAL = eINSTANCE.getUsabilityGoal_SubGoal();

		/**
		 * The meta object literal for the '<em><b>Evaluation Goal</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USABILITY_GOAL__EVALUATION_GOAL = eINSTANCE.getUsabilityGoal_EvaluationGoal();

		/**
		 * The meta object literal for the '<em><b>Goal Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USABILITY_GOAL__GOAL_MODEL = eINSTANCE.getUsabilityGoal_GoalModel();

		/**
		 * The meta object literal for the '<em><b>Parent Goal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USABILITY_GOAL__PARENT_GOAL = eINSTANCE.getUsabilityGoal_ParentGoal();

		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.impl.ActorImpl
		 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.impl.GoalModelingPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__NAME = eINSTANCE.getActor_Name();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__ORGANIZATION = eINSTANCE.getActor_Organization();

		/**
		 * The meta object literal for the '<em><b>Responsible For</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__RESPONSIBLE_FOR = eINSTANCE.getActor_ResponsibleFor();

		/**
		 * The meta object literal for the '<em><b>Stakeholder</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__STAKEHOLDER = eINSTANCE.getActor_Stakeholder();

		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.ScopeImpl <em>Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.impl.ScopeImpl
		 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.impl.GoalModelingPackageImpl#getScope()
		 * @generated
		 */
		EClass SCOPE = eINSTANCE.getScope();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCOPE__NAME = eINSTANCE.getScope_Name();

		/**
		 * The meta object literal for the '<em><b>Context Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__CONTEXT_MODEL = eINSTANCE.getScope_ContextModel();

		/**
		 * The meta object literal for the '<em><b>Usability Goal</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__USABILITY_GOAL = eINSTANCE.getScope_UsabilityGoal();

		/**
		 * The meta object literal for the '<em><b>User Profile Selection</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__USER_PROFILE_SELECTION = eINSTANCE.getScope_UserProfileSelection();

		/**
		 * The meta object literal for the '<em><b>Context Environment</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__CONTEXT_ENVIRONMENT = eINSTANCE.getScope_ContextEnvironment();

		/**
		 * The meta object literal for the '<em><b>Workflow</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__WORKFLOW = eINSTANCE.getScope_Workflow();

		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.impl.MethodImpl
		 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.impl.GoalModelingPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__NAME = eINSTANCE.getMethod_Name();

		/**
		 * The meta object literal for the '<em><b>Method Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__METHOD_DESCRIPTION = eINSTANCE.getMethod_MethodDescription();

		/**
		 * The meta object literal for the '<em><b>Usability Goal</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__USABILITY_GOAL = eINSTANCE.getMethod_UsabilityGoal();

		/**
		 * The meta object literal for the '<em><b>Test Case</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__TEST_CASE = eINSTANCE.getMethod_TestCase();

		/**
		 * The meta object literal for the '<em><b>Usability Requirement</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__USABILITY_REQUIREMENT = eINSTANCE.getMethod_UsabilityRequirement();

		/**
		 * The meta object literal for the '<em><b>Functional Goal</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__FUNCTIONAL_GOAL = eINSTANCE.getMethod_FunctionalGoal();

		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.SuccessCoverageImpl <em>Success Coverage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.impl.SuccessCoverageImpl
		 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.impl.GoalModelingPackageImpl#getSuccessCoverage()
		 * @generated
		 */
		EClass SUCCESS_COVERAGE = eINSTANCE.getSuccessCoverage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUCCESS_COVERAGE__NAME = eINSTANCE.getSuccessCoverage_Name();

		/**
		 * The meta object literal for the '<em><b>Usability Goal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUCCESS_COVERAGE__USABILITY_GOAL = eINSTANCE.getSuccessCoverage_UsabilityGoal();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUCCESS_COVERAGE__SCOPE = eINSTANCE.getSuccessCoverage_Scope();

		/**
		 * The meta object literal for the '<em><b>Success Factor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUCCESS_COVERAGE__SUCCESS_FACTOR = eINSTANCE.getSuccessCoverage_SuccessFactor();

		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.impl.UsabilityRequirementImpl <em>Usability Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.impl.UsabilityRequirementImpl
		 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.impl.GoalModelingPackageImpl#getUsabilityRequirement()
		 * @generated
		 */
		EClass USABILITY_REQUIREMENT = eINSTANCE.getUsabilityRequirement();

		/**
		 * The meta object literal for the '<em><b>Old name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USABILITY_REQUIREMENT__OLD_NAME = eINSTANCE.getUsabilityRequirement_Old_name();

		/**
		 * The meta object literal for the '<em><b>Description old</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USABILITY_REQUIREMENT__DESCRIPTION_OLD = eINSTANCE.getUsabilityRequirement_Description_old();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USABILITY_REQUIREMENT__METRIC = eINSTANCE.getUsabilityRequirement_Metric();

		/**
		 * The meta object literal for the '<em><b>Questionnaire</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USABILITY_REQUIREMENT__QUESTIONNAIRE = eINSTANCE.getUsabilityRequirement_Questionnaire();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USABILITY_REQUIREMENT__EVENT = eINSTANCE.getUsabilityRequirement_Event();

	}

} //GoalModelingPackage
