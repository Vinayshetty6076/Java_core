package com.jrd.java.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {

	public static void main(String[] args) throws FileNotFoundException 
	{
		FileOutputStream fout = new FileOutputStream("Desktop\\vinay\\Updated.txt");
		PrintStream ps = new PrintStream(fout);
		ps.println(2021);
		ps.println("Hello world.");
		ps.println("This is printStream");
		ps.close();
	}

}
