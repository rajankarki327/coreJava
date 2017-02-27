package arrrys;

public class QuickSort {
	public static void main(String[] args) {
		int[] arr={4,3,5,6,3,6,2};
		int left=0;
		int right=arr.length-1;
		QuickSort obj = new QuickSort();
		System.out.println("before sorting");
	      for(int i=0;i<arr.length;i++){
	    	  System.out.print(arr[i]+"\t");
	      }
	      System.out.println();
		obj.quickSort(arr, left, right);
		 System.out.println("after sorting");
	      for(int i=0;i<arr.length;i++){
	    	  System.out.print(arr[i]+"\t");
	      }
	}
	
	public int partition(int arr[], int left, int right)
	{
		int i=left;
		int j=right;
		int[] array=arr;
		int temp;
		
		int pivot=array[(i+j)/2];
		while(i<=j){
		while(array[i]<pivot){
			i++;
		}
		while(array[j]>pivot){
			j--;
		}
		if(i<=j){
			temp=array[i];
			array[i]=array[j];
			array[j]=temp;
			i++;
			j--;
		}
		}
		
	    return i;  
	}
	 
	void quickSort(int arr[], int left, int right) {
	   int index=partition(arr, left, right);
	   if(left<index-1){
		  quickSort(arr, left, index-1); 
	   }
	   if(index<right){
		   quickSort(arr, index, right);
	   }
	     
	      
	}

}









