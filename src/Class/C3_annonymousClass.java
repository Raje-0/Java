package Class;

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