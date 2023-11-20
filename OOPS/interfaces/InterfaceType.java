package interfaces;

public class InterfaceType {
	/*
	 * In Java, an interface is a reference type that is similar to a class but is a
	 * collection of abstract methods. It is a mechanism to achieve full
	 * abstraction, as it only specifies what a class must do and not how it should
	 * do it. An interface can also contain constant fields. Classes that implement
	 * interfaces must provide an implementation for all the methods declared in the
	 * interface.
	 * 
	 * There are different types of interfaces in Java:
	 * 
	 * Normal Interface: This type of interface contains only abstract method
	 * declarations and constant fields. Here's an example: java
	 */
	// Normal interface
	interface Animal {
		void sound(); // abstract method

		String getType(); // abstract method
		// Constant field

		String CATEGORY = "Mammal";
	}

	/*
	 * Functional Interface: A functional interface is an interface that contains
	 * only one abstract method. It is often used in lambda expressions and
	 * functional programming. The @FunctionalInterface annotation can be used to
	 * ensure that the interface is a functional interface. java
	 */
	// Functional interface
	@FunctionalInterface
	interface Calculator {
		int calculate(int a, int b); // abstract method
	}

	/*
	 * Marker Interface: A marker interface is an interface that does not declare
	 * any methods. It is used to indicate a special behavior or capability to
	 * implementing classes. An example of a marker interface is the Serializable
	 * interface in Java, which is used to mark classes that can be serialized. java
	 */
	// Marker interface
	interface Marker {
		// No methods
	}

	/*
	 * Single Abstract Method (SAM) Interface (since Java 8): Also known as a
	 * single-method interface, it is an interface that contains only one abstract
	 * method. It is commonly used with lambda expressions. This concept is closely
	 * related to functional interfaces. java
	 */
	// Single Abstract Method (SAM) interface
	interface Greeting {
		void greet(String name); // abstract method
	}
	// Java interfaces provide a way to achieve abstraction and multiple
	// inheritances. Classes can implement multiple interfaces, allowing them to
	// inherit the abstract methods and constants from those interfaces. They are
	// widely used to achieve loose coupling and to define contracts that
	// implementing classes must follow, ensuring consistency and interoperability
	// in Java applications.
}
