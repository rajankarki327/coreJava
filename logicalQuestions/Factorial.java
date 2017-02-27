package logicalQuestions;

public class Factorial {
	int num;
	
	public static void main(String[] args) {
		Factorial obj=new Factorial();
		obj.factorialNum(5);
	}
	
	
	public void factorialNum(int num){
		this.num=num;
		long n=1;
		for(int i=1;i<num;i++)
		{
			n=n*(i+1);
		}
		System.out.println("factorial of "+num+" is: "+n);
	}

}
