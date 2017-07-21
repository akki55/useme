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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage;
import pt.fct.unl.novalincs.useme.model.ContextModeling.EnviromentSpecification;
import pt.fct.unl.novalincs.useme.model.ContextModeling.PhysicalEnvironment;
import pt.fct.unl.novalincs.useme.model.ContextModeling.SocialEnvironment;
import pt.fct.unl.novalincs.useme.model.ContextModeling.TechnicalEnvironment;

import pt.fct.unl.novalincs.useme.model.Utility.CEVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enviroment Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.EnviromentSpecificationImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.EnviromentSpecificationImpl#getTechnicalEnvironment <em>Technical Environment</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.EnviromentSpecificationImpl#getPhysicalEnvironment <em>Physical Environment</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.EnviromentSpecificationImpl#getSocialEnvironment <em>Social Environment</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.EnviromentSpecificationImpl#getEnviromentalVariable <em>Enviromental Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnviromentSpecificationImpl extends MinimalEObjectImpl.Container implements EnviromentSpecification {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTechnicalEnvironment() <em>Technical Environment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnicalEnvironment()
	 * @generated
	 * @ordered
	 */
	protected EList<TechnicalEnvironment> technicalEnvironment;

	/**
	 * The cached value of the '{@link #getPhysicalEnvironment() <em>Physical Environment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalEnvironment()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalEnvironment> physicalEnvironment;

	/**
	 * The cached value of the '{@link #getSocialEnvironment() <em>Social Environment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialEnvironment()
	 * @generated
	 * @ordered
	 */
	protected EList<SocialEnvironment> socialEnvironment;

	/**
	 * The cached value of the '{@link #getEnviromentalVariable() <em>Enviromental Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnviromentalVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<CEVariable> enviromentalVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnviromentSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextModelingPackage.Literals.ENVIROMENT_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextModelingPackage.ENVIROMENT_SPECIFICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TechnicalEnvironment> getTechnicalEnvironment() {
		if (technicalEnvironment == null) {
			technicalEnvironment = new EObjectContainmentEList<TechnicalEnvironment>(TechnicalEnvironment.class, this, ContextModelingPackage.ENVIROMENT_SPECIFICATION__TECHNICAL_ENVIRONMENT);
		}
		return technicalEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalEnvironment> getPhysicalEnvironment() {
		if (physicalEnvironment == null) {
			physicalEnvironment = new EObjectContainmentEList<PhysicalEnvironment>(PhysicalEnvironment.class, this, ContextModelingPackage.ENVIROMENT_SPECIFICATION__PHYSICAL_ENVIRONMENT);
		}
		return physicalEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SocialEnvironment> getSocialEnvironment() {
		if (socialEnvironment == null) {
			socialEnvironment = new EObjectContainmentEList<SocialEnvironment>(SocialEnvironment.class, this, ContextModelingPackage.ENVIROMENT_SPECIFICATION__SOCIAL_ENVIRONMENT);
		}
		return socialEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CEVariable> getEnviromentalVariable() {
		if (enviromentalVariable == null) {
			enviromentalVariable = new EObjectContainmentEList<CEVariable>(CEVariable.class, this, ContextModelingPackage.ENVIROMENT_SPECIFICATION__ENVIROMENTAL_VARIABLE);
		}
		return enviromentalVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContextModelingPackage.ENVIROMENT_SPECIFICATION__TECHNICAL_ENVIRONMENT:
				return ((InternalEList<?>)getTechnicalEnvironment()).basicRemove(otherEnd, msgs);
			case ContextModelingPackage.ENVIROMENT_SPECIFICATION__PHYSICAL_ENVIRONMENT:
				return ((InternalEList<?>)getPhysicalEnvironment()).basicRemove(otherEnd, msgs);
			case ContextModelingPackage.ENVIROMENT_SPECIFICATION__SOCIAL_ENVIRONMENT:
				return ((InternalEList<?>)getSocialEnvironment()).basicRemove(otherEnd, msgs);
			case ContextModelingPackage.ENVIROMENT_SPECIFICATION__ENVIROMENTAL_VARIABLE:
				return ((InternalEList<?>)getEnviromentalVariable()).basicRemove(otherEnd, msgs);
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
			case ContextModelingPackage.ENVIROMENT_SPECIFICATION__NAME:
				return getName();
			case ContextModelingPackage.ENVIROMENT_SPECIFICATION__TECHNICAL_ENVIRONMENT:
				return getTechnicalEnvironment();
			case ContextModelingPackage.ENVIROMENT_SPECIFICATION__PHYSICAL_ENVIRONMENT:
				return getPhysicalEnvironment();
			case ContextModelingPackage.ENVIROMENT_SPECIFICATION__SOCIAL_ENVIRONMENT:
				return getSocialEnvironment();
			case ContextModelingPackage.ENVIROMENT_SPECIFICATION__ENVIROMENTAL_VARIABLE:
				return getEnviromentalVariable();
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
			case ContextModelingPackage.ENVIROMENT_SPECIFICATION__NAME:
				setName((String)newValue);
				return;
			case ContextModelingPackage.ENVIROMENT_SPECIFICATION__TECHNICAL_ENVIRONMENT:
				getTechnicalEnvironment().clear();
				getTechnicalEnvironment().addAll((Collection<? extends TechnicalEnvironment>)newValue);
				return;
			case ContextModelingPackage.ENVIROMENT_SPECIFICATION__PHYSICAL_ENVIRONMENT:
				getPhysicalEnvironment().clear();
				getPhysicalEnvironment().addAll((Collection<? extends PhysicalEnvironment>)newValue);
				return;
			case ContextModelingPackage.ENVIROMENT_SPECIFICATION__SOCIAL_ENVIRONMENT:
				getSocialEnvironment().clear();
				getSocialEnvironment().addAll((Collection<? extends SocialEnvironment>)newValue);
				return;
			case ContextModelingPackage.ENVIROMENT_SPECIFICATION__ENVIROMENTAL_VARIABLE:
				getEnviromentalVariable().clear();
				getEnviromentalVariable().addAll((Collection<? extends CEVariable>)newValue);
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
			case ContextModelingPackage.ENVIROMENT_SPECIFICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ContextModelingPackage.ENVIROMENT_SPECIFICATION__TECHNICAL_ENVIRONMENT:
				getTechnicalEnvironment().clear();
				return;
			case ContextModelingPackage.ENVIROMENT_SPECIFICATION__PHYSICAL_ENVIRONMENT:
				getPhysicalEnvironment().clear();
				return;
			case ContextModelingPackage.ENVIROMENT_SPECIFICATION__SOCIAL_ENVIRONMENT:
				getSocialEnvironment().clear();
				return;
			case ContextModelingPackage.ENVIROMENT_SPECIFICATION__ENVIROMENTAL_VARIABLE:
				getEnviromentalVariable().clear();
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
			case ContextModelingPackage.ENVIROMENT_SPECIFICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ContextModelingPackage.ENVIROMENT_SPECIFICATION__TECHNICAL_ENVIRONMENT:
				return technicalEnvironment != null && !technicalEnvironment.isEmpty();
			case ContextModelingPackage.ENVIROMENT_SPECIFICATION__PHYSICAL_ENVIRONMENT:
				return physicalEnvironment != null && !physicalEnvironment.isEmpty();
			case ContextModelingPackage.ENVIROMENT_SPECIFICATION__SOCIAL_ENVIRONMENT:
				return socialEnvironment != null && !socialEnvironment.isEmpty();
			case ContextModelingPackage.ENVIROMENT_SPECIFICATION__ENVIROMENTAL_VARIABLE:
				return enviromentalVariable != null && !enviromentalVariable.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //EnviromentSpecificationImpl
