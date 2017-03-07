package interviewQuestions;

public class PrimeNumber10001st {

	public static void main(String[] args) {
		int prime=2;
		int counter = 0;
		int n=2;
		int item=5;

		while (counter < item) {
			boolean isPrime = true;
			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime) {
				prime=n;
				counter++;

			}
			n++;

		}
		
		
		System.out.println("10001st prime number is:"+prime);
	}
}
