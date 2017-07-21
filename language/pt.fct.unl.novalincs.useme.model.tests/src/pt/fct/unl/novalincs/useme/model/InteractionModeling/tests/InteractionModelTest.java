/**
 */
package pt.fct.unl.novalincs.useme.model.InteractionModeling.tests;

import junit.textui.TestRunner;

import pt.fct.unl.novalincs.useme.model.EvaluationModeling.tests.TestModelTest;

import pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModel;
import pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModelingFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Interaction Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InteractionModelTest extends TestModelTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InteractionModelTest.class);
	}

	/**
	 * Constructs a new Interaction Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionModelTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Interaction Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InteractionModel getFixture() {
		return (InteractionModel)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(InteractionModelingFactory.eINSTANCE.createInteractionModel());
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

} //InteractionModelTest
