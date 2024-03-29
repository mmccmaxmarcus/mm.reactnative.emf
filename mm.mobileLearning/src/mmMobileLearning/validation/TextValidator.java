/**
 *
 * $Id$
 */
package mmMobileLearning.validation;

import mmMobileLearning.TextType;

/**
 * A sample validator interface for {@link mmMobileLearning.Text}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TextValidator {
	boolean validate();

	boolean validateTextDisplay(String value);
	boolean validateTextInformation(String value);
	boolean validateType(TextType value);
}
