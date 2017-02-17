package com.practice.fileOperations;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class WriteToPropertyFile {
	
	public static void main(String args[]) {
		Properties prop = new Properties();
		try {
			OutputStream outputStreamXML = new FileOutputStream("outputDetails.xml");
			OutputStream outputStreamProperties = new FileOutputStream("outputDetails.properties");
			prop.setProperty("name", "annu");
			prop.setProperty("wife", "shweta");
			prop.setProperty("age", "35");
			prop.store(outputStreamProperties, "Properties with person detail");
			prop.storeToXML(outputStreamXML, "XML with person detail", "UTF8");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
