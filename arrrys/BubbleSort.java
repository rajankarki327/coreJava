package arrrys;

public class BubbleSort {

	public static void main(String[] args) {
		int[] array={-4,8,2,-9,1};
		int[] array2={54,-3,9,56,98,38,45,23,21};
		System.out.println("array before sorting");
		for(int i=0;i<array.length;i++){
			System.out.print("\t"+array[i]);
		}
		System.out.println();
		BubbleSort obj=new BubbleSort();
		obj.sorting(array);
	}
	public void sorting(int[] a){
		
		int temp=0;
		int array[]=a;
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=1;j<array.length;j++){
				if(array[j]<array[j-1]){
					temp=array[j];
					array[j]=array[j-1];
					array[j-1]=temp;
				}
			}
		}
		
		
		System.out.println("after bubble sort");
		for(int i=0;i<array.length;i++){
			System.out.print("\t"+array[i]);
		}
	}
}
