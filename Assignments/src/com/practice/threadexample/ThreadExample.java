package com.practice.threadexample;

public class ThreadExample implements Runnable {

	private int i;

	@Override
	public void run() {
		if (i % 5 != 0) {
			i++;
		}
		for (int x = 0; x < 5; x++, i++) {
			if (x > 1)
				Thread.yield();
		}
		System.out.println(i + "");
	}

	public static void main(String[] args) {
		ThreadExample n = new ThreadExample();
		for (int x = 100; x > 0; x--) {
			new Thread(n).start();
		}
	}
}
