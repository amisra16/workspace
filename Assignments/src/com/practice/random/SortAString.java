
package com.practice.random;

import java.util.Scanner;

public class SortAString {

	public static void main(String[] args) {
		System.out.println("Please enter the string to sort");
		Scanner in = new Scanner(System.in);
		String original = in.nextLine();
		in.close();

		String[] arr = original.split(" ");
		int length = arr.length;
		String smallerValue = "";

		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (arr[i].length() > arr[j].length()) {
					smallerValue = arr[j];
					arr[j] = arr[i];
					arr[i] = smallerValue;
				}
			}
		}
		
		for (String str: arr) {
			System.out.print(str +" ");
		}

	}

}
