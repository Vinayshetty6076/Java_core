package com.jrd.InnerClass;

public class StaticNestedClass 
{

	public static void main(String[] args) 
	{
		StaticNestedClass.StaticNested s = new StaticNestedClass.StaticNested();
		s.staticmethod();

	}
	static class StaticNested
	{
		static int data = 10;
		void staticmethod()
		{
			System.out.println("Static Nested Class "+data);
		}
	}

}
