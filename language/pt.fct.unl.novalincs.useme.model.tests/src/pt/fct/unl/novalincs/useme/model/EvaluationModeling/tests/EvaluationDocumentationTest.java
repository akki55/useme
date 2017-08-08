/**
 */
package pt.fct.unl.novalincs.useme.model.EvaluationModeling.tests;

import junit.textui.TestRunner;

import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationDocumentation;
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingFactory;

import pt.fct.unl.novalincs.useme.model.Utility.tests.DocumentationTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Evaluation Documentation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EvaluationDocumentationTest extends DocumentationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EvaluationDocumentationTest.class);
	}

	/**
	 * Constructs a new Evaluation Documentation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluationDocumentationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Evaluation Documentation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EvaluationDocumentation getFixture() {
		return (EvaluationDocumentation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EvaluationModelingFactory.eINSTANCE.createEvaluationDocumentation());
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

} //EvaluationDocumentationTest
