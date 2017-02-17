package com.practice.stringoperations;

import java.util.Scanner;

/**
 * Program to sort the string
 * 
 * @author awmishra
 *
 */

public class StringWordSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String to Sort");
		String original = in.nextLine();
		in.close();
		String[] arr = original.split(" ");
		int length = arr.length;
		String temp = "";

		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (arr[i].length() > arr[j].length()) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}

		for (String st : arr) {
			System.out.print(" "+st);
		}

	}

}
