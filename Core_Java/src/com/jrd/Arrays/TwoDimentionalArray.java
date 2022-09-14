package com.jrd.Arrays;

import java.util.Scanner;

public class TwoDimentionalArray {

	public static void main(String[] args) 
	{
		int[][] TDA = {{1,2,3},{4,5,6},{7,8,9}};
		for(int i = 0;i<TDA.length;i++)
		{
			for(int j = 0;j<TDA.length;j++)
			{
				System.out.print(TDA[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		Scanner sc = new Scanner(System.in);
		int[][] val = new int[3][4];
		for(int i = 0;i<val.length;i++)
		{
			for(int j = 0;j<val[i].length;j++)
			{
				System.out.println("Enter the values :");
				val[i][j] = sc.nextInt();
			}
			System.out.println("New line");
		}
		
		
		//row total
				
				for(int i = 0;i<val.length;i++)
				{
					int total = 0;
					for(int j = 0;j<val[i].length;j++)
					{
						total = total+val[i][j];
						System.out.print(val[i][j]+" ");
					}
					System.out.println();
					System.out.println("Row Total : "+total);
		
		}
				//diagonal 
				int total = 0;
				for(int i = 0;i<val.length;i++)
				{
					total = total+val[i][i];
		}
				System.out.println("Row Total : "+total);
				sc.close();
	}

}