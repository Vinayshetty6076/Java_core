package com.jrd.java.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectstreamClassExample {

	public static void main(String[] args) 
	{
		
		try {
			Student s = new Student("vinay","101010");
			File file = new File("Desktop\\vinay\\Updated.txt");
			ObjectOutputStream objout = new ObjectOutputStream(new FileOutputStream(file));
			objout.writeObject(s);
			objout.close();
			
			ObjectInputStream objin = new ObjectInputStream(new FileInputStream(file));
			Student in = null;
			in = (Student)objin.readObject();
			System.out.println(in.name+" "+in.regno);
			objin.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
class Student implements Serializable
{
	private static final long serialVersionUID = 1L;
	String name;
	String regno;
	
	public Student(String name, String regno) 
	{
		super();
		this.name = name;
		this.regno = regno;
	}
	
}