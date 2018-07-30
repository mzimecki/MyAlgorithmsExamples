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

	public int [] sort(int [] list, int l, int r) {
        if (r <= l) {
            return list;
        }
        
        int q = partition(list, l, r);
        sort(list, l, q - 1);
        sort(list, q + 1, r);
        return list;
    }
    
    private int partition(int [] list, int left, int right) {
        long pivot = list[left];
        int pivotIdx = left;
     
        for(int j = left + 1; j <= right; j++)
            if(list[j] <= pivot) {
                pivotIdx = pivotIdx + 1;
                swap(list, pivotIdx, j);
            }
        swap(list, pivotIdx, left);
        return pivotIdx;
    }
    
    private void swap(int [] list, int i, int j) {
        int tmp = list[i];
        list[i] = list[j];
        list[j] = tmp;
    }
    
}
