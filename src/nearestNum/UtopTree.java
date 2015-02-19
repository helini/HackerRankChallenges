package nearestNum;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 1h 10m :(
 * 
 * @author hel
 * 
 */
public class UtopTree {

	private int lines = 0;
	private int[] numOfCycles;

	enum Season {
		SPRING, SUMMER;
	}

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		/**
		 * Method 1.
		 */
		// UtopTree solution = new UtopTree();
		// int initHeight = 1;
		// solution.readInput();
		//
		// for (int cycles : solution.numOfCycles) {
		// if (cycles == 0)
		// System.out.println(initHeight);
		// else
		// System.out.println(solution.getHeightPerCycle(cycles));
		// }

		/**
		 * Method 2.
		 */
		try {
			BufferedReader bfr = new BufferedReader(new InputStreamReader(
					System.in));
			int lines = Integer.parseInt(bfr.readLine());

			for (int i = 0; i < lines; i++) {
				int seasonsPerCycle = Integer.parseInt(bfr.readLine());
				int currHeight = 1;

				for (int j = 1; j <= seasonsPerCycle; j++) {
					if (j % 2 == 0)
						currHeight += 1;
					else
						currHeight *= 2;
				}
				System.out.println(currHeight);
			}
		} catch (Exception e) {
			System.err.println("Error in reading input:  " + e.getMessage());
		}

	}

	public void readInput() {
		Scanner sc = new Scanner(System.in);
		lines = Integer.parseInt(sc.nextLine());
		numOfCycles = new int[lines];

		for (int i = 0; i < lines; i++)
			numOfCycles[i] = Integer.parseInt(sc.nextLine());

		sc.close();
	}

	public int getHeightPerCycle(int cycles) {
		int currHeight = 1;

		for (int i = 1; i <= cycles; i++) {
			if (i % 2 == 0) {
				currHeight = increaseHeight(currHeight, Season.SUMMER);
			} else
				currHeight = increaseHeight(currHeight, Season.SPRING);
		}
		return currHeight;
	}

	private int increaseHeight(int currHeight, Season sn) {
		switch (sn) {
		case SPRING:
			return (currHeight * 2);
		case SUMMER:
			return (currHeight + 1);
		default:
			return currHeight;
		}
	}
}
