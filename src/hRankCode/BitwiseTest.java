package hRankCode;

import java.util.Scanner;

public class BitwiseTest {
	public static void main(String args[]) {
		Scanner scnr = new Scanner(System.in);

		System.out.println("enter x:");
		int x = scnr.nextInt();
		int b = 0;		
		System.out.println("final result: "+Integer.toBinaryString(Integer.reverse(x)));
		
		flipBinaryDigits();
		
		scnr.close();
	}
	
	/**
	 * Flipping Binary bits.
	 */
	public static void flipBinaryDigits(){
		Scanner sc = new Scanner(System.in);
		
		long num = sc.nextLong();
		Long flipped = ~num;
		int base = 2;
		
		Long l = Long.parseLong(Integer.toBinaryString(flipped.intValue()), base);
		System.out.println(l);
		System.out.println(l.intValue());
		sc.close();
	}

	/**
	 * Obtaining Binary value from a Integer.
	 */
	 public static void getTheBinaryValue() {
	 int number;
	
	 Scanner in = new Scanner(System.in);
	
	 System.out.println("Enter a positive integer");
	 number = in.nextInt();
	
	 if (number < 0) {
	 System.out.println("Error: Not a positive integer");
	 } else {
	
	 /* Method 1 */
	 System.out.print("Convert to binary is:" +
	 Integer.toBinaryString(number));
	
	 /* Method 2 */
	 //printBinaryform(number);
	 }
	 }

	private static void printBinaryform(int number) {
		int remainder;

		if (number <= 1) {
			System.out.print(number);
			return; // KICK OUT OF THE RECURSION
		}

		remainder = number % 2;
		printBinaryform(number >> 1);
		System.out.print(remainder);
	}
}
