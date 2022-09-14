package com.jrd.java.IO;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputStreamExample {

	public static void main(String[] args) 
	{
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\JRDUser992\\Desktop\\Demo.txt");
			DataInputStream din = new DataInputStream(fin);
			System.out.println(din.readInt());
			din.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
