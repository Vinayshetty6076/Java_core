package com.jrd.oops.misc;

public class Recursion 
{
	static int fact(int n)
	{
		if(n==0)
			return 1;
		return n*fact(n-1);//n*(n-1)!
	}
	public static void main(String[] args) 
	{
		System.out.println("The value is : "+fact(5));
	}

}
