package com.Daily.Task4;

import java.util.Arrays;

public class SecondLargest {
	public static void main(String[] args) {
		/*
		 * Q3. Second Largest Element: Determine the second-largest element in an array
		 * of integers.
		 */
		int[] origArr = { 10, 1, 1, 2, 3, 4, 9, 8, 11 };
		Arrays.sort(origArr);
		int[] sortedArr = new int[origArr.length];
		int j = 0;
		for (int i = origArr.length - 1; i >= 0; i--) {
			sortedArr[j] = origArr[i];
			j++;
		}
		System.out.println(sortedArr[1]);

	}
}
