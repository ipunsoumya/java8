package com.learnJava;

import java.util.HashSet;

public class MissingInteger {

	public static void main(String[] args) {
		Integer[] list = {1,3,6,4,1,2};
		HashSet<Integer> set = new HashSet<>();
		for (int i = 1; i<=list.length+1; i++) {
			set.add(i);
		}
		
		for (int i : list) {
			set.remove(i);
		}
		
		System.out.println(set.iterator().next());
	}

}
