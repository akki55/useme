/**
 */
package pt.fct.unl.novalincs.useme.model.ContextModeling.tests;

import junit.textui.TestRunner;

import pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingFactory;
import pt.fct.unl.novalincs.useme.model.ContextModeling.SocialEnvironment;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Social Environment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SocialEnvironmentTest extends ContextEnvironmentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SocialEnvironmentTest.class);
	}

	/**
	 * Constructs a new Social Environment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialEnvironmentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Social Environment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SocialEnvironment getFixture() {
		return (SocialEnvironment)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ContextModelingFactory.eINSTANCE.createSocialEnvironment());
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

} //SocialEnvironmentTest
