package com.problems.dsa;

public class HeapSort {

	public static void main(String[] args) {
		int[] arr = {10,54,78,12,65,74,52,65,55};
		
		HeapSort heap = new HeapSort();
		heap.sort(arr);
		heap.printArray(arr);
	}
	
	void sort(int[] arr)
	{
		int length = arr.length;
		
		// Length/2-1 because we want parent node of sub tree which will always we get by length/2-1	
		for(int i =length/2-1;i>=0;i--)
		{
			heapify(arr,length,i);		
		}
		//For Swap the elements and heapify again
		for(int i = length-1;i>=0;i--)
		{
			int temp = arr[0];
			arr[0]=arr[i];
			arr[i]= temp ;
			
			heapify(arr, i, 0); //indexx value always should be 0;
		}
	}
	
	void heapify(int[] arr,int n, int i)
	{
			int largest = i;
			int leftIndex = 2*i+1;  //This is for left child node index position
			int rightIndex = 2*i+2; // This is for right child node index position
			
			if(leftIndex<n && arr[leftIndex]>arr[largest])
			{
				largest =leftIndex;
			}
			if(rightIndex<n && arr[rightIndex]>arr[largest])
			{
				largest =rightIndex ;
			}
			if(largest != i)
			{
	//	value of right or left child node shouldn't be greater if it is it will swap		
				int temp =arr[i];
				arr[i] = arr[largest];
				arr[largest]=temp;
				
				heapify(arr,n,largest); 
			}
	}
	
	void printArray(int[] arr)
	{
		for (int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
