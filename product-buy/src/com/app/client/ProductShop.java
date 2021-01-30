package com.app.client;

import java.util.Scanner;

import com.app.Pservice.ProductServices;
import com.app.service.impl.ProductServicesImpl;

public class ProductShop {

	public static void main(String[] args) {
		
		String s = " ";
		ProductServices ps = new ProductServicesImpl();
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1}AddProduct");
			System.out.println("2}AddToCart");
			System.out.println("3}DisplayCart");
			
			System.out.println("select any one of them ");
			int option=sc.nextInt();
			
			
		switch (option) {
		case 1:
			ps.addProduct();
			
			break;
		case 2:
			ps.displayProduct();
			
			break;
		case 3:
			ps.addProduct();
			
			break;
		case 4:
			ps.createBill();
			
			break;
		case 5:
			System.exit(0);
			
			break;

		default:
			System.out.println("invalid option");
			break;
		}
		System.out.println("Do you want to continue? y/n");
		s=sc.next();
		}while(s.equals("y"));
	}
}
