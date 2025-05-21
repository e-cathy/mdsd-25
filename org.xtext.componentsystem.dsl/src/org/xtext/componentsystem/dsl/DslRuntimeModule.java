package org.xtext.componentsystem.dsl;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.google.inject.Binder;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class DslRuntimeModule extends AbstractDslRuntimeModule {

    @Override
    public void configure(Binder binder) {
        super.configure(binder);
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap()
            .put("xmi", new XMIResourceFactoryImpl());
    }
}

