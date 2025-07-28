# Sirius Graphical Editor for ComponentSystem

This project provides a graphical editor for models based on the MDSDComponentMetamodel using the Eclipse Sirius framework.

## Important Files

- **componentsystem.odesign**  
  The Sirius design specification.  
  It is located at: `description/componentsystem.odesign`

- **SiriusRepositoryDiagram**  
  A diagram representation of the instance from the excercise sheet.  
  It is located inside the `.aird` file of the metamodel project: `MDSDComponentMetamodel.aird > RepositoryViewpoint > RepositoryDiagram > SiriusRepositoryDiagram`

- **DiagramWithTypes**  
  A diagram representation of another example instance, which we created ourselves that includes signatures with parameters with types.  
  It is located inside the `.aird` file of the metamodel project: `MDSDComponentMetamodel.aird > RepositoryViewpoint > RepositoryDiagram > DiagramWithTypes`

## Features

- Visual representation of the model elements in a Repository.
- Palette tools for creating and modifying elements and references (e.g., `Create BasicComponent`).
- Filter to hide type edges, as they overcrowd the diagram. Find the filter in the top menu of the diagram.

## How to view

1. Open the `.aird` file in the MDSDComponentMetamodel project.
2. Click on `RepositoryViewpoint > RepositoryDiagram > SiriusRepositoryDiagram`.
3. Activate the `Hide type edges` filter to hide the return type, parameter type and attribute type edges.
    - You can still set types by adding new type edges.
    - To set a type to void, you have to turn off the filter and delete the corresponding edge.

## Notes

If the diagram doesn't display anything, it is because of an EMF bug. 
To resolve this issue, do the following steps:
1. Delete the underlying model instance (e.g. `Components.xmi`)
2. Perform a `git reset --hard`.
3. Add the restored model instance to the model list of the `.aird` file. 
4. Try to open the diagram again or create a new diagram for the model.

