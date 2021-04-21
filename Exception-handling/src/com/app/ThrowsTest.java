package com.app;

public class ThrowsTest {
	
	public void m1()throws NullPointerException {
		
		int i = Integer.parseInt("abc");
		String s = null;
		
		 System.out.println(s.length());
	}
	
	
	public static void main(String[] args) {
		ThrowsTest t = new ThrowsTest();
		try {
		t.m1();
		}catch(Exception e) {
			
		}
	}

}
