package com.mzimecki.algorithms;

import java.util.ArrayList;

/**
 * Radix sort implementation - O(nd), 
 * where n is the size of array and d is the number of digits in the largest number.
 * 
 * In radix sort, we first sort the elements based on last digit 
 * (least significant digit). Then the result is again sorted by second digit, 
 * continue this process for all digits until we reach most significant digit. 
 * We use counting sort to sort elements of every digit, so time complexity is O(nd).  
 * 
 * @author Zimek
 */
public class RadixSort {

	public static int[] sort(int[] a) {
		int maxDigits = getMaxNumberOfdigits(a);
		int exp = 1;
		for (int i = 0; i < maxDigits; i++) {
			ArrayList<Integer>[] bucket = initializeBuckets();
			for (int j = 0; j < a.length; j++) {
				int digit = (a[j] / exp) % 10;
				bucket[digit].add(a[j]);
			}
			exp *= 10;
			int index = 0;
			for (int k = 0; k < 10; k++) {
				for (int number : bucket[k]) {
					a[index] = number;
					index++;
				}
			}
		}
		return a;
	}

	private static ArrayList<Integer>[] initializeBuckets() {
		final ArrayList<Integer> bucket[] = new ArrayList[10];
		for (int k = 0; k < 10; k++) {
			bucket[k] = new ArrayList<Integer>();
		}
		return bucket;
	}

	private static int getMaxNumberOfdigits(int[] a) {
		if (a.length == 0) {
			return 0;
		}
		int maxDigits = String.valueOf(a[0]).length();
		for (int i = 1; i < a.length; i++) {
			if (String.valueOf(a[i]).length() > maxDigits) {
				maxDigits = String.valueOf(a[i]).length();
			}
		}
		return maxDigits;
	}
}
