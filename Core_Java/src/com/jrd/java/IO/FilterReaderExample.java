package com.jrd.java.IO;

import java.io.FileReader;
import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;

public class FilterReaderExample {

	public static void main(String[] args) throws IOException 
	{
		FileReader fw = new FileReader("Desktop\\vinay\\Updated.txt");
		CustomFilterReader cf = new CustomFilterReader(fw);
		
		int i;
		while((i=cf.read())!=-1)
		{
			System.out.print((char)i);
		}
		cf.close();
		
	}

}
class CustomFilterReader extends FilterReader
{

	protected CustomFilterReader(Reader in) {
		super(in);
		// TODO Auto-generated constructor stub
	}
	
	public int read() throws IOException
	{
		int x = super.read();
		if((char)x == ' ')
		{
			return ((int)'?');
		}
		else
		{
			return x;
		}
		
	}
	
}