package com.problems.dsa;

/*
	max_so_far = 0
	max_ending_here=0
	[-2, -3, 4, -1, -2, 1, 5, -3]
	ending will be  0th index and will be added to max_ending_here+a[i]
	 if (max_so_far < max_ending_here)
	                max_so_far = max_ending_here;
	if(max_ending_here < 0)
	{
		max_ending_here =0; //will remain 0
	}
	
	return max;

 */


public class KadaneAlgo {

	public static void main(String[] args) {
		
		  int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
	        System.out.println("Maximum contiguous sum is " +
	                                       maxSubArraySum(a));

	}
	 static int maxSubArraySum(int a[])
	    {
	        int size = a.length;
	        int max_so_far = 0, max_ending_here = 0;
	 
	        for (int i = 0; i < size; i++)
	        {
	            max_ending_here = max_ending_here + a[i];
	            if (max_so_far < max_ending_here)
	            {
	            	max_so_far = max_ending_here;
	            }
	                
	            else if (max_ending_here < 0)
	            {
	            	 max_ending_here = 0;
	            }
	               
	        }
	        return max_so_far;
	    }

}


