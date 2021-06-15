package com.problems.dsa;

import java.util.Arrays;

public class CyclicRotate {

	public static void main(String[] args) {
		
		int[] arr = new int[]{1,2,3,4,5};
		int x = arr[arr.length-1];
		for(int i = arr.length-1;i>0;i--)
		{
			arr[i] =arr[i-1];
		}
		arr[0]=x;
		System.out.println(Arrays.toString(arr));
		
		
	}

}
//[1,2,3,4,5]

//x =arr[length-1]
//arr[4]= 5;
//arr[3]= 4
//arr[2]=3
//arr[1]=2
//arr[0]=5

//[5,1,2,3,4]