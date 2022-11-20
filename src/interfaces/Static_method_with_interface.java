package interfaces;


interface Kanhaiya{
	void click();
	static  void travel() {
		System.out.println("i am traveller");
	}
}
public class Static_method_with_interface {

	public static void main(String[] args) {
		Kanhaiya.travel();
	}

}
