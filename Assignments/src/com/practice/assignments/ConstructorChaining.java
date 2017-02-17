package com.practice.assignments;

class GrandParent {
	int a;

	GrandParent(int a) {
		this.a = a;
		System.out.println("Grand Parent's a" + a);
	}

}

class Parent extends GrandParent {
	int b;

	Parent(int a, int b) {
		super(a);
		this.b = b;
		System.out.println("Parent's B " + b);
	}
}

public class ConstructorChaining {

	public static void main(String[] args) {
		Parent object = new Parent(9, 10);
		System.out.println(object.toString());
	}

}
