package com.jrd.java8features;

import java.util.Arrays;

public class ParallelSort {

	public static void main(String[] args) 
	{
		int[] arr = {8,6,2,7,5,4,3,9,1};
		
		//Arrays.parallelSort(arr);
		
		Arrays.parallelSort(arr,1,6);
		
		for(int i : arr)
		{
			System.out.println(i);
		}
	}

}
