package com.jrd.oops.misc;

public class ObjectCloning {

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Department dept = new Department(1,"Physics");
		Student s1 = new Student(1,"Nithin",dept);
		Student s2 = (Student)s1.clone();
		
		dept.name = "Maths";
		s1.display();
		s2.display();
	}

}
class Department implements Cloneable
{
	int deptId;
	String name;
	public Department(int deptId, String name) 
	{
		this.deptId = deptId;
		this.name = name;
	}
	public void display() {
		System.out.println("Dept Id is : "+deptId);
		System.out.println("Department Name is : "+name);
		
	}
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
}
class Student implements Cloneable
{
	int id;
	String name;
	Department dept;
	public Student(int id, String name, Department dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	public void display() {
		System.out.println("Id is : "+id);
		System.out.println("Name is : "+name);
		dept.display();
		
	}
	protected Object clone() throws CloneNotSupportedException
	{
		Student s = (Student)super.clone();
		s.dept = (Department)s.dept.clone();
		return s;
	}
}