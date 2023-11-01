package oops;

/*
 * In Java, a class is a blueprint or template for creating objects. It serves as a model that 
 * defines the data and behavior of objects. It encapsulates data for the object and provides 
 * methods to manipulate that data. A class can be considered as a user-defined data type that 
 * contains its own data members (fields) and member functions (methods).

An object, on the other hand, is an instance of a class. When a class is defined, no memory 
is allocated. However, when an object is created using the new keyword, memory is allocated 
for the object, and the constructor of the class is invoked to initialize the object. An object 
represents a specific instance of a class and can access the members (fields and methods) of that class.
 */
class Pen {
	String type;
	String color;

	public void write() {
		System.out.println("I am writing");
	}
}

public class O1a_ClassObject {

	public static void main(String[] args) {
		Pen p1 = new Pen();
		p1.color = "red";
		p1.type = "gel";
		p1.write();
		System.out.println(p1.color);

	}

}
