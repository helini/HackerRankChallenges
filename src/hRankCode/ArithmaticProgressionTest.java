package hRankCode;

import java.util.Scanner;

public class ArithmaticProgressionTest {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int nums = sc.nextInt();
		int items[] = new int[nums];

		for (int i = 0; i < nums; i++) {
			items[i] = sc.nextInt();
		}
		System.out.println(findMissingNumber(items));

		sc.close();
	}

	public static int findMissingNumber(int arr[]) {
		int prev = 0;
		int diff = 0;
		int missingVal = 0;

		for (int i = 0; i < arr.length; i++) {

			if (i != 0) {
				diff = Math.abs(arr[i] - arr[i - 1]);
				
				if ((prev != 0) && (prev < diff)) {
					missingVal = arr[i - 1] + prev;
				}
				prev = diff;
			}
		}
		return missingVal;
	}
}
