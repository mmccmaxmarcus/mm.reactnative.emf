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

import reactNative.FlatList;
import reactNative.ProjetoRN;
import reactNative.ReactNativeFactory;
import reactNative.ReactNativePackage;
import reactNative.View;

public class EMFReactNativeEducation {
	static ReactNativeFactory reactNativeFactory = ReactNativeFactory.eINSTANCE;
	static ReactNativePackage reactNativePackage = ReactNativePackage.eINSTANCE;
	static View view = reactNativeFactory.createView();
	static FlatList flatList = reactNativeFactory.createFlatList();
	// static Component component = reactNativeFactory.createComponent();
	static ProjetoRN projetoRN = reactNativeFactory.createProjetoRN();
	static StringBuilder js;
	static String ql = "\n";
	static int id = 0;
	static boolean myheader;

	public static void main(String[] args) {
		String loadFile = "/home/max/Área de Trabalho/modelos/react.reactnative";
		
		projetoRN = loadModel(loadFile);	
		String pathSaveFile = "/home/max/diagram/mm.reactnative.emf.implement/src/js/";
		

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
			    js = semEstado.cabeçalho();
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
		
		//	js.append("import React from \'react\' " + ql);
		//	js.append("import {Text, FlatList, StyleSheet, View} from \'react-native\'" + ql);
		//	js.append(String.format("const %s = props => { %s ", nameArqJS, ql));
/*
			components.getComponentToView().forEach(views -> {
				views.getViewToflatlists().forEach(flatlists -> {

					if (!flatlists.getFlatListText().isEmpty()) {
						js.append("\t const data = [ " + ql);
					}
					flatlists.getFlatListText().forEach(texts -> {
						js.append(String.format("\t\t{id: %d, texto: '%s'}, %s", id++, texts.getContentText(), ql));
					});
					id = 0;
					js.append("\t ]," + ql);
				});
			});

			js.append("\t return( " + ql);
			js.append("\t\t<View>" + ql);

			components.getComponentToView().forEach(views -> {
				js.append("\t\t\t<View>" + ql);
				js.append("\t\t\t\t<View>" + ql);
				js.append(String.format("\t\t\t\t\t <%s navigation={props.navigation} title='%s'/>%s",
					projetoRN.getComponents().get(1).getComponentName(),
				projetoRN.getComponents().get(1).getComponentName(), ql));
				js.append("\t\t\t\t</View>" + ql);

				views.getHasText().forEach(texts -> {
					js.append(String.format("\t\t\t\t <Text> %s </Text> %s", texts.getContentText(), ql));
				});

				views.getViewToflatlists().forEach(flatLists -> {
					js.append("\t\t\t\t <FlatList>" + ql);
					js.append("\t\t\t\t\t data={data} KeyExtractor={(item) => item.id.toString()}" + ql);
					js.append(String.format(
							"\t\t\t\t\t renderItem = {({item}) => (<View><Text>{item.texto}</Text> </View>)} %s", ql));
					js.append("\t\t\t\t <FlatList>" + ql);

				});
				js.append("\t\t\t</View>" + ql);

			});
			js.append("\t\t</View>" + ql);
			js.append("}"+ ql);
			js.append(String.format("export default %s", nameArqJS));
			
			
			


			includeFileJS.print(js);

			try {
				saveFileJS.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
*/
		});

	}
	
	private static ProjetoRN loadModel(String loadFile) {
		ProjetoRN projetoRN = reactNativeFactory.createProjetoRN();

		ResourceSet resourceSet = new ResourceSetImpl();

		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("reactnative",
				new XMIResourceFactoryImpl());

		URI fileURI = URI.createURI(loadFile);

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
}
