/**
 */
package pt.fct.unl.novalincs.useme.model.SurveyModeling.tests;

import junit.textui.TestRunner;

import pt.fct.unl.novalincs.useme.model.ReportModeling.tests.EvaluationResultAbstractTest;

import pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModelingFactory;
import pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyResult;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Survey Result</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SurveyResultTest extends EvaluationResultAbstractTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SurveyResultTest.class);
	}

	/**
	 * Constructs a new Survey Result test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurveyResultTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Survey Result test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SurveyResult getFixture() {
		return (SurveyResult)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SurveyModelingFactory.eINSTANCE.createSurveyResult());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //SurveyResultTest
