package com.learning.testing;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.learning.programming.Kata;

// TODO: Replace examples and use TDD development by writing your own tests

public class SolutionTest {
	@Test
	public void testSomething1() {
		assertEquals(true, Kata.solution("abc", "bc"));
	}

	@Test
	public void testSomething2() {
		assertEquals(false, Kata.solution("abc", "d"));
	}
}