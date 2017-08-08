/**
 */
package fr.tpt.mem4csd.dssl.model.dssl;

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
 *   <li>{@link fr.tpt.mem4csd.dssl.model.dssl.ECoreAbstractSyntax#getPackages <em>Packages</em>}</li>
 * </ul>
 *
 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslPackage#getECoreAbstractSyntax()
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
	 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslPackage#getECoreAbstractSyntax_Packages()
	 * @model required="true"
	 * @generated
	 */
	EList<EPackage> getPackages();

} // ECoreAbstractSyntax
