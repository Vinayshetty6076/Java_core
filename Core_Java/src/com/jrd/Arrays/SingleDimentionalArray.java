package com.jrd.Arrays;

public class SingleDimentionalArray {

	public static void main(String[] args) 
	{
		int array[] = new int[5];//array creation
		int i = 0;
		while(i<5) {
			array[i] = i+2;
			System.out.println(array[i]);
			i++;
		}
		
		//int array[] = new int[-12] not support only support int values in length not long, float,double
		int[] sslc = {77,77,92,100,90};
		for(i=0 ; i<sslc.length;i++)
		{
			System.out.println("The values are "+sslc[i]);
		}
		
		//finding repeated values
		for(i=0;i<sslc.length;i++)
		{
			int count = 0;
			for(int j=0;j<sslc.length;j++) {
				
				if(sslc[i]==sslc[j])
				{
					count++;
				}
				
			}
			if(count>1)
				System.out.println("The value "+sslc[i]+" repeating "+count+" times.");
		}
		
		//finding position
		for(i=0 ; i<sslc.length;i++)
		{
			if(sslc[i]==100)
			{
			System.out.println("The position is "+ (i+1));
			}
		}
		
		//max value
		int max = 0;
//		for(i=0 ; i<sslc.length;i++)
//		{
//			if(max<sslc[i])
//			{
//				max = sslc[i];
//			}
//		}
//		System.out.println("The max value "+max);
		
		//second max int[] sslc = {77,77,92,100,90};
		int second = 0;
		for(i=0;i<sslc.length;i++)
		{
			if(max<sslc[i])
			{
				second = max;
				max = sslc[i];
			}
			else if(second<sslc[i])
			{
				second = sslc[i];
			}
		}
		System.out.println("The second max value "+second);
	}

}