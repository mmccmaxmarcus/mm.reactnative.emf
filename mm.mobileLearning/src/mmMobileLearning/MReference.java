/**
 */
package mmMobileLearning;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MReference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mmMobileLearning.MReference#getMReferenceToConcept <em>MReference To Concept</em>}</li>
 *   <li>{@link mmMobileLearning.MReference#getMNameReference <em>MName Reference</em>}</li>
 * </ul>
 *
 * @see mmMobileLearning.MmMobileLearningPackage#getMReference()
 * @model
 * @generated
 */
public interface MReference extends EObject {
	/**
	 * Returns the value of the '<em><b>MReference To Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MReference To Concept</em>' reference.
	 * @see #setMReferenceToConcept(MConcept)
	 * @see mmMobileLearning.MmMobileLearningPackage#getMReference_MReferenceToConcept()
	 * @model
	 * @generated
	 */
	MConcept getMReferenceToConcept();

	/**
	 * Sets the value of the '{@link mmMobileLearning.MReference#getMReferenceToConcept <em>MReference To Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MReference To Concept</em>' reference.
	 * @see #getMReferenceToConcept()
	 * @generated
	 */
	void setMReferenceToConcept(MConcept value);

	/**
	 * Returns the value of the '<em><b>MName Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MName Reference</em>' attribute.
	 * @see #setMNameReference(String)
	 * @see mmMobileLearning.MmMobileLearningPackage#getMReference_MNameReference()
	 * @model
	 * @generated
	 */
	String getMNameReference();

	/**
	 * Sets the value of the '{@link mmMobileLearning.MReference#getMNameReference <em>MName Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MName Reference</em>' attribute.
	 * @see #getMNameReference()
	 * @generated
	 */
	void setMNameReference(String value);

} // MReference
