package com.neotech.review06;

//You can have multiple classes in one file
//Only one class can be public
//The public class name should be same as file name
public class Animal {
	String name;
	int legs;

	Animal() {
		
	}
	
	Animal(String name, int legs) {
		this.name = name;
		this.legs = legs;
	}

	public void sleep() {
		System.out.println("All animals sleep");
	}

	void displayInfo() {
		System.out.println(name + " has " + legs + " legs");
	}

}

class Snake extends Animal {
	
}


//Task until next Sunday :)
//Create 3 classes inheriting Animal class
//Wolf, Fox, Bear
//Wolf does not have any extra variables or methods
//Fox has a String furColor
//Bear has a roar() method
//Create a class Forest where you create 1 animal from each type (with all of their information)

