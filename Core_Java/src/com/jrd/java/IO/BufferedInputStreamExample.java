package com.jrd.java.IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamExample {

	public static void main(String[] args) 
	{
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\JRDUser992\\Desktop\\Demo.txt");
			BufferedInputStream bin = new BufferedInputStream(fin);
			int i = 0;
			while((i=bin.read())!=-1)
			{
				System.out.print((char)i);
			}
			bin.close();
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
