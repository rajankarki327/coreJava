package interviewQuestions;

import java.math.BigDecimal;
import java.util.Scanner;

public class Problem16 {
	public static void main(String[] args) {
		System.out.println("enter base and exponential value");
		Scanner scan = new Scanner(System.in);
		int base = scan.nextInt();
		int expo = scan.nextInt();
		String powers = findPower(base, expo);
		sum(powers);
//		System.out.println(powers);
	}

	public static String findPower(int base, int expo) {
		BigDecimal result = new BigDecimal(base);
		BigDecimal x1 = new BigDecimal(base);
		for (int i = 1; i < expo; i++) {
			result = result.multiply(x1);
		}
		return result.toString();

	}

	public static void sum(String s) {
		int sum=0;
		for(int i=0;i<s.length();i++){
			int digit= Integer.valueOf("" + s.charAt(i)).intValue();
			sum+=digit;
		}
		System.out.println("sum="+sum);
	}

}
