package logicalQuestions;

public class SumOfDigit {

	public static void main(String[] args) {
		int num=12993;
		int sum=0;
		int length=String.valueOf(num).length();
		
		while(num>0){
			int r=num%10;
			sum=sum+r;
			num=num/10;
		}
		System.out.println("sum="+sum);
	}
}
