/**
 */
package mmMobileLearning;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MModule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mmMobileLearning.MModule#getLabel <em>Label</em>}</li>
 *   <li>{@link mmMobileLearning.MModule#getNameModule <em>Name Module</em>}</li>
 *   <li>{@link mmMobileLearning.MModule#isVisible <em>Visible</em>}</li>
 *   <li>{@link mmMobileLearning.MModule#getMModuleToMConcept <em>MModule To MConcept</em>}</li>
 *   <li>{@link mmMobileLearning.MModule#getSubModule <em>Sub Module</em>}</li>
 *   <li>{@link mmMobileLearning.MModule#getMModuleToScreen <em>MModule To Screen</em>}</li>
 * </ul>
 *
 * @see mmMobileLearning.MmMobileLearningPackage#getMModule()
 * @model
 * @generated
 */
public interface MModule extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see mmMobileLearning.MmMobileLearningPackage#getMModule_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link mmMobileLearning.MModule#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Name Module</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Module</em>' attribute.
	 * @see #setNameModule(String)
	 * @see mmMobileLearning.MmMobileLearningPackage#getMModule_NameModule()
	 * @model
	 * @generated
	 */
	String getNameModule();

	/**
	 * Sets the value of the '{@link mmMobileLearning.MModule#getNameModule <em>Name Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Module</em>' attribute.
	 * @see #getNameModule()
	 * @generated
	 */
	void setNameModule(String value);

	/**
	 * Returns the value of the '<em><b>Visible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible</em>' attribute.
	 * @see #setVisible(boolean)
	 * @see mmMobileLearning.MmMobileLearningPackage#getMModule_Visible()
	 * @model default="true"
	 * @generated
	 */
	boolean isVisible();

	/**
	 * Sets the value of the '{@link mmMobileLearning.MModule#isVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible</em>' attribute.
	 * @see #isVisible()
	 * @generated
	 */
	void setVisible(boolean value);

	/**
	 * Returns the value of the '<em><b>MModule To MConcept</b></em>' containment reference list.
	 * The list contents are of type {@link mmMobileLearning.MConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MModule To MConcept</em>' containment reference list.
	 * @see mmMobileLearning.MmMobileLearningPackage#getMModule_MModuleToMConcept()
	 * @model containment="true"
	 * @generated
	 */
	EList<MConcept> getMModuleToMConcept();

	/**
	 * Returns the value of the '<em><b>Sub Module</b></em>' containment reference list.
	 * The list contents are of type {@link mmMobileLearning.MModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Module</em>' containment reference list.
	 * @see mmMobileLearning.MmMobileLearningPackage#getMModule_SubModule()
	 * @model containment="true"
	 * @generated
	 */
	EList<MModule> getSubModule();

	/**
	 * Returns the value of the '<em><b>MModule To Screen</b></em>' containment reference list.
	 * The list contents are of type {@link mmMobileLearning.Screen}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MModule To Screen</em>' containment reference list.
	 * @see mmMobileLearning.MmMobileLearningPackage#getMModule_MModuleToScreen()
	 * @model containment="true"
	 * @generated
	 */
	EList<Screen> getMModuleToScreen();

} // MModule
