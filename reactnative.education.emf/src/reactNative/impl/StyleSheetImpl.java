/**
 */
package reactNative.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import reactNative.FlexBox;
import reactNative.Font;
import reactNative.ReactNativePackage;
import reactNative.StyleSheet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Style Sheet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link reactNative.impl.StyleSheetImpl#getNameStyle <em>Name Style</em>}</li>
 *   <li>{@link reactNative.impl.StyleSheetImpl#getHasFlexbox <em>Has Flexbox</em>}</li>
 *   <li>{@link reactNative.impl.StyleSheetImpl#getHasFont <em>Has Font</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StyleSheetImpl extends MinimalEObjectImpl.Container implements StyleSheet {
	/**
	 * The default value of the '{@link #getNameStyle() <em>Name Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameStyle() <em>Name Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameStyle()
	 * @generated
	 * @ordered
	 */
	protected String nameStyle = NAME_STYLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasFlexbox() <em>Has Flexbox</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasFlexbox()
	 * @generated
	 * @ordered
	 */
	protected FlexBox hasFlexbox;

	/**
	 * The cached value of the '{@link #getHasFont() <em>Has Font</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasFont()
	 * @generated
	 * @ordered
	 */
	protected Font hasFont;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StyleSheetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReactNativePackage.Literals.STYLE_SHEET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameStyle() {
		return nameStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameStyle(String newNameStyle) {
		String oldNameStyle = nameStyle;
		nameStyle = newNameStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReactNativePackage.STYLE_SHEET__NAME_STYLE, oldNameStyle, nameStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlexBox getHasFlexbox() {
		return hasFlexbox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasFlexbox(FlexBox newHasFlexbox, NotificationChain msgs) {
		FlexBox oldHasFlexbox = hasFlexbox;
		hasFlexbox = newHasFlexbox;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReactNativePackage.STYLE_SHEET__HAS_FLEXBOX, oldHasFlexbox, newHasFlexbox);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasFlexbox(FlexBox newHasFlexbox) {
		if (newHasFlexbox != hasFlexbox) {
			NotificationChain msgs = null;
			if (hasFlexbox != null)
				msgs = ((InternalEObject)hasFlexbox).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReactNativePackage.STYLE_SHEET__HAS_FLEXBOX, null, msgs);
			if (newHasFlexbox != null)
				msgs = ((InternalEObject)newHasFlexbox).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReactNativePackage.STYLE_SHEET__HAS_FLEXBOX, null, msgs);
			msgs = basicSetHasFlexbox(newHasFlexbox, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReactNativePackage.STYLE_SHEET__HAS_FLEXBOX, newHasFlexbox, newHasFlexbox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Font getHasFont() {
		return hasFont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasFont(Font newHasFont, NotificationChain msgs) {
		Font oldHasFont = hasFont;
		hasFont = newHasFont;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReactNativePackage.STYLE_SHEET__HAS_FONT, oldHasFont, newHasFont);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasFont(Font newHasFont) {
		if (newHasFont != hasFont) {
			NotificationChain msgs = null;
			if (hasFont != null)
				msgs = ((InternalEObject)hasFont).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReactNativePackage.STYLE_SHEET__HAS_FONT, null, msgs);
			if (newHasFont != null)
				msgs = ((InternalEObject)newHasFont).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReactNativePackage.STYLE_SHEET__HAS_FONT, null, msgs);
			msgs = basicSetHasFont(newHasFont, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReactNativePackage.STYLE_SHEET__HAS_FONT, newHasFont, newHasFont));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReactNativePackage.STYLE_SHEET__HAS_FLEXBOX:
				return basicSetHasFlexbox(null, msgs);
			case ReactNativePackage.STYLE_SHEET__HAS_FONT:
				return basicSetHasFont(null, msgs);
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
			case ReactNativePackage.STYLE_SHEET__NAME_STYLE:
				return getNameStyle();
			case ReactNativePackage.STYLE_SHEET__HAS_FLEXBOX:
				return getHasFlexbox();
			case ReactNativePackage.STYLE_SHEET__HAS_FONT:
				return getHasFont();
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
			case ReactNativePackage.STYLE_SHEET__NAME_STYLE:
				setNameStyle((String)newValue);
				return;
			case ReactNativePackage.STYLE_SHEET__HAS_FLEXBOX:
				setHasFlexbox((FlexBox)newValue);
				return;
			case ReactNativePackage.STYLE_SHEET__HAS_FONT:
				setHasFont((Font)newValue);
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
			case ReactNativePackage.STYLE_SHEET__NAME_STYLE:
				setNameStyle(NAME_STYLE_EDEFAULT);
				return;
			case ReactNativePackage.STYLE_SHEET__HAS_FLEXBOX:
				setHasFlexbox((FlexBox)null);
				return;
			case ReactNativePackage.STYLE_SHEET__HAS_FONT:
				setHasFont((Font)null);
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
			case ReactNativePackage.STYLE_SHEET__NAME_STYLE:
				return NAME_STYLE_EDEFAULT == null ? nameStyle != null : !NAME_STYLE_EDEFAULT.equals(nameStyle);
			case ReactNativePackage.STYLE_SHEET__HAS_FLEXBOX:
				return hasFlexbox != null;
			case ReactNativePackage.STYLE_SHEET__HAS_FONT:
				return hasFont != null;
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
		result.append(" (nameStyle: ");
		result.append(nameStyle);
		result.append(')');
		return result.toString();
	}

} //StyleSheetImpl
