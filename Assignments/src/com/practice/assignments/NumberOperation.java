package com.practice.assignments;

import java.util.Scanner;

/**
 * Code to find odd numbers, even numbers and prime numbers
 * 
 * @author awmishra
 *
 */
public class NumberOperation {

	private static Scanner in;

	public static void main(String[] args) {
		int[] numbers = { 4, 12, 45, 37, 19, 22, 43 };
		int length = numbers.length;

		for (int i = 0; i < length; i++) {
			checkOddEven(numbers[i]);
		}
		in = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = in.nextInt();
		checkOddEven(number);

	}

	private static void checkOddEven(int number) {
		if ((number / 2) * 2 == number) {
			System.out.println("Number is even " + number);
		} else {
			System.out.println("Number is odd " + number);
			int counter = 0;
			for (int i = 2; i <= Math.sqrt(number); i++) {
				if (number % i == 0) {
					System.out.println("Not a prime");
					break;
				}
			}

		}
	}
}
