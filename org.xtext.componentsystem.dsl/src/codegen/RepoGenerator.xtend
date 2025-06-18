package codegen

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.emf.ecore.EObject
import MDSDComponentMetamodel.SystemIndependant.Repository
import MDSDComponentMetamodel.SystemIndependant.Interface
import MDSDComponentMetamodel.SystemIndependant.BasicComponent
import MDSDComponentMetamodel.ComponentSystem

class RepoGenerator implements IGenerator {
    
    final String JAVA_SUFFIX = ".java";
    
    override void doGenerate(Resource resource, IFileSystemAccess fsa) {
    	for (EObject o : resource.contents) {
            o.compile(fsa)
        }
    }
	
	def dispatch void compile(EObject object, IFileSystemAccess access) {}
    
    def dispatch void compile(ComponentSystem cs, IFileSystemAccess fsa) {
		for (Repository repo : cs.getRepositories()) {
			repo.compile(fsa)
		}
	}
    
    def dispatch void compile(Repository repo, IFileSystemAccess fsa) {
    	fsa.generateFile(getPackage(repo).replace(".", "/") + "/" +  "Helper" + JAVA_SUFFIX, repo.compile) 
    	for (Interface i : repo.getInterfaces()) {
    		i.compile(fsa)
    	}
    	for (BasicComponent c : repo.getComponents()) {
    		c.compile(fsa)
    	}
    }
    
    def dispatch void compile(Interface i, IFileSystemAccess fsa) {
    	fsa.generateFile(getPackage(i).replace(".", "/") + "/" +  getInterfaceName(i) + JAVA_SUFFIX, i.compile)  
    }
    
    def dispatch void compile(BasicComponent comp, IFileSystemAccess fsa) {
    	 fsa.generateFile(getPackage(comp).replace(".", "/") + "/" +  getComponentName(comp) + JAVA_SUFFIX, comp.compile)  
    }
    
    // Return helper class
    def String compile(Repository repo) '''
    	package <<repo.name>>
    	
    	public static class Helper {
    		public static boolean assertNull() {
    			
    		}
    	}
    '''
    
    def String compile(Interface interf) '''
    '''
    
    def String compile(BasicComponent comp) '''
    // this is component «comp.name».
    '''
    
    def String getPackage(EObject object) {
        if(object instanceof Repository) {
            return object.name;
        } else if (object instanceof Interface) {
            return "interface";
        } else if (object instanceof BasicComponent) {
            return object.name;
        }
        return "unknownObject";
    }
    
    
    def String getInterfaceName(Interface interf) {
        return "I" + interf.name;
    }
    
    def String getComponentName(BasicComponent comp) {
        return comp.name + "Impl";
    }
}