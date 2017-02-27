package arrrys;

public class CopyArray {
public static void main(String[] args) {
	int[] a1={2,3,4,5,6};
	int length=a1.length;
	int[] a2=new int[length];
	for(int i=0;i<a1.length;i++){
		a2[i]=a1[i];
	}
	
	for(int i=0;i<a2.length;i++){
		System.out.print(a2[i]);
	}
	
}
}
