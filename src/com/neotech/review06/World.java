package com.neotech.review06;

public class World {

	public static void main(String[] args) {
	  Person p1 = new Person();
	  p1.displayInfo();

		p1.name = "Murad";
		p1.age = 25;
		p1.weight = 200;

		p1.displayInfo();

		System.out.println("----------------");

		// 2nd way, using the constructor with TWO parameters
		Person p2 = new Person("Volkan", 32);
		p2.displayInfo();
		
		p2.weight = 150;
		p2.displayInfo();

		// 3rd way, using the constructor with THREE parameters
        Person p3 = new Person("Alex", 250, 28);
        p3.displayInfo();
	}

}
