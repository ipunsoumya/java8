package com.learnJava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();
		map.put("vats", Arrays.asList(12,13,14));
		map.put("soumya", Arrays.asList(15, 16, 17));
		
		double average = map.get("vats").stream().mapToInt(Integer::intValue).summaryStatistics().getAverage();
	}

}
