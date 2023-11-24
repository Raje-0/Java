package j2_LambdaExpression;

interface P {
}

class Y implements P {
}

class X extends Y {
}

public class IntenseOf {

	public static void main(String[] args) {

		X obj = new X();
		Y ob = new X();
		P object =new Y();
		System.out.println(obj instanceof X);
		System.out.println(obj instanceof Y);
		System.out.println(object instanceof P);
	
		
		//for  instenceof  operator 
		String name="raje";
		boolean result = (name instanceof String); 
			
		
		System.out.println("name is string = "+result);
		
	}

}
