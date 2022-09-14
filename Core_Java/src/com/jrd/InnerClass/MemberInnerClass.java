package com.jrd.InnerClass;

public class MemberInnerClass 
{
	
	private int num = 10;
	public static void main(String[] args) 
	{
		MemberInnerClass MIC = new MemberInnerClass();
		inner in = MIC.new inner();// creating object for inner class
		in.innerclassmethod();
	}
	class inner//inner class
	{
		void innerclassmethod()
		{
			System.out.println(num);//we can access private member also
			System.out.println("Inner class method");
		}
	}

}