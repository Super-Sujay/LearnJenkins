package com.learning.programming;

import java.util.ArrayList;
import java.util.List;

public class Rainfall {
	
	public static double mean(String town, String strng) {
		List<String> myData = new ArrayList<String>();
		String[] allCityData = strng.split("\n");
		for (String data : allCityData) {
			if(data.contains(town)) {
				String[] cityData = data.split(":");
				String[] rainData = cityData[1].split(",");
				for (String monthData : rainData) {
					myData.add(monthData.split("\\s")[1]);
				}
			}
		}
        return 0.0;
    }
	
    public static double variance(String town, String strng) {
    	
    	return 0.0;
    }
    
}
