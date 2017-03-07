package interviewQuestions;

import java.util.ArrayList;

public class LargestPrimeFactor {

	public static void main(String[] args) {
		long num=200l;
		long temp;
		ArrayList<Long> arr = new ArrayList<Long>();
		for(long i=2;i<=num;i++){
			boolean isPrime=true;
			for(long j=2;j<=i/2;j++){
				temp=i%j;
				if(temp==0){
					isPrime=false;
					break;
				}
			}
			if(isPrime){
				if(num%i==0){
					arr.add(i);
				}
				
			}
		}
		System.out.println(arr);
		long max=arr.get(0);
		
		for(int i=1;i<arr.size();i++){
			if(max<arr.get(i)){
				max=arr.get(i);
			}
		}
		System.out.println("largest prime factor :"+max);
	
		
	}
}
