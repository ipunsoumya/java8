package com.learnJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InsertionSortAgain2 {

	public static void main(String[] args) {
		Integer[] list = { 1, 5, 45, 6, -90, -33, -1, 8, 4, 78, 95, 76 };
		for (int i = 1; i < list.length; i++) {
			System.out.println("i = " + i);
			int newElement = list[i];
			int j;
			for (j = i; j > 0 && list[j - 1] > newElement; j--) {
				System.out.println("j = " + j);
				list[j] = list[j - 1];
				
			}
			list[j] = newElement;
			List<Integer> tempList = new ArrayList<>();
			Collections.addAll(tempList, list);
			System.out.println(tempList);
		}

		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}

}
