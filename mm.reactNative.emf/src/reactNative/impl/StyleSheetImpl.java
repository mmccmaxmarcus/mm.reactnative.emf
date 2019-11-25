/**
 */
package reactNative.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import reactNative.Border;
import reactNative.FlexBox;
import reactNative.Font;
import reactNative.Margin;
import reactNative.Padding;
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
 *   <li>{@link reactNative.impl.StyleSheetImpl#getHasMargin <em>Has Margin</em>}</li>
 *   <li>{@link reactNative.impl.StyleSheetImpl#getHasBorder <em>Has Border</em>}</li>
 *   <li>{@link reactNative.impl.StyleSheetImpl#getHasPadding <em>Has Padding</em>}</li>
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
	 * The cached value of the '{@link #getHasMargin() <em>Has Margin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasMargin()
	 * @generated
	 * @ordered
	 */
	protected Margin hasMargin;

	/**
	 * The cached value of the '{@link #getHasBorder() <em>Has Border</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasBorder()
	 * @generated
	 * @ordered
	 */
	protected Border hasBorder;

	/**
	 * The cached value of the '{@link #getHasPadding() <em>Has Padding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPadding()
	 * @generated
	 * @ordered
	 */
	protected Padding hasPadding;

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
	public Margin getHasMargin() {
		return hasMargin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasMargin(Margin newHasMargin, NotificationChain msgs) {
		Margin oldHasMargin = hasMargin;
		hasMargin = newHasMargin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReactNativePackage.STYLE_SHEET__HAS_MARGIN, oldHasMargin, newHasMargin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasMargin(Margin newHasMargin) {
		if (newHasMargin != hasMargin) {
			NotificationChain msgs = null;
			if (hasMargin != null)
				msgs = ((InternalEObject)hasMargin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReactNativePackage.STYLE_SHEET__HAS_MARGIN, null, msgs);
			if (newHasMargin != null)
				msgs = ((InternalEObject)newHasMargin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReactNativePackage.STYLE_SHEET__HAS_MARGIN, null, msgs);
			msgs = basicSetHasMargin(newHasMargin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReactNativePackage.STYLE_SHEET__HAS_MARGIN, newHasMargin, newHasMargin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Border getHasBorder() {
		return hasBorder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasBorder(Border newHasBorder, NotificationChain msgs) {
		Border oldHasBorder = hasBorder;
		hasBorder = newHasBorder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReactNativePackage.STYLE_SHEET__HAS_BORDER, oldHasBorder, newHasBorder);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasBorder(Border newHasBorder) {
		if (newHasBorder != hasBorder) {
			NotificationChain msgs = null;
			if (hasBorder != null)
				msgs = ((InternalEObject)hasBorder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReactNativePackage.STYLE_SHEET__HAS_BORDER, null, msgs);
			if (newHasBorder != null)
				msgs = ((InternalEObject)newHasBorder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReactNativePackage.STYLE_SHEET__HAS_BORDER, null, msgs);
			msgs = basicSetHasBorder(newHasBorder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReactNativePackage.STYLE_SHEET__HAS_BORDER, newHasBorder, newHasBorder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Padding getHasPadding() {
		return hasPadding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasPadding(Padding newHasPadding, NotificationChain msgs) {
		Padding oldHasPadding = hasPadding;
		hasPadding = newHasPadding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReactNativePackage.STYLE_SHEET__HAS_PADDING, oldHasPadding, newHasPadding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasPadding(Padding newHasPadding) {
		if (newHasPadding != hasPadding) {
			NotificationChain msgs = null;
			if (hasPadding != null)
				msgs = ((InternalEObject)hasPadding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReactNativePackage.STYLE_SHEET__HAS_PADDING, null, msgs);
			if (newHasPadding != null)
				msgs = ((InternalEObject)newHasPadding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReactNativePackage.STYLE_SHEET__HAS_PADDING, null, msgs);
			msgs = basicSetHasPadding(newHasPadding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReactNativePackage.STYLE_SHEET__HAS_PADDING, newHasPadding, newHasPadding));
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
			case ReactNativePackage.STYLE_SHEET__HAS_MARGIN:
				return basicSetHasMargin(null, msgs);
			case ReactNativePackage.STYLE_SHEET__HAS_BORDER:
				return basicSetHasBorder(null, msgs);
			case ReactNativePackage.STYLE_SHEET__HAS_PADDING:
				return basicSetHasPadding(null, msgs);
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
			case ReactNativePackage.STYLE_SHEET__HAS_MARGIN:
				return getHasMargin();
			case ReactNativePackage.STYLE_SHEET__HAS_BORDER:
				return getHasBorder();
			case ReactNativePackage.STYLE_SHEET__HAS_PADDING:
				return getHasPadding();
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
			case ReactNativePackage.STYLE_SHEET__HAS_MARGIN:
				setHasMargin((Margin)newValue);
				return;
			case ReactNativePackage.STYLE_SHEET__HAS_BORDER:
				setHasBorder((Border)newValue);
				return;
			case ReactNativePackage.STYLE_SHEET__HAS_PADDING:
				setHasPadding((Padding)newValue);
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
			case ReactNativePackage.STYLE_SHEET__HAS_MARGIN:
				setHasMargin((Margin)null);
				return;
			case ReactNativePackage.STYLE_SHEET__HAS_BORDER:
				setHasBorder((Border)null);
				return;
			case ReactNativePackage.STYLE_SHEET__HAS_PADDING:
				setHasPadding((Padding)null);
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
			case ReactNativePackage.STYLE_SHEET__HAS_MARGIN:
				return hasMargin != null;
			case ReactNativePackage.STYLE_SHEET__HAS_BORDER:
				return hasBorder != null;
			case ReactNativePackage.STYLE_SHEET__HAS_PADDING:
				return hasPadding != null;
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
