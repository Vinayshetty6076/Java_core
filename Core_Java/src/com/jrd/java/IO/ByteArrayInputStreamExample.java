package com.jrd.java.IO;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamExample {

	public static void main(String[] args) 
	{
		byte[] byt = {55,56,37,38};
		ByteArrayInputStream bin = new ByteArrayInputStream(byt);
		
		int i = 0;
		while((i=bin.read())!=-1)
		{
			char c = (char)i;
			System.out.println("Ascii value is "+i+" special character of ascii value is "+c);
		}
	}

}
