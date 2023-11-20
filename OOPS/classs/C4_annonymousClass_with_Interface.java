package classs;

interface A {
	void show();
}

public class C4_annonymousClass_with_Interface {

	public static void main(String[] args) {

		A ob = new A() {
			public void show() {
				System.out.println("I am defining the mtd of interrface");
			}

		};
		ob.show();
	}
}
