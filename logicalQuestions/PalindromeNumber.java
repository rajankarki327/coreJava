package logicalQuestions;

public class PalindromeNumber {
	 public static void main(String args[]){ 
		 PalindromeNumber obj=new PalindromeNumber();
		 obj.palindrome(121);
	 } 
		  

public void palindrome(int a){
	int num=a;
	int sum=0;
	while(num>0){
		int r=num%10;
		sum=(sum*10)+r;
		num=num/10;
	}
	if (sum==a){
		System.out.println("palindrome");
	}
	else {
		System.out.println("not palindrome");
	}
}
}