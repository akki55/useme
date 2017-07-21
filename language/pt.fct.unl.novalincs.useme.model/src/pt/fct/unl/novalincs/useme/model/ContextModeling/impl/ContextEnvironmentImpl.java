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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pt.fct.unl.novalincs.useme.model.ContextModeling.ContextEnvironment;
import pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModel;
import pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingPackage;

import pt.fct.unl.novalincs.useme.model.Utility.CEVariable;
import pt.fct.unl.novalincs.useme.model.Utility.OutsideRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Environment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextEnvironmentImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextEnvironmentImpl#getContextModel <em>Context Model</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextEnvironmentImpl#getCeElement <em>Ce Element</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.ContextModeling.impl.ContextEnvironmentImpl#getOutsideRef <em>Outside Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextEnvironmentImpl extends MinimalEObjectImpl.Container implements ContextEnvironment {
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
	 * The cached value of the '{@link #getContextModel() <em>Context Model</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextModel()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextModel> contextModel;

	/**
	 * The cached value of the '{@link #getCeElement() <em>Ce Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCeElement()
	 * @generated
	 * @ordered
	 */
	protected EList<CEVariable> ceElement;

	/**
	 * The cached value of the '{@link #getOutsideRef() <em>Outside Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutsideRef()
	 * @generated
	 * @ordered
	 */
	protected OutsideRef outsideRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextEnvironmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextModelingPackage.Literals.CONTEXT_ENVIRONMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContextModelingPackage.CONTEXT_ENVIRONMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContextModel> getContextModel() {
		if (contextModel == null) {
			contextModel = new EObjectWithInverseResolvingEList.ManyInverse<ContextModel>(ContextModel.class, this, ContextModelingPackage.CONTEXT_ENVIRONMENT__CONTEXT_MODEL, ContextModelingPackage.CONTEXT_MODEL__CONTEXT_ENVIRONMENT);
		}
		return contextModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CEVariable> getCeElement() {
		if (ceElement == null) {
			ceElement = new EObjectResolvingEList<CEVariable>(CEVariable.class, this, ContextModelingPackage.CONTEXT_ENVIRONMENT__CE_ELEMENT);
		}
		return ceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutsideRef getOutsideRef() {
		if (outsideRef != null && outsideRef.eIsProxy()) {
			InternalEObject oldOutsideRef = (InternalEObject)outsideRef;
			outsideRef = (OutsideRef)eResolveProxy(oldOutsideRef);
			if (outsideRef != oldOutsideRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContextModelingPackage.CONTEXT_ENVIRONMENT__OUTSIDE_REF, oldOutsideRef, outsideRef));
			}
		}
		return outsideRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutsideRef basicGetOutsideRef() {
		return outsideRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutsideRef(OutsideRef newOutsideRef) {
		OutsideRef oldOutsideRef = outsideRef;
		outsideRef = newOutsideRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextModelingPackage.CONTEXT_ENVIRONMENT__OUTSIDE_REF, oldOutsideRef, outsideRef));
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
			case ContextModelingPackage.CONTEXT_ENVIRONMENT__CONTEXT_MODEL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContextModel()).basicAdd(otherEnd, msgs);
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
			case ContextModelingPackage.CONTEXT_ENVIRONMENT__CONTEXT_MODEL:
				return ((InternalEList<?>)getContextModel()).basicRemove(otherEnd, msgs);
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
			case ContextModelingPackage.CONTEXT_ENVIRONMENT__NAME:
				return getName();
			case ContextModelingPackage.CONTEXT_ENVIRONMENT__CONTEXT_MODEL:
				return getContextModel();
			case ContextModelingPackage.CONTEXT_ENVIRONMENT__CE_ELEMENT:
				return getCeElement();
			case ContextModelingPackage.CONTEXT_ENVIRONMENT__OUTSIDE_REF:
				if (resolve) return getOutsideRef();
				return basicGetOutsideRef();
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
			case ContextModelingPackage.CONTEXT_ENVIRONMENT__NAME:
				setName((String)newValue);
				return;
			case ContextModelingPackage.CONTEXT_ENVIRONMENT__CONTEXT_MODEL:
				getContextModel().clear();
				getContextModel().addAll((Collection<? extends ContextModel>)newValue);
				return;
			case ContextModelingPackage.CONTEXT_ENVIRONMENT__CE_ELEMENT:
				getCeElement().clear();
				getCeElement().addAll((Collection<? extends CEVariable>)newValue);
				return;
			case ContextModelingPackage.CONTEXT_ENVIRONMENT__OUTSIDE_REF:
				setOutsideRef((OutsideRef)newValue);
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
			case ContextModelingPackage.CONTEXT_ENVIRONMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ContextModelingPackage.CONTEXT_ENVIRONMENT__CONTEXT_MODEL:
				getContextModel().clear();
				return;
			case ContextModelingPackage.CONTEXT_ENVIRONMENT__CE_ELEMENT:
				getCeElement().clear();
				return;
			case ContextModelingPackage.CONTEXT_ENVIRONMENT__OUTSIDE_REF:
				setOutsideRef((OutsideRef)null);
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
			case ContextModelingPackage.CONTEXT_ENVIRONMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ContextModelingPackage.CONTEXT_ENVIRONMENT__CONTEXT_MODEL:
				return contextModel != null && !contextModel.isEmpty();
			case ContextModelingPackage.CONTEXT_ENVIRONMENT__CE_ELEMENT:
				return ceElement != null && !ceElement.isEmpty();
			case ContextModelingPackage.CONTEXT_ENVIRONMENT__OUTSIDE_REF:
				return outsideRef != null;
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

} //ContextEnvironmentImpl
