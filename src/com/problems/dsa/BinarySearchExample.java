package com.problems.dsa;

import java.util.Scanner;

public class BinarySearchExample {

	public static void main(String[] args) {
	
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of an array:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter Elements in Ascending Order:");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter Number You want to Search:");
		int search = sc.nextInt();
		
		int first = 0;
		int last = n-1;
		int middle = (first + last)/2;
		
		
		while( first <= last )
	      {
	         if ( arr[middle] < search )
	           first = middle + 1;
	         else if ( arr[middle] == search )
	         {
	           System.out.println(search + " found at location " + (middle + 1) + ".");
	           break;
	         }
	         else
	         {
	             last = middle - 1;
	         }
	         middle = (first + last)/2;
	      }
	      if ( first > last )
	          System.out.println(search + " is not found.\n");
	   }
	}


