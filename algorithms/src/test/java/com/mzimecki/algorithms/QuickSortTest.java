package com.mzimecki.algorithms;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class QuickSortTest {

	@Test
	public void should_return_empty_array() {
		int[] unsorted = new int[] {};
		int[] sorted = new QuickSort().sort(unsorted, 0, -1);
		assertTrue(sorted.length == 0);
	}
	
	@Test
	public void should_return_input_one_size_array() {
		int[] unsorted = new int[] {2};
		int[] sorted = new QuickSort().sort(unsorted, 0, 0);
		assertTrue(sorted.length == 1);
		assertTrue(Arrays.equals(unsorted, sorted));
	}
	
	@Test
	public void should_return_sorted_array() {
		int[] unsorted = new int[] {2, 6, 1, 33, 56, 77, 88, 44};
		int[] expected = new int[] {1, 2, 6, 33, 44, 56, 77, 88};
		int[] sorted = new QuickSort().sort(unsorted, 0, unsorted.length - 1);
		assertArrayEquals(expected, sorted);
	}
	
	@Test
	public void should_return_sorted_2_size_array() {
		int[] unsorted = new int[] {444, 62};
		int[] expected = new int[] {62, 444};
		int[] sorted = new QuickSort().sort(unsorted, 0, unsorted.length - 1);
		assertArrayEquals(expected, sorted);
		
		expected = new int[] {62, 444};
		sorted = new QuickSort().sort(expected, 0, expected.length - 1);
		assertArrayEquals(expected, sorted);
	}

}
