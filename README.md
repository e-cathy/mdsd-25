## Disclaimer

This project was created by Ekaterina Ehringhaus, Annika Kienle and Simon von Rönn in the context of the **Model-Driven Software Development (MDSD) Practical Course** at **Karlsruhe Institute of Technology (KIT)**. It is intended for educational purposes only.

---
---

# MDSD Component System – Project Structure Overview

This file provides an overview of where to find the relevant artifacts for each part of the assignment.

---

## 1. Metamodel

- **Project:** `MDSDComponentMetamodel`
- **Location:** `model/`
- **Sample instance:** `instances/testing/Components.xmi`

---

## 2. DSL (Textual Syntax)

- **Project:** `org.xtext.componentsystem.dsl`
- **Location:** `src/org.xtext.componentsystem.dsl/`
- **Sample instance:** `MDSDComponentMetamodel/instances/testing/Components.csdsl`

---

## 3. QVTo Transformation

- **Project:** `MDSD2PCM`
- **Location:** `transforms/`
- **Sample instance:** `ComponentSystem2PCM.pcm`

---

## 4. Code Generator

- **Project:** `org.xtext.componentsystem.dsl`
- **Location:** `src/codegen/`
- **Sample instance:** `repo-src-gen/`

---

## 5. Graphical Editor (Sirius)

- **Project:** `org.sirius.componentsystem.design`
- **Location:**  `description/`
- **Sample instance:** `MDSDComponentMetamodel/model/MDSDComponentMetamodel.aird > RepositoryViewpoint > RepositoryDiagram > SiriusRepositoryDiagram`
