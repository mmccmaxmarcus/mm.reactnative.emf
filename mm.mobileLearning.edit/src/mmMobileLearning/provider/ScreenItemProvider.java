/**
 */
package mmMobileLearning.provider;


import java.util.Collection;
import java.util.List;

import mmMobileLearning.MmMobileLearningFactory;
import mmMobileLearning.MmMobileLearningPackage;
import mmMobileLearning.Screen;

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

/**
 * This is the item provider adapter for a {@link mmMobileLearning.Screen} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ScreenItemProvider 
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
	public ScreenItemProvider(AdapterFactory adapterFactory) {
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

			addLabelPropertyDescriptor(object);
			addOrigemElementPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Screen_label_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Screen_label_feature", "_UI_Screen_type"),
				 MmMobileLearningPackage.Literals.SCREEN__LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Origem Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOrigemElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Screen_origemElement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Screen_origemElement_feature", "_UI_Screen_type"),
				 MmMobileLearningPackage.Literals.SCREEN__ORIGEM_ELEMENT,
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
			childrenFeatures.add(MmMobileLearningPackage.Literals.SCREEN__SCREEN_TO_ELEMENT_INTERFACE);
			childrenFeatures.add(MmMobileLearningPackage.Literals.SCREEN__SCREEN_TO_MMODULE);
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
	 * This returns Screen.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Screen"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Screen)object).getLabel();
		return label == null || label.length() == 0 ?
			getString("_UI_Screen_type") :
			getString("_UI_Screen_type") + " " + label;
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

		switch (notification.getFeatureID(Screen.class)) {
			case MmMobileLearningPackage.SCREEN__LABEL:
			case MmMobileLearningPackage.SCREEN__ORIGEM_ELEMENT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case MmMobileLearningPackage.SCREEN__SCREEN_TO_ELEMENT_INTERFACE:
			case MmMobileLearningPackage.SCREEN__SCREEN_TO_MMODULE:
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
				(MmMobileLearningPackage.Literals.SCREEN__SCREEN_TO_ELEMENT_INTERFACE,
				 MmMobileLearningFactory.eINSTANCE.createElementInterface()));

		newChildDescriptors.add
			(createChildParameter
				(MmMobileLearningPackage.Literals.SCREEN__SCREEN_TO_ELEMENT_INTERFACE,
				 MmMobileLearningFactory.eINSTANCE.createText()));

		newChildDescriptors.add
			(createChildParameter
				(MmMobileLearningPackage.Literals.SCREEN__SCREEN_TO_ELEMENT_INTERFACE,
				 MmMobileLearningFactory.eINSTANCE.createImage()));

		newChildDescriptors.add
			(createChildParameter
				(MmMobileLearningPackage.Literals.SCREEN__SCREEN_TO_ELEMENT_INTERFACE,
				 MmMobileLearningFactory.eINSTANCE.createVideo()));

		newChildDescriptors.add
			(createChildParameter
				(MmMobileLearningPackage.Literals.SCREEN__SCREEN_TO_ELEMENT_INTERFACE,
				 MmMobileLearningFactory.eINSTANCE.createAudio()));

		newChildDescriptors.add
			(createChildParameter
				(MmMobileLearningPackage.Literals.SCREEN__SCREEN_TO_ELEMENT_INTERFACE,
				 MmMobileLearningFactory.eINSTANCE.createLink()));

		newChildDescriptors.add
			(createChildParameter
				(MmMobileLearningPackage.Literals.SCREEN__SCREEN_TO_MMODULE,
				 MmMobileLearningFactory.eINSTANCE.createMModule()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MmMobileLearningEditPlugin.INSTANCE;
	}

}
