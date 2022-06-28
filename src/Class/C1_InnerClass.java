package Class;

class Outer {

	public void show() {
		System.out.println("I am outer class");
	}

	class Inner {
		public void display() {
			System.out.println("I am inner class");
		}
	}
}

public class C1_InnerClass {

	public static void main(String[] args) {

		Outer obj1 = new Outer(); // calling outer class
		obj1.show();

		Outer.Inner obj2 = obj1.new Inner(); // calling inner class
		obj2.display();
	}

}
