/**
 */
package mmMobileLearning.impl;

import mmMobileLearning.Image;
import mmMobileLearning.MmMobileLearningPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mmMobileLearning.impl.ImageImpl#getTextinformation <em>Textinformation</em>}</li>
 *   <li>{@link mmMobileLearning.impl.ImageImpl#getNameImg <em>Name Img</em>}</li>
 *   <li>{@link mmMobileLearning.impl.ImageImpl#getPathImg <em>Path Img</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageImpl extends ElementInterfaceImpl implements Image {
	/**
	 * The default value of the '{@link #getTextinformation() <em>Textinformation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextinformation()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXTINFORMATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextinformation() <em>Textinformation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextinformation()
	 * @generated
	 * @ordered
	 */
	protected String textinformation = TEXTINFORMATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getNameImg() <em>Name Img</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameImg()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_IMG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameImg() <em>Name Img</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameImg()
	 * @generated
	 * @ordered
	 */
	protected String nameImg = NAME_IMG_EDEFAULT;

	/**
	 * The default value of the '{@link #getPathImg() <em>Path Img</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathImg()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_IMG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPathImg() <em>Path Img</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathImg()
	 * @generated
	 * @ordered
	 */
	protected String pathImg = PATH_IMG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MmMobileLearningPackage.Literals.IMAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTextinformation() {
		return textinformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextinformation(String newTextinformation) {
		String oldTextinformation = textinformation;
		textinformation = newTextinformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmMobileLearningPackage.IMAGE__TEXTINFORMATION, oldTextinformation, textinformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNameImg() {
		return nameImg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNameImg(String newNameImg) {
		String oldNameImg = nameImg;
		nameImg = newNameImg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmMobileLearningPackage.IMAGE__NAME_IMG, oldNameImg, nameImg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPathImg() {
		return pathImg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPathImg(String newPathImg) {
		String oldPathImg = pathImg;
		pathImg = newPathImg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmMobileLearningPackage.IMAGE__PATH_IMG, oldPathImg, pathImg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MmMobileLearningPackage.IMAGE__TEXTINFORMATION:
				return getTextinformation();
			case MmMobileLearningPackage.IMAGE__NAME_IMG:
				return getNameImg();
			case MmMobileLearningPackage.IMAGE__PATH_IMG:
				return getPathImg();
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
			case MmMobileLearningPackage.IMAGE__TEXTINFORMATION:
				setTextinformation((String)newValue);
				return;
			case MmMobileLearningPackage.IMAGE__NAME_IMG:
				setNameImg((String)newValue);
				return;
			case MmMobileLearningPackage.IMAGE__PATH_IMG:
				setPathImg((String)newValue);
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
			case MmMobileLearningPackage.IMAGE__TEXTINFORMATION:
				setTextinformation(TEXTINFORMATION_EDEFAULT);
				return;
			case MmMobileLearningPackage.IMAGE__NAME_IMG:
				setNameImg(NAME_IMG_EDEFAULT);
				return;
			case MmMobileLearningPackage.IMAGE__PATH_IMG:
				setPathImg(PATH_IMG_EDEFAULT);
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
			case MmMobileLearningPackage.IMAGE__TEXTINFORMATION:
				return TEXTINFORMATION_EDEFAULT == null ? textinformation != null : !TEXTINFORMATION_EDEFAULT.equals(textinformation);
			case MmMobileLearningPackage.IMAGE__NAME_IMG:
				return NAME_IMG_EDEFAULT == null ? nameImg != null : !NAME_IMG_EDEFAULT.equals(nameImg);
			case MmMobileLearningPackage.IMAGE__PATH_IMG:
				return PATH_IMG_EDEFAULT == null ? pathImg != null : !PATH_IMG_EDEFAULT.equals(pathImg);
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
		result.append(" (textinformation: ");
		result.append(textinformation);
		result.append(", nameImg: ");
		result.append(nameImg);
		result.append(", pathImg: ");
		result.append(pathImg);
		result.append(')');
		return result.toString();
	}

} //ImageImpl
