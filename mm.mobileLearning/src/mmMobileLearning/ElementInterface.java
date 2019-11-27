/**
 */
package mmMobileLearning;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mmMobileLearning.ElementInterface#getLabel <em>Label</em>}</li>
 *   <li>{@link mmMobileLearning.ElementInterface#getSubElementInterface <em>Sub Element Interface</em>}</li>
 *   <li>{@link mmMobileLearning.ElementInterface#getOrigemElement <em>Origem Element</em>}</li>
 * </ul>
 *
 * @see mmMobileLearning.MmMobileLearningPackage#getElementInterface()
 * @model
 * @generated
 */
public interface ElementInterface extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see mmMobileLearning.MmMobileLearningPackage#getElementInterface_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link mmMobileLearning.ElementInterface#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Sub Element Interface</b></em>' containment reference list.
	 * The list contents are of type {@link mmMobileLearning.ElementInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Element Interface</em>' containment reference list.
	 * @see mmMobileLearning.MmMobileLearningPackage#getElementInterface_SubElementInterface()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElementInterface> getSubElementInterface();

	/**
	 * Returns the value of the '<em><b>Origem Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origem Element</em>' attribute.
	 * @see #setOrigemElement(String)
	 * @see mmMobileLearning.MmMobileLearningPackage#getElementInterface_OrigemElement()
	 * @model
	 * @generated
	 */
	String getOrigemElement();

	/**
	 * Sets the value of the '{@link mmMobileLearning.ElementInterface#getOrigemElement <em>Origem Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origem Element</em>' attribute.
	 * @see #getOrigemElement()
	 * @generated
	 */
	void setOrigemElement(String value);

} // ElementInterface
