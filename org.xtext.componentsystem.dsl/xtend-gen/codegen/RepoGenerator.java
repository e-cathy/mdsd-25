package codegen;

import MDSDComponentMetamodel.ComponentSystem;
import MDSDComponentMetamodel.SystemIndependant.BasicComponent;
import MDSDComponentMetamodel.SystemIndependant.Component;
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
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    EList<EObject> _contents = resource.getContents();
    for (final EObject o : _contents) {
      this.compile(o, fsa);
    }
  }

  protected void _compile(final ComponentSystem cs, final IFileSystemAccess fsa) {
    EList<Repository> _repositories = cs.getRepositories();
    for (final Repository repo : _repositories) {
      EList<BasicComponent> _components = repo.getComponents();
      for (final Component comp : _components) {
        String _name = comp.getName();
        String _plus = (_name + ".txt");
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("this is component ");
        String _name_1 = comp.getName();
        _builder.append(_name_1);
        _builder.newLineIfNotEmpty();
        fsa.generateFile(_plus, _builder);
      }
    }
  }

  protected void _compile(final EObject object, final IFileSystemAccess access) {
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
}
