package com.learnJava.soumyajeet;

import java.util.List;

public interface Addition {

	default int add(List<Integer> integers) {
		return integers.stream().reduce(0, (a,b) -> a+b);
	}
}
