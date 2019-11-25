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

import reactNative.ReactNativePackage;
import reactNative.StyleSheet;
import reactNative.Text;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link reactNative.impl.TextImpl#getContentText <em>Content Text</em>}</li>
 *   <li>{@link reactNative.impl.TextImpl#getColor <em>Color</em>}</li>
 *   <li>{@link reactNative.impl.TextImpl#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link reactNative.impl.TextImpl#getTextAlign <em>Text Align</em>}</li>
 *   <li>{@link reactNative.impl.TextImpl#getName <em>Name</em>}</li>
 *   <li>{@link reactNative.impl.TextImpl#getTextToStylesheet <em>Text To Stylesheet</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextImpl extends MinimalEObjectImpl.Container implements Text {
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
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected String color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontSize() <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontSize()
	 * @generated
	 * @ordered
	 */
	protected static final int FONT_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFontSize() <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontSize()
	 * @generated
	 * @ordered
	 */
	protected int fontSize = FONT_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextAlign() <em>Text Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextAlign()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_ALIGN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextAlign() <em>Text Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextAlign()
	 * @generated
	 * @ordered
	 */
	protected String textAlign = TEXT_ALIGN_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTextToStylesheet() <em>Text To Stylesheet</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextToStylesheet()
	 * @generated
	 * @ordered
	 */
	protected EList<StyleSheet> textToStylesheet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReactNativePackage.Literals.TEXT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReactNativePackage.TEXT__CONTENT_TEXT, oldContentText, contentText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(String newColor) {
		String oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReactNativePackage.TEXT__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFontSize() {
		return fontSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontSize(int newFontSize) {
		int oldFontSize = fontSize;
		fontSize = newFontSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReactNativePackage.TEXT__FONT_SIZE, oldFontSize, fontSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextAlign() {
		return textAlign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextAlign(String newTextAlign) {
		String oldTextAlign = textAlign;
		textAlign = newTextAlign;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReactNativePackage.TEXT__TEXT_ALIGN, oldTextAlign, textAlign));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReactNativePackage.TEXT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StyleSheet> getTextToStylesheet() {
		if (textToStylesheet == null) {
			textToStylesheet = new EObjectContainmentEList<StyleSheet>(StyleSheet.class, this, ReactNativePackage.TEXT__TEXT_TO_STYLESHEET);
		}
		return textToStylesheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReactNativePackage.TEXT__TEXT_TO_STYLESHEET:
				return ((InternalEList<?>)getTextToStylesheet()).basicRemove(otherEnd, msgs);
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
			case ReactNativePackage.TEXT__CONTENT_TEXT:
				return getContentText();
			case ReactNativePackage.TEXT__COLOR:
				return getColor();
			case ReactNativePackage.TEXT__FONT_SIZE:
				return getFontSize();
			case ReactNativePackage.TEXT__TEXT_ALIGN:
				return getTextAlign();
			case ReactNativePackage.TEXT__NAME:
				return getName();
			case ReactNativePackage.TEXT__TEXT_TO_STYLESHEET:
				return getTextToStylesheet();
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
			case ReactNativePackage.TEXT__CONTENT_TEXT:
				setContentText((String)newValue);
				return;
			case ReactNativePackage.TEXT__COLOR:
				setColor((String)newValue);
				return;
			case ReactNativePackage.TEXT__FONT_SIZE:
				setFontSize((Integer)newValue);
				return;
			case ReactNativePackage.TEXT__TEXT_ALIGN:
				setTextAlign((String)newValue);
				return;
			case ReactNativePackage.TEXT__NAME:
				setName((String)newValue);
				return;
			case ReactNativePackage.TEXT__TEXT_TO_STYLESHEET:
				getTextToStylesheet().clear();
				getTextToStylesheet().addAll((Collection<? extends StyleSheet>)newValue);
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
			case ReactNativePackage.TEXT__CONTENT_TEXT:
				setContentText(CONTENT_TEXT_EDEFAULT);
				return;
			case ReactNativePackage.TEXT__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case ReactNativePackage.TEXT__FONT_SIZE:
				setFontSize(FONT_SIZE_EDEFAULT);
				return;
			case ReactNativePackage.TEXT__TEXT_ALIGN:
				setTextAlign(TEXT_ALIGN_EDEFAULT);
				return;
			case ReactNativePackage.TEXT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ReactNativePackage.TEXT__TEXT_TO_STYLESHEET:
				getTextToStylesheet().clear();
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
			case ReactNativePackage.TEXT__CONTENT_TEXT:
				return CONTENT_TEXT_EDEFAULT == null ? contentText != null : !CONTENT_TEXT_EDEFAULT.equals(contentText);
			case ReactNativePackage.TEXT__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
			case ReactNativePackage.TEXT__FONT_SIZE:
				return fontSize != FONT_SIZE_EDEFAULT;
			case ReactNativePackage.TEXT__TEXT_ALIGN:
				return TEXT_ALIGN_EDEFAULT == null ? textAlign != null : !TEXT_ALIGN_EDEFAULT.equals(textAlign);
			case ReactNativePackage.TEXT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ReactNativePackage.TEXT__TEXT_TO_STYLESHEET:
				return textToStylesheet != null && !textToStylesheet.isEmpty();
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
		result.append(", color: ");
		result.append(color);
		result.append(", fontSize: ");
		result.append(fontSize);
		result.append(", textAlign: ");
		result.append(textAlign);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TextImpl
