package com.learning.programming;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenCase {

	public String toJadenCase(String phrase) {
		if (phrase == null || phrase.isEmpty())
			return null;
		else {
			return Arrays.asList(phrase.split(" ")).stream().map(word -> {
				char[] letters = word.toCharArray();
				letters[0] = Character.toUpperCase(letters[0]);
				return String.copyValueOf(letters);
			}).collect(Collectors.joining(" "));
		}
	}

}