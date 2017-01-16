/**
 */
package pt.fct.unl.novalincs.useme.model.ReportModeling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModel;
import pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal;

import pt.fct.unl.novalincs.useme.model.Utility.FunctionalGoal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recommend GM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ReportModeling.RecommendGM#getReportModel <em>Report Model</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ReportModeling.RecommendGM#getRefersTo <em>Refers To</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ReportModeling.RecommendGM#getFunctionalGoal <em>Functional Goal</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ReportModeling.RecommendGM#getUsabilityGoal <em>Usability Goal</em>}</li>
 * </ul>
 *
 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModelingPackage#getRecommendGM()
 * @model
 * @generated
 */
public interface RecommendGM extends EObject {
	/**
	 * Returns the value of the '<em><b>Report Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModel#getRecommendGM <em>Recommend GM</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Report Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Report Model</em>' reference.
	 * @see #setReportModel(ReportModel)
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModelingPackage#getRecommendGM_ReportModel()
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModel#getRecommendGM
	 * @model opposite="recommendGM" required="true" ordered="false"
	 * @generated
	 */
	ReportModel getReportModel();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.RecommendGM#getReportModel <em>Report Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Report Model</em>' reference.
	 * @see #getReportModel()
	 * @generated
	 */
	void setReportModel(ReportModel value);

	/**
	 * Returns the value of the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refers To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refers To</em>' reference.
	 * @see #setRefersTo(GoalModel)
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModelingPackage#getRecommendGM_RefersTo()
	 * @model required="true"
	 * @generated
	 */
	GoalModel getRefersTo();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.RecommendGM#getRefersTo <em>Refers To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refers To</em>' reference.
	 * @see #getRefersTo()
	 * @generated
	 */
	void setRefersTo(GoalModel value);

	/**
	 * Returns the value of the '<em><b>Functional Goal</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.Utility.FunctionalGoal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functional Goal</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functional Goal</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModelingPackage#getRecommendGM_FunctionalGoal()
	 * @model
	 * @generated
	 */
	EList<FunctionalGoal> getFunctionalGoal();

	/**
	 * Returns the value of the '<em><b>Usability Goal</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.GoalModeling.UsabilityGoal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usability Goal</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usability Goal</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModelingPackage#getRecommendGM_UsabilityGoal()
	 * @model
	 * @generated
	 */
	EList<UsabilityGoal> getUsabilityGoal();

} // RecommendGM
