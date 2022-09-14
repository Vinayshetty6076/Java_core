package com.jrd.java.IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterAndReader {

	public static void main(String[] args) 
	{
		File file = new File("link\\abc.txt");
		
		//FileWriter
		try {
			file.createNewFile();
			FileWriter write = new FileWriter(file);
			write.write(65);
			write.write(" How are you");
			write.flush();
			write.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//FileReader
		try {
			FileReader read = new FileReader(file);
			int output = read.read();
			while(output!=-1)
			{
				System.out.print((char)output);
				output = read.read();
			}
			read.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}