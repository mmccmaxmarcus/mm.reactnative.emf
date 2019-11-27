/**
 */
package reactNative.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import reactNative.Border;
import reactNative.ReactNativePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Border</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link reactNative.impl.BorderImpl#getBorderBottomRightRadius <em>Border Bottom Right Radius</em>}</li>
 *   <li>{@link reactNative.impl.BorderImpl#getBorderColor <em>Border Color</em>}</li>
 *   <li>{@link reactNative.impl.BorderImpl#getBorderRadius <em>Border Radius</em>}</li>
 *   <li>{@link reactNative.impl.BorderImpl#getBorderWidth <em>Border Width</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BorderImpl extends MinimalEObjectImpl.Container implements Border {
	/**
	 * The default value of the '{@link #getBorderBottomRightRadius() <em>Border Bottom Right Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderBottomRightRadius()
	 * @generated
	 * @ordered
	 */
	protected static final String BORDER_BOTTOM_RIGHT_RADIUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBorderBottomRightRadius() <em>Border Bottom Right Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderBottomRightRadius()
	 * @generated
	 * @ordered
	 */
	protected String borderBottomRightRadius = BORDER_BOTTOM_RIGHT_RADIUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBorderColor() <em>Border Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderColor()
	 * @generated
	 * @ordered
	 */
	protected static final String BORDER_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBorderColor() <em>Border Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderColor()
	 * @generated
	 * @ordered
	 */
	protected String borderColor = BORDER_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getBorderRadius() <em>Border Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderRadius()
	 * @generated
	 * @ordered
	 */
	protected static final String BORDER_RADIUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBorderRadius() <em>Border Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderRadius()
	 * @generated
	 * @ordered
	 */
	protected String borderRadius = BORDER_RADIUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBorderWidth() <em>Border Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String BORDER_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBorderWidth() <em>Border Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderWidth()
	 * @generated
	 * @ordered
	 */
	protected String borderWidth = BORDER_WIDTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BorderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReactNativePackage.Literals.BORDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBorderBottomRightRadius() {
		return borderBottomRightRadius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBorderBottomRightRadius(String newBorderBottomRightRadius) {
		String oldBorderBottomRightRadius = borderBottomRightRadius;
		borderBottomRightRadius = newBorderBottomRightRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReactNativePackage.BORDER__BORDER_BOTTOM_RIGHT_RADIUS, oldBorderBottomRightRadius, borderBottomRightRadius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBorderColor() {
		return borderColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBorderColor(String newBorderColor) {
		String oldBorderColor = borderColor;
		borderColor = newBorderColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReactNativePackage.BORDER__BORDER_COLOR, oldBorderColor, borderColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBorderRadius() {
		return borderRadius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBorderRadius(String newBorderRadius) {
		String oldBorderRadius = borderRadius;
		borderRadius = newBorderRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReactNativePackage.BORDER__BORDER_RADIUS, oldBorderRadius, borderRadius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBorderWidth() {
		return borderWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBorderWidth(String newBorderWidth) {
		String oldBorderWidth = borderWidth;
		borderWidth = newBorderWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReactNativePackage.BORDER__BORDER_WIDTH, oldBorderWidth, borderWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReactNativePackage.BORDER__BORDER_BOTTOM_RIGHT_RADIUS:
				return getBorderBottomRightRadius();
			case ReactNativePackage.BORDER__BORDER_COLOR:
				return getBorderColor();
			case ReactNativePackage.BORDER__BORDER_RADIUS:
				return getBorderRadius();
			case ReactNativePackage.BORDER__BORDER_WIDTH:
				return getBorderWidth();
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
			case ReactNativePackage.BORDER__BORDER_BOTTOM_RIGHT_RADIUS:
				setBorderBottomRightRadius((String)newValue);
				return;
			case ReactNativePackage.BORDER__BORDER_COLOR:
				setBorderColor((String)newValue);
				return;
			case ReactNativePackage.BORDER__BORDER_RADIUS:
				setBorderRadius((String)newValue);
				return;
			case ReactNativePackage.BORDER__BORDER_WIDTH:
				setBorderWidth((String)newValue);
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
			case ReactNativePackage.BORDER__BORDER_BOTTOM_RIGHT_RADIUS:
				setBorderBottomRightRadius(BORDER_BOTTOM_RIGHT_RADIUS_EDEFAULT);
				return;
			case ReactNativePackage.BORDER__BORDER_COLOR:
				setBorderColor(BORDER_COLOR_EDEFAULT);
				return;
			case ReactNativePackage.BORDER__BORDER_RADIUS:
				setBorderRadius(BORDER_RADIUS_EDEFAULT);
				return;
			case ReactNativePackage.BORDER__BORDER_WIDTH:
				setBorderWidth(BORDER_WIDTH_EDEFAULT);
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
			case ReactNativePackage.BORDER__BORDER_BOTTOM_RIGHT_RADIUS:
				return BORDER_BOTTOM_RIGHT_RADIUS_EDEFAULT == null ? borderBottomRightRadius != null : !BORDER_BOTTOM_RIGHT_RADIUS_EDEFAULT.equals(borderBottomRightRadius);
			case ReactNativePackage.BORDER__BORDER_COLOR:
				return BORDER_COLOR_EDEFAULT == null ? borderColor != null : !BORDER_COLOR_EDEFAULT.equals(borderColor);
			case ReactNativePackage.BORDER__BORDER_RADIUS:
				return BORDER_RADIUS_EDEFAULT == null ? borderRadius != null : !BORDER_RADIUS_EDEFAULT.equals(borderRadius);
			case ReactNativePackage.BORDER__BORDER_WIDTH:
				return BORDER_WIDTH_EDEFAULT == null ? borderWidth != null : !BORDER_WIDTH_EDEFAULT.equals(borderWidth);
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
		result.append(" (borderBottomRightRadius: ");
		result.append(borderBottomRightRadius);
		result.append(", borderColor: ");
		result.append(borderColor);
		result.append(", borderRadius: ");
		result.append(borderRadius);
		result.append(", borderWidth: ");
		result.append(borderWidth);
		result.append(')');
		return result.toString();
	}

} //BorderImpl
