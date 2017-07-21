/**
 */
package pt.fct.unl.novalincs.useme.model.GoalModeling.tests;

import junit.textui.TestRunner;

import pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModelingFactory;
import pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityRequirement;

import pt.fct.unl.novalincs.useme.model.Utility.tests.RequirementTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Usability Requirement</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UsabilityRequirementTest extends RequirementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UsabilityRequirementTest.class);
	}

	/**
	 * Constructs a new Usability Requirement test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsabilityRequirementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Usability Requirement test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UsabilityRequirement getFixture() {
		return (UsabilityRequirement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GoalModelingFactory.eINSTANCE.createUsabilityRequirement());
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

} //UsabilityRequirementTest
