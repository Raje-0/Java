package string;



public class S1_String {

	public static void main(String[] args) {
		
		String a="hello";
		String b="java";
		
		System.out.println("addition of length of a & b = "+a.length()+b.length());

		//Lexicographical Order, also known as alphabetic or dictionary order 
		
		if (a.compareTo(b)>0) {
			System.out.println("yes");
		} else {
System.out.println("no");
		}
		
		 a = a.substring(0,1).toUpperCase()+a.substring(1).toLowerCase();
		    b = b.substring(0,1).toUpperCase()+b.substring(1).toLowerCase();
		    System.out.println(a+" "+b);
	}

}
