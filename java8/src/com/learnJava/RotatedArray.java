package com.learnJava;

public class RotatedArray {

	public int[] solution(int[] A, int K) {
		if (K > A.length)
			K = (K % A.length);
		System.out.println(K);
		int[] B = new int[A.length];
		for (int i = 0; i < A.length; i++) {
			int index;
			if (A.length - i <= K) {
				index = K - (A.length - i);
			} else {
				index = i + K;
			}
			B[index] = A[i];
		}
		return B;
	}
	
	public static void main(String[] args) {
		RotatedArray r = new RotatedArray();
		int[] solution = r.solution(new int[] {3,8,9,7,6}, 3);
		for (int i : solution) {
			System.out.print(i + " ");
		}
	}

}
