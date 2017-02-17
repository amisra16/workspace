package com.practice.assignments;

import java.io.IOException;

public class OpenDoc {

	public static void main(String[] args) {
		Runtime rs = Runtime.getRuntime();
		try {
			rs.exec("mspaint");
			rs.exec("taskmanager");
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
