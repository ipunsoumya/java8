package com.learnJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShellSortAgain {

	public static void main(String[] args) {
		Integer[] list = { 1, 5, 45, 6, -90, -33, -1, 8, 4, 78, 95, 76 };
		
		for (int gap = list.length/2; gap > 0; gap/=2) {
			for (int i = gap; i< list.length; i++) {
				int newElement = list[i];
				int j = i;
				while (j >= gap && list[j-gap] > newElement) {
					list[j] = list[j-gap];
					j -= gap;
				}
				list[j] = newElement;
				List<Integer> tempList = new ArrayList<>();
				Collections.addAll(tempList, list);
				System.out.println(tempList);
			}
		}
	}

}
