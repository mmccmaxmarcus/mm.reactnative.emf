/**
 */
package mmMobileLearning;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MConcept</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mmMobileLearning.MConcept#getNameMConcept <em>Name MConcept</em>}</li>
 *   <li>{@link mmMobileLearning.MConcept#getMSubConcept <em>MSub Concept</em>}</li>
 *   <li>{@link mmMobileLearning.MConcept#getMHasReference <em>MHas Reference</em>}</li>
 *   <li>{@link mmMobileLearning.MConcept#getMConceptToScreen <em>MConcept To Screen</em>}</li>
 * </ul>
 *
 * @see mmMobileLearning.MmMobileLearningPackage#getMConcept()
 * @model
 * @generated
 */
public interface MConcept extends EObject {
	/**
	 * Returns the value of the '<em><b>Name MConcept</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name MConcept</em>' attribute.
	 * @see #setNameMConcept(String)
	 * @see mmMobileLearning.MmMobileLearningPackage#getMConcept_NameMConcept()
	 * @model
	 * @generated
	 */
	String getNameMConcept();

	/**
	 * Sets the value of the '{@link mmMobileLearning.MConcept#getNameMConcept <em>Name MConcept</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name MConcept</em>' attribute.
	 * @see #getNameMConcept()
	 * @generated
	 */
	void setNameMConcept(String value);

	/**
	 * Returns the value of the '<em><b>MSub Concept</b></em>' containment reference list.
	 * The list contents are of type {@link mmMobileLearning.MConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MSub Concept</em>' containment reference list.
	 * @see mmMobileLearning.MmMobileLearningPackage#getMConcept_MSubConcept()
	 * @model containment="true"
	 * @generated
	 */
	EList<MConcept> getMSubConcept();

	/**
	 * Returns the value of the '<em><b>MHas Reference</b></em>' containment reference list.
	 * The list contents are of type {@link mmMobileLearning.MReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MHas Reference</em>' containment reference list.
	 * @see mmMobileLearning.MmMobileLearningPackage#getMConcept_MHasReference()
	 * @model containment="true"
	 * @generated
	 */
	EList<MReference> getMHasReference();

	/**
	 * Returns the value of the '<em><b>MConcept To Screen</b></em>' containment reference list.
	 * The list contents are of type {@link mmMobileLearning.Screen}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MConcept To Screen</em>' containment reference list.
	 * @see mmMobileLearning.MmMobileLearningPackage#getMConcept_MConceptToScreen()
	 * @model containment="true"
	 * @generated
	 */
	EList<Screen> getMConceptToScreen();

} // MConcept
