package com.neotech.interview;

import org.apache.batik.apps.rasterizer.Main;

public class IQ4 {

	public static void main(String[] args) {
		
		// Find out how many alpha characters are present in a String?
				// Find number of words in string?

				String str = "dfg%^&DF3434  ere  @#67";

				// Let's replace the characters that are not letters with nothing
				str = str.replaceAll("[^A-Za-z]", "");
				System.out.println(str);

				System.out.println("Number of alpha characters = " + str.length());

				System.out.println("--------------------------------");

				String longStr = "bye bye Java hello Selenium";
				String[] words = longStr.split(" ");

				System.out.println("Number of words in the string = " + words.length);
				for (String el : words) {
					System.out.println(el);
	}
	
		

}
}