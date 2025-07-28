# MDSD Component DSL with Code Generator

This project defines a domain-specific language (DSL) for a component system from the MDSDComponentMetamodel. It is implemented using the Xtext framework.
Code Generation is implemented in Xtend and executed via an MWE2 workflow. 

## Files and Structure

- **Dsl.xtext**  
  The main Xtext grammar file that defines the syntax and structure of the DSL.  
  Location: `src/org.xtext.componentsystem.dsl/Dsl.xtext`

- **MDSDComponentMetamodel/instances/testing/Components.csdsl**  
  The example instance model from the exercise sheet created using the DSL.  

- **RepoGenerator.xtend**  
  This file contains the core logic of the generator. It processes the model elements (Repositories, Interfaces, Components, etc.) and generates Java files such as interface definitions and implementation classes.  
  Location: `src/codegen/RepoGenerator.xtend`

## How to Use the DSL

If not already generated:

- Right-click on the `src/org.xtext.componentsystem.dsl/GenerateDsl.mwe2` file
- Select `Run As > MWE2 Workflow`

This will generate the language infrastructure including the editor and parser.

## How to view the DSL instance:

1. Right-click the DSL project
2. Select `Run As > Eclipse Application`
3. In the new Eclipse instance:
   - Open the project `MDSDComponentMetamodel`
   - Navigate to `instances/testing/Components.csdsl`
   - Right-click the file and choose `Open With > Dsl Editor`

## How to Generate Code

1. Right-click on `src/codegen/RepoGenerator.mwe2`
2. Select `Run As > MWE2 Workflow`

After a successful run, the generated files will be located in the `/repo-src-gen` directory.


## Structure of the Generated Files

For each repository, the generator creates in the `repo-src-gen` directory:
- A main package named after the repository containing:
    - A **Helper class**
    - One **Java interface** per defined interface
- A package for each component containing:
    - One **implementation class** (`Impl`) per `BasicComponent`, containing method skeletons

## Supporting Classes

There are three additional infrastructure classes in `src/codegen` that are required to make the generator work, but they are not responsible for the actual content generation:

- **RepositoryGeneratorModule.java**  
  Binds the expected file extension (`.xmi`) and registers the `RepoGenerator` as the active `IGenerator` implementation.

- **RepositoryGeneratorSetup.java**  
  Initializes the Guice dependency injection and registers the generator properly with the EMF context.

- **RepositoryGeneratorSupport.java**  
  Provides generic EMF resource support and loads the corresponding module.

These classes are essential to ensure the generator can be run via the MWE2 workflow.

## Notes & Requirements

- The `.csdsl` extension is registered by the DSL and associated with the custom editor.
- The input model must be a valid `.xmi` instance conforming to the `ComponentSystem` metamodel.