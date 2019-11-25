/**
 */
package reactNative.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import reactNative.Margin;
import reactNative.ReactNativePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Margin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link reactNative.impl.MarginImpl#getMarginTop <em>Margin Top</em>}</li>
 *   <li>{@link reactNative.impl.MarginImpl#getMarginBottom <em>Margin Bottom</em>}</li>
 *   <li>{@link reactNative.impl.MarginImpl#getMargin <em>Margin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MarginImpl extends MinimalEObjectImpl.Container implements Margin {
	/**
	 * The default value of the '{@link #getMarginTop() <em>Margin Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginTop()
	 * @generated
	 * @ordered
	 */
	protected static final String MARGIN_TOP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMarginTop() <em>Margin Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginTop()
	 * @generated
	 * @ordered
	 */
	protected String marginTop = MARGIN_TOP_EDEFAULT;

	/**
	 * The default value of the '{@link #getMarginBottom() <em>Margin Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginBottom()
	 * @generated
	 * @ordered
	 */
	protected static final String MARGIN_BOTTOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMarginBottom() <em>Margin Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginBottom()
	 * @generated
	 * @ordered
	 */
	protected String marginBottom = MARGIN_BOTTOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getMargin() <em>Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMargin()
	 * @generated
	 * @ordered
	 */
	protected static final String MARGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMargin() <em>Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMargin()
	 * @generated
	 * @ordered
	 */
	protected String margin = MARGIN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarginImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReactNativePackage.Literals.MARGIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMarginTop() {
		return marginTop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarginTop(String newMarginTop) {
		String oldMarginTop = marginTop;
		marginTop = newMarginTop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReactNativePackage.MARGIN__MARGIN_TOP, oldMarginTop, marginTop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMarginBottom() {
		return marginBottom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarginBottom(String newMarginBottom) {
		String oldMarginBottom = marginBottom;
		marginBottom = newMarginBottom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReactNativePackage.MARGIN__MARGIN_BOTTOM, oldMarginBottom, marginBottom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMargin() {
		return margin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMargin(String newMargin) {
		String oldMargin = margin;
		margin = newMargin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReactNativePackage.MARGIN__MARGIN, oldMargin, margin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReactNativePackage.MARGIN__MARGIN_TOP:
				return getMarginTop();
			case ReactNativePackage.MARGIN__MARGIN_BOTTOM:
				return getMarginBottom();
			case ReactNativePackage.MARGIN__MARGIN:
				return getMargin();
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
			case ReactNativePackage.MARGIN__MARGIN_TOP:
				setMarginTop((String)newValue);
				return;
			case ReactNativePackage.MARGIN__MARGIN_BOTTOM:
				setMarginBottom((String)newValue);
				return;
			case ReactNativePackage.MARGIN__MARGIN:
				setMargin((String)newValue);
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
			case ReactNativePackage.MARGIN__MARGIN_TOP:
				setMarginTop(MARGIN_TOP_EDEFAULT);
				return;
			case ReactNativePackage.MARGIN__MARGIN_BOTTOM:
				setMarginBottom(MARGIN_BOTTOM_EDEFAULT);
				return;
			case ReactNativePackage.MARGIN__MARGIN:
				setMargin(MARGIN_EDEFAULT);
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
			case ReactNativePackage.MARGIN__MARGIN_TOP:
				return MARGIN_TOP_EDEFAULT == null ? marginTop != null : !MARGIN_TOP_EDEFAULT.equals(marginTop);
			case ReactNativePackage.MARGIN__MARGIN_BOTTOM:
				return MARGIN_BOTTOM_EDEFAULT == null ? marginBottom != null : !MARGIN_BOTTOM_EDEFAULT.equals(marginBottom);
			case ReactNativePackage.MARGIN__MARGIN:
				return MARGIN_EDEFAULT == null ? margin != null : !MARGIN_EDEFAULT.equals(margin);
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
		result.append(" (marginTop: ");
		result.append(marginTop);
		result.append(", marginBottom: ");
		result.append(marginBottom);
		result.append(", margin: ");
		result.append(margin);
		result.append(')');
		return result.toString();
	}

} //MarginImpl
