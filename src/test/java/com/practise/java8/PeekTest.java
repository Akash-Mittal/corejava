package com.practise.java8;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

public class PeekTest {
	Logger logger = Logger.getLogger(PeekTest.class.getSimpleName());

	@Test
	public void testPeek() {
		Arrays.asList("one", "two", "three", "four").stream().filter(e -> e.length() > 3)
				.peek(e -> System.out.println("Filtered value: " + e)).map(String::toUpperCase)
				.peek(e -> System.out.println("Mapped value: " + e)).collect(Collectors.toList());
	}

	@Test
	public void testPeekForKnownOperationsNoOutput() {
		List<String> l = Arrays.asList("A", "B", "C", "D");
		long count = l.stream().peek(System.out::println).count();
	}

	@Test
	public void testStreamForDebuggingWithOutPut() {
		Stream.of("one", "two", "three", "four").filter(e -> e.length() > 3)
				.peek(e -> System.out.println("Filtered value: " + e)).map(String::toUpperCase)
				.peek(e -> System.out.println("Mapped value: " + e)).collect(Collectors.toList());
	}

	@Test
	public void testPeekWithNonTerminalOperationArbitraryResults() {
		Arrays.asList("Fred", "Jim", "Sheila").stream().peek(val -> {
			System.out.println(val + ": Testing");
		}).allMatch(s -> s.startsWith("S"));
	}

	@Test
	public void testForEachSimple() {
		Arrays.asList("Fred", "Jim", "Sheila").stream().filter(val -> val.startsWith("F")).forEach(val -> {
			System.out.println(val);
		});
	}

}
