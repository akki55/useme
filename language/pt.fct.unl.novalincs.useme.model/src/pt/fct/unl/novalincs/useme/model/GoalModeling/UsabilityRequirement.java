/**
 */
package pt.fct.unl.novalincs.useme.model.GoalModeling;

import org.eclipse.emf.common.util.EList;
import pt.fct.unl.novalincs.useme.model.InteractionModeling.Event;

import pt.fct.unl.novalincs.useme.model.SurveyModeling.Questionnaire;
import pt.fct.unl.novalincs.useme.model.Utility.Requirement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usability Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityRequirement#getOld_name <em>Old name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityRequirement#getDescription_old <em>Description old</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityRequirement#getMetric <em>Metric</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityRequirement#getQuestionnaire <em>Questionnaire</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityRequirement#getEvent <em>Event</em>}</li>
 * </ul>
 *
 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModelingPackage#getUsabilityRequirement()
 * @model
 * @generated
 */
public interface UsabilityRequirement extends Requirement {
	/**
	 * Returns the value of the '<em><b>Old name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old name</em>' attribute.
	 * @see #setOld_name(String)
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModelingPackage#getUsabilityRequirement_Old_name()
	 * @model
	 * @generated
	 */
	String getOld_name();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityRequirement#getOld_name <em>Old name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old name</em>' attribute.
	 * @see #getOld_name()
	 * @generated
	 */
	void setOld_name(String value);

	/**
	 * Returns the value of the '<em><b>Description old</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description old</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description old</em>' attribute.
	 * @see #setDescription_old(String)
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModelingPackage#getUsabilityRequirement_Description_old()
	 * @model default="" required="true"
	 * @generated
	 */
	String getDescription_old();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityRequirement#getDescription_old <em>Description old</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description old</em>' attribute.
	 * @see #getDescription_old()
	 * @generated
	 */
	void setDescription_old(String value);

	/**
	 * Returns the value of the '<em><b>Metric</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric</em>' attribute list.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModelingPackage#getUsabilityRequirement_Metric()
	 * @model
	 * @generated
	 */
	EList<String> getMetric();

	/**
	 * Returns the value of the '<em><b>Questionnaire</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.SurveyModeling.Questionnaire}.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.SurveyModeling.Questionnaire#getUsabilityRequirement <em>Usability Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Questionnaire</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Questionnaire</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModelingPackage#getUsabilityRequirement_Questionnaire()
	 * @see pt.fct.unl.novalincs.useme.model.SurveyModeling.Questionnaire#getUsabilityRequirement
	 * @model opposite="usabilityRequirement"
	 * @generated
	 */
	EList<Questionnaire> getQuestionnaire();

	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.InteractionModeling.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModelingPackage#getUsabilityRequirement_Event()
	 * @model
	 * @generated
	 */
	EList<Event> getEvent();

} // UsabilityRequirement
