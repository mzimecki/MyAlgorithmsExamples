package com.mzimecki.algorithms;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class RadixSortTest {

	@Test
	public void should_return_empty_array() {
		int[] unsorted = new int[] {};
		int[] sorted = RadixSort.sort(unsorted);
		assertTrue(sorted.length == 0);
	}
	
	@Test
	public void should_return_input_one_size_array() {
		int[] unsorted = new int[] {2};
		int[] sorted = RadixSort.sort(unsorted);
		assertTrue(sorted.length == 1);
		assertTrue(Arrays.equals(unsorted, sorted));
	}
	
	@Test
	public void should_return_sorted_array() {
		int[] unsorted = new int[] {2, 6, 1, 33, 56, 77, 88, 44};
		int[] expected = new int[] {1, 2, 6, 33, 44, 56, 77, 88};
		int[] sorted = RadixSort.sort(unsorted);
		assertArrayEquals(expected, sorted);
	}
	
	@Test
	public void should_return_sorted_2_size_array() {
		int[] unsorted = new int[] {444, 62};
		int[] expected = new int[] {62, 444};
		int[] sorted = RadixSort.sort(unsorted);
		assertArrayEquals(expected, sorted);
		
		expected = new int[] {62, 444};
		sorted = RadixSort.sort(expected);
		assertArrayEquals(expected, sorted);
	}

}
