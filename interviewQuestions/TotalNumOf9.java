package interviewQuestions;


public class TotalNumOf9 {
	public static void main(String[] args) {
		int nines = 0;
		int n=20;
		for (int i = 1; i <= n; i++) {
			int num = i;
			while (num > 0) {
				int r = num % 10;
				num = num / 10;
				if(r==9){
					nines++;
				}
			}
		}
		System.out.println(nines);
	}

}

