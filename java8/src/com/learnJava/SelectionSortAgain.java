package com.learnJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SelectionSortAgain {

	public static void main(String[] args) {
		Integer[] list = {1, 5, 45, 6,-90, -33, -1, 8, 4, 78, 95, 76};
		for (int i=list.length-1; i>=0; i--) {
			System.out.println("i = " + i);
			int largestIndex = 0;
			for (int j=1; j<=i; j++) {
				System.out.println("j = " + j);
				if (list[j] > list[largestIndex]) {
					largestIndex = j;
				}
				List<Integer> tempyList = new ArrayList<>();
				Collections.addAll(tempyList, list);
				System.out.println(tempyList);
			}
			int temp = list[i];
			list[i] = list[largestIndex];
			list[largestIndex] = temp;
			
		}
		
		for (int i=0; i<list.length; i++) {
			System.out.println(list[i]);
		}
	}

}
