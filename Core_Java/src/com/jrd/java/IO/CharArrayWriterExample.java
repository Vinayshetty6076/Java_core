package com.jrd.java.IO;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharArrayWriterExample {

	public static void main(String[] args) throws IOException 
	{
		CharArrayWriter carr = new CharArrayWriter();
		carr.write("This is a sample program for character array writer");
		FileWriter f1 = new FileWriter("C:\\Users\\JRDUser992\\Desktop\\a.txt");
		FileWriter f2 = new FileWriter("C:\\Users\\JRDUser992\\Desktop\\b.txt");
		FileWriter f3 = new FileWriter("C:\\Users\\JRDUser992\\Desktop\\c.txt");
		FileWriter f4 = new FileWriter("C:\\Users\\JRDUser992\\Desktop\\d.txt");
		
		carr.writeTo(f1);
		carr.writeTo(f2);
		carr.writeTo(f3);
		carr.writeTo(f4);
		
		f1.close();
		f2.close();
		f3.close();
		f4.close();
	}

}
