package Array;

import java.util.Scanner;

public class KthMinMax {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0 ; i<n ; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int i=0 ; i<n ; i++)
		{
			for(int j=i+1 ; j<n ;j++)
			{
				if(arr[i]>arr[j])   // just change here if you want Kth max element
				{
					arr[j]=arr[i]+arr[j];
					arr[i]=arr[j]-arr[i];
					arr[j]=arr[j]-arr[i];
				}
				
			}
		}
		
		System.out.println("Enter the Kth Element to find Min:");
		int k = sc.nextInt();
		
		System.out.println(arr[k-1]);
		

	}

}
