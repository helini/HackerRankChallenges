package nearestNum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LonelyNumTest {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		// ////////////////////////////////////////////////////////////////////////
		/**
		 * Scanner.nextInt() only accept one integer value. But the
		 * Scanner.nextLine() will accept as much literals as needed, by moving
		 * a cursor to the next sc.nextLine() function.
		 */

		// String s1 = sc.nextLine();
		// System.out.println("******" + s1);
		//
		// String s2 = sc.nextLine();
		// System.out.println(s2);
		//
		// int a = sc.nextInt();
		// System.out.println(a);
		// int b = sc.nextInt();
		// System.out.println(b);
		// int numOfItems = sc.nextInt();
		// System.out.println(numOfItems);

		// ////////////////////////////////////////////////////////////////////////

		int numofItems = Integer.parseInt(sc.nextLine());
		int arr[] = new int[numofItems];

		String itemsInput = sc.nextLine();
		String arrItems[] = itemsInput.split(" ");

		for (int i = 0; i < numofItems; i++) {
			arr[i] = Integer.parseInt(arrItems[i]);
		}
		
		System.out.println(lonelyIntWithDuplicates(arr));
		sc.close();
	}
	
	public static int lonelyIntWithDuplicates(int arr[]){
		int unique = 0;
		for(int i: arr){
			unique &= i;
		}
		return unique;
	}
	
	public static int lonelyIntWithMultiples(int arr[]){
		return 0;
	}

}
