/**
 */
package mmMobileLearning.impl;

import mmMobileLearning.Audio;
import mmMobileLearning.MmMobileLearningPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Audio</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mmMobileLearning.impl.AudioImpl#getTextInformation <em>Text Information</em>}</li>
 *   <li>{@link mmMobileLearning.impl.AudioImpl#getNameAudio <em>Name Audio</em>}</li>
 *   <li>{@link mmMobileLearning.impl.AudioImpl#getPathAudio <em>Path Audio</em>}</li>
 *   <li>{@link mmMobileLearning.impl.AudioImpl#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AudioImpl extends ElementInterfaceImpl implements Audio {
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
	 * The default value of the '{@link #getNameAudio() <em>Name Audio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameAudio()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_AUDIO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameAudio() <em>Name Audio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameAudio()
	 * @generated
	 * @ordered
	 */
	protected String nameAudio = NAME_AUDIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getPathAudio() <em>Path Audio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathAudio()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_AUDIO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPathAudio() <em>Path Audio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathAudio()
	 * @generated
	 * @ordered
	 */
	protected String pathAudio = PATH_AUDIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final int TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected int time = TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AudioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MmMobileLearningPackage.Literals.AUDIO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MmMobileLearningPackage.AUDIO__TEXT_INFORMATION, oldTextInformation, textInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNameAudio() {
		return nameAudio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNameAudio(String newNameAudio) {
		String oldNameAudio = nameAudio;
		nameAudio = newNameAudio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmMobileLearningPackage.AUDIO__NAME_AUDIO, oldNameAudio, nameAudio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPathAudio() {
		return pathAudio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPathAudio(String newPathAudio) {
		String oldPathAudio = pathAudio;
		pathAudio = newPathAudio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmMobileLearningPackage.AUDIO__PATH_AUDIO, oldPathAudio, pathAudio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTime(int newTime) {
		int oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmMobileLearningPackage.AUDIO__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MmMobileLearningPackage.AUDIO__TEXT_INFORMATION:
				return getTextInformation();
			case MmMobileLearningPackage.AUDIO__NAME_AUDIO:
				return getNameAudio();
			case MmMobileLearningPackage.AUDIO__PATH_AUDIO:
				return getPathAudio();
			case MmMobileLearningPackage.AUDIO__TIME:
				return getTime();
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
			case MmMobileLearningPackage.AUDIO__TEXT_INFORMATION:
				setTextInformation((String)newValue);
				return;
			case MmMobileLearningPackage.AUDIO__NAME_AUDIO:
				setNameAudio((String)newValue);
				return;
			case MmMobileLearningPackage.AUDIO__PATH_AUDIO:
				setPathAudio((String)newValue);
				return;
			case MmMobileLearningPackage.AUDIO__TIME:
				setTime((Integer)newValue);
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
			case MmMobileLearningPackage.AUDIO__TEXT_INFORMATION:
				setTextInformation(TEXT_INFORMATION_EDEFAULT);
				return;
			case MmMobileLearningPackage.AUDIO__NAME_AUDIO:
				setNameAudio(NAME_AUDIO_EDEFAULT);
				return;
			case MmMobileLearningPackage.AUDIO__PATH_AUDIO:
				setPathAudio(PATH_AUDIO_EDEFAULT);
				return;
			case MmMobileLearningPackage.AUDIO__TIME:
				setTime(TIME_EDEFAULT);
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
			case MmMobileLearningPackage.AUDIO__TEXT_INFORMATION:
				return TEXT_INFORMATION_EDEFAULT == null ? textInformation != null : !TEXT_INFORMATION_EDEFAULT.equals(textInformation);
			case MmMobileLearningPackage.AUDIO__NAME_AUDIO:
				return NAME_AUDIO_EDEFAULT == null ? nameAudio != null : !NAME_AUDIO_EDEFAULT.equals(nameAudio);
			case MmMobileLearningPackage.AUDIO__PATH_AUDIO:
				return PATH_AUDIO_EDEFAULT == null ? pathAudio != null : !PATH_AUDIO_EDEFAULT.equals(pathAudio);
			case MmMobileLearningPackage.AUDIO__TIME:
				return time != TIME_EDEFAULT;
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
		result.append(" (textInformation: ");
		result.append(textInformation);
		result.append(", nameAudio: ");
		result.append(nameAudio);
		result.append(", pathAudio: ");
		result.append(pathAudio);
		result.append(", time: ");
		result.append(time);
		result.append(')');
		return result.toString();
	}

} //AudioImpl
