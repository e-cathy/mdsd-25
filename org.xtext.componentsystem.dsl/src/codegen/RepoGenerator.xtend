package codegen

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.emf.ecore.EObject
import MDSDComponentMetamodel.SystemIndependant.Repository
import MDSDComponentMetamodel.SystemIndependant.Interface
import MDSDComponentMetamodel.SystemIndependant.BasicComponent
import MDSDComponentMetamodel.SystemIndependant.Signature
import MDSDComponentMetamodel.SystemIndependant.Type
import MDSDComponentMetamodel.SystemIndependant.SimpleTypeEnum

class RepoGenerator implements IGenerator {
    
    final String JAVA_SUFFIX = ".java";
    
    override void doGenerate(Resource resource, IFileSystemAccess fsa) {
        for(repository: resource.allContents.toIterable.filter(Repository)) {
            fsa.generateFile(getPackage(repository).replace(".", "/") + "/" +  "Helper" + JAVA_SUFFIX, repository.compile)    
        }
        for(interface: resource.allContents.toIterable.filter(Interface)) {
            fsa.generateFile(getPackage(interface).replace(".", "/") + "/" +  getInterfaceName(interface) + JAVA_SUFFIX, interface.compile)    
        }
        for(component: resource.allContents.toIterable.filter(BasicComponent)) {
            fsa.generateFile(getPackage(component).replace(".", "/") + "/" +  getComponentName(component) + JAVA_SUFFIX, component.compile)    
        }
    }
    
    def compile(Repository repo) '''
    '''
    
    def compile(Interface interf) '''
        package repository;
        
        public interface «getInterfaceName(interf)» {
            
            «FOR signature:interf.signatures»
                 «signature.compile» 
            «ENDFOR»
        }
    '''
    
    def compile(Signature signature) '''
	«getType(signature.returnType)» «signature.name»(«ListExtensions.map(signature.parameters)[p | getType(p.type) + " " + p.name].join(", ")»);
	'''
    
    def compile(BasicComponent comp) '''
    // this is component «comp.name».
    '''
    
    def String getPackage(EObject object) {
        if(object instanceof Repository) {
            return "repository";
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