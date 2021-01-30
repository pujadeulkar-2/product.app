package com.app.service.impl;

import java.util.Scanner;

import com.app.Pservice.ProductServices;
import com.app.model.Product;

import lombok.Synchronized;

public class ProductServicesImpl implements ProductServices {

	private Product[] products = null;
	private Product[] cart = null;

	Scanner sc = new Scanner(System.in);

	@Override
	public void addProduct() {
		System.out.println("How many product you want to add:");
		int i = sc.nextInt();

		products = new Product[i];
		for (int j = 0; j < i; j++) {

			Product p = new Product();
			System.out.println("Enter product id:");
			p.setId(sc.nextInt());
			System.out.println("Entet product name");
			p.setPname(sc.next());
			System.out.println("Enter price of product");
			p.setPrice(sc.nextInt());

			products[j] = p;

		}
	}

	@Override
	public void addToCart() {
		if (products != null) {
			displayProduct();
			System.out.println("How many products you want to bye ?");
			int num = sc.nextInt();
			cart = new Product[num];

			for (int i = 0; i < num; i++) {
				System.out.println("Enter product id for buy");
				Product p = new Product();
				p.setId(sc.nextInt());

				for (int j = 0; j < products.length; j++) {
					if (p.getId() == products[j].getId()) {
						cart[i] = products[j];
					}
				}

			}
		} else {
			System.out.println("cart is empty");
		}

	}

	@Override
	public void createBill() {
		int Total = 0;

		for (int i = 0; i < cart.length; i++) {
			System.out.println(cart[i].getId() + " " + cart[i].getPname() + " " + cart[i].getPrice());
			Total += cart[i].getPrice();
		}
		System.out.println("Your  Total Price is : " + Total);
	}
		

	@Override
	public void displayProduct() {
		System.out.println("ID   PRODUCT    PRICE");
		for (int j = 0; j < products.length; j++) {
			Product p = products[j];
			System.out.println(p.getId() + " \t" + p.getPname() + " \t  " + p.getPrice());

		}
		System.out.println();

	}

}
