/**
 */
package mmMobileLearning;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Video</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mmMobileLearning.Video#getTextInformation <em>Text Information</em>}</li>
 *   <li>{@link mmMobileLearning.Video#getNameVideo <em>Name Video</em>}</li>
 *   <li>{@link mmMobileLearning.Video#getPathVideo <em>Path Video</em>}</li>
 *   <li>{@link mmMobileLearning.Video#getResolution <em>Resolution</em>}</li>
 *   <li>{@link mmMobileLearning.Video#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see mmMobileLearning.MmMobileLearningPackage#getVideo()
 * @model
 * @generated
 */
public interface Video extends ElementInterface {
	/**
	 * Returns the value of the '<em><b>Text Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Information</em>' attribute.
	 * @see #setTextInformation(String)
	 * @see mmMobileLearning.MmMobileLearningPackage#getVideo_TextInformation()
	 * @model
	 * @generated
	 */
	String getTextInformation();

	/**
	 * Sets the value of the '{@link mmMobileLearning.Video#getTextInformation <em>Text Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Information</em>' attribute.
	 * @see #getTextInformation()
	 * @generated
	 */
	void setTextInformation(String value);

	/**
	 * Returns the value of the '<em><b>Name Video</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Video</em>' attribute.
	 * @see #setNameVideo(String)
	 * @see mmMobileLearning.MmMobileLearningPackage#getVideo_NameVideo()
	 * @model
	 * @generated
	 */
	String getNameVideo();

	/**
	 * Sets the value of the '{@link mmMobileLearning.Video#getNameVideo <em>Name Video</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Video</em>' attribute.
	 * @see #getNameVideo()
	 * @generated
	 */
	void setNameVideo(String value);

	/**
	 * Returns the value of the '<em><b>Path Video</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Video</em>' attribute.
	 * @see #setPathVideo(String)
	 * @see mmMobileLearning.MmMobileLearningPackage#getVideo_PathVideo()
	 * @model
	 * @generated
	 */
	String getPathVideo();

	/**
	 * Sets the value of the '{@link mmMobileLearning.Video#getPathVideo <em>Path Video</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Video</em>' attribute.
	 * @see #getPathVideo()
	 * @generated
	 */
	void setPathVideo(String value);

	/**
	 * Returns the value of the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolution</em>' attribute.
	 * @see #setResolution(String)
	 * @see mmMobileLearning.MmMobileLearningPackage#getVideo_Resolution()
	 * @model
	 * @generated
	 */
	String getResolution();

	/**
	 * Sets the value of the '{@link mmMobileLearning.Video#getResolution <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution</em>' attribute.
	 * @see #getResolution()
	 * @generated
	 */
	void setResolution(String value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(int)
	 * @see mmMobileLearning.MmMobileLearningPackage#getVideo_Time()
	 * @model
	 * @generated
	 */
	int getTime();

	/**
	 * Sets the value of the '{@link mmMobileLearning.Video#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(int value);

} // Video
