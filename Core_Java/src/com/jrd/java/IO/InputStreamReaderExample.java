package com.jrd.java.IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderExample {

	public static void main(String[] args) throws IOException 
	{
		InputStream is = new FileInputStream("Desktop\\vinay\\a.txt");
		InputStreamReader isr = new InputStreamReader(is);
		
		int i = isr.read();
		while(i!=-1)
		{
			System.out.print((char)i);
			i = isr.read();
		}
		isr.close();
	}

}
