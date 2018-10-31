package com.practise.java8;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

import java.util.Optional;

import org.junit.Test;

public class OptionalTest {

	@Test(expected = NullPointerException.class)
	public void testWhenConvertingAnObjectToOptionalUsingOf() {
		String value = null;
		assertNull(Optional.of(value));
	}

	@Test
	public void testWhenConvertingAnObjectToOptionalUsingOffNullable() {
		String value = null;
		assertNotNull(Optional.ofNullable(value));
	}

	@Test(expected = InvalidArgumentException.class)
	public void testWhenConvertingAnObjectToOptionalUsingOffNullableThrowException() {
		String value = null;
		Optional<String> val = Optional.ofNullable(value);
		String retrievedVal = val.orElseThrow(() -> {
			throw new InvalidArgumentException("Invalid");
		});
	}

	@Test
	public void testWhenGettingValueFromOptionalAndValueIsNull() {
		String value = null;
		String defaultValue = "default";
		final StringBuilder finalResponse = new StringBuilder();
		Optional.ofNullable(value).ifPresentOrElse(val -> {
			finalResponse.append("Succesfull:" + val);
		}, () -> {
			finalResponse.append(defaultValue);
		});
		assertThat(finalResponse.toString(), is(defaultValue));
		value = "Beauty of Rome - is no more than a Whisper";
	}

	@Test
	public void testWhenGettingValueFromOptionalAndValueIsNotNull() {
		String value = "Beauty of Rome - is no more than a Whisper";
		String defaultValue = "default";
		final StringBuilder finalResponse = new StringBuilder();
		Optional.ofNullable(value).ifPresentOrElse(val -> {
			finalResponse.append("Succesfull:" + val);
		}, () -> {
			finalResponse.append(defaultValue);
		});
		assertThat(finalResponse.toString(), is("Succesfull:" + value));
	}

}

class InvalidArgumentException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7243730349806241412L;

	public InvalidArgumentException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InvalidArgumentException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public InvalidArgumentException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public InvalidArgumentException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public InvalidArgumentException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
