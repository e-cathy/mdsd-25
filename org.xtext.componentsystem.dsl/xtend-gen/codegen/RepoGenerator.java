package codegen;

import MDSDComponentMetamodel.SystemIndependant.BasicComponent;
import MDSDComponentMetamodel.SystemIndependant.Interface;
import MDSDComponentMetamodel.SystemIndependant.Parameter;
import MDSDComponentMetamodel.SystemIndependant.Repository;
import MDSDComponentMetamodel.SystemIndependant.Signature;
import MDSDComponentMetamodel.SystemIndependant.SimpleTypeEnum;
import MDSDComponentMetamodel.SystemIndependant.Type;
import com.google.common.collect.Iterables;
import java.util.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

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
        CharSequence _compile = this.compile(signature);
        _builder.append(_compile, "    ");
        _builder.append(" ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }

  public CharSequence compile(final Signature signature) {
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
}
