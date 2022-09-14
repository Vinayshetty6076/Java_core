package com.jrd.java.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {

	public static void main(String[] args) 
	{
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\nithin.saji\\Desktop\\Demo.txt");
			
			//Print single char
//			int i = fin.read();
//			System.out.println((char)i);
			
			//print full char
			int j = 0;
			while((j=fin.read())!=-1)
			{
				System.out.print((char)j);
			}
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
