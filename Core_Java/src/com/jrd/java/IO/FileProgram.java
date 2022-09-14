package com.jrd.java.IO;

import java.io.File;
import java.io.IOException;

public class FileProgram {

	public static void main(String[] args) throws IOException 
	{
		//creating folder
		File file = new File("link");// single \ is used for escape sequence so we want to mention \\
		boolean exist = file.exists();
		if(!exist)
		{
			file.mkdir();
		}
		else {
			System.out.println("Folder already available");
		}
		
		//creating sub folder
		File subfile = new File("link\\sub\\innersub");// single \ is used for escape sequence so we want to mention \\
		boolean subexist = subfile.exists();
		if(!subexist)
		{
			subfile.mkdirs();
			System.out.println("Folder created Successfully.");
		}
		else {
			System.out.println("Folders already available");
		}
		
		//File creating inside the folder
		File cfile = new File("\\demo.txt");
		boolean cexist = cfile.exists();
		if(!cexist)
		{
			cfile.createNewFile();
			System.out.println("Sub folder created Successfully.");
		}
		else {
			System.out.println("File already available");
		}
		
		//Deleting file
		File dfile = new File("\\demo.txt");
		boolean dexist = dfile.exists();
		if(dexist)
		{
			dfile.delete();
			System.out.println("File deleted Successfully.");
		}
		else {
			System.out.println("File doesn't exist.");
		}
		
		//Renaming a file
		File efile = new File("\\demo.txt");
		boolean eexist = efile.exists();
		if(!eexist)
		{
			efile.createNewFile();
			System.out.println("Sub folder created Successfully.");
		}
		else {
			System.out.println("File already available");
		}
		File rfile = new File("\\Updated.txt");
		boolean rexist = rfile.exists();
		if(!rexist)
		{
			efile.renameTo(rfile);
			System.out.println("File renamed Successfully.");
		}
		else {
			System.out.println("File already available");
		}
		
		//Printing file name
		System.out.println(rfile.getName());
		
		//checking restriction of file
		System.out.println(rfile.canExecute());
		System.out.println(rfile.canRead());
		System.out.println(rfile.canWrite());
		
		//Listing all files and folder in a directory
		File lfile = new File("C:\\Users\\vinay\\Desktop");
		String[] list = lfile.list();
		for(String s:list)
			System.out.println(s);
		
		//Listing all files and folder individually in a directory
		File[] listfile = lfile.listFiles();
		for(File l : listfile)
			if(l.isFile())//file only
			System.out.println(l);
		System.out.println("");
		for(File l : listfile)
			
		if(l.isDirectory())//folder only
			System.out.println(l);
		
		//fetching file extension 
		for(File l : listfile)
		{
			if(l.isFile())
			{
				String fileName = l.getName();
				int lastDot = fileName.lastIndexOf(".");
				String extension = fileName.substring(lastDot+1);
//				System.out.println(extension); print all extension
				if(extension.equals("txt"))
				{
					System.out.println(fileName);//print only txt file if we give delete it will delete all txt files in this di
				}
			}
		}
	}

}
