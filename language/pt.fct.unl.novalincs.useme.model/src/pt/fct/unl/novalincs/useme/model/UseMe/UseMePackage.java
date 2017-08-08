/**
 */
package pt.fct.unl.novalincs.useme.model.UseMe;

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
 * @see pt.fct.unl.novalincs.useme.model.UseMe.UseMeFactory
 * @model kind="package"
 * @generated
 */
public interface UseMePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "UseMe";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://nova-lincs.di.fct.unl.pt/useme";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "useme";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UseMePackage eINSTANCE = pt.fct.unl.novalincs.useme.model.UseMe.impl.UseMePackageImpl.init();

	/**
	 * The meta object id for the '{@link pt.fct.unl.novalincs.useme.model.UseMe.impl.UseMeSpecificationImpl <em>Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.fct.unl.novalincs.useme.model.UseMe.impl.UseMeSpecificationImpl
	 * @see pt.fct.unl.novalincs.useme.model.UseMe.impl.UseMePackageImpl#getUseMeSpecification()
	 * @generated
	 */
	int USE_ME_SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Context Specification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_ME_SPECIFICATION__CONTEXT_SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Goal Specification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_ME_SPECIFICATION__GOAL_SPECIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Evaluation Specification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_ME_SPECIFICATION__EVALUATION_SPECIFICATION = 2;

	/**
	 * The feature id for the '<em><b>Interaction Specification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_ME_SPECIFICATION__INTERACTION_SPECIFICATION = 3;

	/**
	 * The feature id for the '<em><b>Survey Specification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_ME_SPECIFICATION__SURVEY_SPECIFICATION = 4;

	/**
	 * The feature id for the '<em><b>Report Specification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_ME_SPECIFICATION__REPORT_SPECIFICATION = 5;

	/**
	 * The feature id for the '<em><b>Utility Specification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_ME_SPECIFICATION__UTILITY_SPECIFICATION = 6;

	/**
	 * The number of structural features of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_ME_SPECIFICATION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_ME_SPECIFICATION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link pt.fct.unl.novalincs.useme.model.UseMe.UseMeSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.UseMe.UseMeSpecification
	 * @generated
	 */
	EClass getUseMeSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.UseMe.UseMeSpecification#getContextSpecification <em>Context Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Context Specification</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.UseMe.UseMeSpecification#getContextSpecification()
	 * @see #getUseMeSpecification()
	 * @generated
	 */
	EReference getUseMeSpecification_ContextSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.UseMe.UseMeSpecification#getGoalSpecification <em>Goal Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Goal Specification</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.UseMe.UseMeSpecification#getGoalSpecification()
	 * @see #getUseMeSpecification()
	 * @generated
	 */
	EReference getUseMeSpecification_GoalSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.UseMe.UseMeSpecification#getEvaluationSpecification <em>Evaluation Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Evaluation Specification</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.UseMe.UseMeSpecification#getEvaluationSpecification()
	 * @see #getUseMeSpecification()
	 * @generated
	 */
	EReference getUseMeSpecification_EvaluationSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.UseMe.UseMeSpecification#getInteractionSpecification <em>Interaction Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interaction Specification</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.UseMe.UseMeSpecification#getInteractionSpecification()
	 * @see #getUseMeSpecification()
	 * @generated
	 */
	EReference getUseMeSpecification_InteractionSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.UseMe.UseMeSpecification#getSurveySpecification <em>Survey Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Survey Specification</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.UseMe.UseMeSpecification#getSurveySpecification()
	 * @see #getUseMeSpecification()
	 * @generated
	 */
	EReference getUseMeSpecification_SurveySpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.UseMe.UseMeSpecification#getReportSpecification <em>Report Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Report Specification</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.UseMe.UseMeSpecification#getReportSpecification()
	 * @see #getUseMeSpecification()
	 * @generated
	 */
	EReference getUseMeSpecification_ReportSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.fct.unl.novalincs.useme.model.UseMe.UseMeSpecification#getUtilitySpecification <em>Utility Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Utility Specification</em>'.
	 * @see pt.fct.unl.novalincs.useme.model.UseMe.UseMeSpecification#getUtilitySpecification()
	 * @see #getUseMeSpecification()
	 * @generated
	 */
	EReference getUseMeSpecification_UtilitySpecification();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UseMeFactory getUseMeFactory();

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
		 * The meta object literal for the '{@link pt.fct.unl.novalincs.useme.model.UseMe.impl.UseMeSpecificationImpl <em>Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.fct.unl.novalincs.useme.model.UseMe.impl.UseMeSpecificationImpl
		 * @see pt.fct.unl.novalincs.useme.model.UseMe.impl.UseMePackageImpl#getUseMeSpecification()
		 * @generated
		 */
		EClass USE_ME_SPECIFICATION = eINSTANCE.getUseMeSpecification();

		/**
		 * The meta object literal for the '<em><b>Context Specification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE_ME_SPECIFICATION__CONTEXT_SPECIFICATION = eINSTANCE.getUseMeSpecification_ContextSpecification();

		/**
		 * The meta object literal for the '<em><b>Goal Specification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE_ME_SPECIFICATION__GOAL_SPECIFICATION = eINSTANCE.getUseMeSpecification_GoalSpecification();

		/**
		 * The meta object literal for the '<em><b>Evaluation Specification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE_ME_SPECIFICATION__EVALUATION_SPECIFICATION = eINSTANCE.getUseMeSpecification_EvaluationSpecification();

		/**
		 * The meta object literal for the '<em><b>Interaction Specification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE_ME_SPECIFICATION__INTERACTION_SPECIFICATION = eINSTANCE.getUseMeSpecification_InteractionSpecification();

		/**
		 * The meta object literal for the '<em><b>Survey Specification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE_ME_SPECIFICATION__SURVEY_SPECIFICATION = eINSTANCE.getUseMeSpecification_SurveySpecification();

		/**
		 * The meta object literal for the '<em><b>Report Specification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE_ME_SPECIFICATION__REPORT_SPECIFICATION = eINSTANCE.getUseMeSpecification_ReportSpecification();

		/**
		 * The meta object literal for the '<em><b>Utility Specification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE_ME_SPECIFICATION__UTILITY_SPECIFICATION = eINSTANCE.getUseMeSpecification_UtilitySpecification();

	}

} //UseMePackage
