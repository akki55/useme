/**
 */
package pt.fct.unl.novalincs.useme.model.Utility;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilityFactory
 * @model kind="package"
 * @generated
 */
public interface UtilityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Utility";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://nova-lincs.di.fct.unl.pt/useme.utility";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "useme.utility";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UtilityPackage eINSTANCE = pt.fct.unl.novalincs.useme.model.Utility.impl.UtilityPackageImpl.init();

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.Utility.impl.UtilitySpecificationImpl <em>Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.Utility.impl.UtilitySpecificationImpl
	 * @see pt.fct.unl.novalincs.useme.model.Utility.impl.UtilityPackageImpl#getUtilitySpecification()
	 * @generated
	 */
	int UTILITY_SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITY_SPECIFICATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>DSL</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITY_SPECIFICATION__DSL = 1;

	/**
	 * The feature id for the '<em><b>Functional Goal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITY_SPECIFICATION__FUNCTIONAL_GOAL = 2;

	/**
	 * The feature id for the '<em><b>Process Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITY_SPECIFICATION__PROCESS_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Survey Engine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITY_SPECIFICATION__SURVEY_ENGINE = 4;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITY_SPECIFICATION__DOCUMENTATION = 5;

	/**
	 * The feature id for the '<em><b>Outside Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITY_SPECIFICATION__OUTSIDE_REF = 6;

	/**
	 * The number of structural features of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITY_SPECIFICATION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITY_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.Utility.impl.SurveyEngineImpl <em>Survey Engine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.Utility.impl.SurveyEngineImpl
	 * @see pt.fct.unl.novalincs.useme.model.Utility.impl.UtilityPackageImpl#getSurveyEngine()
	 * @generated
	 */
	int SURVEY_ENGINE = 1;

	/**
	 * The feature id for the '<em><b>Survey Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_ENGINE__SURVEY_MODEL = 0;

	/**
	 * The number of structural features of the '<em>Survey Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_ENGINE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Survey Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_ENGINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.Utility.impl.DSLImpl <em>DSL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.Utility.impl.DSLImpl
	 * @see pt.fct.unl.novalincs.useme.model.Utility.impl.UtilityPackageImpl#getDSL()
	 * @generated
	 */
	int DSL = 2;

	/**
	 * The feature id for the '<em><b>Concrete Syntax</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL__CONCRETE_SYNTAX = 0;

	/**
	 * The feature id for the '<em><b>Abstract Syntax</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL__ABSTRACT_SYNTAX = 1;

	/**
	 * The feature id for the '<em><b>Dsl Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL__DSL_NAME = 2;

	/**
	 * The feature id for the '<em><b>Context Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL__CONTEXT_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Goal Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL__GOAL_MODEL = 4;

	/**
	 * The feature id for the '<em><b>Evaluation Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL__EVALUATION_MODEL = 5;

	/**
	 * The feature id for the '<em><b>Existing Goal Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL__EXISTING_GOAL_MODEL = 6;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL__DOCUMENTATION = 7;

	/**
	 * The number of structural features of the '<em>DSL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>DSL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.Utility.impl.ProcessModelImpl <em>Process Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.Utility.impl.ProcessModelImpl
	 * @see pt.fct.unl.novalincs.useme.model.Utility.impl.UtilityPackageImpl#getProcessModel()
	 * @generated
	 */
	int PROCESS_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Workflow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODEL__WORKFLOW = 1;

	/**
	 * The feature id for the '<em><b>Evaluation Process</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODEL__EVALUATION_PROCESS = 2;

	/**
	 * The feature id for the '<em><b>Outside Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODEL__OUTSIDE_REF = 3;

	/**
	 * The number of structural features of the '<em>Process Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODEL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Process Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.Utility.impl.FunctionalGoalImpl <em>Functional Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.Utility.impl.FunctionalGoalImpl
	 * @see pt.fct.unl.novalincs.useme.model.Utility.impl.UtilityPackageImpl#getFunctionalGoal()
	 * @generated
	 */
	int FUNCTIONAL_GOAL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_GOAL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_GOAL__REQUIREMENTS = 1;

	/**
	 * The feature id for the '<em><b>Existing GM</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_GOAL__EXISTING_GM = 2;

	/**
	 * The number of structural features of the '<em>Functional Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_GOAL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Functional Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_GOAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.Utility.impl.ExistingGMImpl <em>Existing GM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.Utility.impl.ExistingGMImpl
	 * @see pt.fct.unl.novalincs.useme.model.Utility.impl.UtilityPackageImpl#getExistingGM()
	 * @generated
	 */
	int EXISTING_GM = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTING_GM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Functional Goal</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTING_GM__FUNCTIONAL_GOAL = 1;

	/**
	 * The number of structural features of the '<em>Existing GM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTING_GM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Existing GM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTING_GM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.Utility.impl.CEVariableImpl <em>CE Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.Utility.impl.CEVariableImpl
	 * @see pt.fct.unl.novalincs.useme.model.Utility.impl.UtilityPackageImpl#getCEVariable()
	 * @generated
	 */
	int CE_VARIABLE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CE_VARIABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CE_VARIABLE__MANDATORY = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CE_VARIABLE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Composed Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CE_VARIABLE__COMPOSED_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Context Enviroment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CE_VARIABLE__CONTEXT_ENVIROMENT = 4;

	/**
	 * The number of structural features of the '<em>CE Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CE_VARIABLE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>CE Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CE_VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.Utility.impl.ProfileTemplateImpl <em>Profile Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.Utility.impl.ProfileTemplateImpl
	 * @see pt.fct.unl.novalincs.useme.model.Utility.impl.UtilityPackageImpl#getProfileTemplate()
	 * @generated
	 */
	int PROFILE_TEMPLATE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_TEMPLATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_TEMPLATE__CATEGORY = 1;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_TEMPLATE__CLASSIFIERS = 2;

	/**
	 * The number of structural features of the '<em>Profile Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_TEMPLATE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Profile Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_TEMPLATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.Utility.impl.LogicalExpressionImpl <em>Logical Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.Utility.impl.LogicalExpressionImpl
	 * @see pt.fct.unl.novalincs.useme.model.Utility.impl.UtilityPackageImpl#getLogicalExpression()
	 * @generated
	 */
	int LOGICAL_EXPRESSION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EXPRESSION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Classifier Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EXPRESSION__CLASSIFIER_NAME = 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EXPRESSION__EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>Profile Template</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EXPRESSION__PROFILE_TEMPLATE = 3;

	/**
	 * The feature id for the '<em><b>Question</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EXPRESSION__QUESTION = 4;

	/**
	 * The number of structural features of the '<em>Logical Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EXPRESSION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Logical Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.Utility.impl.ConcreteSyntaxImpl <em>Concrete Syntax</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.Utility.impl.ConcreteSyntaxImpl
	 * @see pt.fct.unl.novalincs.useme.model.Utility.impl.UtilityPackageImpl#getConcreteSyntax()
	 * @generated
	 */
	int CONCRETE_SYNTAX = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_SYNTAX__NAME = 0;

	/**
	 * The feature id for the '<em><b>Dsl</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_SYNTAX__DSL = 1;

	/**
	 * The feature id for the '<em><b>Interaction Syntax</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_SYNTAX__INTERACTION_SYNTAX = 2;

	/**
	 * The number of structural features of the '<em>Concrete Syntax</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_SYNTAX_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Concrete Syntax</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_SYNTAX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.Utility.impl.AbstractSyntaxImpl <em>Abstract Syntax</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.Utility.impl.AbstractSyntaxImpl
	 * @see pt.fct.unl.novalincs.useme.model.Utility.impl.UtilityPackageImpl#getAbstractSyntax()
	 * @generated
	 */
	int ABSTRACT_SYNTAX = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SYNTAX__NAME = 0;

	/**
	 * The feature id for the '<em><b>Dsl</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SYNTAX__DSL = 1;

	/**
	 * The feature id for the '<em><b>Interaction Syntax</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SYNTAX__INTERACTION_SYNTAX = 2;

	/**
	 * The number of structural features of the '<em>Abstract Syntax</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SYNTAX_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Abstract Syntax</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SYNTAX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.Utility.impl.OutsideRefImpl <em>Outside Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.Utility.impl.OutsideRefImpl
	 * @see pt.fct.unl.novalincs.useme.model.Utility.impl.UtilityPackageImpl#getOutsideRef()
	 * @generated
	 */
	int OUTSIDE_REF = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTSIDE_REF__NAME = 0;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTSIDE_REF__LINK = 1;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTSIDE_REF__TOOL = 2;

	/**
	 * The feature id for the '<em><b>Outside Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTSIDE_REF__OUTSIDE_REF = 3;

	/**
	 * The number of structural features of the '<em>Outside Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTSIDE_REF_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Outside Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTSIDE_REF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.Utility.PriorityValue <em>Priority Value</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.Utility.PriorityValue
	 * @see pt.fct.unl.novalincs.useme.model.Utility.impl.UtilityPackageImpl#getPriorityValue()
	 * @generated
	 */
	int PRIORITY_VALUE = 12;

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.Utility.RecordInput <em>Record Input</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.Utility.RecordInput
	 * @see pt.fct.unl.novalincs.useme.model.Utility.impl.UtilityPackageImpl#getRecordInput()
	 * @generated
	 */
	int RECORD_INPUT = 13;


	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.Utility.UtilitySpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilitySpecification
	 * @generated
	 */
	EClass getUtilitySpecification();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.Utility.UtilitySpecification#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilitySpecification#getName()
	 * @see #getUtilitySpecification()
	 * @generated
	 */
	EAttribute getUtilitySpecification_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.Utility.UtilitySpecification#getDSL <em>DSL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DSL</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilitySpecification#getDSL()
	 * @see #getUtilitySpecification()
	 * @generated
	 */
	EReference getUtilitySpecification_DSL();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.Utility.UtilitySpecification#getFunctionalGoal <em>Functional Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functional Goal</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilitySpecification#getFunctionalGoal()
	 * @see #getUtilitySpecification()
	 * @generated
	 */
	EReference getUtilitySpecification_FunctionalGoal();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.Utility.UtilitySpecification#getProcessModel <em>Process Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Process Model</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilitySpecification#getProcessModel()
	 * @see #getUtilitySpecification()
	 * @generated
	 */
	EReference getUtilitySpecification_ProcessModel();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.Utility.UtilitySpecification#getSurveyEngine <em>Survey Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Survey Engine</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilitySpecification#getSurveyEngine()
	 * @see #getUtilitySpecification()
	 * @generated
	 */
	EReference getUtilitySpecification_SurveyEngine();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.Utility.UtilitySpecification#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilitySpecification#getDocumentation()
	 * @see #getUtilitySpecification()
	 * @generated
	 */
	EReference getUtilitySpecification_Documentation();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.Utility.UtilitySpecification#getOutsideRef <em>Outside Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outside Ref</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilitySpecification#getOutsideRef()
	 * @see #getUtilitySpecification()
	 * @generated
	 */
	EReference getUtilitySpecification_OutsideRef();

	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.Utility.SurveyEngine <em>Survey Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Survey Engine</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.SurveyEngine
	 * @generated
	 */
	EClass getSurveyEngine();

	/**
	 * Returns the meta object for the reference '{@link pt.fct.unl.novalincs.useme.model.Utility.SurveyEngine#getSurveyModel <em>Survey Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Survey Model</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.SurveyEngine#getSurveyModel()
	 * @see #getSurveyEngine()
	 * @generated
	 */
	EReference getSurveyEngine_SurveyModel();

	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.Utility.DSL <em>DSL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DSL</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.DSL
	 * @generated
	 */
	EClass getDSL();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.Utility.DSL#getConcreteSyntax <em>Concrete Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Concrete Syntax</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.DSL#getConcreteSyntax()
	 * @see #getDSL()
	 * @generated
	 */
	EReference getDSL_ConcreteSyntax();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.Utility.DSL#getAbstractSyntax <em>Abstract Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Syntax</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.DSL#getAbstractSyntax()
	 * @see #getDSL()
	 * @generated
	 */
	EReference getDSL_AbstractSyntax();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.Utility.DSL#getDslName <em>Dsl Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dsl Name</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.DSL#getDslName()
	 * @see #getDSL()
	 * @generated
	 */
	EAttribute getDSL_DslName();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.Utility.DSL#getContextModel <em>Context Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Context Model</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.DSL#getContextModel()
	 * @see #getDSL()
	 * @generated
	 */
	EReference getDSL_ContextModel();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.Utility.DSL#getGoalModel <em>Goal Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Goal Model</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.DSL#getGoalModel()
	 * @see #getDSL()
	 * @generated
	 */
	EReference getDSL_GoalModel();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.Utility.DSL#getEvaluationModel <em>Evaluation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Evaluation Model</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.DSL#getEvaluationModel()
	 * @see #getDSL()
	 * @generated
	 */
	EReference getDSL_EvaluationModel();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.Utility.DSL#getExistingGoalModel <em>Existing Goal Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Existing Goal Model</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.DSL#getExistingGoalModel()
	 * @see #getDSL()
	 * @generated
	 */
	EReference getDSL_ExistingGoalModel();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.Utility.DSL#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Documentation</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.DSL#getDocumentation()
	 * @see #getDSL()
	 * @generated
	 */
	EReference getDSL_Documentation();

	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.Utility.ProcessModel <em>Process Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Model</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.ProcessModel
	 * @generated
	 */
	EClass getProcessModel();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.Utility.ProcessModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.ProcessModel#getName()
	 * @see #getProcessModel()
	 * @generated
	 */
	EAttribute getProcessModel_Name();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.Utility.ProcessModel#getWorkflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Workflow</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.ProcessModel#getWorkflow()
	 * @see #getProcessModel()
	 * @generated
	 */
	EReference getProcessModel_Workflow();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.Utility.ProcessModel#getEvaluationProcess <em>Evaluation Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Evaluation Process</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.ProcessModel#getEvaluationProcess()
	 * @see #getProcessModel()
	 * @generated
	 */
	EReference getProcessModel_EvaluationProcess();

	/**
	 * Returns the meta object for the reference '{@link pt.fct.unl.novalincs.useme.model.Utility.ProcessModel#getOutsideRef <em>Outside Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outside Ref</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.ProcessModel#getOutsideRef()
	 * @see #getProcessModel()
	 * @generated
	 */
	EReference getProcessModel_OutsideRef();

	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.Utility.FunctionalGoal <em>Functional Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Goal</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.FunctionalGoal
	 * @generated
	 */
	EClass getFunctionalGoal();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.Utility.FunctionalGoal#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.FunctionalGoal#getName()
	 * @see #getFunctionalGoal()
	 * @generated
	 */
	EAttribute getFunctionalGoal_Name();

	/**
	 * Returns the meta object for the attribute list '{@link pt.fct.unl.novalincs.useme.model.Utility.FunctionalGoal#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Requirements</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.FunctionalGoal#getRequirements()
	 * @see #getFunctionalGoal()
	 * @generated
	 */
	EAttribute getFunctionalGoal_Requirements();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.Utility.FunctionalGoal#getExistingGM <em>Existing GM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Existing GM</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.FunctionalGoal#getExistingGM()
	 * @see #getFunctionalGoal()
	 * @generated
	 */
	EReference getFunctionalGoal_ExistingGM();

	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.Utility.ExistingGM <em>Existing GM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Existing GM</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.ExistingGM
	 * @generated
	 */
	EClass getExistingGM();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.Utility.ExistingGM#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.ExistingGM#getName()
	 * @see #getExistingGM()
	 * @generated
	 */
	EAttribute getExistingGM_Name();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.Utility.ExistingGM#getFunctionalGoal <em>Functional Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Functional Goal</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.ExistingGM#getFunctionalGoal()
	 * @see #getExistingGM()
	 * @generated
	 */
	EReference getExistingGM_FunctionalGoal();

	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.Utility.CEVariable <em>CE Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CE Variable</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.CEVariable
	 * @generated
	 */
	EClass getCEVariable();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.Utility.CEVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.CEVariable#getName()
	 * @see #getCEVariable()
	 * @generated
	 */
	EAttribute getCEVariable_Name();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.Utility.CEVariable#isMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mandatory</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.CEVariable#isMandatory()
	 * @see #getCEVariable()
	 * @generated
	 */
	EAttribute getCEVariable_Mandatory();

	/**
	 * Returns the meta object for the attribute list '{@link pt.fct.unl.novalincs.useme.model.Utility.CEVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Type</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.CEVariable#getType()
	 * @see #getCEVariable()
	 * @generated
	 */
	EAttribute getCEVariable_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.Utility.CEVariable#getComposedElement <em>Composed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composed Element</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.CEVariable#getComposedElement()
	 * @see #getCEVariable()
	 * @generated
	 */
	EReference getCEVariable_ComposedElement();

	/**
	 * Returns the meta object for the reference '{@link pt.fct.unl.novalincs.useme.model.Utility.CEVariable#getContextEnviroment <em>Context Enviroment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context Enviroment</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.CEVariable#getContextEnviroment()
	 * @see #getCEVariable()
	 * @generated
	 */
	EReference getCEVariable_ContextEnviroment();

	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.Utility.ProfileTemplate <em>Profile Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profile Template</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.ProfileTemplate
	 * @generated
	 */
	EClass getProfileTemplate();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.Utility.ProfileTemplate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.ProfileTemplate#getName()
	 * @see #getProfileTemplate()
	 * @generated
	 */
	EAttribute getProfileTemplate_Name();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.Utility.ProfileTemplate#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.ProfileTemplate#getCategory()
	 * @see #getProfileTemplate()
	 * @generated
	 */
	EAttribute getProfileTemplate_Category();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.Utility.ProfileTemplate#getClassifiers <em>Classifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Classifiers</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.ProfileTemplate#getClassifiers()
	 * @see #getProfileTemplate()
	 * @generated
	 */
	EReference getProfileTemplate_Classifiers();

	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.Utility.LogicalExpression <em>Logical Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Expression</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.LogicalExpression
	 * @generated
	 */
	EClass getLogicalExpression();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.Utility.LogicalExpression#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.LogicalExpression#getName()
	 * @see #getLogicalExpression()
	 * @generated
	 */
	EAttribute getLogicalExpression_Name();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.Utility.LogicalExpression#getClassifierName <em>Classifier Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classifier Name</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.LogicalExpression#getClassifierName()
	 * @see #getLogicalExpression()
	 * @generated
	 */
	EAttribute getLogicalExpression_ClassifierName();

	/**
	 * Returns the meta object for the attribute list '{@link pt.fct.unl.novalincs.useme.model.Utility.LogicalExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Expression</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.LogicalExpression#getExpression()
	 * @see #getLogicalExpression()
	 * @generated
	 */
	EAttribute getLogicalExpression_Expression();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.Utility.LogicalExpression#getProfileTemplate <em>Profile Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Profile Template</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.LogicalExpression#getProfileTemplate()
	 * @see #getLogicalExpression()
	 * @generated
	 */
	EReference getLogicalExpression_ProfileTemplate();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.Utility.LogicalExpression#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Question</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.LogicalExpression#getQuestion()
	 * @see #getLogicalExpression()
	 * @generated
	 */
	EReference getLogicalExpression_Question();

	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.Utility.ConcreteSyntax <em>Concrete Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Syntax</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.ConcreteSyntax
	 * @generated
	 */
	EClass getConcreteSyntax();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.Utility.ConcreteSyntax#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.ConcreteSyntax#getName()
	 * @see #getConcreteSyntax()
	 * @generated
	 */
	EAttribute getConcreteSyntax_Name();

	/**
	 * Returns the meta object for the container reference '{@link pt.fct.unl.novalincs.useme.model.Utility.ConcreteSyntax#getDsl <em>Dsl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Dsl</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.ConcreteSyntax#getDsl()
	 * @see #getConcreteSyntax()
	 * @generated
	 */
	EReference getConcreteSyntax_Dsl();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.Utility.ConcreteSyntax#getInteractionSyntax <em>Interaction Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interaction Syntax</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.ConcreteSyntax#getInteractionSyntax()
	 * @see #getConcreteSyntax()
	 * @generated
	 */
	EReference getConcreteSyntax_InteractionSyntax();

	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.Utility.AbstractSyntax <em>Abstract Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Syntax</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.AbstractSyntax
	 * @generated
	 */
	EClass getAbstractSyntax();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.Utility.AbstractSyntax#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.AbstractSyntax#getName()
	 * @see #getAbstractSyntax()
	 * @generated
	 */
	EAttribute getAbstractSyntax_Name();

	/**
	 * Returns the meta object for the container reference '{@link pt.fct.unl.novalincs.useme.model.Utility.AbstractSyntax#getDsl <em>Dsl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Dsl</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.AbstractSyntax#getDsl()
	 * @see #getAbstractSyntax()
	 * @generated
	 */
	EReference getAbstractSyntax_Dsl();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.Utility.AbstractSyntax#getInteractionSyntax <em>Interaction Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interaction Syntax</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.AbstractSyntax#getInteractionSyntax()
	 * @see #getAbstractSyntax()
	 * @generated
	 */
	EReference getAbstractSyntax_InteractionSyntax();

	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.Utility.OutsideRef <em>Outside Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outside Ref</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.OutsideRef
	 * @generated
	 */
	EClass getOutsideRef();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.Utility.OutsideRef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.OutsideRef#getName()
	 * @see #getOutsideRef()
	 * @generated
	 */
	EAttribute getOutsideRef_Name();

	/**
	 * Returns the meta object for the attribute list '{@link pt.fct.unl.novalincs.useme.model.Utility.OutsideRef#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Link</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.OutsideRef#getLink()
	 * @see #getOutsideRef()
	 * @generated
	 */
	EAttribute getOutsideRef_Link();

	/**
	 * Returns the meta object for the attribute list '{@link pt.fct.unl.novalincs.useme.model.Utility.OutsideRef#getTool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tool</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.OutsideRef#getTool()
	 * @see #getOutsideRef()
	 * @generated
	 */
	EAttribute getOutsideRef_Tool();

	/**
	 * Returns the meta object for the reference '{@link pt.fct.unl.novalincs.useme.model.Utility.OutsideRef#getOutsideRef <em>Outside Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outside Ref</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.OutsideRef#getOutsideRef()
	 * @see #getOutsideRef()
	 * @generated
	 */
	EReference getOutsideRef_OutsideRef();

	/**
	 * Returns the meta object for enum '{@link pt.fct.unl.novalincs.useme.model.Utility.PriorityValue <em>Priority Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Priority Value</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.PriorityValue
	 * @generated
	 */
	EEnum getPriorityValue();

	/**
	 * Returns the meta object for enum '{@link pt.fct.unl.novalincs.useme.model.Utility.RecordInput <em>Record Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Record Input</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.RecordInput
	 * @generated
	 */
	EEnum getRecordInput();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UtilityFactory getUtilityFactory();

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
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.Utility.impl.UtilitySpecificationImpl <em>Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.Utility.impl.UtilitySpecificationImpl
		 * @see pt.fct.unl.novalincs.useme.model.Utility.impl.UtilityPackageImpl#getUtilitySpecification()
		 * @generated
		 */
		EClass UTILITY_SPECIFICATION = eINSTANCE.getUtilitySpecification();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UTILITY_SPECIFICATION__NAME = eINSTANCE.getUtilitySpecification_Name();

		/**
		 * The meta object literal for the '<em><b>DSL</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UTILITY_SPECIFICATION__DSL = eINSTANCE.getUtilitySpecification_DSL();

		/**
		 * The meta object literal for the '<em><b>Functional Goal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UTILITY_SPECIFICATION__FUNCTIONAL_GOAL = eINSTANCE.getUtilitySpecification_FunctionalGoal();

		/**
		 * The meta object literal for the '<em><b>Process Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UTILITY_SPECIFICATION__PROCESS_MODEL = eINSTANCE.getUtilitySpecification_ProcessModel();

		/**
		 * The meta object literal for the '<em><b>Survey Engine</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UTILITY_SPECIFICATION__SURVEY_ENGINE = eINSTANCE.getUtilitySpecification_SurveyEngine();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UTILITY_SPECIFICATION__DOCUMENTATION = eINSTANCE.getUtilitySpecification_Documentation();

		/**
		 * The meta object literal for the '<em><b>Outside Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UTILITY_SPECIFICATION__OUTSIDE_REF = eINSTANCE.getUtilitySpecification_OutsideRef();

		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.Utility.impl.SurveyEngineImpl <em>Survey Engine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.Utility.impl.SurveyEngineImpl
		 * @see pt.fct.unl.novalincs.useme.model.Utility.impl.UtilityPackageImpl#getSurveyEngine()
		 * @generated
		 */
		EClass SURVEY_ENGINE = eINSTANCE.getSurveyEngine();

		/**
		 * The meta object literal for the '<em><b>Survey Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURVEY_ENGINE__SURVEY_MODEL = eINSTANCE.getSurveyEngine_SurveyModel();

		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.Utility.impl.DSLImpl <em>DSL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.Utility.impl.DSLImpl
		 * @see pt.fct.unl.novalincs.useme.model.Utility.impl.UtilityPackageImpl#getDSL()
		 * @generated
		 */
		EClass DSL = eINSTANCE.getDSL();

		/**
		 * The meta object literal for the '<em><b>Concrete Syntax</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL__CONCRETE_SYNTAX = eINSTANCE.getDSL_ConcreteSyntax();

		/**
		 * The meta object literal for the '<em><b>Abstract Syntax</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL__ABSTRACT_SYNTAX = eINSTANCE.getDSL_AbstractSyntax();

		/**
		 * The meta object literal for the '<em><b>Dsl Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL__DSL_NAME = eINSTANCE.getDSL_DslName();

		/**
		 * The meta object literal for the '<em><b>Context Model</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL__CONTEXT_MODEL = eINSTANCE.getDSL_ContextModel();

		/**
		 * The meta object literal for the '<em><b>Goal Model</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL__GOAL_MODEL = eINSTANCE.getDSL_GoalModel();

		/**
		 * The meta object literal for the '<em><b>Evaluation Model</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL__EVALUATION_MODEL = eINSTANCE.getDSL_EvaluationModel();

		/**
		 * The meta object literal for the '<em><b>Existing Goal Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL__EXISTING_GOAL_MODEL = eINSTANCE.getDSL_ExistingGoalModel();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL__DOCUMENTATION = eINSTANCE.getDSL_Documentation();

		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.Utility.impl.ProcessModelImpl <em>Process Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.Utility.impl.ProcessModelImpl
		 * @see pt.fct.unl.novalincs.useme.model.Utility.impl.UtilityPackageImpl#getProcessModel()
		 * @generated
		 */
		EClass PROCESS_MODEL = eINSTANCE.getProcessModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_MODEL__NAME = eINSTANCE.getProcessModel_Name();

		/**
		 * The meta object literal for the '<em><b>Workflow</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_MODEL__WORKFLOW = eINSTANCE.getProcessModel_Workflow();

		/**
		 * The meta object literal for the '<em><b>Evaluation Process</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_MODEL__EVALUATION_PROCESS = eINSTANCE.getProcessModel_EvaluationProcess();

		/**
		 * The meta object literal for the '<em><b>Outside Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_MODEL__OUTSIDE_REF = eINSTANCE.getProcessModel_OutsideRef();

		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.Utility.impl.FunctionalGoalImpl <em>Functional Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.Utility.impl.FunctionalGoalImpl
		 * @see pt.fct.unl.novalincs.useme.model.Utility.impl.UtilityPackageImpl#getFunctionalGoal()
		 * @generated
		 */
		EClass FUNCTIONAL_GOAL = eINSTANCE.getFunctionalGoal();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTIONAL_GOAL__NAME = eINSTANCE.getFunctionalGoal_Name();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTIONAL_GOAL__REQUIREMENTS = eINSTANCE.getFunctionalGoal_Requirements();

		/**
		 * The meta object literal for the '<em><b>Existing GM</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_GOAL__EXISTING_GM = eINSTANCE.getFunctionalGoal_ExistingGM();

		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.Utility.impl.ExistingGMImpl <em>Existing GM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.Utility.impl.ExistingGMImpl
		 * @see pt.fct.unl.novalincs.useme.model.Utility.impl.UtilityPackageImpl#getExistingGM()
		 * @generated
		 */
		EClass EXISTING_GM = eINSTANCE.getExistingGM();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXISTING_GM__NAME = eINSTANCE.getExistingGM_Name();

		/**
		 * The meta object literal for the '<em><b>Functional Goal</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXISTING_GM__FUNCTIONAL_GOAL = eINSTANCE.getExistingGM_FunctionalGoal();

		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.Utility.impl.CEVariableImpl <em>CE Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.Utility.impl.CEVariableImpl
		 * @see pt.fct.unl.novalincs.useme.model.Utility.impl.UtilityPackageImpl#getCEVariable()
		 * @generated
		 */
		EClass CE_VARIABLE = eINSTANCE.getCEVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CE_VARIABLE__NAME = eINSTANCE.getCEVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CE_VARIABLE__MANDATORY = eINSTANCE.getCEVariable_Mandatory();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CE_VARIABLE__TYPE = eINSTANCE.getCEVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Composed Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CE_VARIABLE__COMPOSED_ELEMENT = eINSTANCE.getCEVariable_ComposedElement();

		/**
		 * The meta object literal for the '<em><b>Context Enviroment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CE_VARIABLE__CONTEXT_ENVIROMENT = eINSTANCE.getCEVariable_ContextEnviroment();

		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.Utility.impl.ProfileTemplateImpl <em>Profile Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.Utility.impl.ProfileTemplateImpl
		 * @see pt.fct.unl.novalincs.useme.model.Utility.impl.UtilityPackageImpl#getProfileTemplate()
		 * @generated
		 */
		EClass PROFILE_TEMPLATE = eINSTANCE.getProfileTemplate();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFILE_TEMPLATE__NAME = eINSTANCE.getProfileTemplate_Name();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFILE_TEMPLATE__CATEGORY = eINSTANCE.getProfileTemplate_Category();

		/**
		 * The meta object literal for the '<em><b>Classifiers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILE_TEMPLATE__CLASSIFIERS = eINSTANCE.getProfileTemplate_Classifiers();

		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.Utility.impl.LogicalExpressionImpl <em>Logical Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.Utility.impl.LogicalExpressionImpl
		 * @see pt.fct.unl.novalincs.useme.model.Utility.impl.UtilityPackageImpl#getLogicalExpression()
		 * @generated
		 */
		EClass LOGICAL_EXPRESSION = eINSTANCE.getLogicalExpression();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_EXPRESSION__NAME = eINSTANCE.getLogicalExpression_Name();

		/**
		 * The meta object literal for the '<em><b>Classifier Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_EXPRESSION__CLASSIFIER_NAME = eINSTANCE.getLogicalExpression_ClassifierName();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_EXPRESSION__EXPRESSION = eINSTANCE.getLogicalExpression_Expression();

		/**
		 * The meta object literal for the '<em><b>Profile Template</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_EXPRESSION__PROFILE_TEMPLATE = eINSTANCE.getLogicalExpression_ProfileTemplate();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_EXPRESSION__QUESTION = eINSTANCE.getLogicalExpression_Question();

		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.Utility.impl.ConcreteSyntaxImpl <em>Concrete Syntax</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.Utility.impl.ConcreteSyntaxImpl
		 * @see pt.fct.unl.novalincs.useme.model.Utility.impl.UtilityPackageImpl#getConcreteSyntax()
		 * @generated
		 */
		EClass CONCRETE_SYNTAX = eINSTANCE.getConcreteSyntax();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCRETE_SYNTAX__NAME = eINSTANCE.getConcreteSyntax_Name();

		/**
		 * The meta object literal for the '<em><b>Dsl</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCRETE_SYNTAX__DSL = eINSTANCE.getConcreteSyntax_Dsl();

		/**
		 * The meta object literal for the '<em><b>Interaction Syntax</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCRETE_SYNTAX__INTERACTION_SYNTAX = eINSTANCE.getConcreteSyntax_InteractionSyntax();

		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.Utility.impl.AbstractSyntaxImpl <em>Abstract Syntax</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.Utility.impl.AbstractSyntaxImpl
		 * @see pt.fct.unl.novalincs.useme.model.Utility.impl.UtilityPackageImpl#getAbstractSyntax()
		 * @generated
		 */
		EClass ABSTRACT_SYNTAX = eINSTANCE.getAbstractSyntax();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SYNTAX__NAME = eINSTANCE.getAbstractSyntax_Name();

		/**
		 * The meta object literal for the '<em><b>Dsl</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_SYNTAX__DSL = eINSTANCE.getAbstractSyntax_Dsl();

		/**
		 * The meta object literal for the '<em><b>Interaction Syntax</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_SYNTAX__INTERACTION_SYNTAX = eINSTANCE.getAbstractSyntax_InteractionSyntax();

		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.Utility.impl.OutsideRefImpl <em>Outside Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.Utility.impl.OutsideRefImpl
		 * @see pt.fct.unl.novalincs.useme.model.Utility.impl.UtilityPackageImpl#getOutsideRef()
		 * @generated
		 */
		EClass OUTSIDE_REF = eINSTANCE.getOutsideRef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTSIDE_REF__NAME = eINSTANCE.getOutsideRef_Name();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTSIDE_REF__LINK = eINSTANCE.getOutsideRef_Link();

		/**
		 * The meta object literal for the '<em><b>Tool</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTSIDE_REF__TOOL = eINSTANCE.getOutsideRef_Tool();

		/**
		 * The meta object literal for the '<em><b>Outside Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTSIDE_REF__OUTSIDE_REF = eINSTANCE.getOutsideRef_OutsideRef();

		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.Utility.PriorityValue <em>Priority Value</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.Utility.PriorityValue
		 * @see pt.fct.unl.novalincs.useme.model.Utility.impl.UtilityPackageImpl#getPriorityValue()
		 * @generated
		 */
		EEnum PRIORITY_VALUE = eINSTANCE.getPriorityValue();

		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.Utility.RecordInput <em>Record Input</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.Utility.RecordInput
		 * @see pt.fct.unl.novalincs.useme.model.Utility.impl.UtilityPackageImpl#getRecordInput()
		 * @generated
		 */
		EEnum RECORD_INPUT = eINSTANCE.getRecordInput();

	}

} //UtilityPackage
