package interviewQuestions;

import java.util.ArrayList;

public class LargestPrimeFactorLowComplexicity {

	public static void main(String[] args) {
		long num = 600851475143l;
		ArrayList<Long> arr = new ArrayList<Long>();
		for (long i = 2; i <= num; i++) {
			if (num % i == 0) {
				num = num / i;
				arr.add(i);
			}
		}
		// System.out.println(arr);

		System.out.println("largest prime factor :" + arr.get(arr.size()-1));
	}
}
