package arrrys;

import java.util.Scanner;

public class SearchItem {

	public static void main(String[] args) {
		boolean numExit=false;
		int counter=0;
		int[] a={3,4,6,94,5,7,2,8,2,8,48,};
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number that you want to search in given array");
		int num=scan.nextInt();
		for(int i=0;i<a.length;i++){
			if(num==a[i]){
//				numExit=true;
//				break;
				counter++;
				System.out.println("the number "+num +"is available at location "+(i+1)+".");
			}
				
		}
		System.out.println("there has "+counter +"item of number "+num);

//		if(numExit){
//			System.out.println("number exits");
//		}
//		else{
//			System.out.println("number doesnot exist");
//		}
	}
}
