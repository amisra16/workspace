package com.practice.assignments;

public class Factorial1 {

	void factorial(int n) {
		int fact = 1;
		for (int i = 1; i < n; i++) {
			fact = fact * i;
		}
		System.out.println("factorial " + fact);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Factorial1().factorial(4);
		Factorial1 f2 = new Factorial1();
		f2.factorial(5);

	}

}
