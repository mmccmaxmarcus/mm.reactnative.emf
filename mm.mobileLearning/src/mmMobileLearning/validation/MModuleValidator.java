/**
 *
 * $Id$
 */
package mmMobileLearning.validation;

import mmMobileLearning.MConcept;
import mmMobileLearning.MModule;
import mmMobileLearning.Screen;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link mmMobileLearning.MModule}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface MModuleValidator {
	boolean validate();

	boolean validateLabel(String value);
	boolean validateNameModule(String value);
	boolean validateVisible(boolean value);
	boolean validateMModuleToMConcept(EList<MConcept> value);
	boolean validateSubModule(EList<MModule> value);
	boolean validateMModuleToScreen(EList<Screen> value);
}
