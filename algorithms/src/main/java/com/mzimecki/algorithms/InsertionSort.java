package com.mzimecki.algorithms;

/**
 * Insertion sort implementation example O(n^2).
 * 
 * For each i = 1,2,..,n continue inserting a[i] in already sorted
 * part of list a[1]<= ... <=a[i-1].
 * 
 * @author M. Zimecki
 */
public class InsertionSort {

	public static int[] sort(int[] a) {
		
		for (int i = 1; i < a.length; i++) {
			int j = i;
			int v = a[i];
			while (j > 0 && a[j-1] > v) {
				a[j] = a[j-1];
				j--;
			}
			a[j] = v;
		}
		return a;
	}

}
