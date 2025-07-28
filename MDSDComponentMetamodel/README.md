# MDSDComponentMetamodel – Core Metamodel

This project defines the **ComponentSystem metamodel** for model-driven software development (MDSD).

## Class Diagram

The metamodel is visualized in a class diagram.

To open it:

1. Open the `model/MDSDComponentMetamodel.aird`
2. Navigate to: `Design → Entities in a class diagram → MDSDComponentMetamodel`

This gives an overview of all entities (Repository, Interface, Component, etc.) and their relationships.

Some design decisions and improvements are explained in `Refactoring.md`.

## OCL Constraints

The metamodel includes **OCL constraints** to enforce model consistency rules.

To view them:

1. Right-click `model/MDSDComponentMetamodel.ecore`
2. Select: `Open With → OCLinEcore Editor`

Inside the editor you can inspect the defined constraints.

**Note:**
It was not possible to write comments in the `.ecore` file.
Therefore, we included the comments in a separate file: `model/OCLComments.md`

## Metamodel Instance

- A generated instance of the metamodel (from the exercise sheet) can be found at: `instances/testing/Components.xmi`