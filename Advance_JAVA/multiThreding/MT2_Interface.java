package multiThreding;
class Hey implements Runnable {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}
}

class Helllo implements Runnable {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}
}

public class MT2_Interface {

	public static void main(String[] args) {
		Hey obj1 = new Hey();
		Helllo obj2 = new Helllo();
Thread t1 = new Thread(obj1);
Thread t2= new Thread(obj2);

		
		t1.start();
		t2.start();

	}

}
