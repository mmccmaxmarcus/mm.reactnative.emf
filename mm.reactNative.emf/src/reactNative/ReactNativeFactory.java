/**
 */
package reactNative;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see reactNative.ReactNativePackage
 * @generated
 */
public interface ReactNativeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReactNativeFactory eINSTANCE = reactNative.impl.ReactNativeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View</em>'.
	 * @generated
	 */
	View createView();

	/**
	 * Returns a new object of class '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text</em>'.
	 * @generated
	 */
	Text createText();

	/**
	 * Returns a new object of class '<em>Flat List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flat List</em>'.
	 * @generated
	 */
	FlatList createFlatList();

	/**
	 * Returns a new object of class '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component</em>'.
	 * @generated
	 */
	Component createComponent();

	/**
	 * Returns a new object of class '<em>Projeto RN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Projeto RN</em>'.
	 * @generated
	 */
	ProjetoRN createProjetoRN();

	/**
	 * Returns a new object of class '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image</em>'.
	 * @generated
	 */
	Image createImage();

	/**
	 * Returns a new object of class '<em>Touchable Opacity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Touchable Opacity</em>'.
	 * @generated
	 */
	TouchableOpacity createTouchableOpacity();

	/**
	 * Returns a new object of class '<em>Icon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Icon</em>'.
	 * @generated
	 */
	Icon createIcon();

	/**
	 * Returns a new object of class '<em>Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Button</em>'.
	 * @generated
	 */
	Button createButton();

	/**
	 * Returns a new object of class '<em>Style Sheet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Style Sheet</em>'.
	 * @generated
	 */
	StyleSheet createStyleSheet();

	/**
	 * Returns a new object of class '<em>Flex Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flex Box</em>'.
	 * @generated
	 */
	FlexBox createFlexBox();

	/**
	 * Returns a new object of class '<em>Font</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Font</em>'.
	 * @generated
	 */
	Font createFont();

	/**
	 * Returns a new object of class '<em>Section List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Section List</em>'.
	 * @generated
	 */
	SectionList createSectionList();

	/**
	 * Returns a new object of class '<em>Margin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Margin</em>'.
	 * @generated
	 */
	Margin createMargin();

	/**
	 * Returns a new object of class '<em>Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array</em>'.
	 * @generated
	 */
	Array createArray();

	/**
	 * Returns a new object of class '<em>Element Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Text</em>'.
	 * @generated
	 */
	ElementText createElementText();

	/**
	 * Returns a new object of class '<em>Element Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Image</em>'.
	 * @generated
	 */
	ElementImage createElementImage();

	/**
	 * Returns a new object of class '<em>Object Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Element</em>'.
	 * @generated
	 */
	ObjectElement createObjectElement();

	/**
	 * Returns a new object of class '<em>Border</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Border</em>'.
	 * @generated
	 */
	Border createBorder();

	/**
	 * Returns a new object of class '<em>Padding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Padding</em>'.
	 * @generated
	 */
	Padding createPadding();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ReactNativePackage getReactNativePackage();

} //ReactNativeFactory
