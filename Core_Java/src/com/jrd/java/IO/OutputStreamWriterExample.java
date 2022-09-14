package com.jrd.java.IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterExample {

	public static void main(String[] args) throws IOException 
	{
		FileOutputStream fout = new FileOutputStream("Desktop\\vinay\\a.txt");
		OutputStreamWriter ow = new OutputStreamWriter(fout);
		
		ow.write("This is Output Stream writer.");
		ow.flush();
		ow.close();
	}

}
