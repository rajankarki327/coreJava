package logicalQuestions;


public class LcmGcd {
	int max;
	int min;
	int gcdNum;
	int lcmNum;
	
	
	public static void main(String[] args) {
		LcmGcd obj = new LcmGcd();
		System.out.println("gcd of two numbers "+obj.gcd(5,25));
		System.out.println("lcm of two numbers "+obj.lcm(5,5));
	}
	
	public int gcd(int a,int b){
		if(a>b){
			max=a;
			min=b;
		}
		else {
			max=b;
			min=a;
		}
		gcdNum=min;
		while(max%min!=0){
			gcdNum=max%min;
			max=min;
			min=gcdNum;
		}
		return gcdNum;
		
	}
	
	public int lcm(int a,int b){
		lcmNum=a*b/gcd(a,b);
		return lcmNum;
	}

}
