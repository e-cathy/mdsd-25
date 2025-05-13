# Exercise 1b: Refactoring

Refactoring steps to increase metamodel quality:

1. **Introduce packages**
Add packages for system-dependent and system-independent view points to add structure to the metamodel. 
We have decided against sub-packages because they reduced clarity and usability of the model.

2. **Make some references bidirectional**
To increase the conciseness of some OCL constraints, we refactored some references to be bidirectional.
This led to shorter navigation chains and more meaningful contexts in OCL constraints.

3. **Add abstract class Component**
Instead of CompositeComponent inheriting from Component, we introduced a common abstract superclass. 
This ensures that only BasicComponents can be part of a repository.