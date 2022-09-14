package com.jrd.Exceptionhandling;

public class Exception_handlingDemo {

	public static void main(String[] args) {
		int[] arr=new int[4];
		try {
			
		
			arr[6]=34;
		System.out.println("in try block");
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			
			System.out.println("Exception is try block");
			
		}
		finally
		{
			System.out.println("finally block");
		}
		 System.out.println("in the class");

	}

}