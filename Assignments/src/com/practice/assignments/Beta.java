package com.practice.assignments;

public class Beta extends Papa{

	Beta() {
		System.out.println("Beta Default constructor called");
	}
	
	Beta(int j) {
		super(j);
		System.out.println("Beta Parameterized constructor called");
	}
	
	public static void main(String[] args) {
		Beta beta = new Beta();
		Beta beta1 = new Beta(2);

	}

}
