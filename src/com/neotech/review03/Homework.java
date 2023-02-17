package com.neotech.review03;

public class Homework {

	public static void main(String[] args) {
		//Homework- Practice
		//Print the sum of the numbers in the array
		//1.Using Normal for loop
		//2.Using Enhanced/advanced
	
	int[] arr = new int[5];
	arr[0] = 5;
	arr[4] = 14;
	arr[3] = 76;
	arr[2] = 11;
	arr[1] = 33;
	
	int sumArr = 0;
	for(int i = 0; i < arr.length; i++) {
		sumArr += arr[i];
	}
	System.out.println("Sum of the array is -> " + sumArr);
	
	int[] arr2 = {3, 4, 5, 6};
	int sumArr2 = 0;
	
	for(int num : arr2) {
		sumArr2 += num;
	}
	
	System.out.println("Sum of the array is-> " + sumArr2);
	
	}

}
