/**
 */
package pt.fct.unl.novalincs.useme.model.SurveyModeling.tests;

import junit.textui.TestRunner;

import pt.fct.unl.novalincs.useme.model.EvaluationModeling.tests.TestModelTest;

import pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModel;
import pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModelingFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Survey Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SurveyModelTest extends TestModelTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SurveyModelTest.class);
	}

	/**
	 * Constructs a new Survey Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurveyModelTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Survey Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SurveyModel getFixture() {
		return (SurveyModel)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SurveyModelingFactory.eINSTANCE.createSurveyModel());
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

} //SurveyModelTest
