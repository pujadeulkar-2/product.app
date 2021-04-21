package com.app;

public class ExTest {

	public int m1() {
		try {
			return 10; // but in normally without exception return will 10
		} catch (ArithmeticException e) {
			return 20;
		} finally {
			return 30; // in exception always return statement will be executed from finally block
		}
	}

	public static void main(String[] args) {

		// new ExTest().m1(); we can call like this
		ExTest et = new ExTest();
		et.m1();

	}

}
