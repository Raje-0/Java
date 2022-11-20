package OOPs;
interface Laptop{
	void play() ;   //public , final , abstract  we donot define abstraxt(by default all interface are public abstract) mtd
	
	
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
