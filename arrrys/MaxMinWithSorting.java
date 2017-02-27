package arrrys;

public class MaxMinWithSorting {
	public static void main(String[] args) {
		int[] a={5,3,26,8,9,4};
		MaxMinWithSorting obj=new MaxMinWithSorting();
		obj.sorting(a);
		obj.largest(a);
	}
	
	//finding largest number
	public void largest(int[] a){
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++){
			if(max<a[i]){
				max=a[i];
			}
			if(min>a[i]){
				min=a[i];
			}
		}
		System.out.println();
		System.out.println("maximum value="+max);
		System.out.println("min value = "+min);
	}
	
	public void sorting(int[] a){
//		int a[]=b;
		int temp=0;
		System.out.println("before sorting");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"\t");
		}
		System.out.println();

		for(int i=0;i<a.length;i++){
			for(int j=1;j<a.length;j++){
				if(a[j]<a[j-1]){
					temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;	
				}
			}
		}
		System.out.println("after sorting");
		for (int i=0; i<a.length;i++){
			System.out.print(a[i]+"\t");
		}
	}

}
