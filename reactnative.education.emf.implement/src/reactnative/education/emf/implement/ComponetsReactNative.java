package reactnative.education.emf.implement;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import reactNative.Button;
import reactNative.Component;
import reactNative.FlatList;
import reactNative.Icon;
import reactNative.Image;
import reactNative.ReactNativeFactory;
import reactNative.StyleSheet;
import reactNative.Text;
import reactNative.TouchableOpacity;
import reactNative.View;
import reactNative.impl.ReactNativeFactoryImpl;
import reactnative.*;

public class ComponetsReactNative {
	protected StringBuilder js;
	protected String ql = "\n";
	protected ReactNativeFactory reactNativeFactory = ReactNativeFactory.eINSTANCE;
	protected TouchableOpacity touchableOpacity;
	private boolean isView;
	private Integer id = 0;
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
				sSheet.append(String.format("\n\t%s: {\n%s \t}, \t\n", style.getNameStyle(),
						this.getStyleSheetAttr(style)));
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
					: String.format("\t talignItems: %s, \n", styleSheet.getHasFlexbox().getAlignItems(),
							styleSheet.getHasFlexbox().getAlignItems()));
			attrStyle.append(styleSheet.getHasFlexbox().getFlexDirection() == null ? ""
					: String.format("\t tflexDirection: %s, \n", styleSheet.getHasFlexbox().getFlexDirection(),
							styleSheet.getHasFlexbox().getFlexDirection()));
			attrStyle.append(styleSheet.getHasFlexbox().getJustifyContent() == null ? ""
					: String.format("\t tjustifyContent: %s, \n", styleSheet.getHasFlexbox().getJustifyContent(),
							styleSheet.getHasFlexbox().getJustifyContent()));
			attrStyle.append(styleSheet.getHasFlexbox().getFlex() == 0 ? ""
					: String.format("\t talignItems: %s, \n", styleSheet.getHasFlexbox().getFlex(),
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

		return attrStyle;

	}

	protected StringBuilder getViewToFlatlist(Component component) {
		this.flatToText = new StringBuilder();
		component.getComponentToView().forEach(view -> {
			view.getViewToflatlists().forEach(flatlist -> {
				this.flatToText.append(this.flatListToComponents(flatlist));
			});
		});

		component.getComponentToView().forEach(view -> {
			view.getSubView().forEach(subView -> {
				subView.getViewToflatlists().forEach(flatList -> {
					this.flatToText.append(this.flatListToComponents(flatList));
				});
			});
		});
		return this.flatToText;
	}

	private StringBuilder getFlatList(FlatList hasFlatList) {
		StringBuilder flatlist = new StringBuilder();
		hasFlatList.getHasViews().forEach(view -> {
			flatlist.append(this.getView(view));
		});

		return flatlist;
	}

	private StringBuilder flatListToComponents(FlatList flatList) {
		StringBuilder flatListToTextOrImage = new StringBuilder();
		// if (!flatList.getFlatListText().isEmpty() || !flatList.getImage().isEmpty())
		// {
		// flatListToTextOrImage.append("\t const data = [ " + "\n");
		// } else {
		// return flatListToTextOrImage.append("");
		// }
		flatListToTextOrImage.append(String.format("\t const %s = [\n %s %s \t]" + "\n", flatList.getData(),
				this.getTextFlatList(flatList.getFlatListText()), this.getImageFlatList(flatList.getImage())));

		id = 0;

		return flatListToTextOrImage;
	}

	private StringBuilder getTextFlatList(EList<Text> texts) {
		StringBuilder fTexts = new StringBuilder();
		if (texts.isEmpty()) {
			return fTexts.append("");
		}
		texts.forEach(text -> {
			fTexts.append(String.format("\t\t{id:%d, %s: '%s'%s},\n ", this.id++, text.getName(), text.getContentText(),
					getSubTextFlatList(text)));
		});

		return fTexts;
	}

	private StringBuilder getImageFlatList(EList<Image> images) {
		StringBuilder fImages = new StringBuilder();
		if (images.isEmpty()) {
			return fImages.append("");
		}
		images.forEach(image -> {
			fImages.append(String.format("\t\t{id:%d, %s: '%s' %s},\n", this.id++, image.getName(), image.getSource(),
					getSubImageFlatList(image)));
		});

		return fImages;
	}

	private StringBuilder getSubTextFlatList(Text text) {
		StringBuilder subText = new StringBuilder();
		if (text.getSubText().isEmpty()) {
			return subText.append("");
		}
		text.getSubText().forEach(sText -> {
			subText.append(String.format(",\n\t\t %s: '%s'", sText.getName(), sText.getContentText(),
					getSubTextFlatList(sText)));
		});

		return subText;
	}

	private StringBuilder getSubImageFlatList(Image image) {
		StringBuilder subImage = new StringBuilder();
		if (image.getSubImage().isEmpty()) {
			return subImage.append("");
		}
		image.getSubImage().forEach(sImage -> {
			subImage.append(String.format(",\n\t\t %s: '%s'", sImage.getName(), sImage.getSource(),
					getSubImageFlatList(sImage)));
		});
		return subImage;
	}

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
