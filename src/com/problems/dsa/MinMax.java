package com.problems.dsa;

import java.util.Scanner;

public class MinMax {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter Number:");
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = arr[0];
		int min = arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]>max)
			{
				max = arr[i];
			}
			else if(arr[i]<min)
			{
				min = arr[i];
			}
		}
		
	    System.out.println("Max:"+max+"Min"+min);          
	}
}
