package mm.mobileLearning.emf.implement;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import mmMobileLearning.MConcept;
import mmMobileLearning.MKnowledgeDomain;
import mmMobileLearning.MModule;
import mmMobileLearning.MmMobileLearningFactory;
import mmMobileLearning.Screen;
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
	View view;
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
		View view = reactNativeFactory.createView();
		this.projetoRN.setName(mKnowledgeDomain.getMNameKD());

		this.mKnowledgeDomain.getMKdomainToScreen().forEach(screen -> {
			this.component.setComponentName(screen.getLabel());
			this.component.setState(Boolean.TRUE);
			view.setViewName("module");
			this.component.getComponentToView().add(getViewToFlatList(view, screen));

		});

		this.projetoRN = addComponentsToProject(component);

		return this.projetoRN;
	}

	private ProjetoRN addComponentsToProject(Component component) {
		ProjetoRN projetoRN = reactNativeFactory.createProjetoRN();

		projetoRN.getComponents().add(component);

		return projetoRN;
	}

	private View getViewToFlatList(View view, Screen screen) {
		FlatList flatList;
		if (view.getViewName().equals("module")) {
			flatList = reactNativeFactory.createFlatList();
			flatList.setFlatlistName("module");
			view.getViewToflatlists().add(getFlatList(flatList, screen));
		}

		return view;
	}

	private FlatList getFlatList(FlatList flatList, Screen screen) {
		Array array;

		if (flatList.getFlatlistName().equals("module")) {
			array = reactNativeFactory.createArray();
			array.setValue(flatList.getFlatlistName());
			flatList.getFlatListToArray().add(getArrayAndScreen(array, screen));
		}

		return flatList;
	}

	private Array getArrayAndScreen(Array array, Screen screen) {
		ObjectElement objectElement;
		if (array.getValue().equals("module") || array.getValue().equals("concepts")) {
			objectElement = reactNativeFactory.createObjectElement();
			array.getArrayToObjects().add(getObjectElementAndScreen(objectElement, screen));

		}
		return array;

	}

	private ObjectElement getObjectElementAndScreen(ObjectElement objectElement, Screen screen) {
		this.array = reactNativeFactory.createArray();
		this.objectElement = reactNativeFactory.createObjectElement();

		screen.getScreenToMModule().forEach(module -> {
			ElementText elementTextModule = this.reactNativeFactory.createElementText();
			elementTextModule.setValueText(module.getLabel());
			elementTextModule.setContentText(module.getNameModule());
			module.getMModuleToMConcept().forEach(concept -> {
				ElementText elementTextConcept = reactNativeFactory.createElementText();
				this.array.setValue("concepts");
				this.array.getArrayToObjects().add(this.objectElement);
				elementTextConcept.getElementTextToArray().add(this.array);

				elementTextConcept.setValueText("concept");
				elementTextConcept.setContentText(concept.getNameMConcept());
				this.objectElement.getElementText().add(elementTextConcept);

				objectElement.getObjectToArray().add(array);
				elementTextModule.getElementTextToArray().add(array);
				

			});
			objectElement.getElementText().add(elementTextModule);


		});

		return objectElement;
	}

}
