package com.jrd.java.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderAndWriter {

	public static void main(String[] args) 
	{
		File file = new File("C:\\Users\\JRDUser992\\Desktop\\BuffR&w.txt");
		
		//BufferedWriter
		FileWriter fWriter;//child class of writer class
		try {
			fWriter = new FileWriter(file);//FileWriter(file,true); it will add values every time existing value can't be modify
			BufferedWriter bWriter = new BufferedWriter(fWriter);
			bWriter.write("Malayalam. It is my mother tongue.");
			bWriter.newLine();
			bWriter.write("English. It is my second language.");
			bWriter.newLine();
			bWriter.write("Mathematics");
			bWriter.flush();
			bWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//BufferReader
		try {
			FileReader fReader = new FileReader(file);
			BufferedReader bReader = new BufferedReader(fReader);
			String s = bReader.readLine();
			int LineCount = 0;
			int sentenceCount = 0;
			int wordCount = 0;
			int charCount = 0;
			while(s!=null)
			{
				//finding characters 
				charCount = charCount + s.length();
				//finding sentence
				String[] sentence = s.split("[.]");
				sentenceCount = sentenceCount + sentence.length;
				
				//finding word
				String[] word = s.split(" ");
				wordCount = wordCount + word.length;
				
				//display value line by line
				System.out.println(s);
				
				//finding line count
				LineCount++;
				
				s = bReader.readLine();
			}
			System.out.println("Number of characters  : "+charCount);
			System.out.println("Number of words  : "+wordCount);
			System.out.println("Number of sentence  : "+sentenceCount);
			System.out.println("Number of lines  : "+LineCount);
			bReader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
