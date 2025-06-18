package codegen;

import MDSDComponentMetamodel.ComponentSystem;
import MDSDComponentMetamodel.SystemIndependant.BasicComponent;
import MDSDComponentMetamodel.SystemIndependant.Interface;
import MDSDComponentMetamodel.SystemIndependant.Repository;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.XbaseGenerated;

@SuppressWarnings("all")
public class RepoGenerator implements IGenerator {
  private final String JAVA_SUFFIX = ".java";

  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    EList<EObject> _contents = resource.getContents();
    for (final EObject o : _contents) {
      this.compile(o, fsa);
    }
  }

  protected void _compile(final EObject object, final IFileSystemAccess access) {
  }

  protected void _compile(final ComponentSystem cs, final IFileSystemAccess fsa) {
    EList<Repository> _repositories = cs.getRepositories();
    for (final Repository repo : _repositories) {
      this.compile(repo, fsa);
    }
  }

  protected void _compile(final Repository repo, final IFileSystemAccess fsa) {
    String _replace = this.getPackage(repo).replace(".", "/");
    String _plus = (_replace + "/");
    String _plus_1 = (_plus + "Helper");
    String _plus_2 = (_plus_1 + this.JAVA_SUFFIX);
    fsa.generateFile(_plus_2, this.compile(repo));
    EList<Interface> _interfaces = repo.getInterfaces();
    for (final Interface i : _interfaces) {
      this.compile(i, fsa);
    }
    EList<BasicComponent> _components = repo.getComponents();
    for (final BasicComponent c : _components) {
      this.compile(c, fsa);
    }
  }

  protected void _compile(final Interface i, final IFileSystemAccess fsa) {
    String _replace = this.getPackage(i).replace(".", "/");
    String _plus = (_replace + "/");
    String _interfaceName = this.getInterfaceName(i);
    String _plus_1 = (_plus + _interfaceName);
    String _plus_2 = (_plus_1 + this.JAVA_SUFFIX);
    fsa.generateFile(_plus_2, this.compile(i));
  }

  protected void _compile(final BasicComponent comp, final IFileSystemAccess fsa) {
    String _replace = this.getPackage(comp).replace(".", "/");
    String _plus = (_replace + "/");
    String _componentName = this.getComponentName(comp);
    String _plus_1 = (_plus + _componentName);
    String _plus_2 = (_plus_1 + this.JAVA_SUFFIX);
    fsa.generateFile(_plus_2, this.compile(comp));
  }

  public String compile(final Repository repo) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }

  public String compile(final Interface interf) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }

  public String compile(final BasicComponent comp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// this is component ");
    String _name = comp.getName();
    _builder.append(_name);
    _builder.append(".");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
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

  @XbaseGenerated
  public void compile(final EObject comp, final IFileSystemAccess fsa) {
    if (comp instanceof BasicComponent) {
      _compile((BasicComponent)comp, fsa);
      return;
    } else if (comp instanceof Interface) {
      _compile((Interface)comp, fsa);
      return;
    } else if (comp instanceof ComponentSystem) {
      _compile((ComponentSystem)comp, fsa);
      return;
    } else if (comp instanceof Repository) {
      _compile((Repository)comp, fsa);
      return;
    } else if (comp != null) {
      _compile(comp, fsa);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(comp, fsa).toString());
    }
  }
}
