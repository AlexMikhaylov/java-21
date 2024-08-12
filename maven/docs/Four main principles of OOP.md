## Four main principles of object-oriented programming

# 1) Encapsulation
Encapsulation is the practice of bundling the data (attributes) and the methods (functions) that operate on the data into a single unit or class, and restricting access to some of the object's components. This is achieved through access modifiers such as "private", "protected", and "public".

Encapsulation helps to protect the internal state of an object from unintended or harmful changes and allows the internal implementation of the class to be changed without affecting other parts of the code.

# 2) Abstraction
Abstraction involves hiding the complex implementation details of a class or method and exposing only the necessary and relevant features. It allows the developer to focus on what an object does rather than how it does it.

Abstraction reduces complexity and enhances maintainability by allowing the developer to manage complexity by breaking down a system into smaller, more manageable pieces.

# 3) Inheritance
Inheritance is a mechanism that allows one class (the subclass or derived class) to inherit attributes and methods from another class (the superclass or base class). This promotes code reuse and establishes a natural hierarchy between classes.

Example: The ScientificCalculator extends the Calculator class, the ScientificCalculator inherits all the basic arithmetic methods and could add new methods for scientific calculations (e.g., sine, cosine).

Inheritance allows for code reuse, making it easier to create and maintain a hierarchy of related classes. It also enables polymorphism, which is another core OOP principle.

# 4) Polymorphism
Polymorphism allows objects of different classes to be treated as objects of a common super class. It’s typically achieved through method overriding (where a subclass provides a specific implementation of a method that is already defined in its superclass) and method overloading (where multiple methods have the same name but different parameters).

Example: If the Calculator class had a method calculate, and the ScientificCalculator class overrode this method to provide more advanced calculations, you could call calculate on a Calculator object and get different behavior depending on whether the object was actually an instance of Calculator or ScientificCalculator.

Polymorphism enhances flexibility and scalability in code, allowing the same interface to be used for different underlying data types.