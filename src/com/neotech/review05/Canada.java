package com.neotech.review05;

public class Canada {

	public static void main(String[] args) {
		
		USA us = new USA();
		
		System.out.println("Accessing the variables from inside USA");
		System.out.println("public -> " + us.bestSchool);
	    System.out.println("default -> " + us.normalState);
	    System.out.println("protected -> " + us.mainState);
        // capitalCity is private
//	    System.out.println("private -> " + us.CapitalCity);
		
 System.out.println("Accessing the methods from inside Canada");
	    
        System.out.println();
        
        us.speakEnglish();
	    us.playNBA();
	    // selectPresident() is private
	    //us.selectPresident();
		
	}
}
