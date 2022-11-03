package com.learnJava.soumyajeet;

import java.util.Scanner;

/**
 * @author Soumyajeet Patra
 *
 */
public class MapSection {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = sc.next();
		sc.close();
		char[] charArray = string.toCharArray();
		char[] charArray2 = new char[charArray.length];
		for(int i = charArray.length - 1; i >= 0; i--) {
			charArray2[charArray.length -1 - i] = charArray[i];
		}
		System.out.println(String.valueOf(charArray2));
	}

}
