package hRankCode;

import java.util.Scanner;

public class MinimalDeletions {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		// String s = "AABA";
		//
		// for (int i = 1; i < s.length(); i++) {
		// int s2 = s.charAt(i) ^ s.charAt(i - 1);
		// System.out.println(s2);
		// }

		Scanner sc = new Scanner(System.in);
		int testCases = Integer.parseInt(sc.nextLine());
		if ((testCases < 1) || testCases > 10) {
			sc.close();
			return;
		}
		
		for (int i = 0; i < testCases; i++) {
			
			String str = sc.nextLine();
			if ((str.length() < 1) || str.length() > 100000) {
				sc.close();
				return;
			}
			System.out.println(numOfDeletions(str));
		}
		
		sc.close();
	}

	private static int numOfDeletions(String str) {
		int strLength = str.length();
		int counter = 0;

		for (int i = 1; i < strLength; i++) {
			int xor = str.charAt(i - 1) ^ str.charAt(i);
			if (xor == 0) {
				counter++;
			}
		}
		return counter;
	}
}
