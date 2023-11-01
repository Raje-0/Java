package aa11_Class;

/*
 * a class contain another class is know as nested class or inner class
 * and  that class without name is called as annonymousClass
 */
class Laptop {
	public void code() {
		System.out.println("i am simple");
	}
}

public class C3_annonymousClass {
	public static void main(String[] args) {

		Laptop ob = new Laptop() {
			public void code() {
				System.out.println(" i am overriding");
			}
		};
		ob.code();
	}
}