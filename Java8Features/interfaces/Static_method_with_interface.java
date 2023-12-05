package interfaces;

/*A static method is a method that is associated with the class rather than with any instance of the class.
 * 
 */
interface Kanhaiya {
	void click();

	static void travel() {
		System.out.println("i am traveller");
	}
}

public class Static_method_with_interface {

	public static void main(String[] args) {
		//Access: They can be called using the interface name, e.g., InterfaceName.staticMethod().
		Kanhaiya.travel();
	}

}
