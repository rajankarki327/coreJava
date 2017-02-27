package logicalQuestions;

public class ArmstrongNumber {
	static int n=54748;
	public static void main(String[] args) {
		int num=n;
		int length = String.valueOf(num).length();
//		System.out.println(length);
		int sum=0;
		
		while(num>0){
			int r=num%10;
			sum=(int) (sum+Math.pow(r, length));
			num=num/10;
		}
		if(sum==n){
			System.out.println(n+" is amstrong number");
		}
		else{
			System.out.println(n+" is not amstrong number");
		}
		
	}

}
