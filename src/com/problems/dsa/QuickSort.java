package com.problems.dsa;

// QuickSort 

public class QuickSort {

	public static void main(String[] args) {
		
		
		int[] arr = {10,54,78,12,65,74,52,65,55};
		int length = arr.length;
		QuickSort quick = new QuickSort();
		quick.quickSortRecursion(arr, 0, length-1);
		quick.printArray(arr);
		
	}
	int partition(int[] arr,int low,int high)
	{
			int pivot = arr[(low+high)/2];
			
			while(low<=high)
			{
				while(arr[low]<pivot)
				{
					low++;
					
				}
				while(arr[high]>pivot)
				{
					high--;
				}
				if(low<=high)
				{
					int temp = arr[low];
					arr[low]=arr[high];
					arr[high]=temp;
					
					low++;
					high--;
				}
				
			}
			
			return low;
	}
	void quickSortRecursion(int[] arr,int low,int high)
	{
		int pi = partition(arr,low,high);
				if(low<pi-1)
				{
					quickSortRecursion(arr, low, pi-1);
				}
			if(pi<high)
			{
				quickSortRecursion(arr,pi,high);
			}
	}
	
	void printArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			 System.out.println(arr[i]);
		}
	}
}
