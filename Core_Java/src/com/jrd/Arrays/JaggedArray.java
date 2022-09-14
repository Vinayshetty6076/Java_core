package com.jrd.Arrays;

public class JaggedArray {

	public static void main(String[] args) 
	{
		int[][] marks = new int[3][];
		marks[0] = new int[3];
		marks[1] = new int[5];
		marks[2] = new int[4];
		int row = 0;
		int col = 0;
		while(row<marks.length)
		{
		while(col<marks[row].length)
		{
			marks[row][col] = 1;
			col++;
			
		}
		row++;
	}
	}

}
