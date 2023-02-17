package com.neotech.review01;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
		// Ask the user to enter 2 numbers
		// Ask the user for the operator (+,-,*,/)
		// Solve it using if-else AND using switch
		
		//Mac -> command + shift + o ---> Will import the Scanner class
		//Windows -> ctrl + shift + o --> Will import the Scanner class
		
		Scanner kenan = new Scanner(System.in);
		
		System.out.println("Please enter the first number:");
		double d1 = kenan.nextDouble();
	
		
		System.out.println("Please enter the second number:");
		double d2 = kenan.nextDouble();
		
		System.out.println("Please enter the operator (+,-,*,/)");
		String operator = kenan.next();
		
		double result = 0;
		
		if(operator.equals("+")) {
			result = d1 + d2;
		}
		else if(operator.equals("-")) {
			result = d1 - d2;
		}
		else if(operator.equals("*")) {
			result = d1 * d2;	
		}
		else if(operator.equals("/")){
		    result = d1 / d2;
		}
		else{
			System.out.println("Invalid operator");
		}
		
		if(operator.equals("+") || operator.equals("-") 
				|| operator.equals("*") || operator.equals("/"))
		System.out.println("The result is -> " + result);
		
		
		}
		   
	}


