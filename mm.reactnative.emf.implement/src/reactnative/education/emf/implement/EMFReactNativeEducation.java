package reactnative.education.emf.implement;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import mm.mobileLearning.emf.implement.MobileLearningToReact;
import mmMobileLearning.MKnowledgeDomain;
import mmMobileLearning.MmMobileLearningFactory;
import mmMobileLearning.MmMobileLearningPackage;
import reactNative.Component;
import reactNative.FlatList;
import reactNative.ProjetoRN;
import reactNative.ReactNativeFactory;
import reactNative.ReactNativePackage;
import reactNative.View;

public class EMFReactNativeEducation {
	static ReactNativeFactory reactNativeFactory = ReactNativeFactory.eINSTANCE;
	static ReactNativePackage reactNativePackage = ReactNativePackage.eINSTANCE;
	
	static MmMobileLearningFactory mobileLearningFactory = MmMobileLearningFactory.eINSTANCE;
	static MmMobileLearningPackage mobileLearningPackage = MmMobileLearningPackage.eINSTANCE;
	
	static View view = reactNativeFactory.createView();
	static FlatList flatList = reactNativeFactory.createFlatList();
	// static Component component = reactNativeFactory.createComponent();
	static ProjetoRN projetoRN = reactNativeFactory.createProjetoRN();
	
	static MKnowledgeDomain mKnowledgeDomain = mobileLearningFactory.createMKnowledgeDomain();
	
	static Component component = reactNativeFactory.createComponent();
	
	
	
	
	
	static StringBuilder js;
	static String ql = "\n";
	static int id = 0;
	static boolean myheader;

	public static void main(String[] args) {
		String loadFileMmReactNative = "C:\\Users\\MAX-PC\\Desktop\\Modelos\\mmEmf.reactnative";
		String loadFileMmMobile = "C:\\Users\\MAX-PC\\Desktop\\Modelos\\ProjectManagementEN(1).mmMobileLearning";
		mKnowledgeDomain = loadModelMobile(loadFileMmMobile);

		MobileLearningToReact learningToReact = new MobileLearningToReact(mKnowledgeDomain);
		ProjetoRN projetoRNResult = learningToReact.projectReact();
		saveReactnativeModel(projetoRNResult, loadFileMmReactNative);
		
		
		projetoRN = loadModelReactnative(loadFileMmReactNative);
		
		String pathSaveFile = "C:\\Users\\MAX-PC\\Desktop\\git\\mmreactnative\\mm.reactnative.emf\\mm.reactnative.emf.implement\\src\\js\\";
		
		
		projetoRN.getComponents().forEach(components -> {
			String nameArqJS = components.getComponentName();
			String saveFile = pathSaveFile + nameArqJS + ".js";
			
			FileWriter saveFileJS = null;
			try {
				saveFileJS = new FileWriter(saveFile);
			} catch (IOException e) {
				e.printStackTrace();
			}
			PrintWriter includeFileJS = new PrintWriter(saveFileJS);
			if (!components.isState()) {
				js = new StringBuilder();
				SemEstado semEstado = new SemEstado(js, components);
			    js = semEstado.cabecalho();
			    js = semEstado.returnReact();
			    
			    includeFileJS.print(js);

				try {
					saveFileJS.close();
				} catch (IOException e2) {
					e2.printStackTrace();
				}
			    
			    System.out.println(js.toString());
			}else {
				js = new StringBuilder();
				ComEstado comEstado = new ComEstado(js, components);
				js = comEstado.cabecalho();
				js= comEstado.returnReact();
				
				includeFileJS.print(js);

				try {
					saveFileJS.close();
				} catch (IOException e2) {
					e2.printStackTrace();
				}
				
				System.out.println(js.toString());
			}
		
	
		});

	}
	
	private static ProjetoRN loadModelReactnative(String loadFile) {
		ProjetoRN projetoRN = reactNativeFactory.createProjetoRN();

		ResourceSet resourceSet = new ResourceSetImpl();

		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("reactnative",
				new XMIResourceFactoryImpl());

		URI fileURI = URI.createFileURI(loadFile);

		Resource resource = resourceSet.getResource(fileURI, true);

		try {
			resource.load(null);
			projetoRN = (ProjetoRN) resource.getContents().get(0);
			// component = (Component) resource.getContents().get(0);
			System.out.println("loaded: " + projetoRN);
			// resource.save(System.out, Collections.EMPTY_MAP);
			return projetoRN;
		} catch (IOException e) {
			System.out.println("failed to read " + fileURI);
		}
		return null;
	}
	
	private static MKnowledgeDomain loadModelMobile(String loadFile) {
		MKnowledgeDomain mKnowledgeDomain = mobileLearningFactory.createMKnowledgeDomain();

		ResourceSet resourceSet = new ResourceSetImpl();

		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("mmMobileLearning",
				new XMIResourceFactoryImpl());

		URI fileURI = URI.createFileURI(loadFile);

		Resource resource = resourceSet.getResource(fileURI, true);

		try {
			resource.load(null);
			mKnowledgeDomain = (MKnowledgeDomain) resource.getContents().get(0);
			// component = (Component) resource.getContents().get(0);
			System.out.println("loaded: " + mKnowledgeDomain);
			// resource.save(System.out, Collections.EMPTY_MAP);
			return mKnowledgeDomain;
		} catch (IOException e) {
			System.out.println("failed to read " + fileURI);
		}
		return null;
	}
	
	public static void saveReactnativeModel(ProjetoRN projetoRN, String arquivo) {

		ProjetoRN project = reactNativeFactory.createProjetoRN();

		project = projetoRN;

		// Obtendo novo resource set

		ResourceSet resSet = new ResourceSetImpl();
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("reactnative",
				new XMIResourceFactoryImpl());
		// arquivo = arquivo+"xmi";
		// Create resource

		System.out.println("Path: " + arquivo);
		URI fileURI = URI.createFileURI(arquivo);
		// URI.decode("UTF-8");
		Resource resource = resSet.createResource(fileURI);
		resource.getContents().add(project);

		try {
			resource.save(null);
			System.out.println("Salvo...");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("erro salvar modelo no modelo react...");
			e.printStackTrace();
		}
	}
}
