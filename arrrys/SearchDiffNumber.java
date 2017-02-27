package arrrys;
//WAP to find total prime number,even number,odd number,armstrong number present in the array?
public class SearchDiffNumber {
	static int pCount=0;
	static int eCount=0;
	static int oCount=0;
	static int aCount=0;

	public static void main(String[] args) {
		int[] arr={1,21,31,43,153,31,63,36};
		SearchDiffNumber obj = new SearchDiffNumber();
		for(int i=0;i<arr.length;i++){
		obj.prime(arr,arr[i]);
		obj.evenOdd(arr[i]);
		obj.armstrong(arr[i]);
		}
		System.out.println("total prime number = "+pCount);
		System.out.println("total even number = "+eCount);
		System.out.println("total odd number = "+oCount);
		System.out.println("total amstrong number = "+aCount);


	}
	
	public void prime(int[] arr,int p){
		boolean pr=false;
		int i;
		for(i=2;i<p/2;i++){
			if(p%i==0){
				pr=false;
				break;
			}
			else{
			pr=true;	
			}
			
		}
		if(pr==true){
			pCount++;
			}
		
	}
	
	public void evenOdd(int e){
		if(e%2==0){
			eCount++;
		}
		else{
			oCount++;
		}
	}
	
	public void armstrong(int a){
		int num=a;
		int length = String.valueOf(num).length();
		int sum=0;
		if(num==0 || num==1){
			aCount++;
		}
		else if(num>100){
			while(num>0){
				int r=num%10;
				sum=(int) (sum+Math.pow(r, length));
				num=num/10;
			}
			if(sum==a){
				aCount++;
			}	
		}
		
	}
}
