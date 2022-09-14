package com.jrd.Ops;

class Class {

	int id;
	String name;

	public static void main(String args[]) {

		Class s1 = new Class();

		System.out.println(s1.id);// accessing member through reference variable
		System.out.println(s1.name);
	}
}

//Creating class.  
class Student{  //class example
int id;  
String name;  
}  
//Creating another class TestStudent1 which contains the main method  
class TestStudent1{  
public static void main(String args[]){  
Student s1=new Student();  
System.out.println(s1.id);  
System.out.println(s1.name);  
}  
}  