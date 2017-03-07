package interviewQuestions;

import java.util.Scanner;

public class SumOfNnumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		System.out.println("how many number you want to sum from 1");
		int num = scan.nextInt();
//		for (int i = 1; i <= num; i++) {
//			sum=sum+num;
//		}
		
		for(int i=1;i<=num;i++){
			if(i%3==0 || i%5==0){
				sum=sum+i;
			}
		}
		System.out.println("sum of "+num+"is "+sum);

	}

}
