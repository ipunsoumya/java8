package com.learnJava.soumyajeet;

public class MultiThreading extends Thread{

	public static void main(String[] args) {
		
		
		MultiThreading mt = new MultiThreading();
		mt.start();
		
		for (int i = 0; i<20; i++) {
			System.out.println("i: " + i);
		}
	}
	 
	@Override
	public void run() {
		for (int i = 0; i<20; i++) {
			System.out.println("j: " + i);
		}
	}

}
