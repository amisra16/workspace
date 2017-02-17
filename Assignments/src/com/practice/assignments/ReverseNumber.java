package com.practice.assignments;

import java.util.Scanner;

/**
 * Reverse the number
 * 
 * @author awmishra
 *
 */
public class ReverseNumber {

	public static void main(String[] args) {
		int originalNumber = 0;
		int reverseNumber = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number to be reversed");
		originalNumber = in.nextInt();

//		while (originalNumber != 0) {
//			reverseNumber = reverseNumber * 10;
//			reverseNumber = reverseNumber + originalNumber % 10;
//			originalNumber = originalNumber / 10;
//		}
		
		int n = 1234;
		int r = 0;
		int rem = 0;
		while (n > 0) {
		 rem = n %10;
		   r= r*10+rem;
		   n=n/10;
		} 
		
		System.out.println("Reverse Number " + r);
	}
}
