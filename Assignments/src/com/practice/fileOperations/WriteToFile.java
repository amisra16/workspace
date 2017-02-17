package com.practice.fileOperations;

import java.io.File;
import java.io.FileWriter;

public class WriteToFile {

	public static void main(String[] args) throws Exception {
		File file = new File("input.txt");
		FileWriter fileWriter = new FileWriter(file);
		fileWriter.write("Awanish \r\n");
		fileWriter.write("Divya \r\n");
		fileWriter.write("Umesh \r\n");
		fileWriter.write("Kavita \r\n");
		fileWriter.write("Annu \r\n");
		fileWriter.write("Kamayani \r\n");
		fileWriter.write("Sushma \r\n");
		fileWriter.flush();
		fileWriter.close();
		
	}

}
