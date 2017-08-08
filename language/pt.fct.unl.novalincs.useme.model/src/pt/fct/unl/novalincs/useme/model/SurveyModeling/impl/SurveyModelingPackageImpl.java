/**
 */
package pt.fct.unl.novalincs.useme.model.SurveyModeling.impl;

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

import pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModelingPackage;

import pt.fct.unl.novalincs.useme.model.ReportModeling.impl.ReportModelingPackageImpl;

import pt.fct.unl.novalincs.useme.model.SurveyModeling.BackgroundQs;
import pt.fct.unl.novalincs.useme.model.SurveyModeling.FeedbackQs;
import pt.fct.unl.novalincs.useme.model.SurveyModeling.Question;
import pt.fct.unl.novalincs.useme.model.SurveyModeling.Questionnaire;
import pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModel;
import pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModelingFactory;
import pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModelingPackage;
import pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyResult;
import pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveySpecification;

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
public class SurveyModelingPackageImpl extends EPackageImpl implements SurveyModelingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass surveySpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass surveyModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass surveyResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass backgroundQsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass feedbackQsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionnaireEClass = null;

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
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModelingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SurveyModelingPackageImpl() {
		super(eNS_URI, SurveyModelingFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SurveyModelingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SurveyModelingPackage init() {
		if (isInited) return (SurveyModelingPackage)EPackage.Registry.INSTANCE.getEPackage(SurveyModelingPackage.eNS_URI);

		// Obtain or create and register package
		SurveyModelingPackageImpl theSurveyModelingPackage = (SurveyModelingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SurveyModelingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SurveyModelingPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		UseMePackageImpl theUseMePackage = (UseMePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UseMePackage.eNS_URI) instanceof UseMePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UseMePackage.eNS_URI) : UseMePackage.eINSTANCE);
		ReportModelingPackageImpl theReportModelingPackage = (ReportModelingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReportModelingPackage.eNS_URI) instanceof ReportModelingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReportModelingPackage.eNS_URI) : ReportModelingPackage.eINSTANCE);
		InteractionModelingPackageImpl theInteractionModelingPackage = (InteractionModelingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InteractionModelingPackage.eNS_URI) instanceof InteractionModelingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InteractionModelingPackage.eNS_URI) : InteractionModelingPackage.eINSTANCE);
		EvaluationModelingPackageImpl theEvaluationModelingPackage = (EvaluationModelingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EvaluationModelingPackage.eNS_URI) instanceof EvaluationModelingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EvaluationModelingPackage.eNS_URI) : EvaluationModelingPackage.eINSTANCE);
		GoalModelingPackageImpl theGoalModelingPackage = (GoalModelingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GoalModelingPackage.eNS_URI) instanceof GoalModelingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GoalModelingPackage.eNS_URI) : GoalModelingPackage.eINSTANCE);
		ContextModelingPackageImpl theContextModelingPackage = (ContextModelingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContextModelingPackage.eNS_URI) instanceof ContextModelingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContextModelingPackage.eNS_URI) : ContextModelingPackage.eINSTANCE);
		UtilityPackageImpl theUtilityPackage = (UtilityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UtilityPackage.eNS_URI) instanceof UtilityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UtilityPackage.eNS_URI) : UtilityPackage.eINSTANCE);

		// Create package meta-data objects
		theSurveyModelingPackage.createPackageContents();
		theUseMePackage.createPackageContents();
		theReportModelingPackage.createPackageContents();
		theInteractionModelingPackage.createPackageContents();
		theEvaluationModelingPackage.createPackageContents();
		theGoalModelingPackage.createPackageContents();
		theContextModelingPackage.createPackageContents();
		theUtilityPackage.createPackageContents();

		// Initialize created meta-data
		theSurveyModelingPackage.initializePackageContents();
		theUseMePackage.initializePackageContents();
		theReportModelingPackage.initializePackageContents();
		theInteractionModelingPackage.initializePackageContents();
		theEvaluationModelingPackage.initializePackageContents();
		theGoalModelingPackage.initializePackageContents();
		theContextModelingPackage.initializePackageContents();
		theUtilityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSurveyModelingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SurveyModelingPackage.eNS_URI, theSurveyModelingPackage);
		return theSurveyModelingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSurveySpecification() {
		return surveySpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSurveySpecification_Name() {
		return (EAttribute)surveySpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSurveySpecification_SurveyModel() {
		return (EReference)surveySpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSurveySpecification_Questionnaire() {
		return (EReference)surveySpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSurveySpecification_SurveyResult() {
		return (EReference)surveySpecificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSurveySpecification_Question() {
		return (EReference)surveySpecificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSurveyModel() {
		return surveyModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSurveyModel_Questionnaire() {
		return (EReference)surveyModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSurveyModel_SurveyEngine() {
		return (EReference)surveyModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSurveyModel_SurveyResult() {
		return (EReference)surveyModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestion() {
		return questionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestion_Name() {
		return (EAttribute)questionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestion_Question() {
		return (EAttribute)questionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestion_Scale() {
		return (EAttribute)questionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestion_Type() {
		return (EAttribute)questionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestion_Questionnaire() {
		return (EReference)questionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSurveyResult() {
		return surveyResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSurveyResult_SurveyModel() {
		return (EReference)surveyResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSurveyResult_Questionnaire() {
		return (EReference)surveyResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBackgroundQs() {
		return backgroundQsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBackgroundQs_UserProfile() {
		return (EReference)backgroundQsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBackgroundQs_LogicalExpression() {
		return (EReference)backgroundQsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeedbackQs() {
		return feedbackQsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeedbackQs_Scenario() {
		return (EReference)feedbackQsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionnaire() {
		return questionnaireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestionnaire_Name() {
		return (EAttribute)questionnaireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaire_Question() {
		return (EReference)questionnaireEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaire_SurveyModel() {
		return (EReference)questionnaireEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaire_UsabilityRequirement() {
		return (EReference)questionnaireEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurveyModelingFactory getSurveyModelingFactory() {
		return (SurveyModelingFactory)getEFactoryInstance();
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
		surveySpecificationEClass = createEClass(SURVEY_SPECIFICATION);
		createEAttribute(surveySpecificationEClass, SURVEY_SPECIFICATION__NAME);
		createEReference(surveySpecificationEClass, SURVEY_SPECIFICATION__SURVEY_MODEL);
		createEReference(surveySpecificationEClass, SURVEY_SPECIFICATION__QUESTIONNAIRE);
		createEReference(surveySpecificationEClass, SURVEY_SPECIFICATION__SURVEY_RESULT);
		createEReference(surveySpecificationEClass, SURVEY_SPECIFICATION__QUESTION);

		surveyModelEClass = createEClass(SURVEY_MODEL);
		createEReference(surveyModelEClass, SURVEY_MODEL__QUESTIONNAIRE);
		createEReference(surveyModelEClass, SURVEY_MODEL__SURVEY_ENGINE);
		createEReference(surveyModelEClass, SURVEY_MODEL__SURVEY_RESULT);

		questionEClass = createEClass(QUESTION);
		createEAttribute(questionEClass, QUESTION__NAME);
		createEAttribute(questionEClass, QUESTION__QUESTION);
		createEAttribute(questionEClass, QUESTION__SCALE);
		createEAttribute(questionEClass, QUESTION__TYPE);
		createEReference(questionEClass, QUESTION__QUESTIONNAIRE);

		surveyResultEClass = createEClass(SURVEY_RESULT);
		createEReference(surveyResultEClass, SURVEY_RESULT__SURVEY_MODEL);
		createEReference(surveyResultEClass, SURVEY_RESULT__QUESTIONNAIRE);

		backgroundQsEClass = createEClass(BACKGROUND_QS);
		createEReference(backgroundQsEClass, BACKGROUND_QS__USER_PROFILE);
		createEReference(backgroundQsEClass, BACKGROUND_QS__LOGICAL_EXPRESSION);

		feedbackQsEClass = createEClass(FEEDBACK_QS);
		createEReference(feedbackQsEClass, FEEDBACK_QS__SCENARIO);

		questionnaireEClass = createEClass(QUESTIONNAIRE);
		createEAttribute(questionnaireEClass, QUESTIONNAIRE__NAME);
		createEReference(questionnaireEClass, QUESTIONNAIRE__QUESTION);
		createEReference(questionnaireEClass, QUESTIONNAIRE__SURVEY_MODEL);
		createEReference(questionnaireEClass, QUESTIONNAIRE__USABILITY_REQUIREMENT);
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
		EvaluationModelingPackage theEvaluationModelingPackage = (EvaluationModelingPackage)EPackage.Registry.INSTANCE.getEPackage(EvaluationModelingPackage.eNS_URI);
		UtilityPackage theUtilityPackage = (UtilityPackage)EPackage.Registry.INSTANCE.getEPackage(UtilityPackage.eNS_URI);
		ReportModelingPackage theReportModelingPackage = (ReportModelingPackage)EPackage.Registry.INSTANCE.getEPackage(ReportModelingPackage.eNS_URI);
		ContextModelingPackage theContextModelingPackage = (ContextModelingPackage)EPackage.Registry.INSTANCE.getEPackage(ContextModelingPackage.eNS_URI);
		GoalModelingPackage theGoalModelingPackage = (GoalModelingPackage)EPackage.Registry.INSTANCE.getEPackage(GoalModelingPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		surveyModelEClass.getESuperTypes().add(theEvaluationModelingPackage.getTestModel());
		surveyResultEClass.getESuperTypes().add(theReportModelingPackage.getEvaluationResultAbstract());
		backgroundQsEClass.getESuperTypes().add(this.getQuestion());
		feedbackQsEClass.getESuperTypes().add(this.getQuestion());

		// Initialize classes, features, and operations; add parameters
		initEClass(surveySpecificationEClass, SurveySpecification.class, "SurveySpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSurveySpecification_Name(), ecorePackage.getEString(), "name", null, 0, 1, SurveySpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSurveySpecification_SurveyModel(), this.getSurveyModel(), null, "surveyModel", null, 0, -1, SurveySpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSurveySpecification_Questionnaire(), this.getQuestionnaire(), null, "questionnaire", null, 0, -1, SurveySpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSurveySpecification_SurveyResult(), this.getSurveyResult(), null, "surveyResult", null, 0, -1, SurveySpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSurveySpecification_Question(), this.getQuestion(), null, "question", null, 0, -1, SurveySpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(surveyModelEClass, SurveyModel.class, "SurveyModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSurveyModel_Questionnaire(), this.getQuestionnaire(), this.getQuestionnaire_SurveyModel(), "questionnaire", null, 1, -1, SurveyModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSurveyModel_SurveyEngine(), theUtilityPackage.getSurveyEngine(), theUtilityPackage.getSurveyEngine_SurveyModel(), "surveyEngine", null, 0, -1, SurveyModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSurveyModel_SurveyResult(), this.getSurveyResult(), this.getSurveyResult_SurveyModel(), "surveyResult", null, 0, -1, SurveyModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(questionEClass, Question.class, "Question", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuestion_Name(), ecorePackage.getEString(), "name", null, 0, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestion_Question(), ecorePackage.getEString(), "question", "", 1, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestion_Scale(), ecorePackage.getEString(), "scale", null, 0, -1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestion_Type(), ecorePackage.getEString(), "type", null, 0, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestion_Questionnaire(), this.getQuestionnaire(), this.getQuestionnaire_Question(), "questionnaire", null, 0, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(surveyResultEClass, SurveyResult.class, "SurveyResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSurveyResult_SurveyModel(), this.getSurveyModel(), this.getSurveyModel_SurveyResult(), "surveyModel", null, 1, 1, SurveyResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSurveyResult_Questionnaire(), this.getQuestionnaire(), null, "questionnaire", null, 1, -1, SurveyResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(backgroundQsEClass, BackgroundQs.class, "BackgroundQs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBackgroundQs_UserProfile(), theContextModelingPackage.getUserProfile(), theContextModelingPackage.getUserProfile_BackgroundQs(), "userProfile", null, 1, -1, BackgroundQs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBackgroundQs_LogicalExpression(), theUtilityPackage.getLogicalExpression(), theUtilityPackage.getLogicalExpression_Question(), "logicalExpression", null, 0, -1, BackgroundQs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(feedbackQsEClass, FeedbackQs.class, "FeedbackQs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeedbackQs_Scenario(), theContextModelingPackage.getScenario(), theContextModelingPackage.getScenario_Question(), "scenario", null, 0, -1, FeedbackQs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(questionnaireEClass, Questionnaire.class, "Questionnaire", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuestionnaire_Name(), ecorePackage.getEString(), "name", null, 0, 1, Questionnaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestionnaire_Question(), this.getQuestion(), this.getQuestion_Questionnaire(), "question", null, 0, -1, Questionnaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestionnaire_SurveyModel(), this.getSurveyModel(), this.getSurveyModel_Questionnaire(), "surveyModel", null, 1, -1, Questionnaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getQuestionnaire_UsabilityRequirement(), theGoalModelingPackage.getUsabilityRequirement(), theGoalModelingPackage.getUsabilityRequirement_Questionnaire(), "usabilityRequirement", null, 0, -1, Questionnaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //SurveyModelingPackageImpl
