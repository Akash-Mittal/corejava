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
