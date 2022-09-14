package com.jrd.java.IO;

import java.io.IOException;
import java.io.StringReader;

public class StringReaderExample {

	public static void main(String[] args) throws IOException 
	{
		String s = "Welcome to java.";
		StringReader sr = new StringReader(s);
		int i;
		while((i=sr.read())!=-1)
		{
			System.out.print((char)i);
		}
	}

}
