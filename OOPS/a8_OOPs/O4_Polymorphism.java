package a8_OOPs;

class Student1 {
	String name;

	int age;

	public void printinfo(String name) {
		System.out.println(name);

	}

	public void printinfo(int age) {
		System.out.println(age);
	}

	public void printinfo(String name, int age) {
		System.out.println(name + " " + age);
	}
}

public class O4_Polymorphism {

	public static void main(String[] args) {
		Student1 a = new Student1();
		a.printinfo("ram", 12);
	}

}
