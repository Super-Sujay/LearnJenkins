package com.learning.testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.learning.programming.Dubstep;

public class SongTests {
	@Test
    public void Test1() {
      new Dubstep();
	assertEquals("ABC", Dubstep.SongDecoder("WUBWUBABCWUB"));
    }
    @Test
    public void Test2()
    {
       new Dubstep();
	assertEquals("R L", Dubstep.SongDecoder("RWUBWUBWUBLWUB"));
    }
}
