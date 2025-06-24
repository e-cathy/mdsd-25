package codegen;

import MDSDComponentMetamodel.ComponentSystem;
import MDSDComponentMetamodel.SystemIndependant.BasicComponent;
import MDSDComponentMetamodel.SystemIndependant.Interface;
import MDSDComponentMetamodel.SystemIndependant.Parameter;
import MDSDComponentMetamodel.SystemIndependant.Repository;
import MDSDComponentMetamodel.SystemIndependant.Signature;
import MDSDComponentMetamodel.SystemIndependant.SimpleTypeEnum;
import MDSDComponentMetamodel.SystemIndependant.Type;
import java.util.Arrays;
import java.util.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
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
      this.compile(i, repo, fsa);
    }
    EList<BasicComponent> _components = repo.getComponents();
    for (final BasicComponent c : _components) {
      this.compile(c, fsa);
    }
  }

  protected void _compile(final Interface i, final Repository repo, final IFileSystemAccess fsa) {
    String _replace = this.getPackage(repo).replace(".", "/");
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
    _builder.append("package <<repo.name>>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public static class Helper {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static boolean assertNull() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  public String compile(final Interface interf) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package repository;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public interface ");
    String _interfaceName = this.getInterfaceName(interf);
    _builder.append(_interfaceName);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.newLine();
    {
      EList<Signature> _signatures = interf.getSignatures();
      for(final Signature signature : _signatures) {
        _builder.append("    ");
        String _compile = this.compile(signature);
        _builder.append(_compile, "    ");
        _builder.append(" ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  public String compile(final Signature signature) {
    StringConcatenation _builder = new StringConcatenation();
    String _type = this.getType(signature.getReturnType());
    _builder.append(_type);
    _builder.append(" ");
    String _name = signature.getName();
    _builder.append(_name);
    _builder.append("(");
    final Function1<Parameter, String> _function = (Parameter p) -> {
      String _type_1 = this.getType(p.getType());
      String _plus = (_type_1 + " ");
      String _name_1 = p.getName();
      return (_plus + _name_1);
    };
    String _join = IterableExtensions.join(ListExtensions.<Parameter, String>map(signature.getParameters(), _function), ", ");
    _builder.append(_join);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  public String compile(final BasicComponent comp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t\t");
    _builder.append("package ");
    String _name = comp.getName();
    _builder.append(_name, "\t\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public class ");
    String _componentName = this.getComponentName(comp);
    _builder.append(_componentName, "\t\t");
    _builder.append(" ");
    {
      boolean _isEmpty = comp.getProvidedInterfaces().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append(" extends ");
        String _name_1 = IterableExtensions.<Interface>head(comp.getProvidedInterfaces()).getName();
        _builder.append(_name_1, "\t\t");
      }
    }
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    {
      EList<Interface> _requiredInterfaces = comp.getRequiredInterfaces();
      for(final Interface a : _requiredInterfaces) {
        _builder.append("\t\t\t");
        String _interfaceName = this.getInterfaceName(a);
        _builder.append(_interfaceName, "\t\t\t");
        _builder.append(" ");
        String _firstLower = StringExtensions.toFirstLower(this.getInterfaceName(a));
        _builder.append(_firstLower, "\t\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    {
      EList<Interface> _providedInterfaces = comp.getProvidedInterfaces();
      for(final Interface i : _providedInterfaces) {
        {
          EList<Signature> _signatures = i.getSignatures();
          for(final Signature s : _signatures) {
            _builder.append("\t\t\t");
            _builder.append("public void get");
            String _name_2 = i.getName();
            _builder.append(_name_2, "\t\t\t");
            _builder.append(" () {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t");
            _builder.append("\t");
            _builder.append("return null;");
            _builder.newLine();
            _builder.append("\t\t\t");
            _builder.append("}");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  public String getPackage(final EObject object) {
    if ((object instanceof Repository)) {
      return ((Repository)object).getName();
    } else {
      if ((object instanceof BasicComponent)) {
        return ((BasicComponent)object).getName();
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

  public String getType(final Type type) {
    if ((type == null)) {
      return "void";
    }
    String _type = this.getType(type);
    boolean _tripleEquals = (_type == null);
    if (_tripleEquals) {
      return "void";
    } else {
      String _type_1 = this.getType(type);
      boolean _equals = Objects.equals(_type_1, SimpleTypeEnum.BOOLEAN);
      if (_equals) {
        return "boolean";
      } else {
        String _type_2 = this.getType(type);
        boolean _equals_1 = Objects.equals(_type_2, SimpleTypeEnum.CHAR);
        if (_equals_1) {
          return "char";
        } else {
          String _type_3 = this.getType(type);
          boolean _equals_2 = Objects.equals(_type_3, SimpleTypeEnum.DOUBLE);
          if (_equals_2) {
            return "double";
          } else {
            String _type_4 = this.getType(type);
            boolean _equals_3 = Objects.equals(_type_4, SimpleTypeEnum.FLOAT);
            if (_equals_3) {
              return "float";
            } else {
              String _type_5 = this.getType(type);
              boolean _equals_4 = Objects.equals(_type_5, SimpleTypeEnum.INT);
              if (_equals_4) {
                return "int";
              } else {
                String _type_6 = this.getType(type);
                boolean _equals_5 = Objects.equals(_type_6, SimpleTypeEnum.LONG);
                if (_equals_5) {
                  return "long";
                } else {
                  String _type_7 = this.getType(type);
                  boolean _equals_6 = Objects.equals(_type_7, SimpleTypeEnum.STRING);
                  if (_equals_6) {
                    return "String";
                  }
                }
              }
            }
          }
        }
      }
    }
    return "undefinedType";
  }

  @XbaseGenerated
  public void compile(final EObject comp, final IFileSystemAccess fsa) {
    if (comp instanceof BasicComponent) {
      _compile((BasicComponent)comp, fsa);
      return;
    } else if (comp instanceof Repository) {
      _compile((Repository)comp, fsa);
      return;
    } else if (comp instanceof ComponentSystem) {
      _compile((ComponentSystem)comp, fsa);
      return;
    } else if (comp != null) {
      _compile(comp, fsa);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(comp, fsa).toString());
    }
  }

  @XbaseGenerated
  public void compile(final Interface i, final Repository repo, final IFileSystemAccess fsa) {
    _compile(i, repo, fsa);
    return;
  }
}
