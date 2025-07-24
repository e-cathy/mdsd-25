# Comments for OCL Invariants in `MDSDComponentMetamodel.ecore`

This file contains all invariants with their comments that are defined in `MDSDComponentMetamodel.ecore`.
This is because it is not possible to save comments in an `.ecore` file, only temporary comments can be written.
Therefore, we have included the comments in this file.

---

## Class: `CompositeComponent`

```ocl
-- Delegation connectors can appear in two settings: 
-- a) either they link a provided interface of a composite component to a provided role of an assembly context. 
-- b) or they link a required role of an assembly context to a required interface of a composite component.
invariant delegationConnectorsAreWellFormed:
  self.delegationConnectors -> forAll(dc | 
    (self.providedInterfaces -> includes(dc.delegatedInterface) and 
     self.assemblyContexts->exists(ac | ac.providedRoles -> includes(dc.role)))
    or 
    (self.requiredInterfaces -> includes(dc.delegatedInterface) and 
     self.assemblyContexts -> exists(ac | ac.requiredRoles -> includes(dc.role)))
  );

-- For all provided interfaces of a composite component exists a delegation connector.
invariant delegationConnectorsForProvidedInterfacesOfCompositeComponentsExist:
  self.providedInterfaces -> forAll(i |
    self.delegationConnectors -> exists(dc | dc.delegatedInterface = i)
  );

-- Assembly contexts that are not a direct part of a system but reside within a composite component cannot be allocated on containers.
invariant composedAssemblyContextsAreNotAllocated:
  self.assemblyContexts -> forAll(a | a.allocationContext.oclIsUndefined());

-- An assembly context cannot instantiate the composite component it is part of.
invariant noCircularDependencyInAssemblyContextHierarchy:
  self.assemblyContexts -> forAll(a | a.component <> self);
```

---

## Class: `System`

```ocl
-- Delegation connectors link the provided interfaces of a system to provided roles of assembly contexts.
invariant delegationConnectorsAreWellFormed:
  self.assembly.delegationConnectors -> forAll(dc | 
    (self.interfaces -> includes(dc.delegatedInterface) and 
     self.assembly.assemblyContexts->exists(ac | ac.providedRoles -> includes(dc.role)))
  );

-- For all provided interfaces of a system exists a delegation connector.
invariant delegationConnectorsForProvidedInterfacesOfSystemExist:
  self.interfaces -> forAll(i |
    self.assembly.delegationConnectors -> exists(dc | dc.delegatedInterface = i)
  );
```

---

## Class: `AssemblyConnector`

```ocl
-- Assembly connectors link a provided role of an assembly context to a required role of another assembly context.
invariant providedOrRequiredMatches:
  not self.providedRole.providedAssemblyContext.oclIsUndefined() and 
  not self.requiredRole.requiredAssemblyContext.oclIsUndefined();

-- If the roles of two assembly contexts are connected by an assembly connector,
-- they either have to be allocated on the same container or the containers on which they are allocated have to be linked.
invariant connectedRolesAreInSameContainerOrLinkedContainers:
  (not self.providedRole.providedAssemblyContext.allocationContext.oclIsUndefined() and 
   not self.requiredRole.requiredAssemblyContext.allocationContext.allocationContext.oclIsUndefined()) implies
  (let providedContainer = self.providedRole.providedAssemblyContext.allocationContext.container in
   let requiredContainer = self.requiredRole.requiredAssemblyContext.allocationContext.container in
     (providedContainer = requiredContainer or 
      providedContainer.links -> exists(l | l.containers -> includes(requiredContainer)))
  );
```

---

## Class: `AssemblyContext`

```ocl
-- Provided interfaces of a component result in provided roles for the assembly contexts of the component.
invariant providedInterfacesMatch:
  self.providedRoles->forAll(r | self.component.providedInterfaces->includes(r.interface));

-- Required interfaces of a component result in required roles for the assembly contexts of the component.
invariant requiredInterfacesMatch:
  self.requiredRoles->forAll(r | self.component.requiredInterfaces->includes(r.interface));
```