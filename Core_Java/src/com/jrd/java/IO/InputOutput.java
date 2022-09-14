package com.jrd.java.IO;

import java.io.IOException;

public class InputOutput {

	public static void main(String[] args) 
	{
		try {
			int i = System.in.read();//input stream 
			System.out.println((char)i);//output stream
		} 
		catch (IOException e) 
		{
			System.err.println("Error occured");//error stream
		}
	}

}
