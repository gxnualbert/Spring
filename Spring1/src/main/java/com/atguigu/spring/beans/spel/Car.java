package com.atguigu.spring.beans.spel;

public class Car {
	
	private String brand;
	private double price;
	
//	輪胎的周長
	private double tyreprimeter;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public double getTyreprimeter() {
		return tyreprimeter;
	}
	public void setTyreprimeter(double tyreprimeter) {
		this.tyreprimeter = tyreprimeter;
	}
	
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + ", tyreprimeter=" + tyreprimeter + "]";
	}
	public Car() {
		System.out.println("car's construtor....");
	}
	
	
	
	
	
	
}
