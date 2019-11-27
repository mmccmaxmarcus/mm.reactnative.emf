/**
 */
package reactNative.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import reactNative.Array;
import reactNative.ElementImage;
import reactNative.ReactNativePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Image</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link reactNative.impl.ElementImageImpl#getContentImage <em>Content Image</em>}</li>
 *   <li>{@link reactNative.impl.ElementImageImpl#getValueImage <em>Value Image</em>}</li>
 *   <li>{@link reactNative.impl.ElementImageImpl#getElementImageToArray <em>Element Image To Array</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementImageImpl extends MinimalEObjectImpl.Container implements ElementImage {
	/**
	 * The default value of the '{@link #getContentImage() <em>Content Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentImage()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentImage() <em>Content Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentImage()
	 * @generated
	 * @ordered
	 */
	protected String contentImage = CONTENT_IMAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueImage() <em>Value Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueImage()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueImage() <em>Value Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueImage()
	 * @generated
	 * @ordered
	 */
	protected String valueImage = VALUE_IMAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElementImageToArray() <em>Element Image To Array</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementImageToArray()
	 * @generated
	 * @ordered
	 */
	protected EList<Array> elementImageToArray;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementImageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReactNativePackage.Literals.ELEMENT_IMAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentImage() {
		return contentImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentImage(String newContentImage) {
		String oldContentImage = contentImage;
		contentImage = newContentImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReactNativePackage.ELEMENT_IMAGE__CONTENT_IMAGE, oldContentImage, contentImage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValueImage() {
		return valueImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValueImage(String newValueImage) {
		String oldValueImage = valueImage;
		valueImage = newValueImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReactNativePackage.ELEMENT_IMAGE__VALUE_IMAGE, oldValueImage, valueImage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Array> getElementImageToArray() {
		if (elementImageToArray == null) {
			elementImageToArray = new EObjectContainmentEList<Array>(Array.class, this, ReactNativePackage.ELEMENT_IMAGE__ELEMENT_IMAGE_TO_ARRAY);
		}
		return elementImageToArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReactNativePackage.ELEMENT_IMAGE__ELEMENT_IMAGE_TO_ARRAY:
				return ((InternalEList<?>)getElementImageToArray()).basicRemove(otherEnd, msgs);
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
			case ReactNativePackage.ELEMENT_IMAGE__CONTENT_IMAGE:
				return getContentImage();
			case ReactNativePackage.ELEMENT_IMAGE__VALUE_IMAGE:
				return getValueImage();
			case ReactNativePackage.ELEMENT_IMAGE__ELEMENT_IMAGE_TO_ARRAY:
				return getElementImageToArray();
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
			case ReactNativePackage.ELEMENT_IMAGE__CONTENT_IMAGE:
				setContentImage((String)newValue);
				return;
			case ReactNativePackage.ELEMENT_IMAGE__VALUE_IMAGE:
				setValueImage((String)newValue);
				return;
			case ReactNativePackage.ELEMENT_IMAGE__ELEMENT_IMAGE_TO_ARRAY:
				getElementImageToArray().clear();
				getElementImageToArray().addAll((Collection<? extends Array>)newValue);
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
			case ReactNativePackage.ELEMENT_IMAGE__CONTENT_IMAGE:
				setContentImage(CONTENT_IMAGE_EDEFAULT);
				return;
			case ReactNativePackage.ELEMENT_IMAGE__VALUE_IMAGE:
				setValueImage(VALUE_IMAGE_EDEFAULT);
				return;
			case ReactNativePackage.ELEMENT_IMAGE__ELEMENT_IMAGE_TO_ARRAY:
				getElementImageToArray().clear();
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
			case ReactNativePackage.ELEMENT_IMAGE__CONTENT_IMAGE:
				return CONTENT_IMAGE_EDEFAULT == null ? contentImage != null : !CONTENT_IMAGE_EDEFAULT.equals(contentImage);
			case ReactNativePackage.ELEMENT_IMAGE__VALUE_IMAGE:
				return VALUE_IMAGE_EDEFAULT == null ? valueImage != null : !VALUE_IMAGE_EDEFAULT.equals(valueImage);
			case ReactNativePackage.ELEMENT_IMAGE__ELEMENT_IMAGE_TO_ARRAY:
				return elementImageToArray != null && !elementImageToArray.isEmpty();
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (contentImage: ");
		result.append(contentImage);
		result.append(", valueImage: ");
		result.append(valueImage);
		result.append(')');
		return result.toString();
	}

} //ElementImageImpl
