/*
 * generated by Xtext 2.12.0
 */
package fr.imta.renaud.ssinigaglia.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractWebDslValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(fr.imta.renaud.ssinigaglia.webDsl.WebDslPackage.eINSTANCE);
		return result;
	}
	
}
