package Keyword;
class Calcul{
	int num1;
	int num2;
	int result;
	public Calcul(int num1, int num2) {                   //default constr
	this.num1=num1;    //current object
	this.num2=num2;

	
	}
	
}
public class K5_This {
	public static void main(String[] args) {
		Calcul obj= new Calcul(8,6);
		
		System.out.println(obj.num1);
		System.out.println(obj.num2);
		

	}
}
