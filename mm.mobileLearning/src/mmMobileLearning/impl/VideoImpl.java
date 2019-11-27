/**
 */
package mmMobileLearning.impl;

import mmMobileLearning.MmMobileLearningPackage;
import mmMobileLearning.Video;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Video</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mmMobileLearning.impl.VideoImpl#getTextInformation <em>Text Information</em>}</li>
 *   <li>{@link mmMobileLearning.impl.VideoImpl#getNameVideo <em>Name Video</em>}</li>
 *   <li>{@link mmMobileLearning.impl.VideoImpl#getPathVideo <em>Path Video</em>}</li>
 *   <li>{@link mmMobileLearning.impl.VideoImpl#getResolution <em>Resolution</em>}</li>
 *   <li>{@link mmMobileLearning.impl.VideoImpl#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VideoImpl extends ElementInterfaceImpl implements Video {
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
	 * The default value of the '{@link #getNameVideo() <em>Name Video</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameVideo()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_VIDEO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameVideo() <em>Name Video</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameVideo()
	 * @generated
	 * @ordered
	 */
	protected String nameVideo = NAME_VIDEO_EDEFAULT;

	/**
	 * The default value of the '{@link #getPathVideo() <em>Path Video</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathVideo()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_VIDEO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPathVideo() <em>Path Video</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathVideo()
	 * @generated
	 * @ordered
	 */
	protected String pathVideo = PATH_VIDEO_EDEFAULT;

	/**
	 * The default value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOLUTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected String resolution = RESOLUTION_EDEFAULT;

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
	protected VideoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MmMobileLearningPackage.Literals.VIDEO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MmMobileLearningPackage.VIDEO__TEXT_INFORMATION, oldTextInformation, textInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNameVideo() {
		return nameVideo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNameVideo(String newNameVideo) {
		String oldNameVideo = nameVideo;
		nameVideo = newNameVideo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmMobileLearningPackage.VIDEO__NAME_VIDEO, oldNameVideo, nameVideo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPathVideo() {
		return pathVideo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPathVideo(String newPathVideo) {
		String oldPathVideo = pathVideo;
		pathVideo = newPathVideo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmMobileLearningPackage.VIDEO__PATH_VIDEO, oldPathVideo, pathVideo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResolution() {
		return resolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResolution(String newResolution) {
		String oldResolution = resolution;
		resolution = newResolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmMobileLearningPackage.VIDEO__RESOLUTION, oldResolution, resolution));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MmMobileLearningPackage.VIDEO__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MmMobileLearningPackage.VIDEO__TEXT_INFORMATION:
				return getTextInformation();
			case MmMobileLearningPackage.VIDEO__NAME_VIDEO:
				return getNameVideo();
			case MmMobileLearningPackage.VIDEO__PATH_VIDEO:
				return getPathVideo();
			case MmMobileLearningPackage.VIDEO__RESOLUTION:
				return getResolution();
			case MmMobileLearningPackage.VIDEO__TIME:
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
			case MmMobileLearningPackage.VIDEO__TEXT_INFORMATION:
				setTextInformation((String)newValue);
				return;
			case MmMobileLearningPackage.VIDEO__NAME_VIDEO:
				setNameVideo((String)newValue);
				return;
			case MmMobileLearningPackage.VIDEO__PATH_VIDEO:
				setPathVideo((String)newValue);
				return;
			case MmMobileLearningPackage.VIDEO__RESOLUTION:
				setResolution((String)newValue);
				return;
			case MmMobileLearningPackage.VIDEO__TIME:
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
			case MmMobileLearningPackage.VIDEO__TEXT_INFORMATION:
				setTextInformation(TEXT_INFORMATION_EDEFAULT);
				return;
			case MmMobileLearningPackage.VIDEO__NAME_VIDEO:
				setNameVideo(NAME_VIDEO_EDEFAULT);
				return;
			case MmMobileLearningPackage.VIDEO__PATH_VIDEO:
				setPathVideo(PATH_VIDEO_EDEFAULT);
				return;
			case MmMobileLearningPackage.VIDEO__RESOLUTION:
				setResolution(RESOLUTION_EDEFAULT);
				return;
			case MmMobileLearningPackage.VIDEO__TIME:
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
			case MmMobileLearningPackage.VIDEO__TEXT_INFORMATION:
				return TEXT_INFORMATION_EDEFAULT == null ? textInformation != null : !TEXT_INFORMATION_EDEFAULT.equals(textInformation);
			case MmMobileLearningPackage.VIDEO__NAME_VIDEO:
				return NAME_VIDEO_EDEFAULT == null ? nameVideo != null : !NAME_VIDEO_EDEFAULT.equals(nameVideo);
			case MmMobileLearningPackage.VIDEO__PATH_VIDEO:
				return PATH_VIDEO_EDEFAULT == null ? pathVideo != null : !PATH_VIDEO_EDEFAULT.equals(pathVideo);
			case MmMobileLearningPackage.VIDEO__RESOLUTION:
				return RESOLUTION_EDEFAULT == null ? resolution != null : !RESOLUTION_EDEFAULT.equals(resolution);
			case MmMobileLearningPackage.VIDEO__TIME:
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
		result.append(", nameVideo: ");
		result.append(nameVideo);
		result.append(", pathVideo: ");
		result.append(pathVideo);
		result.append(", resolution: ");
		result.append(resolution);
		result.append(", time: ");
		result.append(time);
		result.append(')');
		return result.toString();
	}

} //VideoImpl
