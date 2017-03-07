package interviewQuestions;

public class SmallestMultiple {

	public static void main(String[] args) {
		int n = 2000000;
		int requiredNum = 0;
		boolean check = false;
		while (check == false) {
			for (int i = 1; i <= 20; i++) {
				if (n % i == 0) {
					int t=n/i;
					if(t%2==0){
						check = true;
					}
				} else {
					check = false;
					break;
				}

			}

			if (check) {
				requiredNum = n;
			} else {
				n++;
			}
		}
		System.out.println("required number:" + requiredNum);
	}
}
