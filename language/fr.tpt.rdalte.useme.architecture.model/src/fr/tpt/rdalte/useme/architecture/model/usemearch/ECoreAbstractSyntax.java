/**
 */
package fr.tpt.rdalte.useme.architecture.model.usemearch;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ECore Abstract Syntax</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.rdalte.useme.architecture.model.usemearch.ECoreAbstractSyntax#getPackages <em>Packages</em>}</li>
 * </ul>
 *
 * @see fr.tpt.rdalte.useme.architecture.model.usemearch.UsemearchPackage#getECoreAbstractSyntax()
 * @model
 * @generated
 */
public interface ECoreAbstractSyntax extends AbstractSyntax {
	/**
	 * Returns the value of the '<em><b>Packages</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' reference list.
	 * @see fr.tpt.rdalte.useme.architecture.model.usemearch.UsemearchPackage#getECoreAbstractSyntax_Packages()
	 * @model required="true"
	 * @generated
	 */
	EList<EPackage> getPackages();

} // ECoreAbstractSyntax
