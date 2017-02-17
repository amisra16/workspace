package com.practice.assignments;

public class Sequence {

	public Sequence() {
		System.out.println("Constructor Being Called");
	}

	static {
		System.out.println("Static");
	}

	public static void main(String[] args) {
		Sequence sequence = new Sequence();
		System.out.println("Main Method called");

	}

}
