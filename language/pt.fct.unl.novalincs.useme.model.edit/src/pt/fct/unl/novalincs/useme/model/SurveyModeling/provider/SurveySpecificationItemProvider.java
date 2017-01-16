/**
 */
package pt.fct.unl.novalincs.useme.model.SurveyModeling.provider;


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

import pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModelingFactory;
import pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModelingPackage;
import pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveySpecification;

import pt.fct.unl.novalincs.useme.model.UseMe.provider.UseMeEditPlugin;

/**
 * This is the item provider adapter for a {@link pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveySpecification} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SurveySpecificationItemProvider 
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
	public SurveySpecificationItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_SurveySpecification_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SurveySpecification_name_feature", "_UI_SurveySpecification_type"),
				 SurveyModelingPackage.Literals.SURVEY_SPECIFICATION__NAME,
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
			childrenFeatures.add(SurveyModelingPackage.Literals.SURVEY_SPECIFICATION__SURVEY_MODEL);
			childrenFeatures.add(SurveyModelingPackage.Literals.SURVEY_SPECIFICATION__QUESTIONNAIRE);
			childrenFeatures.add(SurveyModelingPackage.Literals.SURVEY_SPECIFICATION__SURVEY_RESULT);
			childrenFeatures.add(SurveyModelingPackage.Literals.SURVEY_SPECIFICATION__QUESTION);
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
	 * This returns SurveySpecification.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SurveySpecification"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SurveySpecification)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SurveySpecification_type") :
			getString("_UI_SurveySpecification_type") + " " + label;
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

		switch (notification.getFeatureID(SurveySpecification.class)) {
			case SurveyModelingPackage.SURVEY_SPECIFICATION__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SurveyModelingPackage.SURVEY_SPECIFICATION__SURVEY_MODEL:
			case SurveyModelingPackage.SURVEY_SPECIFICATION__QUESTIONNAIRE:
			case SurveyModelingPackage.SURVEY_SPECIFICATION__SURVEY_RESULT:
			case SurveyModelingPackage.SURVEY_SPECIFICATION__QUESTION:
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
				(SurveyModelingPackage.Literals.SURVEY_SPECIFICATION__SURVEY_MODEL,
				 SurveyModelingFactory.eINSTANCE.createSurveyModel()));

		newChildDescriptors.add
			(createChildParameter
				(SurveyModelingPackage.Literals.SURVEY_SPECIFICATION__QUESTIONNAIRE,
				 SurveyModelingFactory.eINSTANCE.createQuestionnaire()));

		newChildDescriptors.add
			(createChildParameter
				(SurveyModelingPackage.Literals.SURVEY_SPECIFICATION__SURVEY_RESULT,
				 SurveyModelingFactory.eINSTANCE.createSurveyResult()));

		newChildDescriptors.add
			(createChildParameter
				(SurveyModelingPackage.Literals.SURVEY_SPECIFICATION__QUESTION,
				 SurveyModelingFactory.eINSTANCE.createQuestion()));

		newChildDescriptors.add
			(createChildParameter
				(SurveyModelingPackage.Literals.SURVEY_SPECIFICATION__QUESTION,
				 SurveyModelingFactory.eINSTANCE.createBackgroundQs()));

		newChildDescriptors.add
			(createChildParameter
				(SurveyModelingPackage.Literals.SURVEY_SPECIFICATION__QUESTION,
				 SurveyModelingFactory.eINSTANCE.createFeedbackQs()));
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
