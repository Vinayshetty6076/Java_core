package com.jrd.java.IO;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample {

	public static void main(String[] args) 
	{
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\JRDUser992\\Desktop\\Demo.txt");
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			String s = "Welcome to java. This file is updated...";
			byte[] b =s.getBytes();
			bout.write(b);
			bout.flush();
			bout.close();
			fout.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
