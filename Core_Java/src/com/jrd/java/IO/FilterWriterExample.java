package com.jrd.java.IO;

import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;

public class FilterWriterExample {

	public static void main(String[] args) throws IOException 
	{
		FileWriter fw = new FileWriter("Desktop\\vinay\\Updated.txt");
		CustomFilter cf = new CustomFilter(fw);
		cf.write("Welcome to java");
		cf.flush();
		cf.close();
	}

}
class CustomFilter extends FilterWriter
{
	public void write(String str) throws IOException
	{
		super.write(str.toLowerCase());  
	}

	public CustomFilter(FileWriter fw) {
		super(fw);
	}
	
}