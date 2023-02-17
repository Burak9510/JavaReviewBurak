package com.neotech.review11;

public class ExceptionDemo {

	public static void main(String[] args) {
		division(6, 2);
		division(5, 0);
		division(16, 4);
	}

	public static void division(int num1, int num2) {
		
		try {
		int result = num1 / num2;
		System.out.println("result -> " + result);
		}catch(Exception ex) {
			
			// Write the problem/exception into a file
			System.out.println("Problem when dividing " + num1 + " by " + num2);
		
		    System.out.println("Exception - > " + ex);
		    System.out.println("Exception Message - > " + ex.getMessage());
		    ex.printStackTrace();
		}finally {
			System.out.println("Neotech is the best!!!");
		}
		
	}
}
