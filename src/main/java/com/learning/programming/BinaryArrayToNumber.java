package com.learning.programming;

import java.util.List;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt1(List<Integer> binary) {
    	int power = binary.size(), result = 0;
    	for (Integer integer : binary)
    		result += integer * Math.pow(2, --power);
    	return result;
    }
    
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
    	return binary.stream().reduce((x, y) -> x * 2 + y).get();
    }
    
}