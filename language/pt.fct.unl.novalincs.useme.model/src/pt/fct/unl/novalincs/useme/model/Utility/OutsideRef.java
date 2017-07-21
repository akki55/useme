/**
 */
package pt.fct.unl.novalincs.useme.model.Utility;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Outside Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.OutsideRef#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.OutsideRef#getLink <em>Link</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.OutsideRef#getTool <em>Tool</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.OutsideRef#getOutsideRef <em>Outside Ref</em>}</li>
 * </ul>
 *
 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage#getOutsideRef()
 * @model
 * @generated
 */
public interface OutsideRef extends EObject {
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
	 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage#getOutsideRef_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.Utility.OutsideRef#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Link</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' attribute list.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage#getOutsideRef_Link()
	 * @model
	 * @generated
	 */
	EList<String> getLink();

	/**
	 * Returns the value of the '<em><b>Tool</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tool</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool</em>' attribute list.
	 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage#getOutsideRef_Tool()
	 * @model
	 * @generated
	 */
	EList<String> getTool();

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
	 * @see pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage#getOutsideRef_OutsideRef()
	 * @model
	 * @generated
	 */
	OutsideRef getOutsideRef();

	/**
	 * Sets the value of the '{@link pt.fct.unl.novalincs.useme.model.Utility.OutsideRef#getOutsideRef <em>Outside Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outside Ref</em>' reference.
	 * @see #getOutsideRef()
	 * @generated
	 */
	void setOutsideRef(OutsideRef value);

} // OutsideRef
