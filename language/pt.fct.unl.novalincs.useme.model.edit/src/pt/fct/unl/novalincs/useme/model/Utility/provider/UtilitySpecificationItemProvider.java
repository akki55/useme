/**
 */
package pt.fct.unl.novalincs.useme.model.Utility.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingFactory;

import pt.fct.unl.novalincs.useme.model.UseMe.provider.UseMeEditPlugin;

import pt.fct.unl.novalincs.useme.model.Utility.UtilityFactory;
import pt.fct.unl.novalincs.useme.model.Utility.UtilityPackage;
import pt.fct.unl.novalincs.useme.model.Utility.UtilitySpecification;

/**
 * This is the item provider adapter for a {@link pt.fct.unl.novalincs.useme.model.Utility.UtilitySpecification} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UtilitySpecificationItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UtilitySpecificationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UtilitySpecification_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UtilitySpecification_name_feature", "_UI_UtilitySpecification_type"),
				 UtilityPackage.Literals.UTILITY_SPECIFICATION__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(UtilityPackage.Literals.UTILITY_SPECIFICATION__DSL);
			childrenFeatures.add(UtilityPackage.Literals.UTILITY_SPECIFICATION__FUNCTIONAL_GOAL);
			childrenFeatures.add(UtilityPackage.Literals.UTILITY_SPECIFICATION__PROCESS_MODEL);
			childrenFeatures.add(UtilityPackage.Literals.UTILITY_SPECIFICATION__SURVEY_ENGINE);
			childrenFeatures.add(UtilityPackage.Literals.UTILITY_SPECIFICATION__DOCUMENTATION);
			childrenFeatures.add(UtilityPackage.Literals.UTILITY_SPECIFICATION__OUTSIDE_REF);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns UtilitySpecification.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UtilitySpecification"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((UtilitySpecification)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_UtilitySpecification_type") :
			getString("_UI_UtilitySpecification_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(UtilitySpecification.class)) {
			case UtilityPackage.UTILITY_SPECIFICATION__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case UtilityPackage.UTILITY_SPECIFICATION__DSL:
			case UtilityPackage.UTILITY_SPECIFICATION__FUNCTIONAL_GOAL:
			case UtilityPackage.UTILITY_SPECIFICATION__PROCESS_MODEL:
			case UtilityPackage.UTILITY_SPECIFICATION__SURVEY_ENGINE:
			case UtilityPackage.UTILITY_SPECIFICATION__DOCUMENTATION:
			case UtilityPackage.UTILITY_SPECIFICATION__OUTSIDE_REF:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(UtilityPackage.Literals.UTILITY_SPECIFICATION__DSL,
				 UtilityFactory.eINSTANCE.createDSL()));

		newChildDescriptors.add
			(createChildParameter
				(UtilityPackage.Literals.UTILITY_SPECIFICATION__FUNCTIONAL_GOAL,
				 UtilityFactory.eINSTANCE.createFunctionalGoal()));

		newChildDescriptors.add
			(createChildParameter
				(UtilityPackage.Literals.UTILITY_SPECIFICATION__PROCESS_MODEL,
				 UtilityFactory.eINSTANCE.createProcessModel()));

		newChildDescriptors.add
			(createChildParameter
				(UtilityPackage.Literals.UTILITY_SPECIFICATION__SURVEY_ENGINE,
				 UtilityFactory.eINSTANCE.createSurveyEngine()));

		newChildDescriptors.add
			(createChildParameter
				(UtilityPackage.Literals.UTILITY_SPECIFICATION__DOCUMENTATION,
				 EvaluationModelingFactory.eINSTANCE.createDocumentation()));

		newChildDescriptors.add
			(createChildParameter
				(UtilityPackage.Literals.UTILITY_SPECIFICATION__OUTSIDE_REF,
				 UtilityFactory.eINSTANCE.createOutsideRef()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return UseMeEditPlugin.INSTANCE;
	}

}
