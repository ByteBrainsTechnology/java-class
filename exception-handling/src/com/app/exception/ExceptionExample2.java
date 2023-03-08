package com.app.exception;

public class ExceptionExample2 {

	public static void main(String[] args) {

		System.out.println("First Line code executed");

		try 
		{
			int i = 10 / 0;
		} 
		
		catch (ArithmeticException e) 
		{
			System.out.println("Exception Handled....");
		}
		
		
		System.out.println("Next line of code is executed or not");
	}
}
