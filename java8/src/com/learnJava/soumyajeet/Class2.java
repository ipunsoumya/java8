package com.learnJava.soumyajeet;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Class2 extends Class1{
	
	
	public static void main(String[] args) {
		iteratorExample();
	}
	
	@Override
	public void print() {
		System.out.println("Class 2");
	}
	
	public void print(String s) {
		System.out.println(s);
	}
	
	public static void iteratorExample() {
		List<String> strings = Arrays.asList("did", "adughfu", "kdhfkd");
		Iterator<String> iterator = strings.iterator();
		while(iterator.hasNext()) {
			String next = iterator.next();
			strings.remove(next);
		}
	}
}
