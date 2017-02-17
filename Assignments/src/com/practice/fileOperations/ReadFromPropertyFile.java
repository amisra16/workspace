package com.practice.fileOperations;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadFromPropertyFile {

	public static void main(String[] args) {
		Properties properties = new Properties();
		try {
			InputStream inputStreamProperties = new FileInputStream("details.properties");
			properties.load(inputStreamProperties);
			System.out.println("Name " +properties.getProperty("name"));
			System.out.println("Age " +properties.getProperty("age"));
			System.out.println("Status " +properties.getProperty("status"));
			System.out.println("Wife " +properties.getProperty("wife"));
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

}
