package com.problems.dsa;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		int i,temp,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of an array:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(i=1;i<n;i++)
		{
			temp = arr[i];
			j = i;
			while(j>0 && arr[j-1]>temp)
			{
				arr[j]=arr[j-1];
				j=j-1;
				
			}
			arr[j]=temp;
		}
		
		for(i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
