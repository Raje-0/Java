package bit_Manupulation;

public class BM5_Operations {

	public static int getithBit(int n, int i) {
		int bitmask = 1 << i;
		if ((n & bitmask) == 0) {
			return 0;
		} else {
			return 1;
		}
	}

	public static int setithBit(int n, int i) {
		int bitmask = 1 << i;
		return n | bitmask;
	}

	public static int clearithBit(int n, int i) {
		int bitmask = ~(1 << i);
		return n & bitmask;
	}

	public static int updateithBit(int n, int i, int newBit) {
		if (newBit == 0) {
			return clearithBit(n, i);
		} else {
			return setithBit(n, i);
		}
	}

	public static void main(String[] args) {
		System.out.println(getithBit(10, 03));
		System.out.println(getithBit(10, 2));

		System.out.println(setithBit(10, 2));

		System.out.println(clearithBit(10, 2));
		
		System.out.println(updateithBit(10, 02, 01));
	}
}
