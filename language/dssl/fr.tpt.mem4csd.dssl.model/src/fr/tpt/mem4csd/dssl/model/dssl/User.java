/**
 */
package fr.tpt.mem4csd.dssl.model.dssl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.mem4csd.dssl.model.dssl.User#getUses <em>Uses</em>}</li>
 *   <li>{@link fr.tpt.mem4csd.dssl.model.dssl.User#getAgeMin <em>Age Min</em>}</li>
 *   <li>{@link fr.tpt.mem4csd.dssl.model.dssl.User#getAgeMax <em>Age Max</em>}</li>
 *   <li>{@link fr.tpt.mem4csd.dssl.model.dssl.User#getPerception <em>Perception</em>}</li>
 *   <li>{@link fr.tpt.mem4csd.dssl.model.dssl.User#getSpokenLanguages <em>Spoken Languages</em>}</li>
 * </ul>
 *
 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslPackage#getUser()
 * @model
 * @generated
 */
public interface User extends EntityType {
	/**
	 * Returns the value of the '<em><b>Uses</b></em>' reference list.
	 * The list contents are of type {@link fr.tpt.mem4csd.dssl.model.dssl.Tool}.
	 * It is bidirectional and its opposite is '{@link fr.tpt.mem4csd.dssl.model.dssl.Tool#getUsedBy <em>Used By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' reference list.
	 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslPackage#getUser_Uses()
	 * @see fr.tpt.mem4csd.dssl.model.dssl.Tool#getUsedBy
	 * @model opposite="usedBy" required="true"
	 * @generated
	 */
	EList<Tool> getUses();

	/**
	 * Returns the value of the '<em><b>Age Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Age Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age Min</em>' attribute.
	 * @see #setAgeMin(int)
	 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslPackage#getUser_AgeMin()
	 * @model required="true"
	 * @generated
	 */
	int getAgeMin();

	/**
	 * Sets the value of the '{@link fr.tpt.mem4csd.dssl.model.dssl.User#getAgeMin <em>Age Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age Min</em>' attribute.
	 * @see #getAgeMin()
	 * @generated
	 */
	void setAgeMin(int value);

	/**
	 * Returns the value of the '<em><b>Age Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Age Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age Max</em>' attribute.
	 * @see #setAgeMax(int)
	 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslPackage#getUser_AgeMax()
	 * @model required="true"
	 * @generated
	 */
	int getAgeMax();

	/**
	 * Sets the value of the '{@link fr.tpt.mem4csd.dssl.model.dssl.User#getAgeMax <em>Age Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age Max</em>' attribute.
	 * @see #getAgeMax()
	 * @generated
	 */
	void setAgeMax(int value);

	/**
	 * Returns the value of the '<em><b>Perception</b></em>' reference list.
	 * The list contents are of type {@link fr.tpt.mem4csd.dssl.model.dssl.PhysicalSystem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Perception</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perception</em>' reference list.
	 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslPackage#getUser_Perception()
	 * @model
	 * @generated
	 */
	EList<PhysicalSystem> getPerception();

	/**
	 * Returns the value of the '<em><b>Spoken Languages</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spoken Languages</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spoken Languages</em>' attribute list.
	 * @see fr.tpt.mem4csd.dssl.model.dssl.DsslPackage#getUser_SpokenLanguages()
	 * @model
	 * @generated
	 */
	EList<String> getSpokenLanguages();

} // User
