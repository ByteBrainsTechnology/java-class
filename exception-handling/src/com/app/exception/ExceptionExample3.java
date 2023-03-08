package com.app.exception;

public class ExceptionExample3 {

	public static void main(String[] args) {

		String[] s = { "abc", "123", null, "xyz" }; // String array

		for (int i = 0; i < 8; i++) { // Iteration by using for loop

			try {
				int a = s[i].length() + Integer.parseInt(s[i]);
			} catch (NumberFormatException e) {
				System.out.println("NumberFormatExceptionHandled Handled..");
			} catch (NullPointerException e) {
				System.out.println("NullPointerExceptionHandled Handled..");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("ArrayIndexOutOfBoundsExceptionHandled Handled..");
			}
		}

		System.out.println("After for loop....");

	}

}
