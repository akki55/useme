/**
 */
package pt.fct.unl.novalincs.useme.model.ContextModeling;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import pt.fct.unl.novalincs.useme.model.Utility.CEVariable;
import pt.fct.unl.novalincs.useme.model.Utility.OutsideRef;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.ContextEnvironment#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.ContextEnvironment#getContextModel <em>Context Model</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.ContextEnvironment#getCeElement <em>Ce Element</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.ContextEnvironment#getOutsideRef <em>Outside Ref</em>}</li>
 * </ul>
 *
 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getContextEnvironment()
 * @model
 * @generated
 */
public interface ContextEnvironment extends EObject {
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
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getContextEnvironment_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.ContextEnvironment#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Context Model</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModel}.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModel#getContextEnvironment <em>Context Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Model</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Model</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getContextEnvironment_ContextModel()
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModel#getContextEnvironment
	 * @model opposite="contextEnvironment" ordered="false"
	 * @generated
	 */
	EList<ContextModel> getContextModel();

	/**
	 * Returns the value of the '<em><b>Ce Element</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.Utility.CEVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ce Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ce Element</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getContextEnvironment_CeElement()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<CEVariable> getCeElement();

	/**
	 * Returns the value of the '<em><b>Outside Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outside Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outside Ref</em>' reference.
	 * @see #setOutsideRef(OutsideRef)
	 * @see pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage#getContextEnvironment_OutsideRef()
	 * @model
	 * @generated
	 */
	OutsideRef getOutsideRef();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.ContextModeling.ContextEnvironment#getOutsideRef <em>Outside Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outside Ref</em>' reference.
	 * @see #getOutsideRef()
	 * @generated
	 */
	void setOutsideRef(OutsideRef value);

} // ContextEnvironment
