package interviewQuestions;

import java.io.*;
import java.util.*;
import java.math.BigDecimal;

class PowerDigiSum {
	public static void main(String[] args) throws NumberFormatException {
		// scan the input
		System.out.println("Enter Base Value:");
		Scanner scan = new Scanner(System.in);
		int base = scan.nextInt();
		System.out.println("Enter Exponential Value: ");
		int exponential = scan.nextInt();

		// find the power
		String pow = findPower(base, exponential);
		System.out.println(base + "^" + exponential + "=" + pow);

		// calculate the sum of the power
		int result = sumOfPower(pow);
		System.out.println("Sum Of the Power: " + result);
	}

	public static String findPower(int x, int y) {
		// change the datatype for storing the big numbers
		BigDecimal result = new BigDecimal(x);
		BigDecimal x1 = new BigDecimal(x);
		if (y > 0) {
			for (int i = 1; i <= y - 1; i++) {
				result = result.multiply(x1);
			}
			return result.toString();
		} else
			return "1";
	}

	public static int sumOfPower(String power) {
		int sum = 0;
		for (int i = 0; i < power.length(); i++) {
			int digit = Integer.valueOf("" + power.charAt(i)).intValue();
			sum = sum + digit;
		}
		return sum;
	}
}
