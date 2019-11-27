package reactnative.education.emf.implement;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import reactNative.Array;
import reactNative.Button;
import reactNative.Component;
import reactNative.FlatList;
import reactNative.Icon;
import reactNative.Image;
import reactNative.ObjectElement;
import reactNative.ReactNativeFactory;
import reactNative.SectionList;
import reactNative.StyleSheet;
import reactNative.Text;
import reactNative.TouchableOpacity;
import reactNative.View;

public class ComponetsReactNative {
	protected StringBuilder js;
	protected String ql = "\n";
	protected ReactNativeFactory reactNativeFactory = ReactNativeFactory.eINSTANCE;
	protected TouchableOpacity touchableOpacity;
	private boolean isView;
	protected StringBuilder flatToText;
	private boolean isStyle = false;

	public void setFlatToText(StringBuilder flatToText) {
		this.flatToText = flatToText;
	}

	public StringBuilder getFlatToText() {
		return flatToText;
	}

	private StringBuilder getComponentToText(Component component) {
		js = new StringBuilder();
		component.getComponentTotext().forEach(hasText -> {
			js.append(getText(hasText));
		});

		return js;
	}

	protected StringBuilder ComponetToComponents(Component component) {
		js = new StringBuilder();
		js.append(this.getComponentToText(component));
		js.append(this.getComponentToTouchableOpacity(component));
		return js;
	}

	protected StringBuilder componentsToView(Component component) {
		js = new StringBuilder();

		component.getComponentToView().forEach(view -> {
			js.append(this.getView(view));
		});

		return js;
	}

	private StringBuilder getViewToComponents(View view) {
		StringBuilder viewToComponent = new StringBuilder();

		view.getHasText().forEach(text -> {
			viewToComponent.append("\t" + this.getText(text));
		});

		view.getHasImage().forEach(image -> {
			viewToComponent.append("\t" + this.getImage(image));

		});

		view.getViewToIcon().forEach(icon -> {
			viewToComponent.append("\t" + this.getIcon(icon));
		});

		view.getViewToTouchableOpacity().forEach(touchableOpacity -> {
			viewToComponent.append("\t" + this.getTouchableOpacity(touchableOpacity));
		});

		view.getViewToButton().forEach(button -> {
			viewToComponent.append("\t\t" + this.getButton(button));
		});

		view.getSubView().forEach(subView -> {
			viewToComponent.append(this.getView(subView));
		});

		view.getViewToflatlists().forEach(flatlist -> {
			viewToComponent.append(String.format("\t\t<FlatList data={%s} keyExtractor={%s} \nrenderItem={%s}/>\n",
					flatlist.getData(), flatlist.getKeyExtractor(), flatlist.getRenderItem()));
			viewToComponent.append(this.getFlatList(flatlist));
		});
		
		if (view.getViewToSectionList() != null) {
			viewToComponent.append(String.format("\t\t<SectionList sections={%s} keyExtractor={%s} \nrenderSelectionHeader={%s} \nrenderItem={%s}/>\n", 
					view.getViewToSectionList().getSections(),
					view.getViewToSectionList().getKeyExtractor(),
					view.getViewToSectionList().getRenderSectionHeader(),
					view.getViewToSectionList().getRenderItem()));
		}
		
		return viewToComponent;
		
		

	}

	private StringBuilder getView(View hasView) {
		StringBuilder view = new StringBuilder();
		// if (!hasView.getViewToTouchableOpacity().isEmpty()) {
		// view.append(String.format("\t<View>\n %s \t\t</View>\n",
		// getViewToComponents(hasView)));
		// }

		view.append(
				String.format("\t<View %s>\n %s \t</View>\n", viewToStyleSheet(hasView), getViewToComponents(hasView)));

		return view;
	}

	private StringBuilder viewToStyleSheet(View view) {
		StringBuilder viewToStyle = new StringBuilder();
		if (view.getViewToStyleSheet().isEmpty()) {
			return viewToStyle.append("");
		}

		view.getViewToStyleSheet().forEach(styleSheet -> {
			viewToStyle.append(this.styles(styleSheet));
		});

		return viewToStyle;
	}

	private StringBuilder textToStyleSheet(Text text) {
		StringBuilder textToStyle = new StringBuilder();
		if (text.getTextToStylesheet().isEmpty()) {
			return textToStyle.append("");
		}

		text.getTextToStylesheet().forEach(styleSheet -> {
			textToStyle.append(this.styles(styleSheet));
		});
		return textToStyle;
	}

	private StringBuilder imageToStyleSheet(Image image) {
		StringBuilder imageToStyle = new StringBuilder();

		if (image.getImageTostylesheet().isEmpty()) {
			return imageToStyle.append("");
		}

		image.getImageTostylesheet().forEach(styleSheet -> {
			imageToStyle.append(this.styles(styleSheet));
		});
		return imageToStyle;
	}

	private StringBuilder styles(StyleSheet styleSheet) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(String.format("style = {styles.%s}", styleSheet.getNameStyle()));
		return stringBuilder;
	}

	protected StringBuilder getstyleSheetComponent(Component component) {
		StringBuilder sSheet = new StringBuilder();
		component.getComponentToView().forEach(view -> {
			if (view.getViewToStyleSheet().isEmpty()) {
				return;
			}
			sSheet.append(String.format("const styles = create ({%s})", displayViewToStyleSheet(view)));
		});

		return sSheet;
	}

	private StringBuilder displayViewToStyleSheet(View viewStyle) {
		StringBuilder sSheet = new StringBuilder();
		if (viewStyle.getViewToStyleSheet().isEmpty()) {
			return sSheet.append("");
		}
		viewStyle.getViewToStyleSheet().forEach(style -> {
			if (style.getNameStyle().isEmpty()) {
				return;
			}
			if (!style.getNameStyle().isEmpty()) {
				sSheet.append(
						String.format("\n\t%s: {\n%s \t}, \t\n", style.getNameStyle(), this.getStyleSheetAttr(style)));
			}
		});

		viewStyle.getSubView().forEach(subView -> {
			subView.getViewToStyleSheet().forEach(style -> {
				if (!style.getNameStyle().isEmpty()) {
					sSheet.append(String.format("\n\t%s: {\n%s \t}, \t\n", style.getNameStyle(),
							this.getStyleSheetAttr(style)));
				}
			});
		});

		viewStyle.getHasText().forEach(text -> {
			text.getTextToStylesheet().forEach(style -> {
				if (style.getNameStyle().isEmpty()) {
					return;
				}
				sSheet.append(
						String.format("\n\t%s: {\n%s \t}, \t\n", style.getNameStyle(), this.getStyleSheetAttr(style)));
			});
		});

		viewStyle.getHasImage().forEach(image -> {
			image.getImageTostylesheet().forEach(style -> {
				if (style.getNameStyle().isEmpty()) {
					return;
				}
				sSheet.append(
						String.format("\n\t%s: {\n%s \t}, \t\n", style.getNameStyle(), this.getStyleSheetAttr(style)));
			});
		});

		return sSheet;
	}

	private StringBuilder getStyleSheetAttr(StyleSheet styleSheet) {
		StringBuilder attrStyle = new StringBuilder();
		if (styleSheet.getHasFlexbox() == null) {
			attrStyle.append("");
		} else {
			attrStyle.append(styleSheet.getHasFlexbox().getAlignItems() == null ? ""
					: String.format("\t alignItems: %s, \n", styleSheet.getHasFlexbox().getAlignItems(),
							styleSheet.getHasFlexbox().getAlignItems()));
			attrStyle.append(styleSheet.getHasFlexbox().getFlexDirection() == null ? ""
					: String.format("\t flexDirection: %s, \n", styleSheet.getHasFlexbox().getFlexDirection(),
							styleSheet.getHasFlexbox().getFlexDirection()));
			attrStyle.append(styleSheet.getHasFlexbox().getJustifyContent() == null ? ""
					: String.format("\t justifyContent: '%s', \n", styleSheet.getHasFlexbox().getJustifyContent(),
							styleSheet.getHasFlexbox().getJustifyContent()));
			attrStyle.append(styleSheet.getHasFlexbox().getFlex() == null ? ""
					: String.format("\t flex: %s, \n", styleSheet.getHasFlexbox().getFlex(),
							styleSheet.getHasFlexbox().getFlex()));
		}
		if (styleSheet.getHasFont() != null) {
			attrStyle.append(styleSheet.getHasFont().getFontFamily() == null ? ""
					: String.format("\t fontFamily: %s, \n", styleSheet.getHasFont().getFontFamily(),
							styleSheet.getHasFont().getFontFamily()));
			attrStyle.append(styleSheet.getHasFont().getFontSize() == null ? ""
					: String.format("\t fontSize: %s, \n", styleSheet.getHasFont().getFontSize(),
							styleSheet.getHasFont().getFontSize()));
			attrStyle.append(styleSheet.getHasFont().getFontWeight() == null ? ""
					: String.format("\t fontWeight: %s, \n", styleSheet.getHasFont().getFontWeight(),
							styleSheet.getHasFont().getFontWeight()));
		}

		if (styleSheet.getHasMargin() != null) {
			attrStyle.append(styleSheet.getHasMargin().getMarginTop() == null ? ""
					: String.format("\t marginTop: %s, \n", styleSheet.getHasMargin().getMarginTop(),
							styleSheet.getHasMargin().getMarginTop()));
			attrStyle.append(styleSheet.getHasMargin().getMarginBottom() == null ? ""
					: String.format("\t marginBottom: %s, \n", styleSheet.getHasMargin().getMarginBottom(),
							styleSheet.getHasMargin().getMarginBottom()));
			attrStyle.append(styleSheet.getHasMargin().getMargin() == null ? ""
					: String.format("\t margin: %s, \n", styleSheet.getHasMargin().getMargin(),
							styleSheet.getHasMargin().getMargin()));
		}
		
		if (styleSheet.getHasBorder() != null) {
			attrStyle.append(styleSheet.getHasBorder().getBorderBottomRightRadius() == null ? ""
					: String.format("\t borderBottomRightRadius: %s, \n", styleSheet.getHasBorder().getBorderBottomRightRadius(),
							styleSheet.getHasBorder().getBorderBottomRightRadius()));
			attrStyle.append(styleSheet.getHasBorder().getBorderColor() == null ? ""
					: String.format("\t borderColor: %s, \n", 
							styleSheet.getHasBorder().getBorderColor(),
							styleSheet.getHasBorder().getBorderColor()));
			attrStyle.append(styleSheet.getHasBorder().getBorderRadius() == null ? ""
					: String.format("\t borderRadius: %s, \n", 
							styleSheet.getHasBorder().getBorderRadius(),
							styleSheet.getHasBorder().getBorderRadius()));
			attrStyle.append(styleSheet.getHasBorder().getBorderWidth() == null ? ""
					: String.format("\t borderWidth: %s, \n", 
							styleSheet.getHasBorder().getBorderWidth(),
							styleSheet.getHasBorder().getBorderWidth()));
		}
		
		if (styleSheet.getHasPadding() != null) {
			attrStyle.append(styleSheet.getHasPadding().getPadding() == null ? ""
					: String.format("\t padding: %s, \n", 
							styleSheet.getHasPadding().getPadding(),
							styleSheet.getHasPadding().getPadding()));
			attrStyle.append(styleSheet.getHasPadding().getPaddingHorizontal() == null ? ""
					: String.format("\t paddingHorizontal: %s, \n", 
							styleSheet.getHasPadding().getPaddingHorizontal(),
							styleSheet.getHasPadding().getPaddingHorizontal()));
			attrStyle.append(styleSheet.getHasPadding().getPaddingVertical() == null ? ""
					: String.format("\t paddingVertical: %s, \n", 
							styleSheet.getHasPadding().getPaddingVertical(),
							styleSheet.getHasPadding().getPaddingHorizontal()));
		}

		return attrStyle;

	}

	protected StringBuilder getViewToFlatlist(Component component) {
		this.flatToText = new StringBuilder();

		component.getComponentToView().forEach(view -> {
			view.getViewToflatlists().forEach(flatList -> {
				this.flatToText.append(this.getFlatListToArray(flatList));
			});

			this.flatToText.append(this.getSectionListArray(view.getViewToSectionList()));

		});

		return this.flatToText;
	}

	protected StringBuilder getViewToSectionList(Component component) {
		StringBuilder sectionListBuilder = new StringBuilder();
		component.getComponentToView().forEach(view -> {
			sectionListBuilder.append(this.getSectionListArray(view.getViewToSectionList()));

		});

		return sectionListBuilder;
	}

	private StringBuilder getSectionListArray(SectionList sectionList) {
		StringBuilder aSectionList = new StringBuilder();
		if (sectionList != null) {
			sectionList.getSectionListToArray().forEach(array -> {
				aSectionList.append(String.format("%s:[%s\n]", array.getValue(), this.getArrayToObject(array)));
			});
		}
		

		return aSectionList;
	}

	private StringBuilder getFlatListToArray(FlatList flatList) {
		StringBuilder aFlatlist = new StringBuilder();

		flatList.getFlatListToArray().forEach(array -> {

			aFlatlist.append(String.format("%s:[%s]", array.getValue(), this.getArrayToObject(array)));
		});

		return aFlatlist;
	}

	private StringBuilder getArrayToObject(Array array) {
		StringBuilder arrayBuilder = new StringBuilder();
		array.getArrayToObjects().forEach(object -> {
			arrayBuilder.append(String.format("\n\t{%s%s %s},", object.isId() ? "id: Math.random()," : "",
					this.getObjectToElements(object), this.getObjectToArray(object)));
		});

		return arrayBuilder;
	}

	private StringBuilder getObjectToElements(ObjectElement object) {
		StringBuilder arrayBuilder = new StringBuilder("");
		object.getElementText().forEach(text -> {
			arrayBuilder.append(String.format("%s: '%s',\n", text.getValueText(), text.getContentText()));
			
			text.getElementTextToArray().forEach(array -> {
				arrayBuilder.append(String.format(" %s: [%s], ", array.getValue(), getArrayToObject(array)));
			});
		});

		object.getElementImage().forEach(image -> {
			arrayBuilder.append(String.format("%s: require ('%s'}, %s\n", image.getValueImage(), image.getContentImage(), ""));
			
			image.getElementImageToArray().forEach(array -> {
				arrayBuilder.append(String.format(" %s: [%s], ", array.getValue(), getArrayToObject(array)));
			});
		});
		return arrayBuilder;

	}
	
	

	private StringBuilder getObjectToArray(ObjectElement object) {
		StringBuilder arrayBuilder = new StringBuilder("");
		object.getObjectToArray().forEach(array -> {
			arrayBuilder.append(String.format("%s: [%s]", array.getValue(), this.getArrayToObject(array)));
		});
		return arrayBuilder;
	}

	private StringBuilder getFlatList(FlatList hasFlatList) {
		StringBuilder flatlist = new StringBuilder();
		hasFlatList.getHasViews().forEach(view -> {
			flatlist.append(this.getView(view));
		});

		return flatlist;
	}

	/*
	 * private StringBuilder getSubTextFlatList(Text text) { StringBuilder subText =
	 * new StringBuilder(); if (text.getSubText().isEmpty()) { return
	 * subText.append(""); } text.getSubText().forEach(sText -> {
	 * subText.append(String.format(",\n\t\t %s: '%s'", sText.getName(),
	 * sText.getContentText(), getSubTextFlatList(sText))); });
	 * 
	 * return subText; }
	 * 
	 * private StringBuilder getSubImageFlatList(Image image) { StringBuilder
	 * subImage = new StringBuilder(); if (image.getSubImage().isEmpty()) { return
	 * subImage.append(""); } image.getSubImage().forEach(sImage -> {
	 * subImage.append(String.format(",\n\t\t %s: '%s'", sImage.getName(),
	 * sImage.getSource(), getSubImageFlatList(sImage))); }); return subImage; }
	 */
	private StringBuilder getText(Text hasText) {
		StringBuilder text = new StringBuilder();
		text.append(String.format("\t<Text %s> %s </Text> %s", this.textToStyleSheet(hasText), hasText.getContentText(),
				ql));
		return text;
	}

	private StringBuilder getImage(Image hasImage) {
		StringBuilder image = new StringBuilder();
		image.append(
				String.format("\t<Image %s source={%s}/> %s", imageToStyleSheet(hasImage), hasImage.getSource(), ql));
		return image;
	}

	private StringBuilder getIcon(Icon hasIcon) {
		StringBuilder icon = new StringBuilder();

		icon.append(String.format("\t<Icon name='%s' size={%d} color='%s' style={{%s}} /> %s", hasIcon.getName(),
				hasIcon.getSize(), hasIcon.getColor(), hasIcon.getStyle(), ql));
		return icon;
	}

	private StringBuilder getButton(Button hasButton) {
		StringBuilder button = new StringBuilder();
		if (hasButton.getOnPress() == null) {
			hasButton.setOnPress("");
		} else if (hasButton.getTitle() == null) {
			hasButton.setTitle("");
		}
		button.append(
				(hasButton.getOnPress().isEmpty()) ? String.format("\t<Button title={%s} />\n", hasButton.getTitle())
						: String.format("\t<Button title={%s} onPress={%s} />\n", hasButton.getTitle(),
								hasButton.getOnPress()));

		return button;
	}

	private StringBuilder getTouchableOpacity(TouchableOpacity hasTouchableOpacity) {
		StringBuilder touchableOpacity = new StringBuilder();
		this.isView = true;
		touchableOpacity.append(isOnPress(hasTouchableOpacity, isView));
		return touchableOpacity;

	}

	private StringBuilder getComponentToTouchableOpacity(Component component) {
		js = new StringBuilder();
		isView = false;
		if (component.getComponentToTouchableOpacity() == null) {
			return js;
		}
		js.append(isOnPress(component.getComponentToTouchableOpacity(), isView));
		return js;
	}

	private StringBuilder isOnPress(TouchableOpacity touchableOpacity, boolean isView) {
		StringBuilder js = new StringBuilder();
		if (touchableOpacity.getOnPress() == null) {
			touchableOpacity.setOnPress("");
		}
		if (isView == false) {
			if (touchableOpacity.getOnPress().isEmpty()) {
				js.append(String.format("\t<TouchableOpacity>\n %s \t</TouchableOpacity>",
						getTouchableOpacityToComponents(touchableOpacity)));
			} else {
				js.append(String.format("\t<TouchableOpacity onPress={%s}>\n %s \t</TouchableOpacity>",
						touchableOpacity.getOnPress(), getTouchableOpacityToComponents(touchableOpacity)));
			}
		} else {
			if (touchableOpacity.getOnPress().isEmpty()) {
				js.append(String.format("\t<TouchableOpacity>\n %s \t\t</TouchableOpacity> %s",
						getTouchableOpacityToComponents(touchableOpacity), ql));

			} else {
				js.append(String.format("\t<TouchableOpacity onPress={%s}>\n %s \t\t</TouchableOpacity> %s",
						touchableOpacity.getOnPress(), getTouchableOpacityToComponents(touchableOpacity), ql));

			}
		}

		return js;
	}

	private StringBuilder getTouchableOpacityToComponents(TouchableOpacity touchableOpacity) {
		StringBuilder js = new StringBuilder();
		touchableOpacity.getTouchableOpacityToIcon().forEach(icon -> {
			js.append("\t" + this.getIcon(icon));
		});
		touchableOpacity.getTouchableOpacityToText().forEach(text -> {
			js.append("\t" + this.getText(text));
		});

		touchableOpacity.getTouchableOpacityToImage().forEach(image -> {
			js.append("\t" + this.getImage(image));
		});

		touchableOpacity.getTouchableOpacityView().forEach(view -> {
			js.append(this.getView(view));
		});

		touchableOpacity.getTouchableOpacityToButton().forEach(button -> {
			js.append("\t" + this.getButton(button));
		});

		return js;
	}

}
