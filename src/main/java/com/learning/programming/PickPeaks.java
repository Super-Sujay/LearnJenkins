package com.learning.programming;

import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PickPeaks {

	public static Map<String, List<Integer>> getPeaks1(int[] arr) {
		int peak = -1, pos = -1;
		List<Integer> peakNumbers = new ArrayList<Integer>();
		List<Integer> peakNumbersPosition = new ArrayList<Integer>();
		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
				peakNumbers.add(arr[i]);
				peakNumbersPosition.add(i);
			} else if (arr[i] > arr[i - 1] && arr[i] == arr[i + 1]) {
				peak = arr[i];
				pos = i;
			}
			if (arr[i] == arr[i - 1] && arr[i] > arr[i + 1]) {
				peakNumbers.add(peak);
				peakNumbersPosition.add(pos);
			}
		}
		peakNumbers.remove(new Integer(-1));
		peakNumbersPosition.remove(new Integer(-1));
		return new HashMap<String, List<Integer>>() {
			{
				put("pos", peakNumbersPosition);
				put("peaks", peakNumbers);
			}
		};
	}
	
public static Map<String,List<Integer>> getPeaks(int[] arr) {
        
        Map<String,List<Integer>> ans = new HashMap<String,List<Integer>>() {{
            put("pos",   new ArrayList<Integer>() );
            put("peaks", new ArrayList<Integer>() );
        }};
        int posMax = 0;
        boolean matchAsc = false;
        
        for (int i = 1 ; i < arr.length ; i++) {
            if (arr[i-1] < arr[i]) {
                matchAsc = true;
                posMax = i;
            }
            if (matchAsc && arr[i-1] > arr[i]) {
                matchAsc = false;
                ans.get("pos").add(posMax);
                ans.get("peaks").add(arr[posMax]);
            }
        }
        return ans;
    }
}