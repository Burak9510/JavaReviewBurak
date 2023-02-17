package com.neotech.review10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
	
	public static void main(String[] args) throws IOException {
		
		// I created the full path to the file
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		
		String filePath = projectPath + "/extra1/demo.properties";
	    System.out.println(filePath);
	    
	    // fileWin will help me read the file
	    FileInputStream fileWin = new FileInputStream(filePath);
	    
	    // proper is Map(key-value pairs)
	    Properties proper = new Properties();
	    
	    // load method will help me read from the file to the proper-map
	    proper.load(fileWin);
	    
	    System.out.println(proper);
	
        // 1st way
	    Object firstName =proper.get("FirstName");
	    System.out.println(firstName);
	    
	    // 2nd way, the correct way
	    String school = proper.getProperty("School");
	    System.out.println(school);
	   
	    String age = proper.getProperty("Age");
	    System.out.println(age);
	   
	    // Add more key -> value pairs
	    proper.setProperty("SSN", "125-88-9034");
//	    System.out.println(proper);
	    
	    // Re-assign the Age
	    proper.setProperty("Age", "30");
	    System.out.println(proper);
	    
	    // Now let us save into a new file
	    
	    //The path to the new file
	    String newPath = System.getProperty("user.dir") + "/extra1/NewFile.txt";
	    
	    FileOutputStream fileWin1 =  new FileOutputStream(newPath);
	    
	    proper.store(fileWin1, "Burak is waiting for us");
	    
	    
	}

}
