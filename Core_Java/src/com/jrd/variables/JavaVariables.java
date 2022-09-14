package com.jrd.variables;

//Java Variables
public class JavaVariables {
	int a = 10;// Instance variable
	static int b = 20;// Static variable

	void m1() {
		int c = a + b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		float f = 10.5f;// Local Variable
		System.out.println(f);
		JavaVariables jv = new JavaVariables();
		jv.m1();
	}

}
