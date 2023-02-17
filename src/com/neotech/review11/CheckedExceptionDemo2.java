package com.neotech.review11;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class CheckedExceptionDemo2 {

	public static void main(String[] args)  {
		
		System.out.println("Hi Java");
			
	    try {
			Thread .sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("Something went wrong while waiting");
		}
			
		System.out.println("Bye Java");
	}
}
