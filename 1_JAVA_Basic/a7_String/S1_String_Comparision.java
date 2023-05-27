package a7_String;

public class S1_String_Comparision {
	public static void main(String[] args) {


	    String a= new String("kanhaiya");
	    String b= new String("rjae");
	    String c= a;
	    System.out.println(a==b);
	    System.out.println(a==c);

	    String name1= new String("kanhaiya");
	    String name2= new String("kanhaiya");
	    System.out.println(name1==name2);
	    System.out.println(name1.equals(name2));
	  }
}
