package Class;

class C {
	public void show() {
		System.out.println("in a SHOW");
	}
}

public class C6_Anonymous {

	public static void main(String[] args) {
		C obj = new C() {

			public void show() {
				System.out.println("I am anonymous class");
			}
		};

		obj.show();
	}

}
