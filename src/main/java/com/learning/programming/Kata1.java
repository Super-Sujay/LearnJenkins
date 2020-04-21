package com.learning.programming;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Kata1 {
	public static String reverseWords(final String original) {
		if (original.replace(" ", "").isEmpty())
			return original;
		else
			return Arrays.asList(original.split("\\s")).stream().map(word -> new StringBuilder(word).reverse())
					.collect(Collectors.joining(" "));
	}
}