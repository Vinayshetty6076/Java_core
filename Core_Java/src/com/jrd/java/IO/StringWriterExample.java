package com.jrd.java.IO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;

public class StringWriterExample {

	public static void main(String[] args) throws IOException 
	{
		char[] ch = new char[10];
		StringWriter sw = new StringWriter();
		InputStream file = new FileInputStream("a.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(file));
		
		int x ;
		while((x = br.read(ch))!=-1)
		{
			sw.write(ch, 0, x);
		}
		System.out.println(sw.toString());
		br.close();
	}

}
