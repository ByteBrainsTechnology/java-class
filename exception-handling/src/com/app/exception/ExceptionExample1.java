package com.app.exception;

public class ExceptionExample1 {
	public static void main(String[] args) {
		
		System.out.println("Hi ByteBrains....");
		try {
			Integer i = new Integer("abc");
		} catch (NumberFormatException e) {
			System.out.println("Exception Handled...");
		} finally {
			System.out.println("Finally block always Executed.....");
		}
		
		System.out.println("Welcome to ByteBrains...");
	}
}
