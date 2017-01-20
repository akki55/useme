/**
 */
package fr.tpt.useme.architecture.model.usemearch.impl;

import fr.tpt.useme.architecture.model.usemearch.ContextSpecification;
import fr.tpt.useme.architecture.model.usemearch.Dsl;
import fr.tpt.useme.architecture.model.usemearch.DslDevelopmentSpecification;
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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dsl Development Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.DslDevelopmentSpecificationImpl#getOwnedDsls <em>Owned Dsls</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.DslDevelopmentSpecificationImpl#getOwnedTools <em>Owned Tools</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.DslDevelopmentSpecificationImpl#getDevelopedDsl <em>Developed Dsl</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.DslDevelopmentSpecificationImpl#getOwnedContexts <em>Owned Contexts</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.DslDevelopmentSpecificationImpl#getOwnedUsers <em>Owned Users</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DslDevelopmentSpecificationImpl extends IdentifiedElementImpl implements DslDevelopmentSpecification {
	/**
	 * The cached value of the '{@link #getOwnedDsls() <em>Owned Dsls</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedDsls()
	 * @generated
	 * @ordered
	 */
	protected EList<Dsl> ownedDsls;

	/**
	 * The cached value of the '{@link #getOwnedTools() <em>Owned Tools</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTools()
	 * @generated
	 * @ordered
	 */
	protected EList<Tool> ownedTools;

	/**
	 * The cached value of the '{@link #getDevelopedDsl() <em>Developed Dsl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevelopedDsl()
	 * @generated
	 * @ordered
	 */
	protected Dsl developedDsl;

	/**
	 * The cached value of the '{@link #getOwnedContexts() <em>Owned Contexts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextSpecification> ownedContexts;

	/**
	 * The cached value of the '{@link #getOwnedUsers() <em>Owned Users</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedUsers()
	 * @generated
	 * @ordered
	 */
	protected EList<User> ownedUsers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DslDevelopmentSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsemearchPackage.Literals.DSL_DEVELOPMENT_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dsl> getOwnedDsls() {
		if (ownedDsls == null) {
			ownedDsls = new EObjectContainmentEList<Dsl>(Dsl.class, this, UsemearchPackage.DSL_DEVELOPMENT_SPECIFICATION__OWNED_DSLS);
		}
		return ownedDsls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tool> getOwnedTools() {
		if (ownedTools == null) {
			ownedTools = new EObjectContainmentEList<Tool>(Tool.class, this, UsemearchPackage.DSL_DEVELOPMENT_SPECIFICATION__OWNED_TOOLS);
		}
		return ownedTools;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dsl getDevelopedDsl() {
		if (developedDsl != null && developedDsl.eIsProxy()) {
			InternalEObject oldDevelopedDsl = (InternalEObject)developedDsl;
			developedDsl = (Dsl)eResolveProxy(oldDevelopedDsl);
			if (developedDsl != oldDevelopedDsl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UsemearchPackage.DSL_DEVELOPMENT_SPECIFICATION__DEVELOPED_DSL, oldDevelopedDsl, developedDsl));
			}
		}
		return developedDsl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dsl basicGetDevelopedDsl() {
		return developedDsl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevelopedDsl(Dsl newDevelopedDsl) {
		Dsl oldDevelopedDsl = developedDsl;
		developedDsl = newDevelopedDsl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsemearchPackage.DSL_DEVELOPMENT_SPECIFICATION__DEVELOPED_DSL, oldDevelopedDsl, developedDsl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContextSpecification> getOwnedContexts() {
		if (ownedContexts == null) {
			ownedContexts = new EObjectContainmentEList<ContextSpecification>(ContextSpecification.class, this, UsemearchPackage.DSL_DEVELOPMENT_SPECIFICATION__OWNED_CONTEXTS);
		}
		return ownedContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getOwnedUsers() {
		if (ownedUsers == null) {
			ownedUsers = new EObjectContainmentEList<User>(User.class, this, UsemearchPackage.DSL_DEVELOPMENT_SPECIFICATION__OWNED_USERS);
		}
		return ownedUsers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UsemearchPackage.DSL_DEVELOPMENT_SPECIFICATION__OWNED_DSLS:
				return ((InternalEList<?>)getOwnedDsls()).basicRemove(otherEnd, msgs);
			case UsemearchPackage.DSL_DEVELOPMENT_SPECIFICATION__OWNED_TOOLS:
				return ((InternalEList<?>)getOwnedTools()).basicRemove(otherEnd, msgs);
			case UsemearchPackage.DSL_DEVELOPMENT_SPECIFICATION__OWNED_CONTEXTS:
				return ((InternalEList<?>)getOwnedContexts()).basicRemove(otherEnd, msgs);
			case UsemearchPackage.DSL_DEVELOPMENT_SPECIFICATION__OWNED_USERS:
				return ((InternalEList<?>)getOwnedUsers()).basicRemove(otherEnd, msgs);
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
			case UsemearchPackage.DSL_DEVELOPMENT_SPECIFICATION__OWNED_DSLS:
				return getOwnedDsls();
			case UsemearchPackage.DSL_DEVELOPMENT_SPECIFICATION__OWNED_TOOLS:
				return getOwnedTools();
			case UsemearchPackage.DSL_DEVELOPMENT_SPECIFICATION__DEVELOPED_DSL:
				if (resolve) return getDevelopedDsl();
				return basicGetDevelopedDsl();
			case UsemearchPackage.DSL_DEVELOPMENT_SPECIFICATION__OWNED_CONTEXTS:
				return getOwnedContexts();
			case UsemearchPackage.DSL_DEVELOPMENT_SPECIFICATION__OWNED_USERS:
				return getOwnedUsers();
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
			case UsemearchPackage.DSL_DEVELOPMENT_SPECIFICATION__OWNED_DSLS:
				getOwnedDsls().clear();
				getOwnedDsls().addAll((Collection<? extends Dsl>)newValue);
				return;
			case UsemearchPackage.DSL_DEVELOPMENT_SPECIFICATION__OWNED_TOOLS:
				getOwnedTools().clear();
				getOwnedTools().addAll((Collection<? extends Tool>)newValue);
				return;
			case UsemearchPackage.DSL_DEVELOPMENT_SPECIFICATION__DEVELOPED_DSL:
				setDevelopedDsl((Dsl)newValue);
				return;
			case UsemearchPackage.DSL_DEVELOPMENT_SPECIFICATION__OWNED_CONTEXTS:
				getOwnedContexts().clear();
				getOwnedContexts().addAll((Collection<? extends ContextSpecification>)newValue);
				return;
			case UsemearchPackage.DSL_DEVELOPMENT_SPECIFICATION__OWNED_USERS:
				getOwnedUsers().clear();
				getOwnedUsers().addAll((Collection<? extends User>)newValue);
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
			case UsemearchPackage.DSL_DEVELOPMENT_SPECIFICATION__OWNED_DSLS:
				getOwnedDsls().clear();
				return;
			case UsemearchPackage.DSL_DEVELOPMENT_SPECIFICATION__OWNED_TOOLS:
				getOwnedTools().clear();
				return;
			case UsemearchPackage.DSL_DEVELOPMENT_SPECIFICATION__DEVELOPED_DSL:
				setDevelopedDsl((Dsl)null);
				return;
			case UsemearchPackage.DSL_DEVELOPMENT_SPECIFICATION__OWNED_CONTEXTS:
				getOwnedContexts().clear();
				return;
			case UsemearchPackage.DSL_DEVELOPMENT_SPECIFICATION__OWNED_USERS:
				getOwnedUsers().clear();
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
			case UsemearchPackage.DSL_DEVELOPMENT_SPECIFICATION__OWNED_DSLS:
				return ownedDsls != null && !ownedDsls.isEmpty();
			case UsemearchPackage.DSL_DEVELOPMENT_SPECIFICATION__OWNED_TOOLS:
				return ownedTools != null && !ownedTools.isEmpty();
			case UsemearchPackage.DSL_DEVELOPMENT_SPECIFICATION__DEVELOPED_DSL:
				return developedDsl != null;
			case UsemearchPackage.DSL_DEVELOPMENT_SPECIFICATION__OWNED_CONTEXTS:
				return ownedContexts != null && !ownedContexts.isEmpty();
			case UsemearchPackage.DSL_DEVELOPMENT_SPECIFICATION__OWNED_USERS:
				return ownedUsers != null && !ownedUsers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DslDevelopmentSpecificationImpl
