/**
 */
package reactNative.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import reactNative.ElementText;
import reactNative.ReactNativePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link reactNative.impl.ElementTextImpl#getContentText <em>Content Text</em>}</li>
 *   <li>{@link reactNative.impl.ElementTextImpl#getValueText <em>Value Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementTextImpl extends MinimalEObjectImpl.Container implements ElementText {
	/**
	 * The default value of the '{@link #getContentText() <em>Content Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentText()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentText() <em>Content Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentText()
	 * @generated
	 * @ordered
	 */
	protected String contentText = CONTENT_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueText() <em>Value Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueText()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueText() <em>Value Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueText()
	 * @generated
	 * @ordered
	 */
	protected String valueText = VALUE_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementTextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReactNativePackage.Literals.ELEMENT_TEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContentText() {
		return contentText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentText(String newContentText) {
		String oldContentText = contentText;
		contentText = newContentText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReactNativePackage.ELEMENT_TEXT__CONTENT_TEXT, oldContentText, contentText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueText() {
		return valueText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueText(String newValueText) {
		String oldValueText = valueText;
		valueText = newValueText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReactNativePackage.ELEMENT_TEXT__VALUE_TEXT, oldValueText, valueText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReactNativePackage.ELEMENT_TEXT__CONTENT_TEXT:
				return getContentText();
			case ReactNativePackage.ELEMENT_TEXT__VALUE_TEXT:
				return getValueText();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ReactNativePackage.ELEMENT_TEXT__CONTENT_TEXT:
				setContentText((String)newValue);
				return;
			case ReactNativePackage.ELEMENT_TEXT__VALUE_TEXT:
				setValueText((String)newValue);
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
			case ReactNativePackage.ELEMENT_TEXT__CONTENT_TEXT:
				setContentText(CONTENT_TEXT_EDEFAULT);
				return;
			case ReactNativePackage.ELEMENT_TEXT__VALUE_TEXT:
				setValueText(VALUE_TEXT_EDEFAULT);
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
			case ReactNativePackage.ELEMENT_TEXT__CONTENT_TEXT:
				return CONTENT_TEXT_EDEFAULT == null ? contentText != null : !CONTENT_TEXT_EDEFAULT.equals(contentText);
			case ReactNativePackage.ELEMENT_TEXT__VALUE_TEXT:
				return VALUE_TEXT_EDEFAULT == null ? valueText != null : !VALUE_TEXT_EDEFAULT.equals(valueText);
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
		result.append(" (contentText: ");
		result.append(contentText);
		result.append(", valueText: ");
		result.append(valueText);
		result.append(')');
		return result.toString();
	}

} //ElementTextImpl
