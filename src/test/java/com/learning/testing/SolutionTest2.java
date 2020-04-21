package com.learning.testing;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

import com.learning.programming.PickPeaks;

import java.util.*;
import java.util.stream.Collectors;


public class SolutionTest2 {
    
    private static String[] msg = {"should support finding peaks",
                                   "should support finding peaks, but should ignore peaks on the edge of the array",
                                   "should support finding peaks; if the peak is a plateau, it should only return the position of the first element of the plateau",
                                   "should support finding peaks; if the peak is a plateau, it should only return the position of the first element of the plateau",
                                   "should support finding peaks, but should ignore peaks on the edge of the array",
                                   ""};
                                   
    private static int[][] array = {{1,2,3,6,4,1,2,3,2,1},
                                    {3,2,3,6,4,1,2,3,2,1,2,3},
                                    {3,2,3,6,4,1,2,3,2,1,2,2,2,1},
                                    {2,1,3,1,2,2,2,2,1},
                                    {2,1,3,1,2,2,2,2},
    								{5, 8, 19, 5, 5, 4, 6, 19, 1, 19, 14, 16, 2, 0, -1, 8, 7, 2}};
                                    
    private static int[][] posS  = {{3,7},
                                    {3,7},
                                    {3,7,10},
                                    {2,4},
                                    {2},
                                    {2, 7, 9, 11, 15}};
                                    
    private static int[][] peaksS = {{6,3},
                                     {6,3},
                                     {6,3,2},
                                     {3,2},
                                     {3},
                                     {19, 19, 19, 16, 8}};
    
    @Test
    public void sampleTests() {
        for (int n = 0 ; n < msg.length ; n++) {
            final int[] p1 = posS[n], p2 = peaksS[n];
            Map<String,List<Integer>> expected = new HashMap<String,List<Integer>>() {{
                                          put("pos",   Arrays.stream(p1).boxed().collect(Collectors.toList()));
                                          put("peaks", Arrays.stream(p2).boxed().collect(Collectors.toList()));
                                      }},
                                      actual = PickPeaks.getPeaks(array[n]);
            assertEquals(msg[n], expected, actual);
        }
    }
}