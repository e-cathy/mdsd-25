/*
 * generated by Xtext 2.39.0
 */
package org.xtext.componentsystem.dsl.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractDslValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.example.org/MDSDComponentMetamodel"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.example.org/SystemIndependant"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.example.org/SystemDependant"));
		return result;
	}
}
