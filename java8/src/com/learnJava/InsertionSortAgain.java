package com.learnJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InsertionSortAgain {

	public static void main(String[] args) {
		Integer[] list = {1, 5, 45, 6,-90, -33, -1, 8, 4, 78, 95, 76};
		for (int i=0; i<list.length; i++) {
			System.out.println("i = " + i);
			for (int j=i; j>0; j--) {
				System.out.println("j = " + j);
				if (list[j] < list[j-1]) {
					int temp = list[j-1];
					list[j-1] = list[j];
					list[j] = temp;
				}
				List<Integer> tempList = new ArrayList<>();
				Collections.addAll(tempList, list);
				System.out.println(tempList);
			}
		}
		
		for (int i=0; i<list.length; i++) {
			System.out.println(list[i]);
		}
	}

}
