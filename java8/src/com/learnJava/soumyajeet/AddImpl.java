package com.learnJava.soumyajeet;

import java.util.Arrays;
import java.util.List;

import com.learnJava.data.Student;

public class AddImpl implements Addition {
	
	public static void main(String[] args) {
		AddImpl addImpl = new AddImpl();
		System.out.println(addImpl.add(Arrays.asList(1,2,3,4,5,6)));
		
		
 	}
	
	@Override
	public int add(List<Integer> integers) {
		System.out.println("ashfcjaskj");
		return Addition.super.add(integers);
	}
}
