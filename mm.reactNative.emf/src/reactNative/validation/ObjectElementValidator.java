/**
 *
 * $Id$
 */
package reactNative.validation;

import org.eclipse.emf.common.util.EList;

import reactNative.Array;
import reactNative.ElementImage;
import reactNative.ElementText;
import reactNative.ObjectElement;

/**
 * A sample validator interface for {@link reactNative.ObjectElement}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ObjectElementValidator {
	boolean validate();

	boolean validateElementText(EList<ElementText> value);
	boolean validateElementImage(EList<ElementImage> value);
	boolean validateSubObjects(EList<ObjectElement> value);
	boolean validateObjectToArray(EList<Array> value);
	boolean validateId(boolean value);
}
