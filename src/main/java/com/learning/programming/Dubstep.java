package com.learning.programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Dubstep {

	public static String SongDecoder(String song) {
		List<String> list = new ArrayList<String>(Arrays.asList(song.split("WUB")));
		list.removeIf(String::isEmpty);
		return list.stream().collect(Collectors.joining(" "));
	}
	
}
