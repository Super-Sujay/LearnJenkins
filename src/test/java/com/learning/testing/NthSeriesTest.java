package com.learning.testing;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.learning.programming.NthSeries;

public class NthSeriesTest {
	
	@Test
	public void test4() {
		assertEquals("1.00", NthSeries.seriesSum(1));
	}
	
	@Test
	public void test5() {
		assertEquals("1.25", NthSeries.seriesSum(2));
	}

	@Test
	public void test1() {
		assertEquals("1.57", NthSeries.seriesSum(5));
	}

	@Test
	public void test2() {
		assertEquals("1.77", NthSeries.seriesSum(9));
	}

	@Test
	public void test3() {
		assertEquals("1.94", NthSeries.seriesSum(15));
	}
}
