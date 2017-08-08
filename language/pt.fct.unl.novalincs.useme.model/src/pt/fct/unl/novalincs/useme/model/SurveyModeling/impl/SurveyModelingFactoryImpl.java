/**
 */
package pt.fct.unl.novalincs.useme.model.SurveyModeling.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pt.fct.unl.novalincs.useme.model.SurveyModeling.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SurveyModelingFactoryImpl extends EFactoryImpl implements SurveyModelingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SurveyModelingFactory init() {
		try {
			SurveyModelingFactory theSurveyModelingFactory = (SurveyModelingFactory)EPackage.Registry.INSTANCE.getEFactory(SurveyModelingPackage.eNS_URI);
			if (theSurveyModelingFactory != null) {
				return theSurveyModelingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SurveyModelingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurveyModelingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SurveyModelingPackage.SURVEY_SPECIFICATION: return createSurveySpecification();
			case SurveyModelingPackage.SURVEY_MODEL: return createSurveyModel();
			case SurveyModelingPackage.QUESTION: return createQuestion();
			case SurveyModelingPackage.SURVEY_RESULT: return createSurveyResult();
			case SurveyModelingPackage.BACKGROUND_QS: return createBackgroundQs();
			case SurveyModelingPackage.FEEDBACK_QS: return createFeedbackQs();
			case SurveyModelingPackage.QUESTIONNAIRE: return createQuestionnaire();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurveySpecification createSurveySpecification() {
		SurveySpecificationImpl surveySpecification = new SurveySpecificationImpl();
		return surveySpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurveyModel createSurveyModel() {
		SurveyModelImpl surveyModel = new SurveyModelImpl();
		return surveyModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Question createQuestion() {
		QuestionImpl question = new QuestionImpl();
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurveyResult createSurveyResult() {
		SurveyResultImpl surveyResult = new SurveyResultImpl();
		return surveyResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BackgroundQs createBackgroundQs() {
		BackgroundQsImpl backgroundQs = new BackgroundQsImpl();
		return backgroundQs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeedbackQs createFeedbackQs() {
		FeedbackQsImpl feedbackQs = new FeedbackQsImpl();
		return feedbackQs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Questionnaire createQuestionnaire() {
		QuestionnaireImpl questionnaire = new QuestionnaireImpl();
		return questionnaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurveyModelingPackage getSurveyModelingPackage() {
		return (SurveyModelingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SurveyModelingPackage getPackage() {
		return SurveyModelingPackage.eINSTANCE;
	}

} //SurveyModelingFactoryImpl
