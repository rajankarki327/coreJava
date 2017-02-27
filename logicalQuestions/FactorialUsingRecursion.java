package logicalQuestions;

public class FactorialUsingRecursion {
	//static int factorial(int n){//using static keyword without creating object
	  int factorial(int n){    
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n * factorial(n-1));    
		 }    
		 public static void main(String args[]){  
		  int fact=1;  
		  int number=2;//It is the number to calculate factorial    
		  FactorialUsingRecursion obj = new FactorialUsingRecursion();
		  fact=obj.factorial(number);
//		  fact = factorial(number);//without creating object(making factorial method as static   
		  System.out.println("Factorial of "+number+" is: "+fact); 
		  
		  for(int i=2;i<=fact/2;i++){
			  if(fact%i==0){
				 System.out.println("not prime");
				 break;
			  }
			  else{
				  System.out.println("factorial of"+number+"is prime");
			  }
		  }
		 } 
}
