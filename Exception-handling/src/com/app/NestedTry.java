package com.app;

public class NestedTry {

	public static void main(String[] args) {
		try {

			try {
				int b = 10 / 0;

				System.out.println(b);
			} catch (ArithmeticException e1) {

			}

			try {
				int a[] = new int[5];
				a[10] = 4;
			} catch (ArrayIndexOutOfBoundsException e) {

			}
		} catch (Exception e) {

		}
		System.out.println("Nested try block");

	}

}
