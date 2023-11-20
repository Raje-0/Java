package encapsulation;
/*
 * binding data through method
 */
class Students{
	private int rollno;
	private String name;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
}
public class O12_Encapsulation {

	public static void main(String[] args) {
		 
Students a= new Students();
a.setRollno(1);
System.out.println(a.getRollno());
	}

}
