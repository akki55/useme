/**
 */
package pt.fct.unl.novalincs.useme.model.ContextModeling.tests;

import junit.textui.TestRunner;

import pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingFactory;
import pt.fct.unl.novalincs.useme.model.ContextModeling.PhysicalEnvironment;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Physical Environment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PhysicalEnvironmentTest extends ContextEnvironmentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PhysicalEnvironmentTest.class);
	}

	/**
	 * Constructs a new Physical Environment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalEnvironmentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Physical Environment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PhysicalEnvironment getFixture() {
		return (PhysicalEnvironment)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ContextModelingFactory.eINSTANCE.createPhysicalEnvironment());
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

} //PhysicalEnvironmentTest
