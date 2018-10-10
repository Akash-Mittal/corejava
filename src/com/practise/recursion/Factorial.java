package com.practise.recursion;

import static org.hamcrest.CoreMatchers.is;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import com.am.innovations.Validators;
import com.google.common.base.Predicates;

public class Factorial {

	public String getBigFactorialIterative(Integer number) {
		BigDecimal factorial = BigDecimal.ZERO;

		if (Predicates.notNull().test(number)) {
			if (Validators.checkIfGreaterThan.test(number, 0)) {
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
		if (Validators.checkIfGreaterThan.test(number, 0)) {
			if (Validators.checkIfEqualsTo.test(number, 1)) {
				return 1;
			} else {
				return number * getFactorialRecursiveSimple(number - 1);
			}
		} else {
			return -1;
		}

	}

	public String getBigFactorialRecursive(BigDecimal factorial) {
		if (Validators.checkIfGreaterThan.test(factorial, 0)) {
			if (Validators.checkIfEqualsTo.test(factorial, 1)) {
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
		for (int i = 0; i < 1; i++) {
			Assert.assertThat(factorial.getBigFactorialIterative(i), is(factorial.getFactorialRecursiveSimple(i) + ""));
			Assert.assertThat(factorial.getBigFactorialIterative(i),
					is(factorial.getBigFactorialRecursive(BigDecimal.valueOf(i))));
		}
	}
}
