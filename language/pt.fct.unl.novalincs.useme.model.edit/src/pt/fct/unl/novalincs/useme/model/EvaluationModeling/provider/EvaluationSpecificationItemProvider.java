/**
 */
package pt.fct.unl.novalincs.useme.model.EvaluationModeling.provider;


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
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingPackage;
import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationSpecification;

import pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModelingFactory;

import pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModelingFactory;

import pt.fct.unl.novalincs.useme.model.UseMe.provider.UseMeEditPlugin;

/**
 * This is the item provider adapter for a {@link pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationSpecification} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EvaluationSpecificationItemProvider 
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
	public EvaluationSpecificationItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_EvaluationSpecification_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EvaluationSpecification_name_feature", "_UI_EvaluationSpecification_type"),
				 EvaluationModelingPackage.Literals.EVALUATION_SPECIFICATION__NAME,
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
			childrenFeatures.add(EvaluationModelingPackage.Literals.EVALUATION_SPECIFICATION__EVALUATION_MODEL);
			childrenFeatures.add(EvaluationModelingPackage.Literals.EVALUATION_SPECIFICATION__EVALUATION_GOAL);
			childrenFeatures.add(EvaluationModelingPackage.Literals.EVALUATION_SPECIFICATION__PARTICIPANT);
			childrenFeatures.add(EvaluationModelingPackage.Literals.EVALUATION_SPECIFICATION__DOCUMENTATON);
			childrenFeatures.add(EvaluationModelingPackage.Literals.EVALUATION_SPECIFICATION__LANGUAGE);
			childrenFeatures.add(EvaluationModelingPackage.Literals.EVALUATION_SPECIFICATION__EVALUATION_CONTEXT);
			childrenFeatures.add(EvaluationModelingPackage.Literals.EVALUATION_SPECIFICATION__PROCESS);
			childrenFeatures.add(EvaluationModelingPackage.Literals.EVALUATION_SPECIFICATION__TEST_MODEL);
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
	 * This returns EvaluationSpecification.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EvaluationSpecification"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EvaluationSpecification)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_EvaluationSpecification_type") :
			getString("_UI_EvaluationSpecification_type") + " " + label;
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

		switch (notification.getFeatureID(EvaluationSpecification.class)) {
			case EvaluationModelingPackage.EVALUATION_SPECIFICATION__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EvaluationModelingPackage.EVALUATION_SPECIFICATION__EVALUATION_MODEL:
			case EvaluationModelingPackage.EVALUATION_SPECIFICATION__EVALUATION_GOAL:
			case EvaluationModelingPackage.EVALUATION_SPECIFICATION__PARTICIPANT:
			case EvaluationModelingPackage.EVALUATION_SPECIFICATION__DOCUMENTATON:
			case EvaluationModelingPackage.EVALUATION_SPECIFICATION__LANGUAGE:
			case EvaluationModelingPackage.EVALUATION_SPECIFICATION__EVALUATION_CONTEXT:
			case EvaluationModelingPackage.EVALUATION_SPECIFICATION__PROCESS:
			case EvaluationModelingPackage.EVALUATION_SPECIFICATION__TEST_MODEL:
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
				(EvaluationModelingPackage.Literals.EVALUATION_SPECIFICATION__EVALUATION_MODEL,
				 EvaluationModelingFactory.eINSTANCE.createEvaluationModel()));

		newChildDescriptors.add
			(createChildParameter
				(EvaluationModelingPackage.Literals.EVALUATION_SPECIFICATION__EVALUATION_GOAL,
				 EvaluationModelingFactory.eINSTANCE.createEvaluationGoal()));

		newChildDescriptors.add
			(createChildParameter
				(EvaluationModelingPackage.Literals.EVALUATION_SPECIFICATION__PARTICIPANT,
				 EvaluationModelingFactory.eINSTANCE.createParticipant()));

		newChildDescriptors.add
			(createChildParameter
				(EvaluationModelingPackage.Literals.EVALUATION_SPECIFICATION__DOCUMENTATON,
				 EvaluationModelingFactory.eINSTANCE.createDocumentation()));

		newChildDescriptors.add
			(createChildParameter
				(EvaluationModelingPackage.Literals.EVALUATION_SPECIFICATION__LANGUAGE,
				 EvaluationModelingFactory.eINSTANCE.createLanguage()));

		newChildDescriptors.add
			(createChildParameter
				(EvaluationModelingPackage.Literals.EVALUATION_SPECIFICATION__EVALUATION_CONTEXT,
				 EvaluationModelingFactory.eINSTANCE.createEvaluationContext()));

		newChildDescriptors.add
			(createChildParameter
				(EvaluationModelingPackage.Literals.EVALUATION_SPECIFICATION__PROCESS,
				 EvaluationModelingFactory.eINSTANCE.createProcess()));

		newChildDescriptors.add
			(createChildParameter
				(EvaluationModelingPackage.Literals.EVALUATION_SPECIFICATION__TEST_MODEL,
				 EvaluationModelingFactory.eINSTANCE.createTestModel()));

		newChildDescriptors.add
			(createChildParameter
				(EvaluationModelingPackage.Literals.EVALUATION_SPECIFICATION__TEST_MODEL,
				 InteractionModelingFactory.eINSTANCE.createInteractionModel()));

		newChildDescriptors.add
			(createChildParameter
				(EvaluationModelingPackage.Literals.EVALUATION_SPECIFICATION__TEST_MODEL,
				 SurveyModelingFactory.eINSTANCE.createSurveyModel()));
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
