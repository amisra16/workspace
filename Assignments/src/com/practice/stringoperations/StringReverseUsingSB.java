package com.practice.stringoperations;

public class StringReverseUsingSB {

	public static void main(String[] args) {
		String original = "My nation is great";
		StringBuffer sb = new StringBuffer(original);
		System.out.println(sb.reverse());
	}

}
