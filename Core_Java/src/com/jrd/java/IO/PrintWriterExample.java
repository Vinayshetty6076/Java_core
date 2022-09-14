package com.jrd.java.IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterExample {

	public static void main(String[] args) throws FileNotFoundException 
	{
		PrintWriter pw = new PrintWriter(System.out);//print content inside the console
		pw.write("Hello guy's...");
		pw.flush();
		pw.close();
		
		PrintWriter pf = new PrintWriter(new File("Desktop\\vinay\\a.txt"));//print content inside the console
		pf.write("Hello guy's...");
		pf.flush();
		pf.close();
	}

}
