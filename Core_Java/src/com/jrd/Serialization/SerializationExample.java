package com.jrd.Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationExample {

	public static void main(String[] args) throws IOException 
	{
		//Serializing
		Student s = new Student(100, "vinay r",10);
		FileOutputStream os = new FileOutputStream("C:\\Users\\JRDUser992\\Desktop\\Student.txt");
		ObjectOutputStream oos = new ObjectOutputStream(os);
		oos.writeObject(s);
		oos.flush();
		oos.close();

	}

}
class Student implements Serializable
{
	
	private static final long serialVersionUID = -8490675736070934496L;
	int reg_no;
	String name;
	transient int d;//During the serialization, when we do not want an object to be serialized we can use a transient keyword.
	public Student(int reg_no, String name,int d) {
		super();
		this.reg_no = reg_no;
		this.name = name;
		this.d = d;
	}
	
}