package codegen;
 
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule;
 
public class RepositoryGeneratorModule extends AbstractGenericResourceRuntimeModule {
 
    @Override
    protected String getLanguageName() {
        return "ComponentSystem";
    }
 
    @Override
    protected String getFileExtensions() {
        return "xmi";
    }
 
    public Class<? extends IGenerator> bindIGenerator() {
        return RepoGenerator.class;
    }
 
    public Class<? extends ResourceSet> bindResourceSet() {
        return ResourceSetImpl.class;
    }
 
}