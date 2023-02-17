package com.neotech.review08;

public class Phone {

	private String serialNumber;
	private String brand;
	private String password;
	
	public Phone(String serialNumber, String brand, String password) {
		this.serialNumber = serialNumber;
		this.brand = brand;
		this.password = password;
		
	}
	
	public void displayInfo() {
		System.out.println("This is a " + brand + " phone with serial number " +serialNumber);
	}

	
}
