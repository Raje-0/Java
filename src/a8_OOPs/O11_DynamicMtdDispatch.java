package a8_OOPs;

class Parent {
	public void show() {
		System.out.println("in parent");
	}
}

class Child extends Parent {
	public void show() {
		System.out.println("I am child");
	}
}

public class O11_DynamicMtdDispatch {

	public static void main(String[] args) {

		Parent obj = new Child();
		obj.show();
// showing  child mtd  because we used child object
	}

}
