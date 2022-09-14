 package com.jrd.java.IO;

 import java.io.CharArrayReader;
 import java.io.IOException;

 public class CharArrayReaderExample {

 	public static void main(String[] args) throws IOException 
 	{
 		char[] c = {'w','e','l','c','o','m','e'};
 		CharArrayReader carr = new CharArrayReader(c);
 		int i = carr.read();
 		while(i!=-1) {
 			System.out.print((char)i+" : ");
 			System.out.println(i);
 			i = carr.read();
 		}
 	}

 }
