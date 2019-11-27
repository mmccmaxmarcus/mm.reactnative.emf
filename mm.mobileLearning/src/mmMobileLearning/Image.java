/**
 */
package mmMobileLearning;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mmMobileLearning.Image#getTextinformation <em>Textinformation</em>}</li>
 *   <li>{@link mmMobileLearning.Image#getNameImg <em>Name Img</em>}</li>
 *   <li>{@link mmMobileLearning.Image#getPathImg <em>Path Img</em>}</li>
 * </ul>
 *
 * @see mmMobileLearning.MmMobileLearningPackage#getImage()
 * @model
 * @generated
 */
public interface Image extends ElementInterface {
	/**
	 * Returns the value of the '<em><b>Textinformation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textinformation</em>' attribute.
	 * @see #setTextinformation(String)
	 * @see mmMobileLearning.MmMobileLearningPackage#getImage_Textinformation()
	 * @model
	 * @generated
	 */
	String getTextinformation();

	/**
	 * Sets the value of the '{@link mmMobileLearning.Image#getTextinformation <em>Textinformation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Textinformation</em>' attribute.
	 * @see #getTextinformation()
	 * @generated
	 */
	void setTextinformation(String value);

	/**
	 * Returns the value of the '<em><b>Name Img</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Img</em>' attribute.
	 * @see #setNameImg(String)
	 * @see mmMobileLearning.MmMobileLearningPackage#getImage_NameImg()
	 * @model
	 * @generated
	 */
	String getNameImg();

	/**
	 * Sets the value of the '{@link mmMobileLearning.Image#getNameImg <em>Name Img</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Img</em>' attribute.
	 * @see #getNameImg()
	 * @generated
	 */
	void setNameImg(String value);

	/**
	 * Returns the value of the '<em><b>Path Img</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Img</em>' attribute.
	 * @see #setPathImg(String)
	 * @see mmMobileLearning.MmMobileLearningPackage#getImage_PathImg()
	 * @model
	 * @generated
	 */
	String getPathImg();

	/**
	 * Sets the value of the '{@link mmMobileLearning.Image#getPathImg <em>Path Img</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Img</em>' attribute.
	 * @see #getPathImg()
	 * @generated
	 */
	void setPathImg(String value);

} // Image
