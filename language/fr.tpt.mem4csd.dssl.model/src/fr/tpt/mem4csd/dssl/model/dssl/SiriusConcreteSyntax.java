/**
 */
package fr.tpt.mem4csd.dssl.model.dssl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.sirius.viewpoint.description.Group;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sirius Concrete Syntax</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.mem4csd.dssl.model.dssl.SiriusConcreteSyntax#getSiriusSpecification <em>Sirius Specification</em>}</li>
 * </ul>
 *
 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslPackage#getSiriusConcreteSyntax()
 * @model
 * @generated
 */
public interface SiriusConcreteSyntax extends ConcreteSyntax {
	/**
	 * Returns the value of the '<em><b>Sirius Specification</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.viewpoint.description.Group}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sirius Specification</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sirius Specification</em>' reference list.
	 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslPackage#getSiriusConcreteSyntax_SiriusSpecification()
	 * @model required="true"
	 * @generated
	 */
	EList<Group> getSiriusSpecification();

} // SiriusConcreteSyntax
