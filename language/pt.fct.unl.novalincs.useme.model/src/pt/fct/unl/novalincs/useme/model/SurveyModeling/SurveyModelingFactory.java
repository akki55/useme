/**
 */
package pt.fct.unl.novalincs.useme.model.SurveyModeling;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModelingPackage
 * @generated
 */
public interface SurveyModelingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SurveyModelingFactory eINSTANCE = pt.fct.unl.novalincs.useme.model.SurveyModeling.impl.SurveyModelingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Survey Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Survey Specification</em>'.
	 * @generated
	 */
	SurveySpecification createSurveySpecification();

	/**
	 * Returns a new object of class '<em>Survey Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Survey Model</em>'.
	 * @generated
	 */
	SurveyModel createSurveyModel();

	/**
	 * Returns a new object of class '<em>Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Question</em>'.
	 * @generated
	 */
	Question createQuestion();

	/**
	 * Returns a new object of class '<em>Survey Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Survey Result</em>'.
	 * @generated
	 */
	SurveyResult createSurveyResult();

	/**
	 * Returns a new object of class '<em>Background Qs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Background Qs</em>'.
	 * @generated
	 */
	BackgroundQs createBackgroundQs();

	/**
	 * Returns a new object of class '<em>Feedback Qs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feedback Qs</em>'.
	 * @generated
	 */
	FeedbackQs createFeedbackQs();

	/**
	 * Returns a new object of class '<em>Questionnaire</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Questionnaire</em>'.
	 * @generated
	 */
	Questionnaire createQuestionnaire();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SurveyModelingPackage getSurveyModelingPackage();

} //SurveyModelingFactory
