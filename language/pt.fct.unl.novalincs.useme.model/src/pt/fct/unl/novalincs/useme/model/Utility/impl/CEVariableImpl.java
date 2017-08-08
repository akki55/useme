/**
 */
package pt.fct.unl.novalincs.useme.model.Utility.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pt.fct.unl.novalincs.useme.model.ContextModeling.ContextEnvironment;

import pt.fct.unl.novalincs.useme.model.Utility.CEVariable;
import pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CE Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.impl.CEVariableImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.impl.CEVariableImpl#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.impl.CEVariableImpl#getType <em>Type</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.impl.CEVariableImpl#getComposedElement <em>Composed Element</em>}</li>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.Utility.impl.CEVariableImpl#getContextEnviroment <em>Context Enviroment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CEVariableImpl extends MinimalEObjectImpl.Container implements CEVariable {
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
	 * The default value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMandatory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANDATORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMandatory()
	 * @generated
	 * @ordered
	 */
	protected boolean mandatory = MANDATORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<String> type;

	/**
	 * The cached value of the '{@link #getComposedElement() <em>Composed Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<CEVariable> composedElement;

	/**
	 * The cached value of the '{@link #getContextEnviroment() <em>Context Enviroment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextEnviroment()
	 * @generated
	 * @ordered
	 */
	protected ContextEnvironment contextEnviroment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CEVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UtilityPackage.Literals.CE_VARIABLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UtilityPackage.CE_VARIABLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMandatory() {
		return mandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMandatory(boolean newMandatory) {
		boolean oldMandatory = mandatory;
		mandatory = newMandatory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UtilityPackage.CE_VARIABLE__MANDATORY, oldMandatory, mandatory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getType() {
		if (type == null) {
			type = new EDataTypeUniqueEList<String>(String.class, this, UtilityPackage.CE_VARIABLE__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CEVariable> getComposedElement() {
		if (composedElement == null) {
			composedElement = new EObjectContainmentEList<CEVariable>(CEVariable.class, this, UtilityPackage.CE_VARIABLE__COMPOSED_ELEMENT);
		}
		return composedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextEnvironment getContextEnviroment() {
		if (contextEnviroment != null && contextEnviroment.eIsProxy()) {
			InternalEObject oldContextEnviroment = (InternalEObject)contextEnviroment;
			contextEnviroment = (ContextEnvironment)eResolveProxy(oldContextEnviroment);
			if (contextEnviroment != oldContextEnviroment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UtilityPackage.CE_VARIABLE__CONTEXT_ENVIROMENT, oldContextEnviroment, contextEnviroment));
			}
		}
		return contextEnviroment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextEnvironment basicGetContextEnviroment() {
		return contextEnviroment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextEnviroment(ContextEnvironment newContextEnviroment) {
		ContextEnvironment oldContextEnviroment = contextEnviroment;
		contextEnviroment = newContextEnviroment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UtilityPackage.CE_VARIABLE__CONTEXT_ENVIROMENT, oldContextEnviroment, contextEnviroment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UtilityPackage.CE_VARIABLE__COMPOSED_ELEMENT:
				return ((InternalEList<?>)getComposedElement()).basicRemove(otherEnd, msgs);
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
			case UtilityPackage.CE_VARIABLE__NAME:
				return getName();
			case UtilityPackage.CE_VARIABLE__MANDATORY:
				return isMandatory();
			case UtilityPackage.CE_VARIABLE__TYPE:
				return getType();
			case UtilityPackage.CE_VARIABLE__COMPOSED_ELEMENT:
				return getComposedElement();
			case UtilityPackage.CE_VARIABLE__CONTEXT_ENVIROMENT:
				if (resolve) return getContextEnviroment();
				return basicGetContextEnviroment();
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
			case UtilityPackage.CE_VARIABLE__NAME:
				setName((String)newValue);
				return;
			case UtilityPackage.CE_VARIABLE__MANDATORY:
				setMandatory((Boolean)newValue);
				return;
			case UtilityPackage.CE_VARIABLE__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends String>)newValue);
				return;
			case UtilityPackage.CE_VARIABLE__COMPOSED_ELEMENT:
				getComposedElement().clear();
				getComposedElement().addAll((Collection<? extends CEVariable>)newValue);
				return;
			case UtilityPackage.CE_VARIABLE__CONTEXT_ENVIROMENT:
				setContextEnviroment((ContextEnvironment)newValue);
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
			case UtilityPackage.CE_VARIABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UtilityPackage.CE_VARIABLE__MANDATORY:
				setMandatory(MANDATORY_EDEFAULT);
				return;
			case UtilityPackage.CE_VARIABLE__TYPE:
				getType().clear();
				return;
			case UtilityPackage.CE_VARIABLE__COMPOSED_ELEMENT:
				getComposedElement().clear();
				return;
			case UtilityPackage.CE_VARIABLE__CONTEXT_ENVIROMENT:
				setContextEnviroment((ContextEnvironment)null);
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
			case UtilityPackage.CE_VARIABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UtilityPackage.CE_VARIABLE__MANDATORY:
				return mandatory != MANDATORY_EDEFAULT;
			case UtilityPackage.CE_VARIABLE__TYPE:
				return type != null && !type.isEmpty();
			case UtilityPackage.CE_VARIABLE__COMPOSED_ELEMENT:
				return composedElement != null && !composedElement.isEmpty();
			case UtilityPackage.CE_VARIABLE__CONTEXT_ENVIROMENT:
				return contextEnviroment != null;
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
		result.append(", mandatory: ");
		result.append(mandatory);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //CEVariableImpl
