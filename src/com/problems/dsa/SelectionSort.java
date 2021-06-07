package com.problems.dsa;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		int i,temp=0,min,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of an array:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(i=0;i<n;i++)
		{
			min=i;
			for(j=i+1;j<n;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
				
			}
			temp = arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		for(i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
