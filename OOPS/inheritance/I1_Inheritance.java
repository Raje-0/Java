package inheritance;
/*inheritance - extend 
 * java does not support multiple inheritance - we can use intercae 
 * 
 * in Java, inheritance is a fundamental feature that allows a class to inherit properties 
 * and behaviors from another class. The class that is being inherited from is known as the 
 * superclass or base class, and the class that inherits from it is known as the subclass or 
 * derived class. Inheritance promotes code reusability and establishes a hierarchical relationship 
 * between classes.
 * 
 */
class Shape {
	public void area() {
		System.out.println("displays area");
	}
}

class Triangle extends Shape {
public void area(int l, int h) {
	System.out.println(1/2*l*h);
}
}
class Circle extends Shape{
	public void area(int r) {
		System.out.println((3.14)*r*r);
	}
}

public class I1_Inheritance {

	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		
		t1.area();
	
		
	}

}
