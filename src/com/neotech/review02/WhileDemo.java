package com.neotech.review02;

public class WhileDemo {

	public static void main(String[] args) {
		
		String greeting = "AsSalamualkum";
		
		int count = 1;
		
		while (count <= 5) {
			 
			System.out.println(count + " - " + greeting);
			count++;
		}
	    System.out.println("===================");
	
	    int i = 0;
	    
	    while (true) {
	    	
	    	if(i ==3) {
	    		continue;
	    	}
	        System.out.println(greeting);
     	    
	        i++;
	    }
	    
	    
	    
	    
	}
}
