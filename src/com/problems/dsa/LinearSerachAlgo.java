package com.problems.dsa;

import java.util.*;
public class LinearSerachAlgo {
	
	public static void main(String[] args)
	{
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of an array:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter Number You want to Search:");
		int search = sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(search == arr[i])
			{
				System.out.println("Element is found at: "+i);
			}
		}
		
		if(i==n)
		{
			System.out.println("Element Not found in the list");
		}
				
	}

}
