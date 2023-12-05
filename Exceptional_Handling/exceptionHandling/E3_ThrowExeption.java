package exceptionHandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class E3_ThrowExeption {

	public static void main(String[] args) throws Exception {
		System.out.println("enter a number");

		BufferedReader br = new BufferedReader(new InputStreamReader(null));

		int n = Integer.parseInt(br.readLine());

		System.out.println(n);
	}

}
