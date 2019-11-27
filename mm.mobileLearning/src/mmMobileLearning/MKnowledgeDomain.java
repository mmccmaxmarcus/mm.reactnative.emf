/**
 */
package mmMobileLearning;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MKnowledge Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mmMobileLearning.MKnowledgeDomain#getMHasConcept <em>MHas Concept</em>}</li>
 *   <li>{@link mmMobileLearning.MKnowledgeDomain#getMNameKD <em>MName KD</em>}</li>
 *   <li>{@link mmMobileLearning.MKnowledgeDomain#getKDomainToMmodule <em>KDomain To Mmodule</em>}</li>
 *   <li>{@link mmMobileLearning.MKnowledgeDomain#getMKdomainToScreen <em>MKdomain To Screen</em>}</li>
 * </ul>
 *
 * @see mmMobileLearning.MmMobileLearningPackage#getMKnowledgeDomain()
 * @model
 * @generated
 */
public interface MKnowledgeDomain extends EObject {
	/**
	 * Returns the value of the '<em><b>MHas Concept</b></em>' containment reference list.
	 * The list contents are of type {@link mmMobileLearning.MConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MHas Concept</em>' containment reference list.
	 * @see mmMobileLearning.MmMobileLearningPackage#getMKnowledgeDomain_MHasConcept()
	 * @model containment="true"
	 * @generated
	 */
	EList<MConcept> getMHasConcept();

	/**
	 * Returns the value of the '<em><b>MName KD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MName KD</em>' attribute.
	 * @see #setMNameKD(String)
	 * @see mmMobileLearning.MmMobileLearningPackage#getMKnowledgeDomain_MNameKD()
	 * @model
	 * @generated
	 */
	String getMNameKD();

	/**
	 * Sets the value of the '{@link mmMobileLearning.MKnowledgeDomain#getMNameKD <em>MName KD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MName KD</em>' attribute.
	 * @see #getMNameKD()
	 * @generated
	 */
	void setMNameKD(String value);

	/**
	 * Returns the value of the '<em><b>KDomain To Mmodule</b></em>' containment reference list.
	 * The list contents are of type {@link mmMobileLearning.MModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>KDomain To Mmodule</em>' containment reference list.
	 * @see mmMobileLearning.MmMobileLearningPackage#getMKnowledgeDomain_KDomainToMmodule()
	 * @model containment="true"
	 * @generated
	 */
	EList<MModule> getKDomainToMmodule();

	/**
	 * Returns the value of the '<em><b>MKdomain To Screen</b></em>' containment reference list.
	 * The list contents are of type {@link mmMobileLearning.Screen}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MKdomain To Screen</em>' containment reference list.
	 * @see mmMobileLearning.MmMobileLearningPackage#getMKnowledgeDomain_MKdomainToScreen()
	 * @model containment="true"
	 * @generated
	 */
	EList<Screen> getMKdomainToScreen();

} // MKnowledgeDomain
