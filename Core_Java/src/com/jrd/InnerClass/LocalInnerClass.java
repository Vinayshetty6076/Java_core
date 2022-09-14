package com.jrd.InnerClass;

public class LocalInnerClass 
{
	static 
	{
		class Local{
			void staticblock() {
				System.out.println("Static block inner class");
			}
		}
		Local l = new Local();
		l.staticblock();
	}
	void method()
	{
		class MethodClass
		{
			void methodBlock()
			{
				System.out.println("Local inner class inside the method");
			}
		}
		MethodClass m = new MethodClass();
		m.methodBlock();
	}
	LocalInnerClass()
	{
		class ConstructorClass
		{
			void constructorBlock()
			{
				System.out.println("Local inner class inside the Constructor");
			}
		}
		ConstructorClass c = new ConstructorClass();
		c.constructorBlock();
	}
	public static void main(String[] args) 
	{
		LocalInnerClass l = new LocalInnerClass();
		l.method();
	}

}