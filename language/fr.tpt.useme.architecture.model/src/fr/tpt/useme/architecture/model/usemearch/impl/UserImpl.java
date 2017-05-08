/**
 */
package fr.tpt.useme.architecture.model.usemearch.impl;

import fr.tpt.useme.architecture.model.usemearch.Tool;
import fr.tpt.useme.architecture.model.usemearch.UsemearchPackage;
import fr.tpt.useme.architecture.model.usemearch.User;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
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
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.UserImpl#getUses <em>Uses</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.UserImpl#getAgeMin <em>Age Min</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.UserImpl#getAgeMax <em>Age Max</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserImpl extends ContextElementTypeImpl implements User {
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
		return UsemearchPackage.Literals.USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tool> getUses() {
		if (uses == null) {
			uses = new EObjectWithInverseResolvingEList.ManyInverse<Tool>(Tool.class, this, UsemearchPackage.USER__USES, UsemearchPackage.TOOL__USED_BY);
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
			eNotify(new ENotificationImpl(this, Notification.SET, UsemearchPackage.USER__AGE_MIN, oldAgeMin, ageMin));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UsemearchPackage.USER__AGE_MAX, oldAgeMax, ageMax));
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
			case UsemearchPackage.USER__USES:
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
			case UsemearchPackage.USER__USES:
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
			case UsemearchPackage.USER__USES:
				return getUses();
			case UsemearchPackage.USER__AGE_MIN:
				return getAgeMin();
			case UsemearchPackage.USER__AGE_MAX:
				return getAgeMax();
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
			case UsemearchPackage.USER__USES:
				getUses().clear();
				getUses().addAll((Collection<? extends Tool>)newValue);
				return;
			case UsemearchPackage.USER__AGE_MIN:
				setAgeMin((Integer)newValue);
				return;
			case UsemearchPackage.USER__AGE_MAX:
				setAgeMax((Integer)newValue);
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
			case UsemearchPackage.USER__USES:
				getUses().clear();
				return;
			case UsemearchPackage.USER__AGE_MIN:
				setAgeMin(AGE_MIN_EDEFAULT);
				return;
			case UsemearchPackage.USER__AGE_MAX:
				setAgeMax(AGE_MAX_EDEFAULT);
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
			case UsemearchPackage.USER__USES:
				return uses != null && !uses.isEmpty();
			case UsemearchPackage.USER__AGE_MIN:
				return ageMin != AGE_MIN_EDEFAULT;
			case UsemearchPackage.USER__AGE_MAX:
				return ageMax != AGE_MAX_EDEFAULT;
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
		result.append(')');
		return result.toString();
	}

} //UserImpl
