package mm.mobileLearning.emf.implement;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import mmMobileLearning.Image;
import mmMobileLearning.Link;
import mmMobileLearning.MConcept;
import mmMobileLearning.MKnowledgeDomain;
import mmMobileLearning.MModule;
import mmMobileLearning.MmMobileLearningFactory;
import mmMobileLearning.Screen;
import mmMobileLearning.Text;
import reactNative.Array;
import reactNative.Component;
import reactNative.ElementImage;
import reactNative.ElementText;
import reactNative.FlatList;
import reactNative.ObjectElement;
import reactNative.ProjetoRN;
import reactNative.ReactNativeFactory;
import reactNative.View;
import reactnative.education.emf.implement.ComponetsReactNative;

public class MobileLearningToReact extends ComponetsReactNative {

	MmMobileLearningFactory mmMobileLearningFactory = MmMobileLearningFactory.eINSTANCE;
	ReactNativeFactory reactNativeFactory = ReactNativeFactory.eINSTANCE;

	MModule module;

	ProjetoRN projetoRN = reactNativeFactory.createProjetoRN();
	Component component;
	FlatList flatList;
	ElementText elementText;
	ElementImage elementImage;
	Array array;
	ObjectElement objectElement;

	MKnowledgeDomain mKnowledgeDomain = mmMobileLearningFactory.createMKnowledgeDomain();
	List<Screen> screens = new ArrayList<Screen>();

	public MobileLearningToReact(MKnowledgeDomain mKnowledgeDomain) {
		this.mKnowledgeDomain = mKnowledgeDomain;
	}

	public ProjetoRN projectReact() {
		this.component = reactNativeFactory.createComponent();
		this.projetoRN.setName(mKnowledgeDomain.getMNameKD());

		this.mKnowledgeDomain.getMKdomainToScreen().forEach(screen -> {
			FlatList flatListContainer = createFlatList("state.module", "flatListContainer", "", "item");
			Array arrayContainer = createArray(screen.getLabel().toLowerCase());

			flatListContainer.getFlatListToArray().add(arrayContainer);

			View viewContainer = createView("viewContainer", 0);
			viewContainer.getViewToflatlists().add(flatListContainer);
			this.component.setComponentName(screen.getLabel());
			this.component.setState(Boolean.TRUE);
			viewContainer.setViewName("module");
			this.component.getComponentToView().add(viewContainer);

			screen.getScreenToMModule().forEach(module -> {
				ObjectElement objectElementModule = createObjectElement(Boolean.TRUE);
				ElementText elementTextModule = createElementText(module.getLabel(), module.getNameModule());
				objectElementModule.getElementText().add(elementTextModule);
				arrayContainer.getArrayToObjects().add(objectElementModule);
				// Adiciona array concept dentro do modulo
				Array arrayConcept = createArray("concepts");

				module.getMModuleToScreen().forEach(screeModule -> {
					Component componentModule = createComponent(screeModule.getLabel(), Boolean.TRUE);
					this.projetoRN.getComponents().add(componentModule);
					
					screeModule.getScreenToElementInterface().forEach(elementModule -> {
						System.out.println((((Text) elementModule).getTextDisplay())); 

					});
					
					
				});

				module.getMModuleToMConcept().forEach(concept -> {

					ObjectElement objectElementConcept = createObjectElement(Boolean.TRUE);
					ElementText elementTextConcept = createElementText("concept", concept.getNameMConcept());

					objectElementConcept.getElementText().add(elementTextConcept);
					arrayConcept.getArrayToObjects().add(objectElementConcept);
					elementTextModule.getElementTextToArray().add(arrayConcept);
					
					//Criar array dos elementos concepts
					Array arrayElements = createArray("elements");
		
					concept.getMConceptToScreen().forEach(screenConcept -> {
						ObjectElement objectElements = createObjectElement(Boolean.FALSE);
						arrayElements.getArrayToObjects().add(objectElements);
						
				
						elementTextConcept.getElementTextToArray().add(arrayElements);
						
					});
				});
			});
		});

		this.projetoRN.getComponents().add(component);

		return this.projetoRN;
	}

	private ElementText createElementText(String value, String content) {
		ElementText elementText = reactNativeFactory.createElementText();
		elementText.setValueText(value);
		elementText.setContentText(content);

		return elementText;
	}

	private Component createComponent(String NameComponent, Boolean isState) {
		Component component = reactNativeFactory.createComponent();
		component.setComponentName(NameComponent);
		component.setState(isState);
		return component;
	}

	private ElementImage createElementImage(String contentImage, String valueImage) {
		ElementImage elementImage = reactNativeFactory.createElementImage();
		elementImage.setContentImage(contentImage);
		elementImage.setValueImage(valueImage);

		return elementImage;
	}

	private ObjectElement createObjectElement(Boolean isId) {
		ObjectElement objectElement = reactNativeFactory.createObjectElement();
		objectElement.setId(isId);

		return objectElement;
	}

	private Array createArray(String nameArray) {
		Array array = reactNativeFactory.createArray();
		array.setValue(nameArray);

		return array;
	}

	private FlatList createFlatList(String data, String flatListName, String renderItem, String keyExtractor) {
		FlatList flatList = reactNativeFactory.createFlatList();
		flatList.setData(data);
		flatList.setFlatlistName(flatListName);
		flatList.setKeyExtractor(keyExtractor);
		flatList.setRenderItem(renderItem);

		return flatList;
	}

	private View createView(String viewName, Integer viewType) {
		View view = reactNativeFactory.createView();
		view.setViewName(viewName);
		view.setViewType(viewType);

		return view;
	}

	/*
	 * private View getViewToFlatList(View view, Screen screen) { FlatList flatList;
	 * if (view.getViewName().equals("module")) { flatList =
	 * reactNativeFactory.createFlatList(); flatList.setFlatlistName("module");
	 * view.getViewToflatlists().add(getFlatList(flatList, screen)); }
	 * 
	 * return view; }
	 * 
	 * private FlatList getFlatList(FlatList flatList, Screen screen) { Array array;
	 * 
	 * if (flatList.getFlatlistName().equals("module")) { array =
	 * reactNativeFactory.createArray(); array.setValue(flatList.getFlatlistName());
	 * flatList.getFlatListToArray().add(getArrayAndScreen(array, screen)); }
	 * 
	 * return flatList; }
	 * 
	 * private Array getArrayAndScreen(Array array, Screen screen) { ObjectElement
	 * objectElement; if (array.getValue().equals("module") ||
	 * array.getValue().equals("concepts")) { objectElement =
	 * reactNativeFactory.createObjectElement();
	 * array.getArrayToObjects().add(getObjectElementAndScreen(objectElement,
	 * screen));
	 * 
	 * } return array;
	 * 
	 * }
	 * 
	 * private ObjectElement getObjectElementAndScreen(ObjectElement objectElement,
	 * Screen screen) { this.array = reactNativeFactory.createArray();
	 * this.objectElement = reactNativeFactory.createObjectElement();
	 * 
	 * screen.getScreenToMModule().forEach(module -> { ElementText elementTextModule
	 * = this.reactNativeFactory.createElementText();
	 * elementTextModule.setValueText(module.getLabel());
	 * elementTextModule.setContentText(module.getNameModule());
	 * 
	 * module.getMModuleToMConcept().forEach(concept -> { ElementText
	 * elementTextConcept = reactNativeFactory.createElementText();
	 * this.array.setValue("concepts");
	 * this.array.getArrayToObjects().add(this.objectElement);
	 * elementTextConcept.getElementTextToArray().add(this.array);
	 * 
	 * elementTextConcept.setValueText("concept");
	 * elementTextConcept.setContentText(concept.getNameMConcept());
	 * this.objectElement.getElementText().add(elementTextConcept);
	 * 
	 * objectElement.getObjectToArray().add(array);
	 * elementTextModule.getElementTextToArray().add(array);
	 * 
	 * 
	 * }); objectElement.getElementText().add(elementTextModule);
	 * 
	 * 
	 * });
	 * 
	 * return objectElement; }
	 */
}
