/**
 */
package mmMobileLearning;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Audio</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mmMobileLearning.Audio#getTextInformation <em>Text Information</em>}</li>
 *   <li>{@link mmMobileLearning.Audio#getNameAudio <em>Name Audio</em>}</li>
 *   <li>{@link mmMobileLearning.Audio#getPathAudio <em>Path Audio</em>}</li>
 *   <li>{@link mmMobileLearning.Audio#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see mmMobileLearning.MmMobileLearningPackage#getAudio()
 * @model
 * @generated
 */
public interface Audio extends ElementInterface {
	/**
	 * Returns the value of the '<em><b>Text Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Information</em>' attribute.
	 * @see #setTextInformation(String)
	 * @see mmMobileLearning.MmMobileLearningPackage#getAudio_TextInformation()
	 * @model
	 * @generated
	 */
	String getTextInformation();

	/**
	 * Sets the value of the '{@link mmMobileLearning.Audio#getTextInformation <em>Text Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Information</em>' attribute.
	 * @see #getTextInformation()
	 * @generated
	 */
	void setTextInformation(String value);

	/**
	 * Returns the value of the '<em><b>Name Audio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Audio</em>' attribute.
	 * @see #setNameAudio(String)
	 * @see mmMobileLearning.MmMobileLearningPackage#getAudio_NameAudio()
	 * @model
	 * @generated
	 */
	String getNameAudio();

	/**
	 * Sets the value of the '{@link mmMobileLearning.Audio#getNameAudio <em>Name Audio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Audio</em>' attribute.
	 * @see #getNameAudio()
	 * @generated
	 */
	void setNameAudio(String value);

	/**
	 * Returns the value of the '<em><b>Path Audio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Audio</em>' attribute.
	 * @see #setPathAudio(String)
	 * @see mmMobileLearning.MmMobileLearningPackage#getAudio_PathAudio()
	 * @model
	 * @generated
	 */
	String getPathAudio();

	/**
	 * Sets the value of the '{@link mmMobileLearning.Audio#getPathAudio <em>Path Audio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Audio</em>' attribute.
	 * @see #getPathAudio()
	 * @generated
	 */
	void setPathAudio(String value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(int)
	 * @see mmMobileLearning.MmMobileLearningPackage#getAudio_Time()
	 * @model
	 * @generated
	 */
	int getTime();

	/**
	 * Sets the value of the '{@link mmMobileLearning.Audio#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(int value);

} // Audio
