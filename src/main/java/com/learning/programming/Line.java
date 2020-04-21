package com.learning.programming;

public class Line {

	public static String Tickets1(int[] peopleInLine) {
		String result = "NO";
		for (int i = 0; i < peopleInLine.length; i++) {
			result = "NO";
			int sum = 0;
			if (peopleInLine[i] == 25)
				result = "YES";
			else {
				for (int j = 0; j < i; j++) {
					sum += peopleInLine[j];
					if (Math.abs(sum - peopleInLine[i]) == 25)
						result = "YES";
				}
			}
		}
		return result;
	}

	public static String Tickets2(int[] peopleInLine) {
		int remaining = peopleInLine[0];
		if (peopleInLine[0] != 25)
			return "NO";
		else
			for (int i = 1; i < peopleInLine.length; i++) {
				if (peopleInLine[i] == 25) {
					remaining += peopleInLine[i];
				} else if (peopleInLine[i] - remaining == 25) {
					remaining = peopleInLine[i] - remaining;
				} else {
					return "NO";
				}
			}
		return "YES";
	}

	public static String Tickets(int[] peopleInLine) {
		int d25 = 0;
		int d50 = 0;
		for (int i = 0; i < peopleInLine.length; i++) {
			if (peopleInLine[i] == 25)
				d25++;
			if (peopleInLine[i] == 50) {
				d25--;
				d50++;
			}
			if (peopleInLine[i] == 100) {
				if (d50 > 0) {
					d50--;
					d25--;
				} else
					d25 -= 3;
			}
			if (d25 < 0)
				return "NO";
		}
		return "YES";
	}
}