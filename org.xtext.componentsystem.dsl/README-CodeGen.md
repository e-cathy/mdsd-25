# Code Generator for ComponentSystem DSL

This project contains a code generator for ComponentSystem models defined in the `MDSDComponentMetamodel`. The generation is implemented in Xtend and executed via an MWE2 workflow.

## Main File

- **RepoGenerator.xtend**  
  This file contains the core logic of the generator. It processes the model elements (Repositories, Interfaces, Components, etc.) and generates Java files such as interface definitions and implementation classes.

## How to Generate

1. Right-click on `RepoGenerator.mwe2`
2. Select `Run As > MWE2 Workflow`

After a successful run, the generated files will be located in the `/repo-src-gen` directory.

## Structure of the Generated Files

For each repository, the generator creates:
- A **Helper class**
- One **Java interface** per defined interface
- One **implementation class** (`Impl`) per `BasicComponent`, containing method skeletons

## Supporting Classes

There are three additional infrastructure classes that are required to make the generator work, but they are not responsible for the actual content generation:

- **RepositoryGeneratorModule.java**  
  Binds the expected file extension (`.xmi`) and registers the `RepoGenerator` as the active `IGenerator` implementation.

- **RepositoryGeneratorSetup.java**  
  Initializes the Guice dependency injection and registers the generator properly with the EMF context.

- **RepositoryGeneratorSupport.java**  
  Provides generic EMF resource support and loads the corresponding module.

These classes are essential to ensure the generator can be run via the MWE2 workflow.

## Requirements

- The input model must be a valid `.xmi` instance conforming to the `ComponentSystem` metamodel.
- Xtend and EMF tooling must be available in your Eclipse workspace.