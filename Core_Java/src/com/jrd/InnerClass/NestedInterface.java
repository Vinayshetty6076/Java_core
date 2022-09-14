package com.jrd.InnerClass;

interface In
{
	interface NestedInterfaces
	{
		
		void hello();
	}
}
public class NestedInterface implements In.NestedInterfaces
{

	public static void main(String[] args) 
	{
		NestedInterface n = new NestedInterface();
		n.hello();
	}

	@Override
	public void hello() 
	{
		System.out.println("Hello nested interface");
		
	}

}
