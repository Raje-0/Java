package a6_Array;

public class A1_Array {

	public static void main(String[] args) {
		String[] name = { "ram", "syam", "sita", "raje" };

		System.out.println(name[3]);

		System.out.println(name.length);

//		for (int i = 0; i < name.length; i++) {
//			System.out.println(name[i]);
//		}
     for(String k:name) {
     	System.out.println(k);    //enhance for -loop
     }
	}
}
