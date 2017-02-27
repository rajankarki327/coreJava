package series;

public class NaturalSeriesWithPower {
	//Program to  find the sum of  1+2^2+3^3 +4^4+…..N^

	public static void main(String[] args) {
//		System.out.println(Math.pow(2, 3));
		int a=1;
		int b=1;
		int n=2;//total number on series
		int sum=0;
		for(int i=0;i<n;i++){
		sum=(int) (sum+Math.pow(a, b));
		a++;
		b++;
		}
		System.out.println(sum);
		
	}

}
