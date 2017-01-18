/**
 */
package fr.tpt.useme.architecture.model.usemearch.impl;

import fr.tpt.useme.architecture.model.usemearch.SiriusConcreteSyntax;
import fr.tpt.useme.architecture.model.usemearch.UsemearchPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.sirius.viewpoint.description.Group;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sirius Concrete Syntax</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.impl.SiriusConcreteSyntaxImpl#getSiriusSpecification <em>Sirius Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SiriusConcreteSyntaxImpl extends ConcreteSyntaxImpl implements SiriusConcreteSyntax {
	/**
	 * The cached value of the '{@link #getSiriusSpecification() <em>Sirius Specification</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiriusSpecification()
	 * @generated
	 * @ordered
	 */
	protected EList<Group> siriusSpecification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SiriusConcreteSyntaxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsemearchPackage.Literals.SIRIUS_CONCRETE_SYNTAX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Group> getSiriusSpecification() {
		if (siriusSpecification == null) {
			siriusSpecification = new EObjectResolvingEList<Group>(Group.class, this, UsemearchPackage.SIRIUS_CONCRETE_SYNTAX__SIRIUS_SPECIFICATION);
		}
		return siriusSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UsemearchPackage.SIRIUS_CONCRETE_SYNTAX__SIRIUS_SPECIFICATION:
				return getSiriusSpecification();
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
			case UsemearchPackage.SIRIUS_CONCRETE_SYNTAX__SIRIUS_SPECIFICATION:
				getSiriusSpecification().clear();
				getSiriusSpecification().addAll((Collection<? extends Group>)newValue);
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
			case UsemearchPackage.SIRIUS_CONCRETE_SYNTAX__SIRIUS_SPECIFICATION:
				getSiriusSpecification().clear();
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
			case UsemearchPackage.SIRIUS_CONCRETE_SYNTAX__SIRIUS_SPECIFICATION:
				return siriusSpecification != null && !siriusSpecification.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SiriusConcreteSyntaxImpl
