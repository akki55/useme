/**
 */
package pt.fct.unl.novalincs.useme.model.ReportModeling;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModelingFactory
 * @model kind="package"
 * @generated
 */
public interface ReportModelingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ReportModeling";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://nova-lincs.di.fct.unl.pt/useme.reportmodeling";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "useme.reportmodeling";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReportModelingPackage eINSTANCE = pt.fct.unl.novalincs.useme.model.ReportModeling.impl.ReportModelingPackageImpl.init();

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.impl.ReportSpecificationImpl <em>Report Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.impl.ReportSpecificationImpl
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.impl.ReportModelingPackageImpl#getReportSpecification()
	 * @generated
	 */
	int REPORT_SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Report Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_SPECIFICATION__REPORT_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Recommended GM</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_SPECIFICATION__RECOMMENDED_GM = 1;

	/**
	 * The feature id for the '<em><b>Evaluation Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_SPECIFICATION__EVALUATION_RESULT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_SPECIFICATION__NAME = 3;

	/**
	 * The number of structural features of the '<em>Report Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_SPECIFICATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Report Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.impl.ReportModelImpl <em>Report Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.impl.ReportModelImpl
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.impl.ReportModelingPackageImpl#getReportModel()
	 * @generated
	 */
	int REPORT_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Evaluation Result</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_MODEL__EVALUATION_RESULT = 1;

	/**
	 * The feature id for the '<em><b>Recommend GM</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_MODEL__RECOMMEND_GM = 2;

	/**
	 * The number of structural features of the '<em>Report Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Report Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.impl.EvaluationResultAbstractImpl <em>Evaluation Result Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.impl.EvaluationResultAbstractImpl
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.impl.ReportModelingPackageImpl#getEvaluationResultAbstract()
	 * @generated
	 */
	int EVALUATION_RESULT_ABSTRACT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_RESULT_ABSTRACT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Result Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_RESULT_ABSTRACT__RESULT_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Outsife Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_RESULT_ABSTRACT__OUTSIFE_REFERENCE = 2;

	/**
	 * The number of structural features of the '<em>Evaluation Result Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_RESULT_ABSTRACT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Evaluation Result Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_RESULT_ABSTRACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.impl.RecommendGMImpl <em>Recommend GM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.impl.RecommendGMImpl
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.impl.ReportModelingPackageImpl#getRecommendGM()
	 * @generated
	 */
	int RECOMMEND_GM = 3;

	/**
	 * The feature id for the '<em><b>Report Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMEND_GM__REPORT_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMEND_GM__REFERS_TO = 1;

	/**
	 * The feature id for the '<em><b>Functional Goal</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMEND_GM__FUNCTIONAL_GOAL = 2;

	/**
	 * The feature id for the '<em><b>Usability Goal</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMEND_GM__USABILITY_GOAL = 3;

	/**
	 * The feature id for the '<em><b>Suggested Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMEND_GM__SUGGESTED_REQUIREMENTS = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMEND_GM__NAME = 5;

	/**
	 * The number of structural features of the '<em>Recommend GM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMEND_GM_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Recommend GM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMEND_GM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.impl.ResultValueImpl <em>Result Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.impl.ResultValueImpl
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.impl.ReportModelingPackageImpl#getResultValue()
	 * @generated
	 */
	int RESULT_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_VALUE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Result Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_VALUE__RESULT_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_VALUE__LANGUAGE = 2;

	/**
	 * The feature id for the '<em><b>Related Question</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_VALUE__RELATED_QUESTION = 3;

	/**
	 * The feature id for the '<em><b>Related Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_VALUE__RELATED_ACTION = 4;

	/**
	 * The feature id for the '<em><b>Associated Requirement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_VALUE__ASSOCIATED_REQUIREMENT = 5;

	/**
	 * The number of structural features of the '<em>Result Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_VALUE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Result Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.impl.EvaluationResultImpl <em>Evaluation Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.impl.EvaluationResultImpl
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.impl.ReportModelingPackageImpl#getEvaluationResult()
	 * @generated
	 */
	int EVALUATION_RESULT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_RESULT__NAME = EVALUATION_RESULT_ABSTRACT__NAME;

	/**
	 * The feature id for the '<em><b>Result Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_RESULT__RESULT_VALUE = EVALUATION_RESULT_ABSTRACT__RESULT_VALUE;

	/**
	 * The feature id for the '<em><b>Outsife Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_RESULT__OUTSIFE_REFERENCE = EVALUATION_RESULT_ABSTRACT__OUTSIFE_REFERENCE;

	/**
	 * The feature id for the '<em><b>Survey Result</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_RESULT__SURVEY_RESULT = EVALUATION_RESULT_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interaction Result</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_RESULT__INTERACTION_RESULT = EVALUATION_RESULT_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Report Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_RESULT__REPORT_MODEL = EVALUATION_RESULT_ABSTRACT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Evaluation Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_RESULT__EVALUATION_CONTEXT = EVALUATION_RESULT_ABSTRACT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Evaluation Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_RESULT_FEATURE_COUNT = EVALUATION_RESULT_ABSTRACT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Evaluation Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_RESULT_OPERATION_COUNT = EVALUATION_RESULT_ABSTRACT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.ReportSpecification <em>Report Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Report Specification</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.ReportSpecification
	 * @generated
	 */
	EClass getReportSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.ReportSpecification#getReportModel <em>Report Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Report Model</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.ReportSpecification#getReportModel()
	 * @see #getReportSpecification()
	 * @generated
	 */
	EReference getReportSpecification_ReportModel();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.ReportSpecification#getRecommendedGM <em>Recommended GM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Recommended GM</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.ReportSpecification#getRecommendedGM()
	 * @see #getReportSpecification()
	 * @generated
	 */
	EReference getReportSpecification_RecommendedGM();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.ReportSpecification#getEvaluationResult <em>Evaluation Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Evaluation Result</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.ReportSpecification#getEvaluationResult()
	 * @see #getReportSpecification()
	 * @generated
	 */
	EReference getReportSpecification_EvaluationResult();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.ReportSpecification#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.ReportSpecification#getName()
	 * @see #getReportSpecification()
	 * @generated
	 */
	EAttribute getReportSpecification_Name();

	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModel <em>Report Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Report Model</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModel
	 * @generated
	 */
	EClass getReportModel();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModel#getName()
	 * @see #getReportModel()
	 * @generated
	 */
	EAttribute getReportModel_Name();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModel#getEvaluationResult <em>Evaluation Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Evaluation Result</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModel#getEvaluationResult()
	 * @see #getReportModel()
	 * @generated
	 */
	EReference getReportModel_EvaluationResult();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModel#getRecommendGM <em>Recommend GM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Recommend GM</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModel#getRecommendGM()
	 * @see #getReportModel()
	 * @generated
	 */
	EReference getReportModel_RecommendGM();

	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResultAbstract <em>Evaluation Result Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluation Result Abstract</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResultAbstract
	 * @generated
	 */
	EClass getEvaluationResultAbstract();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResultAbstract#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResultAbstract#getName()
	 * @see #getEvaluationResultAbstract()
	 * @generated
	 */
	EAttribute getEvaluationResultAbstract_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResultAbstract#getResultValue <em>Result Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Result Value</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResultAbstract#getResultValue()
	 * @see #getEvaluationResultAbstract()
	 * @generated
	 */
	EReference getEvaluationResultAbstract_ResultValue();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResultAbstract#getOutsifeReference <em>Outsife Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outsife Reference</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResultAbstract#getOutsifeReference()
	 * @see #getEvaluationResultAbstract()
	 * @generated
	 */
	EReference getEvaluationResultAbstract_OutsifeReference();

	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.RecommendGM <em>Recommend GM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recommend GM</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.RecommendGM
	 * @generated
	 */
	EClass getRecommendGM();

	/**
	 * Returns the meta object for the reference '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.RecommendGM#getReportModel <em>Report Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Report Model</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.RecommendGM#getReportModel()
	 * @see #getRecommendGM()
	 * @generated
	 */
	EReference getRecommendGM_ReportModel();

	/**
	 * Returns the meta object for the reference '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.RecommendGM#getRefersTo <em>Refers To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refers To</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.RecommendGM#getRefersTo()
	 * @see #getRecommendGM()
	 * @generated
	 */
	EReference getRecommendGM_RefersTo();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.RecommendGM#getFunctionalGoal <em>Functional Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Functional Goal</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.RecommendGM#getFunctionalGoal()
	 * @see #getRecommendGM()
	 * @generated
	 */
	EReference getRecommendGM_FunctionalGoal();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.RecommendGM#getUsabilityGoal <em>Usability Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Usability Goal</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.RecommendGM#getUsabilityGoal()
	 * @see #getRecommendGM()
	 * @generated
	 */
	EReference getRecommendGM_UsabilityGoal();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.RecommendGM#getSuggestedRequirements <em>Suggested Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Suggested Requirements</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.RecommendGM#getSuggestedRequirements()
	 * @see #getRecommendGM()
	 * @generated
	 */
	EReference getRecommendGM_SuggestedRequirements();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.RecommendGM#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.RecommendGM#getName()
	 * @see #getRecommendGM()
	 * @generated
	 */
	EAttribute getRecommendGM_Name();

	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.ResultValue <em>Result Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Value</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.ResultValue
	 * @generated
	 */
	EClass getResultValue();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.ResultValue#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.ResultValue#getName()
	 * @see #getResultValue()
	 * @generated
	 */
	EAttribute getResultValue_Name();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.ResultValue#getResultValue <em>Result Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Value</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.ResultValue#getResultValue()
	 * @see #getResultValue()
	 * @generated
	 */
	EAttribute getResultValue_ResultValue();

	/**
	 * Returns the meta object for the reference '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.ResultValue#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Language</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.ResultValue#getLanguage()
	 * @see #getResultValue()
	 * @generated
	 */
	EReference getResultValue_Language();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.ResultValue#getRelatedQuestion <em>Related Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Question</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.ResultValue#getRelatedQuestion()
	 * @see #getResultValue()
	 * @generated
	 */
	EReference getResultValue_RelatedQuestion();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.ResultValue#getRelatedAction <em>Related Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Action</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.ResultValue#getRelatedAction()
	 * @see #getResultValue()
	 * @generated
	 */
	EReference getResultValue_RelatedAction();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.ResultValue#getAssociatedRequirement <em>Associated Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Associated Requirement</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.ResultValue#getAssociatedRequirement()
	 * @see #getResultValue()
	 * @generated
	 */
	EReference getResultValue_AssociatedRequirement();

	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResult <em>Evaluation Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluation Result</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResult
	 * @generated
	 */
	EClass getEvaluationResult();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResult#getSurveyResult <em>Survey Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Survey Result</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResult#getSurveyResult()
	 * @see #getEvaluationResult()
	 * @generated
	 */
	EReference getEvaluationResult_SurveyResult();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResult#getInteractionResult <em>Interaction Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interaction Result</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResult#getInteractionResult()
	 * @see #getEvaluationResult()
	 * @generated
	 */
	EReference getEvaluationResult_InteractionResult();

	/**
	 * Returns the meta object for the reference list '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResult#getReportModel <em>Report Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Report Model</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResult#getReportModel()
	 * @see #getEvaluationResult()
	 * @generated
	 */
	EReference getEvaluationResult_ReportModel();

	/**
	 * Returns the meta object for the reference '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResult#getEvaluationContext <em>Evaluation Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Evaluation Context</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResult#getEvaluationContext()
	 * @see #getEvaluationResult()
	 * @generated
	 */
	EReference getEvaluationResult_EvaluationContext();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ReportModelingFactory getReportModelingFactory();

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
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.impl.ReportSpecificationImpl <em>Report Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.impl.ReportSpecificationImpl
		 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.impl.ReportModelingPackageImpl#getReportSpecification()
		 * @generated
		 */
		EClass REPORT_SPECIFICATION = eINSTANCE.getReportSpecification();

		/**
		 * The meta object literal for the '<em><b>Report Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPORT_SPECIFICATION__REPORT_MODEL = eINSTANCE.getReportSpecification_ReportModel();

		/**
		 * The meta object literal for the '<em><b>Recommended GM</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPORT_SPECIFICATION__RECOMMENDED_GM = eINSTANCE.getReportSpecification_RecommendedGM();

		/**
		 * The meta object literal for the '<em><b>Evaluation Result</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPORT_SPECIFICATION__EVALUATION_RESULT = eINSTANCE.getReportSpecification_EvaluationResult();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_SPECIFICATION__NAME = eINSTANCE.getReportSpecification_Name();

		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.impl.ReportModelImpl <em>Report Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.impl.ReportModelImpl
		 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.impl.ReportModelingPackageImpl#getReportModel()
		 * @generated
		 */
		EClass REPORT_MODEL = eINSTANCE.getReportModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_MODEL__NAME = eINSTANCE.getReportModel_Name();

		/**
		 * The meta object literal for the '<em><b>Evaluation Result</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPORT_MODEL__EVALUATION_RESULT = eINSTANCE.getReportModel_EvaluationResult();

		/**
		 * The meta object literal for the '<em><b>Recommend GM</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPORT_MODEL__RECOMMEND_GM = eINSTANCE.getReportModel_RecommendGM();

		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.impl.EvaluationResultAbstractImpl <em>Evaluation Result Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.impl.EvaluationResultAbstractImpl
		 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.impl.ReportModelingPackageImpl#getEvaluationResultAbstract()
		 * @generated
		 */
		EClass EVALUATION_RESULT_ABSTRACT = eINSTANCE.getEvaluationResultAbstract();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_RESULT_ABSTRACT__NAME = eINSTANCE.getEvaluationResultAbstract_Name();

		/**
		 * The meta object literal for the '<em><b>Result Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION_RESULT_ABSTRACT__RESULT_VALUE = eINSTANCE.getEvaluationResultAbstract_ResultValue();

		/**
		 * The meta object literal for the '<em><b>Outsife Reference</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION_RESULT_ABSTRACT__OUTSIFE_REFERENCE = eINSTANCE.getEvaluationResultAbstract_OutsifeReference();

		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.impl.RecommendGMImpl <em>Recommend GM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.impl.RecommendGMImpl
		 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.impl.ReportModelingPackageImpl#getRecommendGM()
		 * @generated
		 */
		EClass RECOMMEND_GM = eINSTANCE.getRecommendGM();

		/**
		 * The meta object literal for the '<em><b>Report Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECOMMEND_GM__REPORT_MODEL = eINSTANCE.getRecommendGM_ReportModel();

		/**
		 * The meta object literal for the '<em><b>Refers To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECOMMEND_GM__REFERS_TO = eINSTANCE.getRecommendGM_RefersTo();

		/**
		 * The meta object literal for the '<em><b>Functional Goal</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECOMMEND_GM__FUNCTIONAL_GOAL = eINSTANCE.getRecommendGM_FunctionalGoal();

		/**
		 * The meta object literal for the '<em><b>Usability Goal</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECOMMEND_GM__USABILITY_GOAL = eINSTANCE.getRecommendGM_UsabilityGoal();

		/**
		 * The meta object literal for the '<em><b>Suggested Requirements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECOMMEND_GM__SUGGESTED_REQUIREMENTS = eINSTANCE.getRecommendGM_SuggestedRequirements();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECOMMEND_GM__NAME = eINSTANCE.getRecommendGM_Name();

		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.impl.ResultValueImpl <em>Result Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.impl.ResultValueImpl
		 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.impl.ReportModelingPackageImpl#getResultValue()
		 * @generated
		 */
		EClass RESULT_VALUE = eINSTANCE.getResultValue();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_VALUE__NAME = eINSTANCE.getResultValue_Name();

		/**
		 * The meta object literal for the '<em><b>Result Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_VALUE__RESULT_VALUE = eINSTANCE.getResultValue_ResultValue();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT_VALUE__LANGUAGE = eINSTANCE.getResultValue_Language();

		/**
		 * The meta object literal for the '<em><b>Related Question</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT_VALUE__RELATED_QUESTION = eINSTANCE.getResultValue_RelatedQuestion();

		/**
		 * The meta object literal for the '<em><b>Related Action</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT_VALUE__RELATED_ACTION = eINSTANCE.getResultValue_RelatedAction();

		/**
		 * The meta object literal for the '<em><b>Associated Requirement</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT_VALUE__ASSOCIATED_REQUIREMENT = eINSTANCE.getResultValue_AssociatedRequirement();

		/**
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.impl.EvaluationResultImpl <em>Evaluation Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.impl.EvaluationResultImpl
		 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.impl.ReportModelingPackageImpl#getEvaluationResult()
		 * @generated
		 */
		EClass EVALUATION_RESULT = eINSTANCE.getEvaluationResult();

		/**
		 * The meta object literal for the '<em><b>Survey Result</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION_RESULT__SURVEY_RESULT = eINSTANCE.getEvaluationResult_SurveyResult();

		/**
		 * The meta object literal for the '<em><b>Interaction Result</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION_RESULT__INTERACTION_RESULT = eINSTANCE.getEvaluationResult_InteractionResult();

		/**
		 * The meta object literal for the '<em><b>Report Model</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION_RESULT__REPORT_MODEL = eINSTANCE.getEvaluationResult_ReportModel();

		/**
		 * The meta object literal for the '<em><b>Evaluation Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION_RESULT__EVALUATION_CONTEXT = eINSTANCE.getEvaluationResult_EvaluationContext();

	}

} //ReportModelingPackage
