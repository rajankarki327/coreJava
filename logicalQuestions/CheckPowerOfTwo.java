package logicalQuestions;

public class CheckPowerOfTwo {

	public static void main(String[] args) {
		int temp = 0;
		int x=4;

		for (int i = 1; x > temp; i++) {
			temp = (int) Math.pow(2, i);
		}

		if (x == temp) {
			System.out.println("number is power of two");
		} else {
			System.out.println("number is not power of two");
		}
	}

}
