package com.learning.programming;

import java.util.stream.Stream;

public class ProdFib {

	public static long[] productFib(long prod) {
		long counter = 0, n1, n2, result;
		do {
			n1 = fib(++counter);
			n2 = fib(counter + 1);
			result = n1 * n2;
		} while (prod > result);
		if(prod == result)
			return new long[] {n1, n2, 1};
		else
			return new long[] {n1, n2, 0};
	}

	private static long fib(long n) {
		return Stream.iterate(new long[]{0, 1}, t -> new long[]{t[1], t[0] + t[1]})
		.limit(n)
		.reduce((a, b) -> b)
	    .get()[0];
	}

}