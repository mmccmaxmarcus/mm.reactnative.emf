/**
 */
package mmMobileLearning;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Screen</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mmMobileLearning.Screen#getLabel <em>Label</em>}</li>
 *   <li>{@link mmMobileLearning.Screen#getScreenToElementInterface <em>Screen To Element Interface</em>}</li>
 *   <li>{@link mmMobileLearning.Screen#getOrigemElement <em>Origem Element</em>}</li>
 *   <li>{@link mmMobileLearning.Screen#getScreenToMModule <em>Screen To MModule</em>}</li>
 * </ul>
 *
 * @see mmMobileLearning.MmMobileLearningPackage#getScreen()
 * @model
 * @generated
 */
public interface Screen extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see mmMobileLearning.MmMobileLearningPackage#getScreen_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link mmMobileLearning.Screen#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Screen To Element Interface</b></em>' containment reference list.
	 * The list contents are of type {@link mmMobileLearning.ElementInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screen To Element Interface</em>' containment reference list.
	 * @see mmMobileLearning.MmMobileLearningPackage#getScreen_ScreenToElementInterface()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElementInterface> getScreenToElementInterface();

	/**
	 * Returns the value of the '<em><b>Origem Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origem Element</em>' attribute.
	 * @see #setOrigemElement(String)
	 * @see mmMobileLearning.MmMobileLearningPackage#getScreen_OrigemElement()
	 * @model
	 * @generated
	 */
	String getOrigemElement();

	/**
	 * Sets the value of the '{@link mmMobileLearning.Screen#getOrigemElement <em>Origem Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origem Element</em>' attribute.
	 * @see #getOrigemElement()
	 * @generated
	 */
	void setOrigemElement(String value);

	/**
	 * Returns the value of the '<em><b>Screen To MModule</b></em>' containment reference list.
	 * The list contents are of type {@link mmMobileLearning.MModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screen To MModule</em>' containment reference list.
	 * @see mmMobileLearning.MmMobileLearningPackage#getScreen_ScreenToMModule()
	 * @model containment="true"
	 * @generated
	 */
	EList<MModule> getScreenToMModule();

} // Screen
