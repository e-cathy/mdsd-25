package codegen;

import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
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

  protected void _compile(final /* Model */Object m, final IFileSystemAccess fsa) {
  }

  protected void _compile(final EObject object, final IFileSystemAccess access) {
  }

  @XbaseGenerated
  public void compile(final EObject object, final IFileSystemAccess access) {
    if (object != null) {
      _compile(object, access);
      return;
    } else if (object != null) {
      _compile(object, access);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(object, access).toString());
    }
  }
}
