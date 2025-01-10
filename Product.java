package com.autoincrement1;

public class Product {
    private static int ProId;
	private String ProName;
	private double price;
	
	public Product(String Name,double Price)
	{
	
		this.ProId++;
		this.ProName=Name;
		this.price=Price;
	}
	public void printInfo()
	{
		System.out.println("Product Id="+ProId);
		System.out.println("Product Name="+ProName);
		System.out.println("Product price="+price);
	}
}
