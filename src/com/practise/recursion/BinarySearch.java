package com.practise.recursion;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;

import org.junit.Test;

import com.am.innovations.LIMITS;
import com.am.innovations.Validators;

public class BinarySearch {

	@Test
	public void testBinarySearchWithNullArrayEmptyArraySingleElementArray() {

		assertThat(BINARY_SEARCH_STRATEGY.ITERATIVE.search(null, null), is(-1));
		assertThat(BINARY_SEARCH_STRATEGY.ITERATIVE.search(new Integer[] {}, null), is(-1));
		assertThat(BINARY_SEARCH_STRATEGY.ITERATIVE.search(new Integer[] { 1 }, 1), is(0));
		assertThat(BINARY_SEARCH_STRATEGY.ITERATIVE.search(new Integer[] { 1 }, 100), is(-1));
		assertThat(BINARY_SEARCH_STRATEGY.ITERATIVE.search(new Integer[] { 1, 434 }, 434), is(1));

		Integer items1[] = new Integer[] { 11, 2, 32, 12, 3, 132, 1 };
		Arrays.sort(items1);
		printArray(items1);
		assertThat(BINARY_SEARCH_STRATEGY.ITERATIVE.search(items1, 1), is(0));
		assertThat(BINARY_SEARCH_STRATEGY.ITERATIVE.search(items1, 132), is(items1.length - 1));

	}

	@Test
	public void testBinarySearchRecursiveWithNullArrayEmptyArraySingleElementArray() {

		assertThat(BINARY_SEARCH_STRATEGY.RECURSIVE.search(null, null), is(-1));
		assertThat(BINARY_SEARCH_STRATEGY.RECURSIVE.search(new Integer[] {}, null), is(-1));
		assertThat(BINARY_SEARCH_STRATEGY.RECURSIVE.search(new Integer[] { 1 }, 1), is(0));
		assertThat(BINARY_SEARCH_STRATEGY.RECURSIVE.search(new Integer[] { 1 }, 100), is(-1));
		assertThat(BINARY_SEARCH_STRATEGY.RECURSIVE.search(new Integer[] { 1, 434 }, 434), is(1));

		Integer items1[] = new Integer[] { 11, 2, 32, 12, 3, 132, 1 };
		Arrays.sort(items1);
		printArray(items1);
		assertThat(BINARY_SEARCH_STRATEGY.RECURSIVE.search(items1, 1), is(0));
		assertThat(BINARY_SEARCH_STRATEGY.RECURSIVE.search(items1, 132), is(items1.length - 1));

	}

	private void printArray(Integer items1[]) {
		System.out.println(Arrays.toString(items1));
	}

}

enum BINARY_SEARCH_STRATEGY {

	ITERATIVE {
		@Override
		public Integer search(Integer[] data, Integer valueToSearch) {
			Integer index = -1;
			if (Validators.checkIfNotNullAndSizeGreaterThan.test(data, LIMITS.ZERO.getVal())) {
				Integer start = 0;
				Integer end = data.length - 1;

				for (Integer mid = 0; start <= end; mid = (start + end) / 2) {
					if (valueToSearch.equals(data[mid])) {
						index = mid;
						break;
					} else if (valueToSearch < data[mid]) {
						end = mid - 1;
					} else {
						start = mid + 1;
					}
				}
			}
			return index;
		}

	},
	RECURSIVE {

		@Override
		public Integer search(Integer[] data, Integer valueToSearch) {
			if (Validators.checkIfNotNullAndSizeGreaterThan.test(data, LIMITS.ZERO.getVal())) {
				return binarySearchRecursive(data, valueToSearch, LIMITS.ZERO.getVal(), data.length - 1);
			} else {
				return -1;
			}
		}

	};

	private static Integer binarySearchRecursive(Integer[] data, Integer valueToSearch, Integer left, Integer right) {
		if (left > right) {
			return -1;
		} else if (data[(left + right) / 2].equals(valueToSearch)) {
			return (left + right) / 2;
		} else if (valueToSearch < data[(left + right) / 2]) {
			return binarySearchRecursive(data, valueToSearch, left, ((left + right) / 2) - 1);
		} else {
			return binarySearchRecursive(data, valueToSearch, ((left + right) / 2) + 1, right);
		}

	}

	public abstract Integer search(Integer[] data, Integer valueToSearch);
}
