package com.jrd.java.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInputStreamExample {

	public static void main(String[] args) 
	{
		try {
			FileInputStream fin = new FileInputStream("Desktop\\Demo.txt");
			FileInputStream fin1 = new FileInputStream("Desktop\\Demo1.txt");
			FileOutputStream fout=new FileOutputStream("Desktop\\Demo2.txt");//if the file is not available it will automatically create new file.
			SequenceInputStream sin = new SequenceInputStream(fin,fin1);
			int i = 0;
			while((i=sin.read())!=-1)
			{
				fout.write(i);//writing two file data into another file
				System.out.print((char)i);//display output of two file
			}
			fin.close();
			fin1.close();
			fout.close();
			sin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
