/**
 */
package mmMobileLearning;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mmMobileLearning.Text#getTextDisplay <em>Text Display</em>}</li>
 *   <li>{@link mmMobileLearning.Text#getTextInformation <em>Text Information</em>}</li>
 *   <li>{@link mmMobileLearning.Text#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see mmMobileLearning.MmMobileLearningPackage#getText()
 * @model
 * @generated
 */
public interface Text extends ElementInterface {
	/**
	 * Returns the value of the '<em><b>Text Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Display</em>' attribute.
	 * @see #setTextDisplay(String)
	 * @see mmMobileLearning.MmMobileLearningPackage#getText_TextDisplay()
	 * @model
	 * @generated
	 */
	String getTextDisplay();

	/**
	 * Sets the value of the '{@link mmMobileLearning.Text#getTextDisplay <em>Text Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Display</em>' attribute.
	 * @see #getTextDisplay()
	 * @generated
	 */
	void setTextDisplay(String value);

	/**
	 * Returns the value of the '<em><b>Text Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Information</em>' attribute.
	 * @see #setTextInformation(String)
	 * @see mmMobileLearning.MmMobileLearningPackage#getText_TextInformation()
	 * @model
	 * @generated
	 */
	String getTextInformation();

	/**
	 * Sets the value of the '{@link mmMobileLearning.Text#getTextInformation <em>Text Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Information</em>' attribute.
	 * @see #getTextInformation()
	 * @generated
	 */
	void setTextInformation(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link mmMobileLearning.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see mmMobileLearning.TextType
	 * @see #setType(TextType)
	 * @see mmMobileLearning.MmMobileLearningPackage#getText_Type()
	 * @model
	 * @generated
	 */
	TextType getType();

	/**
	 * Sets the value of the '{@link mmMobileLearning.Text#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see mmMobileLearning.TextType
	 * @see #getType()
	 * @generated
	 */
	void setType(TextType value);

} // Text
