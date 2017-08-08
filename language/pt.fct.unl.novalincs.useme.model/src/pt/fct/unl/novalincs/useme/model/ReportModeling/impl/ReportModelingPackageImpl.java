/**
 */
package pt.fct.unl.novalincs.useme.model.ReportModeling.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage;

import pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextModelingPackageImpl;

import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage;

import pt.fct.unl.novalincs.useme.model.EvaluationModeling.impl.EvaluationModelingPackageImpl;

import pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModelingPackage;

import pt.fct.unl.novalincs.useme.model.GoalModeling.impl.GoalModelingPackageImpl;

import pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModelingPackage;

import pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.InteractionModelingPackageImpl;

import pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResult;
import pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResultAbstract;
import pt.fct.unl.novalincs.useme.model.ReportModeling.RecommendGM;
import pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModel;
import pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModelingFactory;
import pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModelingPackage;
import pt.fct.unl.novalincs.useme.model.ReportModeling.ReportSpecification;
import pt.fct.unl.novalincs.useme.model.ReportModeling.ResultValue;

import pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModelingPackage;

import pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.SurveyModelingPackageImpl;

import pt.fct.unl.novalincs.useme.model.UseMe.UseMePackage;

import pt.fct.unl.novalincs.useme.model.UseMe.impl.UseMePackageImpl;

import pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage;

import pt.fct.unl.novalincs.useme.model.Utility.impl.UtilityPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReportModelingPackageImpl extends EPackageImpl implements ReportModelingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reportSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reportModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evaluationResultAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recommendGMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evaluationResultEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModelingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ReportModelingPackageImpl() {
		super(eNS_URI, ReportModelingFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ReportModelingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ReportModelingPackage init() {
		if (isInited) return (ReportModelingPackage)EPackage.Registry.INSTANCE.getEPackage(ReportModelingPackage.eNS_URI);

		// Obtain or create and register package
		ReportModelingPackageImpl theReportModelingPackage = (ReportModelingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ReportModelingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ReportModelingPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		UseMePackageImpl theUseMePackage = (UseMePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UseMePackage.eNS_URI) instanceof UseMePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UseMePackage.eNS_URI) : UseMePackage.eINSTANCE);
		InteractionModelingPackageImpl theInteractionModelingPackage = (InteractionModelingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InteractionModelingPackage.eNS_URI) instanceof InteractionModelingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InteractionModelingPackage.eNS_URI) : InteractionModelingPackage.eINSTANCE);
		SurveyModelingPackageImpl theSurveyModelingPackage = (SurveyModelingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SurveyModelingPackage.eNS_URI) instanceof SurveyModelingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SurveyModelingPackage.eNS_URI) : SurveyModelingPackage.eINSTANCE);
		EvaluationModelingPackageImpl theEvaluationModelingPackage = (EvaluationModelingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EvaluationModelingPackage.eNS_URI) instanceof EvaluationModelingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EvaluationModelingPackage.eNS_URI) : EvaluationModelingPackage.eINSTANCE);
		GoalModelingPackageImpl theGoalModelingPackage = (GoalModelingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GoalModelingPackage.eNS_URI) instanceof GoalModelingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GoalModelingPackage.eNS_URI) : GoalModelingPackage.eINSTANCE);
		ContextModelingPackageImpl theContextModelingPackage = (ContextModelingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContextModelingPackage.eNS_URI) instanceof ContextModelingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContextModelingPackage.eNS_URI) : ContextModelingPackage.eINSTANCE);
		UtilityPackageImpl theUtilityPackage = (UtilityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UtilityPackage.eNS_URI) instanceof UtilityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UtilityPackage.eNS_URI) : UtilityPackage.eINSTANCE);

		// Create package meta-data objects
		theReportModelingPackage.createPackageContents();
		theUseMePackage.createPackageContents();
		theInteractionModelingPackage.createPackageContents();
		theSurveyModelingPackage.createPackageContents();
		theEvaluationModelingPackage.createPackageContents();
		theGoalModelingPackage.createPackageContents();
		theContextModelingPackage.createPackageContents();
		theUtilityPackage.createPackageContents();

		// Initialize created meta-data
		theReportModelingPackage.initializePackageContents();
		theUseMePackage.initializePackageContents();
		theInteractionModelingPackage.initializePackageContents();
		theSurveyModelingPackage.initializePackageContents();
		theEvaluationModelingPackage.initializePackageContents();
		theGoalModelingPackage.initializePackageContents();
		theContextModelingPackage.initializePackageContents();
		theUtilityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theReportModelingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ReportModelingPackage.eNS_URI, theReportModelingPackage);
		return theReportModelingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReportSpecification() {
		return reportSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReportSpecification_ReportModel() {
		return (EReference)reportSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReportSpecification_RecommendedGM() {
		return (EReference)reportSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReportSpecification_EvaluationResult() {
		return (EReference)reportSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportSpecification_Name() {
		return (EAttribute)reportSpecificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReportModel() {
		return reportModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportModel_Name() {
		return (EAttribute)reportModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReportModel_EvaluationResult() {
		return (EReference)reportModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReportModel_RecommendGM() {
		return (EReference)reportModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvaluationResultAbstract() {
		return evaluationResultAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvaluationResultAbstract_Name() {
		return (EAttribute)evaluationResultAbstractEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluationResultAbstract_ResultValue() {
		return (EReference)evaluationResultAbstractEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluationResultAbstract_OutsifeReference() {
		return (EReference)evaluationResultAbstractEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecommendGM() {
		return recommendGMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecommendGM_ReportModel() {
		return (EReference)recommendGMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecommendGM_RefersTo() {
		return (EReference)recommendGMEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecommendGM_FunctionalGoal() {
		return (EReference)recommendGMEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecommendGM_UsabilityGoal() {
		return (EReference)recommendGMEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecommendGM_SuggestedRequirements() {
		return (EReference)recommendGMEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecommendGM_Name() {
		return (EAttribute)recommendGMEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultValue() {
		return resultValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultValue_Name() {
		return (EAttribute)resultValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultValue_ResultValue() {
		return (EAttribute)resultValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultValue_Language() {
		return (EReference)resultValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultValue_RelatedQuestion() {
		return (EReference)resultValueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultValue_RelatedAction() {
		return (EReference)resultValueEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultValue_AssociatedRequirement() {
		return (EReference)resultValueEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvaluationResult() {
		return evaluationResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluationResult_SurveyResult() {
		return (EReference)evaluationResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluationResult_InteractionResult() {
		return (EReference)evaluationResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluationResult_ReportModel() {
		return (EReference)evaluationResultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluationResult_EvaluationContext() {
		return (EReference)evaluationResultEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportModelingFactory getReportModelingFactory() {
		return (ReportModelingFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		reportSpecificationEClass = createEClass(REPORT_SPECIFICATION);
		createEReference(reportSpecificationEClass, REPORT_SPECIFICATION__REPORT_MODEL);
		createEReference(reportSpecificationEClass, REPORT_SPECIFICATION__RECOMMENDED_GM);
		createEReference(reportSpecificationEClass, REPORT_SPECIFICATION__EVALUATION_RESULT);
		createEAttribute(reportSpecificationEClass, REPORT_SPECIFICATION__NAME);

		reportModelEClass = createEClass(REPORT_MODEL);
		createEAttribute(reportModelEClass, REPORT_MODEL__NAME);
		createEReference(reportModelEClass, REPORT_MODEL__EVALUATION_RESULT);
		createEReference(reportModelEClass, REPORT_MODEL__RECOMMEND_GM);

		evaluationResultAbstractEClass = createEClass(EVALUATION_RESULT_ABSTRACT);
		createEAttribute(evaluationResultAbstractEClass, EVALUATION_RESULT_ABSTRACT__NAME);
		createEReference(evaluationResultAbstractEClass, EVALUATION_RESULT_ABSTRACT__RESULT_VALUE);
		createEReference(evaluationResultAbstractEClass, EVALUATION_RESULT_ABSTRACT__OUTSIFE_REFERENCE);

		recommendGMEClass = createEClass(RECOMMEND_GM);
		createEReference(recommendGMEClass, RECOMMEND_GM__REPORT_MODEL);
		createEReference(recommendGMEClass, RECOMMEND_GM__REFERS_TO);
		createEReference(recommendGMEClass, RECOMMEND_GM__FUNCTIONAL_GOAL);
		createEReference(recommendGMEClass, RECOMMEND_GM__USABILITY_GOAL);
		createEReference(recommendGMEClass, RECOMMEND_GM__SUGGESTED_REQUIREMENTS);
		createEAttribute(recommendGMEClass, RECOMMEND_GM__NAME);

		resultValueEClass = createEClass(RESULT_VALUE);
		createEAttribute(resultValueEClass, RESULT_VALUE__NAME);
		createEAttribute(resultValueEClass, RESULT_VALUE__RESULT_VALUE);
		createEReference(resultValueEClass, RESULT_VALUE__LANGUAGE);
		createEReference(resultValueEClass, RESULT_VALUE__RELATED_QUESTION);
		createEReference(resultValueEClass, RESULT_VALUE__RELATED_ACTION);
		createEReference(resultValueEClass, RESULT_VALUE__ASSOCIATED_REQUIREMENT);

		evaluationResultEClass = createEClass(EVALUATION_RESULT);
		createEReference(evaluationResultEClass, EVALUATION_RESULT__SURVEY_RESULT);
		createEReference(evaluationResultEClass, EVALUATION_RESULT__INTERACTION_RESULT);
		createEReference(evaluationResultEClass, EVALUATION_RESULT__REPORT_MODEL);
		createEReference(evaluationResultEClass, EVALUATION_RESULT__EVALUATION_CONTEXT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UtilityPackage theUtilityPackage = (UtilityPackage)EPackage.Registry.INSTANCE.getEPackage(UtilityPackage.eNS_URI);
		GoalModelingPackage theGoalModelingPackage = (GoalModelingPackage)EPackage.Registry.INSTANCE.getEPackage(GoalModelingPackage.eNS_URI);
		EvaluationModelingPackage theEvaluationModelingPackage = (EvaluationModelingPackage)EPackage.Registry.INSTANCE.getEPackage(EvaluationModelingPackage.eNS_URI);
		SurveyModelingPackage theSurveyModelingPackage = (SurveyModelingPackage)EPackage.Registry.INSTANCE.getEPackage(SurveyModelingPackage.eNS_URI);
		InteractionModelingPackage theInteractionModelingPackage = (InteractionModelingPackage)EPackage.Registry.INSTANCE.getEPackage(InteractionModelingPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		evaluationResultEClass.getESuperTypes().add(this.getEvaluationResultAbstract());

		// Initialize classes, features, and operations; add parameters
		initEClass(reportSpecificationEClass, ReportSpecification.class, "ReportSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReportSpecification_ReportModel(), this.getReportModel(), null, "reportModel", null, 0, -1, ReportSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReportSpecification_RecommendedGM(), this.getRecommendGM(), null, "recommendedGM", null, 0, -1, ReportSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReportSpecification_EvaluationResult(), this.getEvaluationResultAbstract(), null, "evaluationResult", null, 0, -1, ReportSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReportSpecification_Name(), ecorePackage.getEString(), "name", null, 0, 1, ReportSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reportModelEClass, ReportModel.class, "ReportModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReportModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, ReportModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReportModel_EvaluationResult(), this.getEvaluationResult(), this.getEvaluationResult_ReportModel(), "evaluationResult", null, 1, -1, ReportModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReportModel_RecommendGM(), this.getRecommendGM(), this.getRecommendGM_ReportModel(), "recommendGM", null, 0, -1, ReportModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(evaluationResultAbstractEClass, EvaluationResultAbstract.class, "EvaluationResultAbstract", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvaluationResultAbstract_Name(), ecorePackage.getEString(), "name", null, 0, 1, EvaluationResultAbstract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvaluationResultAbstract_ResultValue(), this.getResultValue(), null, "resultValue", null, 0, -1, EvaluationResultAbstract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvaluationResultAbstract_OutsifeReference(), theUtilityPackage.getOutsideRef(), null, "outsifeReference", null, 0, -1, EvaluationResultAbstract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recommendGMEClass, RecommendGM.class, "RecommendGM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRecommendGM_ReportModel(), this.getReportModel(), this.getReportModel_RecommendGM(), "reportModel", null, 1, 1, RecommendGM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRecommendGM_RefersTo(), theGoalModelingPackage.getGoalModel(), null, "refersTo", null, 1, 1, RecommendGM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecommendGM_FunctionalGoal(), theUtilityPackage.getFunctionalGoal(), null, "functionalGoal", null, 0, -1, RecommendGM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecommendGM_UsabilityGoal(), theGoalModelingPackage.getUsabilityGoal(), null, "usabilityGoal", null, 0, -1, RecommendGM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecommendGM_SuggestedRequirements(), theUtilityPackage.getRequirement(), null, "suggestedRequirements", null, 0, -1, RecommendGM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecommendGM_Name(), ecorePackage.getEString(), "name", null, 0, 1, RecommendGM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resultValueEClass, ResultValue.class, "ResultValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResultValue_Name(), ecorePackage.getEString(), "name", null, 0, 1, ResultValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultValue_ResultValue(), ecorePackage.getEString(), "resultValue", null, 1, 1, ResultValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResultValue_Language(), theEvaluationModelingPackage.getLanguage(), null, "language", null, 1, 1, ResultValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResultValue_RelatedQuestion(), theSurveyModelingPackage.getQuestion(), null, "relatedQuestion", null, 0, -1, ResultValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResultValue_RelatedAction(), theInteractionModelingPackage.getCaptureAction(), null, "relatedAction", null, 0, -1, ResultValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResultValue_AssociatedRequirement(), theUtilityPackage.getRequirement(), null, "associatedRequirement", null, 0, -1, ResultValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evaluationResultEClass, EvaluationResult.class, "EvaluationResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvaluationResult_SurveyResult(), theSurveyModelingPackage.getSurveyResult(), null, "surveyResult", null, 0, -1, EvaluationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvaluationResult_InteractionResult(), theInteractionModelingPackage.getInteractionResult(), null, "interactionResult", null, 0, -1, EvaluationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvaluationResult_ReportModel(), this.getReportModel(), this.getReportModel_EvaluationResult(), "reportModel", null, 0, -1, EvaluationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEvaluationResult_EvaluationContext(), theEvaluationModelingPackage.getEvaluationContext(), null, "evaluationContext", null, 1, 1, EvaluationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
	}

} //ReportModelingPackageImpl
