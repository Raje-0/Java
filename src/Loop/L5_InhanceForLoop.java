package Loop;

public class L5_InhanceForLoop {
	public static void main(String[] args) {
		int a[]= {1,2,3,5,85,3};
		for(int i=0;i<6;i++) {
			System.out.println(a[i]);
		}
		
for(int k:a) {
	System.out.println(k);     //inhancedforloop
}
	}
}
