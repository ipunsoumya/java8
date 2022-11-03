package com.learnJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BubbleSortAgain {

	public static void main(String[] args) {
		Integer[] list = {1, 5, 45, 6,-90, -33, -1, 8, 4, 78, 95, 76};
		for (int i=list.length-1; i>=0; i--) {
			System.out.println("i = " + i);
			for (int j=0; j<i; j++) {
				if (list[j] > list[j+1]) {
					int temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
				}
				System.out.println("j = " + j);
				List<Integer> tempyList = new ArrayList<>();
				Collections.addAll(tempyList, list);
				System.out.println(tempyList);
			}
			
		}
		
		for (int i=0; i<list.length; i++) {
			System.out.println(list[i]);
		}
	}

}
