/**
 */
package reactNative.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import reactNative.Padding;
import reactNative.ReactNativePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Padding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link reactNative.impl.PaddingImpl#getPadding <em>Padding</em>}</li>
 *   <li>{@link reactNative.impl.PaddingImpl#getPaddingHorizontal <em>Padding Horizontal</em>}</li>
 *   <li>{@link reactNative.impl.PaddingImpl#getPaddingVertical <em>Padding Vertical</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaddingImpl extends MinimalEObjectImpl.Container implements Padding {
	/**
	 * The default value of the '{@link #getPadding() <em>Padding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPadding()
	 * @generated
	 * @ordered
	 */
	protected static final String PADDING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPadding() <em>Padding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPadding()
	 * @generated
	 * @ordered
	 */
	protected String padding = PADDING_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaddingHorizontal() <em>Padding Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaddingHorizontal()
	 * @generated
	 * @ordered
	 */
	protected static final String PADDING_HORIZONTAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaddingHorizontal() <em>Padding Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaddingHorizontal()
	 * @generated
	 * @ordered
	 */
	protected String paddingHorizontal = PADDING_HORIZONTAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaddingVertical() <em>Padding Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaddingVertical()
	 * @generated
	 * @ordered
	 */
	protected static final String PADDING_VERTICAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaddingVertical() <em>Padding Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaddingVertical()
	 * @generated
	 * @ordered
	 */
	protected String paddingVertical = PADDING_VERTICAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaddingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReactNativePackage.Literals.PADDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPadding() {
		return padding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPadding(String newPadding) {
		String oldPadding = padding;
		padding = newPadding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReactNativePackage.PADDING__PADDING, oldPadding, padding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPaddingHorizontal() {
		return paddingHorizontal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaddingHorizontal(String newPaddingHorizontal) {
		String oldPaddingHorizontal = paddingHorizontal;
		paddingHorizontal = newPaddingHorizontal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReactNativePackage.PADDING__PADDING_HORIZONTAL, oldPaddingHorizontal, paddingHorizontal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPaddingVertical() {
		return paddingVertical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaddingVertical(String newPaddingVertical) {
		String oldPaddingVertical = paddingVertical;
		paddingVertical = newPaddingVertical;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReactNativePackage.PADDING__PADDING_VERTICAL, oldPaddingVertical, paddingVertical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReactNativePackage.PADDING__PADDING:
				return getPadding();
			case ReactNativePackage.PADDING__PADDING_HORIZONTAL:
				return getPaddingHorizontal();
			case ReactNativePackage.PADDING__PADDING_VERTICAL:
				return getPaddingVertical();
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
			case ReactNativePackage.PADDING__PADDING:
				setPadding((String)newValue);
				return;
			case ReactNativePackage.PADDING__PADDING_HORIZONTAL:
				setPaddingHorizontal((String)newValue);
				return;
			case ReactNativePackage.PADDING__PADDING_VERTICAL:
				setPaddingVertical((String)newValue);
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
			case ReactNativePackage.PADDING__PADDING:
				setPadding(PADDING_EDEFAULT);
				return;
			case ReactNativePackage.PADDING__PADDING_HORIZONTAL:
				setPaddingHorizontal(PADDING_HORIZONTAL_EDEFAULT);
				return;
			case ReactNativePackage.PADDING__PADDING_VERTICAL:
				setPaddingVertical(PADDING_VERTICAL_EDEFAULT);
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
			case ReactNativePackage.PADDING__PADDING:
				return PADDING_EDEFAULT == null ? padding != null : !PADDING_EDEFAULT.equals(padding);
			case ReactNativePackage.PADDING__PADDING_HORIZONTAL:
				return PADDING_HORIZONTAL_EDEFAULT == null ? paddingHorizontal != null : !PADDING_HORIZONTAL_EDEFAULT.equals(paddingHorizontal);
			case ReactNativePackage.PADDING__PADDING_VERTICAL:
				return PADDING_VERTICAL_EDEFAULT == null ? paddingVertical != null : !PADDING_VERTICAL_EDEFAULT.equals(paddingVertical);
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
		result.append(" (padding: ");
		result.append(padding);
		result.append(", paddingHorizontal: ");
		result.append(paddingHorizontal);
		result.append(", paddingVertical: ");
		result.append(paddingVertical);
		result.append(')');
		return result.toString();
	}

} //PaddingImpl
