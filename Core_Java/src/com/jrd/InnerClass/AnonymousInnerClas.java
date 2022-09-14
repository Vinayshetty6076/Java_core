package com.jrd.InnerClass;

public class AnonymousInnerClas {

	public static void main(String[] args) {
		Anonymous An = new Anonymous()
				{
					public void demo()
					{
						System.out.println("Anonymous inner class");
					}
				};
				An.demo();

	}

}
abstract class Anonymous
{
	abstract void demo();
}