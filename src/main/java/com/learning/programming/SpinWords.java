package com.learning.programming;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SpinWords {

	public String spinWords(String sentence) {
		return Arrays.stream(sentence.split(" "))
				.map(word -> word.length() >= 5 ? new StringBuilder(word).reverse().toString() : word)
				.collect(Collectors.joining(" "));
	}

	public String spinWords1(String sentence) {
		String[] words = sentence.split(" ");
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() >= 5) {
				words[i] = new StringBuilder(words[i]).reverse().toString();
			}
		}
		return String.join(" ", words);
	}

}