package logicalQuestions;

public class GreaterNumberBetweenThree {

	public static void main(String[] args) {
		int a=31;
		int b=41;
		int c=5;
		if(a>b){
			if(c>a){
				System.out.println("c is greater");
			}
			else {
				System.out.println("a is greater");
			}
		}
		else if(b>c){
			System.out.println("b is greater");
		}
		else{
			System.out.println("c is greater");
		}
	}
}
