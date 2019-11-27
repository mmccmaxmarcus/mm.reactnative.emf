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
 * A sample validator interface for {@link mmMobileLearning.MKnowledgeDomain}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface MKnowledgeDomainValidator {
	boolean validate();

	boolean validateMHasConcept(EList<MConcept> value);
	boolean validateMNameKD(String value);
	boolean validateKDomainToMmodule(EList<MModule> value);
	boolean validateMKdomainToScreen(EList<Screen> value);
}
