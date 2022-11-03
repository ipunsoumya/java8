package com.learnJava.soumyajeet;

public class C {

	public static void main(String[] args) throws CustomeException {
		B b = new B();
		b.add(0, 0);
		
		extracted();
	}

	private static void extracted() throws CustomeException {
		try {
			System.out.println("Inside try block");
		} catch ( NullPointerException e) {
			throw new CustomeException();
		}
		catch(Exception ex) {
			throw new CustomeException();
		}finally {
			System.out.println("Inside finally block");
		}
	}
	
}
