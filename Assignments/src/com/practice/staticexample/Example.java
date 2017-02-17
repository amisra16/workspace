package com.practice.staticexample;

class Example{  
	int i;
	String s;
	Example(){
		System.out.println("Default constructor called");
		}
	
	public static void main (String args[]) {
		Example e1 = new Example();
		System.out.println("i is " +e1.i);
		System.out.println("s is " +e1.s);
	}
	}