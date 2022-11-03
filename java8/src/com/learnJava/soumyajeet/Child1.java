package com.learnJava.soumyajeet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.learnJava.qAnda.Parent;

public class Child1 extends Parent{

	public static void main(String[] args) {
		List<String> strings = new ArrayList<>();
		strings.add("aAaA");
		strings.add("AaA");
		strings.add("aAa");
		strings.add("AAaa");
		Collections.sort(strings);
		for (String s : strings) {
			System.out.println(s + " ");
		}
		System.gc();
	}
}
