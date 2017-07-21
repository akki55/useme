/**
 */
package pt.fct.unl.novalincs.useme.model.GoalModeling.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModel;
import pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModelingFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Goal Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GoalModelTest extends TestCase {

	/**
	 * The fixture for this Goal Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalModel fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GoalModelTest.class);
	}

	/**
	 * Constructs a new Goal Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalModelTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Goal Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(GoalModel fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Goal Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalModel getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GoalModelingFactory.eINSTANCE.createGoalModel());
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

} //GoalModelTest
