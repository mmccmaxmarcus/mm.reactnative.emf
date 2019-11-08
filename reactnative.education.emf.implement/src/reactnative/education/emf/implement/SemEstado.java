package reactnative.education.emf.implement;

import org.eclipse.emf.common.util.EList;

import reactNative.Component;
import reactNative.ProjetoRN;
import reactNative.View;

public class SemEstado extends ComponetsReactNative {
	private EList<Object> objects;
	private String ql = "\n";
	private StringBuilder js;
	private Component component;
	private Object object;

	public SemEstado(StringBuilder js, Component component, EList<Object> objects) {
		this.objects = objects;
		this.component = component;
		this.js = js;
	}

	public SemEstado(StringBuilder js, Component component, EList<Object> objects, Object object) {
		this.js = js;
		this.component = component;
		this.objects = objects;
		this.object = object;
	}

	public SemEstado(StringBuilder js, Component component) {
		this.js = js;
		this.component = component;
	}

	public StringBuilder cabeçalho() {
		js.append("import React from \'react\' " + ql);
		js.append("import {Text, FlatList, StyleSheet, View} from \'react-native\'" + ql);
		js.append(String.format("const %s = props => { %s \n", component.getComponentName(), ql));

		js.append(this.getViewToFlatlist(component) +"\n");
		
		return js;
	}

	public StringBuilder returnReact() {
		js.append("return (" + ql);
		
		js.append(this.ComponetToComponents(component));
		js.append(this.componentsToView(component));
		//js.append(this.getComponentToText(component));
		//js.append(this.getComponentToViewToText(component));
		//js.append(this.getComponentToViewToTouchableOpacity(component));
	    //js.append(this.getComponentToTouchableOpacity(component));
	    //js.append(this.getViewToIcon(component));
	    //js.append(this.getViewToImage(component));

		
		

		js.append(")" + ql);

		js.append(String.format("export default %s %s", component.getComponentName(), ql));
		
		js.append(this.getstyleSheetComponent(component));
		return js;
	}
}
