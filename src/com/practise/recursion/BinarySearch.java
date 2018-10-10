package com.practise.recursion;

import java.util.Arrays;

import org.junit.Test;

public class BinarySearch {

	@Test
	public void testBinarySearch() {
		Integer items1[] = new Integer[] { 11, 2, 32, 12, 3, 132, 1 };
		printArray(items1);
		SORT_STRATEGY.JAVA.apply(items1);
		printArray(items1);

	}

	private void printArray(Integer items1[]) {
		System.out.println(Arrays.toString(items1));
	}

}

enum BINARY_SEARCH_STRATEGY {

	ITERATIVE {
		@Override
		public Integer search(Integer[] data) {
			// TODO Auto-generated method stub
			return 0;
		}
	},
	RECURSIVE {
		@Override
		public Integer search(Integer[] data) {
			// TODO Auto-generated method stub
			return 0;
		}
	};

	public abstract Integer search(Integer[] data);
}
