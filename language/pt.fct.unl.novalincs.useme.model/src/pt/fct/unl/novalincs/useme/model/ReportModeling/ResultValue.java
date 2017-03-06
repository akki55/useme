/**
 */
package pt.fct.unl.novalincs.useme.model.ReportModeling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import pt.fct.unl.novalincs.useme.model.EvaluationModeling.Language;

import pt.fct.unl.novalincs.useme.model.InteractionModeling.CaptureAction;

import pt.fct.unl.novalincs.useme.model.SurveyModeling.Question;

import pt.fct.unl.novalincs.useme.model.Utility.Requirement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ReportModeling.ResultValue#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ReportModeling.ResultValue#getResultValue <em>Result Value</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ReportModeling.ResultValue#getLanguage <em>Language</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ReportModeling.ResultValue#getRelatedQuestion <em>Related Question</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ReportModeling.ResultValue#getRelatedAction <em>Related Action</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ReportModeling.ResultValue#getAssociatedRequirement <em>Associated Requirement</em>}</li>
 * </ul>
 *
 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModelingPackage#getResultValue()
 * @model
 * @generated
 */
public interface ResultValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModelingPackage#getResultValue_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.ResultValue#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Result Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Value</em>' attribute.
	 * @see #setResultValue(String)
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModelingPackage#getResultValue_ResultValue()
	 * @model required="true"
	 * @generated
	 */
	String getResultValue();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.ResultValue#getResultValue <em>Result Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Value</em>' attribute.
	 * @see #getResultValue()
	 * @generated
	 */
	void setResultValue(String value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' reference.
	 * @see #setLanguage(Language)
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModelingPackage#getResultValue_Language()
	 * @model required="true"
	 * @generated
	 */
	Language getLanguage();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.ReportModeling.ResultValue#getLanguage <em>Language</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' reference.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(Language value);

	/**
	 * Returns the value of the '<em><b>Related Question</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.SurveyModeling.Question}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Question</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Question</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModelingPackage#getResultValue_RelatedQuestion()
	 * @model
	 * @generated
	 */
	EList<Question> getRelatedQuestion();

	/**
	 * Returns the value of the '<em><b>Related Action</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.InteractionModeling.CaptureAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Action</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Action</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModelingPackage#getResultValue_RelatedAction()
	 * @model
	 * @generated
	 */
	EList<CaptureAction> getRelatedAction();

	/**
	 * Returns the value of the '<em><b>Associated Requirement</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.Utility.Requirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associated Requirement</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associated Requirement</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModelingPackage#getResultValue_AssociatedRequirement()
	 * @model
	 * @generated
	 */
	EList<Requirement> getAssociatedRequirement();

} // ResultValue
