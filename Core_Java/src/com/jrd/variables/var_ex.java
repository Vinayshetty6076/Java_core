package com.jrd.variables;

public class var_ex {
     //class variables 
	
final static int a=1024;
int b;

void fun1()
{
	//static int x; we can't declare static variables in no-static method
	final int c;
	c=10;
	System.out.println("class variable" +a+ "" +b);
	System.out.println("loacal variable " +c);
	//a=7890; //
	b=56;
	System.out.println("class variable "+a+"+b");
}
	public static void main(String[] args) {
		var_ex obj=new var_ex();
		System.out.println(obj.b);
		System.out.println(var_ex.a); //we can access static variables using class_name

	}

}
