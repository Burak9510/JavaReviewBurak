package com.neotech.review01;

public class TypeCasting {

	public static void main(String[] args) {
	   //byte < short < int < long < float < double
		
		int intNumber = 50;
        
		//widening/implicit casting/automatically
		double doubleNumber = (double) intNumber;
		
		System.out.println("intNumber -> " + intNumber);
		System.out.println("doubleNumber -> " + doubleNumber);
		
	    
		// narrowing/explicit casting/manually
        byte byteNumber = (byte) intNumber; //It is risky, you MAY loose 
        System.out.println("byteNumber ->" + byteNumber);
        
        
        //re-assign
        intNumber = 870;
        byte b2 = (byte) intNumber;
        // in this case we WILL loose data
        System.out.println("b2 -> " + b2);
	    
        byte b3 = 90;
        int i3 = b3;
        System.out.println("i3 -> " + b3);
        
        
	}

}
