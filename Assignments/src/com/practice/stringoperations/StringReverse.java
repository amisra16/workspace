package com.practice.stringoperations;

import java.util.Scanner;

/**
 * Program to reverse a String
 * @author awmishra
 *
 */

public class StringReverse {

	public static void main(String[] args) {
		String original = "My name is Khan";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string to reverse");
		original = scanner.nextLine();	
		scanner.close();
		String reverse = "";
		int length = original.length();

		for (int i = length-1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}
		System.out.println("Reverse String is: 	" + reverse);
	}

}
