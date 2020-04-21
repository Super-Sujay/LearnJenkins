package com.learning.programming;

import java.text.DecimalFormat;

public class NthSeries {

	public static String seriesSum1(int n) {
		DecimalFormat df = new DecimalFormat("0.00");
		double ans = 0;
		for (double i = 1; i <= n; i++)
			ans += 1 / (3 * (i - 1) + 1);
		return df.format(ans);
	}

	public static String seriesSum(int n) {
		double sum = 0.0;
		for (int i = 0; i < n; i++)
			sum += 1.0 / (1 + 3 * i);
		return String.format("%.2f", sum);
	}

}