package codegen;
 
import org.eclipse.xtext.ISetup;
 
import com.google.inject.Guice;
import com.google.inject.Injector;
 
public class RepositoryGeneratorSetup implements ISetup {
 
    @Override
    public Injector createInjectorAndDoEMFRegistration() {
        return Guice.createInjector(new RepositoryGeneratorModule());
    }
 
}
