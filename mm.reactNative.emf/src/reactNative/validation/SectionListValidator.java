/**
 *
 * $Id$
 */
package reactNative.validation;

import org.eclipse.emf.common.util.EList;

import reactNative.Array;

/**
 * A sample validator interface for {@link reactNative.SectionList}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SectionListValidator {
	boolean validate();

	boolean validateSectionListName(String value);
	boolean validateSections(String value);
	boolean validateKeyExtractor(String value);
	boolean validateRenderSectionHeader(String value);
	boolean validateRenderItem(String value);
	boolean validateSectionListToArray(EList<Array> value);
}