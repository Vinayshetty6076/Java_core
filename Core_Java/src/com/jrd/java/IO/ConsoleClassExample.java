package com.jrd.java.IO;

import java.io.Console;

public class ConsoleClassExample {

	public static void main(String[] args)
	{
		try {
		Console c=System.console();     
		String name=c.readLine("Enter your name: ");  
		char[] ch=c.readPassword("Enter password: ");    
		String pass=String.valueOf(ch);//converting char array into string    
		System.out.println("Username is : "+name+"\nPassword is: "+pass);  
		}catch (Exception e) 
		{
			System.err.println("Error occured.");
		}
	}

}
