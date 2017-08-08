/**
 */
package fr.tpt.mem4csd.dssl.model.dssl.impl;

import fr.tpt.mem4csd.dssl.model.dssl.DsslPackage;
import fr.tpt.mem4csd.dssl.model.dssl.PhysicalSystem;
import fr.tpt.mem4csd.dssl.model.dssl.Tool;
import fr.tpt.mem4csd.dssl.model.dssl.User;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.mem4csd.dssl.model.dssl.impl.UserImpl#getUses <em>Uses</em>}</li>
 *   <li>{@link fr.tpt.mem4csd.dssl.model.dssl.impl.UserImpl#getAgeMin <em>Age Min</em>}</li>
 *   <li>{@link fr.tpt.mem4csd.dssl.model.dssl.impl.UserImpl#getAgeMax <em>Age Max</em>}</li>
 *   <li>{@link fr.tpt.mem4csd.dssl.model.dssl.impl.UserImpl#getPerception <em>Perception</em>}</li>
 *   <li>{@link fr.tpt.mem4csd.dssl.model.dssl.impl.UserImpl#getSpokenLanguages <em>Spoken Languages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserImpl extends EntityTypeImpl implements User {
	/**
	 * The cached value of the '{@link #getUses() <em>Uses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUses()
	 * @generated
	 * @ordered
	 */
	protected EList<Tool> uses;

	/**
	 * The default value of the '{@link #getAgeMin() <em>Age Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgeMin()
	 * @generated
	 * @ordered
	 */
	protected static final int AGE_MIN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAgeMin() <em>Age Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgeMin()
	 * @generated
	 * @ordered
	 */
	protected int ageMin = AGE_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getAgeMax() <em>Age Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgeMax()
	 * @generated
	 * @ordered
	 */
	protected static final int AGE_MAX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAgeMax() <em>Age Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgeMax()
	 * @generated
	 * @ordered
	 */
	protected int ageMax = AGE_MAX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPerception() <em>Perception</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerception()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalSystem> perception;

	/**
	 * The cached value of the '{@link #getSpokenLanguages() <em>Spoken Languages</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpokenLanguages()
	 * @generated
	 * @ordered
	 */
	protected EList<String> spokenLanguages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsslPackage.Literals.USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tool> getUses() {
		if (uses == null) {
			uses = new EObjectWithInverseResolvingEList.ManyInverse<Tool>(Tool.class, this, DsslPackage.USER__USES, DsslPackage.TOOL__USED_BY);
		}
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAgeMin() {
		return ageMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgeMin(int newAgeMin) {
		int oldAgeMin = ageMin;
		ageMin = newAgeMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsslPackage.USER__AGE_MIN, oldAgeMin, ageMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAgeMax() {
		return ageMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgeMax(int newAgeMax) {
		int oldAgeMax = ageMax;
		ageMax = newAgeMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsslPackage.USER__AGE_MAX, oldAgeMax, ageMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalSystem> getPerception() {
		if (perception == null) {
			perception = new EObjectResolvingEList<PhysicalSystem>(PhysicalSystem.class, this, DsslPackage.USER__PERCEPTION);
		}
		return perception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSpokenLanguages() {
		if (spokenLanguages == null) {
			spokenLanguages = new EDataTypeUniqueEList<String>(String.class, this, DsslPackage.USER__SPOKEN_LANGUAGES);
		}
		return spokenLanguages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DsslPackage.USER__USES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUses()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DsslPackage.USER__USES:
				return ((InternalEList<?>)getUses()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DsslPackage.USER__USES:
				return getUses();
			case DsslPackage.USER__AGE_MIN:
				return getAgeMin();
			case DsslPackage.USER__AGE_MAX:
				return getAgeMax();
			case DsslPackage.USER__PERCEPTION:
				return getPerception();
			case DsslPackage.USER__SPOKEN_LANGUAGES:
				return getSpokenLanguages();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DsslPackage.USER__USES:
				getUses().clear();
				getUses().addAll((Collection<? extends Tool>)newValue);
				return;
			case DsslPackage.USER__AGE_MIN:
				setAgeMin((Integer)newValue);
				return;
			case DsslPackage.USER__AGE_MAX:
				setAgeMax((Integer)newValue);
				return;
			case DsslPackage.USER__PERCEPTION:
				getPerception().clear();
				getPerception().addAll((Collection<? extends PhysicalSystem>)newValue);
				return;
			case DsslPackage.USER__SPOKEN_LANGUAGES:
				getSpokenLanguages().clear();
				getSpokenLanguages().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DsslPackage.USER__USES:
				getUses().clear();
				return;
			case DsslPackage.USER__AGE_MIN:
				setAgeMin(AGE_MIN_EDEFAULT);
				return;
			case DsslPackage.USER__AGE_MAX:
				setAgeMax(AGE_MAX_EDEFAULT);
				return;
			case DsslPackage.USER__PERCEPTION:
				getPerception().clear();
				return;
			case DsslPackage.USER__SPOKEN_LANGUAGES:
				getSpokenLanguages().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DsslPackage.USER__USES:
				return uses != null && !uses.isEmpty();
			case DsslPackage.USER__AGE_MIN:
				return ageMin != AGE_MIN_EDEFAULT;
			case DsslPackage.USER__AGE_MAX:
				return ageMax != AGE_MAX_EDEFAULT;
			case DsslPackage.USER__PERCEPTION:
				return perception != null && !perception.isEmpty();
			case DsslPackage.USER__SPOKEN_LANGUAGES:
				return spokenLanguages != null && !spokenLanguages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ageMin: ");
		result.append(ageMin);
		result.append(", ageMax: ");
		result.append(ageMax);
		result.append(", spokenLanguages: ");
		result.append(spokenLanguages);
		result.append(')');
		return result.toString();
	}

} //UserImpl
