package logicalQuestions;

public class FibonacciSeries {

		public static void main(String[] args){
		 FibonacciSeries obj=new FibonacciSeries();
		 obj.Fibo(10);
		}
		
		public void Fibo(int totalNumber){
			int a=0;
			int b=1;
			System.out.println(a);
			System.out.println(b);
			for(int n=2;n<totalNumber;n++)
			{
				int temp=a+b;
			    a=b;
				b=temp;
				
				System.out.println(temp+" ");
			}
		
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static void main(String[] args) {
//		FibonacciSeries obj = new FibonacciSeries();
//		obj.fibonacci(10);
//	}
//	
//	public void fibonacci(int numOfSeries){
//		int a=0;
//		int b=1;
//		System.out.println(1%10);
//		System.out.println(a+" "+b);
//		for(int n=2;n<numOfSeries;n++){
//			int temp=a+b;
//			a=b;
//			b=temp;
//			System.out.println(" "+temp);
//		}
//	}
//}
