# MDSD Component DSL

This project defines a domain-specific language (DSL) for a component system from the MDSDComponentMetamodel. It is implemented using the Xtext framework.

## Files and Structure

- **Dsl.xtext**  
  The main Xtext grammar file that defines the syntax and structure of the DSL.

- **MDSDComponentMetamodel/instances/testing/Components.csdsl**  
  The example instance model from the exercise sheet created using the DSL.

## How to Use the DSL

If not already generated:

- Right-click on the `GenerateDsl.mwe2` file
- Select `Run As > MWE2 Workflow`

This will generate the language infrastructure including the editor and parser.

## How to view the DSL instance:

1. Right-click the DSL project
2. Select `Run As > Eclipse Application`
3. In the new Eclipse instance:
   - Open the project `MDSDComponentMetamodel`
   - Navigate to `instances/testing/Components.csdsl`
   - Right-click the file and choose `Open With > Dsl Editor`

## Notes

- The `.csdsl` extension is registered by the DSL and associated with the custom editor.
- Make sure the required Xtext and EMF plugins are installed in your Eclipse environment.