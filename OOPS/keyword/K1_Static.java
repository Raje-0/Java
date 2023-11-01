package keyword;

class Emp {
	static String ceo = "ram"; //all the object is sharing same ceo
	int sallery;
	int id;

	public void showinfo() {
		System.out.println(ceo + " " + sallery + " " + id);
	}
}

public class K1_Static {

	public static void main(String[] args) {

		Emp rahul = new Emp();
		rahul.sallery = 22000;
		rahul.id = 1;
		rahul.showinfo();

		Emp raje = new Emp();
		raje.sallery = 25000;
		raje.id = 2;
		raje.showinfo();

	}

}
