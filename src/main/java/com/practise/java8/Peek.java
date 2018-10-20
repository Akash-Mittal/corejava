package com.practise.java8;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

public class Peek {
	Logger logger = Logger.getLogger(Peek.class.getSimpleName());

	@Test
	public void testPeek() {

		// The number of elements covered by the stream source, a List, isknown and the
		// intermediate operation, peek, does not inject into or remove elements from
		// the
		// stream (as may be the case for flatMap or filter operations). Thus the count
		// is thesize of the List and there is no need to execute the pipelineand, as a
		// side-effect, print out the list elements.
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
