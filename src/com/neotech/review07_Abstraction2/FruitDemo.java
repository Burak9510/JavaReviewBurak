package com.neotech.review07_Abstraction2;

public class FruitDemo {
	public static void main(String[] args) {
		Apple a = new Apple("Yellow");
	    a.peel();
	    a.wash();
	
	    Coconut c =  new Coconut("Green");
	    c.crack();
	
	    Fruit f = new Apple("Red"); // up-casting
	    //f.peel();
	    //f.wash();
	
	    Apple a2 = (Apple) f; // down-casting
	   a2.peel();
	   a2.wash();
	
	   // we can't create an object
	   //Peelable p = new Peelable();
	   Peelable p2 = new Apple("Green");
	   p2.peel();
	   //p2.wash();
	
	
	
	}

}
