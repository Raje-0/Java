package question;

public class B1_BinToDec {
	public static void binTodec(int binNum) {
		int pow = 0;
		int decNum = 0;
		while (binNum > 0) {
			int lastDigit = binNum % 10;
			decNum = (lastDigit * (int) Math.pow(2, pow));
			pow++;
			binNum = binNum / 10;
		}
		System.out.println(decNum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int binNum = 1010;
		binTodec(binNum);
	}

}
