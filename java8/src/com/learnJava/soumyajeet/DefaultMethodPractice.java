package com.learnJava.soumyajeet;

import java.util.Comparator;
import java.util.List;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class DefaultMethodPractice {

	public static void main(String[] args) {
		Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
		Comparator<Student> gpaComparator = Comparator.comparingInt(Student::getGradeLevel);
		Comparator<Student> nullComparator = Comparator.nullsLast(nameComparator);
		
		List<Student> allStudents = StudentDataBase.getAllStudents();
		allStudents.sort(nullComparator);
		System.out.println(allStudents);
		
	}

}
