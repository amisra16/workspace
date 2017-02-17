package com.practice.sortingexample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Absolute Relative Reference
 * @author awmishra
 */
public class FileSorting {

	public static void main(String[] args) throws Exception {

			String inputFile = "input.txt";
			String outputFile = "output.txt";

			FileReader fileReader = new FileReader(inputFile);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String inputLine;
			List<String> lineList = new ArrayList<String>();
			while ((inputLine = bufferedReader.readLine()) != null) {
				lineList.add(inputLine);
			}
			fileReader.close();

			Collections.sort(lineList);

			FileWriter fileWriter = new FileWriter(outputFile);
			PrintWriter out = new PrintWriter(fileWriter);
			for (String outputLine : lineList) {
				out.println(outputLine);
			}
			out.flush();
			out.close();
			fileWriter.close();
		}
	/**
	 * Function to create a file
	 * @param file
	 * @throws IOException
	 */
	private static void createFile(String file) throws IOException {
		File inputFile = new File(file);
		FileWriter fileWriter = new FileWriter(inputFile);
		fileWriter.write("Awanish\r\n");
		fileWriter.write("Divya\r\n");
		fileWriter.write("Umesh\r\n");
		fileWriter.write("Kavita\r\n");
		fileWriter.write("Annu\r\n");
		fileWriter.write("Kamayani\r\n");
		fileWriter.write("Sushma\r\n");
		fileWriter.flush();
		fileWriter.close();
	}
}
