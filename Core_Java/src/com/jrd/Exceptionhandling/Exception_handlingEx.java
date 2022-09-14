package com.jrd.Exceptionhandling;

public class Exception_handlingEx {

	public static void main(String[] args) {
		int[] arr=new int[4];
		try {
			
		
			arr[6]=34;
		System.out.println("in try block");
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			
			ae.getMessage();
			
		}
		finally
		{
			System.out.println("finally block");
		}
		 

	}

}