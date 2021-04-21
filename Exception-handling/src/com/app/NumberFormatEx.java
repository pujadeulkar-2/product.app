package com.app;

public class NumberFormatEx {
	public static void main(String[] args) {
		try {
			Integer I = new Integer("abc");// this statement throws number format exception
		} catch (NumberFormatException e) {
		} finally {
			System.out.println("this statement will not executed");
		}
	}
}