/**
 */
package mmMobileLearning.impl;

import mmMobileLearning.MmMobileLearningPackage;
import mmMobileLearning.Text;
import mmMobileLearning.TextType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mmMobileLearning.impl.TextImpl#getTextDisplay <em>Text Display</em>}</li>
 *   <li>{@link mmMobileLearning.impl.TextImpl#getTextInformation <em>Text Information</em>}</li>
 *   <li>{@link mmMobileLearning.impl.TextImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextImpl extends ElementInterfaceImpl implements Text {
	/**
	 * The default value of the '{@link #getTextDisplay() <em>Text Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextDisplay()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_DISPLAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextDisplay() <em>Text Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextDisplay()
	 * @generated
	 * @ordered
	 */
	protected String textDisplay = TEXT_DISPLAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextInformation() <em>Text Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextInformation()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_INFORMATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextInformation() <em>Text Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextInformation()
	 * @generated
	 * @ordered
	 */
	protected String textInformation = TEXT_INFORMATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TextType TYPE_EDEFAULT = TextType.TEXTLINE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TextType type = TYPE_EDEFAULT;

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
		return MmMobileLearningPackage.Literals.TEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTextDisplay() {
		return textDisplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextDisplay(String newTextDisplay) {
		String oldTextDisplay = textDisplay;
		textDisplay = newTextDisplay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmMobileLearningPackage.TEXT__TEXT_DISPLAY, oldTextDisplay, textDisplay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTextInformation() {
		return textInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextInformation(String newTextInformation) {
		String oldTextInformation = textInformation;
		textInformation = newTextInformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmMobileLearningPackage.TEXT__TEXT_INFORMATION, oldTextInformation, textInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(TextType newType) {
		TextType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmMobileLearningPackage.TEXT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MmMobileLearningPackage.TEXT__TEXT_DISPLAY:
				return getTextDisplay();
			case MmMobileLearningPackage.TEXT__TEXT_INFORMATION:
				return getTextInformation();
			case MmMobileLearningPackage.TEXT__TYPE:
				return getType();
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
			case MmMobileLearningPackage.TEXT__TEXT_DISPLAY:
				setTextDisplay((String)newValue);
				return;
			case MmMobileLearningPackage.TEXT__TEXT_INFORMATION:
				setTextInformation((String)newValue);
				return;
			case MmMobileLearningPackage.TEXT__TYPE:
				setType((TextType)newValue);
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
			case MmMobileLearningPackage.TEXT__TEXT_DISPLAY:
				setTextDisplay(TEXT_DISPLAY_EDEFAULT);
				return;
			case MmMobileLearningPackage.TEXT__TEXT_INFORMATION:
				setTextInformation(TEXT_INFORMATION_EDEFAULT);
				return;
			case MmMobileLearningPackage.TEXT__TYPE:
				setType(TYPE_EDEFAULT);
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
			case MmMobileLearningPackage.TEXT__TEXT_DISPLAY:
				return TEXT_DISPLAY_EDEFAULT == null ? textDisplay != null : !TEXT_DISPLAY_EDEFAULT.equals(textDisplay);
			case MmMobileLearningPackage.TEXT__TEXT_INFORMATION:
				return TEXT_INFORMATION_EDEFAULT == null ? textInformation != null : !TEXT_INFORMATION_EDEFAULT.equals(textInformation);
			case MmMobileLearningPackage.TEXT__TYPE:
				return type != TYPE_EDEFAULT;
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
		result.append(" (textDisplay: ");
		result.append(textDisplay);
		result.append(", textInformation: ");
		result.append(textInformation);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //TextImpl
