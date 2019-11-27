/**
 */
package reactNative.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import reactNative.ReactNativeFactory;
import reactNative.ReactNativePackage;
import reactNative.TouchableOpacity;

/**
 * This is the item provider adapter for a {@link reactNative.TouchableOpacity} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TouchableOpacityItemProvider extends TouchablesGenericsItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouchableOpacityItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ReactNativePackage.Literals.TOUCHABLE_OPACITY__TOUCHABLE_OPACITY_TO_ICON);
			childrenFeatures.add(ReactNativePackage.Literals.TOUCHABLE_OPACITY__TOUCHABLE_OPACITY_TO_IMAGE);
			childrenFeatures.add(ReactNativePackage.Literals.TOUCHABLE_OPACITY__TOUCHABLE_OPACITY_TO_TEXT);
			childrenFeatures.add(ReactNativePackage.Literals.TOUCHABLE_OPACITY__TOUCHABLE_OPACITY_VIEW);
			childrenFeatures.add(ReactNativePackage.Literals.TOUCHABLE_OPACITY__TOUCHABLE_OPACITY_TO_BUTTON);
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
	 * This returns TouchableOpacity.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TouchableOpacity"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TouchableOpacity)object).getOnPress();
		return label == null || label.length() == 0 ?
			getString("_UI_TouchableOpacity_type") :
			getString("_UI_TouchableOpacity_type") + " " + label;
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

		switch (notification.getFeatureID(TouchableOpacity.class)) {
			case ReactNativePackage.TOUCHABLE_OPACITY__TOUCHABLE_OPACITY_TO_ICON:
			case ReactNativePackage.TOUCHABLE_OPACITY__TOUCHABLE_OPACITY_TO_IMAGE:
			case ReactNativePackage.TOUCHABLE_OPACITY__TOUCHABLE_OPACITY_TO_TEXT:
			case ReactNativePackage.TOUCHABLE_OPACITY__TOUCHABLE_OPACITY_VIEW:
			case ReactNativePackage.TOUCHABLE_OPACITY__TOUCHABLE_OPACITY_TO_BUTTON:
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
				(ReactNativePackage.Literals.TOUCHABLE_OPACITY__TOUCHABLE_OPACITY_TO_ICON,
				 ReactNativeFactory.eINSTANCE.createIcon()));

		newChildDescriptors.add
			(createChildParameter
				(ReactNativePackage.Literals.TOUCHABLE_OPACITY__TOUCHABLE_OPACITY_TO_IMAGE,
				 ReactNativeFactory.eINSTANCE.createImage()));

		newChildDescriptors.add
			(createChildParameter
				(ReactNativePackage.Literals.TOUCHABLE_OPACITY__TOUCHABLE_OPACITY_TO_TEXT,
				 ReactNativeFactory.eINSTANCE.createText()));

		newChildDescriptors.add
			(createChildParameter
				(ReactNativePackage.Literals.TOUCHABLE_OPACITY__TOUCHABLE_OPACITY_VIEW,
				 ReactNativeFactory.eINSTANCE.createView()));

		newChildDescriptors.add
			(createChildParameter
				(ReactNativePackage.Literals.TOUCHABLE_OPACITY__TOUCHABLE_OPACITY_TO_BUTTON,
				 ReactNativeFactory.eINSTANCE.createButton()));
	}

}
