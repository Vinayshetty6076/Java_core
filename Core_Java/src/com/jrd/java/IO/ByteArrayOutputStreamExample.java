package com.jrd.java.IO;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayOutputStreamExample {

	public static void main(String[] args) throws Exception 
	{
		FileOutputStream fout = new FileOutputStream("C:\\Users\\JRDUser992\\Desktop\\Demo1.txt");
		FileOutputStream fout1 = new FileOutputStream("C:\\Users\\JRDUser992\\Desktop\\Demo2.txt");
		FileOutputStream fout2 = new FileOutputStream("C:\\Users\\JRDUser992\\Desktop\\Demo3.txt");
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		
		String s ="ByteArrayOutputStream\n";
		bout.write(s.getBytes());
		bout.write(s.getBytes());
		bout.write(s.getBytes());
		bout.writeTo(fout);
		bout.writeTo(fout1);
		bout.writeTo(fout2);
		bout.flush();
		bout.close();
	}

}
