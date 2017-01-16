/**
 */
package pt.fct.unl.novalincs.useme.model.ContextModeling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import pt.fct.unl.novalincs.useme.model.Utility.CEVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enviroment Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.EnviromentSpecification#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.EnviromentSpecification#getTechnicalEnvironment <em>Technical Environment</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.EnviromentSpecification#getPhysicalEnvironment <em>Physical Environment</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.EnviromentSpecification#getSocialEnvironment <em>Social Environment</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.EnviromentSpecification#getEnviromentalVariable <em>Enviromental Variable</em>}</li>
 * </ul>
 *
 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getEnviromentSpecification()
 * @model
 * @generated
 */
public interface EnviromentSpecification extends EObject {
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
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getEnviromentSpecification_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.EnviromentSpecification#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Technical Environment</b></em>' containment reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.ContextModeling.TechnicalEnvironment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Technical Environment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technical Environment</em>' containment reference list.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getEnviromentSpecification_TechnicalEnvironment()
	 * @model containment="true"
	 * @generated
	 */
	EList<TechnicalEnvironment> getTechnicalEnvironment();

	/**
	 * Returns the value of the '<em><b>Physical Environment</b></em>' containment reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.ContextModeling.PhysicalEnvironment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physical Environment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical Environment</em>' containment reference list.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getEnviromentSpecification_PhysicalEnvironment()
	 * @model containment="true"
	 * @generated
	 */
	EList<PhysicalEnvironment> getPhysicalEnvironment();

	/**
	 * Returns the value of the '<em><b>Social Environment</b></em>' containment reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.ContextModeling.SocialEnvironment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Social Environment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Social Environment</em>' containment reference list.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getEnviromentSpecification_SocialEnvironment()
	 * @model containment="true"
	 * @generated
	 */
	EList<SocialEnvironment> getSocialEnvironment();

	/**
	 * Returns the value of the '<em><b>Enviromental Variable</b></em>' containment reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.Utility.CEVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enviromental Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enviromental Variable</em>' containment reference list.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getEnviromentSpecification_EnviromentalVariable()
	 * @model containment="true"
	 * @generated
	 */
	EList<CEVariable> getEnviromentalVariable();

} // EnviromentSpecification
