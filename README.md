# Principles

## 1.*SOLID* is an acronym for five basic Object Oriented Principles:
   SOLID refers to a set of five Object Orientated Design(OOD) principles , originally complied by Robert Martin that can be followed in order to design more scalable, flexible and maintainable codebases.
   
   **S** - Single Responsibilty Principle
   **O** - Open-Closed Principle
   **L** - Liskov substitution Principle
   **I** - Interface segregation Principle
   **D** - Dependancy Inversion Principle
   
 ### * Single Responsibility Principle (SRP)
   This principle is based on the fact that a class or module should only be concerned with one aspect of a program, or be responsible for one thing.
   * If it is updating the view, it should be concerned about updating the view only. It should not contain the logic of calculations or data conversions.
   * In MVVM, Activities and Fragments are responsible for drawing data to the screen, while our ViewModel can take care of holding and processing all the data needed for the UI.
 
 ### * Open-Closed Principle  
   Software entities such as classes, functions, modules should be open for extension but closed for modification.
   * It means that whenever we are writing a new functionality, we should not modify existing code. We should rather write new code which will be used by existing code.
   * We do this by creating abstractions, in languages such as kotlin we can use interfaces, this abstraction should then be injected where needed. The aim of this is to drive a modular design.
   