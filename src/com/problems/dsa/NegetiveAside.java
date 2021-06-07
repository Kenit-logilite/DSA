package com.problems.dsa;

import java.util.Scanner;

public class NegetiveAside {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of an Array:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int j=-1;
		int pivot = 0;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]<pivot)
			{
				j++;
				arr[j]=arr[j]+arr[i];
				arr[i]=arr[j]-arr[i];
				arr[j]=arr[j]-arr[i];
			}
			
			
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	
		
		
		
	}

}
