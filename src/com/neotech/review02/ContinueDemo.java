package com.neotech.review02;

public class ContinueDemo {

	public static void main(String[] args) {
		
	//I want to celebrate my son's birthdays from 11 to 20 (Use for loop)
	//but not 13th birthday, because we are scared
	//Lets use for loop
		
	for(int age = 11; age <=20; age++) {
		
		if(age == 13) {
	    System.out.println("No celebration.We are scared!");
			continue;
		}
		
		System.out.println("Happy birtday! You are " + age + " years old!");
    		
    }
	  System.out.println("========================================");
	 
	    int age2 = 10;
	
	    while(age2 < 20) {
	
		age2++;
		
		if(age2 == 13) {
		    System.out.println("No celebration.We are scared!");
	    continue;
		}
	   
		System.out.println("Happy birtday! You are " + age2 + " years old!");
	    }
		
		
	 }
	
	
	
	}

