/**
 */
package pt.fct.unl.novalincs.useme.model.ContextModeling.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pt.fct.unl.novalincs.useme.model.ContextModeling.ContextEnvironment;
import pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModel;
import pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage;
import pt.fct.unl.novalincs.useme.model.ContextModeling.UserHierarchy;
import pt.fct.unl.novalincs.useme.model.ContextModeling.Workflow;

import pt.fct.unl.novalincs.useme.model.Utility.DSL;
import pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextModelImpl#getCmName <em>Cm Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextModelImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextModelImpl#getContextEnvironment <em>Context Environment</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextModelImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextModelImpl#getWorkflow <em>Workflow</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextModelImpl#getUserHierarchy <em>User Hierarchy</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextModelImpl#getContextProvider <em>Context Provider</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextModelImpl extends MinimalEObjectImpl.Container implements ContextModel {
	/**
	 * The default value of the '{@link #getCmName() <em>Cm Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCmName()
	 * @generated
	 * @ordered
	 */
	protected static final String CM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCmName() <em>Cm Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCmName()
	 * @generated
	 * @ordered
	 */
	protected String cmName = CM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDomain() <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected String domain = DOMAIN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContextEnvironment() <em>Context Environment</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextEnvironment()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextEnvironment> contextEnvironment;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected DSL language;

	/**
	 * The cached value of the '{@link #getWorkflow() <em>Workflow</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkflow()
	 * @generated
	 * @ordered
	 */
	protected EList<Workflow> workflow;

	/**
	 * The cached value of the '{@link #getUserHierarchy() <em>User Hierarchy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserHierarchy()
	 * @generated
	 * @ordered
	 */
	protected UserHierarchy userHierarchy;

	/**
	 * The cached value of the '{@link #getContextProvider() <em>Context Provider</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextProvider()
	 * @generated
	 * @ordered
	 */
	protected EList<String> contextProvider;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextModelingPackage.Literals.CONTEXT_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCmName() {
		return cmName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCmName(String newCmName) {
		String oldCmName = cmName;
		cmName = newCmName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextModelingPackage.CONTEXT_MODEL__CM_NAME, oldCmName, cmName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(String newDomain) {
		String oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextModelingPackage.CONTEXT_MODEL__DOMAIN, oldDomain, domain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContextEnvironment> getContextEnvironment() {
		if (contextEnvironment == null) {
			contextEnvironment = new EObjectWithInverseResolvingEList.ManyInverse<ContextEnvironment>(ContextEnvironment.class, this, ContextModelingPackage.CONTEXT_MODEL__CONTEXT_ENVIRONMENT, ContextModelingPackage.CONTEXT_ENVIRONMENT__CONTEXT_MODEL);
		}
		return contextEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSL getLanguage() {
		if (language != null && language.eIsProxy()) {
			InternalEObject oldLanguage = (InternalEObject)language;
			language = (DSL)eResolveProxy(oldLanguage);
			if (language != oldLanguage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContextModelingPackage.CONTEXT_MODEL__LANGUAGE, oldLanguage, language));
			}
		}
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSL basicGetLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLanguage(DSL newLanguage, NotificationChain msgs) {
		DSL oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContextModelingPackage.CONTEXT_MODEL__LANGUAGE, oldLanguage, newLanguage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(DSL newLanguage) {
		if (newLanguage != language) {
			NotificationChain msgs = null;
			if (language != null)
				msgs = ((InternalEObject)language).eInverseRemove(this, UtilityPackage.DSL__CONTEXT_MODEL, DSL.class, msgs);
			if (newLanguage != null)
				msgs = ((InternalEObject)newLanguage).eInverseAdd(this, UtilityPackage.DSL__CONTEXT_MODEL, DSL.class, msgs);
			msgs = basicSetLanguage(newLanguage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextModelingPackage.CONTEXT_MODEL__LANGUAGE, newLanguage, newLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Workflow> getWorkflow() {
		if (workflow == null) {
			workflow = new EObjectWithInverseResolvingEList.ManyInverse<Workflow>(Workflow.class, this, ContextModelingPackage.CONTEXT_MODEL__WORKFLOW, ContextModelingPackage.WORKFLOW__CONTEXT_MODEL);
		}
		return workflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserHierarchy getUserHierarchy() {
		return userHierarchy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserHierarchy(UserHierarchy newUserHierarchy, NotificationChain msgs) {
		UserHierarchy oldUserHierarchy = userHierarchy;
		userHierarchy = newUserHierarchy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContextModelingPackage.CONTEXT_MODEL__USER_HIERARCHY, oldUserHierarchy, newUserHierarchy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserHierarchy(UserHierarchy newUserHierarchy) {
		if (newUserHierarchy != userHierarchy) {
			NotificationChain msgs = null;
			if (userHierarchy != null)
				msgs = ((InternalEObject)userHierarchy).eInverseRemove(this, ContextModelingPackage.USER_HIERARCHY__CONTEXT_MODEL, UserHierarchy.class, msgs);
			if (newUserHierarchy != null)
				msgs = ((InternalEObject)newUserHierarchy).eInverseAdd(this, ContextModelingPackage.USER_HIERARCHY__CONTEXT_MODEL, UserHierarchy.class, msgs);
			msgs = basicSetUserHierarchy(newUserHierarchy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextModelingPackage.CONTEXT_MODEL__USER_HIERARCHY, newUserHierarchy, newUserHierarchy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getContextProvider() {
		if (contextProvider == null) {
			contextProvider = new EDataTypeUniqueEList<String>(String.class, this, ContextModelingPackage.CONTEXT_MODEL__CONTEXT_PROVIDER);
		}
		return contextProvider;
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
			case ContextModelingPackage.CONTEXT_MODEL__CONTEXT_ENVIRONMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContextEnvironment()).basicAdd(otherEnd, msgs);
			case ContextModelingPackage.CONTEXT_MODEL__LANGUAGE:
				if (language != null)
					msgs = ((InternalEObject)language).eInverseRemove(this, UtilityPackage.DSL__CONTEXT_MODEL, DSL.class, msgs);
				return basicSetLanguage((DSL)otherEnd, msgs);
			case ContextModelingPackage.CONTEXT_MODEL__WORKFLOW:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorkflow()).basicAdd(otherEnd, msgs);
			case ContextModelingPackage.CONTEXT_MODEL__USER_HIERARCHY:
				if (userHierarchy != null)
					msgs = ((InternalEObject)userHierarchy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContextModelingPackage.CONTEXT_MODEL__USER_HIERARCHY, null, msgs);
				return basicSetUserHierarchy((UserHierarchy)otherEnd, msgs);
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
			case ContextModelingPackage.CONTEXT_MODEL__CONTEXT_ENVIRONMENT:
				return ((InternalEList<?>)getContextEnvironment()).basicRemove(otherEnd, msgs);
			case ContextModelingPackage.CONTEXT_MODEL__LANGUAGE:
				return basicSetLanguage(null, msgs);
			case ContextModelingPackage.CONTEXT_MODEL__WORKFLOW:
				return ((InternalEList<?>)getWorkflow()).basicRemove(otherEnd, msgs);
			case ContextModelingPackage.CONTEXT_MODEL__USER_HIERARCHY:
				return basicSetUserHierarchy(null, msgs);
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
			case ContextModelingPackage.CONTEXT_MODEL__CM_NAME:
				return getCmName();
			case ContextModelingPackage.CONTEXT_MODEL__DOMAIN:
				return getDomain();
			case ContextModelingPackage.CONTEXT_MODEL__CONTEXT_ENVIRONMENT:
				return getContextEnvironment();
			case ContextModelingPackage.CONTEXT_MODEL__LANGUAGE:
				if (resolve) return getLanguage();
				return basicGetLanguage();
			case ContextModelingPackage.CONTEXT_MODEL__WORKFLOW:
				return getWorkflow();
			case ContextModelingPackage.CONTEXT_MODEL__USER_HIERARCHY:
				return getUserHierarchy();
			case ContextModelingPackage.CONTEXT_MODEL__CONTEXT_PROVIDER:
				return getContextProvider();
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
			case ContextModelingPackage.CONTEXT_MODEL__CM_NAME:
				setCmName((String)newValue);
				return;
			case ContextModelingPackage.CONTEXT_MODEL__DOMAIN:
				setDomain((String)newValue);
				return;
			case ContextModelingPackage.CONTEXT_MODEL__CONTEXT_ENVIRONMENT:
				getContextEnvironment().clear();
				getContextEnvironment().addAll((Collection<? extends ContextEnvironment>)newValue);
				return;
			case ContextModelingPackage.CONTEXT_MODEL__LANGUAGE:
				setLanguage((DSL)newValue);
				return;
			case ContextModelingPackage.CONTEXT_MODEL__WORKFLOW:
				getWorkflow().clear();
				getWorkflow().addAll((Collection<? extends Workflow>)newValue);
				return;
			case ContextModelingPackage.CONTEXT_MODEL__USER_HIERARCHY:
				setUserHierarchy((UserHierarchy)newValue);
				return;
			case ContextModelingPackage.CONTEXT_MODEL__CONTEXT_PROVIDER:
				getContextProvider().clear();
				getContextProvider().addAll((Collection<? extends String>)newValue);
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
			case ContextModelingPackage.CONTEXT_MODEL__CM_NAME:
				setCmName(CM_NAME_EDEFAULT);
				return;
			case ContextModelingPackage.CONTEXT_MODEL__DOMAIN:
				setDomain(DOMAIN_EDEFAULT);
				return;
			case ContextModelingPackage.CONTEXT_MODEL__CONTEXT_ENVIRONMENT:
				getContextEnvironment().clear();
				return;
			case ContextModelingPackage.CONTEXT_MODEL__LANGUAGE:
				setLanguage((DSL)null);
				return;
			case ContextModelingPackage.CONTEXT_MODEL__WORKFLOW:
				getWorkflow().clear();
				return;
			case ContextModelingPackage.CONTEXT_MODEL__USER_HIERARCHY:
				setUserHierarchy((UserHierarchy)null);
				return;
			case ContextModelingPackage.CONTEXT_MODEL__CONTEXT_PROVIDER:
				getContextProvider().clear();
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
			case ContextModelingPackage.CONTEXT_MODEL__CM_NAME:
				return CM_NAME_EDEFAULT == null ? cmName != null : !CM_NAME_EDEFAULT.equals(cmName);
			case ContextModelingPackage.CONTEXT_MODEL__DOMAIN:
				return DOMAIN_EDEFAULT == null ? domain != null : !DOMAIN_EDEFAULT.equals(domain);
			case ContextModelingPackage.CONTEXT_MODEL__CONTEXT_ENVIRONMENT:
				return contextEnvironment != null && !contextEnvironment.isEmpty();
			case ContextModelingPackage.CONTEXT_MODEL__LANGUAGE:
				return language != null;
			case ContextModelingPackage.CONTEXT_MODEL__WORKFLOW:
				return workflow != null && !workflow.isEmpty();
			case ContextModelingPackage.CONTEXT_MODEL__USER_HIERARCHY:
				return userHierarchy != null;
			case ContextModelingPackage.CONTEXT_MODEL__CONTEXT_PROVIDER:
				return contextProvider != null && !contextProvider.isEmpty();
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
		result.append(" (cmName: ");
		result.append(cmName);
		result.append(", domain: ");
		result.append(domain);
		result.append(", contextProvider: ");
		result.append(contextProvider);
		result.append(')');
		return result.toString();
	}

} //ContextModelImpl
