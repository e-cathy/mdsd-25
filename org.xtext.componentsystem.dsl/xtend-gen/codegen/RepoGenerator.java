package codegen;

import MDSDComponentMetamodel.ComponentSystem;
import MDSDComponentMetamodel.NamedElement;
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

  public void compile(final Repository repo, final IFileSystemAccess fsa) {
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
      this.compile(c, repo, fsa);
    }
  }

  protected void _compile(final Interface i, final Repository repo, final IFileSystemAccess fsa) {
    String _replace = this.getPackage(repo).replace(".", "/");
    String _plus = (_replace + "/");
    String _interfaceName = this.getInterfaceName(i);
    String _plus_1 = (_plus + _interfaceName);
    String _plus_2 = (_plus_1 + this.JAVA_SUFFIX);
    fsa.generateFile(_plus_2, this.compile(i, repo));
  }

  protected void _compile(final BasicComponent comp, final Repository repo, final IFileSystemAccess fsa) {
    String _replace = this.getPackage(comp).replace(".", "/");
    String _plus = (_replace + "/");
    String _componentName = this.getComponentName(comp);
    String _plus_1 = (_plus + _componentName);
    String _plus_2 = (_plus_1 + this.JAVA_SUFFIX);
    fsa.generateFile(_plus_2, this.compile(comp, repo));
  }

  public String compile(final Repository repo) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _package = this.getPackage(repo);
    _builder.append(_package);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class Helper {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public static void assertNull(Object obj) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if (obj != null) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("throw new IllegalStateException(\"Expected null but was not null.\");");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public static void assertNotNull(Object obj) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if (obj == null) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("throw new IllegalStateException(\"Expected non-null value but was null.\");");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  public String compile(final Interface interf, final Repository repo) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _package = this.getPackage(repo);
    _builder.append(_package);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public interface ");
    String _interfaceName = this.getInterfaceName(interf);
    _builder.append(_interfaceName);
    _builder.append(" {     ");
    _builder.newLineIfNotEmpty();
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

  public String compile(final BasicComponent comp, final Repository repo) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _package = this.getPackage(comp);
    _builder.append(_package);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      EList<Interface> _providedInterfaces = comp.getProvidedInterfaces();
      for(final Interface i : _providedInterfaces) {
        _builder.append("import ");
        String _package_1 = this.getPackage(repo);
        _builder.append(_package_1);
        _builder.append(".");
        String _interfaceName = this.getInterfaceName(i);
        _builder.append(_interfaceName);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<Interface> _requiredInterfaces = comp.getRequiredInterfaces();
      for(final Interface i_1 : _requiredInterfaces) {
        _builder.append("import ");
        String _package_2 = this.getPackage(repo);
        _builder.append(_package_2);
        _builder.append(".");
        String _interfaceName_1 = this.getInterfaceName(i_1);
        _builder.append(_interfaceName_1);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("import ");
    String _name = repo.getName();
    _builder.append(_name);
    _builder.append(".Helper;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("public class ");
    String _componentName = this.getComponentName(comp);
    _builder.append(_componentName);
    {
      boolean _isEmpty = comp.getProvidedInterfaces().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append(" implements ");
        final Function1<Interface, String> _function = (Interface i_2) -> {
          return this.getInterfaceName(i_2);
        };
        String _join = IterableExtensions.join(ListExtensions.<Interface, String>map(comp.getProvidedInterfaces(), _function), ", ");
        _builder.append(_join);
      }
    }
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    {
      EList<Interface> _requiredInterfaces_1 = comp.getRequiredInterfaces();
      for(final Interface i_2 : _requiredInterfaces_1) {
        _builder.append("\t");
        String _interfaceName_2 = this.getInterfaceName(i_2);
        _builder.append(_interfaceName_2, "\t");
        _builder.append(" ");
        String _firstLower = StringExtensions.toFirstLower(this.getInterfaceName(i_2));
        _builder.append(_firstLower, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<Interface> _requiredInterfaces_2 = comp.getRequiredInterfaces();
      for(final Interface i_3 : _requiredInterfaces_2) {
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public void set");
        String _interfaceName_3 = this.getInterfaceName(i_3);
        _builder.append(_interfaceName_3, "\t");
        _builder.append(" (");
        String _interfaceName_4 = this.getInterfaceName(i_3);
        _builder.append(_interfaceName_4, "\t");
        _builder.append(" ");
        String _firstLower_1 = StringExtensions.toFirstLower(this.getInterfaceName(i_3));
        _builder.append(_firstLower_1, "\t");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("Helper.asserNull(this.");
        String _firstLower_2 = StringExtensions.toFirstLower(this.getInterfaceName(i_3));
        _builder.append(_firstLower_2, "\t\t");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("this.");
        String _firstLower_3 = StringExtensions.toFirstLower(this.getInterfaceName(i_3));
        _builder.append(_firstLower_3, "\t\t");
        _builder.append(" = ");
        String _firstLower_4 = StringExtensions.toFirstLower(this.getInterfaceName(i_3));
        _builder.append(_firstLower_4, "\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    {
      EList<Interface> _providedInterfaces_1 = comp.getProvidedInterfaces();
      for(final Interface i_4 : _providedInterfaces_1) {
        {
          EList<Signature> _signatures = i_4.getSignatures();
          for(final Signature s : _signatures) {
            _builder.append("\t");
            _builder.append("\t\t\t");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("// Implementing ");
            String _name_1 = s.getName();
            _builder.append(_name_1, "\t");
            _builder.append(" from interface ");
            String _interfaceName_5 = this.getInterfaceName(i_4);
            _builder.append(_interfaceName_5, "\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("@Override");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("public ");
            String _type = this.getType(s.getReturnType());
            _builder.append(_type, "\t");
            _builder.append(" ");
            String _name_2 = s.getName();
            _builder.append(_name_2, "\t");
            _builder.append("() {");
            _builder.newLineIfNotEmpty();
            {
              EList<Interface> _requiredInterfaces_3 = comp.getRequiredInterfaces();
              for(final Interface r : _requiredInterfaces_3) {
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("Helper.assertNotNull(this.");
                String _firstLower_5 = StringExtensions.toFirstLower(this.getInterfaceName(r));
                _builder.append(_firstLower_5, "\t\t");
                _builder.append(");");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("// TODO: Insert code here");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
          }
        }
      }
    }
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
  public void compile(final EObject cs, final IFileSystemAccess fsa) {
    if (cs instanceof ComponentSystem) {
      _compile((ComponentSystem)cs, fsa);
      return;
    } else if (cs != null) {
      _compile(cs, fsa);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(cs, fsa).toString());
    }
  }

  @XbaseGenerated
  public void compile(final NamedElement comp, final Repository repo, final IFileSystemAccess fsa) {
    if (comp instanceof BasicComponent) {
      _compile((BasicComponent)comp, repo, fsa);
      return;
    } else if (comp instanceof Interface) {
      _compile((Interface)comp, repo, fsa);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(comp, repo, fsa).toString());
    }
  }
}
