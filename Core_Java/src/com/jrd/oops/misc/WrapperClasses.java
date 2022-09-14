package com.jrd.oops.misc;

public class WrapperClasses {

	public static void main(String[] args) 
	{
		int i = 10;//primitive datatype
		
		Integer i1 = Integer.valueOf(i);//Wrapper class , Boxing
		int j = i1.intValue();//unboxing 
		Integer i2 = 30;//auto boxing
		int j1 =i2;//auto unboxing
		
		String s = "123";
		
		int a = Integer.parseInt(s);//parseInt is the static method inside the integer class
		System.out.println(a+"  "+j+"  "+j1);
	}

}