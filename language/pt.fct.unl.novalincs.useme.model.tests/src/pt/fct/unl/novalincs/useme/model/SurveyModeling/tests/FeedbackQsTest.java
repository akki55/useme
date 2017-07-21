/**
 */
package pt.fct.unl.novalincs.useme.model.SurveyModeling.tests;

import junit.textui.TestRunner;

import pt.fct.unl.novalincs.useme.model.SurveyModeling.FeedbackQs;
import pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModelingFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Feedback Qs</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FeedbackQsTest extends QuestionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FeedbackQsTest.class);
	}

	/**
	 * Constructs a new Feedback Qs test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeedbackQsTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Feedback Qs test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FeedbackQs getFixture() {
		return (FeedbackQs)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SurveyModelingFactory.eINSTANCE.createFeedbackQs());
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

} //FeedbackQsTest
