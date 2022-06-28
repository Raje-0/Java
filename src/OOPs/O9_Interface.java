package OOPs;
interface Laptop{
	void play() ;   //public , final , abstract
	
}
class Acer implements Laptop{

	@Override
	public void play() {
		System.out.println("I'm acer");
		
	}
	
}
public class O9_Interface {

	public static void main(String[] args) {
		
Laptop a = new Acer();  //Laptop not acer
a.play();
	}

	

}
