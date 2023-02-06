package looping;

public class L2_Continue {

	public static void main(String[] args) {
		for(int a=0;a<=10;a++) {
			if(a==5) {
				continue;
			}
			System.out.println("the value is :"+a);
		}
	}

}
