package com.practice.staticexample;

public class CounterTest {
	// If will remove static, same value ie 1 will be displayed otherwise 1,2,3
	static int count = 0;

	public CounterTest() {
		count++;
		System.out.println("Counter " + count);
	}

	public static void main(String[] args) {
		CounterTest c1 = new CounterTest();
		c1 = new CounterTest();
		CounterTest c3 = new CounterTest();
	}
}
