package array;

import java.util.Arrays;

public class SortingArray {
	public static void main(String[] args) {
		int[] arr = { 3, 7, 9, 11, 19, 20, 6 };
		sortArray(arr);
	}

	
	
	// Given an sorted array which last element is not sorted. Sort the array 
	public static void sortArray(int[] arr) {
		for (int i = (arr.length - 1); i > 0; i--) {

			if (arr[i] < arr[i - 1]) {
				int c = arr[i];

				arr[i] = arr[i - 1];
				arr[i - 1] = c;

			}
		}

		System.out.println(Arrays.toString(arr));

	}
}
