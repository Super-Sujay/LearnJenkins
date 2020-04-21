package com.learning.programming;

public class Kata {

	public static boolean solution(String str, String ending) {
		if (str.length() < ending.length())
			return false;
		else
			return str.substring(str.length() - ending.length(), str.length()).equals(ending);
	}

}