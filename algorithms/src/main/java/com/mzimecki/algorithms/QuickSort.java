package com.mzimecki.algorithms;

/**
 * 1. Select an element from the array. 
 * This element is called the "pivot element". For example select the element in the middle of the array.
 * 
 * 2. All elements which are smaller than the pivot element are placed in the array on the left side of pivot 
 * and all elements which are larger are placed in the right side of pivot.
 * 
 * 3. Sort both arrays by recursively applying Quicksort to them.

 * @author M. Zimecki
 */
public class QuickSort {

	public int[] sort(int[] a) {
		if (a.length > 1) {
			return quicksort(a, 0, a.length - 1);
		}
		return a;
	}
	
	private int[] quicksort(int a[], int l, int r) {
		int i = l;
		int j = r;
		int pivot = a[l + (r - l)/2];
		do {
			while (a[i] < pivot)
				i++;
			while (a[j] > pivot)
				j--;
			if (i <= j) {
				exchange(a, i, j);
				i++;
				j--;
			}
		} while (i <= j);
		if (l < j) {
			quicksort(a, l, j);
		}
		if (i < r) {
			quicksort(a, i, r);
		}
		return a;
	}
	
	private void exchange(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
	}
}
