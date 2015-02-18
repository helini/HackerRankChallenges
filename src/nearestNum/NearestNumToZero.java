package nearestNum;

import java.util.Arrays;

public class NearestNumToZero {

	public static int nearToZero(int[] ints) {

		if ((ints == null) || (ints.length == 0))
			return 0;

		/**
		 * Method 1
		 */
		// Arrays.sort(ints);
		// for (int i : ints)
		// System.out.print(i + ", ");
		//
		// int currDistance = 0, prevDistance = 0;
		//
		// for (int i = 0; i < ints.length - 1; i++) {
		// currDistance = Math.abs(ints[i] - 0);
		//
		// if ((i != 0) && (prevDistance < currDistance)) {
		// System.out.println("\nFound number " + Math.abs(ints[i - 1])
		// + " at position " + (i - 1));
		// break;
		// }
		// prevDistance = currDistance;
		// }

		/**
		 * Method 2
		 */
		int num = Math.abs(ints[0]);
		int index = 0;
		for (int i = 1; i < ints.length; i++) {

			int currAbsNum = Math.abs(ints[i]);
			num = Math.min(num, currAbsNum);

			if (num == currAbsNum)
				index = i;
		}
		System.out.println("Found number " + ints[index] + " at position "
				+ index);
		return 0;
	}
}

class A {
	public static void main(String args[]) {
		int[] ints = { 9, 3, 5, -1, 2, -4, 8 };
		int[] a = { 2, 6, -2, -5, 1, 5, 8 };
		int[] b = { 4, 0, -2, -5, 1, 5, 10, 2, 6, -2, -5, 1, 5, 8 };
		int[] c = { -6, -4, 4, 6, 8 };
		NearestNumToZero.nearToZero(ints);
		NearestNumToZero.nearToZero(a);
		NearestNumToZero.nearToZero(b);
		NearestNumToZero.nearToZero(c);
	}
}