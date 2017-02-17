package com.practice.sortingexample;

/**
 * http://www.java2novice.com/java-sorting-algorithms/bubble-sort/ n(n-1)/2
 * The selection sort is a combination of searching and sorting. During each pass, the unsorted element with the smallest (or largest) value is moved to its proper position in the array. The number of times the sort passes through the array is one less than the number of items in the array. In the selection sort, the inner loop finds the next smallest (or largest) value and the outer loop places that value into its proper location. - See more at: http://www.java2novice.com/java-sorting-algorithms/selection-sort/#sthash.nKMKkwta.dpuf
 * 
 * @author awmishra
 *
 */
public class SelectionSorting {

	public void doSorting(int values[]) {
		int length = values.length;
		for (int i = 0; i < length; i++) {
			int index = i;
			for (int j = i + 1; j < length; j++) {
				if (values[j] < values[index])
					index = j;

				int smallerElement = values[index];
				values[index] = values[i];
				values[i] = smallerElement;
			}
			display(values);
		}
		display(values);
	}

	public static void display(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
		int[] input = { 12, 9, 3, 16, 1 };
		new SelectionSorting().doSorting(input);
	}

}
