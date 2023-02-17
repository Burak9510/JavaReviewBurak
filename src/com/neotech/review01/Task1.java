package com.neotech.review01;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		// If you are a male
		// If you are tired -- take a rest
		// otherwise -- go to party
		
		// If you are female
		// If you are tired -- go to sleep
		// otherwise -- make a cake
		
		// If you are none
		// Invalid gender
		
		Scanner burak = new Scanner(System.in);
		
		System.out.println("Please enter your gender:");
		char gender = burak.next().charAt(0);
		
		System.out.println("Are you tired? (true/false)");
		boolean tired = burak.nextBoolean();
		
		if(gender == 'M' || gender == 'm' ) {
			System.out.println("You are strong enough!");
			
		if(tired) {
			System.out.println("Take a rest!");
		}else 
			System.out.println("Go to party!");
		}
		else if (gender == 'F' || gender == 'f') {
			System.out.println("Sorry!You are not a strong!");
		if(tired) {
			System.out.println("Go to sleep!");
		}else {
			System.out.println("Make a cake!");
		}
		}else 
			System.out.println("Invalid gender");
			
		
	}
}
