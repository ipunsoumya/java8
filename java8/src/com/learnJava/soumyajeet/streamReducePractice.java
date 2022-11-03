package com.learnJava.soumyajeet;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class streamReducePractice {

	public static void main(String[] args) {
		System.out.println(multiply(Arrays.asList(1,2,3,45,66,54)));
		System.out.println(multiplyOptional(Arrays.asList(1,2,3,45,66,54)));
		System.out.println(highestGPAStudent(StudentDataBase.getAllStudents()));
		
	}
	
	public static int multiply(List<Integer> integers) {
		return integers.stream().reduce(1, ((a,b) ->a*b));
	}
	
	public static int multiplyOptional(List<Integer> integers) {
		return integers.stream().reduce(((a,b) ->a*b)).get();
	}
	
	public static Optional<Student> highestGPAStudent(List<Student> students) {
		return students.stream().reduce((a,b) -> {
			if (a.getGpa()>b.getGpa()) {
				return a;
			}else {
				return b;
			}
		});
	}
}
