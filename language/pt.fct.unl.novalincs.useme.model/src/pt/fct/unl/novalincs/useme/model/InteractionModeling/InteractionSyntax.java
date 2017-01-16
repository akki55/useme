/**
 */
package pt.fct.unl.novalincs.useme.model.InteractionModeling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import pt.fct.unl.novalincs.useme.model.EvaluationModeling.Documentation;

import pt.fct.unl.novalincs.useme.model.Utility.AbstractSyntax;
import pt.fct.unl.novalincs.useme.model.Utility.ConcreteSyntax;
import pt.fct.unl.novalincs.useme.model.Utility.OutsideRef;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Syntax</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSyntax#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSyntax#getInteractionModel <em>Interaction Model</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSyntax#getConcreteSyntax <em>Concrete Syntax</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSyntax#getAbstractSyntax <em>Abstract Syntax</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSyntax#getOutsideRef <em>Outside Ref</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSyntax#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 *
 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModelingPackage#getInteractionSyntax()
 * @model
 * @generated
 */
public interface InteractionSyntax extends EObject {
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
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModelingPackage#getInteractionSyntax_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSyntax#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Interaction Model</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModel}.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModel#getInteractionSyntax <em>Interaction Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction Model</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction Model</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModelingPackage#getInteractionSyntax_InteractionModel()
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModel#getInteractionSyntax
	 * @model opposite="interactionSyntax" required="true" ordered="false"
	 * @generated
	 */
	EList<InteractionModel> getInteractionModel();

	/**
	 * Returns the value of the '<em><b>Concrete Syntax</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.Utility.ConcreteSyntax}.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.Utility.ConcreteSyntax#getInteractionSyntax <em>Interaction Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete Syntax</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete Syntax</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModelingPackage#getInteractionSyntax_ConcreteSyntax()
	 * @see pt.fct.unl.novalincs.useme.model.Utility.ConcreteSyntax#getInteractionSyntax
	 * @model opposite="interactionSyntax" ordered="false"
	 * @generated
	 */
	EList<ConcreteSyntax> getConcreteSyntax();

	/**
	 * Returns the value of the '<em><b>Abstract Syntax</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.Utility.AbstractSyntax}.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.Utility.AbstractSyntax#getInteractionSyntax <em>Interaction Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Syntax</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Syntax</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModelingPackage#getInteractionSyntax_AbstractSyntax()
	 * @see pt.fct.unl.novalincs.useme.model.Utility.AbstractSyntax#getInteractionSyntax
	 * @model opposite="interactionSyntax" ordered="false"
	 * @generated
	 */
	EList<AbstractSyntax> getAbstractSyntax();

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
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModelingPackage#getInteractionSyntax_OutsideRef()
	 * @model
	 * @generated
	 */
	OutsideRef getOutsideRef();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSyntax#getOutsideRef <em>Outside Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outside Ref</em>' reference.
	 * @see #getOutsideRef()
	 * @generated
	 */
	void setOutsideRef(OutsideRef value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.Documentation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModelingPackage#getInteractionSyntax_Documentation()
	 * @model
	 * @generated
	 */
	EList<Documentation> getDocumentation();

} // InteractionSyntax
