/**
 */
package pt.fct.unl.novalincs.useme.model.EvaluationModeling.tests;

import junit.textui.TestRunner;

import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationContext;
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingFactory;

import pt.fct.unl.novalincs.useme.model.GoalModeling.tests.ScopeTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Evaluation Context</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EvaluationContextTest extends ScopeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EvaluationContextTest.class);
	}

	/**
	 * Constructs a new Evaluation Context test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluationContextTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Evaluation Context test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EvaluationContext getFixture() {
		return (EvaluationContext)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EvaluationModelingFactory.eINSTANCE.createEvaluationContext());
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

} //EvaluationContextTest
