package com.practise.recursion;

import static org.hamcrest.CoreMatchers.is;

import java.math.BigDecimal;
import java.util.function.Predicate;

import org.junit.Assert;
import org.junit.Test;

public class Factorial {

	Predicate<Number> checkIfNotNull = input -> input != null;
	Predicate<Number> checkIfValueGreaterThan0 = input -> input.intValue() > 0;
	Predicate<Number> checkIfValueEqualTo1 = input -> input.intValue() == 1;
	Predicate<Number> checkIfValueLessThan2 = input -> input.intValue() < 2;

	public String getBigFactorialRecursive(Integer number) {
		BigDecimal factorial = BigDecimal.ZERO;
		if (checkIfNotNull.test(number)) {
			if ((checkIfValueGreaterThan0).test(number)) {
				factorial = BigDecimal.ONE;
				for (int i = number; i > 0; i--) {
					factorial = factorial.multiply(BigDecimal.valueOf(i));
				}
			} else {
				return "-1";
			}
		} else {
			return "-1";
		}
		System.out.println(factorial.toPlainString());
		return factorial.toPlainString();

	}

	public int getFactorialRecursiveSimple(int number) {
		if (checkIfValueGreaterThan0.test(number)) {
			if (checkIfValueEqualTo1.test(number)) {
				return 1;
			} else {
				return number * getFactorialRecursiveSimple(number - 1);
			}
		} else {
			return -1;
		}

	}

	public String getBigFactorialRecursive(BigDecimal factorial) {
		if (checkIfValueGreaterThan0.test(factorial)) {
			if ((checkIfValueEqualTo1).test(factorial)) {
				return "1";
			} else {
				return factorial.multiply(new BigDecimal(getBigFactorialRecursive(factorial.subtract(BigDecimal.ONE))))
						.toPlainString();
			}
		} else {
			return "-1";
		}

	}

	@Test
	public void testFactorialValid() {
		Factorial factorial = new Factorial();
		for (int i = -10; i < 14; i++) {
			Assert.assertThat(factorial.getBigFactorialRecursive(i), is(factorial.getFactorialRecursiveSimple(i) + ""));
			Assert.assertThat(factorial.getBigFactorialRecursive(i),
					is(factorial.getBigFactorialRecursive(BigDecimal.valueOf(i))));
		}
	}
}
