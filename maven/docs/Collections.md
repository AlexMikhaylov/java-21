# List vs. Set vs. Map

- **List:** An ordered collection (also known as a sequence). Lists can contain duplicate elements. The `ArrayList` and `LinkedList` are common implementations. Lists are useful when you need to maintain the insertion order and access elements by their index.
- **Set:** A collection that does not allow duplicate elements. Sets are typically used when you need to ensure that an element is not repeated. `HashSet`, `LinkedHashSet`, and `TreeSet` are common implementations. `TreeSet` also maintains elements in natural order.
- **Map:** A collection of key-value pairs. Maps do not allow duplicate keys, but values can be duplicated. `HashMap`, `TreeMap`, and `LinkedHashMap` are common implementations. Maps are particularly useful when you need to associate data (e.g., mapping a name to a phone number).

# Generics in Collections

- **Purpose:** Generics provide a way to create classes, interfaces, and methods that can operate on any specified type while providing compile-time type safety. They allow for code reusability and reduce the risk of `ClassCastException` at runtime.

### Example of Raw Types Leading to Errors

```java
List list = new ArrayList(); // raw type, no generics
list.add("string");
list.add(123); // adding an integer
String s = (String) list.get(1); // throws ClassCastException at runtime
```

Using raw types can lead to runtime errors like ClassCastException because the type of elements in the list is not enforced at compile time.

### Example with Generics

```java
List<String> list = new ArrayList<>();
list.add("string");
list.add("another string"); // Compile-time type safety
String s = list.get(1); // Safe, no cast needed
```

With generics, you specify the type (String in this case), ensuring that only objects of that type can be added to the list, preventing runtime type errors.

Generics enhance code safety by catching type-related errors during compilation rather than at runtime, leading to more robust and maintainable code.