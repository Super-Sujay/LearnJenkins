package com.learning.programming;

public class ASum {

	public static long findNb(long m) {
		long n = 0;
		long ans = 0;
		do {
			n++;
			ans = ans + (n * n * n);
		} while (ans < m);
		if (ans == m)
			return n;
		return -1;

		// double sqrt = Math.sqrt(m);
		// double number = Math.abs(sqrt);
		// if (Math.abs(number - Math.round(number)) == 0)
		// return (long) (-1 + Math.sqrt(1 + 8 * sqrt)) / 2;
		// else
		// return -1;

		// double sqrt = Math.sqrt(m);
		// if (sqrt - Math.floor(sqrt) == 0)
		// return (long) (-1 + Math.sqrt(1 + 8 * sqrt)) / 2;
		// else
		// return -1;

		// double n = (-1 + Math.sqrt(1 + 8 * Math.sqrt(m))) / 2;
		// if (n % 1 == 0)
		// return (long) n;
		// else
		// return -1;

		// double sqrt = Math.sqrt(m);
		// if (sqrt - Math.floor(sqrt) == 0)
		// return (long) (sqrt * sqrt);
		// else
		// return -1;
	}
}