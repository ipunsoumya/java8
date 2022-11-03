package com.learnJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeSortAgain {

	public static void main(String[] args) {
		Integer[] list = { 1, 5, 45, 6, -90, -33, -1, 8, 4, 78, 95, 76 };
		mergeSort(list, 0, list.length);
		List<Integer> list1 = new ArrayList<>();
		Collections.addAll(list1, list);
		System.out.println(list1);
	}
	
	public static void mergeSort(Integer[] list, int start, int end) {
		if (end - start < 2) {
			return;
		}
		
		int mid = (start+end)/2;
		mergeSort(list, start, mid);
		mergeSort(list, mid, end);
		merge(list, start, mid, end);
	}

	private static void merge(Integer[] list, int start, int mid, int end) {
		//first optimization
		//{32,33,34,35}
		//mid = 2
		//mid - 1 = 1
		//mid[1] <= mid[2] (true)
		//both left and right arrays are already sorted
		if (list[mid-1] <= list[mid]) {
			return;
		}
		
		int i = start;
		int j = mid;
		int tempIndex = 0;
		Integer[] temp = new Integer[end -start];
		while (i < mid && j < end) {
			temp[tempIndex++] = list[i] <= list[j] ? list[i++] : list[j++];
		}
		
		//Second Optimization
		System.arraycopy(list, i, list, start + tempIndex, mid - i);
		System.arraycopy(temp, 0, list, start, tempIndex);
		
	}

}
