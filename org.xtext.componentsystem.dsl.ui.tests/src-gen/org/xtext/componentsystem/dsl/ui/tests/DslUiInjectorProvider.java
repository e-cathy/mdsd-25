/*
 * generated by Xtext 2.39.0
 */
package org.xtext.componentsystem.dsl.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.componentsystem.dsl.ui.internal.DslActivator;

public class DslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return DslActivator.getInstance().getInjector("org.xtext.componentsystem.dsl.Dsl");
	}

}
