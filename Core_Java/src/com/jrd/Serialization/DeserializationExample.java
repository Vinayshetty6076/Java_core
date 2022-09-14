package com.jrd.Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationExample 
{
	public static void main(String[] args) throws ClassNotFoundException, IOException 
	{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\JRDUser992\\Desktop\\Student.txt"));
		
		Student s = (Student) ois.readObject();
		
		System.out.println(s.reg_no+" "+s.name);
		ois.close();
	}

}
