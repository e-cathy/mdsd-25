/**
 * generated by Xtext 2.38.0
 */
package org.xtext.componentsystem.dsl.formatting2;

import MDSDComponentMetamodel.ComponentSystem;
import MDSDComponentMetamodel.SystemIndependant.BasicComponent;
import MDSDComponentMetamodel.SystemIndependant.Interface;
import MDSDComponentMetamodel.SystemIndependant.Repository;
import MDSDComponentMetamodel.SystemIndependant.Type;
import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.XbaseGenerated;
import org.xtext.componentsystem.dsl.services.DslGrammarAccess;

@SuppressWarnings("all")
public class DslFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private DslGrammarAccess _dslGrammarAccess;

  protected void _format(final ComponentSystem componentSystem, @Extension final IFormattableDocument document) {
    EList<Repository> _repositories = componentSystem.getRepositories();
    for (final Repository repository : _repositories) {
      document.<Repository>format(repository);
    }
    EList<MDSDComponentMetamodel.SystemDependant.System> _systems = componentSystem.getSystems();
    for (final MDSDComponentMetamodel.SystemDependant.System system : _systems) {
      document.<MDSDComponentMetamodel.SystemDependant.System>format(system);
    }
  }

  protected void _format(final Repository repository, @Extension final IFormattableDocument document) {
    EList<BasicComponent> _components = repository.getComponents();
    for (final BasicComponent basicComponent : _components) {
      document.<BasicComponent>format(basicComponent);
    }
    EList<Interface> _interfaces = repository.getInterfaces();
    for (final Interface _interface : _interfaces) {
      document.<Interface>format(_interface);
    }
    EList<Type> _types = repository.getTypes();
    for (final Type type : _types) {
      document.<Type>format(type);
    }
  }

  @XbaseGenerated
  public void format(final Object repository, final IFormattableDocument document) {
    if (repository instanceof XtextResource) {
      _format((XtextResource)repository, document);
      return;
    } else if (repository instanceof Repository) {
      _format((Repository)repository, document);
      return;
    } else if (repository instanceof ComponentSystem) {
      _format((ComponentSystem)repository, document);
      return;
    } else if (repository instanceof EObject) {
      _format((EObject)repository, document);
      return;
    } else if (repository == null) {
      _format((Void)null, document);
      return;
    } else if (repository != null) {
      _format(repository, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(repository, document).toString());
    }
  }
}
