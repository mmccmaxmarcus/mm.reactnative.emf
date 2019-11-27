/**
 */
package reactNative.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import reactNative.Button;
import reactNative.Icon;
import reactNative.Image;
import reactNative.ReactNativePackage;
import reactNative.Text;
import reactNative.TouchableOpacity;
import reactNative.View;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Touchable Opacity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link reactNative.impl.TouchableOpacityImpl#getTouchableOpacityToIcon <em>Touchable Opacity To Icon</em>}</li>
 *   <li>{@link reactNative.impl.TouchableOpacityImpl#getTouchableOpacityToImage <em>Touchable Opacity To Image</em>}</li>
 *   <li>{@link reactNative.impl.TouchableOpacityImpl#getTouchableOpacityToText <em>Touchable Opacity To Text</em>}</li>
 *   <li>{@link reactNative.impl.TouchableOpacityImpl#getTouchableOpacityView <em>Touchable Opacity View</em>}</li>
 *   <li>{@link reactNative.impl.TouchableOpacityImpl#getTouchableOpacityToButton <em>Touchable Opacity To Button</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TouchableOpacityImpl extends TouchablesGenericsImpl implements TouchableOpacity {
	/**
	 * The cached value of the '{@link #getTouchableOpacityToIcon() <em>Touchable Opacity To Icon</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTouchableOpacityToIcon()
	 * @generated
	 * @ordered
	 */
	protected EList<Icon> touchableOpacityToIcon;

	/**
	 * The cached value of the '{@link #getTouchableOpacityToImage() <em>Touchable Opacity To Image</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTouchableOpacityToImage()
	 * @generated
	 * @ordered
	 */
	protected EList<Image> touchableOpacityToImage;

	/**
	 * The cached value of the '{@link #getTouchableOpacityToText() <em>Touchable Opacity To Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTouchableOpacityToText()
	 * @generated
	 * @ordered
	 */
	protected EList<Text> touchableOpacityToText;

	/**
	 * The cached value of the '{@link #getTouchableOpacityView() <em>Touchable Opacity View</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTouchableOpacityView()
	 * @generated
	 * @ordered
	 */
	protected EList<View> touchableOpacityView;

	/**
	 * The cached value of the '{@link #getTouchableOpacityToButton() <em>Touchable Opacity To Button</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTouchableOpacityToButton()
	 * @generated
	 * @ordered
	 */
	protected EList<Button> touchableOpacityToButton;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TouchableOpacityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReactNativePackage.Literals.TOUCHABLE_OPACITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Icon> getTouchableOpacityToIcon() {
		if (touchableOpacityToIcon == null) {
			touchableOpacityToIcon = new EObjectContainmentEList<Icon>(Icon.class, this, ReactNativePackage.TOUCHABLE_OPACITY__TOUCHABLE_OPACITY_TO_ICON);
		}
		return touchableOpacityToIcon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Image> getTouchableOpacityToImage() {
		if (touchableOpacityToImage == null) {
			touchableOpacityToImage = new EObjectContainmentEList<Image>(Image.class, this, ReactNativePackage.TOUCHABLE_OPACITY__TOUCHABLE_OPACITY_TO_IMAGE);
		}
		return touchableOpacityToImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Text> getTouchableOpacityToText() {
		if (touchableOpacityToText == null) {
			touchableOpacityToText = new EObjectContainmentEList<Text>(Text.class, this, ReactNativePackage.TOUCHABLE_OPACITY__TOUCHABLE_OPACITY_TO_TEXT);
		}
		return touchableOpacityToText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<View> getTouchableOpacityView() {
		if (touchableOpacityView == null) {
			touchableOpacityView = new EObjectContainmentEList<View>(View.class, this, ReactNativePackage.TOUCHABLE_OPACITY__TOUCHABLE_OPACITY_VIEW);
		}
		return touchableOpacityView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Button> getTouchableOpacityToButton() {
		if (touchableOpacityToButton == null) {
			touchableOpacityToButton = new EObjectContainmentEList<Button>(Button.class, this, ReactNativePackage.TOUCHABLE_OPACITY__TOUCHABLE_OPACITY_TO_BUTTON);
		}
		return touchableOpacityToButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReactNativePackage.TOUCHABLE_OPACITY__TOUCHABLE_OPACITY_TO_ICON:
				return ((InternalEList<?>)getTouchableOpacityToIcon()).basicRemove(otherEnd, msgs);
			case ReactNativePackage.TOUCHABLE_OPACITY__TOUCHABLE_OPACITY_TO_IMAGE:
				return ((InternalEList<?>)getTouchableOpacityToImage()).basicRemove(otherEnd, msgs);
			case ReactNativePackage.TOUCHABLE_OPACITY__TOUCHABLE_OPACITY_TO_TEXT:
				return ((InternalEList<?>)getTouchableOpacityToText()).basicRemove(otherEnd, msgs);
			case ReactNativePackage.TOUCHABLE_OPACITY__TOUCHABLE_OPACITY_VIEW:
				return ((InternalEList<?>)getTouchableOpacityView()).basicRemove(otherEnd, msgs);
			case ReactNativePackage.TOUCHABLE_OPACITY__TOUCHABLE_OPACITY_TO_BUTTON:
				return ((InternalEList<?>)getTouchableOpacityToButton()).basicRemove(otherEnd, msgs);
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
			case ReactNativePackage.TOUCHABLE_OPACITY__TOUCHABLE_OPACITY_TO_ICON:
				return getTouchableOpacityToIcon();
			case ReactNativePackage.TOUCHABLE_OPACITY__TOUCHABLE_OPACITY_TO_IMAGE:
				return getTouchableOpacityToImage();
			case ReactNativePackage.TOUCHABLE_OPACITY__TOUCHABLE_OPACITY_TO_TEXT:
				return getTouchableOpacityToText();
			case ReactNativePackage.TOUCHABLE_OPACITY__TOUCHABLE_OPACITY_VIEW:
				return getTouchableOpacityView();
			case ReactNativePackage.TOUCHABLE_OPACITY__TOUCHABLE_OPACITY_TO_BUTTON:
				return getTouchableOpacityToButton();
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
			case ReactNativePackage.TOUCHABLE_OPACITY__TOUCHABLE_OPACITY_TO_ICON:
				getTouchableOpacityToIcon().clear();
				getTouchableOpacityToIcon().addAll((Collection<? extends Icon>)newValue);
				return;
			case ReactNativePackage.TOUCHABLE_OPACITY__TOUCHABLE_OPACITY_TO_IMAGE:
				getTouchableOpacityToImage().clear();
				getTouchableOpacityToImage().addAll((Collection<? extends Image>)newValue);
				return;
			case ReactNativePackage.TOUCHABLE_OPACITY__TOUCHABLE_OPACITY_TO_TEXT:
				getTouchableOpacityToText().clear();
				getTouchableOpacityToText().addAll((Collection<? extends Text>)newValue);
				return;
			case ReactNativePackage.TOUCHABLE_OPACITY__TOUCHABLE_OPACITY_VIEW:
				getTouchableOpacityView().clear();
				getTouchableOpacityView().addAll((Collection<? extends View>)newValue);
				return;
			case ReactNativePackage.TOUCHABLE_OPACITY__TOUCHABLE_OPACITY_TO_BUTTON:
				getTouchableOpacityToButton().clear();
				getTouchableOpacityToButton().addAll((Collection<? extends Button>)newValue);
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
			case ReactNativePackage.TOUCHABLE_OPACITY__TOUCHABLE_OPACITY_TO_ICON:
				getTouchableOpacityToIcon().clear();
				return;
			case ReactNativePackage.TOUCHABLE_OPACITY__TOUCHABLE_OPACITY_TO_IMAGE:
				getTouchableOpacityToImage().clear();
				return;
			case ReactNativePackage.TOUCHABLE_OPACITY__TOUCHABLE_OPACITY_TO_TEXT:
				getTouchableOpacityToText().clear();
				return;
			case ReactNativePackage.TOUCHABLE_OPACITY__TOUCHABLE_OPACITY_VIEW:
				getTouchableOpacityView().clear();
				return;
			case ReactNativePackage.TOUCHABLE_OPACITY__TOUCHABLE_OPACITY_TO_BUTTON:
				getTouchableOpacityToButton().clear();
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
			case ReactNativePackage.TOUCHABLE_OPACITY__TOUCHABLE_OPACITY_TO_ICON:
				return touchableOpacityToIcon != null && !touchableOpacityToIcon.isEmpty();
			case ReactNativePackage.TOUCHABLE_OPACITY__TOUCHABLE_OPACITY_TO_IMAGE:
				return touchableOpacityToImage != null && !touchableOpacityToImage.isEmpty();
			case ReactNativePackage.TOUCHABLE_OPACITY__TOUCHABLE_OPACITY_TO_TEXT:
				return touchableOpacityToText != null && !touchableOpacityToText.isEmpty();
			case ReactNativePackage.TOUCHABLE_OPACITY__TOUCHABLE_OPACITY_VIEW:
				return touchableOpacityView != null && !touchableOpacityView.isEmpty();
			case ReactNativePackage.TOUCHABLE_OPACITY__TOUCHABLE_OPACITY_TO_BUTTON:
				return touchableOpacityToButton != null && !touchableOpacityToButton.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TouchableOpacityImpl
