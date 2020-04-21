package com.learning.testing;

import com.learning.programming.Kata1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest1 {
	@Test
	public void exampleCases() {
		assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god",
				Kata1.reverseWords("The quick brown fox jumps over the lazy dog."));
		assertEquals("elppa", Kata1.reverseWords("apple"));
		assertEquals("a b c d", Kata1.reverseWords("a b c d"));
		assertEquals("elbuod  decaps  sdrow", Kata1.reverseWords("double  spaced  words"));
	}
}
