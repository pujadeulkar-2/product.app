package com.app;

public class NullPointerEx {

	public static void main(String[] args) {

		System.out.println("this statement wil executed");

		String s = null;
		try {
			System.out.println(s.length()); // throws nullPinterException
		} catch (NullPointerException e) {

		} finally {
			System.out.println("this finally block statement will always executed");
		}

	}

}
