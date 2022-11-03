package com.learnJava;

public class HeadAndTail {

	public static void main(String[] args) {
		int[] array = {0,1,0};
		int count = 0;
		for (int i =0; i<array.length; i++) {
			if (array[i] == 1 && i!= array.length-1) {
				if (array[i+1] == 0) 
					continue;
				else 
					count++;

			}else if (array[i] == 0 && i!= array.length-1) {
				if (array[i+1] == 1) 
					continue;
				else 
					count++;

			}
		}
		System.out.println(count);
	}

}
