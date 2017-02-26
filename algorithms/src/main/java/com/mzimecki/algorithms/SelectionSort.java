package com.mzimecki.algorithms;

/**
 * Selection sort implementation example O(n^2).
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
					int tmp = a[i];
					a[i] = a[min];
					a[min] = tmp;
				}
			}
		}
		return a;
	}

}
