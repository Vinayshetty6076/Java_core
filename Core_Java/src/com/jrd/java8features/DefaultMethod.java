package com.jrd.java8features;

interface demo
{
	default void say()
	{
		System.out.println("This is default method.");
	}
	void sayable();
}
public class DefaultMethod implements demo{

	public void sayable()
	{
		System.out.println("This is implemented method.");
	}
	public static void main(String[] args) 
	{
		DefaultMethod dm = new DefaultMethod();
		dm.say();
		dm.sayable();
	}

}