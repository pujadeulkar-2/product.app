package com.app;

public class ArithmaticEx {
	
	public static void main(String[] args) {
		
		System.out.println("this statement will executed ");
		
		try {
		
		int a = 100/0;   //this statement throws exception
		
		}catch(ArithmeticException e) {
			
		}
		
		System.out.println("a");
		
	}

}
