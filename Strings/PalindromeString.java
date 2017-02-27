package Strings;

public class PalindromeString {

	public static void main(String[] args) {
		String a="madam";
		String b="";
//		System.out.println(a.length());
		for(int i=a.length()-1;i>=0;i--)
		{
			b+=a.charAt(i);
		}
		if(b.equals(a)){
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}
}
