/**
 */
package reactNative;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Section List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link reactNative.SectionList#getSectionListName <em>Section List Name</em>}</li>
 *   <li>{@link reactNative.SectionList#getSections <em>Sections</em>}</li>
 *   <li>{@link reactNative.SectionList#getKeyExtractor <em>Key Extractor</em>}</li>
 *   <li>{@link reactNative.SectionList#getRenderSectionHeader <em>Render Section Header</em>}</li>
 *   <li>{@link reactNative.SectionList#getRenderItem <em>Render Item</em>}</li>
 *   <li>{@link reactNative.SectionList#getSectionListToArray <em>Section List To Array</em>}</li>
 * </ul>
 *
 * @see reactNative.ReactNativePackage#getSectionList()
 * @model
 * @generated
 */
public interface SectionList extends EObject {
	/**
	 * Returns the value of the '<em><b>Section List Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Section List Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section List Name</em>' attribute.
	 * @see #setSectionListName(String)
	 * @see reactNative.ReactNativePackage#getSectionList_SectionListName()
	 * @model
	 * @generated
	 */
	String getSectionListName();

	/**
	 * Sets the value of the '{@link reactNative.SectionList#getSectionListName <em>Section List Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Section List Name</em>' attribute.
	 * @see #getSectionListName()
	 * @generated
	 */
	void setSectionListName(String value);

	/**
	 * Returns the value of the '<em><b>Sections</b></em>' attribute.
	 * The default value is <code>"modulo"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sections</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sections</em>' attribute.
	 * @see #setSections(String)
	 * @see reactNative.ReactNativePackage#getSectionList_Sections()
	 * @model default="modulo"
	 * @generated
	 */
	String getSections();

	/**
	 * Sets the value of the '{@link reactNative.SectionList#getSections <em>Sections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sections</em>' attribute.
	 * @see #getSections()
	 * @generated
	 */
	void setSections(String value);

	/**
	 * Returns the value of the '<em><b>Key Extractor</b></em>' attribute.
	 * The default value is <code>"(item, index) => `${item.id}`"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Extractor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Extractor</em>' attribute.
	 * @see #setKeyExtractor(String)
	 * @see reactNative.ReactNativePackage#getSectionList_KeyExtractor()
	 * @model default="(item, index) =&gt; `${item.id}`"
	 * @generated
	 */
	String getKeyExtractor();

	/**
	 * Sets the value of the '{@link reactNative.SectionList#getKeyExtractor <em>Key Extractor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Extractor</em>' attribute.
	 * @see #getKeyExtractor()
	 * @generated
	 */
	void setKeyExtractor(String value);

	/**
	 * Returns the value of the '<em><b>Render Section Header</b></em>' attribute.
	 * The default value is <code>"({ section }) => ( )"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Render Section Header</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Render Section Header</em>' attribute.
	 * @see #setRenderSectionHeader(String)
	 * @see reactNative.ReactNativePackage#getSectionList_RenderSectionHeader()
	 * @model default="({ section }) =&gt; ( )"
	 * @generated
	 */
	String getRenderSectionHeader();

	/**
	 * Sets the value of the '{@link reactNative.SectionList#getRenderSectionHeader <em>Render Section Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Render Section Header</em>' attribute.
	 * @see #getRenderSectionHeader()
	 * @generated
	 */
	void setRenderSectionHeader(String value);

	/**
	 * Returns the value of the '<em><b>Render Item</b></em>' attribute.
	 * The default value is <code>"({ item }) => ( )"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Render Item</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Render Item</em>' attribute.
	 * @see #setRenderItem(String)
	 * @see reactNative.ReactNativePackage#getSectionList_RenderItem()
	 * @model default="({ item }) =&gt; ( )"
	 * @generated
	 */
	String getRenderItem();

	/**
	 * Sets the value of the '{@link reactNative.SectionList#getRenderItem <em>Render Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Render Item</em>' attribute.
	 * @see #getRenderItem()
	 * @generated
	 */
	void setRenderItem(String value);

	/**
	 * Returns the value of the '<em><b>Section List To Array</b></em>' containment reference list.
	 * The list contents are of type {@link reactNative.Array}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Section List To Array</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section List To Array</em>' containment reference list.
	 * @see reactNative.ReactNativePackage#getSectionList_SectionListToArray()
	 * @model containment="true"
	 * @generated
	 */
	EList<Array> getSectionListToArray();

} // SectionList
