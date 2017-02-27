package series;

public class SeriesWithFactorial {
	public static void main(String[] args) {
		double sum=0.0;
		double a=1;
		double num=100;
		
		SeriesWithFactorial obj=new SeriesWithFactorial();
		while(a<=num){
			double f=obj.fact(a);
			sum=sum+a/f;
			a++;
		}
		System.out.println(sum);
		
	}
	public double fact(double num){
		int n=1;
		for(int i=1;i<num;i++)
		{
			n=n*(i+1);
		}
		return n;
	}
	
	}
