package com.jrd.Exceptionhandling;

public class StudentIdNotfoundException extends Exception {

	int sid;

	StudentIdNotfoundException()
	{		
	}

	public StudentIdNotfoundException(int sid) {
		this.sid = sid;
	}

	@Override
	public String toString() {
      return "Exception :: Student id not found!!";
	}

	@Override
	public String getMessage() {
		return "Student with id "+ sid + " Not found!!";
	}
	
	
}
