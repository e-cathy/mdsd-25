package codegen;
 
import org.eclipse.xtext.resource.generic.AbstractGenericResourceSupport;
 
import com.google.inject.Module;
 
public class RepositoryGeneratorSupport extends AbstractGenericResourceSupport {
 
    @Override
    protected Module createGuiceModule() {
        return new RepositoryGeneratorModule();
    }
 
}