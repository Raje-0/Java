package a8_OOPs;

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
