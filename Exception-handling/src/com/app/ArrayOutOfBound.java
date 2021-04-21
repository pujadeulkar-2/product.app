package com.app;

public class ArrayOutOfBound {

	public static void main(String[] args) {
		System.out.println("statement executed");
		
		try {
			String s = args[1]; //throws arrayIndexOutOfBound Exception
		} catch (Exception e) {
			
		} 

	}

}
