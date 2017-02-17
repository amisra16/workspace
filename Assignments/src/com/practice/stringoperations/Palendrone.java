package com.practice.stringoperations;

import java.util.Scanner;

/**
 * Class to check a string for palendrome
 * 
 * @author awmishra
 *
 */

public class Palendrone {

	public static void main(String[] args) {
		String original = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String to check for palendrone");
		original = in.nextLine();
		String reverse = "";
		int length = original.length();

		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}

		if (original.equalsIgnoreCase(reverse)) {
			System.out.println(original +" is a palendrome");
		} else {
			System.out.println(original +" is not a palendrome");
		}
	}
}
