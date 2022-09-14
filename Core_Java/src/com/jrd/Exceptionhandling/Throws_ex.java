package com.jrd.Exceptionhandling;

import java.io.IOException;

public class Throws_ex {
	void m()throws IOException
	{
	throw new IOException("device error");//checked exception
	}
	void n()throws IOException
	{
	m();
	}
	void p()
	{
	try
	{
	n();
	}
	catch(Exception e){System.out.println("exception handled");}
	}
	public static void main(String args[])
	{
		Throws_ex obj=new Throws_ex();
	obj.p();
	System.out.println("normal flow...");
	}

}