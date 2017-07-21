/**
 */
package pt.fct.unl.novalincs.useme.model.Utility;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSyntax;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Syntax</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.AbstractSyntax#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.AbstractSyntax#getDsl <em>Dsl</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.AbstractSyntax#getInteractionSyntax <em>Interaction Syntax</em>}</li>
 * </ul>
 *
 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage#getAbstractSyntax()
 * @model
 * @generated
 */
public interface AbstractSyntax extends EObject {
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
	 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage#getAbstractSyntax_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.Utility.AbstractSyntax#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Dsl</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.Utility.DSL#getAbstractSyntax <em>Abstract Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dsl</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dsl</em>' container reference.
	 * @see #setDsl(DSL)
	 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage#getAbstractSyntax_Dsl()
	 * @see pt.fct.unl.novalincs.useme.model.Utility.DSL#getAbstractSyntax
	 * @model opposite="abstractSyntax" required="true" transient="false" ordered="false"
	 * @generated
	 */
	DSL getDsl();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.Utility.AbstractSyntax#getDsl <em>Dsl</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dsl</em>' container reference.
	 * @see #getDsl()
	 * @generated
	 */
	void setDsl(DSL value);

	/**
	 * Returns the value of the '<em><b>Interaction Syntax</b></em>' reference list.
	 * The list contents are of type {@link pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSyntax}.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSyntax#getAbstractSyntax <em>Abstract Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction Syntax</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction Syntax</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage#getAbstractSyntax_InteractionSyntax()
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSyntax#getAbstractSyntax
	 * @model opposite="abstractSyntax" ordered="false"
	 * @generated
	 */
	EList<InteractionSyntax> getInteractionSyntax();

} // AbstractSyntax
