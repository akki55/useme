/**
 */
package pt.fct.unl.novalincs.useme.model.InteractionModeling.tests;

import junit.textui.TestRunner;

import pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModelingFactory;
import pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionResult;

import pt.fct.unl.novalincs.useme.model.ReportModeling.tests.EvaluationResultAbstractTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Interaction Result</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InteractionResultTest extends EvaluationResultAbstractTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InteractionResultTest.class);
	}

	/**
	 * Constructs a new Interaction Result test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionResultTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Interaction Result test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InteractionResult getFixture() {
		return (InteractionResult)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(InteractionModelingFactory.eINSTANCE.createInteractionResult());
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

} //InteractionResultTest
