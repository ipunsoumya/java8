package com.learnJava;

public class BinaryGap {

	public static void main(String[] args) {
		int n = 125;
		int finalCount = 0;
		String binaryString = Integer.toBinaryString(n);
		char[] charArray = binaryString.toCharArray();
		for (int i = 0; i < charArray.length && charArray[i] == '1'; i++) {
			int count = 0;
			for (int j = i+1; charArray[j] == '0'; j++) {
				count++;
			}
			finalCount = (finalCount > count) ? finalCount : count;
		}
		System.out.println(finalCount);
	}
}
