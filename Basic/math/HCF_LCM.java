package math;

public class HCF_LCM {
	// Function to calculate HCF (GCD) of two numbers
	public static int findHCF(int num1, int num2) {
		while (num2 != 0) {
			int temp = num2;
			num2 = num1 % num2;
			num1 = temp;
		}
		return num1;
	}

	// Function to calculate LCM of two numbers
	public static int findLCM(int num1, int num2) {
		// LCM * HCF = product of the numbers
		int lcm = (num1 * num2) / findHCF(num1, num2);
		return lcm;
	}

	public static void main(String[] args) {
		int num1 = 12;
		int num2 = 18;

		// Find and display HCF
		int hcf = findHCF(num1, num2);
		System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);

		// Find and display LCM
		int lcm = findLCM(num1, num2);
		System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
	}                                           
}
