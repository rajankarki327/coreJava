package series;

import java.util.Scanner;

public class NaturalNumberSum {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("enter total number");
		int n=scan.nextInt();
		int sum=0;
		sum=n*(n+1)/2;
		System.out.println(sum);
	}

}
