# Exercise 1b: Refactoring and design decisions

Refactoring steps to increase metamodel quality and initial design decisions:

1. **Model void as empty return type**
To be able to use the same abstract class Type for parameters and return type of signatures, a return 
type of void is modeled as returnType = null. 

2. **ComplexType has EJavaClass**
In order to not remodel predefined concepts, we use EJavaClass to represent a complex type.

3 **Introduce packages**
Add packages for system-dependent and system-independent view points to add structure to the metamodel. 
We have decided against sub-packages because they reduced clarity and usability of the model.

4. **Make some references bidirectional**
To increase the conciseness of some OCL constraints, we refactored some references to be bidirectional.
This led to shorter navigation chains and more meaningful contexts in OCL constraints.

5. **Add abstract class Component**
Instead of CompositeComponent inheriting from Component, we introduced a common abstract superclass. 
This ensures that only BasicComponents can be part of a repository.

6. **Introduce NamedElement as super type**
To increase usability of the metamodel when creating instances, NamedElement is introduced as a 
superclass providing a name to all elements where distinction is necessary in the context of instance 
creation.

7. **Explicit classes Environment, Allocation and Assembly**
As each system contains exactly one of these elements, it would also be possible to omit the explicit 
classes and e.g. directly connect links and containers to the system. However, to emphasize and group 
the different view points, we decided to model them explicitly.

8. **Forego subclasses ProvidedRole and RequiredRole**
Even though it would simplify some OCL, we decided against subclasses of Role dividing between provided 
and required roles. Instead, they are distinguished by their containment in an assembly context. That 
keeps the metamodel more concise. The benefit would not be great enough to justify the introduction of 
two more classes.