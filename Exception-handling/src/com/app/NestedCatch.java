package com.app;

public class NestedCatch {
	
	public static void main(String[] args) {
		
		String s = "abcs";
		int i = 0 , a= 0;
		
			try {
		
				a=i = Integer.parseInt(s)+Integer.parseInt(args[5]);//NumberFormatException
		 
			}catch(NumberFormatException e) {
			
			}catch(ArrayIndexOutOfBoundsException e) {
				
			}
		
		
		System.out.println("welcome to pune");	
	}

}