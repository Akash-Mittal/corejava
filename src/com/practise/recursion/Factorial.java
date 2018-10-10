package com.practise.recursion;

import static org.hamcrest.CoreMatchers.is;

import java.math.BigDecimal;
import java.util.function.Predicate;

import org.junit.Assert;
import org.junit.Test;

public class Factorial {

	Predicate<Number> checkIfNotNull = input -> input != null;
	Predicate<Number> checkIfValueGreaterThan0 = input -> input.intValue() > 0;

	public String getFactorial(Integer number) {
		BigDecimal factorial = BigDecimal.ZERO;
		if (checkIfNotNull.and(checkIfValueGreaterThan0).test(number)) {
			factorial = BigDecimal.ONE;
			for (int i = number; i > 0; i--) {
				factorial = factorial.multiply(BigDecimal.valueOf(i));
			}
		}
		System.out.println(factorial.toPlainString());
		return factorial.toPlainString();

	}

	@Test
	public void testFactorialValid() {
		Factorial factorial = new Factorial();
		Assert.assertThat(factorial.getFactorial(null), is(BigDecimal.ZERO.toPlainString()));
		Assert.assertThat(factorial.getFactorial(0), is(BigDecimal.ZERO.toPlainString()));
		Assert.assertThat(factorial.getFactorial(1), is(BigDecimal.ONE.toPlainString()));
		Assert.assertThat(factorial.getFactorial(2), is(BigDecimal.valueOf(2).toPlainString()));
		Assert.assertThat(factorial.getFactorial(3), is(BigDecimal.valueOf(6).toPlainString()));
		Assert.assertThat(factorial.getFactorial(100), is(
				"93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000"));
	}
}
