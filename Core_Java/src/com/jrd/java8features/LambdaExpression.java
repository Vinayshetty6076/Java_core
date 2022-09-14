package com.jrd.java8features;

interface Ridable //single Abstract method interface - SAM interface - Functional interface
{
	int MAX_SPEED = 90;//Final, static
	void ride();//abstract method
	default void display()
	{
		System.out.println("Hello message from ridable interface.");
	}
}
public class LambdaExpression{

	public static void main(String[] args) 
	{
		//Normal Anonymous method
		Ridable r1 = new Ridable() {
			
			@Override
			public void ride() {
				// TODO Auto-generated method stub
				
			}
		};
		r1.display();
		//Lambda expression
		Ridable r2 = /*new Ridable*/() -> //{ 
			//public void ride() {
				System.out.println("Hi from Lambda expression.");
			//}
		//};
		//replace :-    Ridable r2 = () -> System.out.println("Hi");
				r2.ride();
				r2.display();
	}


}
