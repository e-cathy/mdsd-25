package codegen

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.emf.ecore.EObject
import MDSDComponentMetamodel.ComponentSystem
import MDSDComponentMetamodel.SystemIndependant.Repository
import MDSDComponentMetamodel.SystemIndependant.Component

class RepoGenerator implements IGenerator {
	
	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		for (EObject o : resource.contents) {
            o.compile(fsa)
        }
	}
	
	def dispatch void compile(ComponentSystem cs, IFileSystemAccess fsa) {
		for (Repository repo : cs.getRepositories()) {
			for (Component comp : repo.getComponents()) {
				fsa.generateFile(comp.name + ".txt", '''
        		this is component «comp.name»
        		''')
			}
		}
	}
	
	def dispatch void compile(EObject object, IFileSystemAccess access) {}
}