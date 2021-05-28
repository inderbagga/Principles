# Principles

## 1.*SOLID* is an acronym for five basic Object Oriented Principles:
   
   * **S** - Single Responsibilty Principle
   * **O** - Open-Closed Principle
   * **L** - Liskov substitution Principle
   * **I** - Interface segregation Principle
   * **D** - Dependancy Inversion Principle
   
   SOLID refers to a set of five Object Orientated Design(OOD) principles , originally complied by Robert Martin that can be followed in order to design more scalable, flexible and maintainable codebases.
      
 ### Single Responsibility Principle (SRP)
   This principle is based on the fact that a class or module should only be concerned with one aspect of a program, or be responsible for one thing.
   * If it is updating the view, it should be concerned about updating the view only. It should not contain the logic of calculations or data conversions.
   * In MVVM, Activities and Fragments are responsible for drawing data to the screen, while our ViewModel can take care of holding and processing all the data needed for the UI.
 
 ### Open-Closed Principle  
   Software entities such as classes, functions, modules should be open for extension but closed for modification.
   * It means that whenever we are writing a new functionality, we should not modify existing code. We should rather write new code which will be used by existing code.
   * We do this by creating abstractions, in languages such as kotlin we can use interfaces, this abstraction should then be injected where needed. The aim of this is to drive a modular design.
   
 ### Liskov Substitution Principle
   In simple words, child class must be substitutable for the parent class.
   * Since child classes extended from the parent classes, they inherit their behavior.

  ### Interface Segregation Principle
    No client should be forced to depend on methods it does not use.
    * It means that a class should contain as many minimum methods as possible. Any interface that class inherits should consist of methods which are required by the class.

  ### Dependency Inversion Principle
    Depend on abstractions, not on details.
    * It tells us about the coupling between the different classes or modules.
    * High-level modules should not depend on low-level modules. Both should depend on abstractions (e.g. interfaces). It is based on removing the dependency with the interface.
    * Abstractions should not depend on details. Details (concrete implementations) should depend on abstractions.


  