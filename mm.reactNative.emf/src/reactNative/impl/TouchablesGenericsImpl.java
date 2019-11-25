/**
 */
package reactNative.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import reactNative.ReactNativePackage;
import reactNative.TouchablesGenerics;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Touchables Generics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link reactNative.impl.TouchablesGenericsImpl#getOnPress <em>On Press</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TouchablesGenericsImpl extends MinimalEObjectImpl.Container implements TouchablesGenerics {
	/**
	 * The default value of the '{@link #getOnPress() <em>On Press</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnPress()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_PRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnPress() <em>On Press</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnPress()
	 * @generated
	 * @ordered
	 */
	protected String onPress = ON_PRESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TouchablesGenericsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReactNativePackage.Literals.TOUCHABLES_GENERICS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnPress() {
		return onPress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnPress(String newOnPress) {
		String oldOnPress = onPress;
		onPress = newOnPress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReactNativePackage.TOUCHABLES_GENERICS__ON_PRESS, oldOnPress, onPress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReactNativePackage.TOUCHABLES_GENERICS__ON_PRESS:
				return getOnPress();
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
			case ReactNativePackage.TOUCHABLES_GENERICS__ON_PRESS:
				setOnPress((String)newValue);
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
			case ReactNativePackage.TOUCHABLES_GENERICS__ON_PRESS:
				setOnPress(ON_PRESS_EDEFAULT);
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
			case ReactNativePackage.TOUCHABLES_GENERICS__ON_PRESS:
				return ON_PRESS_EDEFAULT == null ? onPress != null : !ON_PRESS_EDEFAULT.equals(onPress);
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
		result.append(" (onPress: ");
		result.append(onPress);
		result.append(')');
		return result.toString();
	}

} //TouchablesGenericsImpl
