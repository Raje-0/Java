package Array;

public class A2_MultiDimensionalArray {

	public static void main(String[] args) {
		int d[][]= {
				{1,2,3,4},
				{9,8,6},
				{0,6,7,8}
		};
				
//		System.out.println(d[0][0]);
		
		
		for(int i=0;i<d.length;i++) {
			for(int j=0;j<d[i].length;j++) {
				System.out.print(d[i][j]);
			}
			System.out.println();
		}

	}

}
