package com.learnJava.soumyajeet;

import java.util.TreeSet;

public class MainC extends MyBase{

	@Override
	void amethod() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		String s = "asdas";
		TreeSet<Integer> sets = new TreeSet<Integer>();
		sets.add(20);
		sets.add(50);
		sets.add(10);sets.add(60);
		
		System.out.println(sets.headSet(50,  true));
	}

}
