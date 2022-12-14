package com.jrd.Exceptionhandling;

public class Multiple_Try_Catch_ex {
	public static void main(String[] args) {
		try {
			int x = 10 / 10;
			try {
				int y = 10 / 0;
			} catch (Exception e) {
				System.out.println(e);
			}
		} finally {
			System.out.println("finally block");
			try {
				int y = 10 / 0;
			} catch (Exception e) {
				try {
					int z = 30 / 30;
				} finally {
					System.out.println("In finally under catch");
				}
				System.out.println(e);
			}
		}
	}
}