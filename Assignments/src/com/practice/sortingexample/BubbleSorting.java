package com.practice.sortingexample;

/**
 * http://www.java2novice.com/java-sorting-algorithms/bubble-sort/
 * n(n-1)/2 iterations
 * 
 * @author awmishra
 *
 */
public class BubbleSorting {

	public void doSorting(int values[]) {
		int length = values.length;
		int next;
		for (int i = length; i >= 0; i--) {
			for (int current = 0; current < i - 1; current++) {
				next = current + 1;
				if (values[current] > values[next]) {
					int c = values[current];
					values[current] = values[next];
					values[next] = c;
				}
			}
			display(values);
		}
	}

	public static void display(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
		int[] input = { 12, 9, 3, 16, 1 };
		new BubbleSorting().doSorting(input);
	}

}
