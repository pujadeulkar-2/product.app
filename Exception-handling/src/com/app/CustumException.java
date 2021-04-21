package com.app;

import java.util.Scanner;

public class CustumException {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your age");
		
		int age=sc.nextInt();
		try {
			if (age < 0) {          // throws exception if age is negative
				throw new Exception("Age can not negative!!");
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}