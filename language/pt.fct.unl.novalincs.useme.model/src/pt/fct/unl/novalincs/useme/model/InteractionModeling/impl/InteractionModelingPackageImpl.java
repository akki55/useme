/**
 */
package pt.fct.unl.novalincs.useme.model.InteractionModeling.impl;

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

import pt.fct.unl.novalincs.useme.model.InteractionModeling.CaptureAction;
import pt.fct.unl.novalincs.useme.model.InteractionModeling.Event;
import pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModel;
import pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModelingFactory;
import pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModelingPackage;
import pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionResult;
import pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSpecification;
import pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSyntax;
import pt.fct.unl.novalincs.useme.model.InteractionModeling.Task;

import pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModelingPackage;

import pt.fct.unl.novalincs.useme.model.ReportModeling.impl.ReportModelingPackageImpl;

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
public class InteractionModelingPackageImpl extends EPackageImpl implements InteractionModelingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionSyntaxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass captureActionEClass = null;

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
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModelingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InteractionModelingPackageImpl() {
		super(eNS_URI, InteractionModelingFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link InteractionModelingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InteractionModelingPackage init() {
		if (isInited) return (InteractionModelingPackage)EPackage.Registry.INSTANCE.getEPackage(InteractionModelingPackage.eNS_URI);

		// Obtain or create and register package
		InteractionModelingPackageImpl theInteractionModelingPackage = (InteractionModelingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InteractionModelingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InteractionModelingPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		UseMePackageImpl theUseMePackage = (UseMePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UseMePackage.eNS_URI) instanceof UseMePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UseMePackage.eNS_URI) : UseMePackage.eINSTANCE);
		ReportModelingPackageImpl theReportModelingPackage = (ReportModelingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReportModelingPackage.eNS_URI) instanceof ReportModelingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReportModelingPackage.eNS_URI) : ReportModelingPackage.eINSTANCE);
		SurveyModelingPackageImpl theSurveyModelingPackage = (SurveyModelingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SurveyModelingPackage.eNS_URI) instanceof SurveyModelingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SurveyModelingPackage.eNS_URI) : SurveyModelingPackage.eINSTANCE);
		EvaluationModelingPackageImpl theEvaluationModelingPackage = (EvaluationModelingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EvaluationModelingPackage.eNS_URI) instanceof EvaluationModelingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EvaluationModelingPackage.eNS_URI) : EvaluationModelingPackage.eINSTANCE);
		GoalModelingPackageImpl theGoalModelingPackage = (GoalModelingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GoalModelingPackage.eNS_URI) instanceof GoalModelingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GoalModelingPackage.eNS_URI) : GoalModelingPackage.eINSTANCE);
		ContextModelingPackageImpl theContextModelingPackage = (ContextModelingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContextModelingPackage.eNS_URI) instanceof ContextModelingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContextModelingPackage.eNS_URI) : ContextModelingPackage.eINSTANCE);
		UtilityPackageImpl theUtilityPackage = (UtilityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UtilityPackage.eNS_URI) instanceof UtilityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UtilityPackage.eNS_URI) : UtilityPackage.eINSTANCE);

		// Create package meta-data objects
		theInteractionModelingPackage.createPackageContents();
		theUseMePackage.createPackageContents();
		theReportModelingPackage.createPackageContents();
		theSurveyModelingPackage.createPackageContents();
		theEvaluationModelingPackage.createPackageContents();
		theGoalModelingPackage.createPackageContents();
		theContextModelingPackage.createPackageContents();
		theUtilityPackage.createPackageContents();

		// Initialize created meta-data
		theInteractionModelingPackage.initializePackageContents();
		theUseMePackage.initializePackageContents();
		theReportModelingPackage.initializePackageContents();
		theSurveyModelingPackage.initializePackageContents();
		theEvaluationModelingPackage.initializePackageContents();
		theGoalModelingPackage.initializePackageContents();
		theContextModelingPackage.initializePackageContents();
		theUtilityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInteractionModelingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InteractionModelingPackage.eNS_URI, theInteractionModelingPackage);
		return theInteractionModelingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionSpecification() {
		return interactionSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteractionSpecification_Name() {
		return (EAttribute)interactionSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionSpecification_InteractionModel() {
		return (EReference)interactionSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionSpecification_InteractionSyntax() {
		return (EReference)interactionSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionSpecification_Event() {
		return (EReference)interactionSpecificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionSpecification_Task() {
		return (EReference)interactionSpecificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionSpecification_InteractionResult() {
		return (EReference)interactionSpecificationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionModel() {
		return interactionModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionModel_InteractionResult() {
		return (EReference)interactionModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionModel_InteractionSyntax() {
		return (EReference)interactionModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionModel_Event() {
		return (EReference)interactionModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionModel_Task() {
		return (EReference)interactionModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionSyntax() {
		return interactionSyntaxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteractionSyntax_Name() {
		return (EAttribute)interactionSyntaxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionSyntax_InteractionModel() {
		return (EReference)interactionSyntaxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionSyntax_ConcreteSyntax() {
		return (EReference)interactionSyntaxEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionSyntax_AbstractSyntax() {
		return (EReference)interactionSyntaxEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionSyntax_OutsideRef() {
		return (EReference)interactionSyntaxEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionSyntax_Documentation() {
		return (EReference)interactionSyntaxEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Name() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Scenario() {
		return (EReference)taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_InteractionModel() {
		return (EReference)taskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Documentation() {
		return (EReference)taskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Name() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvent_UsabilityRequirement() {
		return (EReference)eventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Capture() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_RecordEvent() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Manual() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_AnalysisType() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvent_InteractionModel() {
		return (EReference)eventEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvent_CaptureAction() {
		return (EReference)eventEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionResult() {
		return interactionResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionResult_InteractionModel() {
		return (EReference)interactionResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionResult_Event() {
		return (EReference)interactionResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCaptureAction() {
		return captureActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCaptureAction_Name() {
		return (EAttribute)captureActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionModelingFactory getInteractionModelingFactory() {
		return (InteractionModelingFactory)getEFactoryInstance();
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
		interactionSpecificationEClass = createEClass(INTERACTION_SPECIFICATION);
		createEAttribute(interactionSpecificationEClass, INTERACTION_SPECIFICATION__NAME);
		createEReference(interactionSpecificationEClass, INTERACTION_SPECIFICATION__INTERACTION_MODEL);
		createEReference(interactionSpecificationEClass, INTERACTION_SPECIFICATION__INTERACTION_SYNTAX);
		createEReference(interactionSpecificationEClass, INTERACTION_SPECIFICATION__EVENT);
		createEReference(interactionSpecificationEClass, INTERACTION_SPECIFICATION__TASK);
		createEReference(interactionSpecificationEClass, INTERACTION_SPECIFICATION__INTERACTION_RESULT);

		interactionModelEClass = createEClass(INTERACTION_MODEL);
		createEReference(interactionModelEClass, INTERACTION_MODEL__INTERACTION_RESULT);
		createEReference(interactionModelEClass, INTERACTION_MODEL__INTERACTION_SYNTAX);
		createEReference(interactionModelEClass, INTERACTION_MODEL__EVENT);
		createEReference(interactionModelEClass, INTERACTION_MODEL__TASK);

		interactionSyntaxEClass = createEClass(INTERACTION_SYNTAX);
		createEAttribute(interactionSyntaxEClass, INTERACTION_SYNTAX__NAME);
		createEReference(interactionSyntaxEClass, INTERACTION_SYNTAX__INTERACTION_MODEL);
		createEReference(interactionSyntaxEClass, INTERACTION_SYNTAX__CONCRETE_SYNTAX);
		createEReference(interactionSyntaxEClass, INTERACTION_SYNTAX__ABSTRACT_SYNTAX);
		createEReference(interactionSyntaxEClass, INTERACTION_SYNTAX__OUTSIDE_REF);
		createEReference(interactionSyntaxEClass, INTERACTION_SYNTAX__DOCUMENTATION);

		taskEClass = createEClass(TASK);
		createEAttribute(taskEClass, TASK__NAME);
		createEReference(taskEClass, TASK__SCENARIO);
		createEReference(taskEClass, TASK__INTERACTION_MODEL);
		createEReference(taskEClass, TASK__DOCUMENTATION);

		eventEClass = createEClass(EVENT);
		createEAttribute(eventEClass, EVENT__NAME);
		createEReference(eventEClass, EVENT__USABILITY_REQUIREMENT);
		createEAttribute(eventEClass, EVENT__CAPTURE);
		createEAttribute(eventEClass, EVENT__RECORD_EVENT);
		createEAttribute(eventEClass, EVENT__MANUAL);
		createEAttribute(eventEClass, EVENT__ANALYSIS_TYPE);
		createEReference(eventEClass, EVENT__INTERACTION_MODEL);
		createEReference(eventEClass, EVENT__CAPTURE_ACTION);

		interactionResultEClass = createEClass(INTERACTION_RESULT);
		createEReference(interactionResultEClass, INTERACTION_RESULT__INTERACTION_MODEL);
		createEReference(interactionResultEClass, INTERACTION_RESULT__EVENT);

		captureActionEClass = createEClass(CAPTURE_ACTION);
		createEAttribute(captureActionEClass, CAPTURE_ACTION__NAME);
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
		ContextModelingPackage theContextModelingPackage = (ContextModelingPackage)EPackage.Registry.INSTANCE.getEPackage(ContextModelingPackage.eNS_URI);
		GoalModelingPackage theGoalModelingPackage = (GoalModelingPackage)EPackage.Registry.INSTANCE.getEPackage(GoalModelingPackage.eNS_URI);
		ReportModelingPackage theReportModelingPackage = (ReportModelingPackage)EPackage.Registry.INSTANCE.getEPackage(ReportModelingPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		interactionModelEClass.getESuperTypes().add(theEvaluationModelingPackage.getTestModel());
		interactionResultEClass.getESuperTypes().add(theReportModelingPackage.getEvaluationResultAbstract());

		// Initialize classes, features, and operations; add parameters
		initEClass(interactionSpecificationEClass, InteractionSpecification.class, "InteractionSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInteractionSpecification_Name(), ecorePackage.getEString(), "name", null, 0, 1, InteractionSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteractionSpecification_InteractionModel(), this.getInteractionModel(), null, "interactionModel", null, 0, -1, InteractionSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteractionSpecification_InteractionSyntax(), this.getInteractionSyntax(), null, "interactionSyntax", null, 0, -1, InteractionSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteractionSpecification_Event(), this.getEvent(), null, "event", null, 0, -1, InteractionSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteractionSpecification_Task(), this.getTask(), null, "task", null, 0, -1, InteractionSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteractionSpecification_InteractionResult(), this.getInteractionResult(), null, "interactionResult", null, 0, -1, InteractionSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interactionModelEClass, InteractionModel.class, "InteractionModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInteractionModel_InteractionResult(), this.getInteractionResult(), this.getInteractionResult_InteractionModel(), "interactionResult", null, 0, -1, InteractionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInteractionModel_InteractionSyntax(), this.getInteractionSyntax(), this.getInteractionSyntax_InteractionModel(), "interactionSyntax", null, 1, -1, InteractionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInteractionModel_Event(), this.getEvent(), this.getEvent_InteractionModel(), "event", null, 1, -1, InteractionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInteractionModel_Task(), this.getTask(), this.getTask_InteractionModel(), "task", null, 0, -1, InteractionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interactionSyntaxEClass, InteractionSyntax.class, "InteractionSyntax", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInteractionSyntax_Name(), ecorePackage.getEString(), "name", null, 0, 1, InteractionSyntax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteractionSyntax_InteractionModel(), this.getInteractionModel(), this.getInteractionModel_InteractionSyntax(), "interactionModel", null, 1, -1, InteractionSyntax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInteractionSyntax_ConcreteSyntax(), theUtilityPackage.getConcreteSyntax(), theUtilityPackage.getConcreteSyntax_InteractionSyntax(), "concreteSyntax", null, 0, -1, InteractionSyntax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInteractionSyntax_AbstractSyntax(), theUtilityPackage.getAbstractSyntax(), theUtilityPackage.getAbstractSyntax_InteractionSyntax(), "abstractSyntax", null, 0, -1, InteractionSyntax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInteractionSyntax_OutsideRef(), theUtilityPackage.getOutsideRef(), null, "outsideRef", null, 0, 1, InteractionSyntax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteractionSyntax_Documentation(), theUtilityPackage.getDocumentation(), null, "documentation", null, 0, -1, InteractionSyntax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTask_Name(), ecorePackage.getEString(), "name", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Scenario(), theContextModelingPackage.getScenario(), theContextModelingPackage.getScenario_EvaluatedTask(), "scenario", null, 1, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTask_InteractionModel(), this.getInteractionModel(), this.getInteractionModel_Task(), "interactionModel", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Documentation(), theEvaluationModelingPackage.getEvaluationDocumentation(), null, "documentation", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvent_UsabilityRequirement(), theGoalModelingPackage.getUsabilityRequirement(), null, "usabilityRequirement", null, 0, -1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_Capture(), ecorePackage.getEString(), "capture", null, 0, -1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_RecordEvent(), theUtilityPackage.getRecordInput(), "recordEvent", null, 0, -1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_Manual(), ecorePackage.getEBoolean(), "manual", null, 1, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_AnalysisType(), ecorePackage.getEString(), "analysisType", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvent_InteractionModel(), this.getInteractionModel(), this.getInteractionModel_Event(), "interactionModel", null, 1, -1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEvent_CaptureAction(), this.getCaptureAction(), null, "captureAction", null, 0, -1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interactionResultEClass, InteractionResult.class, "InteractionResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInteractionResult_InteractionModel(), this.getInteractionModel(), this.getInteractionModel_InteractionResult(), "interactionModel", null, 1, 1, InteractionResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInteractionResult_Event(), this.getEvent(), null, "event", null, 1, -1, InteractionResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(captureActionEClass, CaptureAction.class, "CaptureAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCaptureAction_Name(), ecorePackage.getEString(), "name", null, 0, 1, CaptureAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //InteractionModelingPackageImpl
