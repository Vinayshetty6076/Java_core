package com.jrd.java.IO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExample {

	public static void main(String[] args) 
	{
		try {
			RandomAccessFile ra = new RandomAccessFile("Desktop\\vinay\\Updated.txt", "rw");
			
			ra.writeUTF("This is random access file.");
			
			ra.seek(5);
			
			System.out.println(ra.read());
			
			byte[] b = {1,2,3};
			System.out.println(ra.read(b));
			
			ra.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
