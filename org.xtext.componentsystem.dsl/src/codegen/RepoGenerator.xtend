package codegen

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.emf.ecore.EObject

class RepoGenerator implements IGenerator {
	
	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		for (EObject o : resource.contents) {
            o.compile(fsa)
        }
	}
	
	def dispatch void compile(Model m, IFileSystemAccess fsa) {
		
	}
	
	def dispatch void compile(EObject object, IFileSystemAccess access) {}
}