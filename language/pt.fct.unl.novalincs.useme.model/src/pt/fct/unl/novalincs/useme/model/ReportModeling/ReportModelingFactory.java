/**
 */
package pt.fct.unl.novalincs.useme.model.ReportModeling;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModelingPackage
 * @generated
 */
public interface ReportModelingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReportModelingFactory eINSTANCE = pt.fct.unl.novalincs.useme.model.ReportModeling.impl.ReportModelingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Report Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Report Specification</em>'.
	 * @generated
	 */
	ReportSpecification createReportSpecification();

	/**
	 * Returns a new object of class '<em>Report Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Report Model</em>'.
	 * @generated
	 */
	ReportModel createReportModel();

	/**
	 * Returns a new object of class '<em>Evaluation Result Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evaluation Result Abstract</em>'.
	 * @generated
	 */
	EvaluationResultAbstract createEvaluationResultAbstract();

	/**
	 * Returns a new object of class '<em>Evaluation Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evaluation Result</em>'.
	 * @generated
	 */
	EvaluationResult createEvaluationResult();

	/**
	 * Returns a new object of class '<em>Recommend GM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recommend GM</em>'.
	 * @generated
	 */
	RecommendGM createRecommendGM();

	/**
	 * Returns a new object of class '<em>Result Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result Value</em>'.
	 * @generated
	 */
	ResultValue createResultValue();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ReportModelingPackage getReportModelingPackage();

} //ReportModelingFactory
