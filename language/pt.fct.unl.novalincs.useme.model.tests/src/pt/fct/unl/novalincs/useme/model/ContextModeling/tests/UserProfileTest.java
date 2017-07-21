/**
 */
package pt.fct.unl.novalincs.useme.model.ContextModeling.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingFactory;
import pt.fct.unl.novalincs.useme.model.ContextModeling.UserProfile;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>User Profile</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UserProfileTest extends TestCase {

	/**
	 * The fixture for this User Profile test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserProfile fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UserProfileTest.class);
	}

	/**
	 * Constructs a new User Profile test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserProfileTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this User Profile test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(UserProfile fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this User Profile test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserProfile getFixture() {
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
		setFixture(ContextModelingFactory.eINSTANCE.createUserProfile());
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

} //UserProfileTest
