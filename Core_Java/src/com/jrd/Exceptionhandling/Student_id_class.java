package com.jrd.Exceptionhandling;

import java.util.Scanner;

public class Student_id_class {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter student id: ");
		int id=sc.nextInt();
		
		if(id>100)
		{
			System.out.println("Student found");
		}
		else
		{
			try
			{
				throw new StudentIdNotfoundException(id);
			}
			catch(StudentIdNotfoundException se)
			{
				System.out.println(se);	
				System.out.println(se.getMessage());
			}
		}

	}

}