package nearestNum;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.*;

public class Solution {
	// /* Target string A */
	// String target;
	// /* Source string B */
	// String source;
	//
	// /* Reads and populates the input values */
	// void readInputValues() throws Exception {
	// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	// target = br.readLine();
	// source = br.readLine();
	// }
	//
	// public static void main(String args[]) throws Exception {
	// Solution solution = new Solution();
	// solution.readInputValues();
	//
	// System.out.println(solution.getOccurances());
	// // Use System.out.println with the result to run the tests
	// }
	//
	// int getOccurances() {
	// int occurances = 0;
	// Map<String, Integer> distinctChars = new HashMap<>();
	//
	// if (target.equals("") || source.equals("") || (target == null)
	// || (source == null))
	// occurances = 0;
	//
	// for (int i = 0; i < source.length(); i++) {
	// String ch = String.valueOf(source.charAt(i)).toLowerCase();
	// distinctChars.put(ch, 0);
	//
	// }
	//
	// for (String s : distinctChars.keySet()) {
	// Pattern pattern = Pattern.compile(s);
	// Matcher matcher = pattern.matcher(target.toLowerCase());
	// int count = 0;
	// while (matcher.find()) {
	// System.out.println("hhhhh");
	// count++;
	// }
	// occurances += count;
	// }
	// return occurances;
	// }

	/* List of numbers A */
	List<Integer> sourceList;
	/* Numbers difference N */
	int difference;

	/* Reads and populates the input values */
	void readInputValues() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] list = br.readLine().split(" ");
		sourceList = new ArrayList<Integer>();
		for (String num : list) {
			sourceList.add(Integer.valueOf(num));
		}
		difference = Integer.valueOf(br.readLine());
	}

	public static void main(String args[]) throws Exception {
		Solution solution = new Solution();
		solution.readInputValues();

		int arrSize = solution.getPairArraySize();
		System.out.println(arrSize);
	}

	int getPairArraySize() {
		int count = 0;
		List<Integer> srcCopy = new ArrayList<>();
		srcCopy.addAll(sourceList);
		
		for (int currVal : sourceList) {
//			System.out.println(srcCopy);
			for (int i = 0; i < srcCopy.size(); i++) {
				
				if (Math.abs(srcCopy.get(i) - currVal) == difference)
					count++;
			}
			srcCopy.remove(new Integer(currVal));
		}
		return count;
	}
}
