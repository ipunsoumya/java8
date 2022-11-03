package com.learnJava.soumyajeet;

import java.util.Optional;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class OptionalPractice {

	public static void main(String[] args) {
		Optional<Student> optionalStudent = 
				Optional.ofNullable(null);
		if (optionalStudent.isPresent()) {
			System.out.println(optionalStudent.get());
		}
		else {
			System.out.println(optionalStudent.empty());
		}
		
		Optional<String> optionalString = Optional.ofNullable("kahf");
		optionalString.ifPresent(s -> System.out.println(s));
	}

}
