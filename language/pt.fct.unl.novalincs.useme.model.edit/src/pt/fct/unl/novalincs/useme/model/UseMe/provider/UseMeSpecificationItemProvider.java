/**
 */
package pt.fct.unl.novalincs.useme.model.UseMe.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import pt.fct.unl.novalincs.useme.model.ContextModeling.ContextModelingFactory;

import pt.fct.unl.novalincs.useme.model.EvaluationModeling.EvaluationModelingFactory;

import pt.fct.unl.novalincs.useme.model.GoalModeling.GoalModelingFactory;

import pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModelingFactory;

import pt.fct.unl.novalincs.useme.model.ReportModeling.ReportModelingFactory;

import pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModelingFactory;

import pt.fct.unl.novalincs.useme.model.UseMe.UseMePackage;
import pt.fct.unl.novalincs.useme.model.UseMe.UseMeSpecification;

import pt.fct.unl.novalincs.useme.model.Utility.UtilityFactory;

/**
 * This is the item provider adapter for a {@link pt.fct.unl.novalincs.useme.model.UseMe.UseMeSpecification} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UseMeSpecificationItemProvider 
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
	public UseMeSpecificationItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(UseMePackage.Literals.USE_ME_SPECIFICATION__CONTEXT_SPECIFICATION);
			childrenFeatures.add(UseMePackage.Literals.USE_ME_SPECIFICATION__GOAL_SPECIFICATION);
			childrenFeatures.add(UseMePackage.Literals.USE_ME_SPECIFICATION__EVALUATION_SPECIFICATION);
			childrenFeatures.add(UseMePackage.Literals.USE_ME_SPECIFICATION__INTERACTION_SPECIFICATION);
			childrenFeatures.add(UseMePackage.Literals.USE_ME_SPECIFICATION__SURVEY_SPECIFICATION);
			childrenFeatures.add(UseMePackage.Literals.USE_ME_SPECIFICATION__REPORT_SPECIFICATION);
			childrenFeatures.add(UseMePackage.Literals.USE_ME_SPECIFICATION__UTILITY_SPECIFICATION);
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
	 * This returns UseMeSpecification.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UseMeSpecification"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_UseMeSpecification_type");
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

		switch (notification.getFeatureID(UseMeSpecification.class)) {
			case UseMePackage.USE_ME_SPECIFICATION__CONTEXT_SPECIFICATION:
			case UseMePackage.USE_ME_SPECIFICATION__GOAL_SPECIFICATION:
			case UseMePackage.USE_ME_SPECIFICATION__EVALUATION_SPECIFICATION:
			case UseMePackage.USE_ME_SPECIFICATION__INTERACTION_SPECIFICATION:
			case UseMePackage.USE_ME_SPECIFICATION__SURVEY_SPECIFICATION:
			case UseMePackage.USE_ME_SPECIFICATION__REPORT_SPECIFICATION:
			case UseMePackage.USE_ME_SPECIFICATION__UTILITY_SPECIFICATION:
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
				(UseMePackage.Literals.USE_ME_SPECIFICATION__CONTEXT_SPECIFICATION,
				 ContextModelingFactory.eINSTANCE.createContextSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(UseMePackage.Literals.USE_ME_SPECIFICATION__GOAL_SPECIFICATION,
				 GoalModelingFactory.eINSTANCE.createGoalSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(UseMePackage.Literals.USE_ME_SPECIFICATION__EVALUATION_SPECIFICATION,
				 EvaluationModelingFactory.eINSTANCE.createEvaluationSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(UseMePackage.Literals.USE_ME_SPECIFICATION__INTERACTION_SPECIFICATION,
				 InteractionModelingFactory.eINSTANCE.createInteractionSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(UseMePackage.Literals.USE_ME_SPECIFICATION__SURVEY_SPECIFICATION,
				 SurveyModelingFactory.eINSTANCE.createSurveySpecification()));

		newChildDescriptors.add
			(createChildParameter
				(UseMePackage.Literals.USE_ME_SPECIFICATION__REPORT_SPECIFICATION,
				 ReportModelingFactory.eINSTANCE.createReportSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(UseMePackage.Literals.USE_ME_SPECIFICATION__UTILITY_SPECIFICATION,
				 UtilityFactory.eINSTANCE.createUtilitySpecification()));
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
