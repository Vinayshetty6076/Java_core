package com.jrd.java8features;

@Deprecated // It is optional  //@functionalinterface
interface Drwable {
	public void draw();
}

public class LambdaExpressionExample2 {
	public static void main(String[] args) {
		int width = 10;

		// with lambda
		Drwable d2 = () -> {
			System.out.println("Drawing " + width);
		};
		d2.draw();
	}
}