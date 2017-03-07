package interviewQuestions;

import java.util.ArrayList;

public class Fibo {
	public int fibonacci(int n, ArrayList<Integer> arr) {
		if (n <= 1) {
			return n;
		} else if (arr.size() - 1 == n) {
			return arr.get(n);
		} else {
			int fiboNumber = fibonacci(n - 1, arr) + fibonacci(n - 2, arr);
			arr.add(fiboNumber);
			return fiboNumber;
		}

	}

	public static void main(String[] args) {
		long n = 50;
		Fibo obj = new Fibo();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(0);
		arr.add(1);
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < n; i++)
			System.out.print(obj.fibonacci(i, arr) + " ");
		long endTime = System.currentTimeMillis();
		long timeDiff = endTime - startTime;
		System.out.println("time difference = " + timeDiff);

	}
}
