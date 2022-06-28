package OOPs;

class Studentss {
	int i;
	String name;
	char section;

	public Studentss(int i) {
		System.out.println("Student roll no - " + i);
	}

	public Studentss(String name) {
		System.out.println("name is " + name);
	}

	public Studentss(int i, String name) {
		this.i = i;
		this.name = name;

		System.out.println("Student  name is " + i + name);

	}
}

public class O2_Constructor {

	public static void main(String[] args) {

		Studentss obj = new Studentss(1);

	}

}
