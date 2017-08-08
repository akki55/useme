/**
 */
package pt.fct.unl.novalincs.useme.model.Utility;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSyntax;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concrete Syntax</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.ConcreteSyntax#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.ConcreteSyntax#getDsl <em>Dsl</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.ConcreteSyntax#getInteractionSyntax <em>Interaction Syntax</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.ConcreteSyntax#getOutsideRef <em>Outside Ref</em>}</li>
 * </ul>
 *
 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage#getConcreteSyntax()
 * @model
 * @generated
 */
public interface ConcreteSyntax extends EObject {
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
	 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage#getConcreteSyntax_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.Utility.ConcreteSyntax#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Dsl</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.Utility.DSL#getConcreteSyntax <em>Concrete Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dsl</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dsl</em>' container reference.
	 * @see #setDsl(DSL)
	 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage#getConcreteSyntax_Dsl()
	 * @see pt.fct.unl.novalincs.useme.model.Utility.DSL#getConcreteSyntax
	 * @model opposite="concreteSyntax" required="true" transient="false" ordered="false"
	 * @generated
	 */
	DSL getDsl();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.Utility.ConcreteSyntax#getDsl <em>Dsl</em>}' container reference.
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
	 * It is bidirectional and its opposite is '{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSyntax#getConcreteSyntax <em>Concrete Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction Syntax</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction Syntax</em>' reference list.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage#getConcreteSyntax_InteractionSyntax()
	 * @see pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionSyntax#getConcreteSyntax
	 * @model opposite="concreteSyntax" ordered="false"
	 * @generated
	 */
	EList<InteractionSyntax> getInteractionSyntax();

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
	 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage#getConcreteSyntax_OutsideRef()
	 * @model
	 * @generated
	 */
	OutsideRef getOutsideRef();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.Utility.ConcreteSyntax#getOutsideRef <em>Outside Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outside Ref</em>' reference.
	 * @see #getOutsideRef()
	 * @generated
	 */
	void setOutsideRef(OutsideRef value);

} // ConcreteSyntax
