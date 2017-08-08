/**
 */
package pt.fct.unl.novalincs.useme.model.GoalModeling.provider;


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

import pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModelingFactory;
import pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModelingPackage;
import pt.fct.unl.novalincs.useme.model.GoalModeling.GoalSpecification;

import pt.fct.unl.novalincs.useme.model.UseMe.provider.UseMeEditPlugin;

/**
 * This is the item provider adapter for a {@link pt.fct.unl.novalincs.useme.model.GoalModeling.GoalSpecification} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GoalSpecificationItemProvider 
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
	public GoalSpecificationItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_GoalSpecification_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GoalSpecification_name_feature", "_UI_GoalSpecification_type"),
				 GoalModelingPackage.Literals.GOAL_SPECIFICATION__NAME,
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
			childrenFeatures.add(GoalModelingPackage.Literals.GOAL_SPECIFICATION__USABILITY_REQUIREMENT);
			childrenFeatures.add(GoalModelingPackage.Literals.GOAL_SPECIFICATION__METHOD);
			childrenFeatures.add(GoalModelingPackage.Literals.GOAL_SPECIFICATION__ACTOR);
			childrenFeatures.add(GoalModelingPackage.Literals.GOAL_SPECIFICATION__SCOPE);
			childrenFeatures.add(GoalModelingPackage.Literals.GOAL_SPECIFICATION__SUCCESS_COVERAGE);
			childrenFeatures.add(GoalModelingPackage.Literals.GOAL_SPECIFICATION__GOAL_MODEL);
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
	 * This returns GoalSpecification.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GoalSpecification"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((GoalSpecification)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_GoalSpecification_type") :
			getString("_UI_GoalSpecification_type") + " " + label;
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

		switch (notification.getFeatureID(GoalSpecification.class)) {
			case GoalModelingPackage.GOAL_SPECIFICATION__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GoalModelingPackage.GOAL_SPECIFICATION__USABILITY_REQUIREMENT:
			case GoalModelingPackage.GOAL_SPECIFICATION__METHOD:
			case GoalModelingPackage.GOAL_SPECIFICATION__ACTOR:
			case GoalModelingPackage.GOAL_SPECIFICATION__SCOPE:
			case GoalModelingPackage.GOAL_SPECIFICATION__SUCCESS_COVERAGE:
			case GoalModelingPackage.GOAL_SPECIFICATION__GOAL_MODEL:
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
				(GoalModelingPackage.Literals.GOAL_SPECIFICATION__USABILITY_REQUIREMENT,
				 GoalModelingFactory.eINSTANCE.createUsabilityRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(GoalModelingPackage.Literals.GOAL_SPECIFICATION__METHOD,
				 GoalModelingFactory.eINSTANCE.createMethod()));

		newChildDescriptors.add
			(createChildParameter
				(GoalModelingPackage.Literals.GOAL_SPECIFICATION__ACTOR,
				 GoalModelingFactory.eINSTANCE.createActor()));

		newChildDescriptors.add
			(createChildParameter
				(GoalModelingPackage.Literals.GOAL_SPECIFICATION__SCOPE,
				 GoalModelingFactory.eINSTANCE.createScope()));

		newChildDescriptors.add
			(createChildParameter
				(GoalModelingPackage.Literals.GOAL_SPECIFICATION__SCOPE,
				 EvaluationModelingFactory.eINSTANCE.createEvaluationContext()));

		newChildDescriptors.add
			(createChildParameter
				(GoalModelingPackage.Literals.GOAL_SPECIFICATION__SUCCESS_COVERAGE,
				 GoalModelingFactory.eINSTANCE.createSuccessCoverage()));

		newChildDescriptors.add
			(createChildParameter
				(GoalModelingPackage.Literals.GOAL_SPECIFICATION__GOAL_MODEL,
				 GoalModelingFactory.eINSTANCE.createGoalModel()));
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
