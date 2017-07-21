/**
 */
package pt.fct.unl.novalincs.useme.model.Utility.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import pt.fct.unl.novalincs.useme.model.Utility.ProcessModel;
import pt.fct.unl.novalincs.useme.model.Utility.UtilityFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Process Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessModelTest extends TestCase {

	/**
	 * The fixture for this Process Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessModel fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProcessModelTest.class);
	}

	/**
	 * Constructs a new Process Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessModelTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Process Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ProcessModel fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Process Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessModel getFixture() {
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
		setFixture(UtilityFactory.eINSTANCE.createProcessModel());
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

} //ProcessModelTest
