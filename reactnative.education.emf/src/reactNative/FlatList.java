/**
 */
package reactNative;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flat List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link reactNative.FlatList#getHasViews <em>Has Views</em>}</li>
 *   <li>{@link reactNative.FlatList#getFlatListText <em>Flat List Text</em>}</li>
 *   <li>{@link reactNative.FlatList#getFlatlistName <em>Flatlist Name</em>}</li>
 *   <li>{@link reactNative.FlatList#getImage <em>Image</em>}</li>
 *   <li>{@link reactNative.FlatList#getData <em>Data</em>}</li>
 *   <li>{@link reactNative.FlatList#getRenderItem <em>Render Item</em>}</li>
 *   <li>{@link reactNative.FlatList#getKeyExtractor <em>Key Extractor</em>}</li>
 * </ul>
 *
 * @see reactNative.ReactNativePackage#getFlatList()
 * @model
 * @generated
 */
public interface FlatList extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Views</b></em>' containment reference list.
	 * The list contents are of type {@link reactNative.View}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Views</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Views</em>' containment reference list.
	 * @see reactNative.ReactNativePackage#getFlatList_HasViews()
	 * @model containment="true"
	 * @generated
	 */
	EList<View> getHasViews();

	/**
	 * Returns the value of the '<em><b>Flat List Text</b></em>' containment reference list.
	 * The list contents are of type {@link reactNative.Text}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flat List Text</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flat List Text</em>' containment reference list.
	 * @see reactNative.ReactNativePackage#getFlatList_FlatListText()
	 * @model containment="true"
	 * @generated
	 */
	EList<Text> getFlatListText();

	/**
	 * Returns the value of the '<em><b>Flatlist Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flatlist Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flatlist Name</em>' attribute.
	 * @see #setFlatlistName(String)
	 * @see reactNative.ReactNativePackage#getFlatList_FlatlistName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getFlatlistName();

	/**
	 * Sets the value of the '{@link reactNative.FlatList#getFlatlistName <em>Flatlist Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flatlist Name</em>' attribute.
	 * @see #getFlatlistName()
	 * @generated
	 */
	void setFlatlistName(String value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' containment reference list.
	 * The list contents are of type {@link reactNative.Image}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' containment reference list.
	 * @see reactNative.ReactNativePackage#getFlatList_Image()
	 * @model containment="true"
	 * @generated
	 */
	EList<Image> getImage();

	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' attribute.
	 * @see #setData(String)
	 * @see reactNative.ReactNativePackage#getFlatList_Data()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getData();

	/**
	 * Sets the value of the '{@link reactNative.FlatList#getData <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see #getData()
	 * @generated
	 */
	void setData(String value);

	/**
	 * Returns the value of the '<em><b>Render Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Render Item</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Render Item</em>' attribute.
	 * @see #setRenderItem(String)
	 * @see reactNative.ReactNativePackage#getFlatList_RenderItem()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getRenderItem();

	/**
	 * Sets the value of the '{@link reactNative.FlatList#getRenderItem <em>Render Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Render Item</em>' attribute.
	 * @see #getRenderItem()
	 * @generated
	 */
	void setRenderItem(String value);

	/**
	 * Returns the value of the '<em><b>Key Extractor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Extractor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Extractor</em>' attribute.
	 * @see #setKeyExtractor(String)
	 * @see reactNative.ReactNativePackage#getFlatList_KeyExtractor()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getKeyExtractor();

	/**
	 * Sets the value of the '{@link reactNative.FlatList#getKeyExtractor <em>Key Extractor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Extractor</em>' attribute.
	 * @see #getKeyExtractor()
	 * @generated
	 */
	void setKeyExtractor(String value);

} // FlatList
