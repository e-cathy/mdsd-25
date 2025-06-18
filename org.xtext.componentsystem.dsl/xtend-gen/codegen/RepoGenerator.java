package codegen;

import MDSDComponentMetamodel.SystemIndependant.BasicComponent;
import MDSDComponentMetamodel.SystemIndependant.Interface;
import MDSDComponentMetamodel.SystemIndependant.Repository;
import com.google.common.collect.Iterables;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class RepoGenerator implements IGenerator {
  private final String JAVA_SUFFIX = ".java";

  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    Iterable<Repository> _filter = Iterables.<Repository>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Repository.class);
    for (final Repository repository : _filter) {
      String _replace = this.getPackage(repository).replace(".", "/");
      String _plus = (_replace + "/");
      String _plus_1 = (_plus + "Helper");
      String _plus_2 = (_plus_1 + this.JAVA_SUFFIX);
      fsa.generateFile(_plus_2, this.compile(repository));
    }
    Iterable<Interface> _filter_1 = Iterables.<Interface>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Interface.class);
    for (final Interface interface_ : _filter_1) {
      String _replace_1 = this.getPackage(interface_).replace(".", "/");
      String _plus_3 = (_replace_1 + "/");
      String _interfaceName = this.getInterfaceName(interface_);
      String _plus_4 = (_plus_3 + _interfaceName);
      String _plus_5 = (_plus_4 + this.JAVA_SUFFIX);
      fsa.generateFile(_plus_5, this.compile(interface_));
    }
    Iterable<BasicComponent> _filter_2 = Iterables.<BasicComponent>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), BasicComponent.class);
    for (final BasicComponent component : _filter_2) {
      String _replace_2 = this.getPackage(component).replace(".", "/");
      String _plus_6 = (_replace_2 + "/");
      String _componentName = this.getComponentName(component);
      String _plus_7 = (_plus_6 + _componentName);
      String _plus_8 = (_plus_7 + this.JAVA_SUFFIX);
      fsa.generateFile(_plus_8, this.compile(component));
    }
  }

  public CharSequence compile(final Repository repo) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }

  public CharSequence compile(final Interface interf) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }

  public CharSequence compile(final BasicComponent comp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// this is component ");
    String _name = comp.getName();
    _builder.append(_name);
    _builder.append(".");
    _builder.newLineIfNotEmpty();
    return _builder;
  }

  public String getPackage(final EObject object) {
    if ((object instanceof Repository)) {
      return "repository";
    } else {
      if ((object instanceof Interface)) {
        return "interface";
      } else {
        if ((object instanceof BasicComponent)) {
          return ((BasicComponent)object).getName();
        }
      }
    }
    return "unknownObject";
  }

  public String getInterfaceName(final Interface interf) {
    String _name = interf.getName();
    return ("I" + _name);
  }

  public String getComponentName(final BasicComponent comp) {
    String _name = comp.getName();
    return (_name + "Impl");
  }
}
