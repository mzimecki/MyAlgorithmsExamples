package com.mzimecki.algorithms;

/**
 * Selection sort implementation example O(n^2).
 * 
 * 1. Select minimum element and swap it with 1st one.
 * 2. Select minimum element starting from 2nd and swap it with 2nd one.
 * 3. Continue while array is sorted.
 * 
 * @author M. Zimecki
 */
public class SelectionSort {

	public static int[] sort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
					exchange(a, min, i);
				}
			}
		}
		return a;
	}
	
	private static void exchange(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
	}
}
