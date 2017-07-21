/**
 */
package pt.fct.unl.novalincs.useme.model.Utility;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import pt.fct.unl.novalincs.useme.model.ContextModeling.ContextEnvironment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CE Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.CEVariable#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.CEVariable#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.CEVariable#getType <em>Type</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.CEVariable#getComposedElement <em>Composed Element</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.CEVariable#getContextEnviroment <em>Context Enviroment</em>}</li>
 * </ul>
 *
 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage#getCEVariable()
 * @model
 * @generated
 */
public interface CEVariable extends EObject {
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
	 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage#getCEVariable_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.Utility.CEVariable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mandatory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory</em>' attribute.
	 * @see #setMandatory(boolean)
	 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage#getCEVariable_Mandatory()
	 * @model required="true"
	 * @generated
	 */
	boolean isMandatory();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.Utility.CEVariable#isMandatory <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory</em>' attribute.
	 * @see #isMandatory()
	 * @generated
	 */
	void setMandatory(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute list.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage#getCEVariable_Type()
	 * @model
	 * @generated
	 */
	EList<String> getType();

	/**
	 * Returns the value of the '<em><b>Composed Element</b></em>' containment reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.Utility.CEVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composed Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composed Element</em>' containment reference list.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage#getCEVariable_ComposedElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<CEVariable> getComposedElement();

	/**
	 * Returns the value of the '<em><b>Context Enviroment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Enviroment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Enviroment</em>' reference.
	 * @see #setContextEnviroment(ContextEnvironment)
	 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage#getCEVariable_ContextEnviroment()
	 * @model
	 * @generated
	 */
	ContextEnvironment getContextEnviroment();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.Utility.CEVariable#getContextEnviroment <em>Context Enviroment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Enviroment</em>' reference.
	 * @see #getContextEnviroment()
	 * @generated
	 */
	void setContextEnviroment(ContextEnvironment value);

} // CEVariable
