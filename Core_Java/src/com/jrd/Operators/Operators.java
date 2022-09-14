package com.jrd.Operators;

public class Operators {

	public static void main(String[] args) {
		int x = 10;
		int a = 20;
		int b = 10;
		System.out.println("Unary operator");
		System.out.println(x++);// 10 (11)
		System.out.println(++x);// 12
		System.out.println(x--);// 12 (11)
		System.out.println(--x);// 10
		System.out.println(a++ + ++a);// 20+22=42
		System.out.println(b++ + ++b);// 10+12=22
		int a1 = 20;
		int b1 = -10;
		boolean c = true;
		boolean d = false;

		System.out.println(~a1);// -21 (minus of total positive value which starts from 0)
		System.out.println(~b1);// 9 (positive of total minus, positive starts from 0)
		System.out.println(!c);// false (opposite of boolean value)
		System.out.println(!d);// true

		System.out.println("Arithmetic operator");
		System.out.println(a + b);// 22+12 = 34
		System.out.println(a - b);// 22-12 = 10
		System.out.println(a * b);// 22x12 = 264
		System.out.println(a / b);// 1
		System.out.println(a % b);// 10

		System.out.println(10 * 10 / 5 + 3 - 1 * 4 / 2);

		System.out.println("Java Left Shift Operator");
		System.out.println(10 << 2);// 10*2^2=10*4=40
		System.out.println(10 << 3);// 10*2^3=10*8=80
		System.out.println(20 << 2);// 20*2^2=20*4=80
		System.out.println(15 << 4);// 15*2^4=15*16=240

		System.out.println("Java Right Shift Operator");
		System.out.println(10 >> 2);// 10/2^2=10/4=2
		System.out.println(20 >> 2);// 20/2^2=20/4=5
		System.out.println(20 >> 3);// 20/2^3=20/8=2
		int c1 = 10;
		System.out.println("Java Left Shift Operator");
		System.out.println(a < b && a < c1);// false && true = false
		System.out.println(a < b & a < c1);// false & true = false

		System.out.println(a < b && a++ < c1);// false && true = false
		System.out.println(a);// 10 because second condition is not checked
		System.out.println(a < b & a++ < c1);// false && true = false
		System.out.println(a);// 11 because second condition is checked

		a += 3;// 10+3
		System.out.println(a);
		a -= 4;// 13-4
		System.out.println(a);
		a *= 2;// 9*2
		System.out.println(a);
		a /= 2;// 18/2
		System.out.println(a);
	}

}
