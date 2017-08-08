/**
 */
package pt.fct.unl.novalincs.useme.model.ContextModeling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import pt.fct.unl.novalincs.useme.model.Utility.DSL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModel#getCmName <em>Cm Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModel#getDomain <em>Domain</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModel#getContextEnvironment <em>Context Environment</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModel#getLanguage <em>Language</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModel#getWorkflow <em>Workflow</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModel#getUserHierarchy <em>User Hierarchy</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModel#getContextProvider <em>Context Provider</em>}</li>
 * </ul>
 *
 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getContextModel()
 * @model
 * @generated
 */
public interface ContextModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Cm Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cm Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cm Name</em>' attribute.
	 * @see #setCmName(String)
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getContextModel_CmName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getCmName();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModel#getCmName <em>Cm Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cm Name</em>' attribute.
	 * @see #getCmName()
	 * @generated
	 */
	void setCmName(String value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' attribute.
	 * @see #setDomain(String)
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getContextModel_Domain()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getDomain();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModel#getDomain <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' attribute.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(String value);

	/**
	 * Returns the value of the '<em><b>Context Environment</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.ContextModeling.ContextEnvironment}.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.ContextEnvironment#getContextModel <em>Context Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Environment</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Environment</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getContextModel_ContextEnvironment()
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextEnvironment#getContextModel
	 * @model opposite="contextModel" required="true" ordered="false"
	 * @generated
	 */
	EList<ContextEnvironment> getContextEnvironment();

	/**
	 * Returns the value of the '<em><b>Language</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.Utility.DSL#getContextModel <em>Context Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' reference.
	 * @see #setLanguage(DSL)
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getContextModel_Language()
	 * @see pt.fct.unl.novalincs.useme.model.Utility.DSL#getContextModel
	 * @model opposite="contextModel" ordered="false"
	 * @generated
	 */
	DSL getLanguage();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModel#getLanguage <em>Language</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' reference.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(DSL value);

	/**
	 * Returns the value of the '<em><b>Workflow</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.ContextModeling.Workflow}.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.Workflow#getContextModel <em>Context Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workflow</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflow</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getContextModel_Workflow()
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.Workflow#getContextModel
	 * @model opposite="contextModel" ordered="false"
	 * @generated
	 */
	EList<Workflow> getWorkflow();

	/**
	 * Returns the value of the '<em><b>User Hierarchy</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.UserHierarchy#getContextModel <em>Context Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Hierarchy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Hierarchy</em>' containment reference.
	 * @see #setUserHierarchy(UserHierarchy)
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getContextModel_UserHierarchy()
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.UserHierarchy#getContextModel
	 * @model opposite="contextModel" containment="true" required="true" ordered="false"
	 * @generated
	 */
	UserHierarchy getUserHierarchy();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModel#getUserHierarchy <em>User Hierarchy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Hierarchy</em>' containment reference.
	 * @see #getUserHierarchy()
	 * @generated
	 */
	void setUserHierarchy(UserHierarchy value);

	/**
	 * Returns the value of the '<em><b>Context Provider</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Provider</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Provider</em>' attribute list.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getContextModel_ContextProvider()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<String> getContextProvider();

} // ContextModel
