package codegen

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.emf.ecore.EObject
import MDSDComponentMetamodel.SystemIndependant.Repository
import MDSDComponentMetamodel.SystemIndependant.Interface
import MDSDComponentMetamodel.SystemIndependant.BasicComponent
import MDSDComponentMetamodel.ComponentSystem
import MDSDComponentMetamodel.SystemIndependant.SimpleTypeEnum
import MDSDComponentMetamodel.SystemIndependant.Signature
import MDSDComponentMetamodel.SystemIndependant.Parameter
import MDSDComponentMetamodel.SystemIndependant.Type

class RepoGenerator implements IGenerator {
    
    final String JAVA_SUFFIX = ".java";
    
    // Main method
    override void doGenerate(Resource resource, IFileSystemAccess fsa) {
    	for (EObject o : resource.contents) {
            o.compile(fsa)
        }
    }
	
	// Fallback method (should not be called)
	def dispatch void compile(EObject object, IFileSystemAccess access) {}
    
    // Compiles all repositories of a component system
    def dispatch void compile(ComponentSystem cs, IFileSystemAccess fsa) {
		for (Repository repo : cs.getRepositories()) {
			repo.compile(fsa)
		}
	}
    
    // Generates the file of the Helper class with its content and compiles all interfaces and basic components of a repository
    def dispatch void compile(Repository repo, IFileSystemAccess fsa) {
    	fsa.generateFile(getPackage(repo).replace(".", "/") + "/" +  "Helper" + JAVA_SUFFIX, repo.compileContent) 
    	for (Interface i : repo.getInterfaces()) {
    		i.compile(repo, fsa)
    	}
    	for (BasicComponent c : repo.getComponents()) {
    		c.compile(repo, fsa)
    	}
    }
    
    // Generates the file with its content for an Interface
    def dispatch void compile(Interface i, Repository repo, IFileSystemAccess fsa) {
    	fsa.generateFile(getPackage(repo).replace(".", "/") + "/" +  getInterfaceName(i) + JAVA_SUFFIX, i.compileContent(repo))  
    }
    
    // Generates the file with its content for a Basic Component
    def dispatch void compile(BasicComponent comp, Repository repo, IFileSystemAccess fsa) {
    	 fsa.generateFile(getPackage(comp).replace(".", "/") + "/" +  getComponentName(comp) + JAVA_SUFFIX, comp.compileContent(repo))  
    }
    
    // Compiles the Helper class
    def String compileContent(Repository repo) '''
    	package «getPackage(repo)»
    	
    	public class Helper {
    	
    	    public static void assertNull(Object obj) {
    	        if (obj != null) {
    	            throw new IllegalStateException("Expected null but was not null.");
    	        }
    	    }
    	
    	    public static void assertNotNull(Object obj) {
    	        if (obj == null) {
    	            throw new IllegalStateException("Expected non-null value but was null.");
    	        }
    	    }
    	}
    '''
    
    // Compiles an interface
    def String compileContent(Interface interf, Repository repo) '''
        package «getPackage(repo)»;
        
        public interface «getInterfaceName(interf)» {     
            «FOR signature:interf.signatures»
                 «signature.compileContent» 
            «ENDFOR»
        }
    '''
	
	// Compiles a Signature
	def String compileContent(Signature signature) '''
	«getType(signature.returnType)» «signature.name»(«ListExtensions.map(signature.parameters)[p | p.compileContent].join(", ")»);
	'''
    
    // Compiles a Parameter
    def String compileContent(Parameter param) '''
    «getType(param.type)» «param.name»
    '''
    
    // Compiles a Basic Component
    def String compileContent(BasicComponent comp, Repository repo) '''
		package «getPackage(comp)»;
			
		«FOR i: comp.providedInterfaces»
			import «getPackage(repo)».«getInterfaceName(i)»;
		«ENDFOR»
		«FOR i: comp.requiredInterfaces»
			import «getPackage(repo)».«getInterfaceName(i)»;
		«ENDFOR»
		import «getPackage(repo)».Helper;
			
		public class «getComponentName(comp)»«IF !comp.providedInterfaces.empty» implements «ListExtensions.map(comp.providedInterfaces)[i | getInterfaceName(i)].join(", ")»«ENDIF»{
			«FOR i: comp.requiredInterfaces»
				«getInterfaceName(i)» «getInterfaceName(i).toFirstLower»;
			«ENDFOR»
			«FOR i: comp.requiredInterfaces»
			
			public void set«getInterfaceName(i)» («getInterfaceName(i)» «getInterfaceName(i).toFirstLower») {
				Helper.assertNull(this.«getInterfaceName(i).toFirstLower»);
				this.«getInterfaceName(i).toFirstLower» = «getInterfaceName(i).toFirstLower»;
			}
			«ENDFOR»
			«FOR i: comp.providedInterfaces»
				«FOR s: i.signatures»
							
				// Implementing «s.name» from interface «getInterfaceName(i)»
				@Override
				public «getType(s.returnType)» «s.name»() {
					«FOR r: comp.requiredInterfaces»
						Helper.assertNotNull(this.«getInterfaceName(r).toFirstLower»);
					«ENDFOR»
					// TODO: Insert code here
				}
				«ENDFOR»
			«ENDFOR»
		}
    '''
    
    // Gets the name of the package for an object
    def String getPackage(EObject object) {
        if(object instanceof Repository) {
            return object.name;
        } else if (object instanceof BasicComponent) {
            return object.name;
        }
        return "unknownObject";
    }
    
    
    // Gets the file name of an interface
    def String getInterfaceName(Interface interf) {
        return "I" + interf.name;
    }
    
    // Gets the file name of a component
    def String getComponentName(BasicComponent comp) {
        return comp.name + "Impl";
    }
    
    // Converts the SimpleType to its java equivalent
    def String getType(Type type) {
    	if (type === null) {
    		return "void";
    	}
    	if (type.type === null) {
    		return "void";
    	} else if (type.type == SimpleTypeEnum.BOOLEAN) {
			return "boolean"
		} else if (type.type == SimpleTypeEnum.CHAR) {
			return "char";
		} else if (type.type == SimpleTypeEnum.DOUBLE) {
			return "double";
		} else if (type.type == SimpleTypeEnum.FLOAT) {
			return "float";
		} else if (type.type == SimpleTypeEnum.INT) {
			return "int";
		} else if (type.type == SimpleTypeEnum.LONG) {
			return "long";
		} else if (type.type == SimpleTypeEnum.STRING) {
			return "String";
		}
		return "undefinedType"
	}
}