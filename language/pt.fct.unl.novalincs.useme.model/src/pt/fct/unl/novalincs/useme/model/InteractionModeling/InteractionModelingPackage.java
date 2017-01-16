/**
 */
package pt.fct.unl.novalincs.useme.model.InteractionModeling;

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
 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModelingFactory
 * @model kind="package"
 * @generated
 */
public interface InteractionModelingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "InteractionModeling";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://nova-lincs.di.fct.unl.pt/useme.interactionmodeling";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "useme.interactionmodeling";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InteractionModelingPackage eINSTANCE = pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.InteractionModelingPackageImpl.init();

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.InteractionSpecificationImpl <em>Interaction Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.InteractionSpecificationImpl
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.InteractionModelingPackageImpl#getInteractionSpecification()
	 * @generated
	 */
	int INTERACTION_SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_SPECIFICATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Interaction Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_SPECIFICATION__INTERACTION_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Interaction Syntax</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_SPECIFICATION__INTERACTION_SYNTAX = 2;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_SPECIFICATION__EVENT = 3;

	/**
	 * The feature id for the '<em><b>Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_SPECIFICATION__TASK = 4;

	/**
	 * The feature id for the '<em><b>Interaction Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_SPECIFICATION__INTERACTION_RESULT = 5;

	/**
	 * The number of structural features of the '<em>Interaction Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_SPECIFICATION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Interaction Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.InteractionModelImpl <em>Interaction Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.InteractionModelImpl
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.InteractionModelingPackageImpl#getInteractionModel()
	 * @generated
	 */
	int INTERACTION_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_MODEL__NAME = EvaluationModelingPackage.TEST_MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Evaluation Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_MODEL__EVALUATION_MODEL = EvaluationModelingPackage.TEST_MODEL__EVALUATION_MODEL;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_MODEL__PARTICIPANT = EvaluationModelingPackage.TEST_MODEL__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Interaction Result</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_MODEL__INTERACTION_RESULT = EvaluationModelingPackage.TEST_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interaction Syntax</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_MODEL__INTERACTION_SYNTAX = EvaluationModelingPackage.TEST_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_MODEL__EVENT = EvaluationModelingPackage.TEST_MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_MODEL__TASK = EvaluationModelingPackage.TEST_MODEL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Interaction Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_MODEL_FEATURE_COUNT = EvaluationModelingPackage.TEST_MODEL_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Interaction Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_MODEL_OPERATION_COUNT = EvaluationModelingPackage.TEST_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.InteractionSyntaxImpl <em>Interaction Syntax</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.InteractionSyntaxImpl
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.InteractionModelingPackageImpl#getInteractionSyntax()
	 * @generated
	 */
	int INTERACTION_SYNTAX = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_SYNTAX__NAME = 0;

	/**
	 * The feature id for the '<em><b>Interaction Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_SYNTAX__INTERACTION_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Concrete Syntax</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_SYNTAX__CONCRETE_SYNTAX = 2;

	/**
	 * The feature id for the '<em><b>Abstract Syntax</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_SYNTAX__ABSTRACT_SYNTAX = 3;

	/**
	 * The feature id for the '<em><b>Outside Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_SYNTAX__OUTSIDE_REF = 4;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_SYNTAX__DOCUMENTATION = 5;

	/**
	 * The number of structural features of the '<em>Interaction Syntax</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_SYNTAX_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Interaction Syntax</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_SYNTAX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.TaskImpl
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.InteractionModelingPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__SCENARIO = 1;

	/**
	 * The feature id for the '<em><b>Interaction Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__INTERACTION_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DOCUMENTATION = 3;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.EventImpl
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.InteractionModelingPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Usability Requirement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__USABILITY_REQUIREMENT = 1;

	/**
	 * The feature id for the '<em><b>Capture</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__CAPTURE = 2;

	/**
	 * The feature id for the '<em><b>Record Event</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__RECORD_EVENT = 3;

	/**
	 * The feature id for the '<em><b>Manual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__MANUAL = 4;

	/**
	 * The feature id for the '<em><b>Analysis Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ANALYSIS_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Interaction Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__INTERACTION_MODEL = 6;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.InteractionResultImpl <em>Interaction Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.InteractionResultImpl
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.InteractionModelingPackageImpl#getInteractionResult()
	 * @generated
	 */
	int INTERACTION_RESULT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_RESULT__NAME = ReportModelingPackage.EVALUATION_RESULT__NAME;

	/**
	 * The feature id for the '<em><b>Outside Reference</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_RESULT__OUTSIDE_REFERENCE = ReportModelingPackage.EVALUATION_RESULT__OUTSIDE_REFERENCE;

	/**
	 * The feature id for the '<em><b>Report Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_RESULT__REPORT_MODEL = ReportModelingPackage.EVALUATION_RESULT__REPORT_MODEL;

	/**
	 * The feature id for the '<em><b>Evaluation Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_RESULT__EVALUATION_CONTEXT = ReportModelingPackage.EVALUATION_RESULT__EVALUATION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Interaction Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_RESULT__INTERACTION_MODEL = ReportModelingPackage.EVALUATION_RESULT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interaction Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_RESULT_FEATURE_COUNT = ReportModelingPackage.EVALUATION_RESULT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Interaction Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_RESULT_OPERATION_COUNT = ReportModelingPackage.EVALUATION_RESULT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSpecification <em>Interaction Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Specification</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSpecification
	 * @generated
	 */
	EClass getInteractionSpecification();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSpecification#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSpecification#getName()
	 * @see #getInteractionSpecification()
	 * @generated
	 */
	EAttribute getInteractionSpecification_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSpecification#getInteractionModel <em>Interaction Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interaction Model</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSpecification#getInteractionModel()
	 * @see #getInteractionSpecification()
	 * @generated
	 */
	EReference getInteractionSpecification_InteractionModel();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSpecification#getInteractionSyntax <em>Interaction Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interaction Syntax</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSpecification#getInteractionSyntax()
	 * @see #getInteractionSpecification()
	 * @generated
	 */
	EReference getInteractionSpecification_InteractionSyntax();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSpecification#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSpecification#getEvent()
	 * @see #getInteractionSpecification()
	 * @generated
	 */
	EReference getInteractionSpecification_Event();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSpecification#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSpecification#getTask()
	 * @see #getInteractionSpecification()
	 * @generated
	 */
	EReference getInteractionSpecification_Task();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSpecification#getInteractionResult <em>Interaction Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interaction Result</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSpecification#getInteractionResult()
	 * @see #getInteractionSpecification()
	 * @generated
	 */
	EReference getInteractionSpecification_InteractionResult();

	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModel <em>Interaction Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Model</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModel
	 * @generated
	 */
	EClass getInteractionModel();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModel#getInteractionResult <em>Interaction Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interaction Result</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModel#getInteractionResult()
	 * @see #getInteractionModel()
	 * @generated
	 */
	EReference getInteractionModel_InteractionResult();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModel#getInteractionSyntax <em>Interaction Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interaction Syntax</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModel#getInteractionSyntax()
	 * @see #getInteractionModel()
	 * @generated
	 */
	EReference getInteractionModel_InteractionSyntax();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModel#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Event</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModel#getEvent()
	 * @see #getInteractionModel()
	 * @generated
	 */
	EReference getInteractionModel_Event();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModel#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Task</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModel#getTask()
	 * @see #getInteractionModel()
	 * @generated
	 */
	EReference getInteractionModel_Task();

	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSyntax <em>Interaction Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Syntax</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSyntax
	 * @generated
	 */
	EClass getInteractionSyntax();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSyntax#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSyntax#getName()
	 * @see #getInteractionSyntax()
	 * @generated
	 */
	EAttribute getInteractionSyntax_Name();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSyntax#getInteractionModel <em>Interaction Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interaction Model</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSyntax#getInteractionModel()
	 * @see #getInteractionSyntax()
	 * @generated
	 */
	EReference getInteractionSyntax_InteractionModel();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSyntax#getConcreteSyntax <em>Concrete Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Concrete Syntax</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSyntax#getConcreteSyntax()
	 * @see #getInteractionSyntax()
	 * @generated
	 */
	EReference getInteractionSyntax_ConcreteSyntax();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSyntax#getAbstractSyntax <em>Abstract Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Abstract Syntax</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSyntax#getAbstractSyntax()
	 * @see #getInteractionSyntax()
	 * @generated
	 */
	EReference getInteractionSyntax_AbstractSyntax();

	/**
	 * Returns the meta object for the reference '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSyntax#getOutsideRef <em>Outside Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outside Ref</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSyntax#getOutsideRef()
	 * @see #getInteractionSyntax()
	 * @generated
	 */
	EReference getInteractionSyntax_OutsideRef();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSyntax#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Documentation</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSyntax#getDocumentation()
	 * @see #getInteractionSyntax()
	 * @generated
	 */
	EReference getInteractionSyntax_Documentation();

	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.Task#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.Task#getName()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Name();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.Task#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scenario</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.Task#getScenario()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Scenario();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.Task#getInteractionModel <em>Interaction Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interaction Model</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.Task#getInteractionModel()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_InteractionModel();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.Task#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Documentation</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.Task#getDocumentation()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Documentation();

	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.Event#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.Event#getName()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Name();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.Event#getUsabilityRequirement <em>Usability Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Usability Requirement</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.Event#getUsabilityRequirement()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_UsabilityRequirement();

	/**
	 * Returns the meta object for the attribute list '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.Event#getCapture <em>Capture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Capture</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.Event#getCapture()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Capture();

	/**
	 * Returns the meta object for the attribute list '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.Event#getRecordEvent <em>Record Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Record Event</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.Event#getRecordEvent()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_RecordEvent();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.Event#isManual <em>Manual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manual</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.Event#isManual()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Manual();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.Event#getAnalysisType <em>Analysis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Analysis Type</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.Event#getAnalysisType()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_AnalysisType();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.Event#getInteractionModel <em>Interaction Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interaction Model</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.Event#getInteractionModel()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_InteractionModel();

	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionResult <em>Interaction Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Result</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionResult
	 * @generated
	 */
	EClass getInteractionResult();

	/**
	 * Returns the meta object for the reference '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionResult#getInteractionModel <em>Interaction Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interaction Model</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionResult#getInteractionModel()
	 * @see #getInteractionResult()
	 * @generated
	 */
	EReference getInteractionResult_InteractionModel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InteractionModelingFactory getInteractionModelingFactory();

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
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.InteractionSpecificationImpl <em>Interaction Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.InteractionSpecificationImpl
		 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.InteractionModelingPackageImpl#getInteractionSpecification()
		 * @generated
		 */
		EClass INTERACTION_SPECIFICATION = eINSTANCE.getInteractionSpecification();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION_SPECIFICATION__NAME = eINSTANCE.getInteractionSpecification_Name();

		/**
		 * The meta object literal for the '<em><b>Interaction Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_SPECIFICATION__INTERACTION_MODEL = eINSTANCE.getInteractionSpecification_InteractionModel();

		/**
		 * The meta object literal for the '<em><b>Interaction Syntax</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_SPECIFICATION__INTERACTION_SYNTAX = eINSTANCE.getInteractionSpecification_InteractionSyntax();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_SPECIFICATION__EVENT = eINSTANCE.getInteractionSpecification_Event();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_SPECIFICATION__TASK = eINSTANCE.getInteractionSpecification_Task();

		/**
		 * The meta object literal for the '<em><b>Interaction Result</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_SPECIFICATION__INTERACTION_RESULT = eINSTANCE.getInteractionSpecification_InteractionResult();

		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.InteractionModelImpl <em>Interaction Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.InteractionModelImpl
		 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.InteractionModelingPackageImpl#getInteractionModel()
		 * @generated
		 */
		EClass INTERACTION_MODEL = eINSTANCE.getInteractionModel();

		/**
		 * The meta object literal for the '<em><b>Interaction Result</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_MODEL__INTERACTION_RESULT = eINSTANCE.getInteractionModel_InteractionResult();

		/**
		 * The meta object literal for the '<em><b>Interaction Syntax</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_MODEL__INTERACTION_SYNTAX = eINSTANCE.getInteractionModel_InteractionSyntax();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_MODEL__EVENT = eINSTANCE.getInteractionModel_Event();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_MODEL__TASK = eINSTANCE.getInteractionModel_Task();

		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.InteractionSyntaxImpl <em>Interaction Syntax</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.InteractionSyntaxImpl
		 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.InteractionModelingPackageImpl#getInteractionSyntax()
		 * @generated
		 */
		EClass INTERACTION_SYNTAX = eINSTANCE.getInteractionSyntax();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION_SYNTAX__NAME = eINSTANCE.getInteractionSyntax_Name();

		/**
		 * The meta object literal for the '<em><b>Interaction Model</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_SYNTAX__INTERACTION_MODEL = eINSTANCE.getInteractionSyntax_InteractionModel();

		/**
		 * The meta object literal for the '<em><b>Concrete Syntax</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_SYNTAX__CONCRETE_SYNTAX = eINSTANCE.getInteractionSyntax_ConcreteSyntax();

		/**
		 * The meta object literal for the '<em><b>Abstract Syntax</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_SYNTAX__ABSTRACT_SYNTAX = eINSTANCE.getInteractionSyntax_AbstractSyntax();

		/**
		 * The meta object literal for the '<em><b>Outside Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_SYNTAX__OUTSIDE_REF = eINSTANCE.getInteractionSyntax_OutsideRef();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_SYNTAX__DOCUMENTATION = eINSTANCE.getInteractionSyntax_Documentation();

		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.TaskImpl
		 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.InteractionModelingPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__NAME = eINSTANCE.getTask_Name();

		/**
		 * The meta object literal for the '<em><b>Scenario</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__SCENARIO = eINSTANCE.getTask_Scenario();

		/**
		 * The meta object literal for the '<em><b>Interaction Model</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__INTERACTION_MODEL = eINSTANCE.getTask_InteractionModel();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__DOCUMENTATION = eINSTANCE.getTask_Documentation();

		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.EventImpl
		 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.InteractionModelingPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

		/**
		 * The meta object literal for the '<em><b>Usability Requirement</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__USABILITY_REQUIREMENT = eINSTANCE.getEvent_UsabilityRequirement();

		/**
		 * The meta object literal for the '<em><b>Capture</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__CAPTURE = eINSTANCE.getEvent_Capture();

		/**
		 * The meta object literal for the '<em><b>Record Event</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__RECORD_EVENT = eINSTANCE.getEvent_RecordEvent();

		/**
		 * The meta object literal for the '<em><b>Manual</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__MANUAL = eINSTANCE.getEvent_Manual();

		/**
		 * The meta object literal for the '<em><b>Analysis Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__ANALYSIS_TYPE = eINSTANCE.getEvent_AnalysisType();

		/**
		 * The meta object literal for the '<em><b>Interaction Model</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__INTERACTION_MODEL = eINSTANCE.getEvent_InteractionModel();

		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.InteractionResultImpl <em>Interaction Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.InteractionResultImpl
		 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.InteractionModelingPackageImpl#getInteractionResult()
		 * @generated
		 */
		EClass INTERACTION_RESULT = eINSTANCE.getInteractionResult();

		/**
		 * The meta object literal for the '<em><b>Interaction Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_RESULT__INTERACTION_MODEL = eINSTANCE.getInteractionResult_InteractionModel();

	}

} //InteractionModelingPackage
