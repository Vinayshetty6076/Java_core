package com.jrd.Exceptionhandling;

public class Throw_ex {
	
	static void validate(int age)
	{
	if(age<18)
	throw new ArithmeticException("not valid");
	else
	System.out.println("welcome to vote");
	}
	
	public static void main(String args[])
	{
		try
		{
	validate(18);
		}
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();
		}
	System.out.println("rest of the code...");
	}
	}