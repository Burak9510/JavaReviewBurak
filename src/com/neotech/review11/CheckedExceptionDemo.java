package com.neotech.review11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionDemo {

	public static void main(String[] args)  {
		
		String projectPath = System.getProperty("user.dir");
		String filePath = projectPath + "/extra1/democratic.properties";
		
		try {
			FileInputStream fis = new FileInputStream(filePath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		System.out.println("Happy Ending!!!");
	}

}
