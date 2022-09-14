package com.jrd.java8features;

import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) 
	{
		String[] str = new String[10];
		
		Optional<String> op = Optional.ofNullable(str[5]);
		
		if(op.isPresent())
		{
			String s = str[5].toLowerCase();
			System.out.println(s);
		}
		else
		{
			System.out.println("String value is empty");
		}
	}

}
