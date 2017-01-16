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
	 * The number of structural features of the '<em>Report Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_SPECIFICATION_FEATURE_COUNT = 3;

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
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.impl.EvaluationResultImpl <em>Evaluation Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.impl.EvaluationResultImpl
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.impl.ReportModelingPackageImpl#getEvaluationResult()
	 * @generated
	 */
	int EVALUATION_RESULT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_RESULT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Outside Reference</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_RESULT__OUTSIDE_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Report Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_RESULT__REPORT_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Evaluation Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_RESULT__EVALUATION_CONTEXT = 3;

	/**
	 * The number of structural features of the '<em>Evaluation Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_RESULT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Evaluation Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_RESULT_OPERATION_COUNT = 0;

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
	 * The number of structural features of the '<em>Recommend GM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMEND_GM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Recommend GM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMEND_GM_OPERATION_COUNT = 0;


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
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResult <em>Evaluation Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluation Result</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResult
	 * @generated
	 */
	EClass getEvaluationResult();

	/**
	 * Returns the meta object for the attribute '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResult#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResult#getName()
	 * @see #getEvaluationResult()
	 * @generated
	 */
	EAttribute getEvaluationResult_Name();

	/**
	 * Returns the meta object for the attribute list '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResult#getOutsideReference <em>Outside Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Outside Reference</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResult#getOutsideReference()
	 * @see #getEvaluationResult()
	 * @generated
	 */
	EAttribute getEvaluationResult_OutsideReference();

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
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.impl.EvaluationResultImpl <em>Evaluation Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.impl.EvaluationResultImpl
		 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.impl.ReportModelingPackageImpl#getEvaluationResult()
		 * @generated
		 */
		EClass EVALUATION_RESULT = eINSTANCE.getEvaluationResult();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_RESULT__NAME = eINSTANCE.getEvaluationResult_Name();

		/**
		 * The meta object literal for the '<em><b>Outside Reference</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_RESULT__OUTSIDE_REFERENCE = eINSTANCE.getEvaluationResult_OutsideReference();

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

	}

} //ReportModelingPackage
