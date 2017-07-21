/**
 */
package pt.fct.unl.novalincs.useme.model.ReportModeling.tests;

import junit.textui.TestRunner;

import pt.fct.unl.novalincs.useme.model.ReportModeling.EvaluationResult;
import pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModelingFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Evaluation Result</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EvaluationResultTest extends EvaluationResultAbstractTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EvaluationResultTest.class);
	}

	/**
	 * Constructs a new Evaluation Result test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluationResultTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Evaluation Result test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EvaluationResult getFixture() {
		return (EvaluationResult)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ReportModelingFactory.eINSTANCE.createEvaluationResult());
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

} //EvaluationResultTest
