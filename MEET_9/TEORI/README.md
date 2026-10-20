# Meet 9 — Abstract Class (Theory)

## Case study: AlatPendakian (Hiking Equipment)

`BackpackingEquipment` is an abstract superclass: equipment shares a name, weight, and the concrete `showInfo()` behavior, but each kind explains its use differently. Its abstract `getUsage()` method requires every concrete subtype to provide that behavior. `Tent`, `SleepingBag`, and `Backpack` are concrete subclasses.

### Abstract-class concept
- An abstract class cannot be instantiated directly; it is intended to be extended.
- It may contain fields, constructors, concrete methods, and abstract methods.
- An abstract method has no body. Every concrete subclass must implement it (otherwise that subclass must also be abstract).
- In UML, mark the class name and abstract operation in italics, or annotate the class with `<<abstract>>`; inheritance uses a hollow triangle pointing to the superclass.

### Files and run
Each Java class is in its own file. From this directory:

```sh
javac *.java
java Main
```

`BackpackingEquipment.java` demonstrates both one concrete method (`showInfo`) and one abstract method (`getUsage`). The UML diagram is `AlatPendakian_AbstractClass.drawio`.
