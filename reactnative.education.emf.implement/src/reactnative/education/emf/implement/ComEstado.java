package reactnative.education.emf.implement;

import reactNative.Component;

public class ComEstado extends ComponetsReactNative {

	private Component component;
	private StringBuilder js;

	public ComEstado(StringBuilder js, Component component) {
		this.js = js;
		this.component = component;
	}

	public StringBuilder cabecalho() {
		js.append("import React, Component from \'react\' " + ql);
		js.append("import {Text, FlatList, StyleSheet, View} from \'react-native\'" + ql);
		js.append(String.format("export defaut class %s extends Component{ %s \n", component.getComponentName(), ql));
		component.getComponentToView().forEach(view -> {
			view.getSubView().forEach(subView -> {
				if (!subView.getViewToflatlists().isEmpty()) {
					js.append("state = { \n");
					js.append(this.getViewToFlatlist(component) + "\n");
					js.append("}\n");
				}
			});
			
			if (!view.getViewToflatlists().isEmpty()) {
				js.append("state = { \nn");
				js.append(this.getViewToFlatlist(component) + "\n");
				js.append("}\n");
			}
		});
		return js;

	}

	public StringBuilder returnReact() {
		js.append("render() { \n\n");
		js.append("return( \n");

		js.append(this.ComponetToComponents(component));
		js.append(this.componentsToView(component));

		js.append(")}\n");
		
		js.append(this.getstyleSheetComponent(component));
		return js;
	}
}
