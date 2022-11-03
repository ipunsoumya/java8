package com.learnJava;

public class MainTable {

	static int sum2(int a, int b) {
		int sum = a + b;
		return sum;
	}

	static void sum1(int a, int b) {
		int sum = a + b;
	}
	
	
	public static void main(String[] args) {
		int result = sum2(1, 10);
		if (result > 100) {
			sum2(1, 10);
		}
		else {
			sum1(1, 10);
		}
		
	
	}
	
	
}
