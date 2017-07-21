/**
 */
package pt.fct.unl.novalincs.useme.model.ContextModeling.tests;

import junit.textui.TestRunner;

import pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingFactory;
import pt.fct.unl.novalincs.useme.model.ContextModeling.TechnicalEnvironment;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Technical Environment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TechnicalEnvironmentTest extends ContextEnvironmentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TechnicalEnvironmentTest.class);
	}

	/**
	 * Constructs a new Technical Environment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TechnicalEnvironmentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Technical Environment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TechnicalEnvironment getFixture() {
		return (TechnicalEnvironment)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ContextModelingFactory.eINSTANCE.createTechnicalEnvironment());
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

} //TechnicalEnvironmentTest
